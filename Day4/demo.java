import java.util.*;

public class demo {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Learn Java");
        tasks.add("Build Project");

        for(String task : tasks) {
            System.out.println(task);
        }
    }
}