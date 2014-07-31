package org.kndl.warden.domain;

public class Status {
    private int code;
    private String message;

    public Status(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
