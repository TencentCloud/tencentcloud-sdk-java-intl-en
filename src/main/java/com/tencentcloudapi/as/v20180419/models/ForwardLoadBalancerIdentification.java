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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardLoadBalancerIdentification extends AbstractModel {

    /**
    * ID of the CLB
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Application CLB listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * ID of a forwarding rule. This parameter is required for layer-7 listeners.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
     * Get ID of the CLB 
     * @return LoadBalancerId ID of the CLB
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set ID of the CLB
     * @param LoadBalancerId ID of the CLB
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Application CLB listener ID 
     * @return ListenerId Application CLB listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Application CLB listener ID
     * @param ListenerId Application CLB listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get ID of a forwarding rule. This parameter is required for layer-7 listeners. 
     * @return LocationId ID of a forwarding rule. This parameter is required for layer-7 listeners.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set ID of a forwarding rule. This parameter is required for layer-7 listeners.
     * @param LocationId ID of a forwarding rule. This parameter is required for layer-7 listeners.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    public ForwardLoadBalancerIdentification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardLoadBalancerIdentification(ForwardLoadBalancerIdentification source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);

    }
}

