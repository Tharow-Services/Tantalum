/*
 * ATLauncher - https://github.com/ATLauncher/ATLauncher
 * Copyright (C) 2013-2022 ATLauncher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.atlauncher.network;

import java.util.ArrayList;
import java.util.List;

import com.atlauncher.constants.Constants;
import com.atlauncher.data.minecraft.loaders.LoaderVersion;
import com.atlauncher.utils.Utils;

public final class ErrorReporting {
    public static List<String> sentEvents = new ArrayList<>();
    public static List<String> ignoredMessages = new ArrayList<>();
    public static boolean initialised = false;

    public static void initialise() {}

    public static void enable() {

    }

    public static void setUserId(String userId) {

    }

    private static String getEnvironmentName() {
        if (Utils.isDevelopment()) {
            return "development";
        }

        if (!Constants.VERSION.isReleaseStream()) {
            return "staging";
        }

        return "production";
    }

    public static void disable() {

    }

    public static void recordNetworkRequest(String url, String method, int statusCode, String timeTaken) {

    }

    public static void recordPackInstall(String packName, String packVersion, LoaderVersion loader) {

    }

    public static void recordInstancePlay(String packName, String packVersion, LoaderVersion loader, int instanceVersion) {}

    public static void captureException(Throwable t) {}
}
