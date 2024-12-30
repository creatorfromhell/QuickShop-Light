package net.tnemc.api.model.shop.display;
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

import net.tnemc.api.model.location.SerializableLocation;
import net.tnemc.api.model.shop.Shop;
import org.jetbrains.annotations.NotNull;

/**
 * DisplayItem
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface DisplayItem {

  /**
   * Retrieves the shop associated with the DisplayItem.
   *
   * @return the Shop object representing the shop associated with the DisplayItem
   */
  @NotNull Shop shop();

  /**
   * Retrieves the location object of the DisplayItem.
   *
   * @return a SerializableLocation object representing the location of the DisplayItem
   */
  SerializableLocation location();

  /**
   * Checks whether the object has been moved.
   *
   * @return true if the object has been moved, false otherwise
   */
  boolean isMoved();

  /**
   * Checks if the object has been spawned.
   *
   * @return true if the object has been spawned, false otherwise
   */
  boolean isSpawned();

  /**
   * Method to spawn an instance of a DisplayItem.
   * This method creates and initializes a new instance of a DisplayItem, preparing it for display.
   */
  void spawn();

  /**
   * Method to respawn the object.
   */
  void respawn();

  /**
   * Method to despawn an instance of a DisplayItem.
   * This method removes the DisplayItem from the display, preparing it for removal.
   */
  void despawn();
}