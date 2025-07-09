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

public class DeregisterFunctionTargetsRequest extends AbstractModel {

    /**
    * CLB instance ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB listener ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * List of functions to be unbound
    */
    @SerializedName("FunctionTargets")
    @Expose
    private FunctionTarget [] FunctionTargets;

    /**
    * The ID of target forwarding rule. To unbind a function from an L7 forwarding rule, either `LocationId` or `Domain+Url` is required. 
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Domain name of the target forwarding rule. It is ignored if `LocationId` is specified. 
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * URL of the target forwarding rule. It is ignored if `LocationId` is specified. 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get CLB instance ID. 
     * @return LoadBalancerId CLB instance ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID.
     * @param LoadBalancerId CLB instance ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB listener ID. 
     * @return ListenerId CLB listener ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID.
     * @param ListenerId CLB listener ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get List of functions to be unbound 
     * @return FunctionTargets List of functions to be unbound
     */
    public FunctionTarget [] getFunctionTargets() {
        return this.FunctionTargets;
    }

    /**
     * Set List of functions to be unbound
     * @param FunctionTargets List of functions to be unbound
     */
    public void setFunctionTargets(FunctionTarget [] FunctionTargets) {
        this.FunctionTargets = FunctionTargets;
    }

    /**
     * Get The ID of target forwarding rule. To unbind a function from an L7 forwarding rule, either `LocationId` or `Domain+Url` is required.  
     * @return LocationId The ID of target forwarding rule. To unbind a function from an L7 forwarding rule, either `LocationId` or `Domain+Url` is required. 
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set The ID of target forwarding rule. To unbind a function from an L7 forwarding rule, either `LocationId` or `Domain+Url` is required. 
     * @param LocationId The ID of target forwarding rule. To unbind a function from an L7 forwarding rule, either `LocationId` or `Domain+Url` is required. 
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Domain name of the target forwarding rule. It is ignored if `LocationId` is specified.  
     * @return Domain Domain name of the target forwarding rule. It is ignored if `LocationId` is specified. 
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name of the target forwarding rule. It is ignored if `LocationId` is specified. 
     * @param Domain Domain name of the target forwarding rule. It is ignored if `LocationId` is specified. 
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get URL of the target forwarding rule. It is ignored if `LocationId` is specified.  
     * @return Url URL of the target forwarding rule. It is ignored if `LocationId` is specified. 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of the target forwarding rule. It is ignored if `LocationId` is specified. 
     * @param Url URL of the target forwarding rule. It is ignored if `LocationId` is specified. 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public DeregisterFunctionTargetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeregisterFunctionTargetsRequest(DeregisterFunctionTargetsRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.FunctionTargets != null) {
            this.FunctionTargets = new FunctionTarget[source.FunctionTargets.length];
            for (int i = 0; i < source.FunctionTargets.length; i++) {
                this.FunctionTargets[i] = new FunctionTarget(source.FunctionTargets[i]);
            }
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "FunctionTargets.", this.FunctionTargets);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

