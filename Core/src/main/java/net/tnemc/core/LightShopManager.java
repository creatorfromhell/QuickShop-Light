package net.tnemc.core;
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
import net.tnemc.api.manager.ShopManager;
import net.tnemc.api.model.location.SerializableLocation;
import net.tnemc.api.model.shop.Shop;
import net.tnemc.api.model.shop.limiter.PriceLimiter;
import net.tnemc.api.model.shop.item.ItemParser;
import net.tnemc.core.model.shop.ContainerShop;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * LightShopManager
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public class LightShopManager implements ShopManager {

  protected final Map<String, ItemParser> parsers = new HashMap<>();
  protected final Map<UUID, Shop> shops = new HashMap<>();

  protected EconomyConnector economyConnector;
  protected PriceLimiter priceLimiter;

  public LightShopManager(final EconomyConnector economyConnector, final PriceLimiter priceLimiter) {
    this.economyConnector = economyConnector;
    this.priceLimiter = priceLimiter;
  }

  /**
   * Retrieves the parsers associated with the ShopManager.
   *
   * @return a Map of String keys to SignParser values representing the parsers.
   */
  @Override
  public Map<String, ItemParser> parsers() {

    return parsers;
  }

  /**
   * Retrieves a map of shops by their unique identifiers.
   *
   * @return a Map with UUID keys and Shop values representing the shops.
   */
  @Override
  public Map<UUID, Shop> shops() {

    return shops;
  }

  /**
   * Retrieves the interface for connecting to the economy system.
   *
   * @return an {@link EconomyConnector} object representing the connection to the economy system.
   */
  @Override
  public EconomyConnector economy() {

    return economyConnector;
  }

  /**
   * Retrieves the price limiter associated with the ShopManager.
   *
   * @return a PriceLimiter object representing the price limiter instance.
   */
  @Override
  public PriceLimiter limiter() {

    return priceLimiter;
  }

  /**
   * Checks if the given shop is supported.
   *
   * @param shop the shop to be checked for support
   *
   * @return true if the shop is supported, false otherwise
   */
  @Override
  public boolean supportsShop(final Shop shop) {

    return true;
  }

  /**
   * Finds a shop based on the given shop identifier.
   *
   * @param shopId the UUID of the shop to find
   *
   * @return an Optional containing the shop if found, empty otherwise
   */
  @Override
  public Optional<Shop> findShop(final @NotNull UUID shopId) {

    return Optional.ofNullable(shops.get(shopId));
  }

  /**
   * Finds a shop at the specified location.
   *
   * @param location the SerializableLocation to search for a shop at
   *
   * @return an Optional containing the found shop if it exists, otherwise empty
   */
  @Override
  public Optional<Shop> findShop(final @NotNull SerializableLocation location) {

    return shops.values().stream()
            .filter(s->s instanceof final ContainerShop containerShop && containerShop.location() != null
                       && containerShop.location().equals(location))
            .findFirst();
  }

  /**
   * Retrieves the list of shops owned by the specified owner.
   *
   * @param owner the UUID of the owner to retrieve shops for, must not be null
   *
   * @return a List of Shop objects representing the shops owned by the specified owner
   */
  @Override
  public List<Shop> getShops(@NotNull final UUID owner) {

    return shops.values().stream()
            .filter(s->s.identifier().equals(owner))
            .collect(Collectors.toList());
  }

  /**
   * Method to clear all shops from memory, and from the world.
   */
  @Override
  public void clearCache() {

    shops.clear();
  }

  /**
   * Creates a new shop with the provided shop details and sign location.
   *
   * @param shop         The shop to be created, must not be null.
   * @param signLocation The location where the shop sign will be placed, can be null.
   *
   * @return True if the shop creation was successful, false otherwise.
   */
  @Override
  public boolean createShop(@NotNull final Shop shop, @Nullable final SerializableLocation signLocation) {

    return false;
  }
}