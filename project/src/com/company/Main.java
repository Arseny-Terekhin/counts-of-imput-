package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String stroka = sc.nextLine(), space = " ";
        int dlina = stroka.length(), l = 0;
        for (int i = 0; i < dlina; i++) {
            String simvol = stroka.substring(i, i + 1);
            if (simvol.equals(space)) {
                l++;
                continue;
            }
            if (simvol.equals(simvol.toLowerCase())) {
                l++;
            }
            if(simvol.equals(simvol.toUpperCase())){
                int uppreg;
                uppreg = 0;
                l++;
                String proverka = stroka.substring(i + 1, dlina);
                for (int k = 0;k < proverka.length(); k++){
                    String ureg = proverka.substring(k, k + 1);
                    if (ureg.equals(space)){
                        break;
                    }
                    if(ureg.equals(ureg.toUpperCase())){
                        uppreg++;
                    }
                    else{
                        break;
                    }
                }
                if(uppreg > 0){
                    l = l + 2 + uppreg;
                }
                if (uppreg == 0){
                    l++;
                }
                i += uppreg;
            }
        }
        System.out.println(l);
    }
}
