/*
 *
 */

package gui;

/**
 *
 * @author Martin Pröhl alias MythGraphics
 * @version 1.0.0
 *
 */

import java.beans.*;

public class JAdvTextFieldBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( gui.JAdvTextField.class , null ); // NOI18N
        beanDescriptor.setPreferred ( true );//GEN-HEADEREND:BeanDescriptor

        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor

    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_action = 1;
    private static final int PROPERTY_actionCommand = 2;
    private static final int PROPERTY_actionListeners = 3;
    private static final int PROPERTY_actionMap = 4;
    private static final int PROPERTY_actions = 5;
    private static final int PROPERTY_alignmentX = 6;
    private static final int PROPERTY_alignmentY = 7;
    private static final int PROPERTY_ancestorListeners = 8;
    private static final int PROPERTY_autoscrolls = 9;
    private static final int PROPERTY_background = 10;
    private static final int PROPERTY_backgroundSet = 11;
    private static final int PROPERTY_baselineResizeBehavior = 12;
    private static final int PROPERTY_border = 13;
    private static final int PROPERTY_bounds = 14;
    private static final int PROPERTY_caret = 15;
    private static final int PROPERTY_caretColor = 16;
    private static final int PROPERTY_caretListeners = 17;
    private static final int PROPERTY_caretPosition = 18;
    private static final int PROPERTY_colorModel = 19;
    private static final int PROPERTY_columns = 20;
    private static final int PROPERTY_component = 21;
    private static final int PROPERTY_componentCount = 22;
    private static final int PROPERTY_componentListeners = 23;
    private static final int PROPERTY_componentOrientation = 24;
    private static final int PROPERTY_componentPopupMenu = 25;
    private static final int PROPERTY_components = 26;
    private static final int PROPERTY_containerListeners = 27;
    private static final int PROPERTY_cursor = 28;
    private static final int PROPERTY_cursorSet = 29;
    private static final int PROPERTY_debugGraphicsOptions = 30;
    private static final int PROPERTY_disabledTextColor = 31;
    private static final int PROPERTY_displayable = 32;
    private static final int PROPERTY_document = 33;
    private static final int PROPERTY_doubleBuffered = 34;
    private static final int PROPERTY_dragEnabled = 35;
    private static final int PROPERTY_dropLocation = 36;
    private static final int PROPERTY_dropMode = 37;
    private static final int PROPERTY_dropTarget = 38;
    private static final int PROPERTY_editable = 39;
    private static final int PROPERTY_enabled = 40;
    private static final int PROPERTY_focusable = 41;
    private static final int PROPERTY_focusAccelerator = 42;
    private static final int PROPERTY_focusCycleRoot = 43;
    private static final int PROPERTY_focusCycleRootAncestor = 44;
    private static final int PROPERTY_focusListeners = 45;
    private static final int PROPERTY_focusOwner = 46;
    private static final int PROPERTY_focusTraversable = 47;
    private static final int PROPERTY_focusTraversalKeys = 48;
    private static final int PROPERTY_focusTraversalKeysEnabled = 49;
    private static final int PROPERTY_focusTraversalPolicy = 50;
    private static final int PROPERTY_focusTraversalPolicyProvider = 51;
    private static final int PROPERTY_focusTraversalPolicySet = 52;
    private static final int PROPERTY_font = 53;
    private static final int PROPERTY_fontSet = 54;
    private static final int PROPERTY_foreground = 55;
    private static final int PROPERTY_foregroundSet = 56;
    private static final int PROPERTY_graphics = 57;
    private static final int PROPERTY_graphicsConfiguration = 58;
    private static final int PROPERTY_height = 59;
    private static final int PROPERTY_hierarchyBoundsListeners = 60;
    private static final int PROPERTY_hierarchyListeners = 61;
    private static final int PROPERTY_highlighter = 62;
    private static final int PROPERTY_horizontalAlignment = 63;
    private static final int PROPERTY_horizontalVisibility = 64;
    private static final int PROPERTY_ignoreRepaint = 65;
    private static final int PROPERTY_inheritsPopupMenu = 66;
    private static final int PROPERTY_inputContext = 67;
    private static final int PROPERTY_inputMap = 68;
    private static final int PROPERTY_inputMethodListeners = 69;
    private static final int PROPERTY_inputMethodRequests = 70;
    private static final int PROPERTY_inputVerifier = 71;
    private static final int PROPERTY_insets = 72;
    private static final int PROPERTY_keyListeners = 73;
    private static final int PROPERTY_keymap = 74;
    private static final int PROPERTY_layout = 75;
    private static final int PROPERTY_lightweight = 76;
    private static final int PROPERTY_locale = 77;
    private static final int PROPERTY_location = 78;
    private static final int PROPERTY_locationOnScreen = 79;
    private static final int PROPERTY_managingFocus = 80;
    private static final int PROPERTY_margin = 81;
    private static final int PROPERTY_maximumSize = 82;
    private static final int PROPERTY_maximumSizeSet = 83;
    private static final int PROPERTY_minimumSize = 84;
    private static final int PROPERTY_minimumSizeSet = 85;
    private static final int PROPERTY_mouseListeners = 86;
    private static final int PROPERTY_mouseMotionListeners = 87;
    private static final int PROPERTY_mousePosition = 88;
    private static final int PROPERTY_mouseWheelListeners = 89;
    private static final int PROPERTY_name = 90;
    private static final int PROPERTY_navigationFilter = 91;
    private static final int PROPERTY_nextFocusableComponent = 92;
    private static final int PROPERTY_opaque = 93;
    private static final int PROPERTY_optimizedDrawingEnabled = 94;
    private static final int PROPERTY_paintingForPrint = 95;
    private static final int PROPERTY_paintingTile = 96;
    private static final int PROPERTY_parent = 97;
    private static final int PROPERTY_peer = 98;
    private static final int PROPERTY_preferredScrollableViewportSize = 99;
    private static final int PROPERTY_preferredSize = 100;
    private static final int PROPERTY_preferredSizeSet = 101;
    private static final int PROPERTY_propertyChangeListeners = 102;
    private static final int PROPERTY_registeredKeyStrokes = 103;
    private static final int PROPERTY_requestFocusEnabled = 104;
    private static final int PROPERTY_rootPane = 105;
    private static final int PROPERTY_scrollableTracksViewportHeight = 106;
    private static final int PROPERTY_scrollableTracksViewportWidth = 107;
    private static final int PROPERTY_scrollOffset = 108;
    private static final int PROPERTY_selectedText = 109;
    private static final int PROPERTY_selectedTextColor = 110;
    private static final int PROPERTY_selectionColor = 111;
    private static final int PROPERTY_selectionEnd = 112;
    private static final int PROPERTY_selectionStart = 113;
    private static final int PROPERTY_showing = 114;
    private static final int PROPERTY_size = 115;
    private static final int PROPERTY_text = 116;
    private static final int PROPERTY_toolkit = 117;
    private static final int PROPERTY_toolTipText = 118;
    private static final int PROPERTY_topLevelAncestor = 119;
    private static final int PROPERTY_transferHandler = 120;
    private static final int PROPERTY_treeLock = 121;
    private static final int PROPERTY_UI = 122;
    private static final int PROPERTY_UIClassID = 123;
    private static final int PROPERTY_valid = 124;
    private static final int PROPERTY_validateRoot = 125;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 126;
    private static final int PROPERTY_vetoableChangeListeners = 127;
    private static final int PROPERTY_visible = 128;
    private static final int PROPERTY_visibleRect = 129;
    private static final int PROPERTY_width = 130;
    private static final int PROPERTY_x = 131;
    private static final int PROPERTY_y = 132;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[133];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", gui.JAdvTextField.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_action] = new PropertyDescriptor ( "action", gui.JAdvTextField.class, "getAction", "setAction" ); // NOI18N
            properties[PROPERTY_actionCommand] = new PropertyDescriptor ( "actionCommand", gui.JAdvTextField.class, null, "setActionCommand" ); // NOI18N
            properties[PROPERTY_actionListeners] = new PropertyDescriptor ( "actionListeners", gui.JAdvTextField.class, "getActionListeners", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", gui.JAdvTextField.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_actions] = new PropertyDescriptor ( "actions", gui.JAdvTextField.class, "getActions", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", gui.JAdvTextField.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", gui.JAdvTextField.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", gui.JAdvTextField.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", gui.JAdvTextField.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", gui.JAdvTextField.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", gui.JAdvTextField.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", gui.JAdvTextField.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", gui.JAdvTextField.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", gui.JAdvTextField.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_caret] = new PropertyDescriptor ( "caret", gui.JAdvTextField.class, "getCaret", "setCaret" ); // NOI18N
            properties[PROPERTY_caretColor] = new PropertyDescriptor ( "caretColor", gui.JAdvTextField.class, "getCaretColor", "setCaretColor" ); // NOI18N
            properties[PROPERTY_caretListeners] = new PropertyDescriptor ( "caretListeners", gui.JAdvTextField.class, "getCaretListeners", null ); // NOI18N
            properties[PROPERTY_caretPosition] = new PropertyDescriptor ( "caretPosition", gui.JAdvTextField.class, "getCaretPosition", "setCaretPosition" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", gui.JAdvTextField.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_columns] = new PropertyDescriptor ( "columns", gui.JAdvTextField.class, "getColumns", "setColumns" ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", gui.JAdvTextField.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", gui.JAdvTextField.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", gui.JAdvTextField.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", gui.JAdvTextField.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", gui.JAdvTextField.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", gui.JAdvTextField.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", gui.JAdvTextField.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", gui.JAdvTextField.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", gui.JAdvTextField.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", gui.JAdvTextField.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_disabledTextColor] = new PropertyDescriptor ( "disabledTextColor", gui.JAdvTextField.class, "getDisabledTextColor", "setDisabledTextColor" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", gui.JAdvTextField.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_document] = new PropertyDescriptor ( "document", gui.JAdvTextField.class, "getDocument", "setDocument" ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", gui.JAdvTextField.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dragEnabled] = new PropertyDescriptor ( "dragEnabled", gui.JAdvTextField.class, "getDragEnabled", "setDragEnabled" ); // NOI18N
            properties[PROPERTY_dropLocation] = new PropertyDescriptor ( "dropLocation", gui.JAdvTextField.class, "getDropLocation", null ); // NOI18N
            properties[PROPERTY_dropMode] = new PropertyDescriptor ( "dropMode", gui.JAdvTextField.class, "getDropMode", "setDropMode" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", gui.JAdvTextField.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_editable] = new PropertyDescriptor ( "editable", gui.JAdvTextField.class, "isEditable", "setEditable" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", gui.JAdvTextField.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", gui.JAdvTextField.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusAccelerator] = new PropertyDescriptor ( "focusAccelerator", gui.JAdvTextField.class, "getFocusAccelerator", "setFocusAccelerator" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", gui.JAdvTextField.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", gui.JAdvTextField.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", gui.JAdvTextField.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", gui.JAdvTextField.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", gui.JAdvTextField.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", gui.JAdvTextField.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", gui.JAdvTextField.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", gui.JAdvTextField.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", gui.JAdvTextField.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", gui.JAdvTextField.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", gui.JAdvTextField.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", gui.JAdvTextField.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", gui.JAdvTextField.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", gui.JAdvTextField.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", gui.JAdvTextField.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", gui.JAdvTextField.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", gui.JAdvTextField.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", gui.JAdvTextField.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", gui.JAdvTextField.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_highlighter] = new PropertyDescriptor ( "highlighter", gui.JAdvTextField.class, "getHighlighter", "setHighlighter" ); // NOI18N
            properties[PROPERTY_horizontalAlignment] = new PropertyDescriptor ( "horizontalAlignment", gui.JAdvTextField.class, "getHorizontalAlignment", "setHorizontalAlignment" ); // NOI18N
            properties[PROPERTY_horizontalVisibility] = new PropertyDescriptor ( "horizontalVisibility", gui.JAdvTextField.class, "getHorizontalVisibility", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", gui.JAdvTextField.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", gui.JAdvTextField.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", gui.JAdvTextField.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", gui.JAdvTextField.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", gui.JAdvTextField.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", gui.JAdvTextField.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", gui.JAdvTextField.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", gui.JAdvTextField.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", gui.JAdvTextField.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_keymap] = new PropertyDescriptor ( "keymap", gui.JAdvTextField.class, "getKeymap", "setKeymap" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", gui.JAdvTextField.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", gui.JAdvTextField.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", gui.JAdvTextField.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", gui.JAdvTextField.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", gui.JAdvTextField.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", gui.JAdvTextField.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_margin] = new PropertyDescriptor ( "margin", gui.JAdvTextField.class, "getMargin", "setMargin" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", gui.JAdvTextField.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", gui.JAdvTextField.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", gui.JAdvTextField.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", gui.JAdvTextField.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", gui.JAdvTextField.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", gui.JAdvTextField.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", gui.JAdvTextField.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", gui.JAdvTextField.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", gui.JAdvTextField.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_navigationFilter] = new PropertyDescriptor ( "navigationFilter", gui.JAdvTextField.class, "getNavigationFilter", "setNavigationFilter" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", gui.JAdvTextField.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", gui.JAdvTextField.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", gui.JAdvTextField.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", gui.JAdvTextField.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", gui.JAdvTextField.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", gui.JAdvTextField.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", gui.JAdvTextField.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredScrollableViewportSize] = new PropertyDescriptor ( "preferredScrollableViewportSize", gui.JAdvTextField.class, "getPreferredScrollableViewportSize", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", gui.JAdvTextField.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", gui.JAdvTextField.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", gui.JAdvTextField.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", gui.JAdvTextField.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", gui.JAdvTextField.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", gui.JAdvTextField.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportHeight] = new PropertyDescriptor ( "scrollableTracksViewportHeight", gui.JAdvTextField.class, "getScrollableTracksViewportHeight", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportWidth] = new PropertyDescriptor ( "scrollableTracksViewportWidth", gui.JAdvTextField.class, "getScrollableTracksViewportWidth", null ); // NOI18N
            properties[PROPERTY_scrollOffset] = new PropertyDescriptor ( "scrollOffset", gui.JAdvTextField.class, "getScrollOffset", "setScrollOffset" ); // NOI18N
            properties[PROPERTY_selectedText] = new PropertyDescriptor ( "selectedText", gui.JAdvTextField.class, "getSelectedText", null ); // NOI18N
            properties[PROPERTY_selectedTextColor] = new PropertyDescriptor ( "selectedTextColor", gui.JAdvTextField.class, "getSelectedTextColor", "setSelectedTextColor" ); // NOI18N
            properties[PROPERTY_selectionColor] = new PropertyDescriptor ( "selectionColor", gui.JAdvTextField.class, "getSelectionColor", "setSelectionColor" ); // NOI18N
            properties[PROPERTY_selectionEnd] = new PropertyDescriptor ( "selectionEnd", gui.JAdvTextField.class, "getSelectionEnd", "setSelectionEnd" ); // NOI18N
            properties[PROPERTY_selectionStart] = new PropertyDescriptor ( "selectionStart", gui.JAdvTextField.class, "getSelectionStart", "setSelectionStart" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", gui.JAdvTextField.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", gui.JAdvTextField.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_text] = new PropertyDescriptor ( "text", gui.JAdvTextField.class, "getText", "setText" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", gui.JAdvTextField.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", gui.JAdvTextField.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", gui.JAdvTextField.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", gui.JAdvTextField.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", gui.JAdvTextField.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", gui.JAdvTextField.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", gui.JAdvTextField.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", gui.JAdvTextField.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", gui.JAdvTextField.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", gui.JAdvTextField.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", gui.JAdvTextField.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", gui.JAdvTextField.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", gui.JAdvTextField.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", gui.JAdvTextField.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", gui.JAdvTextField.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", gui.JAdvTextField.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_actionListener = 0;
    private static final int EVENT_ancestorListener = 1;
    private static final int EVENT_caretListener = 2;
    private static final int EVENT_componentListener = 3;
    private static final int EVENT_containerListener = 4;
    private static final int EVENT_focusListener = 5;
    private static final int EVENT_hierarchyBoundsListener = 6;
    private static final int EVENT_hierarchyListener = 7;
    private static final int EVENT_inputMethodListener = 8;
    private static final int EVENT_keyListener = 9;
    private static final int EVENT_mouseListener = 10;
    private static final int EVENT_mouseMotionListener = 11;
    private static final int EVENT_mouseWheelListener = 12;
    private static final int EVENT_propertyChangeListener = 13;
    private static final int EVENT_vetoableChangeListener = 14;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[15];
    
        try {
            eventSets[EVENT_actionListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "actionListener", java.awt.event.ActionListener.class, new String[] {"actionPerformed"}, "addActionListener", "removeActionListener" ); // NOI18N
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_caretListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "caretListener", javax.swing.event.CaretListener.class, new String[] {"caretUpdate"}, "addCaretListener", "removeCaretListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( gui.JAdvTextField.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events

        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addKeymap7 = 7;
    private static final int METHOD_addNotify8 = 8;
    private static final int METHOD_addPropertyChangeListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_areFocusTraversalKeysSet11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_computeVisibleRect15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_copy18 = 18;
    private static final int METHOD_countComponents19 = 19;
    private static final int METHOD_createImage20 = 20;
    private static final int METHOD_createImage21 = 21;
    private static final int METHOD_createToolTip22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_createVolatileImage24 = 24;
    private static final int METHOD_cut25 = 25;
    private static final int METHOD_deliverEvent26 = 26;
    private static final int METHOD_disable27 = 27;
    private static final int METHOD_dispatchEvent28 = 28;
    private static final int METHOD_doLayout29 = 29;
    private static final int METHOD_enable30 = 30;
    private static final int METHOD_enable31 = 31;
    private static final int METHOD_enableInputMethods32 = 32;
    private static final int METHOD_findComponentAt33 = 33;
    private static final int METHOD_findComponentAt34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_getActionForKeyStroke43 = 43;
    private static final int METHOD_getBaseline44 = 44;
    private static final int METHOD_getBounds45 = 45;
    private static final int METHOD_getClientProperty46 = 46;
    private static final int METHOD_getComponentAt47 = 47;
    private static final int METHOD_getComponentAt48 = 48;
    private static final int METHOD_getComponentZOrder49 = 49;
    private static final int METHOD_getConditionForKeyStroke50 = 50;
    private static final int METHOD_getDefaultLocale51 = 51;
    private static final int METHOD_getFocusTraversalKeys52 = 52;
    private static final int METHOD_getFontMetrics53 = 53;
    private static final int METHOD_getInsets54 = 54;
    private static final int METHOD_getKeymap55 = 55;
    private static final int METHOD_getListeners56 = 56;
    private static final int METHOD_getLocation57 = 57;
    private static final int METHOD_getMousePosition58 = 58;
    private static final int METHOD_getPopupLocation59 = 59;
    private static final int METHOD_getPrintable60 = 60;
    private static final int METHOD_getPropertyChangeListeners61 = 61;
    private static final int METHOD_getScrollableBlockIncrement62 = 62;
    private static final int METHOD_getScrollableUnitIncrement63 = 63;
    private static final int METHOD_getSize64 = 64;
    private static final int METHOD_getText65 = 65;
    private static final int METHOD_getToolTipLocation66 = 66;
    private static final int METHOD_getToolTipText67 = 67;
    private static final int METHOD_gotFocus68 = 68;
    private static final int METHOD_grabFocus69 = 69;
    private static final int METHOD_handleEvent70 = 70;
    private static final int METHOD_hasFocus71 = 71;
    private static final int METHOD_imageUpdate72 = 72;
    private static final int METHOD_insets73 = 73;
    private static final int METHOD_inside74 = 74;
    private static final int METHOD_invalidate75 = 75;
    private static final int METHOD_isAncestorOf76 = 76;
    private static final int METHOD_isFocusCycleRoot77 = 77;
    private static final int METHOD_isLightweightComponent78 = 78;
    private static final int METHOD_keyDown79 = 79;
    private static final int METHOD_keyUp80 = 80;
    private static final int METHOD_layout81 = 81;
    private static final int METHOD_list82 = 82;
    private static final int METHOD_list83 = 83;
    private static final int METHOD_list84 = 84;
    private static final int METHOD_list85 = 85;
    private static final int METHOD_list86 = 86;
    private static final int METHOD_loadKeymap87 = 87;
    private static final int METHOD_locate88 = 88;
    private static final int METHOD_location89 = 89;
    private static final int METHOD_lostFocus90 = 90;
    private static final int METHOD_minimumSize91 = 91;
    private static final int METHOD_modelToView92 = 92;
    private static final int METHOD_mouseDown93 = 93;
    private static final int METHOD_mouseDrag94 = 94;
    private static final int METHOD_mouseEnter95 = 95;
    private static final int METHOD_mouseExit96 = 96;
    private static final int METHOD_mouseMove97 = 97;
    private static final int METHOD_mouseUp98 = 98;
    private static final int METHOD_move99 = 99;
    private static final int METHOD_moveCaretPosition100 = 100;
    private static final int METHOD_nextFocus101 = 101;
    private static final int METHOD_paint102 = 102;
    private static final int METHOD_paintAll103 = 103;
    private static final int METHOD_paintComponents104 = 104;
    private static final int METHOD_paintImmediately105 = 105;
    private static final int METHOD_paintImmediately106 = 106;
    private static final int METHOD_paste107 = 107;
    private static final int METHOD_postActionEvent108 = 108;
    private static final int METHOD_postEvent109 = 109;
    private static final int METHOD_preferredSize110 = 110;
    private static final int METHOD_prepareImage111 = 111;
    private static final int METHOD_prepareImage112 = 112;
    private static final int METHOD_print113 = 113;
    private static final int METHOD_print114 = 114;
    private static final int METHOD_print115 = 115;
    private static final int METHOD_print116 = 116;
    private static final int METHOD_printAll117 = 117;
    private static final int METHOD_printComponents118 = 118;
    private static final int METHOD_putClientProperty119 = 119;
    private static final int METHOD_read120 = 120;
    private static final int METHOD_registerKeyboardAction121 = 121;
    private static final int METHOD_registerKeyboardAction122 = 122;
    private static final int METHOD_remove123 = 123;
    private static final int METHOD_remove124 = 124;
    private static final int METHOD_remove125 = 125;
    private static final int METHOD_removeAll126 = 126;
    private static final int METHOD_removeKeymap127 = 127;
    private static final int METHOD_removeNotify128 = 128;
    private static final int METHOD_removePropertyChangeListener129 = 129;
    private static final int METHOD_repaint130 = 130;
    private static final int METHOD_repaint131 = 131;
    private static final int METHOD_repaint132 = 132;
    private static final int METHOD_repaint133 = 133;
    private static final int METHOD_repaint134 = 134;
    private static final int METHOD_replaceSelection135 = 135;
    private static final int METHOD_requestDefaultFocus136 = 136;
    private static final int METHOD_requestFocus137 = 137;
    private static final int METHOD_requestFocus138 = 138;
    private static final int METHOD_requestFocusInWindow139 = 139;
    private static final int METHOD_resetKeyboardActions140 = 140;
    private static final int METHOD_reshape141 = 141;
    private static final int METHOD_resize142 = 142;
    private static final int METHOD_resize143 = 143;
    private static final int METHOD_revalidate144 = 144;
    private static final int METHOD_scrollRectToVisible145 = 145;
    private static final int METHOD_select146 = 146;
    private static final int METHOD_selectAll147 = 147;
    private static final int METHOD_setBounds148 = 148;
    private static final int METHOD_setComponentZOrder149 = 149;
    private static final int METHOD_setDefaultLocale150 = 150;
    private static final int METHOD_show151 = 151;
    private static final int METHOD_show152 = 152;
    private static final int METHOD_show153 = 153;
    private static final int METHOD_show154 = 154;
    private static final int METHOD_showError155 = 155;
    private static final int METHOD_showMessage156 = 156;
    private static final int METHOD_showProblem157 = 157;
    private static final int METHOD_showSuccess158 = 158;
    private static final int METHOD_showWarning159 = 159;
    private static final int METHOD_size160 = 160;
    private static final int METHOD_toString161 = 161;
    private static final int METHOD_transferFocus162 = 162;
    private static final int METHOD_transferFocusBackward163 = 163;
    private static final int METHOD_transferFocusDownCycle164 = 164;
    private static final int METHOD_transferFocusUpCycle165 = 165;
    private static final int METHOD_unregisterKeyboardAction166 = 166;
    private static final int METHOD_update167 = 167;
    private static final int METHOD_updateUI168 = 168;
    private static final int METHOD_validate169 = 169;
    private static final int METHOD_viewToModel170 = 170;
    private static final int METHOD_write171 = 171;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[172];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addKeymap7] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("addKeymap", new Class[] {java.lang.String.class, javax.swing.text.Keymap.class})); // NOI18N
            methods[METHOD_addKeymap7].setDisplayName ( "" );
            methods[METHOD_addNotify8] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify8].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener9] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener9].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation10] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation10].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet11] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet11].setDisplayName ( "" );
            methods[METHOD_bounds12] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds12].setDisplayName ( "" );
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect15] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_copy18] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("copy", new Class[] {})); // NOI18N
            methods[METHOD_copy18].setDisplayName ( "" );
            methods[METHOD_countComponents19] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents19].setDisplayName ( "" );
            methods[METHOD_createImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage20].setDisplayName ( "" );
            methods[METHOD_createImage21] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage21].setDisplayName ( "" );
            methods[METHOD_createToolTip22] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_createVolatileImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage24].setDisplayName ( "" );
            methods[METHOD_cut25] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("cut", new Class[] {})); // NOI18N
            methods[METHOD_cut25].setDisplayName ( "" );
            methods[METHOD_deliverEvent26] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent26].setDisplayName ( "" );
            methods[METHOD_disable27] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable27].setDisplayName ( "" );
            methods[METHOD_dispatchEvent28] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent28].setDisplayName ( "" );
            methods[METHOD_doLayout29] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout29].setDisplayName ( "" );
            methods[METHOD_enable30] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enableInputMethods32] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods32].setDisplayName ( "" );
            methods[METHOD_findComponentAt33] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke43].setDisplayName ( "" );
            methods[METHOD_getBaseline44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline44].setDisplayName ( "" );
            methods[METHOD_getBounds45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds45].setDisplayName ( "" );
            methods[METHOD_getClientProperty46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty46].setDisplayName ( "" );
            methods[METHOD_getComponentAt47] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt47].setDisplayName ( "" );
            methods[METHOD_getComponentAt48] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt48].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder49] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder49].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke50].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale51].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys52] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys52].setDisplayName ( "" );
            methods[METHOD_getFontMetrics53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics53].setDisplayName ( "" );
            methods[METHOD_getInsets54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets54].setDisplayName ( "" );
            methods[METHOD_getKeymap55] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getKeymap", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getKeymap55].setDisplayName ( "" );
            methods[METHOD_getListeners56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners56].setDisplayName ( "" );
            methods[METHOD_getLocation57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation57].setDisplayName ( "" );
            methods[METHOD_getMousePosition58] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition58].setDisplayName ( "" );
            methods[METHOD_getPopupLocation59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation59].setDisplayName ( "" );
            methods[METHOD_getPrintable60] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getPrintable", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_getPrintable60].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners61] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners61].setDisplayName ( "" );
            methods[METHOD_getScrollableBlockIncrement62] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getScrollableBlockIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableBlockIncrement62].setDisplayName ( "" );
            methods[METHOD_getScrollableUnitIncrement63] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getScrollableUnitIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableUnitIncrement63].setDisplayName ( "" );
            methods[METHOD_getSize64] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize64].setDisplayName ( "" );
            methods[METHOD_getText65] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getText", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getText65].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation66].setDisplayName ( "" );
            methods[METHOD_getToolTipText67] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText67].setDisplayName ( "" );
            methods[METHOD_gotFocus68] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus68].setDisplayName ( "" );
            methods[METHOD_grabFocus69] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus69].setDisplayName ( "" );
            methods[METHOD_handleEvent70] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent70].setDisplayName ( "" );
            methods[METHOD_hasFocus71] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus71].setDisplayName ( "" );
            methods[METHOD_imageUpdate72] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate72].setDisplayName ( "" );
            methods[METHOD_insets73] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets73].setDisplayName ( "" );
            methods[METHOD_inside74] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside74].setDisplayName ( "" );
            methods[METHOD_invalidate75] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate75].setDisplayName ( "" );
            methods[METHOD_isAncestorOf76] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf76].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot77] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot77].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent78] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent78].setDisplayName ( "" );
            methods[METHOD_keyDown79] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown79].setDisplayName ( "" );
            methods[METHOD_keyUp80] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp80].setDisplayName ( "" );
            methods[METHOD_layout81] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout81].setDisplayName ( "" );
            methods[METHOD_list82] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list82].setDisplayName ( "" );
            methods[METHOD_list83] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list83].setDisplayName ( "" );
            methods[METHOD_list84] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list84].setDisplayName ( "" );
            methods[METHOD_list85] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list85].setDisplayName ( "" );
            methods[METHOD_list86] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list86].setDisplayName ( "" );
            methods[METHOD_loadKeymap87] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("loadKeymap", new Class[] {javax.swing.text.Keymap.class, javax.swing.text.JTextComponent.KeyBinding[].class, javax.swing.Action[].class})); // NOI18N
            methods[METHOD_loadKeymap87].setDisplayName ( "" );
            methods[METHOD_locate88] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate88].setDisplayName ( "" );
            methods[METHOD_location89] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location89].setDisplayName ( "" );
            methods[METHOD_lostFocus90] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus90].setDisplayName ( "" );
            methods[METHOD_minimumSize91] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize91].setDisplayName ( "" );
            methods[METHOD_modelToView92] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("modelToView", new Class[] {int.class})); // NOI18N
            methods[METHOD_modelToView92].setDisplayName ( "" );
            methods[METHOD_mouseDown93] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown93].setDisplayName ( "" );
            methods[METHOD_mouseDrag94] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag94].setDisplayName ( "" );
            methods[METHOD_mouseEnter95] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter95].setDisplayName ( "" );
            methods[METHOD_mouseExit96] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit96].setDisplayName ( "" );
            methods[METHOD_mouseMove97] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove97].setDisplayName ( "" );
            methods[METHOD_mouseUp98] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp98].setDisplayName ( "" );
            methods[METHOD_move99] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move99].setDisplayName ( "" );
            methods[METHOD_moveCaretPosition100] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("moveCaretPosition", new Class[] {int.class})); // NOI18N
            methods[METHOD_moveCaretPosition100].setDisplayName ( "" );
            methods[METHOD_nextFocus101] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus101].setDisplayName ( "" );
            methods[METHOD_paint102] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint102].setDisplayName ( "" );
            methods[METHOD_paintAll103] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll103].setDisplayName ( "" );
            methods[METHOD_paintComponents104] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents104].setDisplayName ( "" );
            methods[METHOD_paintImmediately105] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately105].setDisplayName ( "" );
            methods[METHOD_paintImmediately106] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately106].setDisplayName ( "" );
            methods[METHOD_paste107] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("paste", new Class[] {})); // NOI18N
            methods[METHOD_paste107].setDisplayName ( "" );
            methods[METHOD_postActionEvent108] = new MethodDescriptor(javax.swing.JTextField.class.getMethod("postActionEvent", new Class[] {})); // NOI18N
            methods[METHOD_postActionEvent108].setDisplayName ( "" );
            methods[METHOD_postEvent109] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent109].setDisplayName ( "" );
            methods[METHOD_preferredSize110] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize110].setDisplayName ( "" );
            methods[METHOD_prepareImage111] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage111].setDisplayName ( "" );
            methods[METHOD_prepareImage112] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage112].setDisplayName ( "" );
            methods[METHOD_print113] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print113].setDisplayName ( "" );
            methods[METHOD_print114] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {})); // NOI18N
            methods[METHOD_print114].setDisplayName ( "" );
            methods[METHOD_print115] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_print115].setDisplayName ( "" );
            methods[METHOD_print116] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class, boolean.class, javax.print.PrintService.class, javax.print.attribute.PrintRequestAttributeSet.class, boolean.class})); // NOI18N
            methods[METHOD_print116].setDisplayName ( "" );
            methods[METHOD_printAll117] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll117].setDisplayName ( "" );
            methods[METHOD_printComponents118] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents118].setDisplayName ( "" );
            methods[METHOD_putClientProperty119] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty119].setDisplayName ( "" );
            methods[METHOD_read120] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("read", new Class[] {java.io.Reader.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_read120].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction121] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction121].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction122].setDisplayName ( "" );
            methods[METHOD_remove123] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove123].setDisplayName ( "" );
            methods[METHOD_remove124] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove124].setDisplayName ( "" );
            methods[METHOD_remove125] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove125].setDisplayName ( "" );
            methods[METHOD_removeAll126] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll126].setDisplayName ( "" );
            methods[METHOD_removeKeymap127] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("removeKeymap", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_removeKeymap127].setDisplayName ( "" );
            methods[METHOD_removeNotify128] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify128].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener129] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener129].setDisplayName ( "" );
            methods[METHOD_repaint130] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint130].setDisplayName ( "" );
            methods[METHOD_repaint131] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint131].setDisplayName ( "" );
            methods[METHOD_repaint132] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint132].setDisplayName ( "" );
            methods[METHOD_repaint133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint133].setDisplayName ( "" );
            methods[METHOD_repaint134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint134].setDisplayName ( "" );
            methods[METHOD_replaceSelection135] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("replaceSelection", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_replaceSelection135].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus136].setDisplayName ( "" );
            methods[METHOD_requestFocus137] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus137].setDisplayName ( "" );
            methods[METHOD_requestFocus138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus138].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow139].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions140] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions140].setDisplayName ( "" );
            methods[METHOD_reshape141] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape141].setDisplayName ( "" );
            methods[METHOD_resize142] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize142].setDisplayName ( "" );
            methods[METHOD_resize143] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize143].setDisplayName ( "" );
            methods[METHOD_revalidate144] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate144].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible145] = new MethodDescriptor(javax.swing.JTextField.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible145].setDisplayName ( "" );
            methods[METHOD_select146] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("select", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_select146].setDisplayName ( "" );
            methods[METHOD_selectAll147] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("selectAll", new Class[] {})); // NOI18N
            methods[METHOD_selectAll147].setDisplayName ( "" );
            methods[METHOD_setBounds148] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds148].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder149] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder149].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale150] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale150].setDisplayName ( "" );
            methods[METHOD_show151] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show151].setDisplayName ( "" );
            methods[METHOD_show152] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show152].setDisplayName ( "" );
            methods[METHOD_show153] = new MethodDescriptor(gui.JAdvTextField.class.getMethod("show", new Class[] {int.class})); // NOI18N
            methods[METHOD_show153].setDisplayName ( "" );
            methods[METHOD_show154] = new MethodDescriptor(gui.JAdvTextField.class.getMethod("show", new Class[] {java.lang.String.class, int.class})); // NOI18N
            methods[METHOD_show154].setDisplayName ( "" );
            methods[METHOD_showError155] = new MethodDescriptor(gui.JAdvTextField.class.getMethod("showError", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_showError155].setDisplayName ( "" );
            methods[METHOD_showMessage156] = new MethodDescriptor(gui.JAdvTextField.class.getMethod("showMessage", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_showMessage156].setDisplayName ( "" );
            methods[METHOD_showProblem157] = new MethodDescriptor(gui.JAdvTextField.class.getMethod("showProblem", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_showProblem157].setDisplayName ( "" );
            methods[METHOD_showSuccess158] = new MethodDescriptor(gui.JAdvTextField.class.getMethod("showSuccess", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_showSuccess158].setDisplayName ( "" );
            methods[METHOD_showWarning159] = new MethodDescriptor(gui.JAdvTextField.class.getMethod("showWarning", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_showWarning159].setDisplayName ( "" );
            methods[METHOD_size160] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size160].setDisplayName ( "" );
            methods[METHOD_toString161] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString161].setDisplayName ( "" );
            methods[METHOD_transferFocus162] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus162].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward163] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward163].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle164] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle164].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle165] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle165].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction166] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction166].setDisplayName ( "" );
            methods[METHOD_update167] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update167].setDisplayName ( "" );
            methods[METHOD_updateUI168] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI168].setDisplayName ( "" );
            methods[METHOD_validate169] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate169].setDisplayName ( "" );
            methods[METHOD_viewToModel170] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("viewToModel", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_viewToModel170].setDisplayName ( "" );
            methods[METHOD_write171] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("write", new Class[] {java.io.Writer.class})); // NOI18N
            methods[METHOD_write171].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods

        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "gui/gif/JAdvTextFieldC16.gif";//GEN-BEGIN:Icons
    private static String iconNameC32 = "gui/gif/JAdvTextFieldC32.gif";
    private static String iconNameM16 = "gui/gif/JAdvTextFieldM16.gif";
    private static String iconNameM32 = "gui/gif/JAdvTextFieldM32.gif";//GEN-END:Icons
    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx

