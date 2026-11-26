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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationProject extends AbstractModel {

    /**
    * <p>Project ID.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>Project name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Project description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Concurrency type required for project operation.<br>S1: Small-scale cloud application rendering concurrency<br>M1: Medium cloud application rendering concurrency<br>L1: Large cloud application rendering concurrency<br>L2: Large cloud application rendering concurrency<br>XL2: Ultra-large cloud application rendering concurrency<br>MM1_HD: Performance Cloud ARM concurrency - high-definition<br>MM1_FHD: Performance Cloud ARM concurrency - ultra-high-definition</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Cloud Application ID</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>Pre-launch</p>
    */
    @SerializedName("IsPreload")
    @Expose
    private Boolean IsPreload;

    /**
    * <p>Configured concurrency</p>
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * <p>Number of concurrencies in use</p>
    */
    @SerializedName("Using")
    @Expose
    private Long Using;

    /**
    * <p>Application status: NoConcurrent - no concurrency package configured, Online - launched, other statuses are cloud application status: applicationCreating - creating, applicationCreateFail - creation failed, applicationDeleting - deleting, applicationNoConfigured - startup parameter not configured</p>
    */
    @SerializedName("ApplicationStatus")
    @Expose
    private String ApplicationStatus;

    /**
    * <p>Application startup parameter</p>
    */
    @SerializedName("ApplicationParams")
    @Expose
    private String ApplicationParams;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Application name</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>Resolution, format as "width x height", for example 1920x1080</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>Project type.<br>SHARED: Shared by all applications<br>EXCLUSIVE (default value): Dedicated for one application</p>
    */
    @SerializedName("ProjectType")
    @Expose
    private String ProjectType;

    /**
    * <p>Purpose.<br>EXPERIENCE: Experience</p>
    */
    @SerializedName("Purpose")
    @Expose
    private String Purpose;

    /**
    * <p>Application distribution area (Standard zone: ap-chinese-mainland: Chinese mainland, na-north-america: North America, eu-frankfurt: Frankfurt, ap-mumbai: Mumbai, ap-tokyo: Tokyo, ap-seoul: Seoul, ap-singapore: Singapore, ap-bangkok: Bangkok, ap-hongkong: Hong Kong (China). Fusion region: me-middle-east-fusion: Middle East, na-north-america-fusion: North America, sa-south-america-fusion: South America, ap-tokyo-fusion: Tokyo, ap-seoul-fusion: Seoul, eu-frankfurt-fusion: Frankfurt, ap-singapore-fusion: Singapore, ap-hongkong-fusion: Hong Kong (China))</p>
    */
    @SerializedName("ApplicationRegions")
    @Expose
    private String [] ApplicationRegions;

    /**
    * <p>Concurrent region (Standard zone: ap-chinese-mainland: Chinese mainland, na-north-america: North America, eu-frankfurt: Frankfurt, ap-mumbai: Mumbai, ap-tokyo: Tokyo, ap-seoul: Seoul, ap-singapore: Singapore, ap-bangkok: Bangkok, ap-hongkong: Hong Kong (China), Fusion region: me-middle-east-fusion: Middle East, na-north-america-fusion: North America, sa-south-america-fusion: South America, ap-tokyo-fusion: Tokyo, ap-seoul-fusion: Seoul, eu-frankfurt-fusion: Frankfurt, ap-singapore-fusion: Singapore, ap-hongkong-fusion: Hong Kong (China))</p>
    */
    @SerializedName("ConcurrentRegions")
    @Expose
    private String [] ConcurrentRegions;

    /**
    * <p>Project category.<br>DESKTOP: On PC, default value<br>MOBILE: Mobile terminal</p>
    */
    @SerializedName("ProjectCategory")
    @Expose
    private String ProjectCategory;

    /**
     * Get <p>Project ID.</p> 
     * @return ProjectId <p>Project ID.</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID.</p>
     * @param ProjectId <p>Project ID.</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Project name.</p> 
     * @return Name <p>Project name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Project name.</p>
     * @param Name <p>Project name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Project description.</p> 
     * @return Description <p>Project description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Project description.</p>
     * @param Description <p>Project description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Concurrency type required for project operation.<br>S1: Small-scale cloud application rendering concurrency<br>M1: Medium cloud application rendering concurrency<br>L1: Large cloud application rendering concurrency<br>L2: Large cloud application rendering concurrency<br>XL2: Ultra-large cloud application rendering concurrency<br>MM1_HD: Performance Cloud ARM concurrency - high-definition<br>MM1_FHD: Performance Cloud ARM concurrency - ultra-high-definition</p> 
     * @return Type <p>Concurrency type required for project operation.<br>S1: Small-scale cloud application rendering concurrency<br>M1: Medium cloud application rendering concurrency<br>L1: Large cloud application rendering concurrency<br>L2: Large cloud application rendering concurrency<br>XL2: Ultra-large cloud application rendering concurrency<br>MM1_HD: Performance Cloud ARM concurrency - high-definition<br>MM1_FHD: Performance Cloud ARM concurrency - ultra-high-definition</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Concurrency type required for project operation.<br>S1: Small-scale cloud application rendering concurrency<br>M1: Medium cloud application rendering concurrency<br>L1: Large cloud application rendering concurrency<br>L2: Large cloud application rendering concurrency<br>XL2: Ultra-large cloud application rendering concurrency<br>MM1_HD: Performance Cloud ARM concurrency - high-definition<br>MM1_FHD: Performance Cloud ARM concurrency - ultra-high-definition</p>
     * @param Type <p>Concurrency type required for project operation.<br>S1: Small-scale cloud application rendering concurrency<br>M1: Medium cloud application rendering concurrency<br>L1: Large cloud application rendering concurrency<br>L2: Large cloud application rendering concurrency<br>XL2: Ultra-large cloud application rendering concurrency<br>MM1_HD: Performance Cloud ARM concurrency - high-definition<br>MM1_FHD: Performance Cloud ARM concurrency - ultra-high-definition</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Cloud Application ID</p> 
     * @return ApplicationId <p>Cloud Application ID</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>Cloud Application ID</p>
     * @param ApplicationId <p>Cloud Application ID</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>Pre-launch</p> 
     * @return IsPreload <p>Pre-launch</p>
     */
    public Boolean getIsPreload() {
        return this.IsPreload;
    }

    /**
     * Set <p>Pre-launch</p>
     * @param IsPreload <p>Pre-launch</p>
     */
    public void setIsPreload(Boolean IsPreload) {
        this.IsPreload = IsPreload;
    }

    /**
     * Get <p>Configured concurrency</p> 
     * @return Amount <p>Configured concurrency</p>
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set <p>Configured concurrency</p>
     * @param Amount <p>Configured concurrency</p>
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get <p>Number of concurrencies in use</p> 
     * @return Using <p>Number of concurrencies in use</p>
     */
    public Long getUsing() {
        return this.Using;
    }

    /**
     * Set <p>Number of concurrencies in use</p>
     * @param Using <p>Number of concurrencies in use</p>
     */
    public void setUsing(Long Using) {
        this.Using = Using;
    }

    /**
     * Get <p>Application status: NoConcurrent - no concurrency package configured, Online - launched, other statuses are cloud application status: applicationCreating - creating, applicationCreateFail - creation failed, applicationDeleting - deleting, applicationNoConfigured - startup parameter not configured</p> 
     * @return ApplicationStatus <p>Application status: NoConcurrent - no concurrency package configured, Online - launched, other statuses are cloud application status: applicationCreating - creating, applicationCreateFail - creation failed, applicationDeleting - deleting, applicationNoConfigured - startup parameter not configured</p>
     */
    public String getApplicationStatus() {
        return this.ApplicationStatus;
    }

    /**
     * Set <p>Application status: NoConcurrent - no concurrency package configured, Online - launched, other statuses are cloud application status: applicationCreating - creating, applicationCreateFail - creation failed, applicationDeleting - deleting, applicationNoConfigured - startup parameter not configured</p>
     * @param ApplicationStatus <p>Application status: NoConcurrent - no concurrency package configured, Online - launched, other statuses are cloud application status: applicationCreating - creating, applicationCreateFail - creation failed, applicationDeleting - deleting, applicationNoConfigured - startup parameter not configured</p>
     */
    public void setApplicationStatus(String ApplicationStatus) {
        this.ApplicationStatus = ApplicationStatus;
    }

    /**
     * Get <p>Application startup parameter</p> 
     * @return ApplicationParams <p>Application startup parameter</p>
     */
    public String getApplicationParams() {
        return this.ApplicationParams;
    }

    /**
     * Set <p>Application startup parameter</p>
     * @param ApplicationParams <p>Application startup parameter</p>
     */
    public void setApplicationParams(String ApplicationParams) {
        this.ApplicationParams = ApplicationParams;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Application name</p> 
     * @return ApplicationName <p>Application name</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>Application name</p>
     * @param ApplicationName <p>Application name</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>Resolution, format as "width x height", for example 1920x1080</p> 
     * @return Resolution <p>Resolution, format as "width x height", for example 1920x1080</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>Resolution, format as "width x height", for example 1920x1080</p>
     * @param Resolution <p>Resolution, format as "width x height", for example 1920x1080</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>Project type.<br>SHARED: Shared by all applications<br>EXCLUSIVE (default value): Dedicated for one application</p> 
     * @return ProjectType <p>Project type.<br>SHARED: Shared by all applications<br>EXCLUSIVE (default value): Dedicated for one application</p>
     */
    public String getProjectType() {
        return this.ProjectType;
    }

    /**
     * Set <p>Project type.<br>SHARED: Shared by all applications<br>EXCLUSIVE (default value): Dedicated for one application</p>
     * @param ProjectType <p>Project type.<br>SHARED: Shared by all applications<br>EXCLUSIVE (default value): Dedicated for one application</p>
     */
    public void setProjectType(String ProjectType) {
        this.ProjectType = ProjectType;
    }

    /**
     * Get <p>Purpose.<br>EXPERIENCE: Experience</p> 
     * @return Purpose <p>Purpose.<br>EXPERIENCE: Experience</p>
     */
    public String getPurpose() {
        return this.Purpose;
    }

    /**
     * Set <p>Purpose.<br>EXPERIENCE: Experience</p>
     * @param Purpose <p>Purpose.<br>EXPERIENCE: Experience</p>
     */
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    /**
     * Get <p>Application distribution area (Standard zone: ap-chinese-mainland: Chinese mainland, na-north-america: North America, eu-frankfurt: Frankfurt, ap-mumbai: Mumbai, ap-tokyo: Tokyo, ap-seoul: Seoul, ap-singapore: Singapore, ap-bangkok: Bangkok, ap-hongkong: Hong Kong (China). Fusion region: me-middle-east-fusion: Middle East, na-north-america-fusion: North America, sa-south-america-fusion: South America, ap-tokyo-fusion: Tokyo, ap-seoul-fusion: Seoul, eu-frankfurt-fusion: Frankfurt, ap-singapore-fusion: Singapore, ap-hongkong-fusion: Hong Kong (China))</p> 
     * @return ApplicationRegions <p>Application distribution area (Standard zone: ap-chinese-mainland: Chinese mainland, na-north-america: North America, eu-frankfurt: Frankfurt, ap-mumbai: Mumbai, ap-tokyo: Tokyo, ap-seoul: Seoul, ap-singapore: Singapore, ap-bangkok: Bangkok, ap-hongkong: Hong Kong (China). Fusion region: me-middle-east-fusion: Middle East, na-north-america-fusion: North America, sa-south-america-fusion: South America, ap-tokyo-fusion: Tokyo, ap-seoul-fusion: Seoul, eu-frankfurt-fusion: Frankfurt, ap-singapore-fusion: Singapore, ap-hongkong-fusion: Hong Kong (China))</p>
     */
    public String [] getApplicationRegions() {
        return this.ApplicationRegions;
    }

    /**
     * Set <p>Application distribution area (Standard zone: ap-chinese-mainland: Chinese mainland, na-north-america: North America, eu-frankfurt: Frankfurt, ap-mumbai: Mumbai, ap-tokyo: Tokyo, ap-seoul: Seoul, ap-singapore: Singapore, ap-bangkok: Bangkok, ap-hongkong: Hong Kong (China). Fusion region: me-middle-east-fusion: Middle East, na-north-america-fusion: North America, sa-south-america-fusion: South America, ap-tokyo-fusion: Tokyo, ap-seoul-fusion: Seoul, eu-frankfurt-fusion: Frankfurt, ap-singapore-fusion: Singapore, ap-hongkong-fusion: Hong Kong (China))</p>
     * @param ApplicationRegions <p>Application distribution area (Standard zone: ap-chinese-mainland: Chinese mainland, na-north-america: North America, eu-frankfurt: Frankfurt, ap-mumbai: Mumbai, ap-tokyo: Tokyo, ap-seoul: Seoul, ap-singapore: Singapore, ap-bangkok: Bangkok, ap-hongkong: Hong Kong (China). Fusion region: me-middle-east-fusion: Middle East, na-north-america-fusion: North America, sa-south-america-fusion: South America, ap-tokyo-fusion: Tokyo, ap-seoul-fusion: Seoul, eu-frankfurt-fusion: Frankfurt, ap-singapore-fusion: Singapore, ap-hongkong-fusion: Hong Kong (China))</p>
     */
    public void setApplicationRegions(String [] ApplicationRegions) {
        this.ApplicationRegions = ApplicationRegions;
    }

    /**
     * Get <p>Concurrent region (Standard zone: ap-chinese-mainland: Chinese mainland, na-north-america: North America, eu-frankfurt: Frankfurt, ap-mumbai: Mumbai, ap-tokyo: Tokyo, ap-seoul: Seoul, ap-singapore: Singapore, ap-bangkok: Bangkok, ap-hongkong: Hong Kong (China), Fusion region: me-middle-east-fusion: Middle East, na-north-america-fusion: North America, sa-south-america-fusion: South America, ap-tokyo-fusion: Tokyo, ap-seoul-fusion: Seoul, eu-frankfurt-fusion: Frankfurt, ap-singapore-fusion: Singapore, ap-hongkong-fusion: Hong Kong (China))</p> 
     * @return ConcurrentRegions <p>Concurrent region (Standard zone: ap-chinese-mainland: Chinese mainland, na-north-america: North America, eu-frankfurt: Frankfurt, ap-mumbai: Mumbai, ap-tokyo: Tokyo, ap-seoul: Seoul, ap-singapore: Singapore, ap-bangkok: Bangkok, ap-hongkong: Hong Kong (China), Fusion region: me-middle-east-fusion: Middle East, na-north-america-fusion: North America, sa-south-america-fusion: South America, ap-tokyo-fusion: Tokyo, ap-seoul-fusion: Seoul, eu-frankfurt-fusion: Frankfurt, ap-singapore-fusion: Singapore, ap-hongkong-fusion: Hong Kong (China))</p>
     */
    public String [] getConcurrentRegions() {
        return this.ConcurrentRegions;
    }

    /**
     * Set <p>Concurrent region (Standard zone: ap-chinese-mainland: Chinese mainland, na-north-america: North America, eu-frankfurt: Frankfurt, ap-mumbai: Mumbai, ap-tokyo: Tokyo, ap-seoul: Seoul, ap-singapore: Singapore, ap-bangkok: Bangkok, ap-hongkong: Hong Kong (China), Fusion region: me-middle-east-fusion: Middle East, na-north-america-fusion: North America, sa-south-america-fusion: South America, ap-tokyo-fusion: Tokyo, ap-seoul-fusion: Seoul, eu-frankfurt-fusion: Frankfurt, ap-singapore-fusion: Singapore, ap-hongkong-fusion: Hong Kong (China))</p>
     * @param ConcurrentRegions <p>Concurrent region (Standard zone: ap-chinese-mainland: Chinese mainland, na-north-america: North America, eu-frankfurt: Frankfurt, ap-mumbai: Mumbai, ap-tokyo: Tokyo, ap-seoul: Seoul, ap-singapore: Singapore, ap-bangkok: Bangkok, ap-hongkong: Hong Kong (China), Fusion region: me-middle-east-fusion: Middle East, na-north-america-fusion: North America, sa-south-america-fusion: South America, ap-tokyo-fusion: Tokyo, ap-seoul-fusion: Seoul, eu-frankfurt-fusion: Frankfurt, ap-singapore-fusion: Singapore, ap-hongkong-fusion: Hong Kong (China))</p>
     */
    public void setConcurrentRegions(String [] ConcurrentRegions) {
        this.ConcurrentRegions = ConcurrentRegions;
    }

    /**
     * Get <p>Project category.<br>DESKTOP: On PC, default value<br>MOBILE: Mobile terminal</p> 
     * @return ProjectCategory <p>Project category.<br>DESKTOP: On PC, default value<br>MOBILE: Mobile terminal</p>
     */
    public String getProjectCategory() {
        return this.ProjectCategory;
    }

    /**
     * Set <p>Project category.<br>DESKTOP: On PC, default value<br>MOBILE: Mobile terminal</p>
     * @param ProjectCategory <p>Project category.<br>DESKTOP: On PC, default value<br>MOBILE: Mobile terminal</p>
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

