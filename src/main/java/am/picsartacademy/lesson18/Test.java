package am.picsartacademy.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Anna", 17));
        humans.add(new Human("Mane", 22));
        humans.add(new Human("Tigran", 11));
        humans.add(new Human("Ani",33));
        humans.add(new Human("Dianna", 9));
        humans.add(new Human("Davit", 27));

        List<String> p = humans.stream().sorted((h1, h2) -> h1.getAge() - h2.getAge())
                .map(hmhm-> hmhm.getName()).toList();
        System.out.println(p);


//  List<String> streamNames = humans.stream()
//                .map((human -> human.getName()))
//                .collect(Collectors.toList());
//
//        System.out.println(streamNames);









//        strings.forEach((varName) ->{
//
//            System.out.println(varName);
//        }
//        );

//        Run run = (name) -> {
//            System.out.println("Running fast " + name);
//
//
//        };
//
//        run.fast("aaa");
    }
}
