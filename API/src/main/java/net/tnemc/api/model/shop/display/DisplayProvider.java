package net.tnemc.api.model.shop.display;
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

import net.tnemc.api.model.shop.Shop;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * DisplayProvider
 *
 * @param <T> The implementation's plugin/mod object.
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface DisplayProvider<T> {

  /**
   * Retrieves the identifier for the implementation.
   *
   * @return a String representing the identifier
   */
  @NotNull String identifier();

  /**
   * Retrieves the provider associated with this DisplayProvider.
   *
   * @return The implementation's plugin/mod object.
   */
  @NotNull T getProvider();

  /**
   * Provides a DisplayItem based on the given Shop.
   *
   * @param shop the Shop object to use for providing the DisplayItem
   * @return the DisplayItem generated based on the provided Shop, or null if unable to provide
   */
  @Nullable DisplayItem provide(@NotNull Shop shop);
}