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

public class ModifyTeamRequest extends AbstractModel {

    /**
    * <p>Team ID.</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>Team name.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>Platform ID.</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>Team admin.</p>
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * <p>Team admin user IDs.</p>
    */
    @SerializedName("AdminUserIds")
    @Expose
    private String [] AdminUserIds;

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
     * Get <p>Platform ID.</p> 
     * @return PlatformId <p>Platform ID.</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID.</p>
     * @param PlatformId <p>Platform ID.</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>Team admin.</p> 
     * @return AdminUserId <p>Team admin.</p>
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set <p>Team admin.</p>
     * @param AdminUserId <p>Team admin.</p>
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
    }

    /**
     * Get <p>Team admin user IDs.</p> 
     * @return AdminUserIds <p>Team admin user IDs.</p>
     */
    public String [] getAdminUserIds() {
        return this.AdminUserIds;
    }

    /**
     * Set <p>Team admin user IDs.</p>
     * @param AdminUserIds <p>Team admin user IDs.</p>
     */
    public void setAdminUserIds(String [] AdminUserIds) {
        this.AdminUserIds = AdminUserIds;
    }

    public ModifyTeamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTeamRequest(ModifyTeamRequest source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.AdminUserId != null) {
            this.AdminUserId = new String(source.AdminUserId);
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
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "AdminUserId", this.AdminUserId);
        this.setParamArraySimple(map, prefix + "AdminUserIds.", this.AdminUserIds);

    }
}

