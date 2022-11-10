import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
  public static void main(String args[]) {

    String input = "";
    for (int i = 0; i < args.length; i++) {
      input += " " + args[i];
    }

    ArrayList<String> list = new ArrayList<String>();
    String parts[] = input.split(",");
    for (int i = 0; i < parts.length; i++) {
      list.add(parts[i].replaceFirst("^\\s+", ""));
    }
      
    List<String> femaleList = list.
      stream().
      filter(person -> person.charAt(person.length()-1) == 'F').
      collect(Collectors.toList());

    femaleList.forEach(System.out::println);
  }
}
