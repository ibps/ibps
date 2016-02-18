package com.ibps.utility;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {
	private static String BUNDLE_NAME = null;

	private static Messages messages = null;

	private static ResourceBundle resource = null;;

	private static Locale locale = null;

	public static Messages getInstance(String context) {

		try {

			if (messages == null) {
				messages = new Messages();

				System.out.println("IN GET STRING...");
				// Locale locale = ApplicationInstance.getActive().getLocale();
				BUNDLE_NAME = context + "_Messages";
				System.out.println("NAME OF PROPERTIES FILE........."
						+ BUNDLE_NAME);
				locale = Locale.getDefault();
				System.out.println("LOCALE IS..." + locale);
				System.out.println("Resources........"+resource);
				resource = ResourceBundle.getBundle(BUNDLE_NAME, locale);
				System.out.println("Resources1........"+resource);
			}

		} catch (MissingResourceException e) {

		}
		return messages;

	}

	/**
	 * Returns localized text.
	 * 
	 * @param key
	 *            the key of the text to be returned
	 * @return the appropriate localized text (if the key is not defined, the
	 *         string "!key!" is returned)
	 */
	public static String getString(String key) {
		try {
			// check that getinstance method was called and bundle loaded
			return resource.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	/** Non-instantiable class. */
	private Messages() {
	}

	public static String getBUNDLE_NAME() {
		return BUNDLE_NAME;
	}
}
