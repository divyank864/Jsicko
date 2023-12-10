package jsicko;

import java.util.Map;
import java.util.Set;

import java.util.Collection;
import java.util.HashMap;

public class ContractedMap<K, V> implements CMap<K, V> {

    protected Map<K, V> baseMap;

    public ContractedMap() {
        baseMap = new HashMap<>();
    }

    @Override
    public boolean containsKey(Object key) {
        return baseMap.containsKey(key);
    }

     @Override
    public V put(K key, V value) {
        return baseMap.put(key, value);
    }
   
}