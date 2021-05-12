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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBPrivilegeModifyInfo extends AbstractModel{

    /**
    * Database name
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * Permission change information. ReadWrite: read/write, ReadOnly: read-only, Delete: the account has the permission to delete this database
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
     * Get Database name 
     * @return DBName Database name
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set Database name
     * @param DBName Database name
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get Permission change information. ReadWrite: read/write, ReadOnly: read-only, Delete: the account has the permission to delete this database 
     * @return Privilege Permission change information. ReadWrite: read/write, ReadOnly: read-only, Delete: the account has the permission to delete this database
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Permission change information. ReadWrite: read/write, ReadOnly: read-only, Delete: the account has the permission to delete this database
     * @param Privilege Permission change information. ReadWrite: read/write, ReadOnly: read-only, Delete: the account has the permission to delete this database
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    public DBPrivilegeModifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBPrivilegeModifyInfo(DBPrivilegeModifyInfo source) {
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);

    }
}

