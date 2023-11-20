package org.example;

class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        // initial state is red
        this.state = new RedLightState();
    }

    public void requestStateChange() {
        state.handleRequest(this);
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }
}