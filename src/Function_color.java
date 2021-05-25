import java.awt.Color;

public class Function_color{
    Gui gui;


    public Function_color(Gui gui){
        this.gui= gui;
    }
    public void changeColor(String color){
        switch(color){

           case "White":
               gui.window.setBackground(Color.white);
               gui.textArea.setBackground(Color.white);
               gui.textArea.setForeground(Color.black);
               break;
           case "Black":
               gui.window.setBackground(Color.black);
               gui.textArea.setBackground(Color.black);
               gui.textArea.setForeground(Color.white);
               break;
           case "Red":
               gui.window.setBackground(Color.red);
               gui.textArea.setBackground(Color.red);
               gui.textArea.setForeground(Color.white);
               break;
           case "Pink":
               gui.window.setBackground(Color.pink);
               gui.textArea.setBackground(Color.pink);
               gui.textArea.setForeground(Color.black);
               break;
            case "Green":
                gui.window.setBackground(Color.green);
                gui.textArea.setBackground(Color.green);
                gui.textArea.setForeground(Color.blue);
                break;


        }
    }
}
