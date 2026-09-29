public class breakone{
    public static void main(String args[]){

        for(int i=1; i<=10; i++){
            if(i == 3){
                break;            // Break statement is use to skip the iterator if we write i == 3 then loop will print numbers till 2 only
            }
            System.out.println(i);
        }
        System.out.println("I am out of loop");
    }
}