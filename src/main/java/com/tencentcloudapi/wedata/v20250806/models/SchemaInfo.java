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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchemaInfo extends AbstractModel {

    /**
    * Schema GUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Guid")
    @Expose
    private String Guid;

    /**
    * Schema name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Database name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
     * Get Schema GUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Guid Schema GUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGuid() {
        return this.Guid;
    }

    /**
     * Set Schema GUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Guid Schema GUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGuid(String Guid) {
        this.Guid = Guid;
    }

    /**
     * Get Schema name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Schema name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Schema name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Schema name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Database name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseName Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseName Database name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    public SchemaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchemaInfo(SchemaInfo source) {
        if (source.Guid != null) {
            this.Guid = new String(source.Guid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Guid", this.Guid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);

    }
}

