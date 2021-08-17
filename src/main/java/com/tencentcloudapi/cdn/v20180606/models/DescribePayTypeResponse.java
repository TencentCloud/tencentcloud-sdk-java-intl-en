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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePayTypeResponse extends AbstractModel{

    /**
    * Billing modes:
`flux`: bill-by-traffic
`bandwidth`: bill-by-bandwidth
`request`: bill-by-request
In case the billing mode is changed in the day, if there is bandwidth consumption occurred in the current day, the billing mode returned is the new billing mode for the next day. If no bandwidth consumption occurs, it indicates the current billing mode.
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * Billing cycle:
day: daily settlement
month: monthly settlement
    */
    @SerializedName("BillingCycle")
    @Expose
    private String BillingCycle;

    /**
    * `monthMax`: billed by the monthly average of daily peak traffic (monthly settlement)
`day95`: billed by the daily 95th percentile bandwidth (monthly settlement)
`month95`: billed by the monthly 95th percentile bandwidth (monthly settlement)
`sum`: billed by the total traffic/total requests (daily or monthly settlement)
`max`: billed by the peak bandwidth (daily settlement)
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * Billing method outside Mainland China:
`all`: unified billing for all regions
`multiple`: separate billing for different regions
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * The current billing mode in effect:
`flux`: bill-by-traffic
`bandwidth`: bill-by-bandwidth
`request`: bill-by-request
    */
    @SerializedName("CurrentPayType")
    @Expose
    private String CurrentPayType;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Billing modes:
`flux`: bill-by-traffic
`bandwidth`: bill-by-bandwidth
`request`: bill-by-request
In case the billing mode is changed in the day, if there is bandwidth consumption occurred in the current day, the billing mode returned is the new billing mode for the next day. If no bandwidth consumption occurs, it indicates the current billing mode. 
     * @return PayType Billing modes:
`flux`: bill-by-traffic
`bandwidth`: bill-by-bandwidth
`request`: bill-by-request
In case the billing mode is changed in the day, if there is bandwidth consumption occurred in the current day, the billing mode returned is the new billing mode for the next day. If no bandwidth consumption occurs, it indicates the current billing mode.
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set Billing modes:
`flux`: bill-by-traffic
`bandwidth`: bill-by-bandwidth
`request`: bill-by-request
In case the billing mode is changed in the day, if there is bandwidth consumption occurred in the current day, the billing mode returned is the new billing mode for the next day. If no bandwidth consumption occurs, it indicates the current billing mode.
     * @param PayType Billing modes:
`flux`: bill-by-traffic
`bandwidth`: bill-by-bandwidth
`request`: bill-by-request
In case the billing mode is changed in the day, if there is bandwidth consumption occurred in the current day, the billing mode returned is the new billing mode for the next day. If no bandwidth consumption occurs, it indicates the current billing mode.
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Billing cycle:
day: daily settlement
month: monthly settlement 
     * @return BillingCycle Billing cycle:
day: daily settlement
month: monthly settlement
     */
    public String getBillingCycle() {
        return this.BillingCycle;
    }

    /**
     * Set Billing cycle:
day: daily settlement
month: monthly settlement
     * @param BillingCycle Billing cycle:
day: daily settlement
month: monthly settlement
     */
    public void setBillingCycle(String BillingCycle) {
        this.BillingCycle = BillingCycle;
    }

    /**
     * Get `monthMax`: billed by the monthly average of daily peak traffic (monthly settlement)
`day95`: billed by the daily 95th percentile bandwidth (monthly settlement)
`month95`: billed by the monthly 95th percentile bandwidth (monthly settlement)
`sum`: billed by the total traffic/total requests (daily or monthly settlement)
`max`: billed by the peak bandwidth (daily settlement) 
     * @return StatType `monthMax`: billed by the monthly average of daily peak traffic (monthly settlement)
`day95`: billed by the daily 95th percentile bandwidth (monthly settlement)
`month95`: billed by the monthly 95th percentile bandwidth (monthly settlement)
`sum`: billed by the total traffic/total requests (daily or monthly settlement)
`max`: billed by the peak bandwidth (daily settlement)
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set `monthMax`: billed by the monthly average of daily peak traffic (monthly settlement)
`day95`: billed by the daily 95th percentile bandwidth (monthly settlement)
`month95`: billed by the monthly 95th percentile bandwidth (monthly settlement)
`sum`: billed by the total traffic/total requests (daily or monthly settlement)
`max`: billed by the peak bandwidth (daily settlement)
     * @param StatType `monthMax`: billed by the monthly average of daily peak traffic (monthly settlement)
`day95`: billed by the daily 95th percentile bandwidth (monthly settlement)
`month95`: billed by the monthly 95th percentile bandwidth (monthly settlement)
`sum`: billed by the total traffic/total requests (daily or monthly settlement)
`max`: billed by the peak bandwidth (daily settlement)
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get Billing method outside Mainland China:
`all`: unified billing for all regions
`multiple`: separate billing for different regions 
     * @return RegionType Billing method outside Mainland China:
`all`: unified billing for all regions
`multiple`: separate billing for different regions
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set Billing method outside Mainland China:
`all`: unified billing for all regions
`multiple`: separate billing for different regions
     * @param RegionType Billing method outside Mainland China:
`all`: unified billing for all regions
`multiple`: separate billing for different regions
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get The current billing mode in effect:
`flux`: bill-by-traffic
`bandwidth`: bill-by-bandwidth
`request`: bill-by-request 
     * @return CurrentPayType The current billing mode in effect:
`flux`: bill-by-traffic
`bandwidth`: bill-by-bandwidth
`request`: bill-by-request
     */
    public String getCurrentPayType() {
        return this.CurrentPayType;
    }

    /**
     * Set The current billing mode in effect:
`flux`: bill-by-traffic
`bandwidth`: bill-by-bandwidth
`request`: bill-by-request
     * @param CurrentPayType The current billing mode in effect:
`flux`: bill-by-traffic
`bandwidth`: bill-by-bandwidth
`request`: bill-by-request
     */
    public void setCurrentPayType(String CurrentPayType) {
        this.CurrentPayType = CurrentPayType;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePayTypeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePayTypeResponse(DescribePayTypeResponse source) {
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.BillingCycle != null) {
            this.BillingCycle = new String(source.BillingCycle);
        }
        if (source.StatType != null) {
            this.StatType = new String(source.StatType);
        }
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.CurrentPayType != null) {
            this.CurrentPayType = new String(source.CurrentPayType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "BillingCycle", this.BillingCycle);
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamSimple(map, prefix + "CurrentPayType", this.CurrentPayType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

