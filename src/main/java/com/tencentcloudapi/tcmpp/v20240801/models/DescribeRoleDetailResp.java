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

public class DescribeRoleDetailResp extends AbstractModel {

    /**
    * Role ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * Role name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

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
    * Accessible menu list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
     * Get Role ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleId Role ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleId Role ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Role name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleName Role name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleName Role name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
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
     * Get Accessible menu list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceIds Accessible menu list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Accessible menu list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceIds Accessible menu list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    public DescribeRoleDetailResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoleDetailResp(DescribeRoleDetailResp source) {
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);

    }
}

