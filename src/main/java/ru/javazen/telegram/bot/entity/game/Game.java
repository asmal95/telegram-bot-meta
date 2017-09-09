package ru.javazen.telegram.bot.entity.game;

import ru.javazen.telegram.bot.entity.MessageEntity;
import ru.javazen.telegram.bot.entity.PhotoSize;

import java.util.List;

public class Game {

    private String title;
    private String description;
    private List<PhotoSize> photo;
    private String text;
    private List<MessageEntity> textEntities;
    private Animation animation;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    public void setTextEntities(List<MessageEntity> textEntities) {
        this.textEntities = textEntities;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", photo=" + photo +
                ", text='" + text + '\'' +
                ", textEntities=" + textEntities +
                ", animation=" + animation +
                '}';
    }
}
