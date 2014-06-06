package com.otabi.firestar.moolib;

public class TextUtils {

	/**
	 * Changes ChatColor into Terminal/Console color
	 * 
	 * @param chat
	 *            The chat message
	 * @return The output terminal message
	 */
	public static String chatToConsole(String chat) {
		chat = chat.replaceAll("\u00A70", "\033[0;30;40m");
		chat = chat.replaceAll("\u00A71", "\033[0;34;40m");
		chat = chat.replaceAll("\u00A72", "\033[0;32;40m");
		chat = chat.replaceAll("\u00A73", "\033[0;36;40m");
		chat = chat.replaceAll("\u00A74", "\033[0;31;40m");
		chat = chat.replaceAll("\u00A75", "\033[0;35;40m");
		chat = chat.replaceAll("\u00A76", "\033[0;33;40m");
		chat = chat.replaceAll("\u00A77", "\033[0;37;40m");
		chat = chat.replaceAll("\u00A78", "\033[1;30;40m");
		chat = chat.replaceAll("\u00A79", "\033[1;34;40m");
		chat = chat.replaceAll("\u00A7a", "\033[1;32;40m");
		chat = chat.replaceAll("\u00A7b", "\033[1;36;40m");
		chat = chat.replaceAll("\u00A7c", "\033[1;31;40m");
		chat = chat.replaceAll("\u00A7d", "\033[1;35;40m");
		chat = chat.replaceAll("\u00A7e", "\033[1;33;40m");
		chat = chat.replaceAll("\u00A7f", "\033[0;0;0m");
		return chat;
	}

	public static String toString(Object obj) {
		String string = "[" + obj.getClass().getCanonicalName() + "]: "
				+ obj.getClass().toString();
		return string;
	}

}
