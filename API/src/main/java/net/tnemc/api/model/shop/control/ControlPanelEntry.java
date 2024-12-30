package net.tnemc.api.model.shop.control;
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

import net.kyori.adventure.text.Component;
import net.tnemc.api.model.shop.Shop;
import net.tnemc.plugincore.core.compatibility.PlayerProvider;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

/**
 * ControlPanelEntry
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface ControlPanelEntry {

  /**
   * Retrieves the identifier associated with this ControlPanelEntry.
   *
   * @return a non-null String representing the identifier
   */
  @NotNull String identifier();

  /**
   * Retrieves the display order of this ControlPanelEntry.
   *
   * @return an integer value representing the display order
   */
  int displayOrder();

  /**
   * This method serves as an entry point that returns an Optional containing a Component.
   *
   * @param provider the PlayerProvider used to access player information (must not be null)
   * @param shop the Shop representing the shop to interact with (must not be null)
   * @return an Optional of Component representing the result of the entry operation
   */
  Optional<Component> entry(@NotNull PlayerProvider provider, @NotNull Shop shop);
}