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

public class DBPrivilege extends AbstractModel{

    /**
    * Database name
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * Database permissions. ReadWrite: read/write, ReadOnly: read-only
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
     * Get Database permissions. ReadWrite: read/write, ReadOnly: read-only 
     * @return Privilege Database permissions. ReadWrite: read/write, ReadOnly: read-only
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Database permissions. ReadWrite: read/write, ReadOnly: read-only
     * @param Privilege Database permissions. ReadWrite: read/write, ReadOnly: read-only
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);

    }
}

