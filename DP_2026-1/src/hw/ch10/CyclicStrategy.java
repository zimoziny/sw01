package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int handvalue = 0;

    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(handvalue);
        handvalue = (handvalue + 1) % 3;
        return hand;
    }

    @Override
    public void study(boolean win) {
        // 순환 전략은 승패에 영향받지 않음
    }
}