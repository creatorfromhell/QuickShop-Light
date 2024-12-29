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

import net.tnemc.api.connector.EconomyConnector;
import net.tnemc.api.model.shop.Shop;

/**
 * ShopManager
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface ShopManager<S> {

  /**
   * Retrieves the interface for connecting to the economy system.
   *
   * @return an {@link EconomyConnector} object representing the connection to the economy system.
   */
  EconomyConnector economy();

  /**
   * Checks if the given shop is supported.
   *
   * @param shop the shop to be checked for support
   * @return true if the shop is supported, false otherwise
   */
  boolean supportsShop(final Shop shop);

  /**
   * Method to clear all shops from memory, and from the world.
   */
  void clearCache();
}