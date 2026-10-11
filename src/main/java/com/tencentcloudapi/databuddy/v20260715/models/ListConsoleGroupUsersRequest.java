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

public class ListConsoleGroupUsersRequest extends AbstractModel {

    /**
    * <p>User group ID, which can be obtained through the ListConsoleGroups API.</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>Fuzzy matching by username or UIN</p>
    */
    @SerializedName("UserKeyword")
    @Expose
    private String UserKeyword;

    /**
    * <p>Query user information in batch by UIN</p>
    */
    @SerializedName("UserUins")
    @Expose
    private String [] UserUins;

    /**
    * <p>Multi-field sorting, for example [{Name: 'CreateTime', Direction: 'Desc'}, {Name: 'UserName', Direction: 'Asc'}]. By default, it sorts in descending order by creation time.</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
    * <p>Page number. Value range: starts from 1. Default value: 1.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Size per page. Default: 10. Minimum: 10. Maximum: 100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>User group ID, which can be obtained through the ListConsoleGroups API.</p> 
     * @return GroupId <p>User group ID, which can be obtained through the ListConsoleGroups API.</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>User group ID, which can be obtained through the ListConsoleGroups API.</p>
     * @param GroupId <p>User group ID, which can be obtained through the ListConsoleGroups API.</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>Fuzzy matching by username or UIN</p> 
     * @return UserKeyword <p>Fuzzy matching by username or UIN</p>
     */
    public String getUserKeyword() {
        return this.UserKeyword;
    }

    /**
     * Set <p>Fuzzy matching by username or UIN</p>
     * @param UserKeyword <p>Fuzzy matching by username or UIN</p>
     */
    public void setUserKeyword(String UserKeyword) {
        this.UserKeyword = UserKeyword;
    }

    /**
     * Get <p>Query user information in batch by UIN</p> 
     * @return UserUins <p>Query user information in batch by UIN</p>
     */
    public String [] getUserUins() {
        return this.UserUins;
    }

    /**
     * Set <p>Query user information in batch by UIN</p>
     * @param UserUins <p>Query user information in batch by UIN</p>
     */
    public void setUserUins(String [] UserUins) {
        this.UserUins = UserUins;
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
     * Get <p>Size per page. Default: 10. Minimum: 10. Maximum: 100</p> 
     * @return PageSize <p>Size per page. Default: 10. Minimum: 10. Maximum: 100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Size per page. Default: 10. Minimum: 10. Maximum: 100</p>
     * @param PageSize <p>Size per page. Default: 10. Minimum: 10. Maximum: 100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListConsoleGroupUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListConsoleGroupUsersRequest(ListConsoleGroupUsersRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.UserKeyword != null) {
            this.UserKeyword = new String(source.UserKeyword);
        }
        if (source.UserUins != null) {
            this.UserUins = new String[source.UserUins.length];
            for (int i = 0; i < source.UserUins.length; i++) {
                this.UserUins[i] = new String(source.UserUins[i]);
            }
        }
        if (source.OrderBys != null) {
            this.OrderBys = new OrderBy[source.OrderBys.length];
            for (int i = 0; i < source.OrderBys.length; i++) {
                this.OrderBys[i] = new OrderBy(source.OrderBys[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "UserKeyword", this.UserKeyword);
        this.setParamArraySimple(map, prefix + "UserUins.", this.UserUins);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

