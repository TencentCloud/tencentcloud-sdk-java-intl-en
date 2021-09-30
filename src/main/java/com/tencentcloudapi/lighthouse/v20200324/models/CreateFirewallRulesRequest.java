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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFirewallRulesRequest extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Firewall rule list.
    */
    @SerializedName("FirewallRules")
    @Expose
    private FirewallRule [] FirewallRules;

    /**
    * Current firewall version number. Every time you update the firewall rule version, it will be automatically increased by 1 to prevent the rule from expiring. If it is left empty, conflicts will not be considered.
    */
    @SerializedName("FirewallVersion")
    @Expose
    private Long FirewallVersion;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Firewall rule list. 
     * @return FirewallRules Firewall rule list.
     */
    public FirewallRule [] getFirewallRules() {
        return this.FirewallRules;
    }

    /**
     * Set Firewall rule list.
     * @param FirewallRules Firewall rule list.
     */
    public void setFirewallRules(FirewallRule [] FirewallRules) {
        this.FirewallRules = FirewallRules;
    }

    /**
     * Get Current firewall version number. Every time you update the firewall rule version, it will be automatically increased by 1 to prevent the rule from expiring. If it is left empty, conflicts will not be considered. 
     * @return FirewallVersion Current firewall version number. Every time you update the firewall rule version, it will be automatically increased by 1 to prevent the rule from expiring. If it is left empty, conflicts will not be considered.
     */
    public Long getFirewallVersion() {
        return this.FirewallVersion;
    }

    /**
     * Set Current firewall version number. Every time you update the firewall rule version, it will be automatically increased by 1 to prevent the rule from expiring. If it is left empty, conflicts will not be considered.
     * @param FirewallVersion Current firewall version number. Every time you update the firewall rule version, it will be automatically increased by 1 to prevent the rule from expiring. If it is left empty, conflicts will not be considered.
     */
    public void setFirewallVersion(Long FirewallVersion) {
        this.FirewallVersion = FirewallVersion;
    }

    public CreateFirewallRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFirewallRulesRequest(CreateFirewallRulesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FirewallRules != null) {
            this.FirewallRules = new FirewallRule[source.FirewallRules.length];
            for (int i = 0; i < source.FirewallRules.length; i++) {
                this.FirewallRules[i] = new FirewallRule(source.FirewallRules[i]);
            }
        }
        if (source.FirewallVersion != null) {
            this.FirewallVersion = new Long(source.FirewallVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "FirewallRules.", this.FirewallRules);
        this.setParamSimple(map, prefix + "FirewallVersion", this.FirewallVersion);

    }
}

