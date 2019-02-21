package com.codefly.base;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.codefly.dialog.Dialog;
import com.codefly.dialog.model.Message;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Message> messageList=new ArrayList<>();
        Message message=new Message();
        message.setText("sohan");
        messageList.add(message);

        Message message1=new Message();
        message.setText("mohan");
        messageList.add(message1);

        Dialog dialog=new Dialog().new Builder()
                .setHeader("Dialog")
                .setTopBackgroundColor(Color.BLUE)
                // .setHeaderColor(Color.GREEN)
                // .setMessageColor(Color.YELLOW)
                .setMessages(messageList)
                //.setButtonText("Ok")
                //.setButtonColor(Color.YELLOW)
                .build();
        dialog.show(getSupportFragmentManager(),"Dialog");
    }
}
