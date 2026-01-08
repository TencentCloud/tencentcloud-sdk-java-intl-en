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
    * Specifies the mini program listing status. valid values: 1 (submitted), 2 (removed).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Mini program introduction
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

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
    * Application name
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Effective status of the bound application. valid values: 1 (not effective), 2 (effective).
    */
    @SerializedName("EffectStatus")
    @Expose
    private Long EffectStatus;

    /**
    * Specifies the ID of the application bound with the mini program.
    */
    @SerializedName("EffectMNPVersionId")
    @Expose
    private Long EffectMNPVersionId;

    /**
    * Specifies the effective version number of the application bound to the mini program.
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
     * Get Specifies the mini program listing status. valid values: 1 (submitted), 2 (removed). 
     * @return Status Specifies the mini program listing status. valid values: 1 (submitted), 2 (removed).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Specifies the mini program listing status. valid values: 1 (submitted), 2 (removed).
     * @param Status Specifies the mini program listing status. valid values: 1 (submitted), 2 (removed).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Mini program introduction 
     * @return MNPIntro Mini program introduction
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set Mini program introduction
     * @param MNPIntro Mini program introduction
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
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
     * Get Application name 
     * @return ApplicationName Application name
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
     * @param ApplicationName Application name
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Effective status of the bound application. valid values: 1 (not effective), 2 (effective). 
     * @return EffectStatus Effective status of the bound application. valid values: 1 (not effective), 2 (effective).
     */
    public Long getEffectStatus() {
        return this.EffectStatus;
    }

    /**
     * Set Effective status of the bound application. valid values: 1 (not effective), 2 (effective).
     * @param EffectStatus Effective status of the bound application. valid values: 1 (not effective), 2 (effective).
     */
    public void setEffectStatus(Long EffectStatus) {
        this.EffectStatus = EffectStatus;
    }

    /**
     * Get Specifies the ID of the application bound with the mini program. 
     * @return EffectMNPVersionId Specifies the ID of the application bound with the mini program.
     */
    public Long getEffectMNPVersionId() {
        return this.EffectMNPVersionId;
    }

    /**
     * Set Specifies the ID of the application bound with the mini program.
     * @param EffectMNPVersionId Specifies the ID of the application bound with the mini program.
     */
    public void setEffectMNPVersionId(Long EffectMNPVersionId) {
        this.EffectMNPVersionId = EffectMNPVersionId;
    }

    /**
     * Get Specifies the effective version number of the application bound to the mini program. 
     * @return EffectMNPVersion Specifies the effective version number of the application bound to the mini program.
     */
    public String getEffectMNPVersion() {
        return this.EffectMNPVersion;
    }

    /**
     * Set Specifies the effective version number of the application bound to the mini program.
     * @param EffectMNPVersion Specifies the effective version number of the application bound to the mini program.
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

