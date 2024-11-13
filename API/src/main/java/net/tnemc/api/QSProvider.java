package net.tnemc.api;
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

/**
 * QSProvider
 *
 * @author creatorfromhell
 * @since 0.0.1.0
 */
public final class QSProvider {

  private static QSAPI instance = null;

  private QSProvider() {

    throw new UnsupportedOperationException("This class cannot be instantiated.");
  }

  /**
   * Retrieves the current instance of QSAPI.
   *
   * @return The current instance of QSAPI.
   *
   * @throws IllegalStateException if QuickShop provider has not been initialized.
   */
  public static @NotNull QSAPI get() {

    final QSAPI instance = QSProvider.instance;
    if(instance == null) {

      throw new IllegalStateException("QuickShop provider has not been initialized.");
    }
    return instance;
  }

  static void register(final QSAPI instance) {

    QSProvider.instance = instance;
  }

  static void unregister() {

    QSProvider.instance = null;
  }
}