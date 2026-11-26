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

public class UserApplicationInfo extends AbstractModel {

    /**
    * <p>Application Id</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>Application name</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>Application type (Cloud 3D: Application3D, Cloud XR: ApplicationXR, Cloud Web: ApplicationWeb)</p>
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * <p>Program execution path</p>
    */
    @SerializedName("ApplicationExePath")
    @Expose
    private String ApplicationExePath;

    /**
    * <p>Application process list</p>
    */
    @SerializedName("ApplicationInterList")
    @Expose
    private String ApplicationInterList;

    /**
    * <p>Application startup parameter</p>
    */
    @SerializedName("ApplicationParams")
    @Expose
    private String ApplicationParams;

    /**
    * <p>Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured).</p>
    */
    @SerializedName("ApplicationRunStatus")
    @Expose
    private String ApplicationRunStatus;

    /**
    * <p>Application update status (ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none)</p>
    */
    @SerializedName("ApplicationUpdateStatus")
    @Expose
    private String ApplicationUpdateStatus;

    /**
    * <p>Application creation time</p>
    */
    @SerializedName("ApplicationCreateTime")
    @Expose
    private String ApplicationCreateTime;

    /**
    * <p>Application version list</p>
    */
    @SerializedName("ApplicationVersions")
    @Expose
    private UserApplicationVersion [] ApplicationVersions;

    /**
    * <p>Application basic data</p>
    */
    @SerializedName("ApplicationBaseInfo")
    @Expose
    private ApplicationBaseInfo ApplicationBaseInfo;

    /**
    * <p>Application update progress</p>
    */
    @SerializedName("ApplicationUpdateProgress")
    @Expose
    private Long ApplicationUpdateProgress;

    /**
    * <p>Application nature (PUBLIC: public application; PRIVATE: user application)</p>
    */
    @SerializedName("ApplicationNature")
    @Expose
    private String ApplicationNature;

    /**
    * <p>Application repository list</p>
    */
    @SerializedName("ApplicationStores")
    @Expose
    private UserApplicationStore [] ApplicationStores;

    /**
    * <p>Application tag</p>
    */
    @SerializedName("ApplicationTags")
    @Expose
    private Tag [] ApplicationTags;

    /**
     * Get <p>Application Id</p> 
     * @return ApplicationId <p>Application Id</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>Application Id</p>
     * @param ApplicationId <p>Application Id</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
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
     * Get <p>Application type (Cloud 3D: Application3D, Cloud XR: ApplicationXR, Cloud Web: ApplicationWeb)</p> 
     * @return ApplicationType <p>Application type (Cloud 3D: Application3D, Cloud XR: ApplicationXR, Cloud Web: ApplicationWeb)</p>
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set <p>Application type (Cloud 3D: Application3D, Cloud XR: ApplicationXR, Cloud Web: ApplicationWeb)</p>
     * @param ApplicationType <p>Application type (Cloud 3D: Application3D, Cloud XR: ApplicationXR, Cloud Web: ApplicationWeb)</p>
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get <p>Program execution path</p> 
     * @return ApplicationExePath <p>Program execution path</p>
     */
    public String getApplicationExePath() {
        return this.ApplicationExePath;
    }

    /**
     * Set <p>Program execution path</p>
     * @param ApplicationExePath <p>Program execution path</p>
     */
    public void setApplicationExePath(String ApplicationExePath) {
        this.ApplicationExePath = ApplicationExePath;
    }

    /**
     * Get <p>Application process list</p> 
     * @return ApplicationInterList <p>Application process list</p>
     */
    public String getApplicationInterList() {
        return this.ApplicationInterList;
    }

