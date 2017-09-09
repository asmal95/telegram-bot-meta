package ru.javazen.telegram.bot.entity.game;

import ru.javazen.telegram.bot.entity.User;

public class GameHighScore {

    private Integer position;
    private User user;
    private Integer score;

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "GameHighScore{" +
                "position=" + position +
                ", user=" + user +
                ", score=" + score +
                '}';
    }
}
