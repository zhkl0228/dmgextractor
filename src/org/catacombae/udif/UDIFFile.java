/*-
 * Copyright (C) 2006 Erik Larsson
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catacombae.udif;

import org.catacombae.io.ReadableRandomAccessStream;

public class UDIFFile {
    private ReadableRandomAccessStream stream;
    private UDIFFileView dmgView;
    
    public UDIFFile(ReadableRandomAccessStream stream) {
	this.stream = stream;
	this.dmgView = new UDIFFileView(stream);
    }
    
    public UDIFFileView getView() {
	return dmgView;
    }
    
    public ReadableRandomAccessStream getStream() {
	return stream;
    }
}
