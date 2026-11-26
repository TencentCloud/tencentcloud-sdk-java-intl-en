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

public class UserMobileApplicationInfo extends AbstractModel {

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
    * <p>App type (Cloud APK: ApplicationAPK)</p>
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * <p>Application running status (ApplicationRunning: normal running; ApplicationNoPackage: no available package)</p>
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
    * <p>Application nature (PUBLIC: public application; PRIVATE: user application)</p>
    */
    @SerializedName("ApplicationNature")
    @Expose
    private String ApplicationNature;

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
     * Get <p>App type (Cloud APK: ApplicationAPK)</p> 
     * @return ApplicationType <p>App type (Cloud APK: ApplicationAPK)</p>
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set <p>App type (Cloud APK: ApplicationAPK)</p>
     * @param ApplicationType <p>App type (Cloud APK: ApplicationAPK)</p>
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get <p>Application running status (ApplicationRunning: normal running; ApplicationNoPackage: no available package)</p> 
     * @return ApplicationRunStatus <p>Application running status (ApplicationRunning: normal running; ApplicationNoPackage: no available package)</p>
     */
    public String getApplicationRunStatus() {
        return this.ApplicationRunStatus;
    }

    /**
     * Set <p>Application running status (ApplicationRunning: normal running; ApplicationNoPackage: no available package)</p>
     * @param ApplicationRunStatus <p>Application running status (ApplicationRunning: normal running; ApplicationNoPackage: no available package)</p>
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

    public UserMobileApplicationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserMobileApplicationInfo(UserMobileApplicationInfo source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
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
        if (source.ApplicationNature != null) {
            this.ApplicationNature = new String(source.ApplicationNature);
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
        this.setParamSimple(map, prefix + "ApplicationRunStatus", this.ApplicationRunStatus);
        this.setParamSimple(map, prefix + "ApplicationUpdateStatus", this.ApplicationUpdateStatus);
        this.setParamSimple(map, prefix + "ApplicationCreateTime", this.ApplicationCreateTime);
        this.setParamArrayObj(map, prefix + "ApplicationVersions.", this.ApplicationVersions);
        this.setParamSimple(map, prefix + "ApplicationNature", this.ApplicationNature);
        this.setParamArrayObj(map, prefix + "ApplicationTags.", this.ApplicationTags);

    }
}

