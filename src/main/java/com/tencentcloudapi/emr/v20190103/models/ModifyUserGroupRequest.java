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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserGroupRequest extends AbstractModel {

    /**
    * <p>Cluster string ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>User information list.</p>
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * <p>Primary user group. This parameter is required for CVM clusters and optional for TKE clusters.</p>
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * <p>Secondary user group.</p>
    */
    @SerializedName("Groups")
    @Expose
    private String [] Groups;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>Cluster string ID.</p> 
     * @return InstanceId <p>Cluster string ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Cluster string ID.</p>
     * @param InstanceId <p>Cluster string ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>User information list.</p> 
     * @return Users <p>User information list.</p>
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set <p>User information list.</p>
     * @param Users <p>User information list.</p>
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get <p>Primary user group. This parameter is required for CVM clusters and optional for TKE clusters.</p> 
     * @return UserGroup <p>Primary user group. This parameter is required for CVM clusters and optional for TKE clusters.</p>
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set <p>Primary user group. This parameter is required for CVM clusters and optional for TKE clusters.</p>
     * @param UserGroup <p>Primary user group. This parameter is required for CVM clusters and optional for TKE clusters.</p>
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get <p>Secondary user group.</p> 
     * @return Groups <p>Secondary user group.</p>
     */
    public String [] getGroups() {
        return this.Groups;
    }

    /**
     * Set <p>Secondary user group.</p>
     * @param Groups <p>Secondary user group.</p>
     */
    public void setGroups(String [] Groups) {
        this.Groups = Groups;
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

    public ModifyUserGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserGroupRequest(ModifyUserGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.Groups != null) {
            this.Groups = new String[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new String(source.Groups[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamArraySimple(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

