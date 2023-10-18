/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntlDomainListRequest extends AbstractModel {

    /**
    * The page number in pagination cases.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of records on each page in pagination cases.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The domain keyword for fuzzy search.
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * The registration time sort order. Valid values: `1` (descending), `2` (ascending).
    */
    @SerializedName("OrderByRegTime")
    @Expose
    private Long OrderByRegTime;

    /**
    * The expiration time sort order. Valid values: `1` (descending), `2` (ascending).
    */
    @SerializedName("OrderByExpireTime")
    @Expose
    private Long OrderByExpireTime;

    /**
    * The domain status.
`all`: All domains.
`UrgentNeedRenew`: The domains that are in urgent need of renewal.
`RedemptionPending`: The domains that are in urgent need of redemption.
`nosubmit`: The domains with unverified identities.
`tran`: The domains that are being transferred in.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The DNS type. Valid values: `1` (DNSPod), `2` (others).
    */
    @SerializedName("DnsStatus")
    @Expose
    private Long DnsStatus;

    /**
    * The domain sort order. Valid values: `1` (descending), `2` (ascending).
    */
    @SerializedName("OrderByDomainName")
    @Expose
    private Long OrderByDomainName;

    /**
     * Get The page number in pagination cases. 
     * @return Offset The page number in pagination cases.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The page number in pagination cases.
     * @param Offset The page number in pagination cases.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of records on each page in pagination cases. 
     * @return Limit The number of records on each page in pagination cases.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of records on each page in pagination cases.
     * @param Limit The number of records on each page in pagination cases.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The domain keyword for fuzzy search. 
     * @return KeyWord The domain keyword for fuzzy search.
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set The domain keyword for fuzzy search.
     * @param KeyWord The domain keyword for fuzzy search.
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get The registration time sort order. Valid values: `1` (descending), `2` (ascending). 
     * @return OrderByRegTime The registration time sort order. Valid values: `1` (descending), `2` (ascending).
     */
    public Long getOrderByRegTime() {
        return this.OrderByRegTime;
    }

    /**
     * Set The registration time sort order. Valid values: `1` (descending), `2` (ascending).
     * @param OrderByRegTime The registration time sort order. Valid values: `1` (descending), `2` (ascending).
     */
    public void setOrderByRegTime(Long OrderByRegTime) {
        this.OrderByRegTime = OrderByRegTime;
    }

    /**
     * Get The expiration time sort order. Valid values: `1` (descending), `2` (ascending). 
     * @return OrderByExpireTime The expiration time sort order. Valid values: `1` (descending), `2` (ascending).
     */
    public Long getOrderByExpireTime() {
        return this.OrderByExpireTime;
    }

    /**
     * Set The expiration time sort order. Valid values: `1` (descending), `2` (ascending).
     * @param OrderByExpireTime The expiration time sort order. Valid values: `1` (descending), `2` (ascending).
     */
    public void setOrderByExpireTime(Long OrderByExpireTime) {
        this.OrderByExpireTime = OrderByExpireTime;
    }

    /**
     * Get The domain status.
`all`: All domains.
`UrgentNeedRenew`: The domains that are in urgent need of renewal.
`RedemptionPending`: The domains that are in urgent need of redemption.
`nosubmit`: The domains with unverified identities.
`tran`: The domains that are being transferred in. 
     * @return Status The domain status.
`all`: All domains.
`UrgentNeedRenew`: The domains that are in urgent need of renewal.
`RedemptionPending`: The domains that are in urgent need of redemption.
`nosubmit`: The domains with unverified identities.
`tran`: The domains that are being transferred in.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The domain status.
`all`: All domains.
`UrgentNeedRenew`: The domains that are in urgent need of renewal.
`RedemptionPending`: The domains that are in urgent need of redemption.
`nosubmit`: The domains with unverified identities.
`tran`: The domains that are being transferred in.
     * @param Status The domain status.
`all`: All domains.
`UrgentNeedRenew`: The domains that are in urgent need of renewal.
`RedemptionPending`: The domains that are in urgent need of redemption.
`nosubmit`: The domains with unverified identities.
`tran`: The domains that are being transferred in.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The DNS type. Valid values: `1` (DNSPod), `2` (others). 
     * @return DnsStatus The DNS type. Valid values: `1` (DNSPod), `2` (others).
     */
    public Long getDnsStatus() {
        return this.DnsStatus;
    }

    /**
     * Set The DNS type. Valid values: `1` (DNSPod), `2` (others).
     * @param DnsStatus The DNS type. Valid values: `1` (DNSPod), `2` (others).
     */
    public void setDnsStatus(Long DnsStatus) {
        this.DnsStatus = DnsStatus;
    }

    /**
     * Get The domain sort order. Valid values: `1` (descending), `2` (ascending). 
     * @return OrderByDomainName The domain sort order. Valid values: `1` (descending), `2` (ascending).
     */
    public Long getOrderByDomainName() {
        return this.OrderByDomainName;
    }

    /**
     * Set The domain sort order. Valid values: `1` (descending), `2` (ascending).
     * @param OrderByDomainName The domain sort order. Valid values: `1` (descending), `2` (ascending).
     */
    public void setOrderByDomainName(Long OrderByDomainName) {
        this.OrderByDomainName = OrderByDomainName;
    }

    public DescribeIntlDomainListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntlDomainListRequest(DescribeIntlDomainListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
        if (source.OrderByRegTime != null) {
            this.OrderByRegTime = new Long(source.OrderByRegTime);
        }
        if (source.OrderByExpireTime != null) {
            this.OrderByExpireTime = new Long(source.OrderByExpireTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DnsStatus != null) {
            this.DnsStatus = new Long(source.DnsStatus);
        }
        if (source.OrderByDomainName != null) {
            this.OrderByDomainName = new Long(source.OrderByDomainName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "OrderByRegTime", this.OrderByRegTime);
        this.setParamSimple(map, prefix + "OrderByExpireTime", this.OrderByExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DnsStatus", this.DnsStatus);
        this.setParamSimple(map, prefix + "OrderByDomainName", this.OrderByDomainName);

    }
}

