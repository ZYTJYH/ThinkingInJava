package com.zytjyh.seven.six;


import static net.mindview.util.Print.print;

class Villian{
    private String name;
    protected void set(String nm){name=nm;}
    public Villian(String name){this.name=name;}
    public String toString(){
        return "I'm a Villain and my name is "+name;
    }
}
public class Orc extends Villian {
    private int orcNumber;
    public Orc(String name,int orcNumber){
        super(name);
        this.orcNumber=orcNumber;
    }
    public void changes(String name,int orcNumber){
        set(name);
        this.orcNumber=orcNumber;
    }
    public String toString(){
        return "Orc "+orcNumber+": "+super.toString();
    }
    public static void main(String[] args){
        Orc orc=new Orc("Limburger",12);
        print(orc);
        orc.changes("Bob",19);
        print(orc);
    }
}
