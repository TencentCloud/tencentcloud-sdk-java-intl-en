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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationDetail extends AbstractModel {

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
    * The application name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * English name of the application (this field is not used yet)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationEnglishName")
    @Expose
    private String ApplicationEnglishName;

    /**
    * Application icon
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * Remarks
Note: This field may return null, indicating that no valid values can be obtained.
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
    * The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Updated by
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
    * Number of bound mini programs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindMNPCount")
    @Expose
    private Long BindMNPCount;

    /**
    * Information of bound mini programs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindMNPList")
    @Expose
    private ApplicationMNPRelInfoResp [] BindMNPList;

    /**
    * Application description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Intro")
    @Expose
    private String Intro;

    /**
    * Android App download address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AndroidAppUrl")
    @Expose
    private String AndroidAppUrl;

    /**
    * iOS App download address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IosAppUrl")
    @Expose
    private String IosAppUrl;

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
    * Quantity of sensitive APIs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SensitiveApiCount")
    @Expose
    private Long SensitiveApiCount;

    /**
    * Application type. 1: Test; 2: Formal
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationType")
    @Expose
    private Long ApplicationType;

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
     * Get The application name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName The application name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set The application name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName The application name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get English name of the application (this field is not used yet)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationEnglishName English name of the application (this field is not used yet)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationEnglishName() {
        return this.ApplicationEnglishName;
    }

    /**
     * Set English name of the application (this field is not used yet)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationEnglishName English name of the application (this field is not used yet)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationEnglishName(String ApplicationEnglishName) {
        this.ApplicationEnglishName = ApplicationEnglishName;
    }

    /**
     * Get Application icon
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Logo Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Logo Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get Remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get The creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Updated by
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateUser Updated by
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Updated by
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateUser Updated by
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
     * Get Number of bound mini programs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BindMNPCount Number of bound mini programs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBindMNPCount() {
        return this.BindMNPCount;
    }

    /**
     * Set Number of bound mini programs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BindMNPCount Number of bound mini programs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBindMNPCount(Long BindMNPCount) {
        this.BindMNPCount = BindMNPCount;
    }

    /**
     * Get Information of bound mini programs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BindMNPList Information of bound mini programs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApplicationMNPRelInfoResp [] getBindMNPList() {
        return this.BindMNPList;
    }

    /**
     * Set Information of bound mini programs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BindMNPList Information of bound mini programs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBindMNPList(ApplicationMNPRelInfoResp [] BindMNPList) {
        this.BindMNPList = BindMNPList;
    }

    /**
     * Get Application description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Intro Application description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIntro() {
        return this.Intro;
    }

    /**
     * Set Application description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Intro Application description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntro(String Intro) {
        this.Intro = Intro;
    }

    /**
     * Get Android App download address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AndroidAppUrl Android App download address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAndroidAppUrl() {
        return this.AndroidAppUrl;
    }

    /**
     * Set Android App download address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AndroidAppUrl Android App download address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAndroidAppUrl(String AndroidAppUrl) {
        this.AndroidAppUrl = AndroidAppUrl;
    }

    /**
     * Get iOS App download address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IosAppUrl iOS App download address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIosAppUrl() {
        return this.IosAppUrl;
    }

    /**
     * Set iOS App download address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IosAppUrl iOS App download address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIosAppUrl(String IosAppUrl) {
        this.IosAppUrl = IosAppUrl;
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
     * Get Quantity of sensitive APIs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SensitiveApiCount Quantity of sensitive APIs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSensitiveApiCount() {
        return this.SensitiveApiCount;
    }

    /**
     * Set Quantity of sensitive APIs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SensitiveApiCount Quantity of sensitive APIs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSensitiveApiCount(Long SensitiveApiCount) {
        this.SensitiveApiCount = SensitiveApiCount;
    }

    /**
     * Get Application type. 1: Test; 2: Formal
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationType Application type. 1: Test; 2: Formal
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type. 1: Test; 2: Formal
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationType Application type. 1: Test; 2: Formal
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationType(Long ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    public ApplicationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationDetail(ApplicationDetail source) {
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
        if (source.BindMNPCount != null) {
            this.BindMNPCount = new Long(source.BindMNPCount);
        }
        if (source.BindMNPList != null) {
            this.BindMNPList = new ApplicationMNPRelInfoResp[source.BindMNPList.length];
            for (int i = 0; i < source.BindMNPList.length; i++) {
                this.BindMNPList[i] = new ApplicationMNPRelInfoResp(source.BindMNPList[i]);
            }
        }
        if (source.Intro != null) {
            this.Intro = new String(source.Intro);
        }
        if (source.AndroidAppUrl != null) {
            this.AndroidAppUrl = new String(source.AndroidAppUrl);
        }
        if (source.IosAppUrl != null) {
            this.IosAppUrl = new String(source.IosAppUrl);
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
        this.setParamSimple(map, prefix + "BindMNPCount", this.BindMNPCount);
        this.setParamArrayObj(map, prefix + "BindMNPList.", this.BindMNPList);
        this.setParamSimple(map, prefix + "Intro", this.Intro);
        this.setParamSimple(map, prefix + "AndroidAppUrl", this.AndroidAppUrl);
        this.setParamSimple(map, prefix + "IosAppUrl", this.IosAppUrl);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "SensitiveApiCount", this.SensitiveApiCount);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);

    }
}

