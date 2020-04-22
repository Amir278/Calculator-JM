package com.java_mentor;

class ArabCalc extends Calculator{
    private int a,b;
    private String operator;
    ArabCalc(int a,int b, String operator){
        this.a=a;
        this.b=b;
        this.operator=operator;
    }
    @Override
    public Object calculate(){
        if(check()) {
            return 0;
        }
        int result=0;
        if(operator.equals("+")){
            result=super.sum(a, b);
        } else if(operator.equals("-")){
            result=super.subtraction(a, b);
        } else if(operator.equals("/")){
            result=super.divide(a, b);
        } else if(operator.equals("*")){
            result=super.multipl(a, b);
        }
        return result;
    }
    private boolean check(){
        if((a<=10 && a>=1)&&(b<=10 && b>=1)){
            return false;
        } else return true;
    }
}