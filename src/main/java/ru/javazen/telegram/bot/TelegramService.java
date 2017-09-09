package ru.javazen.telegram.bot;

import ru.javazen.telegram.bot.method.ApiMethod;

/**
 * Works with API methods of Telegram.
 */
public interface TelegramService {

    /**
     * Execute Telegram method.
     * @param apiMethod method to be executed
     * @param token bot token
     * @param clazz Class of type that you want to receive
     * @param <T> Type that you want to receive
     * @return the response from the Telegram
     */
    <T> T executeMethod(ApiMethod apiMethod, String token, Class<T> clazz);
}
