package org.example.builder;

import org.example.models.Dungeon;
import org.example.prototype.Room;
import org.example.prototype.NPC;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private Dungeon dungeon;

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        dungeon = new Dungeon(name);
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        dungeon.addRoom(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        dungeon.addNPC(npc);
        return this;
    }

    @Override
    public Dungeon build() {
        return dungeon;
    }
}
