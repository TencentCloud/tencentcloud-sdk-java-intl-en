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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareTableItem extends AbstractModel {

    /**
    * Table name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * In column mode, all refers to all data, while partial refers to part of the data (this parameter is only valid for data sync tasks).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ColumnMode")
    @Expose
    private String ColumnMode;

    /**
    * This field is required when ColumnMode is set to partial (this parameter is only valid for data sync tasks).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Columns")
    @Expose
    private CompareColumnItem [] Columns;

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
     * Get In column mode, all refers to all data, while partial refers to part of the data (this parameter is only valid for data sync tasks).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ColumnMode In column mode, all refers to all data, while partial refers to part of the data (this parameter is only valid for data sync tasks).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getColumnMode() {
        return this.ColumnMode;
    }

    /**
     * Set In column mode, all refers to all data, while partial refers to part of the data (this parameter is only valid for data sync tasks).Note: This field may return null, indicating that no valid values can be obtained.
     * @param ColumnMode In column mode, all refers to all data, while partial refers to part of the data (this parameter is only valid for data sync tasks).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColumnMode(String ColumnMode) {
        this.ColumnMode = ColumnMode;
    }

    /**
     * Get This field is required when ColumnMode is set to partial (this parameter is only valid for data sync tasks).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Columns This field is required when ColumnMode is set to partial (this parameter is only valid for data sync tasks).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CompareColumnItem [] getColumns() {
        return this.Columns;
    }

    /**
     * Set This field is required when ColumnMode is set to partial (this parameter is only valid for data sync tasks).Note: This field may return null, indicating that no valid values can be obtained.
     * @param Columns This field is required when ColumnMode is set to partial (this parameter is only valid for data sync tasks).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColumns(CompareColumnItem [] Columns) {
        this.Columns = Columns;
    }

    public CompareTableItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareTableItem(CompareTableItem source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.ColumnMode != null) {
            this.ColumnMode = new String(source.ColumnMode);
        }
        if (source.Columns != null) {
            this.Columns = new CompareColumnItem[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new CompareColumnItem(source.Columns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ColumnMode", this.ColumnMode);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);

    }
}

