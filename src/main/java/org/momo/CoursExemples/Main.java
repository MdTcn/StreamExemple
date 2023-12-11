package org.momo.CoursExemples;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Personne p1 = new Personne("Mohammed", "Ali", 31);
        Personne p2 = new Personne("Tyson", "Mike", 27);
        Personne p3 = new Personne("Iniesta", "Andres", 29);
        Personne p4 = new Personne("Xavi", "Hernandez", 25);
        Personne p5 = new Personne("Ibra", "Zlatan", 29);
        Personne p6 = new Personne("Karim", "Benzema", 27);
        Personne p7 = new Personne("Kevin", "DeBruyne", 29);
        Personne p8 = new Personne("Pierre", "Archavine", 31);
        Personne p9 = new Personne("Carlos", "Dante", 25);

        List<Personne> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);

        List<Personne> sortedList = list.stream()
                .sorted(Comparator.comparingInt(Personne::getAge).thenComparing(Personne::getPrenom))
                .collect(Collectors.toList());

        int age = 0;
        int sub = 0;
        for (int index = 0; index < sortedList.size(); index ++) {
            if(index == 0 || age != sortedList.get(index).getAge())
            {
                sub = 0;
                age = sortedList.get(index).getAge();
                System.out.println("\nAge: " + sortedList.get(index).getAge() +", personne " + (++sub) + " : " + sortedList.get(index).getPrenom());
            } else {
                System.out.println("\t\t" + "Personne " + (++sub) + " : " + sortedList.get(index).getPrenom());
            }
        }
    }
}