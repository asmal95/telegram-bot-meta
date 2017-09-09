package ru.javazen.telegram.bot;

public abstract class AbsTelegramBot implements TelegramBot {

    protected String name;
    protected TelegramService telegramService;
    protected String token;
    protected BotMethodExecutor executor;

    public AbsTelegramBot(String name, TelegramService telegramService, String token) {
        this.name = name;
        this.telegramService = telegramService;
        this.token = token;
        executor = new BotMethodExecutor(telegramService, token);
    }

    @Override
    public BotMethodExecutor getBotMethodExecutor() {
        return executor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getToken() {
        return token;
    }
}