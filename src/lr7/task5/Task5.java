package lr7.task5;

public class Task5 {

   public static void main(String[] args) {
    
    SuperClassOne superClass = new SuperClassOne("текст");
    SubClassFirst subFirst = new SubClassFirst("текст саб1", 1);
    SubClassSecond subSecond = new SubClassSecond("текст саб2", '2');
    superClass.GetInfo();
    subFirst.GetInfo();
    subSecond.GetInfo();
    superClass = subFirst;
    superClass.GetInfo();
    superClass=subSecond;
    superClass.GetInfo();

   }
}
