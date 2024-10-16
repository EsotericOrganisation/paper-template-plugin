package org.esoteric.minecraft.plugins.template.util.types;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.jetbrains.annotations.NotNull;

public class BlockLocation {

  private String worldName;

  private int x;
  private int y;
  private int z;

  public String getWorldName() {
    return worldName;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getZ() {
    return z;
  }

  public BlockLocation(String worldName, int x, int y, int z) {
    this.worldName = worldName;
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public BlockLocation(@NotNull Location location) {
    this(location.getWorld().getName(), (int) location.getX(), (int) location.getY(), (int) location.getZ());
  }

  public BlockLocation(@NotNull Block block) {
    this(block.getLocation());
  }
}
