/* Telegram_Backup
 * Copyright (C) 2016 Fabian Schlenz
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package de.fabianonline.telegram_backup;

import java.io.File;
import java.util.List;
import java.util.Vector;

public class Utils {
	static Vector<String> getAccounts() {
		Vector<String> accounts = new Vector<String>();
		File folder = new File(Config.FILE_BASE);
		File[] files = folder.listFiles();
		if (files != null) for (File f : files) {
			if (f.isDirectory() && f.getName().startsWith("+")) {
				accounts.add(f.getName());
			}
		}
		return accounts;
	}
}
