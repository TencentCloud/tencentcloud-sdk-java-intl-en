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

public class RenewLoadBalancersRequest extends AbstractModel {

    /**
    * Unique ID array of the CLB instance, supports up to 20.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * Prepaid billing attributes of the CLB instance.
    */
    @SerializedName("LBChargePrepaid")
    @Expose
    private LBChargePrepaid LBChargePrepaid;

    /**
     * Get Unique ID array of the CLB instance, supports up to 20. 
     * @return LoadBalancerIds Unique ID array of the CLB instance, supports up to 20.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set Unique ID array of the CLB instance, supports up to 20.
     * @param LoadBalancerIds Unique ID array of the CLB instance, supports up to 20.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get Prepaid billing attributes of the CLB instance. 
     * @return LBChargePrepaid Prepaid billing attributes of the CLB instance.
     */
    public LBChargePrepaid getLBChargePrepaid() {
        return this.LBChargePrepaid;
    }

    /**
     * Set Prepaid billing attributes of the CLB instance.
     * @param LBChargePrepaid Prepaid billing attributes of the CLB instance.
     */
    public void setLBChargePrepaid(LBChargePrepaid LBChargePrepaid) {
        this.LBChargePrepaid = LBChargePrepaid;
    }

    public RenewLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewLoadBalancersRequest(RenewLoadBalancersRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.LBChargePrepaid != null) {
            this.LBChargePrepaid = new LBChargePrepaid(source.LBChargePrepaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamObj(map, prefix + "LBChargePrepaid.", this.LBChargePrepaid);

    }
}

