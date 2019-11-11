package main.java;

public class JsonMessage extends MessageProcessor {

    public static final String JSON_NAME_FIELD = "JsonMessage";

    public JsonMessage(String body) {
        super(JSON_NAME_FIELD, body);
    }

    public String getName() {
        return JSON_NAME_FIELD;
    }

    @Override
    public void prepareMessage() {
        System.out.println("Message type: " + JSON_NAME_FIELD + super.getBody());
    }

    public void prepareMessage(String Message1) {
        System.out.println("Message Type: " + JSON_NAME_FIELD + super.getBody() + Message1);

    }

    public void prepareMessage(String Message1, String Message2  ){
        System.out.println("Message Type: " + JSON_NAME_FIELD + super.getBody() + Message1 + Message2 );
    }


}
