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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCCPrecisionPolicyRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
    */
    @SerializedName("PolicyAction")
    @Expose
    private String PolicyAction;

    /**
    * Policy records
    */
    @SerializedName("PolicyList")
    @Expose
    private CCPrecisionPlyRecord [] PolicyList;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests). 
     * @return PolicyAction Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
     */
    public String getPolicyAction() {
        return this.PolicyAction;
    }

    /**
     * Set Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
     * @param PolicyAction Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
     */
    public void setPolicyAction(String PolicyAction) {
        this.PolicyAction = PolicyAction;
    }

    /**
     * Get Policy records 
     * @return PolicyList Policy records
     */
    public CCPrecisionPlyRecord [] getPolicyList() {
        return this.PolicyList;
    }

    /**
     * Set Policy records
     * @param PolicyList Policy records
     */
    public void setPolicyList(CCPrecisionPlyRecord [] PolicyList) {
        this.PolicyList = PolicyList;
    }

    public ModifyCCPrecisionPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCCPrecisionPolicyRequest(ModifyCCPrecisionPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyAction != null) {
            this.PolicyAction = new String(source.PolicyAction);
        }
        if (source.PolicyList != null) {
            this.PolicyList = new CCPrecisionPlyRecord[source.PolicyList.length];
            for (int i = 0; i < source.PolicyList.length; i++) {
                this.PolicyList[i] = new CCPrecisionPlyRecord(source.PolicyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyAction", this.PolicyAction);
        this.setParamArrayObj(map, prefix + "PolicyList.", this.PolicyList);

    }
}

