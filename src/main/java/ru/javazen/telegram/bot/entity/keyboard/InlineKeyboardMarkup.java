package ru.javazen.telegram.bot.entity.keyboard;

import java.util.List;

/**
 * This object represents an inline keyboard that appears right next to the message it belongs to.
 */
public class InlineKeyboardMarkup {

    /**
     * Array of button rows, each represented by an Array of InlineKeyboardButton objects.
     */
    private List<List<InlineKeyboardButton>> inlineKeyboard;

}
