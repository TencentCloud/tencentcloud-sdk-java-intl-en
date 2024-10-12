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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePlanRequest extends AbstractModel {

    /**
    * Type of the subscribed plan. Valid values: <li>personal: Personal plan in prepaid mode;</li><li>basic: Basic plan in prepaid mode;</li><li>standard: Standard plan in prepaid mode;</li><li>enterprise: Enterprise plan in pay-as-you-go mode.</li>When subscribing to a prepaid plan, please ensure that your account balance is sufficient. If the balance is insufficient, an order to be paid will be generated.
For an overview of billing, see [EdgeOne Billing Overview](https://intl.cloud.tencent.com/document/product/1552/94156?from_cn_redirect=1).
For differences between plans, refer to [EdgeOne Billing Plan Comparison](https://intl.cloud.tencent.com/document/product/1552/94165?from_cn_redirect=1).
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * Whether to automatically use a voucher. Valid values: <li>true: Yes;</li><li>false: No.</li>This parameter is valid only when PlanType is personal, basic, or standard.
If this field is not specified, the default value 'false' will be used.
    */
    @SerializedName("AutoUseVoucher")
    @Expose
    private String AutoUseVoucher;

    /**
    * Parameters for subscribing to a prepaid plan. When PlanType is personal, basic, or standard, this parameter is optional and can be used to specify the subscription duration of the plan and enable auto-renewal.
If this field is not specified, the default plan duration is 1 month, with auto-renewal disabled.
    */
    @SerializedName("PrepaidPlanParam")
    @Expose
    private PrepaidPlanParam PrepaidPlanParam;

    /**
     * Get Type of the subscribed plan. Valid values: <li>personal: Personal plan in prepaid mode;</li><li>basic: Basic plan in prepaid mode;</li><li>standard: Standard plan in prepaid mode;</li><li>enterprise: Enterprise plan in pay-as-you-go mode.</li>When subscribing to a prepaid plan, please ensure that your account balance is sufficient. If the balance is insufficient, an order to be paid will be generated.
For an overview of billing, see [EdgeOne Billing Overview](https://intl.cloud.tencent.com/document/product/1552/94156?from_cn_redirect=1).
For differences between plans, refer to [EdgeOne Billing Plan Comparison](https://intl.cloud.tencent.com/document/product/1552/94165?from_cn_redirect=1). 
     * @return PlanType Type of the subscribed plan. Valid values: <li>personal: Personal plan in prepaid mode;</li><li>basic: Basic plan in prepaid mode;</li><li>standard: Standard plan in prepaid mode;</li><li>enterprise: Enterprise plan in pay-as-you-go mode.</li>When subscribing to a prepaid plan, please ensure that your account balance is sufficient. If the balance is insufficient, an order to be paid will be generated.
For an overview of billing, see [EdgeOne Billing Overview](https://intl.cloud.tencent.com/document/product/1552/94156?from_cn_redirect=1).
For differences between plans, refer to [EdgeOne Billing Plan Comparison](https://intl.cloud.tencent.com/document/product/1552/94165?from_cn_redirect=1).
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set Type of the subscribed plan. Valid values: <li>personal: Personal plan in prepaid mode;</li><li>basic: Basic plan in prepaid mode;</li><li>standard: Standard plan in prepaid mode;</li><li>enterprise: Enterprise plan in pay-as-you-go mode.</li>When subscribing to a prepaid plan, please ensure that your account balance is sufficient. If the balance is insufficient, an order to be paid will be generated.
For an overview of billing, see [EdgeOne Billing Overview](https://intl.cloud.tencent.com/document/product/1552/94156?from_cn_redirect=1).
For differences between plans, refer to [EdgeOne Billing Plan Comparison](https://intl.cloud.tencent.com/document/product/1552/94165?from_cn_redirect=1).
     * @param PlanType Type of the subscribed plan. Valid values: <li>personal: Personal plan in prepaid mode;</li><li>basic: Basic plan in prepaid mode;</li><li>standard: Standard plan in prepaid mode;</li><li>enterprise: Enterprise plan in pay-as-you-go mode.</li>When subscribing to a prepaid plan, please ensure that your account balance is sufficient. If the balance is insufficient, an order to be paid will be generated.
For an overview of billing, see [EdgeOne Billing Overview](https://intl.cloud.tencent.com/document/product/1552/94156?from_cn_redirect=1).
For differences between plans, refer to [EdgeOne Billing Plan Comparison](https://intl.cloud.tencent.com/document/product/1552/94165?from_cn_redirect=1).
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get Whether to automatically use a voucher. Valid values: <li>true: Yes;</li><li>false: No.</li>This parameter is valid only when PlanType is personal, basic, or standard.
If this field is not specified, the default value 'false' will be used. 
     * @return AutoUseVoucher Whether to automatically use a voucher. Valid values: <li>true: Yes;</li><li>false: No.</li>This parameter is valid only when PlanType is personal, basic, or standard.
If this field is not specified, the default value 'false' will be used.
     */
    public String getAutoUseVoucher() {
        return this.AutoUseVoucher;
    }

    /**
     * Set Whether to automatically use a voucher. Valid values: <li>true: Yes;</li><li>false: No.</li>This parameter is valid only when PlanType is personal, basic, or standard.
If this field is not specified, the default value 'false' will be used.
     * @param AutoUseVoucher Whether to automatically use a voucher. Valid values: <li>true: Yes;</li><li>false: No.</li>This parameter is valid only when PlanType is personal, basic, or standard.
If this field is not specified, the default value 'false' will be used.
     */
    public void setAutoUseVoucher(String AutoUseVoucher) {
        this.AutoUseVoucher = AutoUseVoucher;
    }

    /**
     * Get Parameters for subscribing to a prepaid plan. When PlanType is personal, basic, or standard, this parameter is optional and can be used to specify the subscription duration of the plan and enable auto-renewal.
If this field is not specified, the default plan duration is 1 month, with auto-renewal disabled. 
     * @return PrepaidPlanParam Parameters for subscribing to a prepaid plan. When PlanType is personal, basic, or standard, this parameter is optional and can be used to specify the subscription duration of the plan and enable auto-renewal.
If this field is not specified, the default plan duration is 1 month, with auto-renewal disabled.
     */
    public PrepaidPlanParam getPrepaidPlanParam() {
        return this.PrepaidPlanParam;
    }

    /**
     * Set Parameters for subscribing to a prepaid plan. When PlanType is personal, basic, or standard, this parameter is optional and can be used to specify the subscription duration of the plan and enable auto-renewal.
If this field is not specified, the default plan duration is 1 month, with auto-renewal disabled.
     * @param PrepaidPlanParam Parameters for subscribing to a prepaid plan. When PlanType is personal, basic, or standard, this parameter is optional and can be used to specify the subscription duration of the plan and enable auto-renewal.
If this field is not specified, the default plan duration is 1 month, with auto-renewal disabled.
     */
    public void setPrepaidPlanParam(PrepaidPlanParam PrepaidPlanParam) {
        this.PrepaidPlanParam = PrepaidPlanParam;
    }

    public CreatePlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePlanRequest(CreatePlanRequest source) {
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.AutoUseVoucher != null) {
            this.AutoUseVoucher = new String(source.AutoUseVoucher);
        }
        if (source.PrepaidPlanParam != null) {
            this.PrepaidPlanParam = new PrepaidPlanParam(source.PrepaidPlanParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "AutoUseVoucher", this.AutoUseVoucher);
        this.setParamObj(map, prefix + "PrepaidPlanParam.", this.PrepaidPlanParam);

    }
}

