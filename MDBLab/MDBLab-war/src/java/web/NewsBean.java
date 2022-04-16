/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package web;

import ejb.NewsItem;
import ejb.NewsItemFacadeLocal;
import java.util.List;
import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

/**
 *
 * @author Len
 */
@Named(value = "newsBean")
@RequestScoped
public class NewsBean {
    @Inject
    private NewsItemFacadeLocal facade;
    
    @Inject
    private JMSContext context;
    @Resource(lookup="java:app/jms/NewsQueue")
    private javax.jms.Queue queue;

    private String bodyText;
    private String headingText;
    
    /**
     * Creates a new instance of NewsBean
     */
    public NewsBean() {
    }
    
    void sendNewsItem(String heading, String body) {
    try {
        //ObjectMessage message = context.createObjectMessage();
        TextMessage message2 = context.createTextMessage();
        //NewsItem e = new NewsItem();
        //e.setHeading(heading);
        //e.setBody(body);
        String msg = heading + " | " + body;
        message2.setText(msg);
        //message.setObject(e);
        context.createProducer().send(queue, message2);
    } catch (JMSException ex) {
        ex.printStackTrace();
        }
   }
    
     public List<NewsItem> getNewsItems()
    {
        return facade.getAllNewsItems();
    }

     public String submitNews(){
         sendNewsItem(this.getHeadingText(),this.getBodyText());
         return null;
     }

    /**
     * @return the bodyText
     */
    public String getBodyText() {
        return bodyText;
    }

    /**
     * @return the headingText
     */
    public String getHeadingText() {
        return headingText;
    }

    /**
     * @param bodyText the bodyText to set
     */
    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    /**
     * @param headingText the headingText to set
     */
    public void setHeadingText(String headingText) {
        this.headingText = headingText;
    }

    private TextMessage createTextMessage(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
