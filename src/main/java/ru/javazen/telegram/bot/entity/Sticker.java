package ru.javazen.telegram.bot.entity;

/**
 * This object represents a sticker.
 */
public class Sticker {

    /**
     * Unique identifier for this file.
     */
    private String fileId;

    /**
     * Sticker width.
     */
    private Integer width;

    /**
     * Sticker height.
     */
    private Integer height;

    /**
     * Sticker thumbnail in .webp or .jpg format.
     * <i>Optional.</i>
     */
    private PhotoSize thumb;

    /**
     * Emoji associated with the sticker.
     * <i>Optional.</i>
     */
    private String emoji;

    /**
     * File size.
     * <i>Optional.</i>
     */
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "fileId=" + fileId +
                ", width=" + width +
                ", height=" + height +
                ", thumb=" + thumb +
                ", fileSize=" + fileSize +
                ", emoji=" + emoji +
                "}";
    }
}
