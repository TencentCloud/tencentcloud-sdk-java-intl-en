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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackDBName extends AbstractModel {

    /**
    * Original database name before rollback
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Name of the rolled back database
    */
    @SerializedName("NewDatabaseName")
    @Expose
    private String NewDatabaseName;

    /**
     * Get Original database name before rollback 
     * @return DatabaseName Original database name before rollback
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Original database name before rollback
     * @param DatabaseName Original database name before rollback
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Name of the rolled back database 
     * @return NewDatabaseName Name of the rolled back database
     */
    public String getNewDatabaseName() {
        return this.NewDatabaseName;
    }

    /**
     * Set Name of the rolled back database
     * @param NewDatabaseName Name of the rolled back database
     */
    public void setNewDatabaseName(String NewDatabaseName) {
        this.NewDatabaseName = NewDatabaseName;
    }

    public RollbackDBName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackDBName(RollbackDBName source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.NewDatabaseName != null) {
            this.NewDatabaseName = new String(source.NewDatabaseName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "NewDatabaseName", this.NewDatabaseName);

    }
}

