package cn.edu.cqut;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Work_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Work_4 choice = new Work_4();
        for (int no = 1; no >= 1 && no <= 13; ) {
            System.out.println("");
            System.out.println("本次总共有13题，输入1-13进行选择，输入其他退出");
            no = input.nextInt();
            switch (no) {
                case 0:
                    System.out.println("退出");
                    break;
                case 1:
                    System.out.println("第一题：");
                    choice.no_1();
                    break;
                case 2:
                    System.out.println("第二题：");
                    choice.no_2();
                    break;
                case 3:
                    System.out.println("第三题：");
                    choice.no_3();
                    break;
                case 4:
                    System.out.println("第四题：");
                    choice.no_4();
                    break;
                case 5:
                    System.out.println("第五题：");
                    choice.no_5();
                    break;
                case 6:
                    System.out.println("第六题：");
                    choice.no_6();
                    break;
                case 7:
                    System.out.println("第七题：");
                    choice.no_7();
                    break;
                case 8:
                    System.out.println("第八题：");
                    choice.no_8();
                    break;
                case 9:
                    System.out.println("第九题：");
                    choice.no_9();
                    break;
                case 10:
                    System.out.println("第十题：");
                    choice.no_10();
                    break;
                case 11:System.out.println("第十一题：");
                     choice.no_11();
                    break;
                case 12:System.out.println("第十二题：");
                    choice.no_12();
                    break;
                case 13:System.out.println("第十三题：");
                        choice.no_13();
                    break;
            }
        }
    }

    public void no_1() {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.printf("recatangle1: width=%.2f,height=%.2f,area=%.2f,perimeter=%.2f\n", rectangle1.width,
                rectangle1.height, rectangle1.getArea(), rectangle1.getPerimeter());
        System.out.printf("recatangle2: width=%.2f,height=%.2f,area=%.2f,perimeter=%.2f\n", rectangle2.width,
                rectangle2.height, rectangle2.getArea(), rectangle2.getPerimeter());
    }


    public void no_2() {
        Stock stock = new Stock("ORCL", "OracleCorporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.34;
        System.out.println("symbol:" + stock.symbol);
        System.out.println("name:" + stock.name);
        System.out.println(stock.getChangePercent() + "%");
    }

    public void no_3() {
        Date date = new Date();
        for (long i = 10000; i <= Math.pow(10, 11); i *= 10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
    }

    public void no_4() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                int out = random.nextInt(100);
                System.out.printf("%3d ", out+1);
            }
            System.out.println();
        }
    }

    public void no_5() {
        GregorianCalendar calendar = new GregorianCalendar();
        printTime(calendar);
        long x =1234567898765L;
        calendar.setTimeInMillis(x);
        System.out.println();
        printTime(calendar);
    }
    public static void printTime(GregorianCalendar calendar){
        System.out.print(calendar.get(GregorianCalendar.YEAR)+".");
        System.out.print(calendar.get(GregorianCalendar.MONTH)+1+".");
        System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }

    public void no_6(){
        StopWatch time = new StopWatch();
        Random random = new Random();
        int[] num = new int[100000];
        for (int i = 0; i < 100000; i++)
            num[i] = random.nextInt(100000);
        time.start();
        for(int i=0;i<99999;i++)
            for(int j=i+1;j<100000;j++)
                if(num[i]>num[j]) {
                    int temp = num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
        time.end();
        System.out.println(time.getElapsedTime());
    }

    public void no_7(){
        Account account = new Account(1122,20000);
        account.setAnnualInterstRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        account.getAccount();
    }

    public void no_8(){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println("Fan1:\n"+fan1.toString());
        fan2.setOn(true);
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println("Fan2:\n"+fan2.toString());
    }

    public void no_9(){
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("regularPolygon1:\nperimeter:"+regularPolygon1.getPerimeter()+"\tarea:"+regularPolygon1.getArea());
        System.out.println("\nregularPolygon2:\nperimeter:"+regularPolygon2.getPerimeter()+"\tarea:"+regularPolygon2.getArea());
        System.out.println("\nregularPolygon3:\nperimeter:"+regularPolygon3.getPerimeter()+"\tarea:"+regularPolygon3.getArea());
    }

    public void no_10(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0)
            System.out.println("x1="+quadraticEquation.getRoot1(quadraticEquation.getDiscriminant())+
                    "\tx2="+quadraticEquation.getRoot2(quadraticEquation.getDiscriminant()));
        else if(quadraticEquation.getDiscriminant()==0)
            System.out.println("x1=x2="+quadraticEquation.getRoot1(quadraticEquation.getDiscriminant()));
        else
            System.out.println("The equations has no roots");
        input.close();
    }

    public void no_11(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c,d,e,f");
        double a =input.nextDouble();
        double b =input.nextDouble();
        double c =input.nextDouble();
        double d =input.nextDouble();
        double e =input.nextDouble();
        double f =input.nextDouble();
        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
        if(linearEquation.isSolvable())
            System.out.println("x:"+linearEquation.getX()+"\ty:"+linearEquation.getY());
        else
            System.out.println("The quation has no solution");
        input.close();
    }

    public void no_12(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1,y1,x2,y2:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("Enter x3,y3,x4,y4:");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double a,b,c,d,e,f;
        a=y2-y1;
        b=x1-x2;
        c=y4-y3;
        d=x3-x4;
        e=(y2-y1)*x1+(x1-x2)*y1;
        f=(y4-y3)*x3+(x3-x4)*y3;
        LinearEquation linearEquation =new LinearEquation(a,b,c,d,e,f);
        if(linearEquation.isSolvable())
            System.out.println("x:"+linearEquation.getX()+"\ty:"+linearEquation.getY());
        else
            System.out.println("The quation has no solution");
        input.close();
    }

    public void no_13(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array:");
        int  row = input.nextInt();
        int  column = input.nextInt();
        double[][] a = new double[row][column];
        System.out.println("Enter the array");
        for (int i=0;i<row;i++)
            for (int j=0;j<column;j++)
                a[i][j] =input.nextDouble();
        Location location=Location.locateLargest(a);
        System.out.println("The location of the largest element is "+location.maxValue+" at ("+location.row+","+location.column+")");
        input.close();
    }
}

