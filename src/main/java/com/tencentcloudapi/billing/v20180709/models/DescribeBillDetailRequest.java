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

public class DescribeBillDetailRequest extends AbstractModel {

    /**
    * Pagination offset. Offset=0 indicates the first page. If Limit=100, Offset=100 indicates the second page, Offset=200 indicates the third page, and so on.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of entries returned at a time. The maximum value is `300`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Period type, byUsedTime by billing period/byPayTime by fee deduction cycle. It should be consistent with the billing cycle for the month in the expense center. You can go to the top of the [bill overview](https://console.cloud.tencent.com/expense/bill/overview) page to view and confirm your billing cycle type.
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * The month is in the format of yyyy-mm. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. Data within the last 18 months can be pulled at most.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * The start time of the period in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. BeginTime and EndTime must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month. Data within the last 18 months can be pulled at most.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * The end time of the period in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. BeginTime and EndTime must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month. Data within the last 18 months can be pulled at most.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Total number of records for access list needed for frontend pagination
1: needed, 0: not needed
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
    * Hourly settlement
Daily settlement
Yearly/monthly subscription
Spot
New yearly/monthly subscription
Yearly/monthly subscription renewal
Yearly/monthly subscription specification adjustment
Yearly/monthly subscription refund
Adjustment - deduction
Adjustment - refund
Hourly RI fee
One-off RI Fee
Hourly Savings Plan fee
Offline project deduction
Offline product deduction
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Project ID: Project ID of the resource
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Product name code
Remark: If needed to obtain BusinessCode used in current month, invoke API: <a href="https://www.tencentcloud.com/document/product/555/35761?from_cn_redirect=1">Get fee distribution by product</a>
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Context information returned from the last request. Paginated query of data for months with Month>=2023-05 can speed up query speed. Recommended for users with data volume at tens of thousands level. Query speed can be improved by 2-10x.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
     * Get Pagination offset. Offset=0 indicates the first page. If Limit=100, Offset=100 indicates the second page, Offset=200 indicates the third page, and so on. 
     * @return Offset Pagination offset. Offset=0 indicates the first page. If Limit=100, Offset=100 indicates the second page, Offset=200 indicates the third page, and so on.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Offset=0 indicates the first page. If Limit=100, Offset=100 indicates the second page, Offset=200 indicates the third page, and so on.
     * @param Offset Pagination offset. Offset=0 indicates the first page. If Limit=100, Offset=100 indicates the second page, Offset=200 indicates the third page, and so on.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of entries returned at a time. The maximum value is `300`. 
     * @return Limit The number of entries returned at a time. The maximum value is `300`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of entries returned at a time. The maximum value is `300`.
     * @param Limit The number of entries returned at a time. The maximum value is `300`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Period type, byUsedTime by billing period/byPayTime by fee deduction cycle. It should be consistent with the billing cycle for the month in the expense center. You can go to the top of the [bill overview](https://console.cloud.tencent.com/expense/bill/overview) page to view and confirm your billing cycle type. 
     * @return PeriodType Period type, byUsedTime by billing period/byPayTime by fee deduction cycle. It should be consistent with the billing cycle for the month in the expense center. You can go to the top of the [bill overview](https://console.cloud.tencent.com/expense/bill/overview) page to view and confirm your billing cycle type.
     * @deprecated
     */
    @Deprecated
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set Period type, byUsedTime by billing period/byPayTime by fee deduction cycle. It should be consistent with the billing cycle for the month in the expense center. You can go to the top of the [bill overview](https://console.cloud.tencent.com/expense/bill/overview) page to view and confirm your billing cycle type.
     * @param PeriodType Period type, byUsedTime by billing period/byPayTime by fee deduction cycle. It should be consistent with the billing cycle for the month in the expense center. You can go to the top of the [bill overview](https://console.cloud.tencent.com/expense/bill/overview) page to view and confirm your billing cycle type.
     * @deprecated
     */
    @Deprecated
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get The month is in the format of yyyy-mm. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. Data within the last 18 months can be pulled at most. 
     * @return Month The month is in the format of yyyy-mm. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. Data within the last 18 months can be pulled at most.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set The month is in the format of yyyy-mm. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. Data within the last 18 months can be pulled at most.
     * @param Month The month is in the format of yyyy-mm. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. Data within the last 18 months can be pulled at most.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get The start time of the period in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. BeginTime and EndTime must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month. Data within the last 18 months can be pulled at most. 
     * @return BeginTime The start time of the period in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. BeginTime and EndTime must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month. Data within the last 18 months can be pulled at most.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The start time of the period in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. BeginTime and EndTime must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month. Data within the last 18 months can be pulled at most.
     * @param BeginTime The start time of the period in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. BeginTime and EndTime must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month. Data within the last 18 months can be pulled at most.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The end time of the period in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. BeginTime and EndTime must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month. Data within the last 18 months can be pulled at most. 
     * @return EndTime The end time of the period in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. BeginTime and EndTime must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month. Data within the last 18 months can be pulled at most.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of the period in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. BeginTime and EndTime must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month. Data within the last 18 months can be pulled at most.
     * @param EndTime The end time of the period in the format of yyyy-mm-dd hh:ii:ss. Either Month or BeginTime&EndTime must be specified. If BeginTime&EndTime is specified, the Month field is invalid. BeginTime and EndTime must be specified together and must be in the same month. Cross-month queries are not supported and the query results are data for the entire month. Data within the last 18 months can be pulled at most.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Total number of records for access list needed for frontend pagination
1: needed, 0: not needed 
     * @return NeedRecordNum Total number of records for access list needed for frontend pagination
1: needed, 0: not needed
     */
    public Long getNeedRecordNum() {
        return this.NeedRecordNum;
    }

    /**
     * Set Total number of records for access list needed for frontend pagination
1: needed, 0: not needed
     * @param NeedRecordNum Total number of records for access list needed for frontend pagination
1: needed, 0: not needed
     */
    public void setNeedRecordNum(Long NeedRecordNum) {
        this.NeedRecordNum = NeedRecordNum;
    }

    /**
     * Get Queries information on a specified product 
     * @return ProductCode Queries information on a specified product
     * @deprecated
     */
    @Deprecated
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Queries information on a specified product
     * @param ProductCode Queries information on a specified product
     * @deprecated
     */
    @Deprecated
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
     * Get Hourly settlement
Daily settlement
Yearly/monthly subscription
Spot
New yearly/monthly subscription
Yearly/monthly subscription renewal
Yearly/monthly subscription specification adjustment
Yearly/monthly subscription refund
Adjustment - deduction
Adjustment - refund
Hourly RI fee
One-off RI Fee
Hourly Savings Plan fee
Offline project deduction
Offline product deduction 
     * @return ActionType Hourly settlement
Daily settlement
Yearly/monthly subscription
Spot
New yearly/monthly subscription
Yearly/monthly subscription renewal
Yearly/monthly subscription specification adjustment
Yearly/monthly subscription refund
Adjustment - deduction
Adjustment - refund
Hourly RI fee
One-off RI Fee
Hourly Savings Plan fee
Offline project deduction
Offline product deduction
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Hourly settlement
Daily settlement
Yearly/monthly subscription
Spot
New yearly/monthly subscription
Yearly/monthly subscription renewal
Yearly/monthly subscription specification adjustment
Yearly/monthly subscription refund
Adjustment - deduction
Adjustment - refund
Hourly RI fee
One-off RI Fee
Hourly Savings Plan fee
Offline project deduction
Offline product deduction
     * @param ActionType Hourly settlement
Daily settlement
Yearly/monthly subscription
Spot
New yearly/monthly subscription
Yearly/monthly subscription renewal
Yearly/monthly subscription specification adjustment
Yearly/monthly subscription refund
Adjustment - deduction
Adjustment - refund
Hourly RI fee
One-off RI Fee
Hourly Savings Plan fee
Offline project deduction
Offline product deduction
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Project ID: Project ID of the resource 
     * @return ProjectId Project ID: Project ID of the resource
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID: Project ID of the resource
     * @param ProjectId Project ID: Project ID of the resource
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Product name code
Remark: If needed to obtain BusinessCode used in current month, invoke API: <a href="https://www.tencentcloud.com/document/product/555/35761?from_cn_redirect=1">Get fee distribution by product</a> 
     * @return BusinessCode Product name code
Remark: If needed to obtain BusinessCode used in current month, invoke API: <a href="https://www.tencentcloud.com/document/product/555/35761?from_cn_redirect=1">Get fee distribution by product</a>
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product name code
Remark: If needed to obtain BusinessCode used in current month, invoke API: <a href="https://www.tencentcloud.com/document/product/555/35761?from_cn_redirect=1">Get fee distribution by product</a>
     * @param BusinessCode Product name code
Remark: If needed to obtain BusinessCode used in current month, invoke API: <a href="https://www.tencentcloud.com/document/product/555/35761?from_cn_redirect=1">Get fee distribution by product</a>
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get Context information returned from the last request. Paginated query of data for months with Month>=2023-05 can speed up query speed. Recommended for users with data volume at tens of thousands level. Query speed can be improved by 2-10x. 
     * @return Context Context information returned from the last request. Paginated query of data for months with Month>=2023-05 can speed up query speed. Recommended for users with data volume at tens of thousands level. Query speed can be improved by 2-10x.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Context information returned from the last request. Paginated query of data for months with Month>=2023-05 can speed up query speed. Recommended for users with data volume at tens of thousands level. Query speed can be improved by 2-10x.
     * @param Context Context information returned from the last request. Paginated query of data for months with Month>=2023-05 can speed up query speed. Recommended for users with data volume at tens of thousands level. Query speed can be improved by 2-10x.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field. 
     * @return PayerUin Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.
     * @param PayerUin Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    public DescribeBillDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillDetailRequest(DescribeBillDetailRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
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
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
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
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);

    }
}

