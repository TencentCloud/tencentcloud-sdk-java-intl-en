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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachRolePolicyRequest extends AbstractModel{

    /**
    * Policy ID. Either `PolicyId` or `PolicyName` must be entered
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Role ID, used to specify a role. Input either `AttachRoleId` or `AttachRoleName`
    */
    @SerializedName("AttachRoleId")
    @Expose
    private String AttachRoleId;

    /**
    * Role name, used to specify a role. Input either `AttachRoleId` or `AttachRoleName`
    */
    @SerializedName("AttachRoleName")
    @Expose
    private String AttachRoleName;

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
     * Get Role ID, used to specify a role. Input either `AttachRoleId` or `AttachRoleName` 
     * @return AttachRoleId Role ID, used to specify a role. Input either `AttachRoleId` or `AttachRoleName`
     */
    public String getAttachRoleId() {
        return this.AttachRoleId;
    }

    /**
     * Set Role ID, used to specify a role. Input either `AttachRoleId` or `AttachRoleName`
     * @param AttachRoleId Role ID, used to specify a role. Input either `AttachRoleId` or `AttachRoleName`
     */
    public void setAttachRoleId(String AttachRoleId) {
        this.AttachRoleId = AttachRoleId;
    }

    /**
     * Get Role name, used to specify a role. Input either `AttachRoleId` or `AttachRoleName` 
     * @return AttachRoleName Role name, used to specify a role. Input either `AttachRoleId` or `AttachRoleName`
     */
    public String getAttachRoleName() {
        return this.AttachRoleName;
    }

    /**
     * Set Role name, used to specify a role. Input either `AttachRoleId` or `AttachRoleName`
     * @param AttachRoleName Role name, used to specify a role. Input either `AttachRoleId` or `AttachRoleName`
     */
    public void setAttachRoleName(String AttachRoleName) {
        this.AttachRoleName = AttachRoleName;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "AttachRoleId", this.AttachRoleId);
        this.setParamSimple(map, prefix + "AttachRoleName", this.AttachRoleName);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);

    }
}

