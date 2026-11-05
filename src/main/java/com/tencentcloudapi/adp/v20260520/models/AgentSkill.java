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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentSkill extends AbstractModel {

    /**
    * <p>skillId</p>
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * <p>skill name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Skill description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>skill display name</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>Skill show description</p>
    */
    @SerializedName("DisplayDescription")
    @Expose
    private String DisplayDescription;

    /**
    * <p>skill icon url</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>Skill source</p>
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * <p>Skill version</p>
    */
    @SerializedName("CurrentVersion")
    @Expose
    private String CurrentVersion;

    /**
     * Get <p>skillId</p> 
     * @return SkillId <p>skillId</p>
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set <p>skillId</p>
     * @param SkillId <p>skillId</p>
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get <p>skill name</p> 
     * @return Name <p>skill name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>skill name</p>
     * @param Name <p>skill name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Skill description</p> 
     * @return Description <p>Skill description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Skill description</p>
     * @param Description <p>Skill description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>skill display name</p> 
     * @return DisplayName <p>skill display name</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>skill display name</p>
     * @param DisplayName <p>skill display name</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>Skill show description</p> 
     * @return DisplayDescription <p>Skill show description</p>
     */
    public String getDisplayDescription() {
        return this.DisplayDescription;
    }

    /**
     * Set <p>Skill show description</p>
     * @param DisplayDescription <p>Skill show description</p>
     */
    public void setDisplayDescription(String DisplayDescription) {
        this.DisplayDescription = DisplayDescription;
    }

    /**
     * Get <p>skill icon url</p> 
     * @return IconUrl <p>skill icon url</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>skill icon url</p>
     * @param IconUrl <p>skill icon url</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get <p>Skill source</p> 
     * @return SourceType <p>Skill source</p>
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>Skill source</p>
     * @param SourceType <p>Skill source</p>
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>Skill version</p> 
     * @return CurrentVersion <p>Skill version</p>
     */
    public String getCurrentVersion() {
        return this.CurrentVersion;
    }

    /**
     * Set <p>Skill version</p>
     * @param CurrentVersion <p>Skill version</p>
     */
    public void setCurrentVersion(String CurrentVersion) {
        this.CurrentVersion = CurrentVersion;
    }

    public AgentSkill() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentSkill(AgentSkill source) {
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.DisplayDescription != null) {
            this.DisplayDescription = new String(source.DisplayDescription);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.CurrentVersion != null) {
            this.CurrentVersion = new String(source.CurrentVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "DisplayDescription", this.DisplayDescription);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "CurrentVersion", this.CurrentVersion);

    }
}

