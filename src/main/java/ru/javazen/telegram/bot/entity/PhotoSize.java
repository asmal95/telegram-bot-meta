package ru.javazen.telegram.bot.entity;

/**
 * This object represents one size of a photo or a file / sticker thumbnail.
 */
public class PhotoSize {

    /**
     * Unique identifier for this file.
     */
    private String fileId;

    /**
     * Photo width.
     */
    private Integer width;

    /**
     * Photo height.
     */
    private Integer height;

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

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "PhotoSize{" +
                "fileId=" + fileId +
                ", width=" + width +
                ", height=" + height +
                ", fileSize=" + fileSize +
                "}";
    }
}
