package com.trainconsist.model;

/*
 * @author Developer
 * @version 16.0
 * 
 * passenger Bogie model
 * 
 **/
import com.trainconsist.exception.InvalidCapacityException;

public class PassengerBogie {

    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid Bogie Capacity: " + capacity);
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " Bogie - Capacity: " + capacity;
    }
}