package org.example;

class YellowLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLight trafficLight) {
        System.out.println("Traffic light is YELLOW. Prepare to stop.");
        System.out.println("Turning from yellow to red");
        trafficLight.setState(new RedLightState());
    }
}
