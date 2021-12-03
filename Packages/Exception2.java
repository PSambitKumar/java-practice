class Exception2{
    public static void main(String args[]){
        try{int a=100;
        int b=a/0;
        System.out.println("CSM Technologies");
        System.out.println(b);
        }

        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("--------------");
            System.out.println(e.toString());
            System.out.println("--------------");
            e.printStackTrace();
            System.out.println("--------------");
            System.out.println(e.getMessage());

            System.out.println("CSM Technologies");            
        }
    }
}