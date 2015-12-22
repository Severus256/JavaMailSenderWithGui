/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendmailgui;

import java.util.Properties;

/**
 *
 * @author Aga
 */
public class Mailer {
   
   private String host;
   private String login;
   private String password;
   private String port;
   private String method;
   private Properties props;
   private boolean isAuth = true;
   private boolean isTlsEnable = true;
   
   
    
    public Mailer() {
        
    }
    
    public Mailer(boolean isDef) {
        method = "TLS";
        host = "smtp.gmail.com";
        login = "severus256@gmail.com";
        password = "vfnhbwf1";
        port = "587";
        props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("smtp.port","587");
    }
    
    public void Auth() {
        
    }
    public Properties getProps() {
        return props;
    }
    public String getLogin() {
        return login;
    }
    
    public String getPassword() {
        return password;
    }
    
   
    
}
