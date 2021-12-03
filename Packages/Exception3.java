class Exception3{
    public static void main(String args[]){
        try{
            String s1=args[0];
            int a=Integer.parseInt(s1);
            int b=a/0;
            // System.out.println("CSM Technologies");
            // System.out.println(b);
        }

        catch(ArithmeticException e){
            System.out.println("Dont pass 0.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dont Leave it blank");
        }
        catch(NumberFormatException e){
            System.out.println("Dont pass string.");
        }
    }
}
