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

public class DatabasePrivileges extends AbstractModel {

    /**
    * Database.
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * Permission list
    */
    @SerializedName("Privileges")
    @Expose
    private String [] Privileges;

    /**
     * Get Database. 
     * @return Db Database.
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set Database.
     * @param Db Database.
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get Permission list 
     * @return Privileges Permission list
     */
    public String [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set Permission list
     * @param Privileges Permission list
     */
    public void setPrivileges(String [] Privileges) {
        this.Privileges = Privileges;
    }

    public DatabasePrivileges() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabasePrivileges(DatabasePrivileges source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
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
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamArraySimple(map, prefix + "Privileges.", this.Privileges);

    }
}

