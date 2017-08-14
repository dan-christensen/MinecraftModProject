package com.dan.MinecraftModProject.handlers;

import net.minecraft.util.IStringSerializable;

/**
 * com.dan.MinecraftModProject.handlers.MinecraftModProject
 * Created by dan on 8/14/17.
 */
public class HandlerEnum {
    public static enum ChipTypes implements IStringSerializable {
        BASIC("basic", 0),
        ADVANCED("advanced", 1);

        private String name;
        private int ID;

        private ChipTypes(String name, int id) {
            this.name = name;
            this.ID = id;
        }

        @Override
        public String getName() {
            return this.name;
        }

        public int getId() {
            return this.ID;
        }

        @Override
        public String toString() {
            return this.getName();
        }
    }

}
