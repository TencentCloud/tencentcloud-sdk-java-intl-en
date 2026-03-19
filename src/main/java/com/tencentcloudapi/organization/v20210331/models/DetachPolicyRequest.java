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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetachPolicyRequest extends AbstractModel {

    /**
    * <p>Unbind policy target ID. member Uin or department ID</p>.
    */
    @SerializedName("TargetId")
    @Expose
    private Long TargetId;

    /**
    * <p>Target type. valid values: NODE-department, MEMBER-MEMBER</p>.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>Policy Id. you can call the <a href="https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1">ListPolicies</a> api to obtain it.</p>.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * <p>POLICY type. default value: SERVICE_CONTROL_POLICY. valid values: SERVICE_CONTROL_POLICY (SERVICE CONTROL POLICY) and TAG_POLICY (TAG POLICY).</p>.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>Unbind policy target ID. member Uin or department ID</p>. 
     * @return TargetId <p>Unbind policy target ID. member Uin or department ID</p>.
     */
    public Long getTargetId() {
        return this.TargetId;
    }

    /**
     * Set <p>Unbind policy target ID. member Uin or department ID</p>.
     * @param TargetId <p>Unbind policy target ID. member Uin or department ID</p>.
     */
    public void setTargetId(Long TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get <p>Target type. valid values: NODE-department, MEMBER-MEMBER</p>. 
     * @return TargetType <p>Target type. valid values: NODE-department, MEMBER-MEMBER</p>.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>Target type. valid values: NODE-department, MEMBER-MEMBER</p>.
     * @param TargetType <p>Target type. valid values: NODE-department, MEMBER-MEMBER</p>.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>Policy Id. you can call the <a href="https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1">ListPolicies</a> api to obtain it.</p>. 
     * @return PolicyId <p>Policy Id. you can call the <a href="https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1">ListPolicies</a> api to obtain it.</p>.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>Policy Id. you can call the <a href="https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1">ListPolicies</a> api to obtain it.</p>.
     * @param PolicyId <p>Policy Id. you can call the <a href="https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1">ListPolicies</a> api to obtain it.</p>.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>POLICY type. default value: SERVICE_CONTROL_POLICY. valid values: SERVICE_CONTROL_POLICY (SERVICE CONTROL POLICY) and TAG_POLICY (TAG POLICY).</p>. 
     * @return Type <p>POLICY type. default value: SERVICE_CONTROL_POLICY. valid values: SERVICE_CONTROL_POLICY (SERVICE CONTROL POLICY) and TAG_POLICY (TAG POLICY).</p>.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>POLICY type. default value: SERVICE_CONTROL_POLICY. valid values: SERVICE_CONTROL_POLICY (SERVICE CONTROL POLICY) and TAG_POLICY (TAG POLICY).</p>.
     * @param Type <p>POLICY type. default value: SERVICE_CONTROL_POLICY. valid values: SERVICE_CONTROL_POLICY (SERVICE CONTROL POLICY) and TAG_POLICY (TAG POLICY).</p>.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DetachPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetachPolicyRequest(DetachPolicyRequest source) {
        if (source.TargetId != null) {
            this.TargetId = new Long(source.TargetId);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

