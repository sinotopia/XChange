package org.knowm.xchange.okcoin.dto.trade;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "data": {
 * "averagePrice": "0",
 * "completedTradeAmount": "0",
 * "createdDate": 1422258604000,
 * "id": 268013884,
 * "orderId": 268013884,
 * "sigTradeAmount": "0",
 * "sigTradePrice": "0",
 * "status": -1,
 * "symbol": "btc_usd",
 * "tradeAmount": "1.105",
 * "tradePrice": "0",
 * "tradeType": "buy",
 * "tradeUnitPrice": "1853.74",
 * "unTrade": "0"
 * }
 */

/**
 * 交易数据
 */
public class OkCoinFuturesOrder {

    /**
     * createdDate(string):创建日期
     orderId(long):订单id
     tradeType(string):交易类型（buy:买入；sell:卖出；buy_market:按市价买入；sell_market:按市价卖出）
     sigTradeAmount(string):单笔成交数量
     sigTradePrice(string):单笔成交价格
     tradeAmount(string):委托数量（市价卖代表要卖总数量；限价单代表委托数量）
     tradeUnitPrice(string):委托价格（市价买单代表购买总金额； 限价单代表委托价格）
     symbol(string):btc_usd:比特币；ltc_usd:莱特币; eth_usd:以太坊
     completedTradeAmount(string):已完成成交量
     tradePrice(string):成交金额
     averagePrice(string):平均成交价
     unTrade(string):当按市场价买币时表示剩余金额，其他情况表示此笔交易剩余买/卖币的数量
     status(int):-1已撤销,0等待成交,1部分成交,2完全成交,4撤单处理中
     */
    private final BigDecimal amount;
    private final String contractName;
    private final Date createdDate;
    private final BigDecimal dealAmount;
    private final BigDecimal fee;
    private final String orderId;
    private final BigDecimal price;
    private final BigDecimal avgPrice;
    private final int status;
    private final String symbol;
    private final String type;
    private final BigDecimal unitAmount;
    private final int leverRate;

    public OkCoinFuturesOrder(@JsonProperty("amount") BigDecimal amount,
                              @JsonProperty("contact_name") String contractName,
                              @JsonProperty("create_date") Date createdDate,
                              @JsonProperty("deal_amount") BigDecimal dealAmount,
                              @JsonProperty("fee") BigDecimal fee,
                              @JsonProperty("order_id") String orderId,
                              @JsonProperty("price") BigDecimal price,
                              @JsonProperty("price_avg") BigDecimal avgPrice,
                              @JsonProperty("status") int status,
                              @JsonProperty("symbol") String symbol,
                              @JsonProperty("type") String type,
                              @JsonProperty("unit_amount") BigDecimal unitAmount,
                              @JsonProperty("lever_rate") int leverRate) {

        this.amount = amount;
        this.contractName = contractName;
        this.createdDate = createdDate;
        this.dealAmount = dealAmount;
        this.fee = fee;
        this.orderId = orderId;
        this.price = price;
        this.avgPrice = avgPrice;
        this.status = status;
        this.symbol = symbol;
        this.type = type;
        this.unitAmount = unitAmount;
        this.leverRate = leverRate;
    }

    public BigDecimal getAmount() {

        return amount;
    }

    public String getContractName() {

        return contractName;
    }

    public Date getCreatedDate() {

        return createdDate;
    }

    public BigDecimal getDealAmount() {

        return dealAmount;
    }

    public BigDecimal getFee() {

        return fee;
    }

    public String getOrderId() {

        return orderId;
    }

    public BigDecimal getPrice() {

        return price;
    }

    public BigDecimal getAvgPrice() {

        return avgPrice;
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

    public BigDecimal getUnitAmount() {

        return unitAmount;
    }

    public int getLeverRate() {

        return leverRate;
    }

}
