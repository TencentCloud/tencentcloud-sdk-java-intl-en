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

public class ModifiedSubscribeObject extends AbstractModel {

    /**
    * Subscription object type. Valid values: 0 (database); 1 (table, for mongo tasks, this corresponds to a collection).Note: mongo only supports full instance, single database or single collection subscription, so this field should not conflict with SubscribeObjectType. For example, when SubscribeObjectType=4, it means mongo single database subscription, then 0 should be passed in this field.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectsType")
    @Expose
    private Long ObjectsType;

    /**
    * Subscription database nameNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Name of the table (or collection) in the subscription database. If ObjectsType is 1, this field is required and not empty; 
    */
    @SerializedName("TableNames")
    @Expose
    private String [] TableNames;

    /**
     * Get Subscription object type. Valid values: 0 (database); 1 (table, for mongo tasks, this corresponds to a collection).Note: mongo only supports full instance, single database or single collection subscription, so this field should not conflict with SubscribeObjectType. For example, when SubscribeObjectType=4, it means mongo single database subscription, then 0 should be passed in this field.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectsType Subscription object type. Valid values: 0 (database); 1 (table, for mongo tasks, this corresponds to a collection).Note: mongo only supports full instance, single database or single collection subscription, so this field should not conflict with SubscribeObjectType. For example, when SubscribeObjectType=4, it means mongo single database subscription, then 0 should be passed in this field.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getObjectsType() {
        return this.ObjectsType;
    }

    /**
     * Set Subscription object type. Valid values: 0 (database); 1 (table, for mongo tasks, this corresponds to a collection).Note: mongo only supports full instance, single database or single collection subscription, so this field should not conflict with SubscribeObjectType. For example, when SubscribeObjectType=4, it means mongo single database subscription, then 0 should be passed in this field.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectsType Subscription object type. Valid values: 0 (database); 1 (table, for mongo tasks, this corresponds to a collection).Note: mongo only supports full instance, single database or single collection subscription, so this field should not conflict with SubscribeObjectType. For example, when SubscribeObjectType=4, it means mongo single database subscription, then 0 should be passed in this field.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectsType(Long ObjectsType) {
        this.ObjectsType = ObjectsType;
    }

    /**
     * Get Subscription database nameNote: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseName Subscription database nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Subscription database nameNote: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseName Subscription database nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Name of the table (or collection) in the subscription database. If ObjectsType is 1, this field is required and not empty;  
     * @return TableNames Name of the table (or collection) in the subscription database. If ObjectsType is 1, this field is required and not empty; 
     */
    public String [] getTableNames() {
        return this.TableNames;
    }

    /**
     * Set Name of the table (or collection) in the subscription database. If ObjectsType is 1, this field is required and not empty; 
     * @param TableNames Name of the table (or collection) in the subscription database. If ObjectsType is 1, this field is required and not empty; 
     */
    public void setTableNames(String [] TableNames) {
        this.TableNames = TableNames;
    }

    public ModifiedSubscribeObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifiedSubscribeObject(ModifiedSubscribeObject source) {
        if (source.ObjectsType != null) {
            this.ObjectsType = new Long(source.ObjectsType);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableNames != null) {
            this.TableNames = new String[source.TableNames.length];
            for (int i = 0; i < source.TableNames.length; i++) {
                this.TableNames[i] = new String(source.TableNames[i]);
            }
        }
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

