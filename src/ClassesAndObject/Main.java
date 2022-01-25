package ClassesAndObject;

public class Main {
    public static void main(String[] args) {
        TextBox textbox = new TextBox();
        TextBox textbox1 = new TextBox();
        textbox.enterText("Elango");
        System.out.println(textbox.getText());
        textbox1.enterText("Dinesh");
        textbox = textbox1;
        System.out.println(textbox.getText());
        System.out.println(textbox1.getText());
    }
}
