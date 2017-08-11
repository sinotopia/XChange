package org.knowm.xchange.okcoin.dto.account;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * "funds": {
 * "asset": {
 * "net": "0",
 * "total": "0"
 * },
 * "borrow": {
 * "btc": "0",
 * "usd": "0",
 * "ltc": "0",
 * "eth": "0"
 * },
 * "free": {
 * "btc": "0",
 * "usd": "0",
 * "ltc": "0",
 * "eth": "0"
 * },
 * "freezed": {
 * "btc": "0",
 * "usd": "0",
 * "ltc": "0",
 * "eth": "0"
 * },
 * "union_fund": {
 * "btc": "0",
 * "ltc": "0",
 * "eth": "0"
 * }
 * }
 */

public class OkCoinFunds {

    /**
     * 账户资产，包含净资产及总资产
     */
    private final Map<String, BigDecimal> asset;
    /**
     * 账户余额
     */
    private final Map<String, BigDecimal> free;
    /**
     * 账户冻结余额
     */
    private final Map<String, BigDecimal> freezed;
    /**
     * 账户借款信息(只有在账户有借款信息时才会返回)
     */
    private final Map<String, BigDecimal> borrow;

    /**
     * 账户理财信息(只有在账户有理财信息时才返回)
     */
    private final Map<String, BigDecimal> union_fund;

    public OkCoinFunds(@JsonProperty("asset") final Map<String, BigDecimal> asset,
                       @JsonProperty("free") final Map<String, BigDecimal> free,
                       @JsonProperty("freezed") final Map<String, BigDecimal> freezed,
                       @JsonProperty(value = "borrow", required = false) final Map<String, BigDecimal> borrow,
                       @JsonProperty(value = "union_fund", required = false) final Map<String, BigDecimal> union_fund) {

        this.asset = asset;
        this.free = free;
        this.freezed = freezed;
        this.borrow = borrow == null ? Collections.<String, BigDecimal>emptyMap() : borrow;
        this.union_fund = union_fund == null ? Collections.<String, BigDecimal>emptyMap() : union_fund;
    }

    public Map<String, BigDecimal> getFree() {

        return free;
    }

    public Map<String, BigDecimal> getFreezed() {

        return freezed;
    }

    public Map<String, BigDecimal> getBorrow() {

        return borrow;
    }

    public Map<String, BigDecimal> getAsset() {
        return asset;
    }

    public Map<String, BigDecimal> getUnion_fund() {
        return union_fund;
    }
}
