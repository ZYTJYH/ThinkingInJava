package com.zytjyh.five.five;

class Tank{
    private String state="empty";
    Tank(String state){
        this.state=state;
    }

    public void change(){
        this.state="empty";
    }
    @Override
    protected void finalize() {
        if(state.equals("full")){
            System.out.println("Error");
        }
    }
}
public class HomeWork12 {
    public static void main(String[] args){
        new Tank("full");
//        Tank tank2=new Tank("full");
//        tank1.change();
        System.gc();
        System.runFinalization();
    }

}
