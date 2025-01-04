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
import net.tnemc.api.model.location.SerializableLocation;
import net.tnemc.api.model.shop.Shop;
import net.tnemc.api.model.shop.limiter.PriceLimiter;
import net.tnemc.api.model.shop.item.ItemParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * ShopManager
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface ShopManager {

  /**
   * Retrieves the parsers associated with the ShopManager.
   *
   * @return a Map of String keys to SignParser values representing the parsers.
   */
  Map<String, ItemParser> parsers();

  /**
   * Retrieves a map of shops by their unique identifiers.
   *
   * @return a Map with UUID keys and Shop values representing the shops.
   */
  Map<UUID, Shop> shops();

  /**
   * Retrieves the interface for connecting to the economy system.
   *
   * @return an {@link EconomyConnector} object representing the connection to the economy system.
   */
  EconomyConnector economy();

  /**
   * Retrieves the price limiter associated with the ShopManager.
   *
   * @return a PriceLimiter object representing the price limiter instance.
   */
  PriceLimiter limiter();

  /**
   * Checks if the given shop is supported.
   *
   * @param shop the shop to be checked for support
   * @return true if the shop is supported, false otherwise
   */
  boolean supportsShop(final Shop shop);

  /**
   * Finds a shop based on the given shop identifier.
   *
   * @param shopId the UUID of the shop to find
   * @return an Optional containing the shop if found, empty otherwise
   */
  Optional<Shop> findShop(@NotNull final UUID shopId);

  /**
   * Finds a shop at the specified location.
   *
   * @param location the SerializableLocation to search for a shop at
   * @return an Optional containing the found shop if it exists, otherwise empty
   */
  Optional<Shop> findShop(@NotNull final SerializableLocation location);

  /**
   * Retrieves the list of shops owned by the specified owner.
   *
   * @param owner the UUID of the owner to retrieve shops for, must not be null
   * @return a List of Shop objects representing the shops owned by the specified owner
   */
  List<Shop> getShops(@NotNull UUID owner);

  /**
   * Method to clear all shops from memory, and from the world.
   */
  void clearCache();

  /**
   * Creates a new shop with the provided shop details and sign location.
   *
   * @param shop The shop to be created, must not be null.
   * @param signLocation The location where the shop sign will be placed, can be null.
   * @return True if the shop creation was successful, false otherwise.
   */
  boolean createShop(@NotNull Shop shop, @Nullable SerializableLocation signLocation);
}