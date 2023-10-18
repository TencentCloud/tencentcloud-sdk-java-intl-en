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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaunchTemplateVersionInfo extends AbstractModel {

    /**
    * Instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LaunchTemplateVersion")
    @Expose
    private Long LaunchTemplateVersion;

    /**
    * Details of instance launch template versions.
    */
    @SerializedName("LaunchTemplateVersionData")
    @Expose
    private LaunchTemplateVersionData LaunchTemplateVersionData;

    /**
    * Creation time of the instance launch template version.
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Instance launch template ID.
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * Specifies whether it’s the default launch template version.
    */
    @SerializedName("IsDefaultVersion")
    @Expose
    private Boolean IsDefaultVersion;

    /**
    * Information of instance launch template version description.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LaunchTemplateVersionDescription")
    @Expose
    private String LaunchTemplateVersionDescription;

    /**
    * Creator account
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
     * Get Instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LaunchTemplateVersion Instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getLaunchTemplateVersion() {
        return this.LaunchTemplateVersion;
    }

    /**
     * Set Instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LaunchTemplateVersion Instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLaunchTemplateVersion(Long LaunchTemplateVersion) {
        this.LaunchTemplateVersion = LaunchTemplateVersion;
    }

    /**
     * Get Details of instance launch template versions. 
     * @return LaunchTemplateVersionData Details of instance launch template versions.
     */
    public LaunchTemplateVersionData getLaunchTemplateVersionData() {
        return this.LaunchTemplateVersionData;
    }

    /**
     * Set Details of instance launch template versions.
     * @param LaunchTemplateVersionData Details of instance launch template versions.
     */
    public void setLaunchTemplateVersionData(LaunchTemplateVersionData LaunchTemplateVersionData) {
        this.LaunchTemplateVersionData = LaunchTemplateVersionData;
    }

    /**
     * Get Creation time of the instance launch template version. 
     * @return CreationTime Creation time of the instance launch template version.
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Creation time of the instance launch template version.
     * @param CreationTime Creation time of the instance launch template version.
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Instance launch template ID. 
     * @return LaunchTemplateId Instance launch template ID.
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set Instance launch template ID.
     * @param LaunchTemplateId Instance launch template ID.
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get Specifies whether it’s the default launch template version. 
     * @return IsDefaultVersion Specifies whether it’s the default launch template version.
     */
    public Boolean getIsDefaultVersion() {
        return this.IsDefaultVersion;
    }

    /**
     * Set Specifies whether it’s the default launch template version.
     * @param IsDefaultVersion Specifies whether it’s the default launch template version.
     */
    public void setIsDefaultVersion(Boolean IsDefaultVersion) {
        this.IsDefaultVersion = IsDefaultVersion;
    }

    /**
     * Get Information of instance launch template version description.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LaunchTemplateVersionDescription Information of instance launch template version description.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLaunchTemplateVersionDescription() {
        return this.LaunchTemplateVersionDescription;
    }

    /**
     * Set Information of instance launch template version description.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LaunchTemplateVersionDescription Information of instance launch template version description.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLaunchTemplateVersionDescription(String LaunchTemplateVersionDescription) {
        this.LaunchTemplateVersionDescription = LaunchTemplateVersionDescription;
    }

    /**
     * Get Creator account 
     * @return CreatedBy Creator account
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set Creator account
     * @param CreatedBy Creator account
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public LaunchTemplateVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaunchTemplateVersionInfo(LaunchTemplateVersionInfo source) {
        if (source.LaunchTemplateVersion != null) {
            this.LaunchTemplateVersion = new Long(source.LaunchTemplateVersion);
        }
        if (source.LaunchTemplateVersionData != null) {
            this.LaunchTemplateVersionData = new LaunchTemplateVersionData(source.LaunchTemplateVersionData);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.IsDefaultVersion != null) {
            this.IsDefaultVersion = new Boolean(source.IsDefaultVersion);
        }
        if (source.LaunchTemplateVersionDescription != null) {
            this.LaunchTemplateVersionDescription = new String(source.LaunchTemplateVersionDescription);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchTemplateVersion", this.LaunchTemplateVersion);
        this.setParamObj(map, prefix + "LaunchTemplateVersionData.", this.LaunchTemplateVersionData);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamSimple(map, prefix + "IsDefaultVersion", this.IsDefaultVersion);
        this.setParamSimple(map, prefix + "LaunchTemplateVersionDescription", this.LaunchTemplateVersionDescription);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);

    }
}

