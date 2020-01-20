package Assignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        Map<String, Integer> studentList = new HashMap<>();

        studentList.put("Sam", 87);
        studentList.put("Ann", 72);
        studentList.put("Mike", 12);
        studentList.put("Diana", 30);
        studentList.put("Johny", 90);
        studentList.put("Zee", 68);
        System.out.println(studentList);

        List<String> filtered = studentList.entrySet()
                .stream()
                .filter(ent -> ent.getValue() > 60)
                .map(m -> m.getKey())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filtered);


    }
}


