package javaapp.lr10.task1.Example2;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonCreator {
public static void main(String[] args) {
    JSONObject library = new JSONObject();
    JSONArray books = new JSONArray();
    
    JSONObject book1 = new JSONObject();
    book1.put("Title", "Война и мир");
    book1.put("Author", "Лев Толстой");
    book1.put("Year", 1869);

    JSONObject book2 = new JSONObject();
    book2.put("Title", "Мастер и Маргарита");
    book2.put("Author", "Михаил Булгаков");
    book2.put("Year", 1967);

    books.add(book1);
    books.add(book2);

    library.put("Books", books);

    try (FileWriter file = new FileWriter("src\\lr10\\task1\\Example2\\example.json")){
      file.write(library.toString());
      System.out.println("Json файл успешно создан!");  
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
