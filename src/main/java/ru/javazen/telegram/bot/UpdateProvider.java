package ru.javazen.telegram.bot;

/**
 * It provides updates to the bot.
 */
public interface UpdateProvider {

    /**
     * Registers a bot to receive updates.
     * @param telegramBot the bot, for which to provide updates.
     */
    void addBot(TelegramBot telegramBot);

}
