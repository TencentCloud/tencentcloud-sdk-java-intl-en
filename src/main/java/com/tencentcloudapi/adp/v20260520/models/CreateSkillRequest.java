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

public class CreateSkillRequest extends AbstractModel {

    /**
    * <p>Skill creation method, required; only allow</p><p>Enumeration values:</p><ul><li>1: FILE_UPLOAD (file upload)</li><li>3: AIGC (AIGC generation)</li></ul>
    */
    @SerializedName("CreateType")
    @Expose
    private Long CreateType;

    /**
    * <p>skill package file address (zip); required for both FILE_UPLOAD and AIGC</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>Workspace ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>skill show description</p>
    */
    @SerializedName("DisplayDescription")
    @Expose
    private String DisplayDescription;

    /**
    * <p>skill display name</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>Icon address</p>
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * <p>Unique business identifier name of the skill (unique within the same enterprise); if not passed, it will be parsed from the skill package</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Version number</p>
    */
    @SerializedName("SkillVersion")
    @Expose
    private String SkillVersion;

    /**
    * <p>Version change description</p>
    */
    @SerializedName("UpdateDescription")
    @Expose
    private String UpdateDescription;

    /**
     * Get <p>Skill creation method, required; only allow</p><p>Enumeration values:</p><ul><li>1: FILE_UPLOAD (file upload)</li><li>3: AIGC (AIGC generation)</li></ul> 
     * @return CreateType <p>Skill creation method, required; only allow</p><p>Enumeration values:</p><ul><li>1: FILE_UPLOAD (file upload)</li><li>3: AIGC (AIGC generation)</li></ul>
     */
    public Long getCreateType() {
        return this.CreateType;
    }

    /**
     * Set <p>Skill creation method, required; only allow</p><p>Enumeration values:</p><ul><li>1: FILE_UPLOAD (file upload)</li><li>3: AIGC (AIGC generation)</li></ul>
     * @param CreateType <p>Skill creation method, required; only allow</p><p>Enumeration values:</p><ul><li>1: FILE_UPLOAD (file upload)</li><li>3: AIGC (AIGC generation)</li></ul>
     */
    public void setCreateType(Long CreateType) {
        this.CreateType = CreateType;
    }

    /**
     * Get <p>skill package file address (zip); required for both FILE_UPLOAD and AIGC</p> 
     * @return FileUrl <p>skill package file address (zip); required for both FILE_UPLOAD and AIGC</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>skill package file address (zip); required for both FILE_UPLOAD and AIGC</p>
     * @param FileUrl <p>skill package file address (zip); required for both FILE_UPLOAD and AIGC</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>Workspace ID</p> 
     * @return SpaceId <p>Workspace ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Workspace ID</p>
     * @param SpaceId <p>Workspace ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>skill show description</p> 
     * @return DisplayDescription <p>skill show description</p>
     */
    public String getDisplayDescription() {
        return this.DisplayDescription;
    }

    /**
     * Set <p>skill show description</p>
     * @param DisplayDescription <p>skill show description</p>
     */
    public void setDisplayDescription(String DisplayDescription) {
        this.DisplayDescription = DisplayDescription;
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
     * Get <p>Icon address</p> 
     * @return IconUrl <p>Icon address</p>
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set <p>Icon address</p>
     * @param IconUrl <p>Icon address</p>
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get <p>Unique business identifier name of the skill (unique within the same enterprise); if not passed, it will be parsed from the skill package</p> 
     * @return Name <p>Unique business identifier name of the skill (unique within the same enterprise); if not passed, it will be parsed from the skill package</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Unique business identifier name of the skill (unique within the same enterprise); if not passed, it will be parsed from the skill package</p>
     * @param Name <p>Unique business identifier name of the skill (unique within the same enterprise); if not passed, it will be parsed from the skill package</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Version number</p> 
     * @return SkillVersion <p>Version number</p>
     */
    public String getSkillVersion() {
        return this.SkillVersion;
    }

    /**
     * Set <p>Version number</p>
     * @param SkillVersion <p>Version number</p>
     */
    public void setSkillVersion(String SkillVersion) {
        this.SkillVersion = SkillVersion;
    }

    /**
     * Get <p>Version change description</p> 
     * @return UpdateDescription <p>Version change description</p>
     */
    public String getUpdateDescription() {
        return this.UpdateDescription;
    }

    /**
     * Set <p>Version change description</p>
     * @param UpdateDescription <p>Version change description</p>
     */
    public void setUpdateDescription(String UpdateDescription) {
        this.UpdateDescription = UpdateDescription;
    }

    public CreateSkillRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSkillRequest(CreateSkillRequest source) {
        if (source.CreateType != null) {
            this.CreateType = new Long(source.CreateType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
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
        if (source.SkillVersion != null) {
            this.SkillVersion = new String(source.SkillVersion);
        }
        if (source.UpdateDescription != null) {
            this.UpdateDescription = new String(source.UpdateDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateType", this.CreateType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "DisplayDescription", this.DisplayDescription);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SkillVersion", this.SkillVersion);
        this.setParamSimple(map, prefix + "UpdateDescription", this.UpdateDescription);

    }
}

