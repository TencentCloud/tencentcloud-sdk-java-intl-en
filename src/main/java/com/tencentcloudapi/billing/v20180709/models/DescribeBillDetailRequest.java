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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillDetailRequest extends AbstractModel{

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Quantity, maximum is 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The period type. byUsedTime: By usage period; byPayTime: By payment period. Must be the same as the period of the current monthly bill of the Billing Center. You can check your bill statistics period type at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page. 
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * Month; format: yyyy-mm. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * The start time of the period; format: Y-m-d H:i:s. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. BeginTime and EndTime must be inputted as a pair. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * The end time of the period; format: Y-m-d H:i:s. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. BeginTime and EndTime must be inputted as a pair. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Indicates whether or not the total number of records of accessing the list is required, used for frontend pages.
1 = yes, 0 = no
    */
    @SerializedName("NeedRecordNum")
    @Expose
    private Long NeedRecordNum;

    /**
    * Queries information on a specified product
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Billing mode: prePay/postPay
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Queries information on a specified resource
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Project ID: ID of the project to which the resource belongs
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

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
     * Get Quantity, maximum is 100 
     * @return Limit Quantity, maximum is 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity, maximum is 100
     * @param Limit Quantity, maximum is 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The period type. byUsedTime: By usage period; byPayTime: By payment period. Must be the same as the period of the current monthly bill of the Billing Center. You can check your bill statistics period type at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page.  
     * @return PeriodType The period type. byUsedTime: By usage period; byPayTime: By payment period. Must be the same as the period of the current monthly bill of the Billing Center. You can check your bill statistics period type at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page. 
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set The period type. byUsedTime: By usage period; byPayTime: By payment period. Must be the same as the period of the current monthly bill of the Billing Center. You can check your bill statistics period type at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page. 
     * @param PeriodType The period type. byUsedTime: By usage period; byPayTime: By payment period. Must be the same as the period of the current monthly bill of the Billing Center. You can check your bill statistics period type at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page. 
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get Month; format: yyyy-mm. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available. 
     * @return Month Month; format: yyyy-mm. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Month; format: yyyy-mm. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
     * @param Month Month; format: yyyy-mm. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get The start time of the period; format: Y-m-d H:i:s. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. BeginTime and EndTime must be inputted as a pair. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available. 
     * @return BeginTime The start time of the period; format: Y-m-d H:i:s. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. BeginTime and EndTime must be inputted as a pair. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The start time of the period; format: Y-m-d H:i:s. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. BeginTime and EndTime must be inputted as a pair. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
     * @param BeginTime The start time of the period; format: Y-m-d H:i:s. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. BeginTime and EndTime must be inputted as a pair. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The end time of the period; format: Y-m-d H:i:s. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. BeginTime and EndTime must be inputted as a pair. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available. 
     * @return EndTime The end time of the period; format: Y-m-d H:i:s. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. BeginTime and EndTime must be inputted as a pair. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of the period; format: Y-m-d H:i:s. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. BeginTime and EndTime must be inputted as a pair. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
     * @param EndTime The end time of the period; format: Y-m-d H:i:s. You only have to enter either Month or BeginTime and EndTime. When you enter values for BeginTime and EndTime, Month becomes invalid. BeginTime and EndTime must be inputted as a pair. This value must be no earlier than the month when Bill 2.0 is activated; last 24 months data are available.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Indicates whether or not the total number of records of accessing the list is required, used for frontend pages.
1 = yes, 0 = no 
     * @return NeedRecordNum Indicates whether or not the total number of records of accessing the list is required, used for frontend pages.
1 = yes, 0 = no
     */
    public Long getNeedRecordNum() {
        return this.NeedRecordNum;
    }

    /**
     * Set Indicates whether or not the total number of records of accessing the list is required, used for frontend pages.
1 = yes, 0 = no
     * @param NeedRecordNum Indicates whether or not the total number of records of accessing the list is required, used for frontend pages.
1 = yes, 0 = no
     */
    public void setNeedRecordNum(Long NeedRecordNum) {
        this.NeedRecordNum = NeedRecordNum;
    }

    /**
     * Get Queries information on a specified product 
     * @return ProductCode Queries information on a specified product
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Queries information on a specified product
     * @param ProductCode Queries information on a specified product
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Billing mode: prePay/postPay 
     * @return PayMode Billing mode: prePay/postPay
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode: prePay/postPay
     * @param PayMode Billing mode: prePay/postPay
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Queries information on a specified resource 
     * @return ResourceId Queries information on a specified resource
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Queries information on a specified resource
     * @param ResourceId Queries information on a specified resource
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get  
     * @return ActionType 
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 
     * @param ActionType 
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Project ID: ID of the project to which the resource belongs 
     * @return ProjectId Project ID: ID of the project to which the resource belongs
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID: ID of the project to which the resource belongs
     * @param ProjectId Project ID: ID of the project to which the resource belongs
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NeedRecordNum", this.NeedRecordNum);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

