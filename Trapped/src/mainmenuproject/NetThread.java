package mainmenuproject;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class NetThread extends Thread
{
    JFrame f;
    String IP;
    int port;
    Action acc;
    public static boolean internet=false;
    static int isWrong=0;
    NetThread(JFrame f, String IP, int port, Action acc)
    {
        this.f=f;
        this.IP=IP;
        this.port=port;
        this.acc=acc;
    }
    @Override
    public void run()
    {
        ClientCheckThread cct = new ClientCheckThread(f, acc, IP, port);
        ServerCheckThread sct = new ServerCheckThread(f, acc, IP, port);
       
        cct.start();
        sct.start();
        
    }
    class gameThread extends Thread
    {
        JFrame f;
        public Action acc;
        gameThread(JFrame f)
        {
            this.f=f;
        }
        @Override
        public void run()
        {
            acc = new Action(f);
            sendAction();
        }
        public Action sendAction()
        {
            return acc;
        }
    }
    class ClientCheckThread extends Thread
    {
        JFrame f;
        Action acc;
        String IP;
        int port;
        ClientCheckThread(JFrame f, Action acc, String IP, int port)
        {
            this.f=f;
            this.acc=acc;
            this.IP=IP;
            this.port=port;
        }
        @Override
        public void run()
        {
                ServerSocket ss;
                Socket s;
                DataInputStream din;
                DataOutputStream dout;
                System.out.println("Server Start.....");
                try
                {
                    ss=new ServerSocket(port);
                    s=ss.accept();
                    System.out.println("Client Connected.....");
                    internet=true;
                    isWrong=1;
                    din = new DataInputStream(s.getInputStream());
                    dout = new DataOutputStream(s.getOutputStream());
                    boolean hasEnded=false;
                    String state, otherState;
                    do
                    {
                        otherState=din.readUTF();
                        dout.flush();
                        hasEnded=Action.hasEnded;
                        state=""+hasEnded;
                        dout.writeUTF(state);
                        dout.flush();
                        state="true";
                        otherState="false";
                    }
                    while(!state.equals("true") || !otherState.equals("true"));
                    if(state.equals("true"))
                    {
                        GameEnd ge = new GameEnd(f);
                    }
                    else if(otherState.equals("true"))
                    {
                        GameEnd ge = new GameEnd(f, "a");
                    }
                }
                catch(IOException e)
                {
                    System.out.println(e);
                }
        }
    }
    class ServerCheckThread extends Thread
    {
        JFrame f;
        Action acc;
        String IP;
        int port;
        ServerCheckThread(JFrame f, Action acc, String IP, int port)
        {
            this.f=f;
            this.acc=acc;
            this.IP=IP;
            this.port=port;
        }
        @Override
        public void run()
        {
            
                System.out.println("Server Start.....");
                try
                {
                    Socket s = new Socket(IP, port);
                    System.out.println("Client Connected.....");
                    internet=true;
                    isWrong=1;
                    DataInputStream din = new DataInputStream(s.getInputStream());
                    DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                    boolean hasEnded=false;
                    String state, otherState;
//                    gameThread gt = new gameThread(f);
//                    gt.start();
                    do
                    {
                        hasEnded=Action.hasEnded;
                        state=""+hasEnded;
                        dout.writeUTF(state);
                        dout.flush();
                        otherState=din.readUTF();
                        dout.flush();
                        //System.out.println(state+" "+otherState+" "+Action.hasEnded);
                        if(hasEnded)
                        {
                            Action.hasEnded = hasEnded;
                        }
                        else if(otherState.equals("true"))
                        {
                            Action.hasEnded = true;
                        }
                        
                    }
                    while(!state.equals("true") || !otherState.equals("true"));
                    if(state.equals("true"))
                    {
                        
                        GameEnd ge = new GameEnd(f);
                    }
                    else if(otherState.equals("true"))
                    {
                        GameEnd ge = new GameEnd(f, "a");
                    }
                }
                catch(IOException e)
                {
                    System.out.println(e);
                }
        }
    }
}
