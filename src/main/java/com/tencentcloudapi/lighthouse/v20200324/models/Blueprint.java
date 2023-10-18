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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Blueprint extends AbstractModel {

    /**
    * Image ID, which is the unique identifier of `Blueprint`.
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * Image title to be displayed.
    */
    @SerializedName("DisplayTitle")
    @Expose
    private String DisplayTitle;

    /**
    * Image version to be displayed.
    */
    @SerializedName("DisplayVersion")
    @Expose
    private String DisplayVersion;

    /**
    * Image description information.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * OS name.
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * OS type.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * OS type, such as LINUX_UNIX and WINDOWS.
    */
    @SerializedName("PlatformType")
    @Expose
    private String PlatformType;

    /**
    * Image type, such as APP_OS, PURE_OS, and PRIVATE.
    */
    @SerializedName("BlueprintType")
    @Expose
    private String BlueprintType;

    /**
    * Image picture URL.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * System disk size required by image in GB.
    */
    @SerializedName("RequiredSystemDiskSize")
    @Expose
    private Long RequiredSystemDiskSize;

    /**
    * Image status.
    */
    @SerializedName("BlueprintState")
    @Expose
    private String BlueprintState;

    /**
    * Creation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Image name.
    */
    @SerializedName("BlueprintName")
    @Expose
    private String BlueprintName;

    /**
    * Whether the image supports automation tools.
    */
    @SerializedName("SupportAutomationTools")
    @Expose
    private Boolean SupportAutomationTools;

    /**
    * Memory size required by image in GB.
    */
    @SerializedName("RequiredMemorySize")
    @Expose
    private Long RequiredMemorySize;

    /**
    * ID of the Lighthouse image shared from a CVM image
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * URL of official website of the open-source project
    */
    @SerializedName("CommunityUrl")
    @Expose
    private String CommunityUrl;

    /**
    * Guide documentation URL
    */
    @SerializedName("GuideUrl")
    @Expose
    private String GuideUrl;

    /**
    * Array of IDs of scenes associated with an image
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SceneIdSet")
    @Expose
    private String [] SceneIdSet;

    /**
    * Docker version.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
     * Get Image ID, which is the unique identifier of `Blueprint`. 
     * @return BlueprintId Image ID, which is the unique identifier of `Blueprint`.
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set Image ID, which is the unique identifier of `Blueprint`.
     * @param BlueprintId Image ID, which is the unique identifier of `Blueprint`.
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get Image title to be displayed. 
     * @return DisplayTitle Image title to be displayed.
     */
    public String getDisplayTitle() {
        return this.DisplayTitle;
    }

    /**
     * Set Image title to be displayed.
     * @param DisplayTitle Image title to be displayed.
     */
    public void setDisplayTitle(String DisplayTitle) {
        this.DisplayTitle = DisplayTitle;
    }

    /**
     * Get Image version to be displayed. 
     * @return DisplayVersion Image version to be displayed.
     */
    public String getDisplayVersion() {
        return this.DisplayVersion;
    }

    /**
     * Set Image version to be displayed.
     * @param DisplayVersion Image version to be displayed.
     */
    public void setDisplayVersion(String DisplayVersion) {
        this.DisplayVersion = DisplayVersion;
    }

    /**
     * Get Image description information.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Description Image description information.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Image description information.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Description Image description information.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get OS name. 
     * @return OsName OS name.
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set OS name.
     * @param OsName OS name.
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get OS type. 
     * @return Platform OS type.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set OS type.
     * @param Platform OS type.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get OS type, such as LINUX_UNIX and WINDOWS. 
     * @return PlatformType OS type, such as LINUX_UNIX and WINDOWS.
     */
    public String getPlatformType() {
        return this.PlatformType;
    }

    /**
     * Set OS type, such as LINUX_UNIX and WINDOWS.
     * @param PlatformType OS type, such as LINUX_UNIX and WINDOWS.
     */
    public void setPlatformType(String PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * Get Image type, such as APP_OS, PURE_OS, and PRIVATE. 
     * @return BlueprintType Image type, such as APP_OS, PURE_OS, and PRIVATE.
     */
    public String getBlueprintType() {
        return this.BlueprintType;
    }

    /**
     * Set Image type, such as APP_OS, PURE_OS, and PRIVATE.
     * @param BlueprintType Image type, such as APP_OS, PURE_OS, and PRIVATE.
     */
    public void setBlueprintType(String BlueprintType) {
        this.BlueprintType = BlueprintType;
    }

    /**
     * Get Image picture URL. 
     * @return ImageUrl Image picture URL.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Image picture URL.
     * @param ImageUrl Image picture URL.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get System disk size required by image in GB. 
     * @return RequiredSystemDiskSize System disk size required by image in GB.
     */
    public Long getRequiredSystemDiskSize() {
        return this.RequiredSystemDiskSize;
    }

    /**
     * Set System disk size required by image in GB.
     * @param RequiredSystemDiskSize System disk size required by image in GB.
     */
    public void setRequiredSystemDiskSize(Long RequiredSystemDiskSize) {
        this.RequiredSystemDiskSize = RequiredSystemDiskSize;
    }

    /**
     * Get Image status. 
     * @return BlueprintState Image status.
     */
    public String getBlueprintState() {
        return this.BlueprintState;
    }

    /**
     * Set Image status.
     * @param BlueprintState Image status.
     */
    public void setBlueprintState(String BlueprintState) {
        this.BlueprintState = BlueprintState;
    }

    /**
     * Get Creation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Image name. 
     * @return BlueprintName Image name.
     */
    public String getBlueprintName() {
        return this.BlueprintName;
    }

    /**
     * Set Image name.
     * @param BlueprintName Image name.
     */
    public void setBlueprintName(String BlueprintName) {
        this.BlueprintName = BlueprintName;
    }

    /**
     * Get Whether the image supports automation tools. 
     * @return SupportAutomationTools Whether the image supports automation tools.
     */
    public Boolean getSupportAutomationTools() {
        return this.SupportAutomationTools;
    }

    /**
     * Set Whether the image supports automation tools.
     * @param SupportAutomationTools Whether the image supports automation tools.
     */
    public void setSupportAutomationTools(Boolean SupportAutomationTools) {
        this.SupportAutomationTools = SupportAutomationTools;
    }

    /**
     * Get Memory size required by image in GB. 
     * @return RequiredMemorySize Memory size required by image in GB.
     */
    public Long getRequiredMemorySize() {
        return this.RequiredMemorySize;
    }

    /**
     * Set Memory size required by image in GB.
     * @param RequiredMemorySize Memory size required by image in GB.
     */
    public void setRequiredMemorySize(Long RequiredMemorySize) {
        this.RequiredMemorySize = RequiredMemorySize;
    }

    /**
     * Get ID of the Lighthouse image shared from a CVM image
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ImageId ID of the Lighthouse image shared from a CVM image
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set ID of the Lighthouse image shared from a CVM image
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ImageId ID of the Lighthouse image shared from a CVM image
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get URL of official website of the open-source project 
     * @return CommunityUrl URL of official website of the open-source project
     */
    public String getCommunityUrl() {
        return this.CommunityUrl;
    }

    /**
     * Set URL of official website of the open-source project
     * @param CommunityUrl URL of official website of the open-source project
     */
    public void setCommunityUrl(String CommunityUrl) {
        this.CommunityUrl = CommunityUrl;
    }

    /**
     * Get Guide documentation URL 
     * @return GuideUrl Guide documentation URL
     */
    public String getGuideUrl() {
        return this.GuideUrl;
    }

    /**
     * Set Guide documentation URL
     * @param GuideUrl Guide documentation URL
     */
    public void setGuideUrl(String GuideUrl) {
        this.GuideUrl = GuideUrl;
    }

    /**
     * Get Array of IDs of scenes associated with an image
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SceneIdSet Array of IDs of scenes associated with an image
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getSceneIdSet() {
        return this.SceneIdSet;
    }

    /**
     * Set Array of IDs of scenes associated with an image
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SceneIdSet Array of IDs of scenes associated with an image
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSceneIdSet(String [] SceneIdSet) {
        this.SceneIdSet = SceneIdSet;
    }

    /**
     * Get Docker version.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DockerVersion Docker version.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set Docker version.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DockerVersion Docker version.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    public Blueprint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Blueprint(Blueprint source) {
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.DisplayTitle != null) {
            this.DisplayTitle = new String(source.DisplayTitle);
        }
        if (source.DisplayVersion != null) {
            this.DisplayVersion = new String(source.DisplayVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.PlatformType != null) {
            this.PlatformType = new String(source.PlatformType);
        }
        if (source.BlueprintType != null) {
            this.BlueprintType = new String(source.BlueprintType);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.RequiredSystemDiskSize != null) {
            this.RequiredSystemDiskSize = new Long(source.RequiredSystemDiskSize);
        }
        if (source.BlueprintState != null) {
            this.BlueprintState = new String(source.BlueprintState);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.BlueprintName != null) {
            this.BlueprintName = new String(source.BlueprintName);
        }
        if (source.SupportAutomationTools != null) {
            this.SupportAutomationTools = new Boolean(source.SupportAutomationTools);
        }
        if (source.RequiredMemorySize != null) {
            this.RequiredMemorySize = new Long(source.RequiredMemorySize);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.CommunityUrl != null) {
            this.CommunityUrl = new String(source.CommunityUrl);
        }
        if (source.GuideUrl != null) {
            this.GuideUrl = new String(source.GuideUrl);
        }
        if (source.SceneIdSet != null) {
            this.SceneIdSet = new String[source.SceneIdSet.length];
            for (int i = 0; i < source.SceneIdSet.length; i++) {
                this.SceneIdSet[i] = new String(source.SceneIdSet[i]);
            }
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamSimple(map, prefix + "DisplayTitle", this.DisplayTitle);
        this.setParamSimple(map, prefix + "DisplayVersion", this.DisplayVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "PlatformType", this.PlatformType);
        this.setParamSimple(map, prefix + "BlueprintType", this.BlueprintType);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "RequiredSystemDiskSize", this.RequiredSystemDiskSize);
        this.setParamSimple(map, prefix + "BlueprintState", this.BlueprintState);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "BlueprintName", this.BlueprintName);
        this.setParamSimple(map, prefix + "SupportAutomationTools", this.SupportAutomationTools);
        this.setParamSimple(map, prefix + "RequiredMemorySize", this.RequiredMemorySize);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "CommunityUrl", this.CommunityUrl);
        this.setParamSimple(map, prefix + "GuideUrl", this.GuideUrl);
        this.setParamArraySimple(map, prefix + "SceneIdSet.", this.SceneIdSet);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);

    }
}

