package com.test;

public class Book {

    private String bname;
    private String bauthor;

    private Book(String bname, String bauthor){
        this.bname = bname;
        this.bauthor = bauthor;
    }

    /*public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }*/

    public void work(){
        System.out.println(bname);
        System.out.println(bauthor);
    }


}
