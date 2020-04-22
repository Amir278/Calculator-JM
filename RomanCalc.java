package com.java_mentor;

class RomanCalc extends Calculator{
    private String a,b;
    private String operator;

    RomanCalc(String a,String b, String operator){
        this.a=a;
        this.b=b;
        this.operator=operator;
    }
    @Override
    public Object calculate(){
        ArabCalc calc = new ArabCalc(convertToArab(a),convertToArab(b),operator);
        if(!((int)calc.calculate()==0))return convertToRoman((int)calc.calculate());
        return 0;
    }
    private int convertToArab(String str){
        String temp_str;
        int arab = 0;
        String[] romansymbols = new String[11];
        romansymbols[1]="I";
        romansymbols[5]="V";
        romansymbols[10]="X";
        if(str.equals("IV")){
            arab=4;
        }else if(str.equals("IX")){
            arab=9;
        } else{
            for (int i = 0; i < str.length(); i++) {
                temp_str = str.substring(i, i+1);
                for (int j = 0; j < romansymbols.length; j++) {
                    if(temp_str.equals(romansymbols[j])){
                        arab+=j;
                    }
                }
            }
        }
        return arab;
    }
    private String convertToRoman(int result){
        String[] romansymbols = new String[11];
        romansymbols[1]="I";
        romansymbols[5]="V";
        romansymbols[10]="X";
        String stroka="";
        int[] razbienie = new int[4];
        int index;
        for (int i = 0; i < 4; i++) {
            razbienie[3-i] = (int) (result%Math.pow(10,i+1));
            if (result-razbienie[3-i] == 0){
                razbienie[3-i]=result;
                break;
            } else{
                result=(int) (result-razbienie[3-i]);
            }
        }
        for (int i = 0; i < 4; i++) {
            index =(int) Math.pow(10,3-i);
            if (razbienie[i] !=0){
                if (razbienie[i]/Math.pow(10,3-i)<4){
                    for (int j = (int) (razbienie[i]/Math.pow(10,3-i)); j > 0; j--) {
                        stroka = stroka+romansymbols[index];
                    }
                }
                if(razbienie[i]/Math.pow(10,3-i) == 4){
                    stroka = stroka+romansymbols[index]+romansymbols[index+4*index];
                }
                if(razbienie[i]/Math.pow(10,3-i) == 9){
                    stroka = stroka+romansymbols[index]+romansymbols[10*index];
                }
                if (razbienie[i]/Math.pow(10,3-i) == 5){
                    stroka = stroka+romansymbols[index*5];
                }
                if (razbienie[i]/Math.pow(10,3-i)>5 & razbienie[i]/Math.pow(10,3-i)<9){
                    stroka = stroka+romansymbols[index*5];
                    for (int j = (int) (razbienie[i]/Math.pow(10,3-i)-5); j > 0; j--) {
                        stroka = stroka+romansymbols[index];
                    }
                }
            } else{
                continue;
            }
        }
        return stroka;
    }
}