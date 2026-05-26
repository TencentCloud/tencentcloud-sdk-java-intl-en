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

public class MigrateObject extends AbstractModel {

    /**
    * Database migration mode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MigrateDBMode")
    @Expose
    private String MigrateDBMode;

    /**
    * Database information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Databases")
    @Expose
    private MigrateDBItem [] Databases;

    /**
     * Get Database migration mode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MigrateDBMode Database migration mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMigrateDBMode() {
        return this.MigrateDBMode;
    }

    /**
     * Set Database migration mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MigrateDBMode Database migration mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMigrateDBMode(String MigrateDBMode) {
        this.MigrateDBMode = MigrateDBMode;
    }

    /**
     * Get Database information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Databases Database information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MigrateDBItem [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set Database information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Databases Database information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabases(MigrateDBItem [] Databases) {
        this.Databases = Databases;
    }

    public MigrateObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateObject(MigrateObject source) {
        if (source.MigrateDBMode != null) {
            this.MigrateDBMode = new String(source.MigrateDBMode);
        }
        if (source.Databases != null) {
            this.Databases = new MigrateDBItem[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new MigrateDBItem(source.Databases[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MigrateDBMode", this.MigrateDBMode);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);

    }
}

