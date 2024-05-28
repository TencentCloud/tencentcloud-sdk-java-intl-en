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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCostSummaryByResourceRequest extends AbstractModel {

    /**
    * The value must be of the same month as EndTime. The query period must start and end on the same month and the query result returned will be of the entire month. For example, if both BeginTime and EndTime are 2018-09, the data returned will be for the entire month of September 2018.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * The value must be of the same month as BeginTime. The query period must start and end on the same month and the query result returned will be of the entire month. For example, if both BeginTime and EndTime are 2018-09, the data returned will be for the entire month of September 2018.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Data quantity per fetch. The maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which starts from 0 by default
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * UIN of the user querying the bill data
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * Whether to return the record count. 0 for no, 1 for yes. Default is no.
    */
    @SerializedName("NeedRecordNum")
    @Expose
    private Long NeedRecordNum;

    /**
    * Whether to return filter criteria. 0 for no, 1 for yes. Default is no.
    */
    @SerializedName("NeedConditionValue")
    @Expose
    private Long NeedConditionValue;

    /**
    * Filter criteria. It only supports ResourceKeyword (resource keyword, which supports fuzzy query by resource ID or resource name), ProjectIds (project ID), RegionIds (region ID), PayModes (payment mode, prePay or postPay), HideFreeCost (whether to hide zero-amount transactions, 0 or 1), and OrderByCost (sorting rule by fees, desc or asc).
    */
    @SerializedName("Conditions")
    @Expose
    private Conditions Conditions;

    /**
     * Get The value must be of the same month as EndTime. The query period must start and end on the same month and the query result returned will be of the entire month. For example, if both BeginTime and EndTime are 2018-09, the data returned will be for the entire month of September 2018. 
     * @return BeginTime The value must be of the same month as EndTime. The query period must start and end on the same month and the query result returned will be of the entire month. For example, if both BeginTime and EndTime are 2018-09, the data returned will be for the entire month of September 2018.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The value must be of the same month as EndTime. The query period must start and end on the same month and the query result returned will be of the entire month. For example, if both BeginTime and EndTime are 2018-09, the data returned will be for the entire month of September 2018.
     * @param BeginTime The value must be of the same month as EndTime. The query period must start and end on the same month and the query result returned will be of the entire month. For example, if both BeginTime and EndTime are 2018-09, the data returned will be for the entire month of September 2018.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The value must be of the same month as BeginTime. The query period must start and end on the same month and the query result returned will be of the entire month. For example, if both BeginTime and EndTime are 2018-09, the data returned will be for the entire month of September 2018. 
     * @return EndTime The value must be of the same month as BeginTime. The query period must start and end on the same month and the query result returned will be of the entire month. For example, if both BeginTime and EndTime are 2018-09, the data returned will be for the entire month of September 2018.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The value must be of the same month as BeginTime. The query period must start and end on the same month and the query result returned will be of the entire month. For example, if both BeginTime and EndTime are 2018-09, the data returned will be for the entire month of September 2018.
     * @param EndTime The value must be of the same month as BeginTime. The query period must start and end on the same month and the query result returned will be of the entire month. For example, if both BeginTime and EndTime are 2018-09, the data returned will be for the entire month of September 2018.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Data quantity per fetch. The maximum value is 100. 
     * @return Limit Data quantity per fetch. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Data quantity per fetch. The maximum value is 100.
     * @param Limit Data quantity per fetch. The maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which starts from 0 by default 
     * @return Offset Offset, which starts from 0 by default
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which starts from 0 by default
     * @param Offset Offset, which starts from 0 by default
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get UIN of the user querying the bill data 
     * @return PayerUin UIN of the user querying the bill data
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set UIN of the user querying the bill data
     * @param PayerUin UIN of the user querying the bill data
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get Whether to return the record count. 0 for no, 1 for yes. Default is no. 
     * @return NeedRecordNum Whether to return the record count. 0 for no, 1 for yes. Default is no.
     */
    public Long getNeedRecordNum() {
        return this.NeedRecordNum;
    }

    /**
     * Set Whether to return the record count. 0 for no, 1 for yes. Default is no.
     * @param NeedRecordNum Whether to return the record count. 0 for no, 1 for yes. Default is no.
     */
    public void setNeedRecordNum(Long NeedRecordNum) {
        this.NeedRecordNum = NeedRecordNum;
    }

    /**
     * Get Whether to return filter criteria. 0 for no, 1 for yes. Default is no. 
     * @return NeedConditionValue Whether to return filter criteria. 0 for no, 1 for yes. Default is no.
     */
    public Long getNeedConditionValue() {
        return this.NeedConditionValue;
    }

    /**
     * Set Whether to return filter criteria. 0 for no, 1 for yes. Default is no.
     * @param NeedConditionValue Whether to return filter criteria. 0 for no, 1 for yes. Default is no.
     */
    public void setNeedConditionValue(Long NeedConditionValue) {
        this.NeedConditionValue = NeedConditionValue;
    }

    /**
     * Get Filter criteria. It only supports ResourceKeyword (resource keyword, which supports fuzzy query by resource ID or resource name), ProjectIds (project ID), RegionIds (region ID), PayModes (payment mode, prePay or postPay), HideFreeCost (whether to hide zero-amount transactions, 0 or 1), and OrderByCost (sorting rule by fees, desc or asc). 
     * @return Conditions Filter criteria. It only supports ResourceKeyword (resource keyword, which supports fuzzy query by resource ID or resource name), ProjectIds (project ID), RegionIds (region ID), PayModes (payment mode, prePay or postPay), HideFreeCost (whether to hide zero-amount transactions, 0 or 1), and OrderByCost (sorting rule by fees, desc or asc).
     */
    public Conditions getConditions() {
        return this.Conditions;
    }

    /**
     * Set Filter criteria. It only supports ResourceKeyword (resource keyword, which supports fuzzy query by resource ID or resource name), ProjectIds (project ID), RegionIds (region ID), PayModes (payment mode, prePay or postPay), HideFreeCost (whether to hide zero-amount transactions, 0 or 1), and OrderByCost (sorting rule by fees, desc or asc).
     * @param Conditions Filter criteria. It only supports ResourceKeyword (resource keyword, which supports fuzzy query by resource ID or resource name), ProjectIds (project ID), RegionIds (region ID), PayModes (payment mode, prePay or postPay), HideFreeCost (whether to hide zero-amount transactions, 0 or 1), and OrderByCost (sorting rule by fees, desc or asc).
     */
    public void setConditions(Conditions Conditions) {
        this.Conditions = Conditions;
    }

    public DescribeCostSummaryByResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCostSummaryByResourceRequest(DescribeCostSummaryByResourceRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.NeedRecordNum != null) {
            this.NeedRecordNum = new Long(source.NeedRecordNum);
        }
        if (source.NeedConditionValue != null) {
            this.NeedConditionValue = new Long(source.NeedConditionValue);
        }
        if (source.Conditions != null) {
            this.Conditions = new Conditions(source.Conditions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "NeedRecordNum", this.NeedRecordNum);
        this.setParamSimple(map, prefix + "NeedConditionValue", this.NeedConditionValue);
        this.setParamObj(map, prefix + "Conditions.", this.Conditions);

    }
}

