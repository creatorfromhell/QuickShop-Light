package net.tnemc.api.model.shop.sign;
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

/**
 * SignParser
 *
 * @param <T> Represents the ItemStack object of the implementation.
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface SignParser<T> {

  /**
   * This method returns the identifier associated with a given SignParser implementation.
   *
   * @return The identifier of the SignParser.
   */
  String identifier();

  /**
   * Checks if the given ItemStack item meets certain criteria for this parser to be applicable.
   *
   * @param item The ItemStack item to be checked.
   * @return true if the criteria is met, false otherwise.
   */
  boolean applies(final T item);

  /**
   * Parses a given ItemStack item into a Component for display on a shop sign.
   *
   * @param item The ItemStack item to be parsed into a Component.
   * @return The parsed String representing the given ItemStack item.
   */
  String parse(final T item);
}