import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
  public static void main(String[] args) {
    Map<String, Student> students = new HashMap<>();
    students.put("00001", new Student("FH234465", "John Black"));
    students.put("00002", new Student("FH733425", "Angelina Joly"));
    students.put("00003", new Student("FH838290", "Tom Hanks"));

    Set<Map.Entry<String, Student>> set;
    set = students.entrySet();
    for (Map.Entry<String, Student> me : set) {
      System.out.println(me.getValue().toString());
    }


  }
}
