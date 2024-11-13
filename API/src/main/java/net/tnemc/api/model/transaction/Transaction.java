package net.tnemc.api.model.transaction;
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

import java.util.UUID;

/**
 * Interface representing a transaction that can be performed, voided, and completed.
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public interface Transaction {

  /**
   * Generate a unique identifier for the transaction.
   *
   * @return a UUID object representing the identifier for the transaction.
   */
  UUID identifier();

  /**
   * Get the type of the transaction.
   *
   * @return the type of the transaction as a string.
   */
  String type();

  /**
   * Get the player UUID associated with this transaction.
   *
   * @return the player UUID as a UUID object.
   */
  UUID player();

  /**
   * Get the amount associated with this transaction.
   *
   * @return the amount as an integer value.
   */
  int amount();

  /**
   * Check if the transaction has been voided.
   *
   * @return true if the transaction has been voided, false otherwise.
   */
  boolean voided();

  /**
   * Void the transaction, cancelling its effect.
   *
   * @return true if the transaction has been successfully voided, false otherwise.
   */
  boolean voidTransaction();

  /**
   * Perform the transaction operation.
   *
   * @return true if the transaction operation is successful, false otherwise.
   */
  boolean perform();

  /**
   * Check if the transaction has been completed.
   *
   * @return true if the transaction has been completed, false otherwise.
   */
  boolean completed();
}