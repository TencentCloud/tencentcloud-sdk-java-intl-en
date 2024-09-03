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

public class CoolDownTableDataInfo extends AbstractModel {

    /**
    * Column: DatabaseName
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Column: TableName
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Column: Size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * Column: RemoteSize
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RemoteSize")
    @Expose
    private String RemoteSize;

    /**
     * Get Column: DatabaseName
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseName Column: DatabaseName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Column: DatabaseName
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseName Column: DatabaseName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Column: TableName
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableName Column: TableName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Column: TableName
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableName Column: TableName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Column: Size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Size Column: Size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set Column: Size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Size Column: Size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get Column: RemoteSize
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RemoteSize Column: RemoteSize
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemoteSize() {
        return this.RemoteSize;
    }

    /**
     * Set Column: RemoteSize
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RemoteSize Column: RemoteSize
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemoteSize(String RemoteSize) {
        this.RemoteSize = RemoteSize;
    }

    public CoolDownTableDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoolDownTableDataInfo(CoolDownTableDataInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.RemoteSize != null) {
            this.RemoteSize = new String(source.RemoteSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "RemoteSize", this.RemoteSize);

    }
}

