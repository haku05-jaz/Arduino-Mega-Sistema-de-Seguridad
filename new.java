if (num2==0||num2==1){
              fact2=1;
        }else{
            for(int i=2;i<=num1;i++){
            fact2=fact2*i;
            }
            if(num2<0){
             System.out.println("Error,ingrese un segundo numero  no negativo");
             System.out.println("Ingrese el segundo numero:");
            num1=sc.nextInt();
             } else 
            for(int i=2;i<=num1;i++){
            fact2=fact2*i;
            }
        }