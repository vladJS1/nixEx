package com.example.schedule;

import com.example.ServiceCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.TimerTask;

public class CustomTask extends TimerTask {

    public  CustomTask(){

    }


    public void run(){
        try{
            new ServiceCommand("go","оплата интернета"){
                @Override
                public void execute(AbsSender absSender, User user, Chat chat, String[] arguments) {
                    SendMessage message = new SendMessage();
                    message.enableMarkdown(true);
                    message.setChatId(chat.getLinkedChatId().toString());
                    message.setText("It works");
                    try {
                        absSender.execute(message);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
            };

        }catch(Exception ex){
            System.out.println("Error running thread" + ex.getMessage());
        }
    }

}
