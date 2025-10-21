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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoutePolicyAttributeRequest extends AbstractModel {

    /**
    * Instance ID of the route reception policy, such as rrp-dz0219jq.
    */
    @SerializedName("RoutePolicyId")
    @Expose
    private String RoutePolicyId;

    /**
    * Specifies the route reception policy name.
    */
    @SerializedName("RoutePolicyName")
    @Expose
    private String RoutePolicyName;

    /**
    * Describes the route reception policy.
    */
    @SerializedName("RoutePolicyDescription")
    @Expose
    private String RoutePolicyDescription;

    /**
     * Get Instance ID of the route reception policy, such as rrp-dz0219jq. 
     * @return RoutePolicyId Instance ID of the route reception policy, such as rrp-dz0219jq.
     */
    public String getRoutePolicyId() {
        return this.RoutePolicyId;
    }

    /**
     * Set Instance ID of the route reception policy, such as rrp-dz0219jq.
     * @param RoutePolicyId Instance ID of the route reception policy, such as rrp-dz0219jq.
     */
    public void setRoutePolicyId(String RoutePolicyId) {
        this.RoutePolicyId = RoutePolicyId;
    }

    /**
     * Get Specifies the route reception policy name. 
     * @return RoutePolicyName Specifies the route reception policy name.
     */
    public String getRoutePolicyName() {
        return this.RoutePolicyName;
    }

    /**
     * Set Specifies the route reception policy name.
     * @param RoutePolicyName Specifies the route reception policy name.
     */
    public void setRoutePolicyName(String RoutePolicyName) {
        this.RoutePolicyName = RoutePolicyName;
    }

    /**
     * Get Describes the route reception policy. 
     * @return RoutePolicyDescription Describes the route reception policy.
     */
    public String getRoutePolicyDescription() {
        return this.RoutePolicyDescription;
    }

    /**
     * Set Describes the route reception policy.
     * @param RoutePolicyDescription Describes the route reception policy.
     */
    public void setRoutePolicyDescription(String RoutePolicyDescription) {
        this.RoutePolicyDescription = RoutePolicyDescription;
    }

    public ModifyRoutePolicyAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoutePolicyAttributeRequest(ModifyRoutePolicyAttributeRequest source) {
        if (source.RoutePolicyId != null) {
            this.RoutePolicyId = new String(source.RoutePolicyId);
        }
        if (source.RoutePolicyName != null) {
            this.RoutePolicyName = new String(source.RoutePolicyName);
        }
        if (source.RoutePolicyDescription != null) {
            this.RoutePolicyDescription = new String(source.RoutePolicyDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoutePolicyId", this.RoutePolicyId);
        this.setParamSimple(map, prefix + "RoutePolicyName", this.RoutePolicyName);
        this.setParamSimple(map, prefix + "RoutePolicyDescription", this.RoutePolicyDescription);

    }
}

