package ru.javazen.telegram.bot.method.get;

import ru.javazen.telegram.bot.method.ApiMethod;

public class GetFile implements ApiMethod {

    private static final String METHOD = "getFile";

    private String fileId;

    @Override
    public String getMethod() {
        return METHOD;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "GetFile{" +
                "fileId='" + fileId + '\'' +
                '}';
    }
}
