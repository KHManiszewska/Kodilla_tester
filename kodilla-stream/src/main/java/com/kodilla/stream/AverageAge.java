package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(n->n)
                .average()                                 // [3]
                .getAsDouble();                            // [4]
        System.out.println(avg);
    }
}
