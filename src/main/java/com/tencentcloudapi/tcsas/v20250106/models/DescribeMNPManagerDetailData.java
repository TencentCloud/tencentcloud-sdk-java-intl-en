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
    * <p>Mini program category.</p>
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * <p>Mini program appid.</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Mini program name.</p>
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * <p>Mini program icon.</p>
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * <p>Mini program introduction.</p>
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * <p>Mini program description.</p>
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Creator.</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>Access status. Valid values: 1: Not connected; 2: Connected.</p>
    */
    @SerializedName("AccessStatus")
    @Expose
    private Long AccessStatus;

    /**
    * <p>Team name.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>Team ID.</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>Mini program available status. Valid values: 1: Available; 2: Not available.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>The mini program name and description in multiple languages.</p>
    */
    @SerializedName("I18nList")
    @Expose
    private MNPDetailI18nVO [] I18nList;

    /**
    * Team type ID. Valid values: 1: Mini program team; 2: Superapp team; 3: Service provider team.
    */
    @SerializedName("TeamTypeId")
    @Expose
    private Long TeamTypeId;

    /**
     * Get <p>Mini program category.</p> 
     * @return MNPType <p>Mini program category.</p>
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set <p>Mini program category.</p>
     * @param MNPType <p>Mini program category.</p>
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get <p>Mini program appid.</p> 
     * @return MNPId <p>Mini program appid.</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini program appid.</p>
     * @param MNPId <p>Mini program appid.</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Mini program name.</p> 
     * @return MNPName <p>Mini program name.</p>
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set <p>Mini program name.</p>
     * @param MNPName <p>Mini program name.</p>
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get <p>Mini program icon.</p> 
     * @return MNPIcon <p>Mini program icon.</p>
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set <p>Mini program icon.</p>
     * @param MNPIcon <p>Mini program icon.</p>
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get <p>Mini program introduction.</p> 
     * @return MNPIntro <p>Mini program introduction.</p>
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set <p>Mini program introduction.</p>
     * @param MNPIntro <p>Mini program introduction.</p>
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get <p>Mini program description.</p> 
     * @return MNPDesc <p>Mini program description.</p>
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set <p>Mini program description.</p>
     * @param MNPDesc <p>Mini program description.</p>
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Creator.</p> 
     * @return CreateUser <p>Creator.</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>Creator.</p>
     * @param CreateUser <p>Creator.</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get <p>Access status. Valid values: 1: Not connected; 2: Connected.</p> 
     * @return AccessStatus <p>Access status. Valid values: 1: Not connected; 2: Connected.</p>
     */
    public Long getAccessStatus() {
        return this.AccessStatus;
    }

    /**
     * Set <p>Access status. Valid values: 1: Not connected; 2: Connected.</p>
     * @param AccessStatus <p>Access status. Valid values: 1: Not connected; 2: Connected.</p>
     */
    public void setAccessStatus(Long AccessStatus) {
        this.AccessStatus = AccessStatus;
    }

    /**
     * Get <p>Team name.</p> 
     * @return TeamName <p>Team name.</p>
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set <p>Team name.</p>
     * @param TeamName <p>Team name.</p>
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get <p>Team ID.</p> 
     * @return TeamId <p>Team ID.</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>Team ID.</p>
     * @param TeamId <p>Team ID.</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get <p>Mini program available status. Valid values: 1: Available; 2: Not available.</p> 
     * @return Status <p>Mini program available status. Valid values: 1: Available; 2: Not available.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Mini program available status. Valid values: 1: Available; 2: Not available.</p>
     * @param Status <p>Mini program available status. Valid values: 1: Available; 2: Not available.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>The mini program name and description in multiple languages.</p> 
     * @return I18nList <p>The mini program name and description in multiple languages.</p>
     */
    public MNPDetailI18nVO [] getI18nList() {
        return this.I18nList;
    }

    /**
     * Set <p>The mini program name and description in multiple languages.</p>
     * @param I18nList <p>The mini program name and description in multiple languages.</p>
     */
    public void setI18nList(MNPDetailI18nVO [] I18nList) {
        this.I18nList = I18nList;
    }

    /**
     * Get Team type ID. Valid values: 1: Mini program team; 2: Superapp team; 3: Service provider team. 
     * @return TeamTypeId Team type ID. Valid values: 1: Mini program team; 2: Superapp team; 3: Service provider team.
     */
    public Long getTeamTypeId() {
        return this.TeamTypeId;
    }

    /**
     * Set Team type ID. Valid values: 1: Mini program team; 2: Superapp team; 3: Service provider team.
     * @param TeamTypeId Team type ID. Valid values: 1: Mini program team; 2: Superapp team; 3: Service provider team.
     */
    public void setTeamTypeId(Long TeamTypeId) {
        this.TeamTypeId = TeamTypeId;
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
        if (source.TeamTypeId != null) {
            this.TeamTypeId = new Long(source.TeamTypeId);
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
        this.setParamSimple(map, prefix + "TeamTypeId", this.TeamTypeId);

    }
}

