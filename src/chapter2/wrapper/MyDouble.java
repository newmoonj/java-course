package chapter2.wrapper;

public class MyDouble {
    //1.속성
    double value;
    //2.생성자
    MyDouble(double value){
        this.value = value;
    }
    //3.기능
    double getValue(){
    return value;
    }
    void setValue(double value){
        this.value = value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }


    // 덧셈
    //public void add(double other){
    //    this.value += other;
    //}

    public MyDouble add(MyDouble other){
        return new MyDouble(this.value + other.value);
    }
}
