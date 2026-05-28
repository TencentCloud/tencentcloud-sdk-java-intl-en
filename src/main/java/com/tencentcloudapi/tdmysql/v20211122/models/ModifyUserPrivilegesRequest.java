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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserPrivilegesRequest extends AbstractModel {

    /**
    * Instance ID, such as tdsql3-5baee8df.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Login username and host information
    */
    @SerializedName("Users")
    @Expose
    private User [] Users;

    /**
    * Global permission
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * Database-level permission
    */
    @SerializedName("DatabasePrivileges")
    @Expose
    private DatabasePrivileges [] DatabasePrivileges;

    /**
    * Table-level permission
    */
    @SerializedName("TablePrivileges")
    @Expose
    private TablePrivileges [] TablePrivileges;

    /**
     * Get Instance ID, such as tdsql3-5baee8df. 
     * @return InstanceId Instance ID, such as tdsql3-5baee8df.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as tdsql3-5baee8df.
     * @param InstanceId Instance ID, such as tdsql3-5baee8df.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Login username and host information 
     * @return Users Login username and host information
     */
    public User [] getUsers() {
        return this.Users;
    }

    /**
     * Set Login username and host information
     * @param Users Login username and host information
     */
    public void setUsers(User [] Users) {
        this.Users = Users;
    }

    /**
     * Get Global permission 
     * @return GlobalPrivileges Global permission
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set Global permission
     * @param GlobalPrivileges Global permission
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get Database-level permission 
     * @return DatabasePrivileges Database-level permission
     */
    public DatabasePrivileges [] getDatabasePrivileges() {
        return this.DatabasePrivileges;
    }

    /**
     * Set Database-level permission
     * @param DatabasePrivileges Database-level permission
     */
    public void setDatabasePrivileges(DatabasePrivileges [] DatabasePrivileges) {
        this.DatabasePrivileges = DatabasePrivileges;
    }

    /**
     * Get Table-level permission 
     * @return TablePrivileges Table-level permission
     */
    public TablePrivileges [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set Table-level permission
     * @param TablePrivileges Table-level permission
     */
    public void setTablePrivileges(TablePrivileges [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    public ModifyUserPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserPrivilegesRequest(ModifyUserPrivilegesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Users != null) {
            this.Users = new User[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new User(source.Users[i]);
            }
        }
        if (source.GlobalPrivileges != null) {
            this.GlobalPrivileges = new String[source.GlobalPrivileges.length];
            for (int i = 0; i < source.GlobalPrivileges.length; i++) {
                this.GlobalPrivileges[i] = new String(source.GlobalPrivileges[i]);
            }
        }
        if (source.DatabasePrivileges != null) {
            this.DatabasePrivileges = new DatabasePrivileges[source.DatabasePrivileges.length];
            for (int i = 0; i < source.DatabasePrivileges.length; i++) {
                this.DatabasePrivileges[i] = new DatabasePrivileges(source.DatabasePrivileges[i]);
            }
        }
        if (source.TablePrivileges != null) {
            this.TablePrivileges = new TablePrivileges[source.TablePrivileges.length];
            for (int i = 0; i < source.TablePrivileges.length; i++) {
                this.TablePrivileges[i] = new TablePrivileges(source.TablePrivileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Users.", this.Users);
        this.setParamArraySimple(map, prefix + "GlobalPrivileges.", this.GlobalPrivileges);
        this.setParamArrayObj(map, prefix + "DatabasePrivileges.", this.DatabasePrivileges);
        this.setParamArrayObj(map, prefix + "TablePrivileges.", this.TablePrivileges);

    }
}

