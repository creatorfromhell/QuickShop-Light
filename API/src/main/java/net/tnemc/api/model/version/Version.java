package net.tnemc.api.model.version;
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
import org.jetbrains.annotations.NotNull;

/**
 * Version
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface Version {

  /**
   * Retrieves the version of the software.
   *
   * @return A non-null String representing the version of the software.
   */
  @NotNull String version();

  /**
   * Spawns a virtual display at the specified location.
   *
   * @param location The SerializableLocation object representing the location where the virtual display should be spawned.
   * @return true if the virtual display was successfully spawned, false otherwise.
   */
  boolean spawnVirtualDisplay(@NotNull SerializableLocation location);
}