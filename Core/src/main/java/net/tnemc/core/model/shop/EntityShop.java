package net.tnemc.core.model.shop;
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

import net.tnemc.api.model.history.HistoryEntry;
import net.tnemc.api.model.shop.Shop;
import net.tnemc.item.SerialItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * EntityShop
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public class EntityShop implements Shop {

  protected final Map<String, Boolean> functionality = new HashMap<>();

  protected final List<HistoryEntry> history = new ArrayList<>();
  protected final List<String> tags = new ArrayList<>();

  protected final UUID identifier;
  protected final UUID entity;
  protected BigDecimal price;
  protected String currency;
  protected SerialItem<?> item;

  public EntityShop(final UUID identifier, final  UUID entity, final String currency,
                    final SerialItem<?> item) {
    this.identifier = identifier;
    this.entity = entity;
    this.currency = currency;
    this.item = item;
  }

  /**
   * Retrieves the UUID entity associated with this EntityShop.
   *
   * @return a UUID representing the entity.
   */
  public UUID entity() {

    return entity;
  }

  /**
   * Retrieves the tags associated with a shop.
   *
   * @return a List of String objects representing the tags of the shop.
   */
  @Override
  public List<String> tags() {

    return tags;
  }

  /**
   * Retrieves the functionality information of this object.
   *
   * @return a Map where keys are String descriptions and values are Boolean flags indicating the
   * functionality status.
   */
  @Override
  public Map<String, Boolean> functionality() {

    return functionality;
  }

  /**
   * Retrieves the identifier for the shop.
   *
   * @return a UUID representing the identifier of the shop.
   */
  @Override
  public @NotNull UUID identifier() {

    return identifier;
  }

  /**
   * Retrieves the currency used by this shop.
   *
   * @return the currency as a String, or null if no currency is set
   */
  @Override
  public @Nullable String currency() {

    return currency;
  }

  /**
   * Sets the currency used by this shop.
   *
   * @param currency the new currency to be set, or null if no currency is to be set
   */
  @Override
  public void setCurrency(@Nullable final String currency) {
    this.currency = currency;
  }

  /**
   * Retrieves the price of the item.
   *
   * @return the price of the item as a BigDecimal.
   */
  @Override
  public @NotNull BigDecimal price() {

    return price;
  }

  /**
   * Sets the price of the item in the shop.
   *
   * @param price the new price of the item
   */
  @Override
  public void setPrice(final @NotNull BigDecimal price) {

    this.price = price;
  }

  /**
   * Retrieves the item associated with the shop as a SerialItem.
   *
   * @return the item associated with the shop as a SerialItem
   */
  @Override
  public SerialItem<?> item() {

    return item;
  }

  /**
   * Sets the item in the shop to the provided item.
   *
   * @param item the SerialItem to be set in the shop
   */
  @Override
  public void setItem(final @NotNull SerialItem<?> item) {
    this.item = item;
  }

  /**
   * Retrieves the history entries stored in the HistoryKeeper.
   *
   * @return a List of HistoryEntry objects representing the history entries.
   */
  @Override
  public List<HistoryEntry> getHistory() {

    return history;
  }

  /**
   * Adds a new history entry to the HistoryKeeper.
   *
   * @param entry the history entry to be added
   */
  @Override
  public void addEntry(final @NotNull HistoryEntry entry) {
    history.add(entry);
  }
}