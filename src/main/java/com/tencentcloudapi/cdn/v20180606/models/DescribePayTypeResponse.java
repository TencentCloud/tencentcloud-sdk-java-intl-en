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
`flux`: Bill by traffic
`bandwidth`: Bill by bandwidth
`request`: Bill by the number of requests
`flux_sep`: Disused field
`bandwidth_sep`: Disused field
When you change a daily billing mode to another, and there is network usage on the day of change, this field shows the new billing mode, which takes effect from the next day. If there is no network usage on the day of change, this field shows the new billing mode directly.
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * Billing cycle:
`day`: Daily
`month`: Monthly 
`hour`: Hourly 
    */
    @SerializedName("BillingCycle")
    @Expose
    private String BillingCycle;

    /**
    * `monthMax`: Billed by the monthly average of daily peak traffic (monthly settlement)
`day95`: Billed by the daily 95th percentile bandwidth (monthly settlement)
`month95`: Billed by the monthly 95th percentile bandwidth (monthly settlement)
`sum`: Billed by the total traffic/total requests (daily or monthly settlement)
`max`: Billed by the peak bandwidth (daily settlement)
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * Billing method for regions outside the Chinese mainland:
`all`: Unified billing for all regions
`multiple`: Region-specific billing
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * The current billing mode in effect:
`flux`: Billed by traffic
`bandwidth`: Billed by bandwidth
`request`: Billed by the number of requests
`flux_sep`: Disused field
`bandwidth_sep`: Disused field
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
`flux`: Bill by traffic
`bandwidth`: Bill by bandwidth
`request`: Bill by the number of requests
`flux_sep`: Disused field
`bandwidth_sep`: Disused field
When you change a daily billing mode to another, and there is network usage on the day of change, this field shows the new billing mode, which takes effect from the next day. If there is no network usage on the day of change, this field shows the new billing mode directly. 
     * @return PayType Billing modes:
`flux`: Bill by traffic
`bandwidth`: Bill by bandwidth
`request`: Bill by the number of requests
`flux_sep`: Disused field
`bandwidth_sep`: Disused field
When you change a daily billing mode to another, and there is network usage on the day of change, this field shows the new billing mode, which takes effect from the next day. If there is no network usage on the day of change, this field shows the new billing mode directly.
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set Billing modes:
`flux`: Bill by traffic
`bandwidth`: Bill by bandwidth
`request`: Bill by the number of requests
`flux_sep`: Disused field
`bandwidth_sep`: Disused field
When you change a daily billing mode to another, and there is network usage on the day of change, this field shows the new billing mode, which takes effect from the next day. If there is no network usage on the day of change, this field shows the new billing mode directly.
     * @param PayType Billing modes:
`flux`: Bill by traffic
`bandwidth`: Bill by bandwidth
`request`: Bill by the number of requests
`flux_sep`: Disused field
`bandwidth_sep`: Disused field
When you change a daily billing mode to another, and there is network usage on the day of change, this field shows the new billing mode, which takes effect from the next day. If there is no network usage on the day of change, this field shows the new billing mode directly.
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Billing cycle:
`day`: Daily
`month`: Monthly 
`hour`: Hourly  
     * @return BillingCycle Billing cycle:
`day`: Daily
`month`: Monthly 
`hour`: Hourly 
     */
    public String getBillingCycle() {
        return this.BillingCycle;
    }

    /**
     * Set Billing cycle:
`day`: Daily
`month`: Monthly 
`hour`: Hourly 
     * @param BillingCycle Billing cycle:
`day`: Daily
`month`: Monthly 
`hour`: Hourly 
     */
    public void setBillingCycle(String BillingCycle) {
        this.BillingCycle = BillingCycle;
    }

    /**
     * Get `monthMax`: Billed by the monthly average of daily peak traffic (monthly settlement)
`day95`: Billed by the daily 95th percentile bandwidth (monthly settlement)
`month95`: Billed by the monthly 95th percentile bandwidth (monthly settlement)
`sum`: Billed by the total traffic/total requests (daily or monthly settlement)
`max`: Billed by the peak bandwidth (daily settlement) 
     * @return StatType `monthMax`: Billed by the monthly average of daily peak traffic (monthly settlement)
`day95`: Billed by the daily 95th percentile bandwidth (monthly settlement)
`month95`: Billed by the monthly 95th percentile bandwidth (monthly settlement)
`sum`: Billed by the total traffic/total requests (daily or monthly settlement)
`max`: Billed by the peak bandwidth (daily settlement)
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set `monthMax`: Billed by the monthly average of daily peak traffic (monthly settlement)
`day95`: Billed by the daily 95th percentile bandwidth (monthly settlement)
`month95`: Billed by the monthly 95th percentile bandwidth (monthly settlement)
`sum`: Billed by the total traffic/total requests (daily or monthly settlement)
`max`: Billed by the peak bandwidth (daily settlement)
     * @param StatType `monthMax`: Billed by the monthly average of daily peak traffic (monthly settlement)
`day95`: Billed by the daily 95th percentile bandwidth (monthly settlement)
`month95`: Billed by the monthly 95th percentile bandwidth (monthly settlement)
`sum`: Billed by the total traffic/total requests (daily or monthly settlement)
`max`: Billed by the peak bandwidth (daily settlement)
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get Billing method for regions outside the Chinese mainland:
`all`: Unified billing for all regions
`multiple`: Region-specific billing 
     * @return RegionType Billing method for regions outside the Chinese mainland:
`all`: Unified billing for all regions
`multiple`: Region-specific billing
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set Billing method for regions outside the Chinese mainland:
`all`: Unified billing for all regions
`multiple`: Region-specific billing
     * @param RegionType Billing method for regions outside the Chinese mainland:
`all`: Unified billing for all regions
`multiple`: Region-specific billing
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get The current billing mode in effect:
`flux`: Billed by traffic
`bandwidth`: Billed by bandwidth
`request`: Billed by the number of requests
`flux_sep`: Disused field
`bandwidth_sep`: Disused field 
     * @return CurrentPayType The current billing mode in effect:
`flux`: Billed by traffic
`bandwidth`: Billed by bandwidth
`request`: Billed by the number of requests
`flux_sep`: Disused field
`bandwidth_sep`: Disused field
     */
    public String getCurrentPayType() {
        return this.CurrentPayType;
    }

    /**
     * Set The current billing mode in effect:
`flux`: Billed by traffic
`bandwidth`: Billed by bandwidth
`request`: Billed by the number of requests
`flux_sep`: Disused field
`bandwidth_sep`: Disused field
     * @param CurrentPayType The current billing mode in effect:
`flux`: Billed by traffic
`bandwidth`: Billed by bandwidth
`request`: Billed by the number of requests
`flux_sep`: Disused field
`bandwidth_sep`: Disused field
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

