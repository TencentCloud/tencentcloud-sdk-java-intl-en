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

public class DescribeInstanceRolesRequest extends AbstractModel {

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Database name. If it is empty, query the role of all databases.</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>Role type: builtin_database - built-in database role, builtin_cluster - built-in cluster role, custom - custom role. Query all if left empty.</p>
    */
    @SerializedName("RoleType")
    @Expose
    private String [] RoleType;

    /**
    * <p>Role name. Query all roles if left empty.</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>Common search keywords, fuzzy match inheritable roles and permissions relevant database name, role name, Action name, etc.</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>Sorting field, supports: RoleName, defaults to RoleName</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Sorting method: asc-ascending, desc-descending, defaults to asc</p>
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
    * <p>Number of items per page. Default: 20. Maximum: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Instance id</p> 
     * @return InstanceId <p>Instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p>
     * @param InstanceId <p>Instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Database name. If it is empty, query the role of all databases.</p> 
     * @return Database <p>Database name. If it is empty, query the role of all databases.</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>Database name. If it is empty, query the role of all databases.</p>
     * @param Database <p>Database name. If it is empty, query the role of all databases.</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>Role type: builtin_database - built-in database role, builtin_cluster - built-in cluster role, custom - custom role. Query all if left empty.</p> 
     * @return RoleType <p>Role type: builtin_database - built-in database role, builtin_cluster - built-in cluster role, custom - custom role. Query all if left empty.</p>
     */
    public String [] getRoleType() {
        return this.RoleType;
    }

    /**
     * Set <p>Role type: builtin_database - built-in database role, builtin_cluster - built-in cluster role, custom - custom role. Query all if left empty.</p>
     * @param RoleType <p>Role type: builtin_database - built-in database role, builtin_cluster - built-in cluster role, custom - custom role. Query all if left empty.</p>
     */
    public void setRoleType(String [] RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get <p>Role name. Query all roles if left empty.</p> 
     * @return RoleName <p>Role name. Query all roles if left empty.</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>Role name. Query all roles if left empty.</p>
     * @param RoleName <p>Role name. Query all roles if left empty.</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>Common search keywords, fuzzy match inheritable roles and permissions relevant database name, role name, Action name, etc.</p> 
     * @return SearchKey <p>Common search keywords, fuzzy match inheritable roles and permissions relevant database name, role name, Action name, etc.</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>Common search keywords, fuzzy match inheritable roles and permissions relevant database name, role name, Action name, etc.</p>
     * @param SearchKey <p>Common search keywords, fuzzy match inheritable roles and permissions relevant database name, role name, Action name, etc.</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get <p>Sorting field, supports: RoleName, defaults to RoleName</p> 
     * @return OrderBy <p>Sorting field, supports: RoleName, defaults to RoleName</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Sorting field, supports: RoleName, defaults to RoleName</p>
     * @param OrderBy <p>Sorting field, supports: RoleName, defaults to RoleName</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Sorting method: asc-ascending, desc-descending, defaults to asc</p> 
     * @return OrderType <p>Sorting method: asc-ascending, desc-descending, defaults to asc</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>Sorting method: asc-ascending, desc-descending, defaults to asc</p>
     * @param OrderType <p>Sorting method: asc-ascending, desc-descending, defaults to asc</p>
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
     * Get <p>Number of items per page. Default: 20. Maximum: 100.</p> 
     * @return Limit <p>Number of items per page. Default: 20. Maximum: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items per page. Default: 20. Maximum: 100.</p>
     * @param Limit <p>Number of items per page. Default: 20. Maximum: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeInstanceRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceRolesRequest(DescribeInstanceRolesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.RoleType != null) {
            this.RoleType = new String[source.RoleType.length];
            for (int i = 0; i < source.RoleType.length; i++) {
                this.RoleType[i] = new String(source.RoleType[i]);
            }
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
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
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamArraySimple(map, prefix + "RoleType.", this.RoleType);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

