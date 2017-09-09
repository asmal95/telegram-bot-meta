package ru.javazen.telegram.bot.entity;

import java.util.List;

/**
 * This object represent a user's profile pictures.
 */
public class UserProfilePhotos {

    /**
     * Total number of profile pictures the target user has.
     */
    private Integer totalCount;

    /**
     * Requested profile pictures (in up to 4 sizes each).
     */
    private List<List<PhotoSize>> photos;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<List<PhotoSize>> getPhotos() {
        return photos;
    }

    public void setPhotos(List<List<PhotoSize>> photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "UserProfilePhotos{" +
                "totalCount=" + totalCount +
                ", photos=" + photos +
                "}";
    }
}
