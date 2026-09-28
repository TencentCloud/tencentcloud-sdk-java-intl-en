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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateLoadBalancerRequest extends AbstractModel {

    /**
    * Billing type of the instance. Default value: POSTPAID_BY_HOUR. Only value: POSTPAID_BY_HOUR, which indicates pay-as-you-go billing.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
     * Get Billing type of the instance. Default value: POSTPAID_BY_HOUR. Only value: POSTPAID_BY_HOUR, which indicates pay-as-you-go billing. 
     * @return ChargeType Billing type of the instance. Default value: POSTPAID_BY_HOUR. Only value: POSTPAID_BY_HOUR, which indicates pay-as-you-go billing.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing type of the instance. Default value: POSTPAID_BY_HOUR. Only value: POSTPAID_BY_HOUR, which indicates pay-as-you-go billing.
     * @param ChargeType Billing type of the instance. Default value: POSTPAID_BY_HOUR. Only value: POSTPAID_BY_HOUR, which indicates pay-as-you-go billing.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    public InquirePriceCreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateLoadBalancerRequest(InquirePriceCreateLoadBalancerRequest source) {
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);

    }
}

