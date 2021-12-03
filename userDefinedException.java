class lessSalaryException extends Exception{
    public void show(){
        System.out.println("You are getting less Salary.\n");
    }
}

class userDefinedException{
    public static void main(String args[]){
        int salary=Integer.parseInt(args[0]);
        System.out.println("\n");
        if(salary<10000){
            try{
                throw new lessSalaryException();
            }
            catch(lessSalaryException e){
                e.show();
            }
        }
        else{
        System.out.println("Salary is OK.\n");

        }
    }
}