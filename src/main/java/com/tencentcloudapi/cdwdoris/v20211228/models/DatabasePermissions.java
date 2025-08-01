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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabasePermissions extends AbstractModel {

    /**
    * Database name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Permission name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
     * Get Database name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseName Database name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseName Database name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Permission name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Permissions Permission name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Permission name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Permissions Permission name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    public DatabasePermissions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabasePermissions(DatabasePermissions source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);

    }
}

