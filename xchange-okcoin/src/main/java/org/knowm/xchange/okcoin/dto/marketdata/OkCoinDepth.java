package org.knowm.xchange.okcoin.dto.marketdata;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * "data":{
 * "bids":[
 * ["2473.88","2.025"],
 * ["2473.5","2.4"],
 * ["2470","12.203"]
 * ],
 * "asks":[
 * ["2484","17.234"],
 * ["2483.01","6"],
 * ["2482.88","3"]
 * ],
 * "timestamp":1411718972024
 * }
 */

public class OkCoinDepth {

    /**
     * 卖方深度
     */
    private final BigDecimal[][] asks;

    /**
     * 买方深度
     */
    private final BigDecimal[][] bids;

    /**
     * 服务器时间戳
     */
    private final Date timestamp;

    public OkCoinDepth(@JsonProperty("asks") final BigDecimal[][] asks,
                       @JsonProperty("bids") final BigDecimal[][] bids,
                       @JsonProperty(required = false, value = "timestamp") Date timestamp) {

        this.asks = asks;
        this.bids = bids;
        this.timestamp = timestamp;
    }

    public BigDecimal[][] getAsks() {

        return asks;
    }

    public BigDecimal[][] getBids() {

        return bids;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {

        return "OkCoinDepth [asks=" + Arrays.toString(asks) + ", bids=" + Arrays.toString(bids) + "]";
    }
}
