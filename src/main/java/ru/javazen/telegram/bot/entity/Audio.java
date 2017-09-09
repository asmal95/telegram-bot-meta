package ru.javazen.telegram.bot.entity;

/**
 * This object represents an audio file
 */
public class Audio {
    /**
     * Unique identifier for this file.
     */
    private String fileId;

    /**
     * Duration of the audio in seconds as defined by sender.
     */
    private Integer duration;

    /**
     * Performer of the audio as defined by sender or by audio tags.
     * <i>Optional.</i>
     */
    private String performer;

    /**
     * Title of the audio as defined by sender or by audio tags.
     * <i>Optional.</i>
     */
    private String title;

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

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "Audio{" +
                "fileId=" + fileId +
                ", duration=" + duration +
                ", mimeType=" + mimeType +
                ", fileSize=" + fileSize +
                ", title=" + title +
                ", performer=" + performer +
                "}";
    }
}
