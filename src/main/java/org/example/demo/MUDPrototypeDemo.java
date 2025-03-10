package org.example.demo;

import org.example.prototype.Room;
import org.example.prototype.CloneableGameEntity;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Treasure Room", "Filled with gold and traps");
        Room clonedRoom = (Room) originalRoom.cloneEntity();

        System.out.println("Original Room: " + originalRoom);
        System.out.println("Cloned Room: " + clonedRoom);
    }
}
