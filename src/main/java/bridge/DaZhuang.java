package bridge;

/**
 * Author: ljf
 * CreatedAt: 2021/3/25 下午6:33
 */
public class DaZhuang {

    public void chase(CuiHua cuiHua) {
        Gift gift = new WarmGift(new Haoche());
        give(cuiHua, gift);
    }

    private void give(CuiHua cuiHua, Gift gift) {
        System.out.println("gived");
    }
}
