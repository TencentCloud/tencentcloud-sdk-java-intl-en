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

public class DescribeMNPListData extends AbstractModel {

    /**
    * Mini program ID
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program icon
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * Mini program name
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Name of the associated team
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Mini program type
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * Whether the mini program is submitted to the application. 1: Submitted; 2: Removed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

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
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Application name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Effective status of the bound application. 1: Not effective; 2: Effective
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectStatus")
    @Expose
    private Long EffectStatus;

    /**
    * ID of the application bound with the mini program
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectMNPVersionId")
    @Expose
    private Long EffectMNPVersionId;

    /**
    * Effective version number of the application that bound with the mini program
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectMNPVersion")
    @Expose
    private String EffectMNPVersion;

    /**
     * Get Mini program ID 
     * @return MNPId Mini program ID
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
     * @param MNPId Mini program ID
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Mini program icon 
     * @return MNPIcon Mini program icon
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set Mini program icon
     * @param MNPIcon Mini program icon
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get Mini program name 
     * @return MNPName Mini program name
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name
     * @param MNPName Mini program name
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Name of the associated team 
     * @return TeamName Name of the associated team
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set Name of the associated team
     * @param TeamName Name of the associated team
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get Mini program type 
     * @return MNPType Mini program type
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set Mini program type
     * @param MNPType Mini program type
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get Whether the mini program is submitted to the application. 1: Submitted; 2: Removed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Whether the mini program is submitted to the application. 1: Submitted; 2: Removed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the mini program is submitted to the application. 1: Submitted; 2: Removed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Whether the mini program is submitted to the application. 1: Submitted; 2: Removed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPIntro Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPIntro Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
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
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Application name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Effective status of the bound application. 1: Not effective; 2: Effective
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EffectStatus Effective status of the bound application. 1: Not effective; 2: Effective
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEffectStatus() {
        return this.EffectStatus;
    }

    /**
     * Set Effective status of the bound application. 1: Not effective; 2: Effective
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EffectStatus Effective status of the bound application. 1: Not effective; 2: Effective
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEffectStatus(Long EffectStatus) {
        this.EffectStatus = EffectStatus;
    }

    /**
     * Get ID of the application bound with the mini program
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EffectMNPVersionId ID of the application bound with the mini program
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEffectMNPVersionId() {
        return this.EffectMNPVersionId;
    }

    /**
     * Set ID of the application bound with the mini program
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EffectMNPVersionId ID of the application bound with the mini program
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEffectMNPVersionId(Long EffectMNPVersionId) {
        this.EffectMNPVersionId = EffectMNPVersionId;
    }

    /**
     * Get Effective version number of the application that bound with the mini program
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EffectMNPVersion Effective version number of the application that bound with the mini program
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEffectMNPVersion() {
        return this.EffectMNPVersion;
    }

    /**
     * Set Effective version number of the application that bound with the mini program
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EffectMNPVersion Effective version number of the application that bound with the mini program
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEffectMNPVersion(String EffectMNPVersion) {
        this.EffectMNPVersion = EffectMNPVersion;
    }

    public DescribeMNPListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPListData(DescribeMNPListData source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPIcon != null) {
            this.MNPIcon = new String(source.MNPIcon);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.MNPType != null) {
            this.MNPType = new String(source.MNPType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MNPIntro != null) {
            this.MNPIntro = new String(source.MNPIntro);
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
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.EffectStatus != null) {
            this.EffectStatus = new Long(source.EffectStatus);
        }
        if (source.EffectMNPVersionId != null) {
            this.EffectMNPVersionId = new Long(source.EffectMNPVersionId);
        }
        if (source.EffectMNPVersion != null) {
            this.EffectMNPVersion = new String(source.EffectMNPVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "MNPType", this.MNPType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MNPIntro", this.MNPIntro);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "EffectStatus", this.EffectStatus);
        this.setParamSimple(map, prefix + "EffectMNPVersionId", this.EffectMNPVersionId);
        this.setParamSimple(map, prefix + "EffectMNPVersion", this.EffectMNPVersion);

    }
}

