package ru.javazen.telegram.bot.entity;

/**
 * This object represents a general file (as opposed to photos, voice messages and audio files).
 */
public class Document {

    /**
     * Unique file identifier.
     */
    private String fileId;

    /**
     * Document thumbnail as defined by sender.
     * <i>Optional.</i>
     */
    private PhotoSize thumb;

    /**
     * Original filename as defined by sender.
     * <i>Optional.</i>
     */
    private String fileName;

    /**
     * MIME type of the file as defined by sender.
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

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
        return "Document{" +
                "fileId=" + fileId +
                ", thumb=" + thumb +
                ", fileName=" + fileName +
                ", mimeType=" + mimeType +
                ", fileSize=" + fileSize +
                "}";
    }
}
