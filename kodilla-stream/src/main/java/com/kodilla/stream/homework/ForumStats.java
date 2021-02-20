package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ForumStats {
    public static void main(String[] args) {
        double avgOld = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(u -> u.getAge()>= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n->n)
                .average()                                 // [3]
                .getAsDouble();                            // [4]

        System.out.println("średnia liczba postów dla starych: "+avgOld);
        double avgYoung = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(u -> u.getAge()< 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n->n)
                .average()                                 // [3]
                .getAsDouble();                             // [4]
        System.out.println("średnia liczba postów dla młodych: "+avgYoung);
    }

}
