package main.java;

public class Main {

    public static void main(String[] args) {

        JsonMessage message = new JsonMessage(" тело");
        System.out.println(MessageConverter.convertMessage(message));
        xmlMessage message1 = new xmlMessage(" body ");
        System.out.println(MessageConverter.convertMessage(message1));
    }


}

