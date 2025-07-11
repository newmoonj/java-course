package chapter2.capsulation.scenario1;

// 핵시설 관리하는 개발자
public class DataStore {

    //"B" 문자열이 들어오면 핵폭발 발생!
    private String store; // 해결책 1: 접근제어자로 데이터 보호

    public void setStore(String store) { // 해결책 2: 세터 추가
        if (store.equals("B")){ // 해결책 3: 안전한 데이터 설정 로직을 추가
            System.out.println("B가 입력되면 안됩니다.");
        } else {
            this.store = store;
        }
    }
}
