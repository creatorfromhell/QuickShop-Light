package net.tnemc.api.manager;
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

import net.tnemc.api.model.version.Version;

import java.util.Map;

/**
 * VersionManager
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface VersionManager {

  /**
   * Retrieves a map of software versions.
   *
   * @return A map where the keys are version identifiers and the values are Version objects representing each software version.
   */
  Map<String, Version> versions();

  /**
   * Check if a given version is supported by the software.
   *
   * @param version the version to be checked for support
   * @return true if the version is supported, false otherwise
   */
  boolean isSupported(final String version);
}