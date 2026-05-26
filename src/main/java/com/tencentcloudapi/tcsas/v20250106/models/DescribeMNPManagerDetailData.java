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

public class DescribeMNPManagerDetailData extends AbstractModel {

    /**
    * Mini program category.
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * Mini program appid.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program name.
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Mini program icon.
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * Mini program introduction.
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * Mini program description.
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Creator.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Access status. Valid values: 1: not connected; 2: connected.
    */
    @SerializedName("AccessStatus")
    @Expose
    private Long AccessStatus;

    /**
    * Team name.
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Team ID.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Mini program available status. Valid values: 1: Available; 2: Removed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The mini program name and description in multiple languages.
    */
    @SerializedName("I18nList")
    @Expose
    private MNPDetailI18nVO [] I18nList;

    /**
     * Get Mini program category. 
     * @return MNPType Mini program category.
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set Mini program category.
     * @param MNPType Mini program category.
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get Mini program appid. 
     * @return MNPId Mini program appid.
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program appid.
     * @param MNPId Mini program appid.
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Mini program name. 
     * @return MNPName Mini program name.
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name.
     * @param MNPName Mini program name.
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Mini program icon. 
     * @return MNPIcon Mini program icon.
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set Mini program icon.
     * @param MNPIcon Mini program icon.
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get Mini program introduction. 
     * @return MNPIntro Mini program introduction.
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set Mini program introduction.
     * @param MNPIntro Mini program introduction.
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get Mini program description. 
     * @return MNPDesc Mini program description.
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set Mini program description.
     * @param MNPDesc Mini program description.
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
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
     * Get Access status. Valid values: 1: not connected; 2: connected. 
     * @return AccessStatus Access status. Valid values: 1: not connected; 2: connected.
     */
    public Long getAccessStatus() {
        return this.AccessStatus;
    }

    /**
     * Set Access status. Valid values: 1: not connected; 2: connected.
     * @param AccessStatus Access status. Valid values: 1: not connected; 2: connected.
     */
    public void setAccessStatus(Long AccessStatus) {
        this.AccessStatus = AccessStatus;
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
     * Get Mini program available status. Valid values: 1: Available; 2: Removed. 
     * @return Status Mini program available status. Valid values: 1: Available; 2: Removed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Mini program available status. Valid values: 1: Available; 2: Removed.
     * @param Status Mini program available status. Valid values: 1: Available; 2: Removed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The mini program name and description in multiple languages. 
     * @return I18nList The mini program name and description in multiple languages.
     */
    public MNPDetailI18nVO [] getI18nList() {
        return this.I18nList;
    }

    /**
     * Set The mini program name and description in multiple languages.
     * @param I18nList The mini program name and description in multiple languages.
     */
    public void setI18nList(MNPDetailI18nVO [] I18nList) {
        this.I18nList = I18nList;
    }

    public DescribeMNPManagerDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPManagerDetailData(DescribeMNPManagerDetailData source) {
        if (source.MNPType != null) {
            this.MNPType = new String(source.MNPType);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPIcon != null) {
            this.MNPIcon = new String(source.MNPIcon);
        }
        if (source.MNPIntro != null) {
            this.MNPIntro = new String(source.MNPIntro);
        }
        if (source.MNPDesc != null) {
            this.MNPDesc = new String(source.MNPDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.AccessStatus != null) {
            this.AccessStatus = new Long(source.AccessStatus);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.I18nList != null) {
            this.I18nList = new MNPDetailI18nVO[source.I18nList.length];
            for (int i = 0; i < source.I18nList.length; i++) {
                this.I18nList[i] = new MNPDetailI18nVO(source.I18nList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPType", this.MNPType);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);
        this.setParamSimple(map, prefix + "MNPIntro", this.MNPIntro);
        this.setParamSimple(map, prefix + "MNPDesc", this.MNPDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "AccessStatus", this.AccessStatus);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "I18nList.", this.I18nList);

    }
}

