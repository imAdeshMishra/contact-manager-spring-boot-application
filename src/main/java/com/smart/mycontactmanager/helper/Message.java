package com.smart.mycontactmanager.helper;

public class Message {

    private String content;
    private String type;

    /**
     * @return String return the content
     */
    public String getContent() {
        return content;
    }

    public Message() {
        super();
    }

    public Message(String content, String type) {
        super();
        this.content = content;
        this.type = type;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

}
