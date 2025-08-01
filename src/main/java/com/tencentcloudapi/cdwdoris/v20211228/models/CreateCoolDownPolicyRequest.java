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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCoolDownPolicyRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * cooldown_ttl
    */
    @SerializedName("CoolDownTtl")
    @Expose
    private String CoolDownTtl;

    /**
    * cooldown_datetime
    */
    @SerializedName("CoolDownDatetime")
    @Expose
    private String CoolDownDatetime;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Policy name 
     * @return PolicyName Policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
     * @param PolicyName Policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get cooldown_ttl 
     * @return CoolDownTtl cooldown_ttl
     */
    public String getCoolDownTtl() {
        return this.CoolDownTtl;
    }

    /**
     * Set cooldown_ttl
     * @param CoolDownTtl cooldown_ttl
     */
    public void setCoolDownTtl(String CoolDownTtl) {
        this.CoolDownTtl = CoolDownTtl;
    }

    /**
     * Get cooldown_datetime 
     * @return CoolDownDatetime cooldown_datetime
     */
    public String getCoolDownDatetime() {
        return this.CoolDownDatetime;
    }

    /**
     * Set cooldown_datetime
     * @param CoolDownDatetime cooldown_datetime
     */
    public void setCoolDownDatetime(String CoolDownDatetime) {
        this.CoolDownDatetime = CoolDownDatetime;
    }

    public CreateCoolDownPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCoolDownPolicyRequest(CreateCoolDownPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.CoolDownTtl != null) {
            this.CoolDownTtl = new String(source.CoolDownTtl);
        }
        if (source.CoolDownDatetime != null) {
            this.CoolDownDatetime = new String(source.CoolDownDatetime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "CoolDownTtl", this.CoolDownTtl);
        this.setParamSimple(map, prefix + "CoolDownDatetime", this.CoolDownDatetime);

    }
}

