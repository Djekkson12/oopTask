package main.java;
import static main.java.JsonMessage.JSON_NAME_FIELD;

// import static oopTask.xmlMessage.XML_NAME_FIELD;

public class MessageConverter {

    public MessageProcessor convertMessage(MessageProcessor message) {
        if (message.getName().equals(JSON_NAME_FIELD)) {
            return new xmlMessage(message.getBody());
        } else //(message.getName().equals(XML_NAME_FIELD))
        {
            return new JsonMessage(message.getBody());
        }

    }

}
