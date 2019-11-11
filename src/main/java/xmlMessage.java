package main.java;

public class xmlMessage extends MessageProcessor {

    public static final String XML_NAME_FIELD = "xmlMessage";


    public xmlMessage(String body) {
        super(XML_NAME_FIELD, body);
    }

    public String getName() {
        return XML_NAME_FIELD;
    }


    @Override
    public void prepareMessage() {
        System.out.println("Message type: " + XML_NAME_FIELD + super.getBody());
    }

    public void prepareMessage(String message1) {
        System.out.println("Message Type: " + XML_NAME_FIELD + super.getBody() + message1);
    }

    public void prepareMessage(String message1, String message2) {
        System.out.println("Message Type: " + XML_NAME_FIELD + super.getBody() + message1 + message2);
    }
}
