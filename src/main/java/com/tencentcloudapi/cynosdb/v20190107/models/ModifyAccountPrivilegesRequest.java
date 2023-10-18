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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountPrivilegesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Account infomation
    */
    @SerializedName("Account")
    @Expose
    private InputAccount Account;

    /**
    * Array of global permissions
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * Array of database permissions
    */
    @SerializedName("DatabasePrivileges")
    @Expose
    private DatabasePrivileges [] DatabasePrivileges;

    /**
    * Array of table permissions
    */
    @SerializedName("TablePrivileges")
    @Expose
    private TablePrivileges [] TablePrivileges;

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
     * Get Account infomation 
     * @return Account Account infomation
     */
    public InputAccount getAccount() {
        return this.Account;
    }

    /**
     * Set Account infomation
     * @param Account Account infomation
     */
    public void setAccount(InputAccount Account) {
        this.Account = Account;
    }

    /**
     * Get Array of global permissions 
     * @return GlobalPrivileges Array of global permissions
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set Array of global permissions
     * @param GlobalPrivileges Array of global permissions
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get Array of database permissions 
     * @return DatabasePrivileges Array of database permissions
     */
    public DatabasePrivileges [] getDatabasePrivileges() {
        return this.DatabasePrivileges;
    }

    /**
     * Set Array of database permissions
     * @param DatabasePrivileges Array of database permissions
     */
    public void setDatabasePrivileges(DatabasePrivileges [] DatabasePrivileges) {
        this.DatabasePrivileges = DatabasePrivileges;
    }

    /**
     * Get Array of table permissions 
     * @return TablePrivileges Array of table permissions
     */
    public TablePrivileges [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set Array of table permissions
     * @param TablePrivileges Array of table permissions
     */
    public void setTablePrivileges(TablePrivileges [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    public ModifyAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountPrivilegesRequest(ModifyAccountPrivilegesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Account != null) {
            this.Account = new InputAccount(source.Account);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamArraySimple(map, prefix + "GlobalPrivileges.", this.GlobalPrivileges);
        this.setParamArrayObj(map, prefix + "DatabasePrivileges.", this.DatabasePrivileges);
        this.setParamArrayObj(map, prefix + "TablePrivileges.", this.TablePrivileges);

    }
}

