package org.knowm.xchange.okcoin.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "data": {
 * "orders": [{
 * "amount": 0.1,
 * "avg_price": 1.961,
 * "create_date": 1422502117000,
 * "deal_amount": 0.1,
 * "order_id": 20914907,
 * "orders_id": 20914907,
 * "price": 0,
 * "status": 2,
 * "symbol": "ltc_usd",
 * "type": "sell_market"
 * }],
 */

/**
 * 订单信息
 */
public class OkCoinOrderResult extends OkCoinErrorResult {

    private final OkCoinOrder[] orders;

    public OkCoinOrderResult(@JsonProperty("result") final boolean result,
                             @JsonProperty("error_code") final int errorCode,
                             @JsonProperty("orders") final OkCoinOrder[] orders) {

        super(result, errorCode);
        this.orders = orders;
    }

    public OkCoinOrder[] getOrders() {

        return orders;
    }
}
