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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetachRolePolicyRequest extends AbstractModel {

    /**
    * Policy ID. Either `PolicyId` or `PolicyName` must be entered
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Role ID, which is used to specify a role. The input parameter is either `DetachRoleId` or `DetachRoleName`.
    */
    @SerializedName("DetachRoleId")
    @Expose
    private String DetachRoleId;

    /**
    * Role name, which is used to specify a role. The input parameter is either `DetachRoleId` or `DetachRoleName`.
    */
    @SerializedName("DetachRoleName")
    @Expose
    private String DetachRoleName;

    /**
    * Policy name. Either `PolicyId` or `PolicyName` must be entered
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
     * Get Policy ID. Either `PolicyId` or `PolicyName` must be entered 
     * @return PolicyId Policy ID. Either `PolicyId` or `PolicyName` must be entered
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID. Either `PolicyId` or `PolicyName` must be entered
     * @param PolicyId Policy ID. Either `PolicyId` or `PolicyName` must be entered
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Role ID, which is used to specify a role. The input parameter is either `DetachRoleId` or `DetachRoleName`. 
     * @return DetachRoleId Role ID, which is used to specify a role. The input parameter is either `DetachRoleId` or `DetachRoleName`.
     */
    public String getDetachRoleId() {
        return this.DetachRoleId;
    }

    /**
     * Set Role ID, which is used to specify a role. The input parameter is either `DetachRoleId` or `DetachRoleName`.
     * @param DetachRoleId Role ID, which is used to specify a role. The input parameter is either `DetachRoleId` or `DetachRoleName`.
     */
    public void setDetachRoleId(String DetachRoleId) {
        this.DetachRoleId = DetachRoleId;
    }

    /**
     * Get Role name, which is used to specify a role. The input parameter is either `DetachRoleId` or `DetachRoleName`. 
     * @return DetachRoleName Role name, which is used to specify a role. The input parameter is either `DetachRoleId` or `DetachRoleName`.
     */
    public String getDetachRoleName() {
        return this.DetachRoleName;
    }

    /**
     * Set Role name, which is used to specify a role. The input parameter is either `DetachRoleId` or `DetachRoleName`.
     * @param DetachRoleName Role name, which is used to specify a role. The input parameter is either `DetachRoleId` or `DetachRoleName`.
     */
    public void setDetachRoleName(String DetachRoleName) {
        this.DetachRoleName = DetachRoleName;
    }

    /**
     * Get Policy name. Either `PolicyId` or `PolicyName` must be entered 
     * @return PolicyName Policy name. Either `PolicyId` or `PolicyName` must be entered
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name. Either `PolicyId` or `PolicyName` must be entered
     * @param PolicyName Policy name. Either `PolicyId` or `PolicyName` must be entered
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    public DetachRolePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetachRolePolicyRequest(DetachRolePolicyRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.DetachRoleId != null) {
            this.DetachRoleId = new String(source.DetachRoleId);
        }
        if (source.DetachRoleName != null) {
            this.DetachRoleName = new String(source.DetachRoleName);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "DetachRoleId", this.DetachRoleId);
        this.setParamSimple(map, prefix + "DetachRoleName", this.DetachRoleName);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);

    }
}

