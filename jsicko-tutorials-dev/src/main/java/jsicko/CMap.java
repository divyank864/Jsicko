package jsicko;

import ch.usi.si.codelounge.jsicko.Contract;

import static ch.usi.si.codelounge.jsicko.Contract.*;
import static ch.usi.si.codelounge.jsicko.ContractUtils.*;
import java.util.Map;
import java.util.Set; 
import java.util.Collection;

public interface CMap<K, V> extends Contract {

    // ContainsKey method
    @Requires("non_null_key")
    @Pure
    public boolean containsKey(Object key);

   // Put method
    @Requires("non_null_key_value")
    @Ensures({"returns_null_if_key_not_present"})
    V put(K key, V value);

    // non_null_key_value implementation
    @Pure
    default boolean non_null_key_value(K key, V value) {
        return key != null && value != null;
    }

    // returns_null_if_key_not_present implementation
    @Pure
    default boolean returns_null_if_key_not_present(K key, V result) {
        return !containsKey(key) || result == null;
    }

    @Pure
    default boolean non_null_key(Object key) {
    return key != null;
}


}
