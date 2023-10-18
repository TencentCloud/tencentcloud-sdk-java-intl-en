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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRoleDescriptionRequest extends AbstractModel {

    /**
    * Role description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Role ID, used to specify a role. Input either `RoleId` or `RoleName`
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * Role name, used to specify a role. Input either `RoleId` or `RoleName`
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get Role description 
     * @return Description Role description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Role description
     * @param Description Role description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Role ID, used to specify a role. Input either `RoleId` or `RoleName` 
     * @return RoleId Role ID, used to specify a role. Input either `RoleId` or `RoleName`
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role ID, used to specify a role. Input either `RoleId` or `RoleName`
     * @param RoleId Role ID, used to specify a role. Input either `RoleId` or `RoleName`
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Role name, used to specify a role. Input either `RoleId` or `RoleName` 
     * @return RoleName Role name, used to specify a role. Input either `RoleId` or `RoleName`
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name, used to specify a role. Input either `RoleId` or `RoleName`
     * @param RoleName Role name, used to specify a role. Input either `RoleId` or `RoleName`
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public UpdateRoleDescriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRoleDescriptionRequest(UpdateRoleDescriptionRequest source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

