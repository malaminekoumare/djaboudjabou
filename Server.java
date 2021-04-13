package TokenRing;
import java.net.*;

class Server {         
        boolean hastoken=false;     
        boolean sendData=false;     
        int recport;         

        void recPort(int recport)     {         
            this.recport=recport;     
            }     

        void recData()throws Exception     {         
            byte buff[]=new byte[256];         
            DatagramSocket ds;         
            DatagramPacket dp;         
            String str;                 
            ds=new DatagramSocket(recport);         
            dp=new DatagramPacket(buff,buff.length);         
            ds.receive(dp);         
            ds.close();                 
            str=new String(dp.getData(),0,dp.getLength());         
            System.out.println("The message is "+str);     
            } 
    }