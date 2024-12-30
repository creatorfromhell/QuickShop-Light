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

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

/**
 * ControlPanel
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface ControlPanel {

  /**
   * Returns a map of control panel entries with their identifiers as keys.
   *
   * @return a map where keys are Strings representing control panel entry identifiers and values are corresponding ControlPanelEntry objects
   */
  Map<String, ControlPanelEntry> controls();

  /**
   * Creates a panel component for the specified player and shop.
   *
   * @param player the PlayerProvider object representing the player (must not be null)
   * @param shop the Shop object representing the shop (must not be null)
   * @return a Component representing the panel created for the player and shop
   */
  default Component createPanel(@NotNull final PlayerProvider player, @NotNull final Shop shop) {

    return controls().values().stream()
            .sorted(Comparator.comparingInt(ControlPanelEntry::displayOrder))
            .map(entry->entry.entry(player, shop))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .reduce(Component.empty(), Component::append);
  }
}