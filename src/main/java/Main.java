package main.java;

public class Main {
    public static void main(String[] args) {

        JsonMessage message = new JsonMessage(" тело");
        // message.prepareMessage();
        //message.prepareMessage(" И раз", " И два");
        //message.prepareMessage(JsonMessage.JSON_NAME_FIELD);
        System.out.println(JsonMessage.JSON_NAME_FIELD);
        xmlMessage message1 = new xmlMessage(" body ");
        //message1.prepareMessage("Первое");
        //message1.prepareMessage("Первое сообщение"," Второе сообщение");
        //MessageConverter messageConverter = new MessageConverter();





    }
}
