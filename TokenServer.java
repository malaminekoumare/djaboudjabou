package TokenRing;

import java.net.*; 

    public class TokenServer {     
        public static void main(String agrs[])throws Exception         {                         

            while(true)             {             
                Server sr=new Server();             
                sr.recPort(8000);             
                sr.recData();             
                }         
            } 
        } 