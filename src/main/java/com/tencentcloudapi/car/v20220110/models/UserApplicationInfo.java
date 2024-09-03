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

public class UserApplicationInfo extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application name.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Application type (cloud 3D: Application3D; cloud XR: ApplicationXR; cloud Web: ApplicationWeb).
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * Application program execution path.
    */
    @SerializedName("ApplicationExePath")
    @Expose
    private String ApplicationExePath;

    /**
    * Application process list.
    */
    @SerializedName("ApplicationInterList")
    @Expose
    private String ApplicationInterList;

    /**
    * Application startup parameters.
    */
    @SerializedName("ApplicationParams")
    @Expose
    private String ApplicationParams;

    /**
    * Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured).
    */
    @SerializedName("ApplicationRunStatus")
    @Expose
    private String ApplicationRunStatus;

    /**
    * Application update status (ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none).
    */
    @SerializedName("ApplicationUpdateStatus")
    @Expose
    private String ApplicationUpdateStatus;

    /**
    * Application creation time.
    */
    @SerializedName("ApplicationCreateTime")
    @Expose
    private String ApplicationCreateTime;

    /**
    * List of application versions.
    */
    @SerializedName("ApplicationVersions")
    @Expose
    private UserApplicationVersion [] ApplicationVersions;

    /**
    * Application basic data.
    */
    @SerializedName("ApplicationBaseInfo")
    @Expose
    private ApplicationBaseInfo ApplicationBaseInfo;

    /**
    * Application update progress.
    */
    @SerializedName("ApplicationUpdateProgress")
    @Expose
    private Long ApplicationUpdateProgress;

    /**
    * Application nature (PUBLIC: public application; PRIVATE: user application).
    */
    @SerializedName("ApplicationNature")
    @Expose
    private String ApplicationNature;

    /**
    * Application repository list.
    */
    @SerializedName("ApplicationStores")
    @Expose
    private UserApplicationStore [] ApplicationStores;

    /**
     * Get Application ID. 
     * @return ApplicationId Application ID.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID.
     * @param ApplicationId Application ID.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application name. 
     * @return ApplicationName Application name.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name.
     * @param ApplicationName Application name.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Application type (cloud 3D: Application3D; cloud XR: ApplicationXR; cloud Web: ApplicationWeb). 
     * @return ApplicationType Application type (cloud 3D: Application3D; cloud XR: ApplicationXR; cloud Web: ApplicationWeb).
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type (cloud 3D: Application3D; cloud XR: ApplicationXR; cloud Web: ApplicationWeb).
     * @param ApplicationType Application type (cloud 3D: Application3D; cloud XR: ApplicationXR; cloud Web: ApplicationWeb).
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get Application program execution path. 
     * @return ApplicationExePath Application program execution path.
     */
    public String getApplicationExePath() {
        return this.ApplicationExePath;
    }

    /**
     * Set Application program execution path.
     * @param ApplicationExePath Application program execution path.
     */
    public void setApplicationExePath(String ApplicationExePath) {
        this.ApplicationExePath = ApplicationExePath;
    }

    /**
     * Get Application process list. 
     * @return ApplicationInterList Application process list.
     */
    public String getApplicationInterList() {
        return this.ApplicationInterList;
    }

    /**
     * Set Application process list.
     * @param ApplicationInterList Application process list.
     */
    public void setApplicationInterList(String ApplicationInterList) {
        this.ApplicationInterList = ApplicationInterList;
    }

    /**
     * Get Application startup parameters. 
     * @return ApplicationParams Application startup parameters.
     */
    public String getApplicationParams() {
        return this.ApplicationParams;
    }

    /**
     * Set Application startup parameters.
     * @param ApplicationParams Application startup parameters.
     */
    public void setApplicationParams(String ApplicationParams) {
        this.ApplicationParams = ApplicationParams;
    }

    /**
     * Get Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured). 
     * @return ApplicationRunStatus Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured).
     */
    public String getApplicationRunStatus() {
        return this.ApplicationRunStatus;
    }

    /**
     * Set Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured).
     * @param ApplicationRunStatus Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured).
     */
    public void setApplicationRunStatus(String ApplicationRunStatus) {
        this.ApplicationRunStatus = ApplicationRunStatus;
    }

    /**
     * Get Application update status (ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none). 
     * @return ApplicationUpdateStatus Application update status (ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none).
     */
    public String getApplicationUpdateStatus() {
        return this.ApplicationUpdateStatus;
    }

    /**
     * Set Application update status (ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none).
     * @param ApplicationUpdateStatus Application update status (ApplicationUpdateCreating: version creation in progress; ApplicationUpdateCreateFail: version creation failed; ApplicationUpdateNoReleased: version to be released; ApplicationUpdateReleased: version release completed; ApplicationUpdateNormal: none).
     */
    public void setApplicationUpdateStatus(String ApplicationUpdateStatus) {
        this.ApplicationUpdateStatus = ApplicationUpdateStatus;
    }

    /**
     * Get Application creation time. 
     * @return ApplicationCreateTime Application creation time.
     */
    public String getApplicationCreateTime() {
        return this.ApplicationCreateTime;
    }

    /**
     * Set Application creation time.
     * @param ApplicationCreateTime Application creation time.
     */
    public void setApplicationCreateTime(String ApplicationCreateTime) {
        this.ApplicationCreateTime = ApplicationCreateTime;
    }

    /**
     * Get List of application versions. 
     * @return ApplicationVersions List of application versions.
     */
    public UserApplicationVersion [] getApplicationVersions() {
        return this.ApplicationVersions;
    }

    /**
     * Set List of application versions.
     * @param ApplicationVersions List of application versions.
     */
    public void setApplicationVersions(UserApplicationVersion [] ApplicationVersions) {
        this.ApplicationVersions = ApplicationVersions;
    }

    /**
     * Get Application basic data. 
     * @return ApplicationBaseInfo Application basic data.
     */
    public ApplicationBaseInfo getApplicationBaseInfo() {
        return this.ApplicationBaseInfo;
    }

    /**
     * Set Application basic data.
     * @param ApplicationBaseInfo Application basic data.
     */
    public void setApplicationBaseInfo(ApplicationBaseInfo ApplicationBaseInfo) {
        this.ApplicationBaseInfo = ApplicationBaseInfo;
    }

    /**
     * Get Application update progress. 
     * @return ApplicationUpdateProgress Application update progress.
     */
    public Long getApplicationUpdateProgress() {
        return this.ApplicationUpdateProgress;
    }

    /**
     * Set Application update progress.
     * @param ApplicationUpdateProgress Application update progress.
     */
    public void setApplicationUpdateProgress(Long ApplicationUpdateProgress) {
        this.ApplicationUpdateProgress = ApplicationUpdateProgress;
    }

    /**
     * Get Application nature (PUBLIC: public application; PRIVATE: user application). 
     * @return ApplicationNature Application nature (PUBLIC: public application; PRIVATE: user application).
     */
    public String getApplicationNature() {
        return this.ApplicationNature;
    }

    /**
     * Set Application nature (PUBLIC: public application; PRIVATE: user application).
     * @param ApplicationNature Application nature (PUBLIC: public application; PRIVATE: user application).
     */
    public void setApplicationNature(String ApplicationNature) {
        this.ApplicationNature = ApplicationNature;
    }

    /**
     * Get Application repository list. 
     * @return ApplicationStores Application repository list.
     */
    public UserApplicationStore [] getApplicationStores() {
        return this.ApplicationStores;
    }

    /**
     * Set Application repository list.
     * @param ApplicationStores Application repository list.
     */
    public void setApplicationStores(UserApplicationStore [] ApplicationStores) {
        this.ApplicationStores = ApplicationStores;
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

    }
}

