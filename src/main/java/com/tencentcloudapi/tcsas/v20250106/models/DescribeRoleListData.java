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

public class DescribeRoleListData extends AbstractModel {

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
    * Team name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Role type 1-Preset role 2-Custom role
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleType")
    @Expose
    private Long RoleType;

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
     * Get Role type 1-Preset role 2-Custom role
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleType Role type 1-Preset role 2-Custom role
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRoleType() {
        return this.RoleType;
    }

    /**
     * Set Role type 1-Preset role 2-Custom role
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleType Role type 1-Preset role 2-Custom role
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleType(Long RoleType) {
        this.RoleType = RoleType;
    }

    public DescribeRoleListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoleListData(DescribeRoleListData source) {
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RoleType != null) {
            this.RoleType = new Long(source.RoleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);

    }
}

