package org.knowm.xchange.okcoin.dto.trade;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
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
public class OkCoinOrder {

    /**
     * 订单ID
     */
    private final long orderId;

    /**
     * 订单ID(不建议使用)
     */
    private final long ordersid;

    /**
     * -1:已撤销  0:未成交  1:部分成交  2:完全成交 4:撤单处理中,5:撤单处理中
     */
    private final int status;

    /**
     * 币种
     */
    private final String symbol;

    /**
     * buy_market:市价买入 / sell_market:市价卖出
     */
    private final String type;

    /**
     * 委托数量
     */
    private final BigDecimal amount;

    /**
     * 成交数量
     */
    private final BigDecimal dealAmount;

    /**
     * 委托时间
     */
    private final Date createDate;
    /**
     * 委托价格
     */
    private final BigDecimal price;

    /**
     * 平均成交价
     */
    private final BigDecimal avgPrice;

    public OkCoinOrder(@JsonProperty("order_id") final long orderId,
                       @JsonProperty("orders_id") final long ordersid,
                       @JsonProperty("status") final int status,
                       @JsonProperty("symbol") final String symbol,
                       @JsonProperty("type") final String type,
                       @JsonProperty("price") final BigDecimal price,
                       @JsonProperty("avg_price") final BigDecimal avgPrice,
                       @JsonProperty("amount") final BigDecimal amount,
                       @JsonProperty("deal_amount") final BigDecimal dealAmount,
                       @JsonProperty("create_date") final Date createDate) {

        this.orderId = orderId;
        this.ordersid = ordersid;
        this.status = status;
        this.symbol = symbol;
        this.type = type;
        this.amount = amount;
        this.dealAmount = dealAmount;
        this.price = price;
        this.avgPrice = avgPrice;
        this.createDate = createDate;
    }

    public long getOrderId() {

        return orderId;
    }

    public int getStatus() {

        return status;
    }

    public String getSymbol() {

        return symbol;
    }

    public String getType() {

        return type;
    }

    public BigDecimal getAmount() {

        return amount;
    }

    public BigDecimal getDealAmount() {

        return dealAmount;
    }

    public Date getCreateDate() {

        return createDate;
    }

    public BigDecimal getPrice() {

        return price;
    }

    public long getOrdersid() {
        return ordersid;
    }

    public BigDecimal getAvgPrice() {
        return avgPrice;
    }
}
