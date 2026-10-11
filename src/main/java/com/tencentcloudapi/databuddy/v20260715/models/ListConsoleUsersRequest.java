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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListConsoleUsersRequest extends AbstractModel {

    /**
    * <p>Page number. Value range: starts from 1. Default value: 1.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Size per page. Default: 10; Minimum: 10; Maximum: 100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Fuzzy matching between username and UIN</p>
    */
    @SerializedName("UserKeyword")
    @Expose
    private String UserKeyword;

    /**
    * <p>Used to filter users associated with roles</p><p>Enumeration values:</p><ul><li>2001: Console Administrator</li><li>2002: Console Member</li></ul><p>Can be obtained through the ListConsoleRoles API</p>
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
    * <p>Multi-field sorting, for example [{Name: 'CreateTime', Direction: 'Desc'}, {Name: 'UserName', Direction: 'Asc'}]. By default, it sorts in descending order by creation time.</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
     * Get <p>Page number. Value range: starts from 1. Default value: 1.</p> 
     * @return PageNumber <p>Page number. Value range: starts from 1. Default value: 1.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number. Value range: starts from 1. Default value: 1.</p>
     * @param PageNumber <p>Page number. Value range: starts from 1. Default value: 1.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Size per page. Default: 10; Minimum: 10; Maximum: 100</p> 
     * @return PageSize <p>Size per page. Default: 10; Minimum: 10; Maximum: 100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Size per page. Default: 10; Minimum: 10; Maximum: 100</p>
     * @param PageSize <p>Size per page. Default: 10; Minimum: 10; Maximum: 100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Fuzzy matching between username and UIN</p> 
     * @return UserKeyword <p>Fuzzy matching between username and UIN</p>
     */
    public String getUserKeyword() {
        return this.UserKeyword;
    }

    /**
     * Set <p>Fuzzy matching between username and UIN</p>
     * @param UserKeyword <p>Fuzzy matching between username and UIN</p>
     */
    public void setUserKeyword(String UserKeyword) {
        this.UserKeyword = UserKeyword;
    }

    /**
     * Get <p>Used to filter users associated with roles</p><p>Enumeration values:</p><ul><li>2001: Console Administrator</li><li>2002: Console Member</li></ul><p>Can be obtained through the ListConsoleRoles API</p> 
     * @return RoleIds <p>Used to filter users associated with roles</p><p>Enumeration values:</p><ul><li>2001: Console Administrator</li><li>2002: Console Member</li></ul><p>Can be obtained through the ListConsoleRoles API</p>
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set <p>Used to filter users associated with roles</p><p>Enumeration values:</p><ul><li>2001: Console Administrator</li><li>2002: Console Member</li></ul><p>Can be obtained through the ListConsoleRoles API</p>
     * @param RoleIds <p>Used to filter users associated with roles</p><p>Enumeration values:</p><ul><li>2001: Console Administrator</li><li>2002: Console Member</li></ul><p>Can be obtained through the ListConsoleRoles API</p>
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    /**
     * Get <p>Multi-field sorting, for example [{Name: 'CreateTime', Direction: 'Desc'}, {Name: 'UserName', Direction: 'Asc'}]. By default, it sorts in descending order by creation time.</p> 
     * @return OrderBys <p>Multi-field sorting, for example [{Name: 'CreateTime', Direction: 'Desc'}, {Name: 'UserName', Direction: 'Asc'}]. By default, it sorts in descending order by creation time.</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>Multi-field sorting, for example [{Name: 'CreateTime', Direction: 'Desc'}, {Name: 'UserName', Direction: 'Asc'}]. By default, it sorts in descending order by creation time.</p>
     * @param OrderBys <p>Multi-field sorting, for example [{Name: 'CreateTime', Direction: 'Desc'}, {Name: 'UserName', Direction: 'Asc'}]. By default, it sorts in descending order by creation time.</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    public ListConsoleUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListConsoleUsersRequest(ListConsoleUsersRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.UserKeyword != null) {
            this.UserKeyword = new String(source.UserKeyword);
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
        }
        if (source.OrderBys != null) {
            this.OrderBys = new OrderBy[source.OrderBys.length];
            for (int i = 0; i < source.OrderBys.length; i++) {
                this.OrderBys[i] = new OrderBy(source.OrderBys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "UserKeyword", this.UserKeyword);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);

    }
}

