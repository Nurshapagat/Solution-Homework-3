package org.example.demo;

import org.example.builder.IDungeonBuilder;
import org.example.builder.SimpleDungeonBuilder;
import org.example.models.Dungeon;
import org.example.prototype.Room;
import org.example.prototype.CloneableGameEntity;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Haunted Dungeon")
                .addRoom(new Room("Main Hall", "A spooky hall"))
                .build();

        Room prototypeRoom = new Room("Side Chamber", "A mysterious side room");
        Room clonedRoom1 = (Room) prototypeRoom.cloneEntity();
        Room clonedRoom2 = (Room) prototypeRoom.cloneEntity();

        dungeon.addRoom(clonedRoom1);
        dungeon.addRoom(clonedRoom2);

        System.out.println(dungeon);
    }
}
