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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcedurePrivilege extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Stored procedure name
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * Permission information
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
     * Get Database name 
     * @return Database Database name
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
     * @param Database Database name
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Stored procedure name 
     * @return Procedure Stored procedure name
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set Stored procedure name
     * @param Procedure Stored procedure name
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get Permission information 
     * @return Privileges Permission information
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set Permission information
     * @param Privileges Permission information
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    public ProcedurePrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcedurePrivilege(ProcedurePrivilege source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.Privileges != null) {
            this.Privileges = new String[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new String(source.Privileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);

    }
}

