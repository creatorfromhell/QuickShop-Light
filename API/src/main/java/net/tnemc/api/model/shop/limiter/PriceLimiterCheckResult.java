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

import java.math.BigDecimal;

/**
 * PriceLimiterCheck
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface PriceLimiterCheckResult {

  /**
   * Retrieves the maximum price allowed for this item.
   *
   * @return the maximum value as a BigDecimal
   */
  BigDecimal max();

  /**
   * Retrieves the minimum price allowed for this item.
   *
   * @return the minimum value as a BigDecimal
   */
  BigDecimal min();

  /**
   * Retrieves the result of the price limiting operation.
   *
   * @return the result of the price limiting operation as a PriceLimiterResult enum value
   */
  PriceLimiterResult result();

  enum PriceLimiterResult {
    PASS,
    REACHED_PRICE_MAX_LIMIT,
    REACHED_PRICE_MIN_LIMIT,
    PRICE_RESTRICTED,
    NOT_A_WHOLE_NUMBER,
    NOT_VALID
  }
}