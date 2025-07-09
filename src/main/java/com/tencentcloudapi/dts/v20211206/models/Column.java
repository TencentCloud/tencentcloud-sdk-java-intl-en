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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Column extends AbstractModel {

    /**
    * Column nameNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * New column name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NewColumnName")
    @Expose
    private String NewColumnName;

    /**
     * Get Column nameNote: This field may return null, indicating that no valid values can be obtained. 
     * @return ColumnName Column nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set Column nameNote: This field may return null, indicating that no valid values can be obtained.
     * @param ColumnName Column nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get New column name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NewColumnName New column name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNewColumnName() {
        return this.NewColumnName;
    }

    /**
     * Set New column name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NewColumnName New column name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNewColumnName(String NewColumnName) {
        this.NewColumnName = NewColumnName;
    }

    public Column() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Column(Column source) {
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.NewColumnName != null) {
            this.NewColumnName = new String(source.NewColumnName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "NewColumnName", this.NewColumnName);

    }
}

