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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterDatabaseRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Database name
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Host permissions of the new authorized user
    */
    @SerializedName("NewUserHostPrivileges")
    @Expose
    private UserHostPrivilege [] NewUserHostPrivileges;

    /**
    * Remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Host permissions of previously authorized users
    */
    @SerializedName("OldUserHostPrivileges")
    @Expose
    private UserHostPrivilege [] OldUserHostPrivileges;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Database name 
     * @return DbName Database name
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name
     * @param DbName Database name
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Host permissions of the new authorized user 
     * @return NewUserHostPrivileges Host permissions of the new authorized user
     */
    public UserHostPrivilege [] getNewUserHostPrivileges() {
        return this.NewUserHostPrivileges;
    }

    /**
     * Set Host permissions of the new authorized user
     * @param NewUserHostPrivileges Host permissions of the new authorized user
     */
    public void setNewUserHostPrivileges(UserHostPrivilege [] NewUserHostPrivileges) {
        this.NewUserHostPrivileges = NewUserHostPrivileges;
    }

    /**
     * Get Remarks 
     * @return Description Remarks
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Remarks
     * @param Description Remarks
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Host permissions of previously authorized users 
     * @return OldUserHostPrivileges Host permissions of previously authorized users
     */
    public UserHostPrivilege [] getOldUserHostPrivileges() {
        return this.OldUserHostPrivileges;
    }

    /**
     * Set Host permissions of previously authorized users
     * @param OldUserHostPrivileges Host permissions of previously authorized users
     */
    public void setOldUserHostPrivileges(UserHostPrivilege [] OldUserHostPrivileges) {
        this.OldUserHostPrivileges = OldUserHostPrivileges;
    }

    public ModifyClusterDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterDatabaseRequest(ModifyClusterDatabaseRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.NewUserHostPrivileges != null) {
            this.NewUserHostPrivileges = new UserHostPrivilege[source.NewUserHostPrivileges.length];
            for (int i = 0; i < source.NewUserHostPrivileges.length; i++) {
                this.NewUserHostPrivileges[i] = new UserHostPrivilege(source.NewUserHostPrivileges[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OldUserHostPrivileges != null) {
            this.OldUserHostPrivileges = new UserHostPrivilege[source.OldUserHostPrivileges.length];
            for (int i = 0; i < source.OldUserHostPrivileges.length; i++) {
                this.OldUserHostPrivileges[i] = new UserHostPrivilege(source.OldUserHostPrivileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamArrayObj(map, prefix + "NewUserHostPrivileges.", this.NewUserHostPrivileges);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "OldUserHostPrivileges.", this.OldUserHostPrivileges);

    }
}

