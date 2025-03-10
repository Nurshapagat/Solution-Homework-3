package org.example.models;

import org.example.prototype.Room;
import org.example.prototype.NPC;
import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();

    public Dungeon(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addNPC(NPC npc) {
        npcs.add(npc);
    }

    @Override
    public String toString() {
        return "Dungeon: " + name + "\nRooms: " + rooms + "\nNPCs: " + npcs;
    }
}
