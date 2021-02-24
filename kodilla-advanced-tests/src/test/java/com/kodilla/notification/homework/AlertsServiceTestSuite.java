package com.kodilla.notification.homework;

import com.kodilla.mockito.NotificationService;
import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AlertsServiceTestSuite {
    AlertsService alertsService = new AlertsService();
    Person person = Mockito.mock(Person.class);
    Alert alert = Mockito.mock(Alert.class);
    Point point = Mockito.mock(Point.class);

    @Test
    public void notSubscribedPersonForPointShouldNotReceivePointAlert() {
        // given
        alertsService.sendAlertForPoint(alert, point);
        //then
        Mockito.verify(person, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void subscribedPersonForPointShouldReceivePointAlert() {
        // given
        alertsService.addSubscription(person, point);
        //when
        alertsService.sendAlertForPoint(alert, point);
        //then
        Mockito.verify(person, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void pointAlertShouldBeSentToAllSubscribedPersons() {
        // given
        Person secondPerson = Mockito.mock(Person.class);
        Person thirdPerson = Mockito.mock(Person.class);
        Point secondPoint = Mockito.mock(Point.class);
        Point thirdPoint = Mockito.mock(Point.class);
        alertsService.addSubscription(person, point);
        alertsService.addSubscription(person, secondPoint);
        alertsService.addSubscription(secondPerson, secondPoint);
        alertsService.addSubscription(thirdPerson, secondPoint);
        alertsService.addSubscription(thirdPerson, thirdPoint);
        //when
        alertsService.sendAlertForPoint(alert, point);
        alertsService.sendAlertForPoint(alert, secondPoint);
        alertsService.sendAlertForPoint(alert, thirdPoint);
        //then
        Mockito.verify(person, Mockito.times(2)).receiveAlert(alert);
        Mockito.verify(secondPerson, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(thirdPerson, Mockito.times(2)).receiveAlert(alert);
    }

    @Test
    public void pointAlertShouldBeSentOnlyToSubscribedPersons() {
        // given
        Person secondPerson = Mockito.mock(Person.class);
        Person thirdPerson = Mockito.mock(Person.class);
        Point secondPoint = Mockito.mock(Point.class);
        Point thirdPoint = Mockito.mock(Point.class);
        alertsService.addSubscription(person, point);
        alertsService.addSubscription(person, secondPoint);
        alertsService.addSubscription(person, thirdPoint);
        alertsService.addSubscription(secondPerson, secondPoint);
        alertsService.addSubscription(thirdPerson, secondPoint);
        alertsService.addSubscription(thirdPerson, thirdPoint);
        //when
        alertsService.sendAlertForPoint(alert, thirdPoint);
        //then
        Mockito.verify(person, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(secondPerson, Mockito.never()).receiveAlert(alert);
        Mockito.verify(thirdPerson, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void shouldSendOnlyOnePointAlertToMultiTimeSubscriberOfPoint() {
        // given
        alertsService.addSubscription(person, point);
        alertsService.addSubscription(person, point);
        alertsService.addSubscription(person, point);
        //when
        alertsService.sendAlertForPoint(alert, point);
        //then
        Mockito.verify(person, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void unsubscribedPersonForPointShouldNotReceiveAlert() {
        // given
        Person secondPerson = Mockito.mock(Person.class);
        Person thirdPerson = Mockito.mock(Person.class);
        Point secondPoint = Mockito.mock(Point.class);
        Point thirdPoint = Mockito.mock(Point.class);
        alertsService.addSubscription(person, point);
        alertsService.addSubscription(person, secondPoint);
        alertsService.addSubscription(secondPerson, secondPoint);
        alertsService.addSubscription(thirdPerson, secondPoint);
        alertsService.addSubscription(thirdPerson, thirdPoint);
        //when
        alertsService.removeSubscriptionForPersonOfOnePoint(person, point);
        alertsService.sendAlertForPoint(alert, point);
        //then
        Mockito.verify(person, Mockito.never()).receiveAlert(alert);
        //when
        alertsService.removeSubscriptionForPersonOfOnePoint(secondPerson, secondPoint);
        alertsService.sendAlertForPoint(alert, secondPoint);
        //then
        Mockito.verify(secondPerson, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void removePointFromAllPersonsShouldNotReceivePointAlert() {
        // given
        Person secondPerson = Mockito.mock(Person.class);
        Person thirdPerson = Mockito.mock(Person.class);
        Point secondPoint = Mockito.mock(Point.class);
        Point thirdPoint = Mockito.mock(Point.class);
        alertsService.addSubscription(person, point);
        alertsService.addSubscription(person, secondPoint);
        alertsService.addSubscription(secondPerson, secondPoint);
        alertsService.addSubscription(thirdPerson, secondPoint);
        alertsService.addSubscription(thirdPerson, thirdPoint);
        //when
        alertsService.removePointFromAllPersons(secondPoint);
        alertsService.sendAlertForPoint(alert, secondPoint);
        //then
        Mockito.verify(person, Mockito.never()).receiveAlert(alert);
        Mockito.verify(secondPerson, Mockito.never()).receiveAlert(alert);
        Mockito.verify(thirdPerson, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void unsubscribedPersonForAllPointShouldNotReceiveAnyAlerts() {
        // given
        Point secondPoint = Mockito.mock(Point.class);
        Point thirdPoint = Mockito.mock(Point.class);
        alertsService.addSubscription(person, point);
        alertsService.addSubscription(person, secondPoint);
        alertsService.addSubscription(person, thirdPoint);
        //when
        alertsService.removeSubscriptionForPersonOfOnePoint(person, point);
        alertsService.removeSubscriptionForPersonOfOnePoint(person, secondPoint);
        alertsService.removeSubscriptionForPersonOfOnePoint(person, thirdPoint);
        alertsService.sendAlertForPoint(alert, point);
        //then
        Mockito.verify(person, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void unsubscribedPersonForAllPointsAndRemovedShouldNotReceiveAnyAlerts() {
        // given
        Point secondPoint = Mockito.mock(Point.class);
        Point thirdPoint = Mockito.mock(Point.class);
        alertsService.addSubscription(person, point);
        alertsService.addSubscription(person, secondPoint);
        alertsService.addSubscription(person, thirdPoint);
        alertsService.removePersonAndSubscriptionToAllPoints(person);
        //when
        alertsService.sendAlertForPoint(alert, point);
        //then
        Mockito.verify(person, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void subscribedPersonsForAnyPointShouldReceiveGeneralInfoOnce() {
        // given
        Person secondPerson = Mockito.mock(Person.class);
        Person thirdPerson = Mockito.mock(Person.class);
        Point secondPoint = Mockito.mock(Point.class);
        Point thirdPoint = Mockito.mock(Point.class);
        alertsService.addSubscription(person, point);
        alertsService.addSubscription(secondPerson, secondPoint);
        alertsService.addSubscription(thirdPerson, secondPoint);
        alertsService.addSubscription(thirdPerson, thirdPoint);
        //when
        alertsService.sendGeneralInformation(alert);
        //then
        Mockito.verify(person, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(secondPerson, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(thirdPerson, Mockito.times(1)).receiveAlert(alert);
    }

}