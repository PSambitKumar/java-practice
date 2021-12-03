abstract class ceremoney{
    public abstract void manf(int x);
    public abstract void dist(int x);
    public abstract void reatil(int x);
}

class buycermoney extends ceremoney{
    public void manf(int x){
        int total=600*x;
        int dis=total*(40/100);
        int dis_total=total-dis;
        System.out.println("Total value from Manufacturer: "+dis_total);
    }

    public void dist(int x){
        int total=800*x;
        int dis=total*(20/100);
        int dis_total=total-dis;
        System.out.println("Total value from Distibuter: "+dis_total);
    }

    public void reatil(int x){
        int total=1000*x;
        int dis=(total*10/100);
        int dis_total=total-dis;
        System.out.println("Total value from Retailor: "+dis_total);
    }
}

class marriage{
    public static void main(String[] args){
        String s1=args[0];
        int x=Integer.parseInt(s1);

        buycermoney ob = new buycermoney();
        if(x<=50){
            ob.reatil(x);
        }
        else if(x>50 && x<=100){
            ob.dist(x);
        }
        else{
            ob.manf(x);
        }
    }
}