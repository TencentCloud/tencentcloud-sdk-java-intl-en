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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTargetWeightRequest extends AbstractModel {

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * List of real servers for which to modify the weights
    */
    @SerializedName("Targets")
    @Expose
    private Target [] Targets;

    /**
    * New forwarding weight of the real server. Value range: 0-100. Default value: 10. This parameter will not take effect if the `Targets.Weight` parameter is set.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

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
     * Get CLB listener ID 
     * @return ListenerId CLB listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID
     * @param ListenerId CLB listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get List of real servers for which to modify the weights 
     * @return Targets List of real servers for which to modify the weights
     */
    public Target [] getTargets() {
        return this.Targets;
    }

    /**
     * Set List of real servers for which to modify the weights
     * @param Targets List of real servers for which to modify the weights
     */
    public void setTargets(Target [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get New forwarding weight of the real server. Value range: 0-100. Default value: 10. This parameter will not take effect if the `Targets.Weight` parameter is set. 
     * @return Weight New forwarding weight of the real server. Value range: 0-100. Default value: 10. This parameter will not take effect if the `Targets.Weight` parameter is set.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set New forwarding weight of the real server. Value range: 0-100. Default value: 10. This parameter will not take effect if the `Targets.Weight` parameter is set.
     * @param Weight New forwarding weight of the real server. Value range: 0-100. Default value: 10. This parameter will not take effect if the `Targets.Weight` parameter is set.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public ModifyTargetWeightRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTargetWeightRequest(ModifyTargetWeightRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Targets != null) {
            this.Targets = new Target[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new Target(source.Targets[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

