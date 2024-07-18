package com.chatroomserver.chatroonbackend.model;

//import lombok.*;



public class Message {
    private String senderName;

    private String receiverName;

    private String message;

    private String media;

    private Status status;
    private String mediaType;

    public Message() {
    }

    public Message(String senderName, String receiverName, String message, String media, Status status, String mediaType) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.message = message;
        this.media = media;
        this.status = status;
        this.mediaType = mediaType;
    }

    @Override
    public String toString() {
        return "Message{" +
                "senderName='" + senderName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", message='" + message + '\'' +
                ", media='" + media + '\'' +
                ", status=" + status +
                ", mediaType='" + mediaType + '\'' +
                '}';
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }
}