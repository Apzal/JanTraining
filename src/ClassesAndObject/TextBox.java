package ClassesAndObject;

public class TextBox {
    private String text;
    private int textLength;

    public void enterText(String text){
        this.text = text;
        System.out.println("Entered text "+this.text);

    }

    public String getText(){
        return text;
    }

    public void clear(){
        System.out.println("Clearing text");
    }
}
