package kosta.studycafe;

import java.io.ObjectInputStream;

import kosta.studycafe.Message;
 
public class ServerThread implements Runnable {
 
    ObjectInputStream ois;
 
    public ServerThread(ObjectInputStream ois) {
        this.ois = ois;
    }
 
    @Override
    public void run() {
 
        while (true) {
            try {
                Message m = (Message) ois.readObject();
                System.out.println(m);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
 
    }// run¡æ∑·
}// class≥°