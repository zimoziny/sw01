package ch04.Sample.idcard;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;
import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private Map<Integer, String> database = new HashMap<>();
    private int serialNumber = 100;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serialNumber++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(card.getSerialNumber(), card.getOwner());
        System.out.println(product + "을 등록했습니다.");
    }

    public String getOwner(int serialNumber) {
        return database.get(serialNumber);
    }

    public void printDatabase() {
        System.out.println("\n=== IDCard 대응표 ===");
        for (Map.Entry<Integer, String> entry : database.entrySet()) {
            System.out.println("시리얼 번호: " + entry.getKey() + ", 오너: " + entry.getValue());
        }
        System.out.println("==================\n");
    }
}
