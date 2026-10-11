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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkspaceRoleResult extends AbstractModel {

    /**
    * Role id.
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * Whether the workspace role is created successfully
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get Role id. 
     * @return RoleId Role id.
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role id.
     * @param RoleId Role id.
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Whether the workspace role is created successfully 
     * @return Status Whether the workspace role is created successfully
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the workspace role is created successfully
     * @param Status Whether the workspace role is created successfully
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public CreateWorkspaceRoleResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkspaceRoleResult(CreateWorkspaceRoleResult source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

