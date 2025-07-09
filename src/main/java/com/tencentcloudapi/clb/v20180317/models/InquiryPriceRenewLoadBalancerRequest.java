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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewLoadBalancerRequest extends AbstractModel {

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Renewal period
    */
    @SerializedName("LoadBalancerChargePrepaid")
    @Expose
    private LBChargePrepaid LoadBalancerChargePrepaid;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Renewal period 
     * @return LoadBalancerChargePrepaid Renewal period
     */
    public LBChargePrepaid getLoadBalancerChargePrepaid() {
        return this.LoadBalancerChargePrepaid;
    }

    /**
     * Set Renewal period
     * @param LoadBalancerChargePrepaid Renewal period
     */
    public void setLoadBalancerChargePrepaid(LBChargePrepaid LoadBalancerChargePrepaid) {
        this.LoadBalancerChargePrepaid = LoadBalancerChargePrepaid;
    }

    public InquiryPriceRenewLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewLoadBalancerRequest(InquiryPriceRenewLoadBalancerRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerChargePrepaid != null) {
            this.LoadBalancerChargePrepaid = new LBChargePrepaid(source.LoadBalancerChargePrepaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamObj(map, prefix + "LoadBalancerChargePrepaid.", this.LoadBalancerChargePrepaid);

    }
}

