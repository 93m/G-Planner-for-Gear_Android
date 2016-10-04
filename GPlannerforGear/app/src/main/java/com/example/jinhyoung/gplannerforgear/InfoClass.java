package com.example.jinhyoung.gplannerforgear;


/**
 * Created by JinHyoung on 2016-10-03.
 */

public class InfoClass {

    public int _id;
    public String year;
    public String day;
    public String title;
    public String time;

    //생성자
    public InfoClass(){}

    /**
     * 실질적으로 값을 입력할 때 사용되는 생성자(getter and setter)
     * @param _id       테이블 아이디
     * @param year      년
     * @param day       일
     * @param title    제목
     * @param time     시간
     */

    public InfoClass(int _id, String year, String month, String day, String time, String title) {
        this._id = _id;
        this.year = year;
        this.day = day;
        this.time = time;
        this.title = title;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getYear(){
        return year;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getDay(){
        return day;
    }

    public void setDay(String day){
        this.day = day;
    }


}

