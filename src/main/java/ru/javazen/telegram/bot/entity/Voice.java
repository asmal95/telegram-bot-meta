package ru.javazen.telegram.bot.entity;

/**
 * This object represents a voice note.
 */
public class Voice {

    /**
     * Unique identifier for this file.
     */
    private String fileId;

    /**
     * Duration of the audio in seconds as defined by sender.
     */
    private Integer duration;

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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
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
        return "Voice{" +
                "fileId=" + fileId +
                ", duration=" + duration +
                ", mimeType=" + mimeType +
                ", fileSize=" + fileSize +
                "}";
    }
}
