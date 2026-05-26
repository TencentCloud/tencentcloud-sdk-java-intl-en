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

public class DescribeApplicationResp extends AbstractModel {

    /**
    * Superapp ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Product ID.
    */
    @SerializedName("AppIdentityId")
    @Expose
    private Long AppIdentityId;

    /**
    * Superapp name.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Superapp icon.
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Android superapp package name.
    */
    @SerializedName("AndroidAppKey")
    @Expose
    private String AndroidAppKey;

    /**
    * iOS superapp bundle ID.
    */
    @SerializedName("IosAppKey")
    @Expose
    private String IosAppKey;

    /**
    * Creator.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modifier.
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * Last modified time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Superapp introduction.
    */
    @SerializedName("Intro")
    @Expose
    private String Intro;

    /**
    * Team ID.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Team name.
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Number of sensitive APIs.
    */
    @SerializedName("SensitiveApiCount")
    @Expose
    private Long SensitiveApiCount;

    /**
    * Superapp type. Valid values: 1: Test; 2: Production.
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
    * Superapp scheme.
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
     * Get Superapp ID. 
     * @return ApplicationId Superapp ID.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Superapp ID.
     * @param ApplicationId Superapp ID.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Product ID. 
     * @return AppIdentityId Product ID.
     */
    public Long getAppIdentityId() {
        return this.AppIdentityId;
    }

    /**
     * Set Product ID.
     * @param AppIdentityId Product ID.
     */
    public void setAppIdentityId(Long AppIdentityId) {
        this.AppIdentityId = AppIdentityId;
    }

    /**
     * Get Superapp name. 
     * @return ApplicationName Superapp name.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Superapp name.
     * @param ApplicationName Superapp name.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Superapp icon. 
     * @return Logo Superapp icon.
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set Superapp icon.
     * @param Logo Superapp icon.
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Android superapp package name. 
     * @return AndroidAppKey Android superapp package name.
     */
    public String getAndroidAppKey() {
        return this.AndroidAppKey;
    }

    /**
     * Set Android superapp package name.
     * @param AndroidAppKey Android superapp package name.
     */
    public void setAndroidAppKey(String AndroidAppKey) {
        this.AndroidAppKey = AndroidAppKey;
    }

    /**
     * Get iOS superapp bundle ID. 
     * @return IosAppKey iOS superapp bundle ID.
     */
    public String getIosAppKey() {
        return this.IosAppKey;
    }

    /**
     * Set iOS superapp bundle ID.
     * @param IosAppKey iOS superapp bundle ID.
     */
    public void setIosAppKey(String IosAppKey) {
        this.IosAppKey = IosAppKey;
    }

    /**
     * Get Creator. 
     * @return CreateUser Creator.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator.
     * @param CreateUser Creator.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modifier. 
     * @return UpdateUser Last modifier.
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Last modifier.
     * @param UpdateUser Last modifier.
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get Last modified time. 
     * @return UpdateTime Last modified time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time.
     * @param UpdateTime Last modified time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Superapp introduction. 
     * @return Intro Superapp introduction.
     */
    public String getIntro() {
        return this.Intro;
    }

    /**
     * Set Superapp introduction.
     * @param Intro Superapp introduction.
     */
    public void setIntro(String Intro) {
        this.Intro = Intro;
    }

    /**
     * Get Team ID. 
     * @return TeamId Team ID.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID.
     * @param TeamId Team ID.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Team name. 
     * @return TeamName Team name.
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set Team name.
     * @param TeamName Team name.
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get Number of sensitive APIs. 
     * @return SensitiveApiCount Number of sensitive APIs.
     */
    public Long getSensitiveApiCount() {
        return this.SensitiveApiCount;
    }

    /**
     * Set Number of sensitive APIs.
     * @param SensitiveApiCount Number of sensitive APIs.
     */
    public void setSensitiveApiCount(Long SensitiveApiCount) {
        this.SensitiveApiCount = SensitiveApiCount;
    }

    /**
     * Get Superapp type. Valid values: 1: Test; 2: Production. 
     * @return ApplicationType Superapp type. Valid values: 1: Test; 2: Production.
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Superapp type. Valid values: 1: Test; 2: Production.
     * @param ApplicationType Superapp type. Valid values: 1: Test; 2: Production.
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get Superapp scheme. 
     * @return Scheme Superapp scheme.
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Superapp scheme.
     * @param Scheme Superapp scheme.
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    public DescribeApplicationResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationResp(DescribeApplicationResp source) {
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
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
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
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);

    }
}

