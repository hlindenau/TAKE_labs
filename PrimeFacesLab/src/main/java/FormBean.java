/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Len
 */
@Named(value = "formBean")
@RequestScoped
public class FormBean {

    private int value_1;
    private int value_2;
    private int sum_result;
    private Date date;
    private String date_string;
    /**
     * Creates a new instance of FormBean
     * @return 
     */
    
    public void calculate_sum(){
        FacesContext context = FacesContext.getCurrentInstance();
        context.renderResponse();
        setSum_result(getValue_1() + getValue_2());
        FacesContext.getCurrentInstance().addMessage(null, 
            new FacesMessage(
                    String.format("%d + %d = %d", value_1, value_2, sum_result)
            ));
    }
    
    public FormBean() {
        this.date = new Date();
    }

    /**
     * @return the value_1
     */
    public int getValue_1() {
        return value_1;
    }

    /**
     * @param value_1 the value_1 to set
     */
    public void setValue_1(int value_1) {
        this.value_1 = value_1;
    }

    /**
     * @return the value_2
     */
    public int getValue_2() {
        return value_2;
    }

    /**
     * @param value_2 the value_2 to set
     */
    public void setValue_2(int value_2) {
        this.value_2 = value_2;
    }

    /**
     * @return the sum_result
     */
    public int getSum_result() {
        return sum_result;
    }

    /**
     * @param sum_result the sum_result to set
     */
    public void setSum_result(int sum_result) {
        this.sum_result = sum_result;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the date_string
     */
    public String getDate_string() {
        return date_string;
    }

    /**
     * @param date_string the date_string to set
     */
    public void setDate_string(String date_string) {
        this.date_string = date_string;
    }
    
}
