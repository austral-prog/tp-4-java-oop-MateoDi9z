package com.template;

public class Elevator {
    int piso_actual;
    int passengers;
    int max_passengers;
    int piso_maximo;

    Elevator(int piso_inicial, int piso_maximo, int max_passengers) {
        this.piso_actual = piso_inicial;
        this.passengers = 0;
        this.max_passengers = max_passengers;
        this.piso_maximo = piso_maximo;
    }

    void moveToFloor(int new_piso) {
        if (new_piso > this.piso_maximo || new_piso < 0)
            return;

        this.piso_actual = new_piso;
    }

    int getCurrentFloor() {
        return piso_actual;
    }

    void addPassenger() {
        if (passengers < max_passengers)
            passengers += 1;
    }

    void removePassenger() {
        if (passengers > 0)
            passengers -= 1;
    }

    int getPassengerCount() {
        return passengers;
    }
}
