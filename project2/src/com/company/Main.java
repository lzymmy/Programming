package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main<number> {
    public static char[][] map1 = new char[13][13];
    public static char[][] map2 = new char[13][13];
    public static char[][] map3 = new char[13][13];
    public static char[][] map4 = new char[13][13];
    public static char[][] map5 = new char[13][13];
    public static char[][] Z = map1;
    public static int life = 1000;
    public static int attack = 10;
    public static int defense = 10;
    public static int money = 0;
    public static int yellowKey = 0;
    public static int blueKey = 0;
    public static int redKey = 0;
    public static int x = 10;
    public static int y = 6;
    public static int number = 1;
    public static ArrayList steps = new ArrayList();
    public static ArrayList X = new ArrayList();
    public static ArrayList Y = new ArrayList();
    public static ArrayList Life = new ArrayList();
    public static ArrayList Attack = new ArrayList();
    public static ArrayList Defense = new ArrayList();
    public static ArrayList BlueKey = new ArrayList();
    public static ArrayList RedKey = new ArrayList();
    public static ArrayList YellowKey = new ArrayList();
    public static ArrayList Money = new ArrayList();
    public static int times = 0;

    public static void main(String[] args) throws FileNotFoundException {
        //读取初始地图
        int f;
        int a;
        Scanner A = new Scanner(new File("map/0.txt"));
        final char[][] map6 = new char[13][13];
        for (a = 0; a < 13; a++) {
            String map1Line = A.nextLine();
            for (f = 0; f < 13; f++) {
                map1[a][f] = map1Line.charAt(f);
                map6[a][f] = map1Line.charAt(f);
            }
        }
        Scanner B = new Scanner(new File("map/1.txt"));
        int b;
        int z;
        final char[][] map7 = new char[13][13];
        for (b = 0; b < 13; b++) {
            String map2Line = B.nextLine();
            for (z = 0; z < 13; z++) {
                map2[b][z] = map2Line.charAt(z);
                map7[b][z] = map2Line.charAt(z);
            }
        }
        Scanner C = new Scanner(new File("map/2.txt"));
        int c;
        int o;
        final char[][] map8 = new char[13][13];
        for (c = 0; c < 13; c++) {
            String map3Line = C.nextLine();
            for (o = 0; o < 13; o++) {
                map3[c][o] = map3Line.charAt(o);
                map8[c][o] = map3Line.charAt(o);
            }
        }
        Scanner D = new Scanner(new File("map/3.txt"));
        int d;
        int p;
        final char[][] map9 = new char[13][13];
        for (d = 0; d < 13; d++) {
            String map4Line = D.nextLine();
            for (p = 0; p < 13; p++) {
                map4[d][p] = map4Line.charAt(p);
                map9[d][p] = map4Line.charAt(p);
            }
        }
        Scanner E = new Scanner(new File("map/4.txt"));
        int e;
        int q;
        final char[][] map10 = new char[13][13];
        for (e = 0; e < 13; e++) {
            String map5Line = E.nextLine();
            for (q = 0; q < 13; q++) {
                map5[e][q] = map5Line.charAt(q);
                map10[e][q] = map5Line.charAt(q);
            }
        }
        start();//开始游戏
        Z[10][6] = 'Z';
        System.out.println("您当前所在楼层为：" + " " + number);
        printMap(Z);
        System.out.println("玩家目前生命值为" + life + "," + "攻击力为" + attack + "," + "防御力为" + defense + "," + "金钱数为" + money + "," + "红钥匙数为" + redKey + "," + "黄钥匙数为" + yellowKey + "," + "蓝钥匙数为" + blueKey);
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入指令:");
            String s = input.nextLine();
            steps.add(s);
            if (s.equals("a") || s.equals("w") || s.equals("d") || s.equals("s")) {
                times = times + 1;
            }
            if (s.equals("f")) {
                System.out.println("怪物名称" + "\u3000" + "怪物简称" + "\u3000" + "输出颜色" + "\u3000" + "攻击力" + "\u3000" + "防御力" + "\u3000" + "金钱" + "\u3000" + "损血");
                System.out.println("绿史莱姆" + "\u3000" + "绿" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "绿" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "\uff15" + "\uff10" + "\u3000" + "\u3000" + "\uff12" + "\uff10" + "\u3000" + "\u3000" + "\uff11" + "\u3000" + "\u3000" + "\uff11" + "\u3000" + "\u3000");
                System.out.println("红史莱姆" + "\u3000" + "红" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "红" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "\uff18" + "\uff10" + "\u3000" + "\u3000" + "\uff13" + "\uff10" + "\u3000" + "\u3000" + "\uff11" + "\u3000" + "\u3000" + "\uff12" + "\u3000" + "\u3000");
                System.out.println("黑史莱姆" + "\u3000" + "黑" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "黑" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "\uff12" + "\uff10" + "\uff10" + "\u3000" + "\uff14" + "\uff15" + "\u3000" + "\u3000" + "\uff11" + "\uff15" + "\u3000" + "\uff15" + "\u3000" + "\u3000");
                System.out.println("蝙蝠" + "\u3000" + "\u3000" + "\u3000" + "蝙" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "黑" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "\uff11" + "\uff10" + "\uff10" + "\u3000" + "\uff13" + "\uff15" + "\u3000" + "\u3000" + "\uff15" + "\u3000" + "\u3000" + "\uff13" + "\u3000" + "\u3000");
                System.out.println("大蝙蝠" + "\u3000" + "\u3000" + "大" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "黑" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "\uff12" + "\uff10" + "\uff10" + "\u3000" + "\uff16" + "\uff10" + "\u3000" + "\u3000" + "\uff12" + "\uff15" + "\u3000" + "\uff18" + "\u3000" + "\u3000");
                System.out.println("骷髅人" + "\u3000" + "\u3000" + "骷" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "黑" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "\uff11" + "\uff12" + "\uff10" + "\u3000" + "\uff17" + "\uff10" + "\u3000" + "\u3000" + "\uff10" + "\u3000" + "\u3000" + "\uff15" + "\u3000" + "\u3000");
                System.out.println("骷髅士兵" + "\u3000" + "兵" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "黑" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "\uff12" + "\uff10" + "\uff10" + "\u3000" + "\uff11" + "\uff10" + "\uff10" + "\u3000" + "\uff15" + "\u3000" + "\u3000" + "\uff18" + "\u3000" + "\u3000");
                System.out.println("魔王" + "\u3000" + "\u3000" + "\u3000" + "魔" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "黑" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "\uff13" + "\uff15" + "\uff10" + "\u3000" + "\uff11" + "\uff15" + "\uff10" + "\u3000" + "\uff12" + "\uff15" + "\u3000" + "\uff12" + "\uff15" + "\u3000" + "\u3000");
                System.out.println("石头人" + "\u3000" + "\u3000" + "石" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "黑" + "\u3000" + "\u3000" + "\u3000" + "\u3000" + "\uff17" + "\uff10" + "\u3000" + "\u3000" + "\uff16" + "\uff10" + "\u3000" + "\u3000" + "\uff15" + "\uff10" + "\u3000" + "\uff18" + "\u3000" + "\u3000");
            }
            if (s.equals("w")) {
                x--;
                if (Z[x][y] == 'i') {
                    number = number + 1;
                    Z[x + 1][y] = 'a';
                    upStairs();
                }
                if (Z[x][y] == 'j') {
                    number = number - 1;
                    Z[x + 1][y] = 'a';
                    downStairs();
                }
                if (Z[x][y] == 'a' || Z[x][y] == 'm' || Z[x][y] == 'n' || Z[x][y] == 'o' || Z[x][y] == 'p' || Z[x][y] == 'q' || Z[x][y] == 'r' || Z[x][y] == 't' || Z[x][y] == 'v' || Z[x][y] == 'y') {
                    judge();
                    Z[x + 1][y] = 'a';
                }
                if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                    special();
                    if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                        x = x - 1;
                        Z[x][y] = 'Z';
                    }
                }
                if (Z[x][y] == 'b') {
                    System.out.println("撞到墙了");
                    x = x + 1;
                    Z[x][y] = 'Z';
                }
                if (map5[11][6] != 'Z') {
                    map5[11][6] = 'j';
                }
                if (map4[6][11] != 'Z') {
                    map4[6][11] = 'j';
                }
                if (map3[7][6] != 'Z') {
                    map3[7][6] = 'j';
                }
                if (map2[1][6] != 'Z') {
                    map2[1][6] = 'j';
                }
                if (map1[2][6] != 'Z') {
                    map1[2][6] = 'i';
                }
                if (map2[7][6] != 'Z') {
                    map2[7][6] = 'i';
                }
                if (map3[6][11] != 'Z') {
                    map3[6][11] = 'i';
                }
                if (map4[11][6] != 'Z') {
                    map4[11][6] = 'i';
                }
                if (Z[x + 1][y] == 'Z') {
                    Z[x + 1][y] = 'a';
                }
                System.out.println("您当前所在楼层为：" + " " + number);
                printMap(Z);
                System.out.println("玩家目前生命值为" + life + "," + "攻击力为" + attack + "," + "防御力为" + defense + "," + "金钱数为" + money + "," + "红钥匙数为" + redKey + "," + "黄钥匙数为" + yellowKey + "," + "蓝钥匙数为" + blueKey);
                X.add(x);//添加相应数组的元素
                Y.add(y);
                Life.add(life);
                Attack.add(attack);
                Defense.add(defense);
                RedKey.add(redKey);
                YellowKey.add(yellowKey);
                BlueKey.add(blueKey);
            }
            if (s.equals("s")) {
                x++;
                if (Z[x][y] == 'i') {
                    number = number + 1;
                    Z[x - 1][y] = 'a';
                    upStairs();
                }
                if (Z[x][y] == 'j') {
                    number = number - 1;
                    Z[x - 1][y] = 'a';
                    downStairs();
                }
                if (Z[x][y] == 'a' || Z[x][y] == 'm' || Z[x][y] == 'n' || Z[x][y] == 'o' || Z[x][y] == 'p' || Z[x][y] == 'q' || Z[x][y] == 'r' || Z[x][y] == 't' || Z[x][y] == 'v' || Z[x][y] == 'y') {
                    judge();
                    Z[x - 1][y] = 'a';
                }
                if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                    special();
                    if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                        x = x + 1;
                        Z[x][y] = 'Z';
                    }
                }
                if (Z[x][y] == 'b') {
                    System.out.println("撞到墙了");
                    x = x - 1;
                    Z[x][y] = 'Z';
                }
                if (map5[11][6] != 'Z') {
                    map5[11][6] = 'j';
                }
                if (map4[6][11] != 'Z') {
                    map4[6][11] = 'j';
                }
                if (map3[7][6] != 'Z') {
                    map3[7][6] = 'j';
                }
                if (map2[1][6] != 'Z') {
                    map2[1][6] = 'j';
                }
                if (map1[2][6] != 'Z') {
                    map1[2][6] = 'i';
                }
                if (map2[7][6] != 'Z') {
                    map2[7][6] = 'i';
                }
                if (map3[6][11] != 'Z') {
                    map3[6][11] = 'i';
                }
                if (map4[11][6] != 'Z') {
                    map4[11][6] = 'i';
                }
                if (Z[x - 1][y] == 'Z') {
                    Z[x - 1][y] = 'a';
                }
                System.out.println("您当前所在楼层为：" + " " + number);
                printMap(Z);
                System.out.println("玩家目前生命值为" + life + "," + "攻击力为" + attack + "," + "防御力为" + defense + "," + "金钱数为" + money + "," + "红钥匙数为" + redKey + "," + "黄钥匙数为" + yellowKey + "," + "蓝钥匙数为" + blueKey);
                X.add(x);
                Y.add(y);
                Life.add(life);
                Attack.add(attack);
                Defense.add(defense);
                RedKey.add(redKey);
                YellowKey.add(yellowKey);
                BlueKey.add(blueKey);
            }
            if (s.equals("a")) {
                y--;
                if (Z[x][y] == 'i') {
                    number = number + 1;
                    Z[x][y + 1] = 'a';
                    upStairs();
                }
                if (Z[x][y] == 'j') {
                    number = number - 1;
                    downStairs();
                }
                if (Z[x][y] == 'a' || Z[x][y] == 'm' || Z[x][y] == 'n' || Z[x][y] == 'o' || Z[x][y] == 'p' || Z[x][y] == 'q' || Z[x][y] == 'r' || Z[x][y] == 't' || Z[x][y] == 'v' || Z[x][y] == 'y') {
                    judge();
                    Z[x][y + 1] = 'a';
                }
                if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                    special();
                    if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                        y = y + 1;
                        Z[x][y] = 'Z';
                    }
                }
                if (Z[x][y] == 'b') {
                    System.out.println("撞到墙了");
                    y = y + 1;
                    Z[x][y] = 'Z';
                }
                if (map5[11][6] != 'Z') {
                    map5[11][6] = 'j';
                }
                if (map4[6][11] != 'Z') {
                    map4[6][11] = 'j';
                }
                if (map3[7][6] != 'Z') {
                    map3[7][6] = 'j';
                }
                if (map2[1][6] != 'Z') {
                    map2[1][6] = 'j';
                }
                if (map1[2][6] != 'Z') {
                    map1[2][6] = 'i';
                }
                if (map2[7][6] != 'Z') {
                    map2[7][6] = 'i';
                }
                if (map3[6][11] != 'Z') {
                    map3[6][11] = 'i';
                }
                if (map4[11][6] != 'Z') {
                    map4[11][6] = 'i';
                }
                if (Z[x][y + 1] == 'Z') {
                    Z[x][y + 1] = 'a';
                }
                System.out.println("您当前所在楼层为：" + " " + number);
                printMap(Z);
                System.out.println("玩家目前生命值为" + life + "," + "攻击力为" + attack + "," + "防御力为" + defense + "," + "金钱数为" + money + "," + "红钥匙数为" + redKey + "," + "黄钥匙数为" + yellowKey + "," + "蓝钥匙数为" + blueKey);
                X.add(x);
                Y.add(y);
                Life.add(life);
                Attack.add(attack);
                Defense.add(defense);
                RedKey.add(redKey);
                YellowKey.add(yellowKey);
                BlueKey.add(blueKey);
            }
            if (s.equals("d")) {
                y++;
                if (Z[x][y] == 'i') {
                    number = number + 1;
                    Z[x][y - 1] = 'a';
                    upStairs();
                }
                if (Z[x][y] == 'j') {
                    number = number - 1;
                    Z[x][y - 1] = 'a';
                    downStairs();
                }
                if (Z[x][y] == 'a' || Z[x][y] == 'm' || Z[x][y] == 'n' || Z[x][y] == 'o' || Z[x][y] == 'p' || Z[x][y] == 'q' || Z[x][y] == 'r' || Z[x][y] == 't' || Z[x][y] == 'v' || Z[x][y] == 'y') {
                    judge();
                    Z[x][y - 1] = 'a';
                }
                if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                    special();
                    if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                        y = y - 1;
                        Z[x][y] = 'Z';
                    }
                }
                if (Z[x][y] == 'b') {
                    System.out.println("撞到墙了");
                    y = y - 1;
                    Z[x][y] = 'Z';
                }
                if (map5[11][6] != 'Z') {
                    map5[11][6] = 'j';
                }
                if (map4[6][11] != 'Z') {
                    map4[6][11] = 'j';
                }
                if (map3[7][6] != 'Z') {
                    map3[7][6] = 'j';
                }
                if (map2[1][6] != 'Z') {
                    map2[1][6] = 'j';
                }
                if (map1[2][6] != 'Z') {
                    map1[2][6] = 'i';
                }
                if (map2[7][6] != 'Z') {
                    map2[7][6] = 'i';
                }
                if (map3[6][11] != 'Z') {
                    map3[6][11] = 'i';
                }
                if (map4[11][6] != 'Z') {
                    map4[11][6] = 'i';
                }
                if (Z[x][y - 1] == 'Z') {
                    Z[x][y - 1] = 'a';
                }
                System.out.println("您当前所在楼层为：" + " " + number);
                printMap(Z);
                System.out.println("玩家目前生命值为" + life + "," + "攻击力为" + attack + "," + "防御力为" + defense + "," + "金钱数为" + money + "," + "红钥匙数为" + redKey + "," + "黄钥匙数为" + yellowKey + "," + "蓝钥匙数为" + blueKey);
                X.add(x);
                Y.add(y);
                Life.add(life);
                Attack.add(attack);
                Defense.add(defense);
                RedKey.add(redKey);
                YellowKey.add(yellowKey);
                BlueKey.add(blueKey);
            }
            if (s.equals("help")) {
                help();
            }
            if (s.equals("exit")) {
                System.out.println("结束游戏");
                break;
            }
            if (s.equals("restart")) {
                map1 = map6;
                map2 = map7;
                map3 = map8;
                map4 = map9;
                map5 = map10;
                life = 1000;
                attack = 10;
                defense = 10;
                money = 0;
                yellowKey = 0;
                blueKey = 0;
                redKey = 0;
                number = 1;
                x = 10;
                y = 6;
                Z = map6;
                Z[x][y] = 'Z';
                start();
                System.out.println("您当前所在楼层为：" + " " + number);
                printMap(Z);
                System.out.println("玩家目前生命值为" + life + "," + "攻击力为" + attack + "," + "防御力为" + defense + "," + "金钱数为" + money + "," + "红钥匙数为" + redKey + "," + "黄钥匙数为" + yellowKey + "," + "蓝钥匙数为" + blueKey);
            }
            if (s.equals("status")) {
                System.out.println("您当前所在楼层为：" + " " + number);
                printMap(Z);
                System.out.println("玩家目前生命值为" + life + "," + "攻击力为" + attack + "," + "防御力为" + defense + "," + "金钱数为" + money + "," + "红钥匙数为" + redKey + "," + "黄钥匙数为" + yellowKey + "," + "蓝钥匙数为" + blueKey);
            }
            if(s.equals("undo")){
                Z = map6;x=10;y=6;
                for(int n = 0;n<steps.size()-1;n++){
                    String l = (String) steps.get(n);
                    if (l.equals("w")) {
                        x--;
                        if (Z[x][y] == 'i') {
                            number = number + 1;
                            Z[x + 1][y] = 'a';
                            upStairs();
                        }
                        if (Z[x][y] == 'j') {
                            number = number - 1;
                            Z[x + 1][y] = 'a';
                            downStairs();
                        }
                        if (Z[x][y] == 'a' || Z[x][y] == 'm' || Z[x][y] == 'n' || Z[x][y] == 'o' || Z[x][y] == 'p' || Z[x][y] == 'q' || Z[x][y] == 'r' || Z[x][y] == 't' || Z[x][y] == 'v' || Z[x][y] == 'y') {
                            judge();
                            Z[x + 1][y] = 'a';
                        }
                        if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                            special();
                            if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                                x = x - 1;
                                Z[x][y] = 'Z';
                            }
                        }
                        if (Z[x][y] == 'b') {
                            System.out.println("撞到墙了");
                            x = x + 1;
                            Z[x][y] = 'Z';
                        }
                        if (map5[11][6] != 'Z') {
                            map5[11][6] = 'j';
                        }
                        if (map4[6][11] != 'Z') {
                            map4[6][11] = 'j';
                        }
                        if (map3[7][6] != 'Z') {
                            map3[7][6] = 'j';
                        }
                        if (map2[1][6] != 'Z') {
                            map2[1][6] = 'j';
                        }
                        if (map1[2][6] != 'Z') {
                            map1[2][6] = 'i';
                        }
                        if (map2[7][6] != 'Z') {
                            map2[7][6] = 'i';
                        }
                        if (map3[6][11] != 'Z') {
                            map3[6][11] = 'i';
                        }
                        if (map4[11][6] != 'Z') {
                            map4[11][6] = 'i';
                        }
                        if (Z[x + 1][y] == 'Z') {
                            Z[x + 1][y] = 'a';
                        }
                        System.out.println("您当前所在楼层为：" + " " + number);
                        printMap(Z);
                        System.out.println("玩家目前生命值为" + life + "," + "攻击力为" + attack + "," + "防御力为" + defense + "," + "金钱数为" + money + "," + "红钥匙数为" + redKey + "," + "黄钥匙数为" + yellowKey + "," + "蓝钥匙数为" + blueKey);
                    }
                    if (l.equals("s")) {
                        x++;
                        if (Z[x][y] == 'i') {
                            number = number + 1;
                            Z[x - 1][y] = 'a';
                            upStairs();
                        }
                        if (Z[x][y] == 'j') {
                            number = number - 1;
                            Z[x - 1][y] = 'a';
                            downStairs();
                        }
                        if (Z[x][y] == 'a' || Z[x][y] == 'm' || Z[x][y] == 'n' || Z[x][y] == 'o' || Z[x][y] == 'p' || Z[x][y] == 'q' || Z[x][y] == 'r' || Z[x][y] == 't' || Z[x][y] == 'v' || Z[x][y] == 'y') {
                            judge();
                            Z[x - 1][y] = 'a';
                        }
                        if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                            special();
                            if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                                x = x + 1;
                                Z[x][y] = 'Z';
                            }
                        }
                        if (Z[x][y] == 'b') {
                            System.out.println("撞到墙了");
                            x = x - 1;
                            Z[x][y] = 'Z';
                        }
                        if (map5[11][6] != 'Z') {
                            map5[11][6] = 'j';
                        }
                        if (map4[6][11] != 'Z') {
                            map4[6][11] = 'j';
                        }
                        if (map3[7][6] != 'Z') {
                            map3[7][6] = 'j';
                        }
                        if (map2[1][6] != 'Z') {
                            map2[1][6] = 'j';
                        }
                        if (map1[2][6] != 'Z') {
                            map1[2][6] = 'i';
                        }
                        if (map2[7][6] != 'Z') {
                            map2[7][6] = 'i';
                        }
                        if (map3[6][11] != 'Z') {
                            map3[6][11] = 'i';
                        }
                        if (map4[11][6] != 'Z') {
                            map4[11][6] = 'i';
                        }
                        if (Z[x - 1][y] == 'Z') {
                            Z[x - 1][y] = 'a';
                        }
                        System.out.println("您当前所在楼层为：" + " " + number);
                        printMap(Z);
                        System.out.println("玩家目前生命值为" + life + "," + "攻击力为" + attack + "," + "防御力为" + defense + "," + "金钱数为" + money + "," + "红钥匙数为" + redKey + "," + "黄钥匙数为" + yellowKey + "," + "蓝钥匙数为" + blueKey);
                    }
                    if (l.equals("a")) {
                        y--;
                        if (Z[x][y] == 'i') {
                            number = number + 1;
                            Z[x][y + 1] = 'a';
                            upStairs();
                        }
                        if (Z[x][y] == 'j') {
                            number = number - 1;
                            downStairs();
                        }
                        if (Z[x][y] == 'a' || Z[x][y] == 'm' || Z[x][y] == 'n' || Z[x][y] == 'o' || Z[x][y] == 'p' || Z[x][y] == 'q' || Z[x][y] == 'r' || Z[x][y] == 't' || Z[x][y] == 'v' || Z[x][y] == 'y') {
                            judge();
                            Z[x][y + 1] = 'a';
                        }
                        if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                            special();
                            if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                                y = y + 1;
                                Z[x][y] = 'Z';
                            }
                        }
                        if (Z[x][y] == 'b') {
                            System.out.println("撞到墙了");
                            y = y + 1;
                            Z[x][y] = 'Z';
                        }
                        if (map5[11][6] != 'Z') {
                            map5[11][6] = 'j';
                        }
                        if (map4[6][11] != 'Z') {
                            map4[6][11] = 'j';
                        }
                        if (map3[7][6] != 'Z') {
                            map3[7][6] = 'j';
                        }
                        if (map2[1][6] != 'Z') {
                            map2[1][6] = 'j';
                        }
                        if (map1[2][6] != 'Z') {
                            map1[2][6] = 'i';
                        }
                        if (map2[7][6] != 'Z') {
                            map2[7][6] = 'i';
                        }
                        if (map3[6][11] != 'Z') {
                            map3[6][11] = 'i';
                        }
                        if (map4[11][6] != 'Z') {
                            map4[11][6] = 'i';
                        }
                        if (Z[x][y + 1] == 'Z') {
                            Z[x][y + 1] = 'a';
                        }
                        System.out.println("您当前所在楼层为：" + " " + number);
                        printMap(Z);
                        System.out.println("玩家目前生命值为" + life + "," + "攻击力为" + attack + "," + "防御力为" + defense + "," + "金钱数为" + money + "," + "红钥匙数为" + redKey + "," + "黄钥匙数为" + yellowKey + "," + "蓝钥匙数为" + blueKey);
                    }
                    if (l.equals("d")) {
                        y++;
                        if (Z[x][y] == 'i') {
                            number = number + 1;
                            Z[x][y - 1] = 'a';
                            upStairs();
                        }
                        if (Z[x][y] == 'j') {
                            number = number - 1;
                            Z[x][y - 1] = 'a';
                            downStairs();
                        }
                        if (Z[x][y] == 'a' || Z[x][y] == 'm' || Z[x][y] == 'n' || Z[x][y] == 'o' || Z[x][y] == 'p' || Z[x][y] == 'q' || Z[x][y] == 'r' || Z[x][y] == 't' || Z[x][y] == 'v' || Z[x][y] == 'y') {
                            judge();
                            Z[x][y - 1] = 'a';
                        }
                        if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                            special();
                            if (Z[x][y] == 'c' || Z[x][y] == 'd' || Z[x][y] == 'e' || Z[x][y] == 'f' || Z[x][y] == 'F' || Z[x][y] == 'g' || Z[x][y] == 'h' || Z[x][y] == 'k' || Z[x][y] == 'l' || Z[x][y] == 's' || Z[x][y] == 'u' || Z[x][y] == 'w' || Z[x][y] == 'x' || Z[x][y] == 'z') {
                                y = y - 1;
                                Z[x][y] = 'Z';
                            }
                        }
                        if (Z[x][y] == 'b') {
                            System.out.println("撞到墙了");
                            y = y - 1;
                            Z[x][y] = 'Z';
                        }
                        if (map5[11][6] != 'Z') {
                            map5[11][6] = 'j';
                        }
                        if (map4[6][11] != 'Z') {
                            map4[6][11] = 'j';
                        }
                        if (map3[7][6] != 'Z') {
                            map3[7][6] = 'j';
                        }
                        if (map2[1][6] != 'Z') {
                            map2[1][6] = 'j';
                        }
                        if (map1[2][6] != 'Z') {
                            map1[2][6] = 'i';
                        }
                        if (map2[7][6] != 'Z') {
                            map2[7][6] = 'i';
                        }
                        if (map3[6][11] != 'Z') {
                            map3[6][11] = 'i';
                        }
                        if (map4[11][6] != 'Z') {
                            map4[11][6] = 'i';
                        }
                        if (Z[x][y - 1] == 'Z') {
                            Z[x][y - 1] = 'a';
                        }
                        System.out.println("您当前所在楼层为：" + " " + number);
                        printMap(Z);
                        System.out.println("玩家目前生命值为" + life + "," + "攻击力为" + attack + "," + "防御力为" + defense + "," + "金钱数为" + money + "," + "红钥匙数为" + redKey + "," + "黄钥匙数为" + yellowKey + "," + "蓝钥匙数为" + blueKey);
                    }
                }
            }
        }
    }

    private static void printMap(char[][] e) {//打印地图
        for (int b = 0; b < 13; b++) {
            for (int c = 0; c < 14; c++) {
                if (c == 13) {
                    System.out.print("\n");
                    continue;
                }
                if (e[b][c] == 'a') {
                    System.out.print("\u3000");
                }
                if (e[b][c] == 'b') {
                    System.out.print("\033[35;1m" + "墙");
                }
                if (e[b][c] == 'c') {
                    System.out.print("\033[32;1m" + "绿" + "\033[0m");
                }
                if (e[b][c] == 'd') {
                    System.out.print("\033[31;1m" + "红" + "\033[0m");
                }
                if (e[b][c] == 'e') {
                    System.out.print("\033[37;1m" + "黑" + "\033[0m");
                }
                if (e[b][c] == 'f') {
                    System.out.print("\033[37;1m" + "蝙" + "\033[0m");
                }
                if (e[b][c] == 'F') {
                    System.out.print("\033[37;1m" + "大" + "\033[0m");
                }
                if (e[b][c] == 'g') {
                    System.out.print("\033[37;1m" + "骷" + "\033[0m");
                }
                if (e[b][c] == 'h') {
                    System.out.print("\033[37;1m" + "兵" + "\033[0m");
                }
                if (e[b][c] == 'i') {
                    System.out.print("\033[37;1m" + "上" + "\033[0m");
                }
                if (e[b][c] == 'j') {
                    System.out.print("\033[37;1m" + "下" + "\033[0m");
                }
                if (e[b][c] == 'k') {
                    System.out.print("\033[31;1m" + "商" + "\033[0m");
                }
                if (e[b][c] == 'l') {
                    System.out.print("\033[34;1m" + "商" + "\033[0m");
                }
                if (e[b][c] == 'm') {
                    System.out.print("\033[31;1m" + "攻" + "\033[0m");
                }
                if (e[b][c] == 'n') {
                    System.out.print("\033[36;1m" + "防" + "\033[0m");
                }
                if (e[b][c] == 'o') {
                    System.out.print("\033[31;1m" + "瓶" + "\033[0m");
                }
                if (e[b][c] == 'p') {
                    System.out.print("\033[36;1m" + "瓶" + "\033[0m");
                }
                if (e[b][c] == 'q') {
                    System.out.print("\033[33;1m" + "瓶" + "\033[0m");
                }
                if (e[b][c] == 'r') {
                    System.out.print("\033[33;1m" + "钥" + "\033[0m");
                }
                if (e[b][c] == 's') {
                    System.out.print("\033[33;1m" + "门" + "\033[0m");
                }
                if (e[b][c] == 't') {
                    System.out.print("\033[36;1m" + "钥" + "\033[0m");
                }
                if (e[b][c] == 'u') {
                    System.out.print("\033[36;1m" + "门" + "\033[0m");
                }
                if (e[b][c] == 'v') {
                    System.out.print("\033[31;1m" + "钥" + "\033[0m");
                }
                if (e[b][c] == 'w') {
                    System.out.print("\033[31;1m" + "门" + "\033[0m");
                }
                if (e[b][c] == 'x') {
                    System.out.print("\033[37;1m" + "魔" + "\033[0m");
                }
                if (e[b][c] == 'y') {
                    System.out.print("\033[37;1m" + "宝" + "\033[0m");
                }
                if (e[b][c] == 'z') {
                    System.out.print("\033[37;1m" + "石" + "\033[0m");
                }
                if (e[b][c] == 'Z') {
                    System.out.print("\033[31;1m" + "勇" + "\033[0m");
                }
            }
        }
    }

    private static void judge() {
        if (Z[x][y] == 'a') {
            Z[x][y] = 'Z';
        }
        if (Z[x][y] == 'm') {
            attack = attack + 2;
            Z[x][y] = 'Z';
        }
        if (Z[x][y] == 'n') {
            defense = defense + 2;
            Z[x][y] = 'Z';
        }
        if (Z[x][y] == 'o') {
            life = life + 50;
            Z[x][y] = 'Z';
        }
        if (Z[x][y] == 'p') {
            life = life + 100;
            Z[x][y] = 'Z';
        }
        if (Z[x][y] == 'q') {
            life = life + 250;
            Z[x][y] = 'Z';
        }
        if (Z[x][y] == 'r') {
            yellowKey = yellowKey + 1;
            Z[x][y] = 'Z';
        }
        if (Z[x][y] == 't') {
            blueKey++;
            Z[x][y] = 'Z';
        }
        if (Z[x][y] == 'v') {
            redKey++;
            Z[x][y] = 'Z';
        }
        if (Z[x][y] == 'y') {
            System.out.println("你已胜利！");
        }
    }

    public static void upStairs() {//上楼梯判断
        switch (number) {
            case 2:
                Z = map2;
                x = 1;
                y = 6;
                Z[x][y] = 'Z';
                break;
            case 3:
                Z = map3;
                x = 7;
                y = 6;
                Z[x][y] = 'Z';
                break;
            case 4:
                Z = map4;
                x = 6;
                y = 11;
                Z[x][y] = 'Z';
                break;
            case 5:
                Z = map5;
                x = 11;
                y = 6;
                Z[x][y] = 'a';
                break;
        }
    }

    public static void downStairs() {//下楼梯判断
        switch (number) {
            case 4:
                Z = map4;
                x = 11;
                y = 6;
                Z[x][y] = 'Z';
                break;
            case 3:
                Z = map3;
                x = 6;
                y = 11;
                Z[x][y] = 'Z';
                break;
            case 2:
                Z = map2;
                x = 7;
                y = 6;
                Z[x][y] = 'Z';
                break;
            case 1:
                Z = map1;
                x = 2;
                y = 6;
                Z[x][y] = 'Z';
                break;
        }
    }

    public static void special() {//由于因为无法攻击而需要做特殊的处理
        int blood;
        if (Z[x][y] == 'c') {
            blood = 50;
            while (true) {
                if (attack <= 1) {
                    System.out.println("你的攻击力低于对方的防御力，无法发动攻击");
                    break;
                }
                blood = blood - (attack - 1);
                if (blood <= 0) {
                    money = money + 1;
                    Z[x][y] = 'Z';
                    break;
                }
                life = life - (20 - defense);
                if (20 - defense <= 0) {
                    break;
                }
                if (life <= 0) {
                    System.out.println("您的损失预计会超过当前生命值，你无法击败怪物，无法向怪物发动攻击");
                    life =(int) Life.get(Life.size()-1);
                    break;
                }
            }
        }
        if (Z[x][y] == 'd') {
            blood = 80;
            while (true) {
                if (attack <= 1) {
                    System.out.println("你的攻击力低于对方的防御力，无法发动攻击");
                    break;
                }
                blood = blood - (attack - 1);
                if (blood <= 0) {
                    money = money + 2;
                    Z[x][y] = 'Z';
                    break;
                }
                life = life - (30 - defense);
                if (30 - defense <= 0) {
                    break;
                }
                if (life <= 0) {
                    System.out.println("您的损失预计会超过当前生命值，你无法击败怪物，无法向怪物发动攻击");
                    life =(int) Life.get(Life.size()-1);
                    break;
                }
            }
        }
        if (Z[x][y] == 'e') {
            blood = 200;
            while (true) {
                if (attack <= 15) {
                    System.out.println("你的攻击力低于对方的防御力，无法发动攻击");
                    break;
                }
                blood = blood - (attack - 15);
                if (blood <= 0) {
                    money = money + 5;
                    Z[x][y] = 'Z';
                    break;
                }
                life = life - (45 - defense);
                if (45 - defense <= 0) {
                    break;
                }
                if (life <= 0) {
                    System.out.println("您的损失预计会超过当前生命值，你无法击败怪物，无法向怪物发动攻击");
                    life =(int) Life.get(Life.size()-1);
                    break;
                }
            }
        }
        if (Z[x][y] == 'f') {
            blood = 100;
            while (true) {
                if (attack <= 5) {
                    System.out.println("你的攻击力低于对方的防御力，无法发动攻击");
                    break;
                }
                blood = blood - (attack - 5);
                if (blood <= 0) {
                    money = money + 3;
                    Z[x][y] = 'Z';
                    break;
                }
                life = life - (35 - defense);
                if (35 - defense <= 0) {
                    break;
                }
                if (life <= 0) {
                    System.out.println("您的损失预计会超过当前生命值，你无法击败怪物，无法向怪物发动攻击");
                    life =(int) Life.get(Life.size()-1);
                    break;
                }
            }
        }
        if (Z[x][y] == 'F') {
            blood = 200;
            while (true) {
                if (attack <= 25) {
                    System.out.println("你的攻击力低于对方的防御力，无法发动攻击");
                    break;
                }
                blood = blood - (attack - 25);
                if (blood <= 0) {
                    money = money + 8;
                    Z[x][y] = 'Z';
                    break;
                }
                life = life - (60 - defense);
                if (60 - defense <= 0) {
                    break;
                }
                if (life <= 0) {
                    System.out.println("您的损失预计会超过当前生命值，你无法击败怪物，无法向怪物发动攻击");
                    life =(int) Life.get(Life.size()-1);
                    break;
                }
            }
        }
        if (Z[x][y] == 'g') {
            blood = 120;
            while (true) {
                if (attack <= 0) {
                    System.out.println("你的攻击力低于对方的防御力，无法发动攻击");
                    break;
                }
                blood = blood - attack;
                if (blood <= 0) {
                    money = money + 5;
                    Z[x][y] = 'Z';
                    break;
                }
                life = life - (70 - defense);
                if (70 - defense <= 0) {
                    break;
                }
                if (life <= 0) {
                    System.out.println("您的损失预计会超过当前生命值，你无法击败怪物，无法向怪物发动攻击");
                    life =(int) Life.get(Life.size()-1);
                    break;
                }
            }
        }
        if (Z[x][y] == 'h') {
            blood = 200;
            while (true) {
                if (attack <= 5) {
                    System.out.println("你的攻击力低于对方的防御力，无法发动攻击");
                    break;
                }
                blood = blood - (attack - 5);
                if (blood <= 0) {
                    money = money + 8;
                    Z[x][y] = 'Z';
                    break;
                }
                life = life - (100 - defense);
                if (100 - defense <= 0) {
                    break;
                }
                if (life <= 0) {
                    System.out.println("您的损失预计会超过当前生命值，你无法击败怪物，无法向怪物发动攻击");
                    life =(int) Life.get(Life.size()-1);
                    break;
                }
            }
        }
        if (Z[x][y] == 'k') {
            if (money < 20) {
                System.out.println("金币不足，无法购买");
            } else {
                money = money - 20;
                attack = attack + 3;
                System.out.println("attack" + attack + "defense" + defense + "life" + life + "money" + money);
            }
        }
        if (Z[x][y] == 'l') {
            if (money < 20) {
                System.out.println("金币不足，无法购买");
            } else {
                money = money - 20;
                defense = defense + 3;
                System.out.println("attack" + attack + "defense" + defense + "life" + life + "money" + money);
            }
        }
        if (Z[x][y] == 's') {
            if (yellowKey > 0) {
                Z[x][y] = 'Z';
            } else {
                System.out.println("您没有黄钥匙，无法通过黄门");
                System.out.println("attack" + attack + "defense" + defense + "life" + life + "money" + money);
            }
        }
        if (Z[x][y] == 'u') {
            if (blueKey > 0) {
                Z[x][y] = 'Z';
            } else {
                System.out.println("您没有蓝钥匙，无法通过蓝门");
                System.out.println("attack" + attack + "defense" + defense + "life" + life + "money" + money);
            }
        }
        if (Z[x][y] == 'w') {
            if (redKey > 0) {
                Z[x][y] = 'Z';
            } else {
                System.out.println("您没有红钥匙，无法通过红门");
                System.out.println("attack" + attack + "defense" + defense + "life" + life + "money" + money);
            }
        }
        if (Z[x][y] == 'x') {
            while (true) {
                if (attack <= 25) {
                    System.out.println("你的攻击力低于对方的防御力，无法发动攻击");
                    break;
                }
                blood = 350 - (attack - 25);
                if (blood <= 0) {
                    money = money + 20;
                    Z[x][y] = 'Z';
                    break;
                }
                life = life - (150 - defense);
                if (150 - defense <= 0) {
                    break;
                }
                if (life <= 0) {
                    System.out.println("您的损失预计会超过当前生命值，你无法击败怪物，无法向怪物发动攻击");
                    life =(int) Life.get(Life.size()-1);
                    break;
                }
            }
        }
        if (Z[x][y] == 'z') {
            while (true) {
                if (attack <= 50) {
                    System.out.println("你的攻击力低于对方的防御力，无法发动攻击");
                    break;
                }
                blood = 70 - (attack - 50);
                if (blood <= 0) {
                    money = money + 8;
                    Z[x][y] = 'Z';
                    break;
                }
                life = life - (60 - defense);
                if (60 - defense <= 0) {
                    break;
                }
                if (life <= 0) {
                    System.out.println("您的损失预计会超过当前生命值，你无法击败怪物，无法向怪物发动攻击");
                    life =(int) Life.get(Life.size()-1);
                }
                break;
            }
        }
    }
    public static void start(){
        System.out.println("欢迎来到魔塔小游戏，在这个小游戏中，身为勇士的你必须闯过一层又一层的魔塔，最后到达塔顶，救回美丽的公主，魔塔里到处都充满着凶残的怪物，我们必须杀死它们。");
    }
    public static void help(){//打印说明
        System.out.println("操作说明：");
        System.out.println("w:向上移动  a:向左移动  d:向右移动  s:向下移动  f:查看怪物信息  help:输出帮助  restart:重新开始  exit:退出游戏  undo:撤销一步  redo:取消撤销");
        System.out.println("\n");
        System.out.println("属性说明：");
        System.out.println("生命值：角色生存的基本，为零时死亡");
        System.out.println("攻击力：对敌人造成伤害的能力");
        System.out.println("防御力：抵挡敌人攻击的能力");
        System.out.println("金币：可以在商人处购买攻击或防御，20金币换3点攻击或3点防御");
        System.out.println("\n");
        System.out.println("物品说明：");
        System.out.println("钥匙：指定颜色的钥匙开指定颜色的门，没有指定颜色的钥匙则无法进行开门操作");
        System.out.println("血瓶：恢复生命值，小血瓶+50，中血瓶+100，大血瓶+250");
        System.out.println("攻击宝石：拾取+2点攻击");
        System.out.println("防御宝石：拾取+2点防御");
        System.out.println("\n");
        System.out.println("地图说明：");
        System.out.println("上：上楼梯");
        System.out.println("下：下楼梯");
        System.out.println("钥：钥匙");
        System.out.println("门：需要勇士用对应钥匙开门");
        System.out.println("攻：攻击宝石，+2点攻击力");
        System.out.println("防：防御宝石，+2点防御力");
        System.out.println("小：小血瓶，+50生命值");
        System.out.println("中：中血瓶，+100生命值");
        System.out.println("大：大血瓶，+250生命值");
        System.out.println("墙：墙壁，无法经过");
        System.out.println("\n");
        System.out.println("战斗说明：");
        System.out.println("魔塔中的战斗采取我打你一下，你打我一下的回合制战斗模式，直到一方死亡。每次攻击造成的伤害为：攻击方的攻击力-防御方的防御力。当主角的攻击力小于等于怪物的防御力，或者预计损失超过当前生命值时，将判定主角无法击败怪物，此时主角无法向怪物发起战斗。");

    }
    }




