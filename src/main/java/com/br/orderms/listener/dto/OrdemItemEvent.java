package com.br.orderms.listener.dto;

import java.math.BigDecimal;

public record OrdemItemEvent(
        String produto,
        Integer quantidade,
        BigDecimal preco
) {
}
