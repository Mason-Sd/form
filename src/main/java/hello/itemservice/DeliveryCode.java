package hello.itemservice;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Fast: 빠른배송
 * Normal: 일반 배송
 * Slow: 느린 배송
 */
@Data
@AllArgsConstructor
public class DeliveryCode {
    private String code;
    private String displayName;
}
