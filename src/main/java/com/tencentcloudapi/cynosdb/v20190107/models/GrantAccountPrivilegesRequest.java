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

public class GrantAccountPrivilegesRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Account information
    */
    @SerializedName("Account")
    @Expose
    private InputAccount Account;

    /**
    * Array of table permission codes
    */
    @SerializedName("DbTablePrivileges")
    @Expose
    private String [] DbTablePrivileges;

    /**
    * Database table information
    */
    @SerializedName("DbTables")
    @Expose
    private DbTable [] DbTables;

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Account information 
     * @return Account Account information
     */
    public InputAccount getAccount() {
        return this.Account;
    }

    /**
     * Set Account information
     * @param Account Account information
     */
    public void setAccount(InputAccount Account) {
        this.Account = Account;
    }

    /**
     * Get Array of table permission codes 
     * @return DbTablePrivileges Array of table permission codes
     */
    public String [] getDbTablePrivileges() {
        return this.DbTablePrivileges;
    }

    /**
     * Set Array of table permission codes
     * @param DbTablePrivileges Array of table permission codes
     */
    public void setDbTablePrivileges(String [] DbTablePrivileges) {
        this.DbTablePrivileges = DbTablePrivileges;
    }

    /**
     * Get Database table information 
     * @return DbTables Database table information
     */
    public DbTable [] getDbTables() {
        return this.DbTables;
    }

    /**
     * Set Database table information
     * @param DbTables Database table information
     */
    public void setDbTables(DbTable [] DbTables) {
        this.DbTables = DbTables;
    }

    public GrantAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrantAccountPrivilegesRequest(GrantAccountPrivilegesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Account != null) {
            this.Account = new InputAccount(source.Account);
        }
        if (source.DbTablePrivileges != null) {
            this.DbTablePrivileges = new String[source.DbTablePrivileges.length];
            for (int i = 0; i < source.DbTablePrivileges.length; i++) {
                this.DbTablePrivileges[i] = new String(source.DbTablePrivileges[i]);
            }
        }
        if (source.DbTables != null) {
            this.DbTables = new DbTable[source.DbTables.length];
            for (int i = 0; i < source.DbTables.length; i++) {
                this.DbTables[i] = new DbTable(source.DbTables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamArraySimple(map, prefix + "DbTablePrivileges.", this.DbTablePrivileges);
        this.setParamArrayObj(map, prefix + "DbTables.", this.DbTables);

    }
}

