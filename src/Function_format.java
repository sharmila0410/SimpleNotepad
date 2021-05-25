import java.awt.*;

public class Function_format {
    Gui gui;
    Font arial,comicsansMS,timesnewroman,britannicbold,perpetua,calibri,algerian;
    String selectedFont;

    public Function_format(Gui gui) {
        this.gui=gui;
    }
   public void createFont(int fontSize){
        arial = new Font("Arial",Font.PLAIN,fontSize);
       comicsansMS = new Font("Comic Sans MS",Font.PLAIN,fontSize);
       timesnewroman = new Font("Tims New Roman",Font.PLAIN,fontSize);
       britannicbold = new Font("Britannic Bold",Font.PLAIN,fontSize);
       perpetua = new Font("Perpetua",Font.PLAIN,fontSize);
       calibri = new Font("Calibri",Font.PLAIN,fontSize);
       algerian = new Font("Algerian",Font.PLAIN,fontSize);



       setFont(selectedFont);
    }
    public void setFont(String font){
        selectedFont = font;
         switch(selectedFont){
             case "Arial":
                 gui.textArea.setFont(arial);
                 break;
             case "Comic Sans MS":
                 gui.textArea.setFont(comicsansMS);
                 break;
             case "Times New Roman":
                 gui.textArea.setFont(timesnewroman);
                 break;
             case "Britannic Bold":
                 gui.textArea.setFont(britannicbold);
                 break;
             case "Perpetua":
                 gui.textArea.setFont(perpetua);
                 break;
             case "Calibri":
                 gui.textArea.setFont(calibri);
                 break;
             case "Algerian":
                 gui.textArea.setFont(algerian);
                 break;

         }
    }
}