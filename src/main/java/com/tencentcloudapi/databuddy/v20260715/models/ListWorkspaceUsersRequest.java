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

public class ListWorkspaceUsersRequest extends AbstractModel {

    /**
    * <p>Workspace ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Fuzzy matching between username or UIN</p>
    */
    @SerializedName("UserKeyword")
    @Expose
    private String UserKeyword;

    /**
    * <p>Role ID list, filter users associated with roles; can be obtained through the ListWorkspaceRoles API</p>
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
    * <p>User UIN list, precise filtering by UIN</p>
    */
    @SerializedName("UserUins")
    @Expose
    private String [] UserUins;

    /**
    * <p>Sorting field list, for example, [{Name: CreateTime, Direction: DESC}]; import one for single-field sorting. By default, sort in descending order by creation time.</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
    * <p>Page number. Default value: 1. Value range: starts from 1. Values less than 1 are handled as 1.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Entries per page. Default: 10. Value range: [1,100]. Out-of-bounds values automatically converge to the boundary value.</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Extended information (empty for the first request; for pagination requests, carry the ExtendInfo from the response. Used for locating the next offset in scenarios such as consecutive pagination and item permission filtering)</p>
    */
    @SerializedName("ExtendInfo")
    @Expose
    private String ExtendInfo;

    /**
     * Get <p>Workspace ID</p> 
     * @return WorkspaceId <p>Workspace ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID</p>
     * @param WorkspaceId <p>Workspace ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Fuzzy matching between username or UIN</p> 
     * @return UserKeyword <p>Fuzzy matching between username or UIN</p>
     */
    public String getUserKeyword() {
        return this.UserKeyword;
    }

    /**
     * Set <p>Fuzzy matching between username or UIN</p>
     * @param UserKeyword <p>Fuzzy matching between username or UIN</p>
     */
    public void setUserKeyword(String UserKeyword) {
        this.UserKeyword = UserKeyword;
    }

    /**
     * Get <p>Role ID list, filter users associated with roles; can be obtained through the ListWorkspaceRoles API</p> 
     * @return RoleIds <p>Role ID list, filter users associated with roles; can be obtained through the ListWorkspaceRoles API</p>
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set <p>Role ID list, filter users associated with roles; can be obtained through the ListWorkspaceRoles API</p>
     * @param RoleIds <p>Role ID list, filter users associated with roles; can be obtained through the ListWorkspaceRoles API</p>
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    /**
     * Get <p>User UIN list, precise filtering by UIN</p> 
     * @return UserUins <p>User UIN list, precise filtering by UIN</p>
     */
    public String [] getUserUins() {
        return this.UserUins;
    }

    /**
     * Set <p>User UIN list, precise filtering by UIN</p>
     * @param UserUins <p>User UIN list, precise filtering by UIN</p>
     */
    public void setUserUins(String [] UserUins) {
        this.UserUins = UserUins;
    }

    /**
     * Get <p>Sorting field list, for example, [{Name: CreateTime, Direction: DESC}]; import one for single-field sorting. By default, sort in descending order by creation time.</p> 
     * @return OrderBys <p>Sorting field list, for example, [{Name: CreateTime, Direction: DESC}]; import one for single-field sorting. By default, sort in descending order by creation time.</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>Sorting field list, for example, [{Name: CreateTime, Direction: DESC}]; import one for single-field sorting. By default, sort in descending order by creation time.</p>
     * @param OrderBys <p>Sorting field list, for example, [{Name: CreateTime, Direction: DESC}]; import one for single-field sorting. By default, sort in descending order by creation time.</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    /**
     * Get <p>Page number. Default value: 1. Value range: starts from 1. Values less than 1 are handled as 1.</p> 
     * @return PageNumber <p>Page number. Default value: 1. Value range: starts from 1. Values less than 1 are handled as 1.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number. Default value: 1. Value range: starts from 1. Values less than 1 are handled as 1.</p>
     * @param PageNumber <p>Page number. Default value: 1. Value range: starts from 1. Values less than 1 are handled as 1.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Entries per page. Default: 10. Value range: [1,100]. Out-of-bounds values automatically converge to the boundary value.</p> 
     * @return PageSize <p>Entries per page. Default: 10. Value range: [1,100]. Out-of-bounds values automatically converge to the boundary value.</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Entries per page. Default: 10. Value range: [1,100]. Out-of-bounds values automatically converge to the boundary value.</p>
     * @param PageSize <p>Entries per page. Default: 10. Value range: [1,100]. Out-of-bounds values automatically converge to the boundary value.</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Extended information (empty for the first request; for pagination requests, carry the ExtendInfo from the response. Used for locating the next offset in scenarios such as consecutive pagination and item permission filtering)</p> 
     * @return ExtendInfo <p>Extended information (empty for the first request; for pagination requests, carry the ExtendInfo from the response. Used for locating the next offset in scenarios such as consecutive pagination and item permission filtering)</p>
     */
    public String getExtendInfo() {
        return this.ExtendInfo;
    }

    /**
     * Set <p>Extended information (empty for the first request; for pagination requests, carry the ExtendInfo from the response. Used for locating the next offset in scenarios such as consecutive pagination and item permission filtering)</p>
     * @param ExtendInfo <p>Extended information (empty for the first request; for pagination requests, carry the ExtendInfo from the response. Used for locating the next offset in scenarios such as consecutive pagination and item permission filtering)</p>
     */
    public void setExtendInfo(String ExtendInfo) {
        this.ExtendInfo = ExtendInfo;
    }

    public ListWorkspaceUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkspaceUsersRequest(ListWorkspaceUsersRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
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
        if (source.ExtendInfo != null) {
            this.ExtendInfo = new String(source.ExtendInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "UserKeyword", this.UserKeyword);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);
        this.setParamArraySimple(map, prefix + "UserUins.", this.UserUins);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ExtendInfo", this.ExtendInfo);

    }
}

