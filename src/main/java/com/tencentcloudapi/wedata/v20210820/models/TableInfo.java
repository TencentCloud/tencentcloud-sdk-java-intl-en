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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableInfo extends AbstractModel {

    /**
    * Table ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Table Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table databaseName
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginDatabaseName")
    @Expose
    private String OriginDatabaseName;

    /**
    * Table schemaName
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginSchemaName")
    @Expose
    private String OriginSchemaName;

    /**
     * Get Table ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableId Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableId Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Table Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Table databaseName
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OriginDatabaseName Table databaseName
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOriginDatabaseName() {
        return this.OriginDatabaseName;
    }

    /**
     * Set Table databaseName
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OriginDatabaseName Table databaseName
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOriginDatabaseName(String OriginDatabaseName) {
        this.OriginDatabaseName = OriginDatabaseName;
    }

    /**
     * Get Table schemaName
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OriginSchemaName Table schemaName
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOriginSchemaName() {
        return this.OriginSchemaName;
    }

    /**
     * Set Table schemaName
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OriginSchemaName Table schemaName
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOriginSchemaName(String OriginSchemaName) {
        this.OriginSchemaName = OriginSchemaName;
    }

    public TableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableInfo(TableInfo source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.OriginDatabaseName != null) {
            this.OriginDatabaseName = new String(source.OriginDatabaseName);
        }
        if (source.OriginSchemaName != null) {
            this.OriginSchemaName = new String(source.OriginSchemaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "OriginDatabaseName", this.OriginDatabaseName);
        this.setParamSimple(map, prefix + "OriginSchemaName", this.OriginSchemaName);

    }
}

