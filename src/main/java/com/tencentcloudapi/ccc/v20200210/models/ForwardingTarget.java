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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardingTarget extends AbstractModel {

    /**
    * Call forwarding target type. valid values: 1 (agent), 2 (skill group), 3 (extension).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Specifies the agent account when the call forwarding target is set to agent and Type is 1.
    */
    @SerializedName("StaffUserId")
    @Expose
    private String StaffUserId;

    /**
    * Specifies the ID of the skill group as the call forwarding target. fill when Type is 2.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * The account to which the call is forwarded is an extension. fill when Type is 3.
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

    /**
     * Get Call forwarding target type. valid values: 1 (agent), 2 (skill group), 3 (extension). 
     * @return Type Call forwarding target type. valid values: 1 (agent), 2 (skill group), 3 (extension).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Call forwarding target type. valid values: 1 (agent), 2 (skill group), 3 (extension).
     * @param Type Call forwarding target type. valid values: 1 (agent), 2 (skill group), 3 (extension).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Specifies the agent account when the call forwarding target is set to agent and Type is 1. 
     * @return StaffUserId Specifies the agent account when the call forwarding target is set to agent and Type is 1.
     */
    public String getStaffUserId() {
        return this.StaffUserId;
    }

    /**
     * Set Specifies the agent account when the call forwarding target is set to agent and Type is 1.
     * @param StaffUserId Specifies the agent account when the call forwarding target is set to agent and Type is 1.
     */
    public void setStaffUserId(String StaffUserId) {
        this.StaffUserId = StaffUserId;
    }

    /**
     * Get Specifies the ID of the skill group as the call forwarding target. fill when Type is 2. 
     * @return SkillGroupId Specifies the ID of the skill group as the call forwarding target. fill when Type is 2.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Specifies the ID of the skill group as the call forwarding target. fill when Type is 2.
     * @param SkillGroupId Specifies the ID of the skill group as the call forwarding target. fill when Type is 2.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get The account to which the call is forwarded is an extension. fill when Type is 3. 
     * @return Extension The account to which the call is forwarded is an extension. fill when Type is 3.
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set The account to which the call is forwarded is an extension. fill when Type is 3.
     * @param Extension The account to which the call is forwarded is an extension. fill when Type is 3.
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public ForwardingTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardingTarget(ForwardingTarget source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.StaffUserId != null) {
            this.StaffUserId = new String(source.StaffUserId);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.Extension != null) {
            this.Extension = new String(source.Extension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StaffUserId", this.StaffUserId);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

