package net.tnemc.api.model.shop.action;
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

import net.tnemc.api.connector.EconomyConnector;
import net.tnemc.api.model.shop.Shop;
import net.tnemc.plugincore.core.compatibility.PlayerProvider;
import org.jetbrains.annotations.NotNull;

/**
 * ShopAction
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface ShopAction {

  /**
   * Returns the identifier associated with this object.
   *
   * @return The identifier as a non-null string.
   */
  @NotNull String identifier();

  /**
   * Checks if this method applies to the given shop based on certain criteria.
   *
   * @param shop the shop to check if the method applies to
   * @return true if this method applies to the shop, false otherwise
   */
  boolean applies(@NotNull Shop shop);

  /**
   * Performs a specific action with the given player, economy connector, shop, and amount.
   *
   * @param player   the player for whom the action is performed, not null
   * @param economy  the economy connector used for the action, not null
   * @param shop     the shop where the action takes place, not null
   * @param amount   the amount associated with the action
   * @return true if the action is successfully performed, false otherwise
   */
  boolean perform(@NotNull PlayerProvider player, @NotNull EconomyConnector economy, @NotNull Shop shop, final int amount);
}