package week04.gen;

// 1. class, method에 사용가능
// <타입> 선언시 <T>를 가장 많이 사용 T, U, E
public class Generic<T> {
    // 2. 내부 필드의 String
    private T t;
    // 3. method의 return type도 String
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4.
        Generic<String> stringGeneric = new Generic<>();
        // 5.
        stringGeneric.set("Hello World");

        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString);
    }
}
