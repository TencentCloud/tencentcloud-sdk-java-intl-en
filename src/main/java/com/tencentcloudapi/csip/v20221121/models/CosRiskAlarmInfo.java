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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosRiskAlarmInfo extends AbstractModel {

    /**
    * Enumeration value of the policy type
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * Policy name
    */
    @SerializedName("PolicyTypeName")
    @Expose
    private String PolicyTypeName;

    /**
    * Number of policies corresponding to the policy type
    */
    @SerializedName("PolicyCount")
    @Expose
    private Long PolicyCount;

    /**
     * Get Enumeration value of the policy type 
     * @return PolicyType Enumeration value of the policy type
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Enumeration value of the policy type
     * @param PolicyType Enumeration value of the policy type
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Policy name 
     * @return PolicyTypeName Policy name
     */
    public String getPolicyTypeName() {
        return this.PolicyTypeName;
    }

    /**
     * Set Policy name
     * @param PolicyTypeName Policy name
     */
    public void setPolicyTypeName(String PolicyTypeName) {
        this.PolicyTypeName = PolicyTypeName;
    }

    /**
     * Get Number of policies corresponding to the policy type 
     * @return PolicyCount Number of policies corresponding to the policy type
     */
    public Long getPolicyCount() {
        return this.PolicyCount;
    }

    /**
     * Set Number of policies corresponding to the policy type
     * @param PolicyCount Number of policies corresponding to the policy type
     */
    public void setPolicyCount(Long PolicyCount) {
        this.PolicyCount = PolicyCount;
    }

    public CosRiskAlarmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRiskAlarmInfo(CosRiskAlarmInfo source) {
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyTypeName != null) {
            this.PolicyTypeName = new String(source.PolicyTypeName);
        }
        if (source.PolicyCount != null) {
            this.PolicyCount = new Long(source.PolicyCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyTypeName", this.PolicyTypeName);
        this.setParamSimple(map, prefix + "PolicyCount", this.PolicyCount);

    }
}