    /**
     * Set <p>Application process list</p>
     * @param ApplicationInterList <p>Application process list</p>
     */
    public void setApplicationInterList(String ApplicationInterList) {
        this.ApplicationInterList = ApplicationInterList;
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
     * Get <p>Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured).</p> 
     * @return ApplicationRunStatus <p>Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured).</p>
     */
    public String getApplicationRunStatus() {
        return this.ApplicationRunStatus;
    }

    /**
     * Set <p>Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured).</p>
     * @param ApplicationRunStatus <p>Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured).</p>
     */
    public void setApplicationRunStatus(String ApplicationRunStatus) {
        this.ApplicationRunStatus = ApplicationRunStatus;
    }

    /**
     * Get <p>Application update status (ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none)</p> 
     * @return ApplicationUpdateStatus <p>Application update status (ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none)</p>
     */
    public String getApplicationUpdateStatus() {
        return this.ApplicationUpdateStatus;
    }

    /**
     * Set <p>Application update status (ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none)</p>
     * @param ApplicationUpdateStatus <p>Application update status (ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none)</p>
     */
    public void setApplicationUpdateStatus(String ApplicationUpdateStatus) {
        this.ApplicationUpdateStatus = ApplicationUpdateStatus;
    }

    /**
     * Get <p>Application creation time</p> 
     * @return ApplicationCreateTime <p>Application creation time</p>
     */
    public String getApplicationCreateTime() {
        return this.ApplicationCreateTime;
    }

    /**
     * Set <p>Application creation time</p>
     * @param ApplicationCreateTime <p>Application creation time</p>
     */
    public void setApplicationCreateTime(String ApplicationCreateTime) {
        this.ApplicationCreateTime = ApplicationCreateTime;
    }

    /**
     * Get <p>Application version list</p> 
     * @return ApplicationVersions <p>Application version list</p>
     */
    public UserApplicationVersion [] getApplicationVersions() {
        return this.ApplicationVersions;
    }

    /**
     * Set <p>Application version list</p>
     * @param ApplicationVersions <p>Application version list</p>
     */
    public void setApplicationVersions(UserApplicationVersion [] ApplicationVersions) {
        this.ApplicationVersions = ApplicationVersions;
    }

    /**
     * Get <p>Application basic data</p> 
     * @return ApplicationBaseInfo <p>Application basic data</p>
     */
    public ApplicationBaseInfo getApplicationBaseInfo() {
        return this.ApplicationBaseInfo;
    }

    /**
     * Set <p>Application basic data</p>
     * @param ApplicationBaseInfo <p>Application basic data</p>
     */
    public void setApplicationBaseInfo(ApplicationBaseInfo ApplicationBaseInfo) {
        this.ApplicationBaseInfo = ApplicationBaseInfo;
    }

    /**
     * Get <p>Application update progress</p> 
     * @return ApplicationUpdateProgress <p>Application update progress</p>
     */
    public Long getApplicationUpdateProgress() {
        return this.ApplicationUpdateProgress;
    }

    /**
     * Set <p>Application update progress</p>
     * @param ApplicationUpdateProgress <p>Application update progress</p>
     */
    public void setApplicationUpdateProgress(Long ApplicationUpdateProgress) {
        this.ApplicationUpdateProgress = ApplicationUpdateProgress;
    }

    /**
     * Get <p>Application nature (PUBLIC: public application; PRIVATE: user application)</p> 
     * @return ApplicationNature <p>Application nature (PUBLIC: public application; PRIVATE: user application)</p>
     */
    public String getApplicationNature() {
        return this.ApplicationNature;
    }

    /**
     * Set <p>Application nature (PUBLIC: public application; PRIVATE: user application)</p>
     * @param ApplicationNature <p>Application nature (PUBLIC: public application; PRIVATE: user application)</p>
     */
    public void setApplicationNature(String ApplicationNature) {
        this.ApplicationNature = ApplicationNature;
    }

    /**
     * Get <p>Application repository list</p> 
     * @return ApplicationStores <p>Application repository list</p>
     */
    public UserApplicationStore [] getApplicationStores() {
        return this.ApplicationStores;
    }

    /**
     * Set <p>Application repository list</p>
     * @param ApplicationStores <p>Application repository list</p>
     */
    public void setApplicationStores(UserApplicationStore [] ApplicationStores) {
        this.ApplicationStores = ApplicationStores;
    }

    /**
     * Get <p>Application tag</p> 
     * @return ApplicationTags <p>Application tag</p>
     */
    public Tag [] getApplicationTags() {
        return this.ApplicationTags;
    }

    /**
     * Set <p>Application tag</p>
     * @param ApplicationTags <p>Application tag</p>
     */
    public void setApplicationTags(Tag [] ApplicationTags) {
        this.ApplicationTags = ApplicationTags;
    }

    public UserApplicationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserApplicationInfo(UserApplicationInfo source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.ApplicationExePath != null) {
            this.ApplicationExePath = new String(source.ApplicationExePath);
        }
        if (source.ApplicationInterList != null) {
            this.ApplicationInterList = new String(source.ApplicationInterList);
        }
        if (source.ApplicationParams != null) {
            this.ApplicationParams = new String(source.ApplicationParams);
        }
        if (source.ApplicationRunStatus != null) {
            this.ApplicationRunStatus = new String(source.ApplicationRunStatus);
        }
        if (source.ApplicationUpdateStatus != null) {
            this.ApplicationUpdateStatus = new String(source.ApplicationUpdateStatus);
        }
        if (source.ApplicationCreateTime != null) {
            this.ApplicationCreateTime = new String(source.ApplicationCreateTime);
        }
        if (source.ApplicationVersions != null) {
            this.ApplicationVersions = new UserApplicationVersion[source.ApplicationVersions.length];
            for (int i = 0; i < source.ApplicationVersions.length; i++) {
                this.ApplicationVersions[i] = new UserApplicationVersion(source.ApplicationVersions[i]);
            }
        }
        if (source.ApplicationBaseInfo != null) {
            this.ApplicationBaseInfo = new ApplicationBaseInfo(source.ApplicationBaseInfo);
        }
        if (source.ApplicationUpdateProgress != null) {
            this.ApplicationUpdateProgress = new Long(source.ApplicationUpdateProgress);
        }
        if (source.ApplicationNature != null) {
            this.ApplicationNature = new String(source.ApplicationNature);
        }
        if (source.ApplicationStores != null) {
            this.ApplicationStores = new UserApplicationStore[source.ApplicationStores.length];
            for (int i = 0; i < source.ApplicationStores.length; i++) {
                this.ApplicationStores[i] = new UserApplicationStore(source.ApplicationStores[i]);
            }
        }
        if (source.ApplicationTags != null) {
            this.ApplicationTags = new Tag[source.ApplicationTags.length];
            for (int i = 0; i < source.ApplicationTags.length; i++) {
                this.ApplicationTags[i] = new Tag(source.ApplicationTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ApplicationExePath", this.ApplicationExePath);
        this.setParamSimple(map, prefix + "ApplicationInterList", this.ApplicationInterList);
        this.setParamSimple(map, prefix + "ApplicationParams", this.ApplicationParams);
        this.setParamSimple(map, prefix + "ApplicationRunStatus", this.ApplicationRunStatus);
        this.setParamSimple(map, prefix + "ApplicationUpdateStatus", this.ApplicationUpdateStatus);
        this.setParamSimple(map, prefix + "ApplicationCreateTime", this.ApplicationCreateTime);
        this.setParamArrayObj(map, prefix + "ApplicationVersions.", this.ApplicationVersions);
        this.setParamObj(map, prefix + "ApplicationBaseInfo.", this.ApplicationBaseInfo);
        this.setParamSimple(map, prefix + "ApplicationUpdateProgress", this.ApplicationUpdateProgress);
        this.setParamSimple(map, prefix + "ApplicationNature", this.ApplicationNature);
        this.setParamArrayObj(map, prefix + "ApplicationStores.", this.ApplicationStores);
        this.setParamArrayObj(map, prefix + "ApplicationTags.", this.ApplicationTags);

    }
}

