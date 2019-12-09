package main.java;

import static main.java.JsonMessage.JSON_NAME_FIELD;


public class MessageConverter {

    public static MessageProcessor convertMessage(MessageProcessor message) {
        if (message.getName().equals(JSON_NAME_FIELD)) {
            return new xmlMessage(message.getBody());
        } else {
            return new JsonMessage(message.getBody());
        }

    }

}
