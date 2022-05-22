package hello.itemservice.domain.item;

import lombok.Data;

@Data //예측 불가능하게 동작할 수 있어서 위험 -> 주의해서 쓸 것
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity; //int 대신 Integer -> null 포함

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
