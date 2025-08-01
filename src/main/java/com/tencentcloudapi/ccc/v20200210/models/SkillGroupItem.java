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

public class SkillGroupItem extends AbstractModel {

    /**
    * Skill group id.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * Skill group name.
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
    * Priority.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Type: im, tel, all (full media).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Skill group id. 
     * @return SkillGroupId Skill group id.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Skill group id.
     * @param SkillGroupId Skill group id.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get Skill group name. 
     * @return SkillGroupName Skill group name.
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set Skill group name.
     * @param SkillGroupName Skill group name.
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    /**
     * Get Priority. 
     * @return Priority Priority.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority.
     * @param Priority Priority.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Type: im, tel, all (full media). 
     * @return Type Type: im, tel, all (full media).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type: im, tel, all (full media).
     * @param Type Type: im, tel, all (full media).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public SkillGroupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillGroupItem(SkillGroupItem source) {
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.SkillGroupName != null) {
            this.SkillGroupName = new String(source.SkillGroupName);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "SkillGroupName", this.SkillGroupName);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

