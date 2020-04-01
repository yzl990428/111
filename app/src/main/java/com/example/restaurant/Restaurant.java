package com.example.restaurant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Serializable {
    private int[] pic;
    private String name;
    private String address;
    private String contact;
    private String type;
    private int rate;
    private String comment;

    public Restaurant(int[] pic, String name, String contact, String type, int rate, String comment, String address) {
        this.pic = pic;
        this.name = name;
        this.contact = contact;
        this.type = type;
        this.rate = rate;
        this.comment = comment;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int[] getPic() {
        return pic;
    }

    public void setPic(int[] pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public static List<Restaurant> getList(){
        List<Restaurant> list = new ArrayList<>();
        list.add(new Restaurant(new int[]{R.drawable.a,R.drawable.a2},"The Grounds of Alexandria","(02) 9699 2225","Cafe",4,"Homestyle food and specialty coffee in a former pie factory with brick walls and an organic garden","1 Notts Avenue Bondi Beach NSW 2026"));
        list.add(new Restaurant(new int[]{R.drawable.b,R.drawable.b2},"The Grounds of Alexandria","(02) 9699 2225","Cafe",4,"Homestyle food and specialty coffee in a former pie factory with brick walls and an organic garden.","7a/2 Huntley St, Alexandria NSW 2015"));
        list.add(new Restaurant(new int[]{R.drawable.c,R.drawable.c2},"Cuppa Flower","(02) 8319 4116","Rosebery",4,"Charming Café shop based in Waterloo. Breakfast, cosy and casual food provided.","1/15 Allen St, Waterloo NSW 2017"));
        list.add(new Restaurant(new int[]{R.drawable.d,R.drawable.d2},"Monkey’s Corner","(02) 9212 2085","casual, cocktail",5,"Best beef tongue with rice in Sydney.","40 Kensington St, Chippendale NSW 200"));
        list.add(new Restaurant(new int[]{R.drawable.e,R.drawable.a2},"Ester Restaurant","(02) 8068 8279","Cosy, Groups",5,"Trendy restaurant executing eclectic dishes in a concrete-walled space with a wood-fired oven.","46-52 Meagher St, Chippendale NSW 2008"));
        list.add(new Restaurant(new int[]{R.drawable.f,R.drawable.f2},"Great Dragon Traditional Hotpot","0451 996 288","Hotpot",5,"Best Chinese hotpot in Sydney"," 20 Goulburn St, Sydney NSW 2000"));
        list.add(new Restaurant(new int[]{R.drawable.g,R.drawable.g2},"Don Don","(02) 9261 0023","Korean",5,"Unfussy Korean eatery specializing in braised pork, handmade noodles, hot pot & BBQ.","1/636-638 George St, Sydney NSW 2000"));
        list.add(new Restaurant(new int[]{R.drawable.h,R.drawable.h2},"Masuya Suisan","(02) 9280 0377","Japanes",5,"Creative dishes, plus sushi and sake, in an eatery with striking light fittings and traditional art","447 Pitt St, Haymarket NSW 2000"));
        list.add(new Restaurant(new int[]{R.drawable.i,R.drawable.i2},"678 Korean BBQ Sydney CBD","(02) 9261 0888","Korean BBQ",5,"Great beef, family friendly, late-night food provided.","Shop 34/1 Dixon St, Sydney NSW 2000"));
        list.add(new Restaurant(new int[]{R.drawable.j,R.drawable.j2},"It’s Time for Thai","Casual Dining, Bar - Pub Food, Modern Australian","Thai",4,"Delicious casual food. Late-night food provided.","767/769 George St, Haymarket NSW 2000"));
        return list;
    }
}
