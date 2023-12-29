import java.util.Hashtable;

public class HashMap<K,V> extends AbstractHashMap<K,V> {
     AbstractHashMap<K,V> map;
    public HashMap(String s){
       
        if(s=="probe"){
             map=new ProbeHashMap<>();
        }
        else if(s=="chain"){
             map=new ChainHashMap<>();
        }
    }

    @Override
    public Iterable<Entry<K, V>> entrySet() {
        return map.entrySet();
    }

    @Override
    protected void createTable() {
        
    }

    @Override
    protected V bucketGet(int h, K k) {
       return map.bucketGet(h,k);
    }

    @Override
    protected V bucketPut(int h, K k, V v) {
        return map.bucketPut(h,k,v);
    }

    @Override
    protected V bucketRemove(int h, K k) {
        return map.bucketRemove(h,k);
    }
}
