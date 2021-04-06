package lk.janani_super.asset.invoice.entity.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentMethod {
    CASH("Cash"),
    CREDIT("Credit card");
    private final String paymentMethod;
}
