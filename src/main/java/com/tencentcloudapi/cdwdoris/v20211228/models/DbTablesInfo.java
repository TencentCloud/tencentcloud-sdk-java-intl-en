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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DbTablesInfo extends AbstractModel {

    /**
    * Database name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * The corresponding table list under this database.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TablesName")
    @Expose
    private String [] TablesName;

    /**
     * Get Database name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DbName Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DbName Database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get The corresponding table list under this database.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TablesName The corresponding table list under this database.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTablesName() {
        return this.TablesName;
    }

    /**
     * Set The corresponding table list under this database.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TablesName The corresponding table list under this database.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTablesName(String [] TablesName) {
        this.TablesName = TablesName;
    }

    public DbTablesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbTablesInfo(DbTablesInfo source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.TablesName != null) {
            this.TablesName = new String[source.TablesName.length];
            for (int i = 0; i < source.TablesName.length; i++) {
                this.TablesName[i] = new String(source.TablesName[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamArraySimple(map, prefix + "TablesName.", this.TablesName);

    }
}

