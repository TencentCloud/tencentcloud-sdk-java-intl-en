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

public class RollbackTableInfo extends AbstractModel {

    /**
    * Old table name.
    */
    @SerializedName("OldTable")
    @Expose
    private String OldTable;

    /**
    * New table name.
    */
    @SerializedName("NewTable")
    @Expose
    private String NewTable;

    /**
     * Get Old table name. 
     * @return OldTable Old table name.
     */
    public String getOldTable() {
        return this.OldTable;
    }

    /**
     * Set Old table name.
     * @param OldTable Old table name.
     */
    public void setOldTable(String OldTable) {
        this.OldTable = OldTable;
    }

    /**
     * Get New table name. 
     * @return NewTable New table name.
     */
    public String getNewTable() {
        return this.NewTable;
    }

    /**
     * Set New table name.
     * @param NewTable New table name.
     */
    public void setNewTable(String NewTable) {
        this.NewTable = NewTable;
    }

    public RollbackTableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackTableInfo(RollbackTableInfo source) {
        if (source.OldTable != null) {
            this.OldTable = new String(source.OldTable);
        }
        if (source.NewTable != null) {
            this.NewTable = new String(source.NewTable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldTable", this.OldTable);
        this.setParamSimple(map, prefix + "NewTable", this.NewTable);

    }
}

