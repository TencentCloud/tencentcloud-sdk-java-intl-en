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

public class DeleteLoadBalancerSnatIpsRequest extends AbstractModel {

    /**
    * Unique ID of a CLB instance, e.g., lb-12345678.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Array of the SNAT IP addresses to be deleted
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
     * Get Unique ID of a CLB instance, e.g., lb-12345678. 
     * @return LoadBalancerId Unique ID of a CLB instance, e.g., lb-12345678.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Unique ID of a CLB instance, e.g., lb-12345678.
     * @param LoadBalancerId Unique ID of a CLB instance, e.g., lb-12345678.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Array of the SNAT IP addresses to be deleted 
     * @return Ips Array of the SNAT IP addresses to be deleted
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set Array of the SNAT IP addresses to be deleted
     * @param Ips Array of the SNAT IP addresses to be deleted
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    public DeleteLoadBalancerSnatIpsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLoadBalancerSnatIpsRequest(DeleteLoadBalancerSnatIpsRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.Ips != null) {
            this.Ips = new String[source.Ips.length];
            for (int i = 0; i < source.Ips.length; i++) {
                this.Ips[i] = new String(source.Ips[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);

    }
}

