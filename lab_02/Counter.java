public class Counter {
    int value;

    public void increaseOther(Counter inny){
        inny.value += 1;
    }
    Counter(int value){
        this.value = value;
    }
}
