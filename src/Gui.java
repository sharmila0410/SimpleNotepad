import javax.swing.*;
import javax.swing.undo.UndoManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {


    JFrame window;
    //textarea
    JTextArea textArea;
    JScrollPane scrollPane;
    //topmenu
    JMenuBar menuBar;
    JMenu menuFile,menuEdit,menuFormat,menuColor;
    //filemenu
    JMenuItem iNew,iOpen,iSave,iSaveAs,iExit;
    //edit menu
    JMenuItem iUndo,iRedo;
    //formatmenu
    JMenuItem iFontArial,iFontCSMS,iFontTNR,iFontBB,iFontpp,iFontCal,iFontAlge,iFontSize8,iFontSize16,iFontSize24,iFontSize32,iFontSize40;
    JMenu menuFont,menuFontSize;
    //colormenu
    JMenuItem iColor1,iColor2,iColor3,iColor4,iColor5;

    Function_file file = new Function_file(this);
    Function_edit edit = new Function_edit(this);
    Function_format format = new Function_format(this);
    Function_color color = new Function_color(this);

    UndoManager um = new UndoManager();

    public static void main(String[] args) {
        new Gui();
    }
    public Gui(){
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        createEditMenu();
        createFormatMenu();
        createColorMenu();


        format.selectedFont = "Arial";
        format.createFont(16);
        color.changeColor("Black");
        window.setVisible(true);
    }
    public void createWindow(){
        window = new JFrame("Notepad");
        window.setBounds(0,0,1025,810);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void createTextArea(){
        textArea = new JTextArea();

        textArea.getDocument().addUndoableEditListener(
                e -> um.addEdit(e.getEdit())
        );
        scrollPane =  new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane);
    }
    public void createMenuBar(){
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);

        menuFile =  new JMenu("File");
        menuBar.add(menuFile);
        menuEdit =  new JMenu("Edit");
        menuBar.add(menuEdit);
        menuFormat =  new JMenu("Format");
        menuBar.add(menuFormat);
        menuColor =  new JMenu("Color");
        menuBar.add(menuColor);
    }
    public void createFileMenu(){
        iNew = new JMenuItem("New");
        iNew.addActionListener(this);
        iNew.setActionCommand("New");
        menuFile.add(iNew);

        iOpen = new JMenuItem("Open");
        iOpen.addActionListener(this);
        iOpen.setActionCommand("Open");
        menuFile.add(iOpen);

        iSave = new JMenuItem("Save");
        iSave.addActionListener(this);
        iSave.setActionCommand("Save");
        menuFile.add(iSave);

        iSaveAs = new JMenuItem("SaveAs");
        iSaveAs.addActionListener(this);
        iSaveAs.setActionCommand("SaveAs");
        menuFile.add(iSaveAs);

        iExit = new JMenuItem("Exit");
        iExit.addActionListener(this);
        iExit.setActionCommand("Exit");
        menuFile.add(iExit);

    }
    public void createEditMenu(){

        iUndo = new JMenuItem("Undo");
        iUndo.addActionListener(this);
        iUndo.setActionCommand("Undo");
        menuEdit.add(iUndo);

        iRedo = new JMenuItem("Redo");
        iRedo.addActionListener(this);
        iRedo.setActionCommand("Redo");
        menuEdit.add(iRedo);

    }
    public void createFormatMenu(){

        menuFont = new JMenu("Font");
        menuFormat.add(menuFont);

        iFontArial = new JMenuItem("Arial");
        iFontArial.addActionListener(this);
        iFontArial.setActionCommand("Arial");
        menuFont.add(iFontArial);

        iFontCSMS = new JMenuItem("Comic Sans MS");
        iFontCSMS.addActionListener(this);
        iFontCSMS.setActionCommand("Comic Sans MS");
        menuFont.add(iFontCSMS);

        iFontTNR = new JMenuItem("Times New Roman");
        iFontTNR.addActionListener(this);
        iFontTNR.setActionCommand("Times New Roman");
        menuFont.add(iFontTNR);

        iFontBB = new JMenuItem("Britannic Bold");
        iFontBB.addActionListener(this);
        iFontBB.setActionCommand("Britannic Bold");
        menuFont.add(iFontBB);

        iFontpp = new JMenuItem("Perpetua");
        iFontpp.addActionListener(this);
        iFontpp.setActionCommand("Perpetua");
        menuFont.add(iFontpp);

        iFontCal = new JMenuItem("Calibri");
        iFontCal.addActionListener(this);
        iFontCal.setActionCommand("Calibri");
        menuFont.add(iFontCal);

        iFontAlge = new JMenuItem("Algerian");
        iFontAlge.addActionListener(this);
        iFontAlge.setActionCommand("Algerian");
        menuFont.add(iFontAlge);

        menuFontSize = new JMenu("Font Size");
        menuFormat.add(menuFontSize);

        iFontSize8 = new JMenuItem("8");
        iFontSize8.addActionListener(this);
        iFontSize8.setActionCommand("size8");
        menuFontSize.add(iFontSize8);

        iFontSize16 = new JMenuItem("16");
        iFontSize16.addActionListener(this);
        iFontSize16.setActionCommand("size16");
        menuFontSize.add(iFontSize16);

        iFontSize24 = new JMenuItem("24");
        iFontSize24.addActionListener(this);
        iFontSize24.setActionCommand("size24");
        menuFontSize.add(iFontSize24);

        iFontSize32 = new JMenuItem("32");
        iFontSize32.addActionListener(this);
        iFontSize32.setActionCommand("size32");
        menuFontSize.add(iFontSize32);

        iFontSize40 = new JMenuItem("40");
        iFontSize40.addActionListener(this);
        iFontSize40.setActionCommand("size40");
        menuFontSize.add(iFontSize40);

    }
    public void createColorMenu(){

        iColor1 = new JMenuItem("White");
        iColor1.addActionListener(this);
        iColor1.setActionCommand("White");
        menuColor.add(iColor1);

        iColor2 = new JMenuItem("black");
        iColor2.addActionListener(this);
        iColor2.setActionCommand("Black");
        menuColor.add(iColor2);

        iColor3 = new JMenuItem("Red");
        iColor3.addActionListener(this);
        iColor3.setActionCommand("Red");
        menuColor.add(iColor3);

        iColor4 = new JMenuItem("Pink");
        iColor4.addActionListener(this);
        iColor4.setActionCommand("Pink");
        menuColor.add(iColor4);

        iColor5 = new JMenuItem("Green");
        iColor5.addActionListener(this);
        iColor5.setActionCommand("Green");
        menuColor.add(iColor5);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch(command){
            case "New":file.newFile();break;
            case "Open":file.open();break;
            case "Save":file.Save();break;
            case"SaveAs":file.saveAs();break;
            case "Exit":file.exit();break;
            case "undo":edit.undo();break;
            case"redo" :edit.redo();break;
            case "Arial":format.setFont(command);break;
            case "Comic Sans MS":format.setFont(command);break;
            case "Times New Roman":format.setFont(command);break;
            case "Britannic Bold":format.setFont(command);break;
            case "Perpetua":format.setFont(command);break;
            case "Calibri":format.setFont(command);break;
            case "Algerian":format.setFont(command);break;
            case "size8":format.createFont(8);break;
            case "size16":format.createFont(16);break;
            case "size24":format.createFont(24);break;
            case "size32":format.createFont(32);break;
            case "size40":format.createFont(40);break;
            case "White":color.changeColor(command);break;
            case "Black":color.changeColor(command);break;
            case "Red":color.changeColor(command);break;
            case "Pink":color.changeColor(command);break;
            case "Green":color.changeColor(command);break;

        }
    }
}

