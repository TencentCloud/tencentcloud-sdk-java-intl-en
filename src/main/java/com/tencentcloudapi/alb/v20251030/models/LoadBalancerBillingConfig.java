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

public class LoadBalancerBillingConfig extends AbstractModel {

    /**
    * Billing type of the instance.

Parameter value **POSTPAID_BY_HOUR**: pay-as-you-go.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * Bandwidth package ID.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
     * Get Billing type of the instance.

Parameter value **POSTPAID_BY_HOUR**: pay-as-you-go. 
     * @return ChargeType Billing type of the instance.

Parameter value **POSTPAID_BY_HOUR**: pay-as-you-go.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing type of the instance.

Parameter value **POSTPAID_BY_HOUR**: pay-as-you-go.
     * @param ChargeType Billing type of the instance.

Parameter value **POSTPAID_BY_HOUR**: pay-as-you-go.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Bandwidth package ID. 
     * @return BandwidthPackageId Bandwidth package ID.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Bandwidth package ID.
     * @param BandwidthPackageId Bandwidth package ID.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    public LoadBalancerBillingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerBillingConfig(LoadBalancerBillingConfig source) {
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);

    }
}

