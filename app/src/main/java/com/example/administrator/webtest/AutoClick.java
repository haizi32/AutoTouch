package com.example.administrator.webtest;

public class AutoClick {
    public void autoClickXY(final double x1, final double y1, final double x2, final double y2){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(200);
                }catch (Exception e){
                    e.printStackTrace();
                }
                String[] order = {"input", "swipe", "" + x1, "" + y1, "" + x2, "" + y2};
                try{
                    new ProcessBuilder(order).start();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
