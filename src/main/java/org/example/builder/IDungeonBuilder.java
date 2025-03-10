package org.example.builder;

import org.example.models.Dungeon;
import org.example.prototype.Room;
import org.example.prototype.NPC;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    Dungeon build();
}
