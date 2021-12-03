class digitcount{
            public static void main(String args[]){
                int arr4=new Array();
                int n, p;
                arr4[0]=1;
                arr4[1]=2;
                arr4[2]=3;
                arr4[3]=2;
                arr4[4]=1;

           // arr4.sort();

                for(n=0; n<arr4.length; n++){
                    int counts=1;
                    for (p=1; p<arr4.length;p++){
                        if(arr4[n]==arr4[p]){
                            counts++;
                        }
                    }
                }
                if(counts!=0 && counts!=1){
                    System.out.println(arr4[n]+"="+counts);
                }
            }   
        }