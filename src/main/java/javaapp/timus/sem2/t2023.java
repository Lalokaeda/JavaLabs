package javaapp.timus.sem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class t2023 {
public static void main(String[] args) {
    List<String> Box1 = new ArrayList<String>();
    Box1.add("Alice");
    Box1.add("Ariel");
    Box1.add("Aurora");
    Box1.add("Phil");
    Box1.add("Peter");
    Box1.add("Olaf");
    Box1.add("Phoebus");
    Box1.add("Ralph");
    Box1.add("Robin");

    List<String> Box2 = new ArrayList<String>();
    Box2.add("Bambi");
    Box2.add("Belle");
    Box2.add("Bolt");
    Box2.add("Mulan");
    Box2.add("Mowgli");
    Box2.add("Mickey");
    Box2.add("Silver");
    Box2.add("Simba");
    Box2.add("Stitch");

    List<String> Box3 = new ArrayList<String>();
    Box3.add("Dumbo");
    Box3.add("Genie");
    Box3.add("Jiminy");
    Box3.add("Kuzko");
    Box3.add("Kida");
    Box3.add("Kenai");
    Box3.add("Tarzan");
    Box3.add("Tiana");
    Box3.add("Winnie");
    List[] Boxes = new List[3];
    Boxes[0]=Box1;
    Boxes[1]=Box2;
    Boxes[2]=Box3;

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    //in.nextLine();
    int boxIndex = findBoxIndex(Boxes, in.nextLine());
    int steps = 0;
        for (int i = 0; i < n; i++) {
            String recipient = in.nextLine();
            int boxIndex1 = findBoxIndex(Boxes, recipient);
            // Дональд совершает шаги к нужному шкафу
            steps += Math.abs(boxIndex1-boxIndex);
            boxIndex=boxIndex1;
        }
        System.out.println(steps);

}
public static int findBoxIndex(List[] boxes, String recipient) {
    for (int i = 0; i < boxes.length; i++) {
        List<String> box = boxes[i];
        if (box.contains(recipient)) {
            return i;
        }
    }
    return 0;
}
}
