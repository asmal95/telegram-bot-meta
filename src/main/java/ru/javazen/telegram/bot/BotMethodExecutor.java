package ru.javazen.telegram.bot;

import ru.javazen.telegram.bot.method.ApiMethod;

public class BotMethodExecutor {
    private TelegramService telegramService;
    private String token;

    public BotMethodExecutor(TelegramService telegramService, String token) {
        this.telegramService = telegramService;
        this.token = token;
    }

    public <T> T execute(ApiMethod apiMethod, Class<T> clazz) {
        return telegramService.executeMethod(apiMethod, token, clazz);
    }

    public void execute(ApiMethod apiMethod) {
        telegramService.executeMethod(apiMethod, token);
    }
}
