public class pattern1{

    public void print1(int num){
        if(num == 0){
            return ;
        }
        else{
            print1(num-1);
            for(int i=0 ; i< num ; i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void print2(int num ){
        if(num == 0){
            return ;
        }
        else{
            for(int i=0 ; i<num ; i++){
                System.out.print("*");
            }

            System.out.print("\n");
            print2(num-1);
        }
    }

    public void print(int size){
        print1(size+1);
        print2(size);
    }

    public static void main(String[] args){
        pattern1 p = new pattern1();

        p.print(3);
    }
}