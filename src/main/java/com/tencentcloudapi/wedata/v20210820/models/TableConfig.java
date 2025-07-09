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

public class TableConfig extends AbstractModel {

    /**
    * Database ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Database nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

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
    * Table Key
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableKey")
    @Expose
    private String TableKey;

    /**
    * Field Variable
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FieldConfig")
    @Expose
    private FieldConfig [] FieldConfig;

    /**
     * Get Database ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseId Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseId Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get Database nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseName Database nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

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
     * Get Table Key
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableKey Table Key
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableKey() {
        return this.TableKey;
    }

    /**
     * Set Table Key
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableKey Table Key
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableKey(String TableKey) {
        this.TableKey = TableKey;
    }

    /**
     * Get Field Variable
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FieldConfig Field Variable
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public FieldConfig [] getFieldConfig() {
        return this.FieldConfig;
    }

    /**
     * Set Field Variable
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FieldConfig Field Variable
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFieldConfig(FieldConfig [] FieldConfig) {
        this.FieldConfig = FieldConfig;
    }

    public TableConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableConfig(TableConfig source) {
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableKey != null) {
            this.TableKey = new String(source.TableKey);
        }
        if (source.FieldConfig != null) {
            this.FieldConfig = new FieldConfig[source.FieldConfig.length];
            for (int i = 0; i < source.FieldConfig.length; i++) {
                this.FieldConfig[i] = new FieldConfig(source.FieldConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableKey", this.TableKey);
        this.setParamArrayObj(map, prefix + "FieldConfig.", this.FieldConfig);

    }
}

