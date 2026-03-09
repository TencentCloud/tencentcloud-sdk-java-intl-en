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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExploreFilePrivilegeItem extends AbstractModel {

    /**
    * Permission point.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
    * User: user role: role group: group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * User or role ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * Authorized resources.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resource")
    @Expose
    private ExploreFileResource Resource;

    /**
    * Whether can be deleted.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeleteAble")
    @Expose
    private Boolean DeleteAble;

    /**
     * Get Permission point.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Privileges Permission point.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set Permission point.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Privileges Permission point.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get User: user role: role group: group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleType User: user role: role group: group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set User: user role: role group: group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleType User: user role: role group: group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get User or role ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleId User or role ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set User or role ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleId User or role ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Authorized resources.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resource Authorized resources.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExploreFileResource getResource() {
        return this.Resource;
    }

    /**
     * Set Authorized resources.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resource Authorized resources.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResource(ExploreFileResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Whether can be deleted.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeleteAble Whether can be deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getDeleteAble() {
        return this.DeleteAble;
    }

    /**
     * Set Whether can be deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeleteAble Whether can be deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeleteAble(Boolean DeleteAble) {
        this.DeleteAble = DeleteAble;
    }

    public ExploreFilePrivilegeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExploreFilePrivilegeItem(ExploreFilePrivilegeItem source) {
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.Resource != null) {
            this.Resource = new ExploreFileResource(source.Resource);
        }
        if (source.DeleteAble != null) {
            this.DeleteAble = new Boolean(source.DeleteAble);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "DeleteAble", this.DeleteAble);

    }
}

