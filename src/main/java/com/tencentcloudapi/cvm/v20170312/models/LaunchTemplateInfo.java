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

public class LaunchTemplateInfo extends AbstractModel {

    /**
    * Instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestVersionNumber")
    @Expose
    private Long LatestVersionNumber;

    /**
    * Instance launch template ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * Instance launch template name.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LaunchTemplateName")
    @Expose
    private String LaunchTemplateName;

    /**
    * Default instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultVersionNumber")
    @Expose
    private Long DefaultVersionNumber;

    /**
    * Total number of versions that the instance launch template contains.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LaunchTemplateVersionCount")
    @Expose
    private Long LaunchTemplateVersionCount;

    /**
    * UIN of the user who created the template.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * Creation time of the template.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
     * Get Instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LatestVersionNumber Instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getLatestVersionNumber() {
        return this.LatestVersionNumber;
    }

    /**
     * Set Instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LatestVersionNumber Instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLatestVersionNumber(Long LatestVersionNumber) {
        this.LatestVersionNumber = LatestVersionNumber;
    }

    /**
     * Get Instance launch template ID.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LaunchTemplateId Instance launch template ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set Instance launch template ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LaunchTemplateId Instance launch template ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get Instance launch template name.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LaunchTemplateName Instance launch template name.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLaunchTemplateName() {
        return this.LaunchTemplateName;
    }

    /**
     * Set Instance launch template name.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LaunchTemplateName Instance launch template name.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLaunchTemplateName(String LaunchTemplateName) {
        this.LaunchTemplateName = LaunchTemplateName;
    }

    /**
     * Get Default instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DefaultVersionNumber Default instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDefaultVersionNumber() {
        return this.DefaultVersionNumber;
    }

    /**
     * Set Default instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DefaultVersionNumber Default instance launch template version number.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDefaultVersionNumber(Long DefaultVersionNumber) {
        this.DefaultVersionNumber = DefaultVersionNumber;
    }

    /**
     * Get Total number of versions that the instance launch template contains.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LaunchTemplateVersionCount Total number of versions that the instance launch template contains.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getLaunchTemplateVersionCount() {
        return this.LaunchTemplateVersionCount;
    }

    /**
     * Set Total number of versions that the instance launch template contains.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LaunchTemplateVersionCount Total number of versions that the instance launch template contains.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLaunchTemplateVersionCount(Long LaunchTemplateVersionCount) {
        this.LaunchTemplateVersionCount = LaunchTemplateVersionCount;
    }

    /**
     * Get UIN of the user who created the template.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CreatedBy UIN of the user who created the template.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set UIN of the user who created the template.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CreatedBy UIN of the user who created the template.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get Creation time of the template.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CreationTime Creation time of the template.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Creation time of the template.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CreationTime Creation time of the template.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    public LaunchTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaunchTemplateInfo(LaunchTemplateInfo source) {
        if (source.LatestVersionNumber != null) {
            this.LatestVersionNumber = new Long(source.LatestVersionNumber);
        }
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.LaunchTemplateName != null) {
            this.LaunchTemplateName = new String(source.LaunchTemplateName);
        }
        if (source.DefaultVersionNumber != null) {
            this.DefaultVersionNumber = new Long(source.DefaultVersionNumber);
        }
        if (source.LaunchTemplateVersionCount != null) {
            this.LaunchTemplateVersionCount = new Long(source.LaunchTemplateVersionCount);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LatestVersionNumber", this.LatestVersionNumber);
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamSimple(map, prefix + "LaunchTemplateName", this.LaunchTemplateName);
        this.setParamSimple(map, prefix + "DefaultVersionNumber", this.DefaultVersionNumber);
        this.setParamSimple(map, prefix + "LaunchTemplateVersionCount", this.LaunchTemplateVersionCount);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);

    }
}

