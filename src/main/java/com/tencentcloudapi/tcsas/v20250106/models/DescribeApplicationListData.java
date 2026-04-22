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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationListData extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * App Id.
    */
    @SerializedName("AppIdentityId")
    @Expose
    private Long AppIdentityId;

    /**
    * Name
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Icon
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Android app package name
    */
    @SerializedName("AndroidAppKey")
    @Expose
    private String AndroidAppKey;

    /**
    * iOS App bundleId
    */
    @SerializedName("IosAppKey")
    @Expose
    private String IosAppKey;

    /**
    * Creator
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Specifies the updater.
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Introduction
    */
    @SerializedName("Intro")
    @Expose
    private String Intro;

    /**
    * Team Id.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Team name
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Number of sensitive apis.
    */
    @SerializedName("SensitiveApiCount")
    @Expose
    private Long SensitiveApiCount;

    /**
    * Application type. 1: Test; 2: Formal
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get App Id. 
     * @return AppIdentityId App Id.
     */
    public Long getAppIdentityId() {
        return this.AppIdentityId;
    }

    /**
     * Set App Id.
     * @param AppIdentityId App Id.
     */
    public void setAppIdentityId(Long AppIdentityId) {
        this.AppIdentityId = AppIdentityId;
    }

    /**
     * Get Name 
     * @return ApplicationName Name
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Name
     * @param ApplicationName Name
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Icon 
     * @return Logo Icon
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set Icon
     * @param Logo Icon
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Android app package name 
     * @return AndroidAppKey Android app package name
     */
    public String getAndroidAppKey() {
        return this.AndroidAppKey;
    }

    /**
     * Set Android app package name
     * @param AndroidAppKey Android app package name
     */
    public void setAndroidAppKey(String AndroidAppKey) {
        this.AndroidAppKey = AndroidAppKey;
    }

    /**
     * Get iOS App bundleId 
     * @return IosAppKey iOS App bundleId
     */
    public String getIosAppKey() {
        return this.IosAppKey;
    }

    /**
     * Set iOS App bundleId
     * @param IosAppKey iOS App bundleId
     */
    public void setIosAppKey(String IosAppKey) {
        this.IosAppKey = IosAppKey;
    }

    /**
     * Get Creator 
     * @return CreateUser Creator
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator
     * @param CreateUser Creator
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Specifies the updater. 
     * @return UpdateUser Specifies the updater.
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Specifies the updater.
     * @param UpdateUser Specifies the updater.
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Introduction 
     * @return Intro Introduction
     */
    public String getIntro() {
        return this.Intro;
    }

    /**
     * Set Introduction
     * @param Intro Introduction
     */
    public void setIntro(String Intro) {
        this.Intro = Intro;
    }

    /**
     * Get Team Id. 
     * @return TeamId Team Id.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team Id.
     * @param TeamId Team Id.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Team name 
     * @return TeamName Team name
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set Team name
     * @param TeamName Team name
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get Number of sensitive apis. 
     * @return SensitiveApiCount Number of sensitive apis.
     */
    public Long getSensitiveApiCount() {
        return this.SensitiveApiCount;
    }

    /**
     * Set Number of sensitive apis.
     * @param SensitiveApiCount Number of sensitive apis.
     */
    public void setSensitiveApiCount(Long SensitiveApiCount) {
        this.SensitiveApiCount = SensitiveApiCount;
    }

    /**
     * Get Application type. 1: Test; 2: Formal 
     * @return ApplicationType Application type. 1: Test; 2: Formal
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type. 1: Test; 2: Formal
     * @param ApplicationType Application type. 1: Test; 2: Formal
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    public DescribeApplicationListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationListData(DescribeApplicationListData source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.AppIdentityId != null) {
            this.AppIdentityId = new Long(source.AppIdentityId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AndroidAppKey != null) {
            this.AndroidAppKey = new String(source.AndroidAppKey);
        }
        if (source.IosAppKey != null) {
            this.IosAppKey = new String(source.IosAppKey);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Intro != null) {
            this.Intro = new String(source.Intro);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.SensitiveApiCount != null) {
            this.SensitiveApiCount = new Long(source.SensitiveApiCount);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new Long(source.ApplicationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "AppIdentityId", this.AppIdentityId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AndroidAppKey", this.AndroidAppKey);
        this.setParamSimple(map, prefix + "IosAppKey", this.IosAppKey);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Intro", this.Intro);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "SensitiveApiCount", this.SensitiveApiCount);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);

    }
}

