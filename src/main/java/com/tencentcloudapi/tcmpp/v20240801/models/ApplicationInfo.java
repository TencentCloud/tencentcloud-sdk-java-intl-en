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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationInfo extends AbstractModel {

    /**
    * Platform ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomerID")
    @Expose
    private String CustomerID;

    /**
    * Application ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationID")
    @Expose
    private String ApplicationID;

    /**
    * Product ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppIdentityID")
    @Expose
    private Long AppIdentityID;

    /**
    * Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * English name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationEnglishName")
    @Expose
    private String ApplicationEnglishName;

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
    * Android package name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AndroidAppKey")
    @Expose
    private String AndroidAppKey;

    /**
    * iOS bundleId
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IosAppKey")
    @Expose
    private String IosAppKey;

    /**
    * Creator
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Updater
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * Update date
Note: This field may return null, indicating that no valid values can be obtained.
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
    * iOS app download address
    */
    @SerializedName("IosAppUrl")
    @Expose
    private String IosAppUrl;

    /**
    * Android app download address
    */
    @SerializedName("AndroidAppUrl")
    @Expose
    private String AndroidAppUrl;

    /**
    * Team ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Team name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Number of privacy APIs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SensitiveApiCount")
    @Expose
    private Long SensitiveApiCount;

    /**
    * Application type 1-Test 2-Formal
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

    /**
     * Get Platform ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomerID Platform ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomerID() {
        return this.CustomerID;
    }

    /**
     * Set Platform ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomerID Platform ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     * Get Application ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationID Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationID() {
        return this.ApplicationID;
    }

    /**
     * Set Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationID Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationID(String ApplicationID) {
        this.ApplicationID = ApplicationID;
    }

    /**
     * Get Product ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppIdentityID Product ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppIdentityID() {
        return this.AppIdentityID;
    }

    /**
     * Set Product ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppIdentityID Product ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppIdentityID(Long AppIdentityID) {
        this.AppIdentityID = AppIdentityID;
    }

    /**
     * Get Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get English name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationEnglishName English name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationEnglishName() {
        return this.ApplicationEnglishName;
    }

    /**
     * Set English name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationEnglishName English name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationEnglishName(String ApplicationEnglishName) {
        this.ApplicationEnglishName = ApplicationEnglishName;
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
     * Get Android package name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AndroidAppKey Android package name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAndroidAppKey() {
        return this.AndroidAppKey;
    }

    /**
     * Set Android package name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AndroidAppKey Android package name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAndroidAppKey(String AndroidAppKey) {
        this.AndroidAppKey = AndroidAppKey;
    }

    /**
     * Get iOS bundleId
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IosAppKey iOS bundleId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIosAppKey() {
        return this.IosAppKey;
    }

    /**
     * Set iOS bundleId
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IosAppKey iOS bundleId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIosAppKey(String IosAppKey) {
        this.IosAppKey = IosAppKey;
    }

    /**
     * Get Creator
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUser Creator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUser Creator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Updater
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateUser Updater
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Updater
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateUser Updater
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get Update date
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update date
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update date
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get iOS app download address 
     * @return IosAppUrl iOS app download address
     */
    public String getIosAppUrl() {
        return this.IosAppUrl;
    }

    /**
     * Set iOS app download address
     * @param IosAppUrl iOS app download address
     */
    public void setIosAppUrl(String IosAppUrl) {
        this.IosAppUrl = IosAppUrl;
    }

    /**
     * Get Android app download address 
     * @return AndroidAppUrl Android app download address
     */
    public String getAndroidAppUrl() {
        return this.AndroidAppUrl;
    }

    /**
     * Set Android app download address
     * @param AndroidAppUrl Android app download address
     */
    public void setAndroidAppUrl(String AndroidAppUrl) {
        this.AndroidAppUrl = AndroidAppUrl;
    }

    /**
     * Get Team ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamId Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamId Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Team name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamName Team name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set Team name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamName Team name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get Number of privacy APIs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SensitiveApiCount Number of privacy APIs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSensitiveApiCount() {
        return this.SensitiveApiCount;
    }

    /**
     * Set Number of privacy APIs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SensitiveApiCount Number of privacy APIs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSensitiveApiCount(Long SensitiveApiCount) {
        this.SensitiveApiCount = SensitiveApiCount;
    }

    /**
     * Get Application type 1-Test 2-Formal
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationType Application type 1-Test 2-Formal
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type 1-Test 2-Formal
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationType Application type 1-Test 2-Formal
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    public ApplicationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationInfo(ApplicationInfo source) {
        if (source.CustomerID != null) {
            this.CustomerID = new String(source.CustomerID);
        }
        if (source.ApplicationID != null) {
            this.ApplicationID = new String(source.ApplicationID);
        }
        if (source.AppIdentityID != null) {
            this.AppIdentityID = new Long(source.AppIdentityID);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationEnglishName != null) {
            this.ApplicationEnglishName = new String(source.ApplicationEnglishName);
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
        if (source.IosAppUrl != null) {
            this.IosAppUrl = new String(source.IosAppUrl);
        }
        if (source.AndroidAppUrl != null) {
            this.AndroidAppUrl = new String(source.AndroidAppUrl);
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
        this.setParamSimple(map, prefix + "CustomerID", this.CustomerID);
        this.setParamSimple(map, prefix + "ApplicationID", this.ApplicationID);
        this.setParamSimple(map, prefix + "AppIdentityID", this.AppIdentityID);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationEnglishName", this.ApplicationEnglishName);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AndroidAppKey", this.AndroidAppKey);
        this.setParamSimple(map, prefix + "IosAppKey", this.IosAppKey);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Intro", this.Intro);
        this.setParamSimple(map, prefix + "IosAppUrl", this.IosAppUrl);
        this.setParamSimple(map, prefix + "AndroidAppUrl", this.AndroidAppUrl);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "SensitiveApiCount", this.SensitiveApiCount);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);

    }
}

