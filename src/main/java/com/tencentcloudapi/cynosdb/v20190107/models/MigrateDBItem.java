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

public class MigrateDBItem extends AbstractModel {

    /**
    * Database name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Data table migration mode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MigrateTableMode")
    @Expose
    private String MigrateTableMode;

    /**
    * Data table information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tables")
    @Expose
    private MigrateTableItem [] Tables;

    /**
     * Get Database name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbName Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbName Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Data table migration mode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MigrateTableMode Data table migration mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMigrateTableMode() {
        return this.MigrateTableMode;
    }

    /**
     * Set Data table migration mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MigrateTableMode Data table migration mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMigrateTableMode(String MigrateTableMode) {
        this.MigrateTableMode = MigrateTableMode;
    }

    /**
     * Get Data table information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tables Data table information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MigrateTableItem [] getTables() {
        return this.Tables;
    }

    /**
     * Set Data table information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tables Data table information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTables(MigrateTableItem [] Tables) {
        this.Tables = Tables;
    }

    public MigrateDBItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateDBItem(MigrateDBItem source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.MigrateTableMode != null) {
            this.MigrateTableMode = new String(source.MigrateTableMode);
        }
        if (source.Tables != null) {
            this.Tables = new MigrateTableItem[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new MigrateTableItem(source.Tables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "MigrateTableMode", this.MigrateTableMode);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);

    }
}

