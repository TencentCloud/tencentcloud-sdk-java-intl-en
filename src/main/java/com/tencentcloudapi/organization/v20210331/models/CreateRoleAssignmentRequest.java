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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoleAssignmentRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Authorized member account information, up to 50 entries.
    */
    @SerializedName("RoleAssignmentInfo")
    @Expose
    private RoleAssignmentInfo [] RoleAssignmentInfo;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Authorized member account information, up to 50 entries. 
     * @return RoleAssignmentInfo Authorized member account information, up to 50 entries.
     */
    public RoleAssignmentInfo [] getRoleAssignmentInfo() {
        return this.RoleAssignmentInfo;
    }

    /**
     * Set Authorized member account information, up to 50 entries.
     * @param RoleAssignmentInfo Authorized member account information, up to 50 entries.
     */
    public void setRoleAssignmentInfo(RoleAssignmentInfo [] RoleAssignmentInfo) {
        this.RoleAssignmentInfo = RoleAssignmentInfo;
    }

    public CreateRoleAssignmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoleAssignmentRequest(CreateRoleAssignmentRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoleAssignmentInfo != null) {
            this.RoleAssignmentInfo = new RoleAssignmentInfo[source.RoleAssignmentInfo.length];
            for (int i = 0; i < source.RoleAssignmentInfo.length; i++) {
                this.RoleAssignmentInfo[i] = new RoleAssignmentInfo(source.RoleAssignmentInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "RoleAssignmentInfo.", this.RoleAssignmentInfo);

    }
}

