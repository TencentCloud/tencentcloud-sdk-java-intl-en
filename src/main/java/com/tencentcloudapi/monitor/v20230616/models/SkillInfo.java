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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillInfo extends AbstractModel {

    /**
    * <p>Skill ID</p>
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * <p>Skill name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Skill description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Whether to enable</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>Skill ID</p> 
     * @return SkillId <p>Skill ID</p>
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set <p>Skill ID</p>
     * @param SkillId <p>Skill ID</p>
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get <p>Skill name</p> 
     * @return Name <p>Skill name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Skill name</p>
     * @param Name <p>Skill name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Skill description.</p> 
     * @return Description <p>Skill description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Skill description.</p>
     * @param Description <p>Skill description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Whether to enable</p> 
     * @return Enabled <p>Whether to enable</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether to enable</p>
     * @param Enabled <p>Whether to enable</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public SkillInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillInfo(SkillInfo source) {
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

