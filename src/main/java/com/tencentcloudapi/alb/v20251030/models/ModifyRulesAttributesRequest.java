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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRulesAttributesRequest extends AbstractModel {

    /**
    * Listener ID, format: lst- followed by 8 alphanumeric characters.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Forwarding rule list.
    */
    @SerializedName("Rules")
    @Expose
    private RuleModify [] Rules;

    /**
    * Whether it is pre-check only for this request.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get Listener ID, format: lst- followed by 8 alphanumeric characters. 
     * @return ListenerId Listener ID, format: lst- followed by 8 alphanumeric characters.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID, format: lst- followed by 8 alphanumeric characters.
     * @param ListenerId Listener ID, format: lst- followed by 8 alphanumeric characters.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters. 
     * @return LoadBalancerId Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     * @param LoadBalancerId Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Forwarding rule list. 
     * @return Rules Forwarding rule list.
     */
    public RuleModify [] getRules() {
        return this.Rules;
    }

    /**
     * Set Forwarding rule list.
     * @param Rules Forwarding rule list.
     */
    public void setRules(RuleModify [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Whether it is pre-check only for this request. 
     * @return DryRun Whether it is pre-check only for this request.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether it is pre-check only for this request.
     * @param DryRun Whether it is pre-check only for this request.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public ModifyRulesAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRulesAttributesRequest(ModifyRulesAttributesRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.Rules != null) {
            this.Rules = new RuleModify[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RuleModify(source.Rules[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

