package net.tnemc.api.model.location;
/*
 * QuickShop-Light
 * Copyright (C) 2024 Daniel "creatorfromhell" Vidmar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import org.jetbrains.annotations.NotNull;

/**
 * Represents a location object that represents information in their most basic type form.
 *
 * @author creatorfromhell
 */
public class SerializableLocation {

  /**
   * The name of the world
   */
  private String world;

  /**
   * The x coordinate.
   */
  private int x;

  /**
   * The y coordinate.
   */
  private int y;

  /**
   * The z coordinate.
   */
  private int z;

  public SerializableLocation(@NotNull final String world, final int x, final int y, final int z) {

    this.world = world;
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public @NotNull String getWorld() {

    return world;
  }

  public void setWorld(@NotNull final String world) {

    this.world = world;
  }

  public int getX() {

    return x;
  }

  public void setX(final int x) {

    this.x = x;
  }

  public int getY() {

    return y;
  }

  public void setY(final int y) {

    this.y = y;
  }

  public int getZ() {

    return z;
  }

  public void setZ(final int z) {

    this.z = z;
  }

  public int getChunkX() {

    return x / 16;
  }

  public int getChunkZ() {

    return z / 16;
  }

  @Override
  public String toString() {

    return "SerializableLocation{" +
           "world='" + world + '\'' +
           ", x=" + x +
           ", y=" + y +
           ", z=" + z +
           '}';
  }
}