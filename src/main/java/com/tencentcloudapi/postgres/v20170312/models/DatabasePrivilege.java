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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabasePrivilege extends AbstractModel {

    /**
    * The database object. when ObjectType is database, DatabaseName/SchemaName/TableName can be empty. when ObjectType is schema, SchemaName/TableName can be empty. when ObjectType is column, TableName cannot be empty. other cases can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Object")
    @Expose
    private DatabaseObject Object;

    /**
    * Specifies the permission list of the specified account for the database object.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivilegeSet")
    @Expose
    private String [] PrivilegeSet;

    /**
     * Get The database object. when ObjectType is database, DatabaseName/SchemaName/TableName can be empty. when ObjectType is schema, SchemaName/TableName can be empty. when ObjectType is column, TableName cannot be empty. other cases can be empty.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Object The database object. when ObjectType is database, DatabaseName/SchemaName/TableName can be empty. when ObjectType is schema, SchemaName/TableName can be empty. when ObjectType is column, TableName cannot be empty. other cases can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DatabaseObject getObject() {
        return this.Object;
    }

    /**
     * Set The database object. when ObjectType is database, DatabaseName/SchemaName/TableName can be empty. when ObjectType is schema, SchemaName/TableName can be empty. when ObjectType is column, TableName cannot be empty. other cases can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Object The database object. when ObjectType is database, DatabaseName/SchemaName/TableName can be empty. when ObjectType is schema, SchemaName/TableName can be empty. when ObjectType is column, TableName cannot be empty. other cases can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObject(DatabaseObject Object) {
        this.Object = Object;
    }

    /**
     * Get Specifies the permission list of the specified account for the database object.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivilegeSet Specifies the permission list of the specified account for the database object.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPrivilegeSet() {
        return this.PrivilegeSet;
    }

    /**
     * Set Specifies the permission list of the specified account for the database object.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivilegeSet Specifies the permission list of the specified account for the database object.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivilegeSet(String [] PrivilegeSet) {
        this.PrivilegeSet = PrivilegeSet;
    }

    public DatabasePrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabasePrivilege(DatabasePrivilege source) {
        if (source.Object != null) {
            this.Object = new DatabaseObject(source.Object);
        }
        if (source.PrivilegeSet != null) {
            this.PrivilegeSet = new String[source.PrivilegeSet.length];
            for (int i = 0; i < source.PrivilegeSet.length; i++) {
                this.PrivilegeSet[i] = new String(source.PrivilegeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Object.", this.Object);
        this.setParamArraySimple(map, prefix + "PrivilegeSet.", this.PrivilegeSet);

    }
}

