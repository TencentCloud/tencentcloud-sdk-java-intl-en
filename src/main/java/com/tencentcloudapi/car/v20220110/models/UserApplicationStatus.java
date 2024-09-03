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

public class UserApplicationStatus extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured; ApplicationNoPackage: no available package).
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
    * Application update progress.
    */
    @SerializedName("ApplicationUpdateProgress")
    @Expose
    private Long ApplicationUpdateProgress;

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
     * Get Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured; ApplicationNoPackage: no available package). 
     * @return ApplicationRunStatus Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured; ApplicationNoPackage: no available package).
     */
    public String getApplicationRunStatus() {
        return this.ApplicationRunStatus;
    }

    /**
     * Set Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured; ApplicationNoPackage: no available package).
     * @param ApplicationRunStatus Application running status (ApplicationDeleting: application deletion in progress; ApplicationCreateFail: application creation failed; ApplicationCreating: application creation in progress; ApplicationRunning: normal running; ApplicationNoConfigured: main execution program path not configured; ApplicationNoPackage: no available package).
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

    public UserApplicationStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserApplicationStatus(UserApplicationStatus source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationRunStatus != null) {
            this.ApplicationRunStatus = new String(source.ApplicationRunStatus);
        }
        if (source.ApplicationUpdateStatus != null) {
            this.ApplicationUpdateStatus = new String(source.ApplicationUpdateStatus);
        }
        if (source.ApplicationUpdateProgress != null) {
            this.ApplicationUpdateProgress = new Long(source.ApplicationUpdateProgress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationRunStatus", this.ApplicationRunStatus);
        this.setParamSimple(map, prefix + "ApplicationUpdateStatus", this.ApplicationUpdateStatus);
        this.setParamSimple(map, prefix + "ApplicationUpdateProgress", this.ApplicationUpdateProgress);

    }
}

