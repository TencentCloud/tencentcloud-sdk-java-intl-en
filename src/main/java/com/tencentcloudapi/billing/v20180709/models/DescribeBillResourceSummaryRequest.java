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

public class DescribeBillResourceSummaryRequest extends AbstractModel {

    /**
    * Pagination offset. If `Offset` is `0`, it indicates the first page. If `Limit` is `100`, "`Offset` = `100`" indicates the second page, then "`Offset` = `200`" indicates the third page, and so on.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Quantity, maximum is 1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Bill month in the format of "yyyy-mm". This value must be no earlier than March 2019, when Bill 2.0 was launched.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * The period type. byUsedTime
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * Indicates whether or not the total number of records of accessing the list is required, used for frontend pages.
1 = yes, 0 = no
    */
    @SerializedName("NeedRecordNum")
    @Expose
    private Long NeedRecordNum;

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
    * ID of the instance to be queried
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Billing mode: prePay/postPay
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Product code
Note: To query the product codes used in the current month, call <a href="https://intl.cloud.tencent.com/document/product/555/35761?from_cn_redirect=1">DescribeBillSummaryByProduct</a>.
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * The account ID of the payer, which is the unique identifier of a Tencent Cloud user. This account is allowed to query its own bills by default. If an organization admin account needs to query the self-pay bills of members, this field should be specified as the member account ID.
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * Cost allocation tag key, which can be customized. This parameter can be used for querying bills after January 2021.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Resource tag value. If it is left empty, there are no records with tag values set under this tag key.
This parameter can be used for querying bills after January 2021.
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
     * Get Pagination offset. If `Offset` is `0`, it indicates the first page. If `Limit` is `100`, "`Offset` = `100`" indicates the second page, then "`Offset` = `200`" indicates the third page, and so on. 
     * @return Offset Pagination offset. If `Offset` is `0`, it indicates the first page. If `Limit` is `100`, "`Offset` = `100`" indicates the second page, then "`Offset` = `200`" indicates the third page, and so on.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. If `Offset` is `0`, it indicates the first page. If `Limit` is `100`, "`Offset` = `100`" indicates the second page, then "`Offset` = `200`" indicates the third page, and so on.
     * @param Offset Pagination offset. If `Offset` is `0`, it indicates the first page. If `Limit` is `100`, "`Offset` = `100`" indicates the second page, then "`Offset` = `200`" indicates the third page, and so on.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Quantity, maximum is 1000 
     * @return Limit Quantity, maximum is 1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity, maximum is 1000
     * @param Limit Quantity, maximum is 1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Bill month in the format of "yyyy-mm". This value must be no earlier than March 2019, when Bill 2.0 was launched. 
     * @return Month Bill month in the format of "yyyy-mm". This value must be no earlier than March 2019, when Bill 2.0 was launched.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Bill month in the format of "yyyy-mm". This value must be no earlier than March 2019, when Bill 2.0 was launched.
     * @param Month Bill month in the format of "yyyy-mm". This value must be no earlier than March 2019, when Bill 2.0 was launched.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get The period type. byUsedTime 
     * @return PeriodType The period type. byUsedTime
     * @deprecated
     */
    @Deprecated
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set The period type. byUsedTime
     * @param PeriodType The period type. byUsedTime
     * @deprecated
     */
    @Deprecated
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
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
     * Get ID of the instance to be queried 
     * @return ResourceId ID of the instance to be queried
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set ID of the instance to be queried
     * @param ResourceId ID of the instance to be queried
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
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

    /**
     * Get Cost allocation tag key, which can be customized. This parameter can be used for querying bills after January 2021. 
     * @return TagKey Cost allocation tag key, which can be customized. This parameter can be used for querying bills after January 2021.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Cost allocation tag key, which can be customized. This parameter can be used for querying bills after January 2021.
     * @param TagKey Cost allocation tag key, which can be customized. This parameter can be used for querying bills after January 2021.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Resource tag value. If it is left empty, there are no records with tag values set under this tag key.
This parameter can be used for querying bills after January 2021. 
     * @return TagValue Resource tag value. If it is left empty, there are no records with tag values set under this tag key.
This parameter can be used for querying bills after January 2021.
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set Resource tag value. If it is left empty, there are no records with tag values set under this tag key.
This parameter can be used for querying bills after January 2021.
     * @param TagValue Resource tag value. If it is left empty, there are no records with tag values set under this tag key.
This parameter can be used for querying bills after January 2021.
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    public DescribeBillResourceSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillResourceSummaryRequest(DescribeBillResourceSummaryRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.NeedRecordNum != null) {
            this.NeedRecordNum = new Long(source.NeedRecordNum);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamSimple(map, prefix + "NeedRecordNum", this.NeedRecordNum);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);

    }
}

