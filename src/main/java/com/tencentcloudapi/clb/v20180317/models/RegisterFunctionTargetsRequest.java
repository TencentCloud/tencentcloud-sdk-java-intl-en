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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterFunctionTargetsRequest extends AbstractModel{

    /**
    * 
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 
    */
    @SerializedName("FunctionTargets")
    @Expose
    private FunctionTarget [] FunctionTargets;

    /**
    * 
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get  
     * @return LoadBalancerId 
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 
     * @param LoadBalancerId 
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get  
     * @return ListenerId 
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 
     * @param ListenerId 
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get  
     * @return FunctionTargets 
     */
    public FunctionTarget [] getFunctionTargets() {
        return this.FunctionTargets;
    }

    /**
     * Set 
     * @param FunctionTargets 
     */
    public void setFunctionTargets(FunctionTarget [] FunctionTargets) {
        this.FunctionTargets = FunctionTargets;
    }

    /**
     * Get  
     * @return LocationId 
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 
     * @param LocationId 
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get  
     * @return Domain 
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 
     * @param Domain 
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get  
     * @return Url 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 
     * @param Url 
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

