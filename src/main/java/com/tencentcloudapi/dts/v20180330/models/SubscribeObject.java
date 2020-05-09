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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeObject extends AbstractModel{

    /**
    * Data subscription object type. 0: database, 1: database table
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectsType")
    @Expose
    private Long ObjectsType;

    /**
    * Name of subscribed database
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Array of table names in subscribed database
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableNames")
    @Expose
    private String [] TableNames;

    /**
     * Get Data subscription object type. 0: database, 1: database table
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ObjectsType Data subscription object type. 0: database, 1: database table
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getObjectsType() {
        return this.ObjectsType;
    }

    /**
     * Set Data subscription object type. 0: database, 1: database table
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ObjectsType Data subscription object type. 0: database, 1: database table
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectsType(Long ObjectsType) {
        this.ObjectsType = ObjectsType;
    }

    /**
     * Get Name of subscribed database
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseName Name of subscribed database
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Name of subscribed database
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DatabaseName Name of subscribed database
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Array of table names in subscribed database
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableNames Array of table names in subscribed database
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTableNames() {
        return this.TableNames;
    }

    /**
     * Set Array of table names in subscribed database
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableNames Array of table names in subscribed database
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableNames(String [] TableNames) {
        this.TableNames = TableNames;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectsType", this.ObjectsType);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamArraySimple(map, prefix + "TableNames.", this.TableNames);

    }
}

