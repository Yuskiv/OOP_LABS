package ua.lpnuai.oop.pytel109;

import java.io.Serializable;

public class User<T> implements Serializable {

    private User next;

    public User getNext() {
        return this.next;
    }

    public void setNext(User next) {
        this.next = next;
    }

    private int id;
    private String name;
    private String date_s;
    private String date_e;
    private String num;
    private String reason;


    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setName(String s) {
        name =  s;
    }
    public String getName() {
        return name;
    }

    public void setdate_e(String s) {
        date_e =  s;
    }
    public String getdare_e(){
        return  date_e;
    }

    public void setdate_s(String  n) {
        date_s =  n;
    }
    public String getdate_s() {
        return date_s;
    }

    public void setnum(String s) {
        num =  s;
    }
    public String getnum() {
        return num;
    }

    public void setreason(String s) {
        reason =  s;
    }
    public String getreason() {
        return reason;
    }
}