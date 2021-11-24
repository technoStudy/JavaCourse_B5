package Day22.TextBoxPackage;

public class MainTextbox {

    public static void main(String[] args) {

        Textbox textbox1 = new Textbox();

        System.out.println(textbox1.text);

        textbox1.setText("Hello World");

        System.out.println(textbox1.text);

        textbox1.clear();

        System.out.println(textbox1.text);

    }

}
