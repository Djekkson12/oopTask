package main.java;


public abstract class MessageProcessor implements Message {

    private String name;
    private String body;

    public MessageProcessor(String name, String body) {
        this.name = name;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }
}