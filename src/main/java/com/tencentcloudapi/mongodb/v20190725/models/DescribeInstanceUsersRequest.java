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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceUsersRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>userName. If left empty, query all users</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Database name. If left empty, query all database accounts.</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>Sorting field, available values: UserName; by default, sort by UserName if not passed.</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Sorting method. Value range: asc (in ascending order), desc (in descending order). Default: asc.</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>Pagination offset, defaults to 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of items per page, defaults to 20, maximum 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>userName. If left empty, query all users</p> 
     * @return UserName <p>userName. If left empty, query all users</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>userName. If left empty, query all users</p>
     * @param UserName <p>userName. If left empty, query all users</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Database name. If left empty, query all database accounts.</p> 
     * @return Database <p>Database name. If left empty, query all database accounts.</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>Database name. If left empty, query all database accounts.</p>
     * @param Database <p>Database name. If left empty, query all database accounts.</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>Sorting field, available values: UserName; by default, sort by UserName if not passed.</p> 
     * @return OrderBy <p>Sorting field, available values: UserName; by default, sort by UserName if not passed.</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting field, available values: UserName; by default, sort by UserName if not passed.</p>
     * @param OrderBy <p>Sorting field, available values: UserName; by default, sort by UserName if not passed.</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Sorting method. Value range: asc (in ascending order), desc (in descending order). Default: asc.</p> 
     * @return OrderType <p>Sorting method. Value range: asc (in ascending order), desc (in descending order). Default: asc.</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>Sorting method. Value range: asc (in ascending order), desc (in descending order). Default: asc.</p>
     * @param OrderType <p>Sorting method. Value range: asc (in ascending order), desc (in descending order). Default: asc.</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>Pagination offset, defaults to 0</p> 
     * @return Offset <p>Pagination offset, defaults to 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset, defaults to 0</p>
     * @param Offset <p>Pagination offset, defaults to 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of items per page, defaults to 20, maximum 100.</p> 
     * @return Limit <p>Number of items per page, defaults to 20, maximum 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items per page, defaults to 20, maximum 100.</p>
     * @param Limit <p>Number of items per page, defaults to 20, maximum 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeInstanceUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceUsersRequest(DescribeInstanceUsersRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

