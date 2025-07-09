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

public class SubscribeObject extends AbstractModel {

    /**
    * Subscription data type. Valid values: database; table (if DatabaseType is mongodb, it means a collection).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * Subscribed database name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Name of the table in the subscribed database. If DatabaseType is mongodb, fill in the collection name. MongoDB only supports subscribing to a single database or a single collection.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tables")
    @Expose
    private String [] Tables;

    /**
     * Get Subscription data type. Valid values: database; table (if DatabaseType is mongodb, it means a collection).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectType Subscription data type. Valid values: database; table (if DatabaseType is mongodb, it means a collection).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set Subscription data type. Valid values: database; table (if DatabaseType is mongodb, it means a collection).Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectType Subscription data type. Valid values: database; table (if DatabaseType is mongodb, it means a collection).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get Subscribed database name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Database Subscribed database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Subscribed database name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Database Subscribed database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Name of the table in the subscribed database. If DatabaseType is mongodb, fill in the collection name. MongoDB only supports subscribing to a single database or a single collection.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tables Name of the table in the subscribed database. If DatabaseType is mongodb, fill in the collection name. MongoDB only supports subscribing to a single database or a single collection.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTables() {
        return this.Tables;
    }

    /**
     * Set Name of the table in the subscribed database. If DatabaseType is mongodb, fill in the collection name. MongoDB only supports subscribing to a single database or a single collection.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tables Name of the table in the subscribed database. If DatabaseType is mongodb, fill in the collection name. MongoDB only supports subscribing to a single database or a single collection.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTables(String [] Tables) {
        this.Tables = Tables;
    }

    public SubscribeObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeObject(SubscribeObject source) {
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Tables != null) {
            this.Tables = new String[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new String(source.Tables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamArraySimple(map, prefix + "Tables.", this.Tables);

    }
}

