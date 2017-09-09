package ru.javazen.telegram.bot.method.get;

import ru.javazen.telegram.bot.method.ApiMethod;

public class GetMe implements ApiMethod {

    private static final String METHOD = "getMe";

    @Override
    public String getMethod() {
        return METHOD;
    }

}
