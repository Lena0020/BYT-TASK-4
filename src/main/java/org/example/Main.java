package org.example;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        // simulating state transitions
        trafficLight.requestStateChange();  // Red to Green
        trafficLight.requestStateChange();  // Green to Yellow
        trafficLight.requestStateChange();  // Yellow to Red
    }
}