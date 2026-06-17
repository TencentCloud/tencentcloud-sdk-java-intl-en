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

public class DescribeTargetHealthRequest extends AbstractModel {

    /**
    * <p>List of Cloud Load Balancer instance IDs to query. The array size supports up to 30.</p>
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * <p>Listener ID list to query.</p>
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * <p>List of forwarding rule IDs to query.</p>
    */
    @SerializedName("LocationIds")
    @Expose
    private String [] LocationIds;

    /**
     * Get <p>List of Cloud Load Balancer instance IDs to query. The array size supports up to 30.</p> 
     * @return LoadBalancerIds <p>List of Cloud Load Balancer instance IDs to query. The array size supports up to 30.</p>
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set <p>List of Cloud Load Balancer instance IDs to query. The array size supports up to 30.</p>
     * @param LoadBalancerIds <p>List of Cloud Load Balancer instance IDs to query. The array size supports up to 30.</p>
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get <p>Listener ID list to query.</p> 
     * @return ListenerIds <p>Listener ID list to query.</p>
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set <p>Listener ID list to query.</p>
     * @param ListenerIds <p>Listener ID list to query.</p>
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get <p>List of forwarding rule IDs to query.</p> 
     * @return LocationIds <p>List of forwarding rule IDs to query.</p>
     */
    public String [] getLocationIds() {
        return this.LocationIds;
    }

    /**
     * Set <p>List of forwarding rule IDs to query.</p>
     * @param LocationIds <p>List of forwarding rule IDs to query.</p>
     */
    public void setLocationIds(String [] LocationIds) {
        this.LocationIds = LocationIds;
    }

    public DescribeTargetHealthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetHealthRequest(DescribeTargetHealthRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.ListenerIds != null) {
            this.ListenerIds = new String[source.ListenerIds.length];
            for (int i = 0; i < source.ListenerIds.length; i++) {
                this.ListenerIds[i] = new String(source.ListenerIds[i]);
            }
        }
        if (source.LocationIds != null) {
            this.LocationIds = new String[source.LocationIds.length];
            for (int i = 0; i < source.LocationIds.length; i++) {
                this.LocationIds[i] = new String(source.LocationIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);
        this.setParamArraySimple(map, prefix + "LocationIds.", this.LocationIds);

    }
}

