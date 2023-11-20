package org.example;

class RedLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Traffic light is RED. Waiting...");
        System.out.println("Turning from red to green");
        trafficLight.setState(new GreenLightState());
    }
}