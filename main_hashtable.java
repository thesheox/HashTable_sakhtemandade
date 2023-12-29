public class main_hashtable{
    public static void main(String[] args){
        HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>("probe");
        h1.createTable();
        h1.bucketPut(1, 2, 1);
        h1.bucketPut(1, 3, 2);
        h1.bucketPut(1, 4, 3);
        h1.bucketPut(2,5, 4);
        h1.bucketPut(2, 6, 5);
        h1.bucketPut(2, 7, 6);
        for(Entry<Integer,Integer> e: h1.entrySet()){
            System.out.print(e.getValue()+" ");
        }
        System.out.println();
         HashMap<Integer,Integer> h2=new HashMap<Integer,Integer>("chain");
        h2.createTable();
        h2.bucketPut(1, 2, 1);
        h2.bucketPut(1, 3, 2);
        h2.bucketPut(1, 4, 3);
        h2.bucketPut(2,5, 4);
        h2.bucketPut(2, 6, 5);
        h2.bucketPut(2, 7, 6);
        for(Entry<Integer,Integer> e: h2.entrySet()){
            System.out.print(e.getValue()+" ");
        }
         
    }
}