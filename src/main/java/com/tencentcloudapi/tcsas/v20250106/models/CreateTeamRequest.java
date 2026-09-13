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

public class CreateTeamRequest extends AbstractModel {

    /**
    * <p>Team name.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>Administrator name.</p>
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * <p>Team role type. Valid values: 1: Mini program; 2: Superapp (only one type is currently supported).</p>
    */
    @SerializedName("TeamRoleTypeList")
    @Expose
    private Long [] TeamRoleTypeList;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Platform ID, required for API call.</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>Associated team ID.</p>
    */
    @SerializedName("RelatedTeamId")
    @Expose
    private String RelatedTeamId;

    /**
    * <p>Team expiration time as a Unix timestamp in seconds. 0 indicates no expiration. This parameter takes effect only when creating a mini program team.</p>
    */
    @SerializedName("ExpiryTime")
    @Expose
    private Long ExpiryTime;

    /**
    * <p>Administrator user IDs.</p>
    */
    @SerializedName("AdminUserIds")
    @Expose
    private String [] AdminUserIds;

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
     * Get <p>Administrator name.</p> 
     * @return AdminUserId <p>Administrator name.</p>
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set <p>Administrator name.</p>
     * @param AdminUserId <p>Administrator name.</p>
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
    }

    /**
     * Get <p>Team role type. Valid values: 1: Mini program; 2: Superapp (only one type is currently supported).</p> 
     * @return TeamRoleTypeList <p>Team role type. Valid values: 1: Mini program; 2: Superapp (only one type is currently supported).</p>
     */
    public Long [] getTeamRoleTypeList() {
        return this.TeamRoleTypeList;
    }

    /**
     * Set <p>Team role type. Valid values: 1: Mini program; 2: Superapp (only one type is currently supported).</p>
     * @param TeamRoleTypeList <p>Team role type. Valid values: 1: Mini program; 2: Superapp (only one type is currently supported).</p>
     */
    public void setTeamRoleTypeList(Long [] TeamRoleTypeList) {
        this.TeamRoleTypeList = TeamRoleTypeList;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Platform ID, required for API call.</p> 
     * @return PlatformId <p>Platform ID, required for API call.</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID, required for API call.</p>
     * @param PlatformId <p>Platform ID, required for API call.</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>Associated team ID.</p> 
     * @return RelatedTeamId <p>Associated team ID.</p>
     */
    public String getRelatedTeamId() {
        return this.RelatedTeamId;
    }

    /**
     * Set <p>Associated team ID.</p>
     * @param RelatedTeamId <p>Associated team ID.</p>
     */
    public void setRelatedTeamId(String RelatedTeamId) {
        this.RelatedTeamId = RelatedTeamId;
    }

    /**
     * Get <p>Team expiration time as a Unix timestamp in seconds. 0 indicates no expiration. This parameter takes effect only when creating a mini program team.</p> 
     * @return ExpiryTime <p>Team expiration time as a Unix timestamp in seconds. 0 indicates no expiration. This parameter takes effect only when creating a mini program team.</p>
     */
    public Long getExpiryTime() {
        return this.ExpiryTime;
    }

    /**
     * Set <p>Team expiration time as a Unix timestamp in seconds. 0 indicates no expiration. This parameter takes effect only when creating a mini program team.</p>
     * @param ExpiryTime <p>Team expiration time as a Unix timestamp in seconds. 0 indicates no expiration. This parameter takes effect only when creating a mini program team.</p>
     */
    public void setExpiryTime(Long ExpiryTime) {
        this.ExpiryTime = ExpiryTime;
    }

    /**
     * Get <p>Administrator user IDs.</p> 
     * @return AdminUserIds <p>Administrator user IDs.</p>
     */
    public String [] getAdminUserIds() {
        return this.AdminUserIds;
    }

    /**
     * Set <p>Administrator user IDs.</p>
     * @param AdminUserIds <p>Administrator user IDs.</p>
     */
    public void setAdminUserIds(String [] AdminUserIds) {
        this.AdminUserIds = AdminUserIds;
    }

    public CreateTeamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTeamRequest(CreateTeamRequest source) {
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.AdminUserId != null) {
            this.AdminUserId = new String(source.AdminUserId);
        }
        if (source.TeamRoleTypeList != null) {
            this.TeamRoleTypeList = new Long[source.TeamRoleTypeList.length];
            for (int i = 0; i < source.TeamRoleTypeList.length; i++) {
                this.TeamRoleTypeList[i] = new Long(source.TeamRoleTypeList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.RelatedTeamId != null) {
            this.RelatedTeamId = new String(source.RelatedTeamId);
        }
        if (source.ExpiryTime != null) {
            this.ExpiryTime = new Long(source.ExpiryTime);
        }
        if (source.AdminUserIds != null) {
            this.AdminUserIds = new String[source.AdminUserIds.length];
            for (int i = 0; i < source.AdminUserIds.length; i++) {
                this.AdminUserIds[i] = new String(source.AdminUserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "AdminUserId", this.AdminUserId);
        this.setParamArraySimple(map, prefix + "TeamRoleTypeList.", this.TeamRoleTypeList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "RelatedTeamId", this.RelatedTeamId);
        this.setParamSimple(map, prefix + "ExpiryTime", this.ExpiryTime);
        this.setParamArraySimple(map, prefix + "AdminUserIds.", this.AdminUserIds);

    }
}

