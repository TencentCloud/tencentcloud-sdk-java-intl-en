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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosRoleAccessInfo extends AbstractModel {

    /**
    * Role ID
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * Role name.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Role description
    */
    @SerializedName("RoleDescription")
    @Expose
    private String RoleDescription;

    /**
    * Accessible permission count
    */
    @SerializedName("PermissionCount")
    @Expose
    private Long PermissionCount;

    /**
    * Policy creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get Role ID 
     * @return RoleId Role ID
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role ID
     * @param RoleId Role ID
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Role name. 
     * @return RoleName Role name.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name.
     * @param RoleName Role name.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Role description 
     * @return RoleDescription Role description
     */
    public String getRoleDescription() {
        return this.RoleDescription;
    }

    /**
     * Set Role description
     * @param RoleDescription Role description
     */
    public void setRoleDescription(String RoleDescription) {
        this.RoleDescription = RoleDescription;
    }

    /**
     * Get Accessible permission count 
     * @return PermissionCount Accessible permission count
     */
    public Long getPermissionCount() {
        return this.PermissionCount;
    }

    /**
     * Set Accessible permission count
     * @param PermissionCount Accessible permission count
     */
    public void setPermissionCount(Long PermissionCount) {
        this.PermissionCount = PermissionCount;
    }

    /**
     * Get Policy creation time. 
     * @return CreateTime Policy creation time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Policy creation time.
     * @param CreateTime Policy creation time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public CosRoleAccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRoleAccessInfo(CosRoleAccessInfo source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleDescription != null) {
            this.RoleDescription = new String(source.RoleDescription);
        }
        if (source.PermissionCount != null) {
            this.PermissionCount = new Long(source.PermissionCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleDescription", this.RoleDescription);
        this.setParamSimple(map, prefix + "PermissionCount", this.PermissionCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

