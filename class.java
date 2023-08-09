class hii{
    public static void main(String[] args) {
    System.out.println("hhhh");
    }
}

// count no. of digits
 class Man {
  public static void main(String[] args) {
  int n=541;
  int c=0;
  while(n>0){
  n=n/10;
  c++;}
    System.out.println(c);
  }
}


// sum of digits
class sum{
    public static void main(String[] args) {
        int n=5429541;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}

class name{
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("digambar singh");
    }
}


class table{
    public static void main(String[] args) {
        int n= 5;
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}


// decimal to binary
class hiiii{
    public static void main(String[] args) {
        int n=5;
        while(n>0){
            int rem=n%2;
            n=n/2;
        }
        System.out.println(rem);
    }
}

class pattern{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

class pat{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1&&i==5){
                    System.out.print("*");
                }else{
                    System.out.print( "");
                }
            
        }
        System.out.println();
    }
}
}