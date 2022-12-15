/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SGurjar
 */
import java.util.ArrayList;
public class MessagingService {
    private ArrayList<Message> msgList;
    
    public MessagingService() {
        this.msgList = new ArrayList<>();
    }
    public void add(Message msg) {
        if(msg.getContent().length() <= 280) {
            this.msgList.add(msg);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.msgList;
    }
}
