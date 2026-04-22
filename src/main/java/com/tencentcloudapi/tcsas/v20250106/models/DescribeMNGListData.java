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

public class DescribeMNGListData extends AbstractModel {

    /**
    * <p>Mini game appid</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Mini game icon</p>
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * <p>Mini game name</p>
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * <p>Team name</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>Mini game category</p>
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * <p>Mini game available status. Valid values: 1: Available; 2: Not available</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Mini game introduction</p>
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * <p>Creator</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>Creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Updater</p>
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * <p>Update time</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Superapp name</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>Effective status of the bound superapp. 1: Not effective; 2: Effective</p>
    */
    @SerializedName("EffectStatus")
    @Expose
    private Long EffectStatus;

    /**
    * <p>Effective version ID of the superapp bound to the mini game</p>
    */
    @SerializedName("EffectMNPVersionId")
    @Expose
    private Long EffectMNPVersionId;

    /**
    * <p>Effective version number of the superapp bound to the mini game</p>
    */
    @SerializedName("EffectMNPVersion")
    @Expose
    private String EffectMNPVersion;

    /**
     * Get <p>Mini game appid</p> 
     * @return MNPId <p>Mini game appid</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini game appid</p>
     * @param MNPId <p>Mini game appid</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Mini game icon</p> 
     * @return MNPIcon <p>Mini game icon</p>
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set <p>Mini game icon</p>
     * @param MNPIcon <p>Mini game icon</p>
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get <p>Mini game name</p> 
     * @return MNPName <p>Mini game name</p>
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set <p>Mini game name</p>
     * @param MNPName <p>Mini game name</p>
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get <p>Team name</p> 
     * @return TeamName <p>Team name</p>
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set <p>Team name</p>
     * @param TeamName <p>Team name</p>
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get <p>Mini game category</p> 
     * @return MNPType <p>Mini game category</p>
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set <p>Mini game category</p>
     * @param MNPType <p>Mini game category</p>
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get <p>Mini game available status. Valid values: 1: Available; 2: Not available</p> 
     * @return Status <p>Mini game available status. Valid values: 1: Available; 2: Not available</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Mini game available status. Valid values: 1: Available; 2: Not available</p>
     * @param Status <p>Mini game available status. Valid values: 1: Available; 2: Not available</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Mini game introduction</p> 
     * @return MNPIntro <p>Mini game introduction</p>
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set <p>Mini game introduction</p>
     * @param MNPIntro <p>Mini game introduction</p>
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get <p>Creator</p> 
     * @return CreateUser <p>Creator</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>Creator</p>
     * @param CreateUser <p>Creator</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get <p>Creation time</p> 
     * @return CreateTime <p>Creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time</p>
     * @param CreateTime <p>Creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Updater</p> 
     * @return UpdateUser <p>Updater</p>
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set <p>Updater</p>
     * @param UpdateUser <p>Updater</p>
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get <p>Update time</p> 
     * @return UpdateTime <p>Update time</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time</p>
     * @param UpdateTime <p>Update time</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Superapp name</p> 
     * @return ApplicationName <p>Superapp name</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>Superapp name</p>
     * @param ApplicationName <p>Superapp name</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>Effective status of the bound superapp. 1: Not effective; 2: Effective</p> 
     * @return EffectStatus <p>Effective status of the bound superapp. 1: Not effective; 2: Effective</p>
     */
    public Long getEffectStatus() {
        return this.EffectStatus;
    }

    /**
     * Set <p>Effective status of the bound superapp. 1: Not effective; 2: Effective</p>
     * @param EffectStatus <p>Effective status of the bound superapp. 1: Not effective; 2: Effective</p>
     */
    public void setEffectStatus(Long EffectStatus) {
        this.EffectStatus = EffectStatus;
    }

    /**
     * Get <p>Effective version ID of the superapp bound to the mini game</p> 
     * @return EffectMNPVersionId <p>Effective version ID of the superapp bound to the mini game</p>
     */
    public Long getEffectMNPVersionId() {
        return this.EffectMNPVersionId;
    }

    /**
     * Set <p>Effective version ID of the superapp bound to the mini game</p>
     * @param EffectMNPVersionId <p>Effective version ID of the superapp bound to the mini game</p>
     */
    public void setEffectMNPVersionId(Long EffectMNPVersionId) {
        this.EffectMNPVersionId = EffectMNPVersionId;
    }

    /**
     * Get <p>Effective version number of the superapp bound to the mini game</p> 
     * @return EffectMNPVersion <p>Effective version number of the superapp bound to the mini game</p>
     */
    public String getEffectMNPVersion() {
        return this.EffectMNPVersion;
    }

    /**
     * Set <p>Effective version number of the superapp bound to the mini game</p>
     * @param EffectMNPVersion <p>Effective version number of the superapp bound to the mini game</p>
     */
    public void setEffectMNPVersion(String EffectMNPVersion) {
        this.EffectMNPVersion = EffectMNPVersion;
    }

    public DescribeMNGListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGListData(DescribeMNGListData source) {
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

