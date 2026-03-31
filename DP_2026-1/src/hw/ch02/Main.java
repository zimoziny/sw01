package hw.ch02;
    
public class Main {
    public static void main(String[] args) {

        System.out.println("20231114 이다은");
        // Step 1: 한국 콘센트 생성
        KoreanOutlet outlet = new KoreanOutlet();

        // Step 2: Adapter로 감싸기
        Charger adapter = new KoreanOutletAdapter(outlet);

        // Step 3: 스마트폰에 전달하여 충전
        Smartphone phone = new Smartphone(adapter);
        phone.charge();
    }
}
