package com.example.service_spt;

public class Seat {

    public enum SeatStatus {
        AVAILABLE,
        SEATED,
        RESERVED,
    }

    public enum SeatType {
        TABLE,
        COUNTER,
        PRIVATE,
    }
    
    private String id;
    private String name;
    private int capacity;
    private SeatType seatType;
    private SeatStatus status;

public Seat(String id, String name, int capacity,SeatType seatType, SeatStatus status) {
    
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.seatType = seatType;
        this.status = status;
}

}
    