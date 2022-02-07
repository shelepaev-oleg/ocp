package com.mapMerge;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * #20210204_0531_241
 */
public class Main {

    public static void main(String[] args) {
        var operations = List.of(
                new Operation("123", new BigDecimal("10")),
                new Operation("123", new BigDecimal("8")),
                new Operation("456", new BigDecimal("2"))
        );
        var balance = new HashMap<String, BigDecimal>();
        operations.forEach(op -> balance.merge(op.getAccNo(), op.getAmount(), BigDecimal::add));
        System.out.println(balance);
    }
}

class Operation {
    private final String accNo;
    private final BigDecimal amount;

    Operation(String accNo, BigDecimal amount) {
        this.accNo = accNo;
        this.amount = amount;
    }

    public String getAccNo() {
        return accNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
