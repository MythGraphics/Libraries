/*
 * ProgressFrame.java
 *
 * Created on 21. Januar 2008, 22:15
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package progress;

/*
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.1.0
 *
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ProgressFrame extends JFrame {

    public final static int SINGLE = 1;
    public final static int MULTI  = 2;

    private boolean canceled = false;
    private JButton Button1;
    private JProgressBar ProgressBar1;
    private JProgressBar ProgressBar2;

    public ProgressFrame(int frametype) {
        init();
        if ( frametype == 1 ) {
            initFrameTypeSingle();
        } else if ( frametype == 2 ) {
            initFrameTypeMulti();
        }
    }

    private void init() {
        setProgressBar1( new JProgressBar() );
        Button1 = new JButton();
        setDefaultCloseOperation( WindowConstants.DO_NOTHING_ON_CLOSE );
        setTitle( "\u00dcbertragung" );
        setResizable( false );
        getProgressBar1().setFocusable( false );
        getProgressBar1().setStringPainted( true );
        Button1.setText( "Abbrechen" );
        Button1.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent evt ) {
                Button1ActionPerformed( evt );
            }
        });
    }

    private void initFrameTypeSingle() {
        GroupLayout layout = new GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING )
            .addGroup( layout.createSequentialGroup()
                .addContainerGap()
                .addGroup( layout.createParallelGroup( GroupLayout.Alignment.LEADING )
                    .addComponent( getProgressBar1(), GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE )
                    .addComponent( Button1, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE ))
                .addContainerGap()
        ));
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING )
            .addGroup( layout.createSequentialGroup()
                .addContainerGap()
                .addComponent( getProgressBar1(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE )
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( Button1 )
                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
        ));
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(( screenSize.width - 400 ) / 2, ( screenSize.height - 111 ) / 2, 400, 111 );
    }

    private void initFrameTypeMulti() {
        setProgressBar2( new JProgressBar() );
        getProgressBar2().setFocusable( false );
        getProgressBar2().setStringPainted( true );
        GroupLayout layout = new GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING )
            .addGroup( layout.createSequentialGroup()
                .addContainerGap()
                .addGroup( layout.createParallelGroup( GroupLayout.Alignment.LEADING )
                    .addGroup( GroupLayout.Alignment.TRAILING, layout.createParallelGroup( GroupLayout.Alignment.TRAILING )
                        .addComponent( getProgressBar2(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE )
                        .addComponent( getProgressBar1(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE ))
                    .addComponent( Button1, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE ))
                .addContainerGap()
        ));
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING )
            .addGroup( layout.createSequentialGroup()
                .addContainerGap()
                .addComponent( getProgressBar1(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE )
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( getProgressBar2(), GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE )
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED )
                .addComponent( Button1 )
                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
        ));
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(( screenSize.width - 400 ) / 2, ( screenSize.height - 143 ) / 2, 400, 143 );
    }

    private void Button1ActionPerformed(ActionEvent evt) {
        cancel();
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void cancel() {
        this.canceled = true;
    }

    public JProgressBar getProgressBar1() {
        return ProgressBar1;
    }

    public void setProgressBar1(JProgressBar ProgressBar1) {
        this.ProgressBar1 = ProgressBar1;
    }

    public JProgressBar getProgressBar2() {
        return ProgressBar2;
    }

    public void setProgressBar2(JProgressBar ProgressBar2) {
        this.ProgressBar2 = ProgressBar2;
    }

}
