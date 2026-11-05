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

public class SkillProfile extends AbstractModel {

    /**
    * <p>Creation time (Unix seconds).</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Creator.</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>Skill description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Skill show description</p>
    */
    @SerializedName("DisplayDescription")
    @Expose
    private String DisplayDescription;

    /**
    * <p>Skill display name</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>Skill icon</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>Skill name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Update time (Unix seconds).</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Space</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
     * Get <p>Creation time (Unix seconds).</p> 
     * @return CreateTime <p>Creation time (Unix seconds).</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time (Unix seconds).</p>
     * @param CreateTime <p>Creation time (Unix seconds).</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Creator.</p> 
     * @return Creator <p>Creator.</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>Creator.</p>
     * @param Creator <p>Creator.</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
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
     * Get <p>Skill display name</p> 
     * @return DisplayName <p>Skill display name</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>Skill display name</p>
     * @param DisplayName <p>Skill display name</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>Skill icon</p> 
     * @return IconUrl <p>Skill icon</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>Skill icon</p>
     * @param IconUrl <p>Skill icon</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
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
     * Get <p>Update time (Unix seconds).</p> 
     * @return UpdateTime <p>Update time (Unix seconds).</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time (Unix seconds).</p>
     * @param UpdateTime <p>Update time (Unix seconds).</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Space</p> 
     * @return SpaceId <p>Space</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Space</p>
     * @param SpaceId <p>Space</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    public SkillProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillProfile(SkillProfile source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DisplayDescription != null) {
            this.DisplayDescription = new String(source.DisplayDescription);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DisplayDescription", this.DisplayDescription);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);

    }
}

