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

public class CosRiskInfo extends AbstractModel {

    /**
    * Policy type code
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * Policy classification name
    */
    @SerializedName("PolicyTypeName")
    @Expose
    private String PolicyTypeName;

    /**
    * Total hit policies
    */
    @SerializedName("PolicyCount")
    @Expose
    private Long PolicyCount;

    /**
     * Get Policy type code 
     * @return PolicyType Policy type code
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Policy type code
     * @param PolicyType Policy type code
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Policy classification name 
     * @return PolicyTypeName Policy classification name
     */
    public String getPolicyTypeName() {
        return this.PolicyTypeName;
    }

    /**
     * Set Policy classification name
     * @param PolicyTypeName Policy classification name
     */
    public void setPolicyTypeName(String PolicyTypeName) {
        this.PolicyTypeName = PolicyTypeName;
    }

    /**
     * Get Total hit policies 
     * @return PolicyCount Total hit policies
     */
    public Long getPolicyCount() {
        return this.PolicyCount;
    }

    /**
     * Set Total hit policies
     * @param PolicyCount Total hit policies
     */
    public void setPolicyCount(Long PolicyCount) {
        this.PolicyCount = PolicyCount;
    }

    public CosRiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRiskInfo(CosRiskInfo source) {
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

