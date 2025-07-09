/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class DescribeCostExplorerSummaryRequest extends AbstractModel {

    /**
    * The start time of the period in the format of yyyy-mm-dd hh:ii:ss.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * The end time of the period in the format of yyyy-mm-dd hh:ii:ss.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Bill type: 1-cost bill, 2-consumption bill
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * Statistical period: day-day, month-month;
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * Classification dimension (data aggregation dimension). Query classification dimension. (Use classification dimension code input parameter.) Input parameter enumeration value:default = Total only
feeType = Fee typebillType = Bill typebusiness = Product
product = Sub-productregion=Region
zone = Availability zoneactionType = Transaction typepayMode = Billing modetags = Tagproject = ProjectpayerUin = Payer accountownerUin = User account
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * Fee type: cost-total cost, totalCost-original price cost
    */
    @SerializedName("FeeType")
    @Expose
    private String FeeType;

    /**
    * Quantity. The maximum value per page is 100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Starting page, where PageNo=1 indicates the first page, PageNo=2 indicates the second page, and so on.
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * Cost allocation tag value
    */
    @SerializedName("TagKeyStr")
    @Expose
    private String TagKeyStr;

    /**
    * Whether the filter box is needed: 1- indicates it is needed, 0- indicates it is not needed. If it is not specified, it is not required by default.
    */
    @SerializedName("NeedConditionValue")
    @Expose
    private String NeedConditionValue;

    /**
    * Filter parameters
    */
    @SerializedName("Conditions")
    @Expose
    private AnalyseConditions Conditions;

    /**
     * Get The start time of the period in the format of yyyy-mm-dd hh:ii:ss. 
     * @return BeginTime The start time of the period in the format of yyyy-mm-dd hh:ii:ss.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The start time of the period in the format of yyyy-mm-dd hh:ii:ss.
     * @param BeginTime The start time of the period in the format of yyyy-mm-dd hh:ii:ss.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The end time of the period in the format of yyyy-mm-dd hh:ii:ss. 
     * @return EndTime The end time of the period in the format of yyyy-mm-dd hh:ii:ss.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of the period in the format of yyyy-mm-dd hh:ii:ss.
     * @param EndTime The end time of the period in the format of yyyy-mm-dd hh:ii:ss.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Bill type: 1-cost bill, 2-consumption bill 
     * @return BillType Bill type: 1-cost bill, 2-consumption bill
     */
    public String getBillType() {
        return this.BillType;
    }

    /**
     * Set Bill type: 1-cost bill, 2-consumption bill
     * @param BillType Bill type: 1-cost bill, 2-consumption bill
     */
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    /**
     * Get Statistical period: day-day, month-month; 
     * @return PeriodType Statistical period: day-day, month-month;
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set Statistical period: day-day, month-month;
     * @param PeriodType Statistical period: day-day, month-month;
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get Classification dimension (data aggregation dimension). Query classification dimension. (Use classification dimension code input parameter.) Input parameter enumeration value:default = Total only
feeType = Fee typebillType = Bill typebusiness = Product
product = Sub-productregion=Region
zone = Availability zoneactionType = Transaction typepayMode = Billing modetags = Tagproject = ProjectpayerUin = Payer accountownerUin = User account 
     * @return Dimensions Classification dimension (data aggregation dimension). Query classification dimension. (Use classification dimension code input parameter.) Input parameter enumeration value:default = Total only
feeType = Fee typebillType = Bill typebusiness = Product
product = Sub-productregion=Region
zone = Availability zoneactionType = Transaction typepayMode = Billing modetags = Tagproject = ProjectpayerUin = Payer accountownerUin = User account
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Classification dimension (data aggregation dimension). Query classification dimension. (Use classification dimension code input parameter.) Input parameter enumeration value:default = Total only
feeType = Fee typebillType = Bill typebusiness = Product
product = Sub-productregion=Region
zone = Availability zoneactionType = Transaction typepayMode = Billing modetags = Tagproject = ProjectpayerUin = Payer accountownerUin = User account
     * @param Dimensions Classification dimension (data aggregation dimension). Query classification dimension. (Use classification dimension code input parameter.) Input parameter enumeration value:default = Total only
feeType = Fee typebillType = Bill typebusiness = Product
product = Sub-productregion=Region
zone = Availability zoneactionType = Transaction typepayMode = Billing modetags = Tagproject = ProjectpayerUin = Payer accountownerUin = User account
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get Fee type: cost-total cost, totalCost-original price cost 
     * @return FeeType Fee type: cost-total cost, totalCost-original price cost
     */
    public String getFeeType() {
        return this.FeeType;
    }

    /**
     * Set Fee type: cost-total cost, totalCost-original price cost
     * @param FeeType Fee type: cost-total cost, totalCost-original price cost
     */
    public void setFeeType(String FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get Quantity. The maximum value per page is 100. 
     * @return PageSize Quantity. The maximum value per page is 100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Quantity. The maximum value per page is 100.
     * @param PageSize Quantity. The maximum value per page is 100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Starting page, where PageNo=1 indicates the first page, PageNo=2 indicates the second page, and so on. 
     * @return PageNo Starting page, where PageNo=1 indicates the first page, PageNo=2 indicates the second page, and so on.
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Starting page, where PageNo=1 indicates the first page, PageNo=2 indicates the second page, and so on.
     * @param PageNo Starting page, where PageNo=1 indicates the first page, PageNo=2 indicates the second page, and so on.
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get Cost allocation tag value 
     * @return TagKeyStr Cost allocation tag value
     */
    public String getTagKeyStr() {
        return this.TagKeyStr;
    }

    /**
     * Set Cost allocation tag value
     * @param TagKeyStr Cost allocation tag value
     */
    public void setTagKeyStr(String TagKeyStr) {
        this.TagKeyStr = TagKeyStr;
    }

    /**
     * Get Whether the filter box is needed: 1- indicates it is needed, 0- indicates it is not needed. If it is not specified, it is not required by default. 
     * @return NeedConditionValue Whether the filter box is needed: 1- indicates it is needed, 0- indicates it is not needed. If it is not specified, it is not required by default.
     */
    public String getNeedConditionValue() {
        return this.NeedConditionValue;
    }

    /**
     * Set Whether the filter box is needed: 1- indicates it is needed, 0- indicates it is not needed. If it is not specified, it is not required by default.
     * @param NeedConditionValue Whether the filter box is needed: 1- indicates it is needed, 0- indicates it is not needed. If it is not specified, it is not required by default.
     */
    public void setNeedConditionValue(String NeedConditionValue) {
        this.NeedConditionValue = NeedConditionValue;
    }

    /**
     * Get Filter parameters 
     * @return Conditions Filter parameters
     */
    public AnalyseConditions getConditions() {
        return this.Conditions;
    }

    /**
     * Set Filter parameters
     * @param Conditions Filter parameters
     */
    public void setConditions(AnalyseConditions Conditions) {
        this.Conditions = Conditions;
    }

    public DescribeCostExplorerSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCostExplorerSummaryRequest(DescribeCostExplorerSummaryRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
        if (source.FeeType != null) {
            this.FeeType = new String(source.FeeType);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.TagKeyStr != null) {
            this.TagKeyStr = new String(source.TagKeyStr);
        }
        if (source.NeedConditionValue != null) {
            this.NeedConditionValue = new String(source.NeedConditionValue);
        }
        if (source.Conditions != null) {
            this.Conditions = new AnalyseConditions(source.Conditions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamSimple(map, prefix + "FeeType", this.FeeType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "TagKeyStr", this.TagKeyStr);
        this.setParamSimple(map, prefix + "NeedConditionValue", this.NeedConditionValue);
        this.setParamObj(map, prefix + "Conditions.", this.Conditions);

    }
}

