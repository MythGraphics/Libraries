/*
 *
 */

package util.update;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 4.0.0
 *
 */

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

public class Updater {

    public final static String DOWNLOADED_FILE_NAME = "update.jar";

    public final URI updateUri;
    public final URI versionUri;
    public final int currentVersion;

    public Updater(int currentVersion, URI versionUri, URI updateUri) {
        this.currentVersion = currentVersion;
        this.versionUri     = versionUri;
        this.updateUri      = updateUri;
    }

    public Updater(int currentVersion, String versionUrl, String updateUrl) {
        this( currentVersion, URI.create( versionUrl ), URI.create( updateUrl ));
    }
/*
    private void check() {
        String repoUrl = "https://api.github.com/repos/DEIN_NAME/DEIN_REPO/releases/latest";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri( URI.create( repoUrl ))
            .header("Accept", "application/vnd.github.v3+json")
            .timeout( Duration.ofSeconds( 10 ))
            .build();
        client.sendAsync( request, HttpResponse.BodyHandlers.ofString() )
            .thenApply(HttpResponse::body)
            .thenAccept(json -> {
                // hier käme ein JSON-Parser (wie Jackson oder Gson), um zu prüfen, ob tag_name != currentVersion ist
                System.out.println("Antwort von GitHub: " + json);
            });
    }
 */
    public int getOnlineVersion() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(versionUri)
                .header("User-Agent", "Java-Updater")
                .timeout( Duration.ofSeconds( 10 ))
                .build();
            HttpResponse<String> response = client.send( request, HttpResponse.BodyHandlers.ofString() );
            String firstLine = response.body()
                .lines()
                .findFirst()
                .orElse("-1")
                .trim();
            return Integer.parseInt(firstLine);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void download() throws IOException {
        try ( InputStream in = updateUri.toURL().openStream() ) {
            Files.copy( in, Paths.get( DOWNLOADED_FILE_NAME ), StandardCopyOption.REPLACE_EXISTING );
        }
    }

    public boolean isAvailable() {
        return getOnlineVersion() > currentVersion;
    }

    public String install() throws IOException {
        String jarName = Paths.get(updateUri).getFileName().toString();
        // Windows Befehl: Wartet 3 Sek, löscht alte Datei, benennt neue um, startet neu
        String command = "cmd /c timeout 3 && del " + jarName + " && rename " + DOWNLOADED_FILE_NAME + " " + jarName;
        Runtime.getRuntime().exec(command);
        return jarName;
    }

    public void installRestart() throws IOException {
        restart( install() );
    }

    public void restart(String jarName) throws IOException {
        String command = "cmd /c java -jar " + jarName;
        Runtime.getRuntime().exec(command);
        System.exit(0);
    }

    public static String getJarExecutionDirectory() {
        String jarFile, jarDirectory;
        int cutFileSeperator, cutSemicolon;
        jarFile = System.getProperty("java.class.path");

        // Cut seperators
        cutFileSeperator = jarFile.lastIndexOf( System.getProperty( "file.separator" ));
        jarDirectory = jarFile.substring( 0, cutFileSeperator );

        // Cut semicolons
        cutSemicolon = jarDirectory.lastIndexOf(';');
        jarDirectory = jarDirectory.substring( cutSemicolon+1, jarDirectory.length() );

        return jarDirectory+System.getProperty("file.separator");
    }

}
