package org.knowm.xchange.okcoin.dto.marketdata;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "data":[["1001","2463.86","0.052","16:34:07","ask"]]
 */

/**
 * 成交记录
 */
public class OkCoinTrade {

    /**
     * 时间
     */
    private final Date date;
    /**
     * 价格
     */
    private final BigDecimal price;
    /**
     * 成交量
     */
    private final BigDecimal amount;
    /**
     * 交易序号
     */
    private final long tid;
    /**
     * 买卖类型
     */
    private final String type;

    /**
     * Constructor
     *
     * @param date
     * @param price
     * @param amount
     * @param tid
     * @param type
     */
    public OkCoinTrade(@JsonProperty("date") final long date,
                       @JsonProperty("price") final BigDecimal price,
                       @JsonProperty("amount") final BigDecimal amount,
                       @JsonProperty("tid") final long tid,
                       @JsonProperty("type") final String type) {

        this.date = new Date(date * 1000);
        this.price = price;
        this.amount = amount;
        this.tid = tid;
        this.type = type;
    }

    public Date getDate() {

        return date;
    }

    public BigDecimal getPrice() {

        return price;
    }

    public BigDecimal getAmount() {

        return amount;
    }

    public long getTid() {

        return tid;
    }

    public String getType() {

        return type;
    }

    @Override
    public String toString() {

        return "OkCoinTrade [date=" + date + ", price=" + price + ", amount=" + amount + ", tid=" + tid + ", type=" + type + "]";
    }

}