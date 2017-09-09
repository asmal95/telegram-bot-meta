package ru.javazen.telegram.bot.entity;

/**
 * This object represents a file ready to be downloaded.
 * The file can be downloaded via the link https://api.telegram.org/file/bot<token>/<file_path>.
 * It is guaranteed that the link will be valid for at least 1 hour. When the link expires, a new one can be requested by calling getFile.
 */
public class File {

    /**
     * Unique identifier for this file.
     */
    private String fileId;

    /**
     * File size, if known.
     * <i>Optional.</i>
     */
    private Integer fileSize;

    /**
     * File path. Use https://api.telegram.org/file/bot<token>/<file_path> to get the file.
     * <i>Optional.</i>
     */
    private String filePath;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileId=" + fileId +
                ", fileSize=" + fileSize +
                ", filePath=" + filePath +
                "}";
    }
}
