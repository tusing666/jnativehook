/* Copyright (c) 2007-2010 - Alex Barker (alex@1stleg.com)
 * 
 * JNativeHook is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jnativehook;

// TODO: Auto-generated Javadoc
/**
 * The Class NativeHookException.
 */
public class NativeHookException extends RuntimeException {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6199753732102764333L;

	/**
	 * Instantiates a new native hook exception.
	 */
	public NativeHookException() {
		super();
	}
	
	/**
	 * Instantiates a new native hook exception.
	 *
	 * @param sMessage the s message
	 */
	public NativeHookException(String sMessage) {
		super(sMessage);
	}
	
	/**
	 * Instantiates a new native hook exception.
	 *
	 * @param sMessage the s message
	 * @param objThrowable the obj throwable
	 */
	public NativeHookException(String sMessage, Throwable objThrowable) {
		super(sMessage, objThrowable);
	}
	
	/**
	 * Instantiates a new native hook exception.
	 *
	 * @param objThrowable the obj throwable
	 */
	public NativeHookException(Throwable objThrowable) {
		super(objThrowable);
	}
}
