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

public class DescribeBillSummaryRequest extends AbstractModel {

    /**
    * <p>Bill month, formatted as 2023-04</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * <p>Billing dimension type. Enumeration values as follows: business, project, region, payMode, tag</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>Tag key. Pass GroupType=tag when obtaining dimensional billing by tag.</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String [] TagKey;

    /**
    * <p>Operator UIN: Operator account ID (ID of the prepaid resource order or postpaid operation, activate postpaid resource account or role ID)</p>
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * <p>Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.</p>
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
     * Get <p>Bill month, formatted as 2023-04</p> 
     * @return Month <p>Bill month, formatted as 2023-04</p>
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set <p>Bill month, formatted as 2023-04</p>
     * @param Month <p>Bill month, formatted as 2023-04</p>
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get <p>Billing dimension type. Enumeration values as follows: business, project, region, payMode, tag</p> 
     * @return GroupType <p>Billing dimension type. Enumeration values as follows: business, project, region, payMode, tag</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>Billing dimension type. Enumeration values as follows: business, project, region, payMode, tag</p>
     * @param GroupType <p>Billing dimension type. Enumeration values as follows: business, project, region, payMode, tag</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>Tag key. Pass GroupType=tag when obtaining dimensional billing by tag.</p> 
     * @return TagKey <p>Tag key. Pass GroupType=tag when obtaining dimensional billing by tag.</p>
     */
    public String [] getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>Tag key. Pass GroupType=tag when obtaining dimensional billing by tag.</p>
     * @param TagKey <p>Tag key. Pass GroupType=tag when obtaining dimensional billing by tag.</p>
     */
    public void setTagKey(String [] TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>Operator UIN: Operator account ID (ID of the prepaid resource order or postpaid operation, activate postpaid resource account or role ID)</p> 
     * @return OperateUin <p>Operator UIN: Operator account ID (ID of the prepaid resource order or postpaid operation, activate postpaid resource account or role ID)</p>
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set <p>Operator UIN: Operator account ID (ID of the prepaid resource order or postpaid operation, activate postpaid resource account or role ID)</p>
     * @param OperateUin <p>Operator UIN: Operator account ID (ID of the prepaid resource order or postpaid operation, activate postpaid resource account or role ID)</p>
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get <p>Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.</p> 
     * @return PayerUin <p>Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.</p>
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set <p>Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.</p>
     * @param PayerUin <p>Account ID of the payer (Account ID is the unique account identifier for the user in Tencent Cloud). By default, the query returns the account statement of the current account. If the group management account needs to query the self-pay bills of member accounts, enter the member account UIN in this field.</p>
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    public DescribeBillSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillSummaryRequest(DescribeBillSummaryRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.TagKey != null) {
            this.TagKey = new String[source.TagKey.length];
            for (int i = 0; i < source.TagKey.length; i++) {
                this.TagKey[i] = new String(source.TagKey[i]);
            }
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArraySimple(map, prefix + "TagKey.", this.TagKey);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);

    }
}