class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {//width和height构造方法
        this.width = width;
        this.height = height;
    }

    double getArea() {//矩形面积
        return height * width;
    }

    double getPerimeter() {//矩形周长
        return (height + width);
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name) {//symbol和name构造方法
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent() {
        double percent = 100 * (currentPrice - previousClosingPrice) / previousClosingPrice;
        return percent;
    }
}

class StopWatch{
    private long starttime;
    private long endtime;
    public void StopWatch(){
        starttime=System.currentTimeMillis();
    }
    public void setStarttime(long starttime0){
        starttime=starttime0;
    }
    public void setEndtime(long endtime0){
        endtime=endtime0;
    }
    public void start(){
        starttime=System.currentTimeMillis();
    }
    public void end(){
        endtime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endtime-starttime;
    }
}



class Account{
    private int id;
    private double balance;
    private double annualInterstRate;
    private Date DateCreated = new Date();
    public Account(){//无参构造
    }
    public Account(int id,double balance){//特定构造
        this.id=id;
        this.balance=balance;
    }
    public int getId(int id){//id访问器
        return id;
    }
    public int setId(int newid){//id修改器
        this.id=newid;
        return id;
    }
    public double getBalcance(){//balance访问器
        return balance;
    }
    public double setBalance(double newbalance){//balanc修改器
        this.balance=newbalance;
        return balance;
    }

    public double getAnnualInterstRate() {//annualInterstRate访问器
        return this.annualInterstRate;
    }

    public void setAnnualInterstRate(double annualInterstRate) {//annualInterstRate修改器
        this.annualInterstRate = annualInterstRate/100;
    }

    public Date getDateCreated() {//DateCreated访问器
        return this.DateCreated;
    }

    public double getMonthlyInterestRate(double annualInterstRate){//月利率
        return this.annualInterstRate/12;
    }

    public double withDraw(double money){//取钱
        if(this.balance>=money) {
            this.balance -= money;
            return this.balance;
        }
        else
            return -1;
    }

    public double deposit(double money){//存钱
        this.balance+=money;
        return this.balance;
    }
    public double getMonthlyInterest(double balance,double monthlyInterestRate){
        return balance*monthlyInterestRate;
    }

    public void getAccount(){
        System.out.println("balance:"+balance+"$\t"+getMonthlyInterest(balance,getMonthlyInterestRate(getAnnualInterstRate()))
                +"$\t Datecreated:"+getDateCreated());
    }
}

class Fan{
    public final  int SLOW=1,MEDIUM=2,FAST=3;
    private int speed = SLOW;
    private boolean on=false;
    private double radius=5;
    String color="blue";
    public void Fan(){//无参构造函数
    }

    public int getSpeed() {
        System.out.println(speed);
        return speed;
    }

    public void setSpeed(int newspeed) {
        if(newspeed<SLOW)
            this.speed=SLOW;
        else if(newspeed>FAST)
            this.speed=FAST;
        else
            this.speed=newspeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean ison) {
        this.on = ison;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getcolor(){
        return color;
    }

    public void setColor(String newcolor){
        this.color=newcolor;
    }

    public String toString(){
        if(on)
            return "speed:"+speed+"\nradius:"+radius+"\ncolor:"+color;
        else
            return "fan is off\nradius:"+radius+"\ncolor:"+color;
    }
}

class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;
    public RegularPolygon(){
        n=3;
        side=1;
        x=0;
        y=0;
    }
    public RegularPolygon(int n,int side){
        this.n=n;
        this.side=side;
        x=0;
        y=0;
    }

    public RegularPolygon(int n,int side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    //所有数据域访问修改器
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter(){
        return n*side;
    }


    public double  getArea(){
        double area = n * side / (4 * Math.tan(Math.PI / n));
        return area;
    }
}

class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        double discriminant = (b * b) - (4 * a * c);
        return discriminant;
    }

    public double getRoot1(double d){
        if(getDiscriminant()<0)
            return 0;
        double r1 = (-b + (Math.pow(d, 0.5) ))/ (2 * a);
        return r1;
    }

    public double getRoot2(double d){
        if(getDiscriminant()<0)
            return 0;
        double r2 = (-b - (Math.pow(d, 0.5) ))/ (2 * a);
        return r2;
    }
}

class LinearEquation{
    private double a,b,c,d,e,f;
    public LinearEquation(double a,double b,double c,double d,double e,double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable(){
        if(a*b-b*c==0)
            return false;
        else
            return true;
    }

    public double getX(){
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        return x;
    }

    public double getY(){
        double y = (a * f)  - (e * c) / ((a * d) - (b * c));
        return y;
    }
}

class Location{
    double[][] a;
    int row;
    int column;
    double maxValue;
    public static Location locateLargest(double[][] a){
        Location location = new Location();
        location.maxValue=a[0][0];
        for (int i=0;i<a.length;i++)
            for (int j=0;j<a[i].length;j++)
                if(a[i][j]>location.maxValue){
                    location.maxValue=a[i][j];
                    location.row=i;
                    location.column=j;
                }
        return location;
    }

}