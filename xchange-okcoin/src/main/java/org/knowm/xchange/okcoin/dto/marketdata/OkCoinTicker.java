package org.knowm.xchange.okcoin.dto.marketdata;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "data":{
 * "buy":2478.3,
 * "high":2555,
 * "last":2478.51,
 * "low":2466,
 * "sell":2478.5,
 * "timestamp":1411718074965,
 * "vol":49020.30
 * }
 */

/**
 * 行情数据
 */
public class OkCoinTicker {

    /**
     * 最高价
     */
    private final BigDecimal high;
    /**
     * 最低价
     */
    private final BigDecimal low;
    /**
     * 买一价
     */
    private final BigDecimal buy;
    /**
     * 卖一价
     */
    private final BigDecimal sell;
    /**
     * 最新成交价
     */
    private final BigDecimal last;
    /**
     * 成交量(最近的24小时)
     */
    private final BigDecimal vol;

    /**
     * 服务器时间戳
     */
    private final Date timestamp;

    public OkCoinTicker(@JsonProperty("high") final BigDecimal high,
                        @JsonProperty("low") final BigDecimal low,
                        @JsonProperty("buy") final BigDecimal buy,
                        @JsonProperty("sell") final BigDecimal sell,
                        @JsonProperty("last") final BigDecimal last,
                        @JsonProperty("vol") final BigDecimal vol,
                        @JsonProperty(required = false, value = "timestamp") Date timestamp) {

        this.high = high;
        this.low = low;
        this.buy = buy;
        this.sell = sell;
        this.last = last;
        this.vol = vol;
        this.timestamp = timestamp;
    }

    /**
     * @return the high
     */
    public BigDecimal getHigh() {

        return high;
    }

    /**
     * @return the low
     */
    public BigDecimal getLow() {

        return low;
    }

    /**
     * @return the buy
     */
    public BigDecimal getBuy() {

        return buy;
    }

    /**
     * @return the sell
     */
    public BigDecimal getSell() {

        return sell;
    }

    /**
     * @return the last
     */
    public BigDecimal getLast() {

        return last;
    }

    /**
     * @return the vol
     */
    public BigDecimal getVol() {

        return vol;
    }

}
