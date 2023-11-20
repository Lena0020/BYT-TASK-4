package org.example;

class GreenLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Traffic light is GREEN. Go!");
        System.out.println("Turning from green to yellow");
        trafficLight.setState(new YellowLightState());
    }
}