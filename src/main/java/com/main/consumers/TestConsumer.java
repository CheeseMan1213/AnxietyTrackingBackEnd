package com.main.consumers;

import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Component;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class TestConsumer {
    @RabbitListener(queues = "hello")
    public void consume1(String data) {
        //A new array list.
        ArrayList<Integer> dataAsIntegers = new ArrayList<>();
        //Separate the data with the delimiter as a comma.
        String[] dataSplit = data.split(",");
        String message = "";

        for(int x = 0; x < dataSplit.length; x = x + 1) {
            dataAsIntegers.add(Integer.parseInt(dataSplit[x]));
        }
        for(int x = 0; x < dataAsIntegers.size(); x = x + 1) {
            message = message + Arrays.toString(Character.toChars(dataAsIntegers.get(x)));
        }
        System.out.println(message.replace("[","").replace("]",""));
    }
}
