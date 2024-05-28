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

public class DescribeCostDetailRequest extends AbstractModel {

    /**
    * The number of entries returned at a time. The maximum value is `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Cycle start time in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be entered, and if this field is present, Month becomes invalid. BeginTime and EndTime must be entered together, and must be in the same month. Cross-month retrieval is not currently supported. Data retrievable is the data after cost analysis is activated and within the past 24 months.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Cycle end time in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be entered, and if this field is present, Month becomes invalid. BeginTime and EndTime must be entered together, and must be in the same month. Cross-month retrieval is not currently supported. Data retrievable is the data after cost analysis is activated and within the past 24 months.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Whether the total number of records in the list is needed, for frontend pagination1: needed, 0: not needed
    */
    @SerializedName("NeedRecordNum")
    @Expose
    private Long NeedRecordNum;

    /**
    * Month, in the format of yyyy-mm. Either Month or BeginTime&EndTime must be entered, and if BeginTime&EndTime is entered, Month becomes invalid. It cannot be earlier than the month when cost analysis is activated. Data of up to 24 months can be retrieved.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Used to query information of a specified product (currently not available)
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Payment mode. Options include prePay and postPay.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Used to query information of a specified resource
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get The number of entries returned at a time. The maximum value is `100`. 
     * @return Limit The number of entries returned at a time. The maximum value is `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of entries returned at a time. The maximum value is `100`.
     * @param Limit The number of entries returned at a time. The maximum value is `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Cycle start time in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be entered, and if this field is present, Month becomes invalid. BeginTime and EndTime must be entered together, and must be in the same month. Cross-month retrieval is not currently supported. Data retrievable is the data after cost analysis is activated and within the past 24 months. 
     * @return BeginTime Cycle start time in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be entered, and if this field is present, Month becomes invalid. BeginTime and EndTime must be entered together, and must be in the same month. Cross-month retrieval is not currently supported. Data retrievable is the data after cost analysis is activated and within the past 24 months.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Cycle start time in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be entered, and if this field is present, Month becomes invalid. BeginTime and EndTime must be entered together, and must be in the same month. Cross-month retrieval is not currently supported. Data retrievable is the data after cost analysis is activated and within the past 24 months.
     * @param BeginTime Cycle start time in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be entered, and if this field is present, Month becomes invalid. BeginTime and EndTime must be entered together, and must be in the same month. Cross-month retrieval is not currently supported. Data retrievable is the data after cost analysis is activated and within the past 24 months.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Cycle end time in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be entered, and if this field is present, Month becomes invalid. BeginTime and EndTime must be entered together, and must be in the same month. Cross-month retrieval is not currently supported. Data retrievable is the data after cost analysis is activated and within the past 24 months. 
     * @return EndTime Cycle end time in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be entered, and if this field is present, Month becomes invalid. BeginTime and EndTime must be entered together, and must be in the same month. Cross-month retrieval is not currently supported. Data retrievable is the data after cost analysis is activated and within the past 24 months.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Cycle end time in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be entered, and if this field is present, Month becomes invalid. BeginTime and EndTime must be entered together, and must be in the same month. Cross-month retrieval is not currently supported. Data retrievable is the data after cost analysis is activated and within the past 24 months.
     * @param EndTime Cycle end time in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be entered, and if this field is present, Month becomes invalid. BeginTime and EndTime must be entered together, and must be in the same month. Cross-month retrieval is not currently supported. Data retrievable is the data after cost analysis is activated and within the past 24 months.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Whether the total number of records in the list is needed, for frontend pagination1: needed, 0: not needed 
     * @return NeedRecordNum Whether the total number of records in the list is needed, for frontend pagination1: needed, 0: not needed
     */
    public Long getNeedRecordNum() {
        return this.NeedRecordNum;
    }

    /**
     * Set Whether the total number of records in the list is needed, for frontend pagination1: needed, 0: not needed
     * @param NeedRecordNum Whether the total number of records in the list is needed, for frontend pagination1: needed, 0: not needed
     */
    public void setNeedRecordNum(Long NeedRecordNum) {
        this.NeedRecordNum = NeedRecordNum;
    }

    /**
     * Get Month, in the format of yyyy-mm. Either Month or BeginTime&EndTime must be entered, and if BeginTime&EndTime is entered, Month becomes invalid. It cannot be earlier than the month when cost analysis is activated. Data of up to 24 months can be retrieved. 
     * @return Month Month, in the format of yyyy-mm. Either Month or BeginTime&EndTime must be entered, and if BeginTime&EndTime is entered, Month becomes invalid. It cannot be earlier than the month when cost analysis is activated. Data of up to 24 months can be retrieved.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Month, in the format of yyyy-mm. Either Month or BeginTime&EndTime must be entered, and if BeginTime&EndTime is entered, Month becomes invalid. It cannot be earlier than the month when cost analysis is activated. Data of up to 24 months can be retrieved.
     * @param Month Month, in the format of yyyy-mm. Either Month or BeginTime&EndTime must be entered, and if BeginTime&EndTime is entered, Month becomes invalid. It cannot be earlier than the month when cost analysis is activated. Data of up to 24 months can be retrieved.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Used to query information of a specified product (currently not available) 
     * @return ProductCode Used to query information of a specified product (currently not available)
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Used to query information of a specified product (currently not available)
     * @param ProductCode Used to query information of a specified product (currently not available)
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Payment mode. Options include prePay and postPay. 
     * @return PayMode Payment mode. Options include prePay and postPay.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode. Options include prePay and postPay.
     * @param PayMode Payment mode. Options include prePay and postPay.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Used to query information of a specified resource 
     * @return ResourceId Used to query information of a specified resource
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Used to query information of a specified resource
     * @param ResourceId Used to query information of a specified resource
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public DescribeCostDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCostDetailRequest(DescribeCostDetailRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NeedRecordNum != null) {
            this.NeedRecordNum = new Long(source.NeedRecordNum);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NeedRecordNum", this.NeedRecordNum);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

