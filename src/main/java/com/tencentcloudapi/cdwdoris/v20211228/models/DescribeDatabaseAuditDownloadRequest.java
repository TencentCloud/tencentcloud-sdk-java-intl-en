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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseAuditDownloadRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Paging
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Paging
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Sort parameters
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * User
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Database
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * SQL type
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * SQL statement
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * Users (multiple selections)
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * Databases (multiple selections)
    */
    @SerializedName("DbNames")
    @Expose
    private String [] DbNames;

    /**
    * SQL types (multiple selections)
    */
    @SerializedName("SqlTypes")
    @Expose
    private String [] SqlTypes;

    /**
    * Catalog names (multiple selections)
    */
    @SerializedName("Catalogs")
    @Expose
    private String [] Catalogs;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Paging 
     * @return PageSize Paging
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Paging
     * @param PageSize Paging
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Paging 
     * @return PageNum Paging
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Paging
     * @param PageNum Paging
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Sort parameters 
     * @return OrderType Sort parameters
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sort parameters
     * @param OrderType Sort parameters
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get User 
     * @return User User
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set User
     * @param User User
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Database 
     * @return DbName Database
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database
     * @param DbName Database
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get SQL type 
     * @return SqlType SQL type
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set SQL type
     * @param SqlType SQL type
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get SQL statement 
     * @return Sql SQL statement
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set SQL statement
     * @param Sql SQL statement
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get Users (multiple selections) 
     * @return Users Users (multiple selections)
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set Users (multiple selections)
     * @param Users Users (multiple selections)
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get Databases (multiple selections) 
     * @return DbNames Databases (multiple selections)
     */
    public String [] getDbNames() {
        return this.DbNames;
    }

    /**
     * Set Databases (multiple selections)
     * @param DbNames Databases (multiple selections)
     */
    public void setDbNames(String [] DbNames) {
        this.DbNames = DbNames;
    }

    /**
     * Get SQL types (multiple selections) 
     * @return SqlTypes SQL types (multiple selections)
     */
    public String [] getSqlTypes() {
        return this.SqlTypes;
    }

    /**
     * Set SQL types (multiple selections)
     * @param SqlTypes SQL types (multiple selections)
     */
    public void setSqlTypes(String [] SqlTypes) {
        this.SqlTypes = SqlTypes;
    }

    /**
     * Get Catalog names (multiple selections) 
     * @return Catalogs Catalog names (multiple selections)
     */
    public String [] getCatalogs() {
        return this.Catalogs;
    }

    /**
     * Set Catalog names (multiple selections)
     * @param Catalogs Catalog names (multiple selections)
     */
    public void setCatalogs(String [] Catalogs) {
        this.Catalogs = Catalogs;
    }

    public DescribeDatabaseAuditDownloadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseAuditDownloadRequest(DescribeDatabaseAuditDownloadRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.DbNames != null) {
            this.DbNames = new String[source.DbNames.length];
            for (int i = 0; i < source.DbNames.length; i++) {
                this.DbNames[i] = new String(source.DbNames[i]);
            }
        }
        if (source.SqlTypes != null) {
            this.SqlTypes = new String[source.SqlTypes.length];
            for (int i = 0; i < source.SqlTypes.length; i++) {
                this.SqlTypes[i] = new String(source.SqlTypes[i]);
            }
        }
        if (source.Catalogs != null) {
            this.Catalogs = new String[source.Catalogs.length];
            for (int i = 0; i < source.Catalogs.length; i++) {
                this.Catalogs[i] = new String(source.Catalogs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamArraySimple(map, prefix + "DbNames.", this.DbNames);
        this.setParamArraySimple(map, prefix + "SqlTypes.", this.SqlTypes);
        this.setParamArraySimple(map, prefix + "Catalogs.", this.Catalogs);

    }
}

