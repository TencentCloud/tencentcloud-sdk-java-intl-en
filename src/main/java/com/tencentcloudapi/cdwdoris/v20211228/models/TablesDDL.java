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

public class TablesDDL extends AbstractModel {

    /**
    * Table name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * DDL statement for creating a table

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DDLInfo")
    @Expose
    private String DDLInfo;

    /**
     * Get Table name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableName Table name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableName Table name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get DDL statement for creating a table

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DDLInfo DDL statement for creating a table

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDDLInfo() {
        return this.DDLInfo;
    }

    /**
     * Set DDL statement for creating a table

Note: This field may return null, indicating that no valid values can be obtained.
     * @param DDLInfo DDL statement for creating a table

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDDLInfo(String DDLInfo) {
        this.DDLInfo = DDLInfo;
    }

    public TablesDDL() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TablesDDL(TablesDDL source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.DDLInfo != null) {
            this.DDLInfo = new String(source.DDLInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "DDLInfo", this.DDLInfo);

    }
}

