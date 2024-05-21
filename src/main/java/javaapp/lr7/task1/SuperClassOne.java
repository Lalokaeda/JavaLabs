package javaapp.lr7.task1;

public class SuperClassOne {
 private String text;

 public SuperClassOne(String text) {
    this.text = text;
}

@Override
 public String toString() {
     String superClassNameAndFieldValue = "super" + "\n" 
     + "Class name: " + this.getClass().getSimpleName() + "\n"
     + "text = " + this.getText();
     return superClassNameAndFieldValue;
 }

public String getText() {
    return text;
}

public void setText(String text) {
    this.text = text;
}
}
