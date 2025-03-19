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

public class DescribeBillDetailRequest extends AbstractModel {

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Quantity, maximum is 300
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
    * The start time of the query range, which should be in the format Y-m-d H:i:s . The query range must be in the last 18 months and cannot be earlier than May 2018 (when Bill 2.0 was introduced). The start time and end time must be in the same month.

Example: tccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --BeginTime '2023-04-01 12:05:15' --EndTime '2023-04-18 12:00:10' --ProjectId 1000000731  --version "2018-07-09"

Alternatively, you can use Month to query the billing details of a month.
Example:
ccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --Month 2023-04  --version "2018-07-09" --ResourceId "disk-oj9okstm"
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * The end time of the query range, which should be in the format `Y-m-d H:i:s `. The query range must be in the last 18 months and cannot be earlier than May 2018 (when Bill 2.0 was introduced). The start time and end time must be in the same month.

Example: tccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --BeginTime '2023-04-01 12:05:15' --EndTime '2023-04-18 12:00:10' --ProjectId 1000000731  --version "2018-07-09"

Alternatively, you can use `Month` to query the billing details of a month. 
Example:
ccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --Month 2023-04  --version "2018-07-09" --ResourceId "disk-oj9okstm"
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
    * Hourly settlement
Daily settlement
Monthly settlement
Spot
New monthly subscription
Monthly subscription renewal
Monthly subscription specification adjustment
Monthly subscription refund
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
    * Project ID: ID of the project to which the resource belongs
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Product code
Note: To query the product codes used in the current month, call <a href="https://intl.cloud.tencent.com/document/product/555/35761?from_cn_redirect=1">DescribeBillSummaryByProduct</a>.
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Context information returned by the last request. You can set `Month` to `2023-05` or later to accelerate queries. We recommend users whose data volume is over 100 thousand entries use the paginated query feature, which can help greatly speed up your queries.
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * The account ID of the payer, which is the unique identifier of a Tencent Cloud user. This account is allowed to query its own bills by default. If an organization admin account needs to query the self-pay bills of members, this field should be specified as the member account ID.
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

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
     * Get Quantity, maximum is 300 
     * @return Limit Quantity, maximum is 300
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity, maximum is 300
     * @param Limit Quantity, maximum is 300
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The period type. byUsedTime: By usage period; byPayTime: By payment period. Must be the same as the period of the current monthly bill of the Billing Center. You can check your bill statistics period type at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page.  
     * @return PeriodType The period type. byUsedTime: By usage period; byPayTime: By payment period. Must be the same as the period of the current monthly bill of the Billing Center. You can check your bill statistics period type at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page. 
     * @deprecated
     */
    @Deprecated
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set The period type. byUsedTime: By usage period; byPayTime: By payment period. Must be the same as the period of the current monthly bill of the Billing Center. You can check your bill statistics period type at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page. 
     * @param PeriodType The period type. byUsedTime: By usage period; byPayTime: By payment period. Must be the same as the period of the current monthly bill of the Billing Center. You can check your bill statistics period type at the top of the [Bill Overview](https://console.cloud.tencent.com/expense/bill/overview) page. 
     * @deprecated
     */
    @Deprecated
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
     * Get The start time of the query range, which should be in the format Y-m-d H:i:s . The query range must be in the last 18 months and cannot be earlier than May 2018 (when Bill 2.0 was introduced). The start time and end time must be in the same month.

Example: tccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --BeginTime '2023-04-01 12:05:15' --EndTime '2023-04-18 12:00:10' --ProjectId 1000000731  --version "2018-07-09"

Alternatively, you can use Month to query the billing details of a month.
Example:
ccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --Month 2023-04  --version "2018-07-09" --ResourceId "disk-oj9okstm" 
     * @return BeginTime The start time of the query range, which should be in the format Y-m-d H:i:s . The query range must be in the last 18 months and cannot be earlier than May 2018 (when Bill 2.0 was introduced). The start time and end time must be in the same month.

Example: tccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --BeginTime '2023-04-01 12:05:15' --EndTime '2023-04-18 12:00:10' --ProjectId 1000000731  --version "2018-07-09"

Alternatively, you can use Month to query the billing details of a month.
Example:
ccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --Month 2023-04  --version "2018-07-09" --ResourceId "disk-oj9okstm"
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The start time of the query range, which should be in the format Y-m-d H:i:s . The query range must be in the last 18 months and cannot be earlier than May 2018 (when Bill 2.0 was introduced). The start time and end time must be in the same month.

Example: tccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --BeginTime '2023-04-01 12:05:15' --EndTime '2023-04-18 12:00:10' --ProjectId 1000000731  --version "2018-07-09"

Alternatively, you can use Month to query the billing details of a month.
Example:
ccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --Month 2023-04  --version "2018-07-09" --ResourceId "disk-oj9okstm"
     * @param BeginTime The start time of the query range, which should be in the format Y-m-d H:i:s . The query range must be in the last 18 months and cannot be earlier than May 2018 (when Bill 2.0 was introduced). The start time and end time must be in the same month.

Example: tccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --BeginTime '2023-04-01 12:05:15' --EndTime '2023-04-18 12:00:10' --ProjectId 1000000731  --version "2018-07-09"

Alternatively, you can use Month to query the billing details of a month.
Example:
ccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --Month 2023-04  --version "2018-07-09" --ResourceId "disk-oj9okstm"
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The end time of the query range, which should be in the format `Y-m-d H:i:s `. The query range must be in the last 18 months and cannot be earlier than May 2018 (when Bill 2.0 was introduced). The start time and end time must be in the same month.

Example: tccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --BeginTime '2023-04-01 12:05:15' --EndTime '2023-04-18 12:00:10' --ProjectId 1000000731  --version "2018-07-09"

Alternatively, you can use `Month` to query the billing details of a month. 
Example:
ccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --Month 2023-04  --version "2018-07-09" --ResourceId "disk-oj9okstm" 
     * @return EndTime The end time of the query range, which should be in the format `Y-m-d H:i:s `. The query range must be in the last 18 months and cannot be earlier than May 2018 (when Bill 2.0 was introduced). The start time and end time must be in the same month.

Example: tccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --BeginTime '2023-04-01 12:05:15' --EndTime '2023-04-18 12:00:10' --ProjectId 1000000731  --version "2018-07-09"

Alternatively, you can use `Month` to query the billing details of a month. 
Example:
ccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --Month 2023-04  --version "2018-07-09" --ResourceId "disk-oj9okstm"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of the query range, which should be in the format `Y-m-d H:i:s `. The query range must be in the last 18 months and cannot be earlier than May 2018 (when Bill 2.0 was introduced). The start time and end time must be in the same month.

Example: tccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --BeginTime '2023-04-01 12:05:15' --EndTime '2023-04-18 12:00:10' --ProjectId 1000000731  --version "2018-07-09"

Alternatively, you can use `Month` to query the billing details of a month. 
Example:
ccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --Month 2023-04  --version "2018-07-09" --ResourceId "disk-oj9okstm"
     * @param EndTime The end time of the query range, which should be in the format `Y-m-d H:i:s `. The query range must be in the last 18 months and cannot be earlier than May 2018 (when Bill 2.0 was introduced). The start time and end time must be in the same month.

Example: tccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --BeginTime '2023-04-01 12:05:15' --EndTime '2023-04-18 12:00:10' --ProjectId 1000000731  --version "2018-07-09"

Alternatively, you can use `Month` to query the billing details of a month. 
Example:
ccli billing DescribeBillDetail --cli-unfold-argument --Offset 1 --Limit 100 --Month 2023-04  --version "2018-07-09" --ResourceId "disk-oj9okstm"
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
     * Get Hourly settlement
Daily settlement
Monthly settlement
Spot
New monthly subscription
Monthly subscription renewal
Monthly subscription specification adjustment
Monthly subscription refund
Adjustment - deduction
Adjustment - refund
Hourly RI fee
One-off RI Fee
Hourly Savings Plan fee
Offline project deduction
Offline product deduction 
     * @return ActionType Hourly settlement
Daily settlement
Monthly settlement
Spot
New monthly subscription
Monthly subscription renewal
Monthly subscription specification adjustment
Monthly subscription refund
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
Monthly settlement
Spot
New monthly subscription
Monthly subscription renewal
Monthly subscription specification adjustment
Monthly subscription refund
Adjustment - deduction
Adjustment - refund
Hourly RI fee
One-off RI Fee
Hourly Savings Plan fee
Offline project deduction
Offline product deduction
     * @param ActionType Hourly settlement
Daily settlement
Monthly settlement
Spot
New monthly subscription
Monthly subscription renewal
Monthly subscription specification adjustment
Monthly subscription refund
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
     * Get Product code
Note: To query the product codes used in the current month, call <a href="https://intl.cloud.tencent.com/document/product/555/35761?from_cn_redirect=1">DescribeBillSummaryByProduct</a>. 
     * @return BusinessCode Product code
Note: To query the product codes used in the current month, call <a href="https://intl.cloud.tencent.com/document/product/555/35761?from_cn_redirect=1">DescribeBillSummaryByProduct</a>.
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product code
Note: To query the product codes used in the current month, call <a href="https://intl.cloud.tencent.com/document/product/555/35761?from_cn_redirect=1">DescribeBillSummaryByProduct</a>.
     * @param BusinessCode Product code
Note: To query the product codes used in the current month, call <a href="https://intl.cloud.tencent.com/document/product/555/35761?from_cn_redirect=1">DescribeBillSummaryByProduct</a>.
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get Context information returned by the last request. You can set `Month` to `2023-05` or later to accelerate queries. We recommend users whose data volume is over 100 thousand entries use the paginated query feature, which can help greatly speed up your queries. 
     * @return Context Context information returned by the last request. You can set `Month` to `2023-05` or later to accelerate queries. We recommend users whose data volume is over 100 thousand entries use the paginated query feature, which can help greatly speed up your queries.
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Context information returned by the last request. You can set `Month` to `2023-05` or later to accelerate queries. We recommend users whose data volume is over 100 thousand entries use the paginated query feature, which can help greatly speed up your queries.
     * @param Context Context information returned by the last request. You can set `Month` to `2023-05` or later to accelerate queries. We recommend users whose data volume is over 100 thousand entries use the paginated query feature, which can help greatly speed up your queries.
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get The account ID of the payer, which is the unique identifier of a Tencent Cloud user. This account is allowed to query its own bills by default. If an organization admin account needs to query the self-pay bills of members, this field should be specified as the member account ID. 
     * @return PayerUin The account ID of the payer, which is the unique identifier of a Tencent Cloud user. This account is allowed to query its own bills by default. If an organization admin account needs to query the self-pay bills of members, this field should be specified as the member account ID.
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set The account ID of the payer, which is the unique identifier of a Tencent Cloud user. This account is allowed to query its own bills by default. If an organization admin account needs to query the self-pay bills of members, this field should be specified as the member account ID.
     * @param PayerUin The account ID of the payer, which is the unique identifier of a Tencent Cloud user. This account is allowed to query its own bills by default. If an organization admin account needs to query the self-pay bills of members, this field should be specified as the member account ID.
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

