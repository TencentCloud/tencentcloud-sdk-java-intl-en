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

public class CreateTeamRequest extends AbstractModel {

    /**
    * Team name
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Administrator name
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * Permission assigned to the team. 1: Mini program; 2: Application (only one of these types is supported)
    */
    @SerializedName("TeamRoleTypeList")
    @Expose
    private Long [] TeamRoleTypeList;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Platform ID, required for API call
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Associated team ID
    */
    @SerializedName("RelatedTeamId")
    @Expose
    private String RelatedTeamId;

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
     * Get Administrator name 
     * @return AdminUserId Administrator name
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set Administrator name
     * @param AdminUserId Administrator name
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
    }

    /**
     * Get Permission assigned to the team. 1: Mini program; 2: Application (only one of these types is supported) 
     * @return TeamRoleTypeList Permission assigned to the team. 1: Mini program; 2: Application (only one of these types is supported)
     */
    public Long [] getTeamRoleTypeList() {
        return this.TeamRoleTypeList;
    }

    /**
     * Set Permission assigned to the team. 1: Mini program; 2: Application (only one of these types is supported)
     * @param TeamRoleTypeList Permission assigned to the team. 1: Mini program; 2: Application (only one of these types is supported)
     */
    public void setTeamRoleTypeList(Long [] TeamRoleTypeList) {
        this.TeamRoleTypeList = TeamRoleTypeList;
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
     * Get Platform ID, required for API call 
     * @return PlatformId Platform ID, required for API call
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID, required for API call
     * @param PlatformId Platform ID, required for API call
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Associated team ID 
     * @return RelatedTeamId Associated team ID
     */
    public String getRelatedTeamId() {
        return this.RelatedTeamId;
    }

    /**
     * Set Associated team ID
     * @param RelatedTeamId Associated team ID
     */
    public void setRelatedTeamId(String RelatedTeamId) {
        this.RelatedTeamId = RelatedTeamId;
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

    }
}

