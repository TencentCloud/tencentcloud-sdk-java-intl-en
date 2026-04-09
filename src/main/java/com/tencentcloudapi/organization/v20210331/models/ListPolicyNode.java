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

public class ListPolicyNode extends AbstractModel {

    /**
    * Policy creation time.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Policy binding count.
    */
    @SerializedName("AttachedTimes")
    @Expose
    private Long AttachedTimes;

    /**
    * Policy description information.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Policy name.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Policy type. 1: custom; 2: preset.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Policy creation time. 
     * @return AddTime Policy creation time.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Policy creation time.
     * @param AddTime Policy creation time.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Policy binding count. 
     * @return AttachedTimes Policy binding count.
     */
    public Long getAttachedTimes() {
        return this.AttachedTimes;
    }

    /**
     * Set Policy binding count.
     * @param AttachedTimes Policy binding count.
     */
    public void setAttachedTimes(Long AttachedTimes) {
        this.AttachedTimes = AttachedTimes;
    }

    /**
     * Get Policy description information. 
     * @return Description Policy description information.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description information.
     * @param Description Policy description information.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Policy name. 
     * @return PolicyName Policy name.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name.
     * @param PolicyName Policy name.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Policy update time 
     * @return UpdateTime Policy update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Policy update time
     * @param UpdateTime Policy update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Policy type. 1: custom; 2: preset. 
     * @return Type Policy type. 1: custom; 2: preset.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Policy type. 1: custom; 2: preset.
     * @param Type Policy type. 1: custom; 2: preset.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ListPolicyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPolicyNode(ListPolicyNode source) {
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.AttachedTimes != null) {
            this.AttachedTimes = new Long(source.AttachedTimes);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "AttachedTimes", this.AttachedTimes);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

