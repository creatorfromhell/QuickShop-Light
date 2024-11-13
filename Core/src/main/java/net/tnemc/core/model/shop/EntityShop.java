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
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * EntityShop
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public class EntityShop implements Shop {

  protected final List<HistoryEntry> history = new ArrayList<>();

  protected final UUID identifier;
  protected final UUID entity;
  protected BigDecimal price;

  public EntityShop(final UUID identifier, final  UUID entity) {
    this.identifier = identifier;
    this.entity = entity;
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
   * Retrieves the identifier for the shop.
   *
   * @return a UUID representing the identifier of the shop.
   */
  @Override
  public @NotNull UUID identifier() {

    return identifier;
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