//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.
//GEN-LAST:Superclass
    /**
     * Gets the bean's
     * <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean. May return null if
     * the information should be obtained by automatic analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's
     * <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable properties supported by this
     * bean. May return null if the information should be obtained by automatic analysis. <p> If a
     * property is indexed, then its entry in the result array will belong to the
     * IndexedPropertyDescriptor subclass of PropertyDescriptor. A client of getPropertyDescriptors
     * can use "instanceof" to check if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's
     * <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events fired by this bean.
     * May return null if the information should be obtained by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's
     * <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented by this bean. May
     * return null if the information should be obtained by automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will mostly commonly be
     * initially chosen for update by human's who are customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array returned by
     * getPropertyDescriptors. <P>	Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly commonly be used by
     * human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned by
     * getEventSetDescriptors. <P>	Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the bean in toolboxes,
     * toolbars, etc. Icon images will typically be GIFs, but may in future include other formats.
     * <p> Beans aren't required to provide icons and may return null from this method. <p> There
     * are four possible flavors of icons (16x16 color, 32x32 color, 16x16 mono, 32x32 mono). If a
     * bean choses to only support a single icon we recommend supporting 16x16 color. <p> We
     * recommend that icons have a "transparent" background so they can be rendered onto an existing
     * background.
     *
     * @param iconKind The kind of icon requested. This should be one of the constant values
     * ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null if no suitable icon
     * is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }

}
