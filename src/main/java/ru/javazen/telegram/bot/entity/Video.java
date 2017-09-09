package ru.javazen.telegram.bot.entity;

/**
 * This object represents a video file.
 */
public class Video {

    /**
     * Unique identifier for this file.
     */
    private String fileId;

    /**
     * Video width as defined by sender.
     */
    private Integer width;

    /**
     * Video height as defined by sender.
     */
    private Integer height;

    /**
     * Duration of the video in seconds as defined by sender.
     */
    private Integer duration;

    /**
     * Video thumbnail.
     * <i>Optional.</i>
     */
    private PhotoSize thumb;

    /**
     * Mime type of a file as defined by sender.
     * <i>Optional.</i>
     */
    private String mimeType;

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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "Video{" +
                "fileId=" + fileId +
                ", width=" + width +
                ", height=" + height +
                ", duration=" + duration +
                ", thumb=" + thumb +
                ", mimeType=" + mimeType +
                ", fileSize=" + fileSize +
                "}";
    }
}
