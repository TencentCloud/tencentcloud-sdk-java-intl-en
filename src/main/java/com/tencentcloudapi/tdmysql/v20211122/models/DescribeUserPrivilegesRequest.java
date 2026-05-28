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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserPrivilegesRequest extends AbstractModel {

    /**
    * Instance ID, such as tdsql3-5baee8df.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Accessing host allowed for the user. Username+host uniquely determines an account.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Login username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Database name. If it is \*, query global permission (\*.\*) and ignore the Type and Object parameter.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * The name of the specific Type, for example, when Type is table, it is exactly the table name. If both DbName and Type are function names, Object represents the specific object name and cannot be \* or empty.
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * Type, can be set to table, view, proc, func, and \*. When DbName is a specific database name and Type is \*, it queries the database permission (i.e., db.\*), ignoring the Object parameter.
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * When Type=table, ColName as \* indicates the permission to query the table. If it is a specific field name, it indicates the permission to query the corresponding field.
    */
    @SerializedName("ColName")
    @Expose
    private String ColName;

    /**
     * Get Instance ID, such as tdsql3-5baee8df. 
     * @return InstanceId Instance ID, such as tdsql3-5baee8df.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as tdsql3-5baee8df.
     * @param InstanceId Instance ID, such as tdsql3-5baee8df.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Accessing host allowed for the user. Username+host uniquely determines an account. 
     * @return Host Accessing host allowed for the user. Username+host uniquely determines an account.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Accessing host allowed for the user. Username+host uniquely determines an account.
     * @param Host Accessing host allowed for the user. Username+host uniquely determines an account.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Login username. 
     * @return UserName Login username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Login username.
     * @param UserName Login username.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Database name. If it is \*, query global permission (\*.\*) and ignore the Type and Object parameter. 
     * @return DbName Database name. If it is \*, query global permission (\*.\*) and ignore the Type and Object parameter.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name. If it is \*, query global permission (\*.\*) and ignore the Type and Object parameter.
     * @param DbName Database name. If it is \*, query global permission (\*.\*) and ignore the Type and Object parameter.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get The name of the specific Type, for example, when Type is table, it is exactly the table name. If both DbName and Type are function names, Object represents the specific object name and cannot be \* or empty. 
     * @return Object The name of the specific Type, for example, when Type is table, it is exactly the table name. If both DbName and Type are function names, Object represents the specific object name and cannot be \* or empty.
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set The name of the specific Type, for example, when Type is table, it is exactly the table name. If both DbName and Type are function names, Object represents the specific object name and cannot be \* or empty.
     * @param Object The name of the specific Type, for example, when Type is table, it is exactly the table name. If both DbName and Type are function names, Object represents the specific object name and cannot be \* or empty.
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get Type, can be set to table, view, proc, func, and \*. When DbName is a specific database name and Type is \*, it queries the database permission (i.e., db.\*), ignoring the Object parameter. 
     * @return ObjectType Type, can be set to table, view, proc, func, and \*. When DbName is a specific database name and Type is \*, it queries the database permission (i.e., db.\*), ignoring the Object parameter.
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set Type, can be set to table, view, proc, func, and \*. When DbName is a specific database name and Type is \*, it queries the database permission (i.e., db.\*), ignoring the Object parameter.
     * @param ObjectType Type, can be set to table, view, proc, func, and \*. When DbName is a specific database name and Type is \*, it queries the database permission (i.e., db.\*), ignoring the Object parameter.
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get When Type=table, ColName as \* indicates the permission to query the table. If it is a specific field name, it indicates the permission to query the corresponding field. 
     * @return ColName When Type=table, ColName as \* indicates the permission to query the table. If it is a specific field name, it indicates the permission to query the corresponding field.
     */
    public String getColName() {
        return this.ColName;
    }

    /**
     * Set When Type=table, ColName as \* indicates the permission to query the table. If it is a specific field name, it indicates the permission to query the corresponding field.
     * @param ColName When Type=table, ColName as \* indicates the permission to query the table. If it is a specific field name, it indicates the permission to query the corresponding field.
     */
    public void setColName(String ColName) {
        this.ColName = ColName;
    }

    public DescribeUserPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserPrivilegesRequest(DescribeUserPrivilegesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.ColName != null) {
            this.ColName = new String(source.ColName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Object", this.Object);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "ColName", this.ColName);

    }
}

