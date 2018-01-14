package ru.javazen.telegram.bot;

import ru.javazen.telegram.bot.entity.Update;
import ru.javazen.telegram.bot.handler.Handler;

import java.util.List;

public class ModuleBot extends AbsTelegramBot {


    private List<Handler> handlers;

    public ModuleBot(String name, TelegramService telegramService, String token) {
        super(name, telegramService, token);
    }

    @Override
    public void handleUpdate(Update update) {

        for (Handler handler : handlers){
            if (handler.executeHandler(update, getBotMethodExecutor())) return;
        }
    }

    public List<Handler> getHandlers() {
        return handlers;
    }

    public void setHandlers(List<Handler> handlers) {
        this.handlers = handlers;
    }
}
