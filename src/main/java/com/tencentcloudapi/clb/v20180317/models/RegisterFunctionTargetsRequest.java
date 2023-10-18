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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterFunctionTargetsRequest extends AbstractModel {

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
    * SCF functions to be bound.
    */
    @SerializedName("FunctionTargets")
    @Expose
    private FunctionTarget [] FunctionTargets;

    /**
    * ID of the target forwarding rule. To bind an SCF function to a L7 forwarding rule, this parameter or `Domain+Url` is required.
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
     * Get SCF functions to be bound. 
     * @return FunctionTargets SCF functions to be bound.
     */
    public FunctionTarget [] getFunctionTargets() {
        return this.FunctionTargets;
    }

    /**
     * Set SCF functions to be bound.
     * @param FunctionTargets SCF functions to be bound.
     */
    public void setFunctionTargets(FunctionTarget [] FunctionTargets) {
        this.FunctionTargets = FunctionTargets;
    }

    /**
     * Get ID of the target forwarding rule. To bind an SCF function to a L7 forwarding rule, this parameter or `Domain+Url` is required. 
     * @return LocationId ID of the target forwarding rule. To bind an SCF function to a L7 forwarding rule, this parameter or `Domain+Url` is required.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set ID of the target forwarding rule. To bind an SCF function to a L7 forwarding rule, this parameter or `Domain+Url` is required.
     * @param LocationId ID of the target forwarding rule. To bind an SCF function to a L7 forwarding rule, this parameter or `Domain+Url` is required.
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

    public RegisterFunctionTargetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterFunctionTargetsRequest(RegisterFunctionTargetsRequest source) {
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

