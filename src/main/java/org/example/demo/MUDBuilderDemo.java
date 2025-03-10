package org.example.demo;

import org.example.builder.IDungeonBuilder;
import org.example.builder.SimpleDungeonBuilder;
import org.example.models.Dungeon;
import org.example.prototype.Room;
import org.example.prototype.NPC;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance", "A dark, damp entrance"))
                .addNPC(new NPC("Goblin", "Enemy"))
                .build();

        System.out.println(dungeon);
    }
}
