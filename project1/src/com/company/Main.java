package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("请查看棋盘：");
    int a;
        for(a=1;a<=9;a++){
        if (a == 3 || a == 6 || a == 9)
            System.out.print(a + "\n");
        else
            System.out.print(a + " ");
    }
        System.out.println("请输入第一步棋的位置：");
    Scanner input = new Scanner(System.in);
    int b = input.nextInt();
    int c = input.nextInt();
        if(b==c){
        System.out.println("输入错误，请后手方重新输入:");
        int d = input.nextInt();
        c = d;
    }
        System.out.println("请输入第二步棋的位置:");
    int e = input.nextInt();
    int f = input.nextInt();
        if(e==c){
        System.out.println("请先手方重新输入:");
        int i = input.nextInt();
        e = i;
    }
        if(f==b){
        System.out.println("请后手方重新输入:");
        int j = input.nextInt();
        f = j;
    }
        System.out.println("请输入第三步棋的位置:");
    int g = input.nextInt();
    int h = input.nextInt();
        if(g==c||g==f){
        System.out.println("请先手方重新输入:");
        int k = input.nextInt();
        g = k;
    }
        if(h==b||h==e){
        System.out.println("请后手方重新输入:");
        int l = input.nextInt();
        h = l;
    }
        if(b*e*g==6||b*e*g==120||b*e*g==504||b*e*g==28||b*e*g==80||b*e*g==162||b*e*g==45||b*e*g==105)

    {
        if (c * f * h == 6 || c * f * h == 120 || c * f * h == 504 || c * f * h == 28 || c * f * h == 80 || c * f * h == 162 || c * f * h == 45 || c * f * h == 105)
            System.out.println("你们都是获胜者，本轮平局");
        else
            System.out.println("先手方获胜");
    }
        if(c*f*h==6||c*f*h==120||c*f*h==504||c*f*h==28||c*f*h==80||c*f*h==162||c*f*h==45||c*f*h==105)

    {
        if (b * e * g != 6 && b * e * g != 120 && b * e * g != 504 && b * e * g != 28 && b * e * g != 80 && b * e * g != 162 && b * e * g != 45 && b * e * g != 105)
            System.out.println("另一方获胜");
    }
        if(b*e*g!=6&&b*e*g!=120&&b*e*g!=504&&b*e*g!=28&&b*e*g!=80&&b*e*g!=162&&b*e*g!=45&&b*e*g!=105)

    {
        if (c * f * h != 6 && c * f * h != 120 && c * f * h != 504 && c * f * h != 28 && c * f * h != 80 && c * f * h != 162 && c * f * h != 45 && c * f * h != 105)
            System.out.println("平局");
    }
}
}







