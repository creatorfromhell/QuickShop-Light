package net.tnemc.api.model.shop;
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

import net.tnemc.api.model.history.HistoryKeeper;
import net.tnemc.item.SerialItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Represents a shop that keeps track of its price and identifier.
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface Shop extends HistoryKeeper {

  /**
   * Retrieves the tags associated with a shop.
   *
   * @return a List of String objects representing the tags of the shop.
   */
  List<String> tags();

  /**
   * Retrieves the functionality information of this object.
   *
   * @return a Map where keys are String descriptions and values are Boolean flags indicating the functionality status.
   */
  Map<String, Boolean> functionality();

  /**
   * Retrieves the identifier for the shop.
   *
   * @return a UUID representing the identifier of the shop.
   */
  @NotNull UUID identifier();

  /**
   * Retrieves the currency used by this shop.
   *
   * @return the currency as a String, or null if no currency is set
   */
  @Nullable String currency();

  /**
   * Sets the currency used by this shop.
   *
   * @param currency the new currency to be set, or null if no currency is to be set
   */
  void setCurrency(@Nullable String currency);

  /**
   * Retrieves the price of the item.
   *
   * @return the price of the item as a BigDecimal.
   */
  @NotNull BigDecimal price();

  /**
   * Sets the price of the item in the shop.
   *
   * @param price the new price of the item
   */
  void setPrice(@NotNull final BigDecimal price);

  /**
   * Retrieves the item associated with the shop as a SerialItem.
   *
   * @return the item associated with the shop as a SerialItem
   */
  SerialItem<?> item();

  /**
   * Sets the item in the shop to the provided item.
   *
   * @param item the SerialItem to be set in the shop
   */
  void setItem(@NotNull final SerialItem<?> item);
}