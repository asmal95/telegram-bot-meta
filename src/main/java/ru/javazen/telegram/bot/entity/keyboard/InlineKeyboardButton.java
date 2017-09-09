package ru.javazen.telegram.bot.entity.keyboard;

public class InlineKeyboardButton {

    /**
     * Label text on the button.
     */
    private String text;

    /**
     * HTTP url to be opened when button is pressed.
     * <i>Optional.</i>
     */
    private String url;

    /**
     * Data to be sent in a callback query to the bot when button is pressed, 1-64 bytes.
     * <i>Optional.</i>
     */
    private String callbackData;

    /**
     * If set, pressing the button will prompt the user to select one of their chats,
     * open that chat and insert the bot's username and the specified inline query in
     * the input field. Can be empty, in which case just the bot's username will be inserted.
     * <i>Optional.</i>
     */
    private String switchInlineQuery;

    /**
     * If set, pressing the button will insert the bot's username and the specified
     * inline query in the current chat's input field. Can be empty, in which case only
     * the bot's username will be inserted.
     * <i>Optional.</i>
     */
    private String switchInlineQueryCurrentChat;

    /**
     * Description of the game that will be launched when the user presses the button.
     * <i>Optional.</i>
     */
    /*private CallbackGame callbackGame;*/

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public String getSwitchInlineQuery() {
        return switchInlineQuery;
    }

    public void setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
    }

    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
    }

    @Override
    public String toString() {
        return "InlineKeyboardButton{" +
                "text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", callbackData='" + callbackData + '\'' +
                ", switchInlineQuery='" + switchInlineQuery + '\'' +
                ", switchInlineQueryCurrentChat='" + switchInlineQueryCurrentChat + '\'' +
                '}';
    }
}
