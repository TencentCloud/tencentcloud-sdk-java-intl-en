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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardLoadBalancer extends AbstractModel{

    /**
    * Load balancer ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Application load balancer listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * List of target rule attributes
    */
    @SerializedName("TargetAttributes")
    @Expose
    private TargetAttribute [] TargetAttributes;

    /**
    * ID of a forwarding rule. This parameter is required for layer-7 listeners.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * The region of CLB instance. It defaults to the region of AS service and is in the format of the common parameter `Region`, such as `ap-guangzhou`.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Load balancer ID 
     * @return LoadBalancerId Load balancer ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Load balancer ID
     * @param LoadBalancerId Load balancer ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Application load balancer listener ID 
     * @return ListenerId Application load balancer listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Application load balancer listener ID
     * @param ListenerId Application load balancer listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get List of target rule attributes 
     * @return TargetAttributes List of target rule attributes
     */
    public TargetAttribute [] getTargetAttributes() {
        return this.TargetAttributes;
    }

    /**
     * Set List of target rule attributes
     * @param TargetAttributes List of target rule attributes
     */
    public void setTargetAttributes(TargetAttribute [] TargetAttributes) {
        this.TargetAttributes = TargetAttributes;
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

    /**
     * Get The region of CLB instance. It defaults to the region of AS service and is in the format of the common parameter `Region`, such as `ap-guangzhou`. 
     * @return Region The region of CLB instance. It defaults to the region of AS service and is in the format of the common parameter `Region`, such as `ap-guangzhou`.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region of CLB instance. It defaults to the region of AS service and is in the format of the common parameter `Region`, such as `ap-guangzhou`.
     * @param Region The region of CLB instance. It defaults to the region of AS service and is in the format of the common parameter `Region`, such as `ap-guangzhou`.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "TargetAttributes.", this.TargetAttributes);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

