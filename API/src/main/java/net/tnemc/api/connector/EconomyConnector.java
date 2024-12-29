package net.tnemc.api.connector;
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

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;


/**
 * EconomyConnector
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface EconomyConnector {

  /**
   * Formats the given amount in the specified currency.
   *
   * @param amount   The amount to format, not null.
   * @param currency The currency to use for formatting, not null.
   * @return The formatted amount as a string.
   */
  String format(@NotNull BigDecimal amount, @NotNull String currency);

  /**
   * Used to get the holdings of the specified identifier.
   *
   * @param identifier The identifier to get the holdings for.
   * @param world      The world to use for getting the holdings.
   * @param currency   The currency to use for getting the holdings
   *
   * @return The holdings in {@link BigDecimal} format.
   */
  @NotNull
  BigDecimal getHoldings(@NotNull final String identifier, @NotNull final String world, @NotNull final String currency);

  /**
   * Used to check if a specific identifier has an amount of holdings.
   *
   * @param identifier The identifier to check the holdings for.
   * @param world      The world to use for the holdings check.
   * @param currency   The currency to use for the holdings check.
   * @param amount     The {@link BigDecimal} amount that we need to check if the identifier has.
   *
   * @return True if the specified identifier has the holdings, otherwise false.
   */
  boolean hasHoldings(@NotNull final String identifier, @NotNull final String world, @NotNull final String currency, @NotNull final BigDecimal amount);

  /**
   * Used to remove a certain amount of holdings from an identifier.
   *
   * @param identifier The identifier to use for the transaction.
   * @param world      The world to use for the transaction.
   * @param currency   The currency to use for the transaction.
   * @param amount     The amount to remove.
   *
   * @return True if the transactions was successful, otherwise false.
   */
  boolean removeHoldings(@NotNull final String identifier, @NotNull final String world, @NotNull final String currency, @NotNull final BigDecimal amount);

  /**
   * Used to add a certain amount of holdings to an identifier.
   *
   * @param identifier The identifier to use for the transaction.
   * @param world      The world to use for the transaction.
   * @param currency   The currency to use for the transaction.
   * @param amount     The amount to add.
   *
   * @return True if the transactions was successful, otherwise false.
   */
  boolean addHoldings(@NotNull final String identifier, @NotNull final String world, @NotNull final String currency, @NotNull final BigDecimal amount);

  /**
   * Used to set the holdings of the specified identifier.
   *
   * @param identifier The identifier to set the holdings for.
   * @param world      The world to use for setting the holdings.
   * @param currency   The currency to use for setting the holdings
   *
   * @return True if the transactions was successful, otherwise false.
   */
  boolean setHoldings(@NotNull final String identifier, @NotNull final String world, @NotNull final String currency, @NotNull final BigDecimal amount);

  /**
   * Used to create an economy account
   *
   * @param identifier The identifier of the account.
   * @param world      The world to create the account for.
   *
   * @return True if the account was created.
   */
  boolean createAccount(@NotNull final String identifier, @NotNull final String world);

  /**
   * Used to delete an economy account
   *
   * @param identifier The identifier of the account.
   * @param world      The world to delete the account from.
   *
   * @return True if the account was deleted.
   */
  boolean deleteAccount(@NotNull final String identifier, @NotNull final String world);
}