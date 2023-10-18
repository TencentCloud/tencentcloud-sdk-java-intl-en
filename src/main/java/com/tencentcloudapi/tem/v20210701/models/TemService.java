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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemService extends AbstractModel {

    /**
    * Version ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Description
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ID of the environment
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * Modification time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyDate")
    @Expose
    private String ModifyDate;

    /**
    * Modifier
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Modifier")
    @Expose
    private String Modifier;

    /**
    * Creator account
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * TCR Individual or TCR Enterprise
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RepoType")
    @Expose
    private Long RepoType;

    /**
    * ID of the TCR Enterprise instance
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Name of the TCR instance
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * Programming Language
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CodingLanguage")
    @Expose
    private String CodingLanguage;

    /**
    * Deployment mode
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * Environment name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * The instance information where the application is running
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ActiveVersions")
    @Expose
    private ServiceVersionBrief [] ActiveVersions;

    /**
    * Whether to enable link tracing
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableTracing")
    @Expose
    private Long EnableTracing;

    /**
    * Tag
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether it’s authorized to access the resource
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HasAuthority")
    @Expose
    private Boolean HasAuthority;

    /**
     * Get Version ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplicationId Version ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Version ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ApplicationId Version ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ApplicationName Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Description
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Description Description
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Description Description
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get ID of the environment
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnvironmentId ID of the environment
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set ID of the environment
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnvironmentId ID of the environment
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Creation time.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateDate Creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set Creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CreateDate Creation time.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get Modification time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ModifyDate Modification time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getModifyDate() {
        return this.ModifyDate;
    }

    /**
     * Set Modification time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ModifyDate Modification time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    /**
     * Get Modifier
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Modifier Modifier
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getModifier() {
        return this.Modifier;
    }

    /**
     * Set Modifier
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Modifier Modifier
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setModifier(String Modifier) {
        this.Modifier = Modifier;
    }

    /**
     * Get Creator account
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Creator Creator account
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator account
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Creator Creator account
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get TCR Individual or TCR Enterprise
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RepoType TCR Individual or TCR Enterprise
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getRepoType() {
        return this.RepoType;
    }

    /**
     * Set TCR Individual or TCR Enterprise
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RepoType TCR Individual or TCR Enterprise
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRepoType(Long RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get ID of the TCR Enterprise instance
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return InstanceId ID of the TCR Enterprise instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the TCR Enterprise instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param InstanceId ID of the TCR Enterprise instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Name of the TCR instance
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RepoName Name of the TCR instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set Name of the TCR instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RepoName Name of the TCR instance
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get Programming Language
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CodingLanguage Programming Language
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCodingLanguage() {
        return this.CodingLanguage;
    }

    /**
     * Set Programming Language
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CodingLanguage Programming Language
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCodingLanguage(String CodingLanguage) {
        this.CodingLanguage = CodingLanguage;
    }

    /**
     * Get Deployment mode
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DeployMode Deployment mode
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Deployment mode
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DeployMode Deployment mode
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get Environment name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnvironmentName Environment name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Environment name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnvironmentName Environment name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get The instance information where the application is running
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ActiveVersions The instance information where the application is running
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public ServiceVersionBrief [] getActiveVersions() {
        return this.ActiveVersions;
    }

    /**
     * Set The instance information where the application is running
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ActiveVersions The instance information where the application is running
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setActiveVersions(ServiceVersionBrief [] ActiveVersions) {
        this.ActiveVersions = ActiveVersions;
    }

    /**
     * Get Whether to enable link tracing
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return EnableTracing Whether to enable link tracing
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEnableTracing() {
        return this.EnableTracing;
    }

    /**
     * Set Whether to enable link tracing
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param EnableTracing Whether to enable link tracing
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEnableTracing(Long EnableTracing) {
        this.EnableTracing = EnableTracing;
    }

    /**
     * Get Tag
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Tags Tag
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: This field may return `null`, indicating that no valid value was found.
     * @param Tags Tag
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether it’s authorized to access the resource
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HasAuthority Whether it’s authorized to access the resource
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getHasAuthority() {
        return this.HasAuthority;
    }

    /**
     * Set Whether it’s authorized to access the resource
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HasAuthority Whether it’s authorized to access the resource
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHasAuthority(Boolean HasAuthority) {
        this.HasAuthority = HasAuthority;
    }

    public TemService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemService(TemService source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.ModifyDate != null) {
            this.ModifyDate = new String(source.ModifyDate);
        }
        if (source.Modifier != null) {
            this.Modifier = new String(source.Modifier);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.RepoType != null) {
            this.RepoType = new Long(source.RepoType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.CodingLanguage != null) {
            this.CodingLanguage = new String(source.CodingLanguage);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ActiveVersions != null) {
            this.ActiveVersions = new ServiceVersionBrief[source.ActiveVersions.length];
            for (int i = 0; i < source.ActiveVersions.length; i++) {
                this.ActiveVersions[i] = new ServiceVersionBrief(source.ActiveVersions[i]);
            }
        }
        if (source.EnableTracing != null) {
            this.EnableTracing = new Long(source.EnableTracing);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HasAuthority != null) {
            this.HasAuthority = new Boolean(source.HasAuthority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "ModifyDate", this.ModifyDate);
        this.setParamSimple(map, prefix + "Modifier", this.Modifier);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "CodingLanguage", this.CodingLanguage);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamArrayObj(map, prefix + "ActiveVersions.", this.ActiveVersions);
        this.setParamSimple(map, prefix + "EnableTracing", this.EnableTracing);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HasAuthority", this.HasAuthority);

    }
}

