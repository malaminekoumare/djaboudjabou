package TokenRing;

import java.io.*; 
import java.net.*; 
    public class TokenClient1 {     
        public static void main(String arg[]) throws Exception         {             
            InetAddress lclhost;             
            BufferedReader br;             
            String str="";             
            TokenClient12 tkcl,tkser;             
            //boolean hasToken;             
            //boolean setSendData;                         

            while(true)             {             
                lclhost=InetAddress.getLocalHost();             
                tkcl = new TokenClient12(lclhost);             
                tkser = new TokenClient12(lclhost);                    
                //tkcl.setSendPort(9001);             
                tkcl.setSendPort(9004);             
                tkcl.setRecPort(8002);             
                lclhost=InetAddress.getLocalHost();             
                tkser.setSendPort(9000);             

                if(tkcl.hasToken == true)             {                 
                    System.out.println("Do you want to enter the Data --> YES/NO");                 
                    br=new BufferedReader(new InputStreamReader(System.in));                 
                    str=br.readLine();                 
                    if(str.equalsIgnoreCase("yes"))                 {                       
                        System.out.println("ready to send");                     
                        tkser.setSendData = true;                     
                        tkser.sendData();                     
                        tkser.setSendData = false;                 
                        }                 
                    else if(str.equalsIgnoreCase("no"))                 {                     
                        System.out.println("i m in else");                     
                        //tkcl.hasToken=false;                     
                        tkcl.sendData();                     
                        tkcl.recData();                 
                        System.out.println("i m leaving else");                 
                        }             
                    }             
                else             {             
                    System.out.println("ENTERING RECEIVING MODE...");                 
                    tkcl.recData();             
                    }     
                } 
            } 
        }                   