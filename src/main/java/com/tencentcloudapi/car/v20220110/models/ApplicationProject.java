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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationProject extends AbstractModel {

    /**
    * Project ID.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project name.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Project description.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Concurrency type required for project operation.S1: concurrency for rendering small cloud applications.M1: concurrency for rendering medium cloud applications.L1: concurrency for rendering large cloud applications.L2: concurrency for rendering large cloud applications.XL2: concurrency for rendering extra large cloud applications.MM1_HD: concurrency for performance-based cloud ARM (HD).MM1_FHD: concurrency for performance-based cloud ARM (FHD).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Cloud application ID.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Pre-launch.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPreload")
    @Expose
    private Boolean IsPreload;

    /**
    * Number of concurrencies already configured.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * Number of concurrencies in use.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Using")
    @Expose
    private Long Using;

    /**
    * Application status. NoConcurrent: no concurrency pack configured; Online: activated. Cloud application status: applicationCreating: creating; applicationCreateFail: creation failed; applicationDeleting: deleting; applicationNoConfigured: startup parameters not configured.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationStatus")
    @Expose
    private String ApplicationStatus;

    /**
    * Application startup parameters.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationParams")
    @Expose
    private String ApplicationParams;

    /**
    * Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Application name.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Resolution, in the format of widthxheight, such as 1920x1080.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * Project type.SHARED: shared by all applications.EXCLUSIVE (default value): dedicated for one application.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectType")
    @Expose
    private String ProjectType;

    /**
    * Purpose.EXPERIENCE: Experience.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Purpose")
    @Expose
    private String Purpose;

    /**
    * Application distribution area. Standard areas are as follows. ap-chinese-mainland: Chinese mainland; na-north-america: North America; eu-frankfurt: Frankfurt; ap-mumbai: Mumbai; ap-tokyo: Tokyo; ap-seoul: Seoul; ap-singapore: Singapore; ap-bangkok: Bangkok; ap-hongkong: Hong Kong (China). Fusion areas are as follows. me-middle-east-fusion: Middle East; na-north-america-fusion: North America; sa-south-america-fusion: South America; ap-tokyo-fusion: Tokyo; ap-seoul-fusion: Seoul; eu-frankfurt-fusion: Frankfurt; ap-singapore-fusion: Singapore; ap-hongkong-fusion: Hong Kong (China).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationRegions")
    @Expose
    private String [] ApplicationRegions;

    /**
    * Concurrency area. Standard areas are as follows. ap-chinese-mainland: Chinese mainland; na-north-america: North America; eu-frankfurt: Frankfurt; ap-mumbai: Mumbai; ap-tokyo: Tokyo; ap-seoul: Seoul; ap-singapore: Singapore; ap-bangkok: Bangkok; ap-hongkong: Hong Kong (China). Fusion areas are as follows. me-middle-east-fusion: Middle East; na-north-america-fusion: North America; sa-south-america-fusion: South America; ap-tokyo-fusion: Tokyo; ap-seoul-fusion: Seoul; eu-frankfurt-fusion: Frankfurt; ap-singapore-fusion: Singapore; ap-hongkong-fusion: Hong Kong (China).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConcurrentRegions")
    @Expose
    private String [] ConcurrentRegions;

    /**
    * Project category.DESKTOP: desktop (default value).MOBILE: mobile.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectCategory")
    @Expose
    private String ProjectCategory;

    /**
     * Get Project ID.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Project name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Project name.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Project name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Project description.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Project description.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Project description.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Project description.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Concurrency type required for project operation.S1: concurrency for rendering small cloud applications.M1: concurrency for rendering medium cloud applications.L1: concurrency for rendering large cloud applications.L2: concurrency for rendering large cloud applications.XL2: concurrency for rendering extra large cloud applications.MM1_HD: concurrency for performance-based cloud ARM (HD).MM1_FHD: concurrency for performance-based cloud ARM (FHD).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Concurrency type required for project operation.S1: concurrency for rendering small cloud applications.M1: concurrency for rendering medium cloud applications.L1: concurrency for rendering large cloud applications.L2: concurrency for rendering large cloud applications.XL2: concurrency for rendering extra large cloud applications.MM1_HD: concurrency for performance-based cloud ARM (HD).MM1_FHD: concurrency for performance-based cloud ARM (FHD).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Concurrency type required for project operation.S1: concurrency for rendering small cloud applications.M1: concurrency for rendering medium cloud applications.L1: concurrency for rendering large cloud applications.L2: concurrency for rendering large cloud applications.XL2: concurrency for rendering extra large cloud applications.MM1_HD: concurrency for performance-based cloud ARM (HD).MM1_FHD: concurrency for performance-based cloud ARM (FHD).Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Concurrency type required for project operation.S1: concurrency for rendering small cloud applications.M1: concurrency for rendering medium cloud applications.L1: concurrency for rendering large cloud applications.L2: concurrency for rendering large cloud applications.XL2: concurrency for rendering extra large cloud applications.MM1_HD: concurrency for performance-based cloud ARM (HD).MM1_FHD: concurrency for performance-based cloud ARM (FHD).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Cloud application ID.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId Cloud application ID.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Cloud application ID.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId Cloud application ID.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Pre-launch.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsPreload Pre-launch.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsPreload() {
        return this.IsPreload;
    }

    /**
     * Set Pre-launch.Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsPreload Pre-launch.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPreload(Boolean IsPreload) {
        this.IsPreload = IsPreload;
    }

    /**
     * Get Number of concurrencies already configured.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Amount Number of concurrencies already configured.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set Number of concurrencies already configured.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Amount Number of concurrencies already configured.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get Number of concurrencies in use.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Using Number of concurrencies in use.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUsing() {
        return this.Using;
    }

    /**
     * Set Number of concurrencies in use.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Using Number of concurrencies in use.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsing(Long Using) {
        this.Using = Using;
    }

    /**
     * Get Application status. NoConcurrent: no concurrency pack configured; Online: activated. Cloud application status: applicationCreating: creating; applicationCreateFail: creation failed; applicationDeleting: deleting; applicationNoConfigured: startup parameters not configured.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationStatus Application status. NoConcurrent: no concurrency pack configured; Online: activated. Cloud application status: applicationCreating: creating; applicationCreateFail: creation failed; applicationDeleting: deleting; applicationNoConfigured: startup parameters not configured.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationStatus() {
        return this.ApplicationStatus;
    }

    /**
     * Set Application status. NoConcurrent: no concurrency pack configured; Online: activated. Cloud application status: applicationCreating: creating; applicationCreateFail: creation failed; applicationDeleting: deleting; applicationNoConfigured: startup parameters not configured.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationStatus Application status. NoConcurrent: no concurrency pack configured; Online: activated. Cloud application status: applicationCreating: creating; applicationCreateFail: creation failed; applicationDeleting: deleting; applicationNoConfigured: startup parameters not configured.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationStatus(String ApplicationStatus) {
        this.ApplicationStatus = ApplicationStatus;
    }

    /**
     * Get Application startup parameters.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationParams Application startup parameters.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationParams() {
        return this.ApplicationParams;
    }

    /**
     * Set Application startup parameters.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationParams Application startup parameters.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationParams(String ApplicationParams) {
        this.ApplicationParams = ApplicationParams;
    }

    /**
     * Get Creation time.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Application name.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName Application name.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Resolution, in the format of widthxheight, such as 1920x1080.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resolution Resolution, in the format of widthxheight, such as 1920x1080.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Resolution, in the format of widthxheight, such as 1920x1080.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resolution Resolution, in the format of widthxheight, such as 1920x1080.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Project type.SHARED: shared by all applications.EXCLUSIVE (default value): dedicated for one application.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectType Project type.SHARED: shared by all applications.EXCLUSIVE (default value): dedicated for one application.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectType() {
        return this.ProjectType;
    }

    /**
     * Set Project type.SHARED: shared by all applications.EXCLUSIVE (default value): dedicated for one application.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectType Project type.SHARED: shared by all applications.EXCLUSIVE (default value): dedicated for one application.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectType(String ProjectType) {
        this.ProjectType = ProjectType;
    }

    /**
     * Get Purpose.EXPERIENCE: Experience.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Purpose Purpose.EXPERIENCE: Experience.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPurpose() {
        return this.Purpose;
    }

    /**
     * Set Purpose.EXPERIENCE: Experience.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Purpose Purpose.EXPERIENCE: Experience.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    /**
     * Get Application distribution area. Standard areas are as follows. ap-chinese-mainland: Chinese mainland; na-north-america: North America; eu-frankfurt: Frankfurt; ap-mumbai: Mumbai; ap-tokyo: Tokyo; ap-seoul: Seoul; ap-singapore: Singapore; ap-bangkok: Bangkok; ap-hongkong: Hong Kong (China). Fusion areas are as follows. me-middle-east-fusion: Middle East; na-north-america-fusion: North America; sa-south-america-fusion: South America; ap-tokyo-fusion: Tokyo; ap-seoul-fusion: Seoul; eu-frankfurt-fusion: Frankfurt; ap-singapore-fusion: Singapore; ap-hongkong-fusion: Hong Kong (China).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationRegions Application distribution area. Standard areas are as follows. ap-chinese-mainland: Chinese mainland; na-north-america: North America; eu-frankfurt: Frankfurt; ap-mumbai: Mumbai; ap-tokyo: Tokyo; ap-seoul: Seoul; ap-singapore: Singapore; ap-bangkok: Bangkok; ap-hongkong: Hong Kong (China). Fusion areas are as follows. me-middle-east-fusion: Middle East; na-north-america-fusion: North America; sa-south-america-fusion: South America; ap-tokyo-fusion: Tokyo; ap-seoul-fusion: Seoul; eu-frankfurt-fusion: Frankfurt; ap-singapore-fusion: Singapore; ap-hongkong-fusion: Hong Kong (China).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getApplicationRegions() {
        return this.ApplicationRegions;
    }

    /**
     * Set Application distribution area. Standard areas are as follows. ap-chinese-mainland: Chinese mainland; na-north-america: North America; eu-frankfurt: Frankfurt; ap-mumbai: Mumbai; ap-tokyo: Tokyo; ap-seoul: Seoul; ap-singapore: Singapore; ap-bangkok: Bangkok; ap-hongkong: Hong Kong (China). Fusion areas are as follows. me-middle-east-fusion: Middle East; na-north-america-fusion: North America; sa-south-america-fusion: South America; ap-tokyo-fusion: Tokyo; ap-seoul-fusion: Seoul; eu-frankfurt-fusion: Frankfurt; ap-singapore-fusion: Singapore; ap-hongkong-fusion: Hong Kong (China).Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationRegions Application distribution area. Standard areas are as follows. ap-chinese-mainland: Chinese mainland; na-north-america: North America; eu-frankfurt: Frankfurt; ap-mumbai: Mumbai; ap-tokyo: Tokyo; ap-seoul: Seoul; ap-singapore: Singapore; ap-bangkok: Bangkok; ap-hongkong: Hong Kong (China). Fusion areas are as follows. me-middle-east-fusion: Middle East; na-north-america-fusion: North America; sa-south-america-fusion: South America; ap-tokyo-fusion: Tokyo; ap-seoul-fusion: Seoul; eu-frankfurt-fusion: Frankfurt; ap-singapore-fusion: Singapore; ap-hongkong-fusion: Hong Kong (China).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationRegions(String [] ApplicationRegions) {
        this.ApplicationRegions = ApplicationRegions;
    }

    /**
     * Get Concurrency area. Standard areas are as follows. ap-chinese-mainland: Chinese mainland; na-north-america: North America; eu-frankfurt: Frankfurt; ap-mumbai: Mumbai; ap-tokyo: Tokyo; ap-seoul: Seoul; ap-singapore: Singapore; ap-bangkok: Bangkok; ap-hongkong: Hong Kong (China). Fusion areas are as follows. me-middle-east-fusion: Middle East; na-north-america-fusion: North America; sa-south-america-fusion: South America; ap-tokyo-fusion: Tokyo; ap-seoul-fusion: Seoul; eu-frankfurt-fusion: Frankfurt; ap-singapore-fusion: Singapore; ap-hongkong-fusion: Hong Kong (China).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConcurrentRegions Concurrency area. Standard areas are as follows. ap-chinese-mainland: Chinese mainland; na-north-america: North America; eu-frankfurt: Frankfurt; ap-mumbai: Mumbai; ap-tokyo: Tokyo; ap-seoul: Seoul; ap-singapore: Singapore; ap-bangkok: Bangkok; ap-hongkong: Hong Kong (China). Fusion areas are as follows. me-middle-east-fusion: Middle East; na-north-america-fusion: North America; sa-south-america-fusion: South America; ap-tokyo-fusion: Tokyo; ap-seoul-fusion: Seoul; eu-frankfurt-fusion: Frankfurt; ap-singapore-fusion: Singapore; ap-hongkong-fusion: Hong Kong (China).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getConcurrentRegions() {
        return this.ConcurrentRegions;
    }

    /**
     * Set Concurrency area. Standard areas are as follows. ap-chinese-mainland: Chinese mainland; na-north-america: North America; eu-frankfurt: Frankfurt; ap-mumbai: Mumbai; ap-tokyo: Tokyo; ap-seoul: Seoul; ap-singapore: Singapore; ap-bangkok: Bangkok; ap-hongkong: Hong Kong (China). Fusion areas are as follows. me-middle-east-fusion: Middle East; na-north-america-fusion: North America; sa-south-america-fusion: South America; ap-tokyo-fusion: Tokyo; ap-seoul-fusion: Seoul; eu-frankfurt-fusion: Frankfurt; ap-singapore-fusion: Singapore; ap-hongkong-fusion: Hong Kong (China).Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConcurrentRegions Concurrency area. Standard areas are as follows. ap-chinese-mainland: Chinese mainland; na-north-america: North America; eu-frankfurt: Frankfurt; ap-mumbai: Mumbai; ap-tokyo: Tokyo; ap-seoul: Seoul; ap-singapore: Singapore; ap-bangkok: Bangkok; ap-hongkong: Hong Kong (China). Fusion areas are as follows. me-middle-east-fusion: Middle East; na-north-america-fusion: North America; sa-south-america-fusion: South America; ap-tokyo-fusion: Tokyo; ap-seoul-fusion: Seoul; eu-frankfurt-fusion: Frankfurt; ap-singapore-fusion: Singapore; ap-hongkong-fusion: Hong Kong (China).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConcurrentRegions(String [] ConcurrentRegions) {
        this.ConcurrentRegions = ConcurrentRegions;
    }

    /**
     * Get Project category.DESKTOP: desktop (default value).MOBILE: mobile.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectCategory Project category.DESKTOP: desktop (default value).MOBILE: mobile.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectCategory() {
        return this.ProjectCategory;
    }

    /**
     * Set Project category.DESKTOP: desktop (default value).MOBILE: mobile.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectCategory Project category.DESKTOP: desktop (default value).MOBILE: mobile.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectCategory(String ProjectCategory) {
        this.ProjectCategory = ProjectCategory;
    }

    public ApplicationProject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationProject(ApplicationProject source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.IsPreload != null) {
            this.IsPreload = new Boolean(source.IsPreload);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.Using != null) {
            this.Using = new Long(source.Using);
        }
        if (source.ApplicationStatus != null) {
            this.ApplicationStatus = new String(source.ApplicationStatus);
        }
        if (source.ApplicationParams != null) {
            this.ApplicationParams = new String(source.ApplicationParams);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.ProjectType != null) {
            this.ProjectType = new String(source.ProjectType);
        }
        if (source.Purpose != null) {
            this.Purpose = new String(source.Purpose);
        }
        if (source.ApplicationRegions != null) {
            this.ApplicationRegions = new String[source.ApplicationRegions.length];
            for (int i = 0; i < source.ApplicationRegions.length; i++) {
                this.ApplicationRegions[i] = new String(source.ApplicationRegions[i]);
            }
        }
        if (source.ConcurrentRegions != null) {
            this.ConcurrentRegions = new String[source.ConcurrentRegions.length];
            for (int i = 0; i < source.ConcurrentRegions.length; i++) {
                this.ConcurrentRegions[i] = new String(source.ConcurrentRegions[i]);
            }
        }
        if (source.ProjectCategory != null) {
            this.ProjectCategory = new String(source.ProjectCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "IsPreload", this.IsPreload);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "Using", this.Using);
        this.setParamSimple(map, prefix + "ApplicationStatus", this.ApplicationStatus);
        this.setParamSimple(map, prefix + "ApplicationParams", this.ApplicationParams);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "ProjectType", this.ProjectType);
        this.setParamSimple(map, prefix + "Purpose", this.Purpose);
        this.setParamArraySimple(map, prefix + "ApplicationRegions.", this.ApplicationRegions);
        this.setParamArraySimple(map, prefix + "ConcurrentRegions.", this.ConcurrentRegions);
        this.setParamSimple(map, prefix + "ProjectCategory", this.ProjectCategory);

    }
}

