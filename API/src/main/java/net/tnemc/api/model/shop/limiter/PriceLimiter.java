package net.tnemc.api.model.shop.limiter;
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

import net.tnemc.item.SerialItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * PriceLimiter
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface PriceLimiter {

  /**
   * Checks if the specified price for an item is within the allowed limits based on the user, item, currency, and price provided.
   *
   * @param user the UUID of the user making the price check
   * @param item the SerialItem representing the item to check the price for
   * @param currency the currency in which the price is specified (nullable)
   * @param price the BigDecimal price of the item to be checked
   * @return a PriceLimiterCheckResult object containing information about the price check
   */
  @NotNull PriceLimiterCheckResult check(@NotNull UUID user, @NotNull SerialItem<?> item,
                                         @Nullable String currency, @NotNull BigDecimal price);
}