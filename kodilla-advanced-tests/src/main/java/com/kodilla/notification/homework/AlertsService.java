package com.kodilla.notification.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;

import java.util.*;
import java.util.stream.Collectors;

public class AlertsService {
    private Map<Person, Set<Point>> alertsSubscription = new HashMap<>();
    private int count = 0;

    public void addSubscription(Person person, Point point) {
        Set<Point> points = alertsSubscription.getOrDefault(person, new HashSet<>());
        if (points.size() == 0) count = count + 1;
        points.add(point);
        this.alertsSubscription.put(person, points);

        System.out.println(count + " MAP size:" + alertsSubscription.size());
    }

    public void removeSubscriptionForPersonOfOnePoint(Person person, Point point) {
        Set<Point> points = alertsSubscription.getOrDefault(person, new HashSet<>());
        if (points.size() > 0 && points.contains(point)) {
            points.remove(point);
            if (points.size() > 0) this.alertsSubscription.put(person, points);
            else {
                this.alertsSubscription.remove(person);
                count = count - 1;
            }
        }
        System.out.println(count + " MAP size:" + alertsSubscription.size());
    }

    public void removePersonAndSubscriptionToAllPoints(Person person) {
        if (alertsSubscription.containsKey(person)) alertsSubscription.remove(person);
    }

    public void removePointFromAllPersons(Point point) {
        Set<Point> points = new HashSet<>();

        List<Person> persons = this.alertsSubscription.entrySet()
                    .stream()
                    .filter(aEntry -> aEntry.getValue().contains(point))
                    .map(aEntry ->aEntry.getKey())
                    .collect(Collectors.toList());

        if (persons.size() > 0){
            for (Person p : persons) {
                    points = this.alertsSubscription.get(p);
                    if (points.size() > 1) {
                        points.remove(point);
                        this.alertsSubscription.put(p, points);
                    }
                    else {
                        alertsSubscription.remove(p);
                        count = count - 1;
                        System.out.println(count + " MAP size:" + alertsSubscription.size());
                    }
            }
        }
    }

    public void sendAlertForPoint(Alert alert, Point point) {
        this.alertsSubscription.entrySet()
                .stream()
                .filter(aEntry -> aEntry.getValue().contains(point))
                .map(aEntry ->aEntry.getKey())
                .forEach(person -> person.receiveAlert(alert));

    }
    public void sendGeneralInformation(Alert generalInfo) {
        this.alertsSubscription.entrySet()
                .stream()
                .map(aEntry ->aEntry.getKey())
                .forEach(person -> person.receiveAlert(generalInfo));
    }
}
