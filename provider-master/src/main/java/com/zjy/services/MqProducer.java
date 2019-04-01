package com.zjy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@Component
public class MqProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Resource(name = "queueTextDestination")
    private Destination destination;//配置文件applicationContext-jms-producer.xml点对点文本信息bean的id

    /**
     * 发送文本消息
     *
     * @param text
     */
    public void sendTextMessage(final String text) {
        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(text);
            }
        });
        System.out.println("生产者发送消息：" + text);
    }
}
