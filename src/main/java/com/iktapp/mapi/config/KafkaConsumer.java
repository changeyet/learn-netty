package com.iktapp.mapi.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Description
 * @Author Zhenya Qian
 * @Date 2020/8/11 19:53
 */
@Component
public class KafkaConsumer
{

//    @KafkaListener(topics = {"aaaa", "CustomerCountry"})
//    public void listen(ConsumerRecord record)
//    {
//        System.out.println(record.topic() );
//        System.out.println("============>");
//    }

    public static void main(String[] args)
    {
        List list = Arrays.asList(1,2,3,4);
        List<Integer> coll = new ArrayList<>();
//        Collections.addAll(coll, 1,2,3,4);
        for (Integer i: coll)
        {
            System.out.println(i);
        }
        Iterator<Integer> it = coll.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
            it.remove();
        }
        System.out.println(coll);
    }

}
