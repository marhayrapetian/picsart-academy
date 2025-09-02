package am.picsartacademy.homework4;
//Task 2:
//Create a class Pair<K, V> that holds a key and a value.
//Add methods to get/set both.

public class Pair<k, v> {
    private k key;
    private v value;
    public Pair(k key, v value) {
        this.key = key;
        this.value = value;
    }
    public k getKey() {
        return key;
    }
    public void setKey(k key) {
        this.key = key;
    }
    public v getValue() {
        return value;
    }
    public void setValue(v value) {
        this.value = value;
    }
}

