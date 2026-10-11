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

public class ListWorkspaceGroupsRequest extends AbstractModel {

    /**
    * <p>Workspace ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Batch query by user group ID; user group ID can be obtained through the ListWorkspaceGroups API</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * <p>Fuzzy matching by user group name</p>
    */
    @SerializedName("GroupKeyword")
    @Expose
    private String GroupKeyword;

    /**
    * <p>Used to filter user groups associated with roles; can be obtained through the ListWorkspaceRoles API</p>
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
    * <p>Multi-field sorting, for example, [{Name: 'CreateTime', Direction: 'Desc'}]; import one for single-field sorting. By default, sort in descending order by creation time.</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
    * <p>Page number. Value range: starts from 1. Default value: 1. Values less than 1 are handled as 1.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Size per page. Default: 10. Value range: [1,100]. Out-of-bounds values automatically converge to the boundary value.</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>User group type filter criteria. The value is a string form of an enumerated numeric value: "0" = console system type (including all users), "1" = console custom type, "2" = workspace system type (including all workspace users), "3" = workspace custom type.</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

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
     * Get <p>Batch query by user group ID; user group ID can be obtained through the ListWorkspaceGroups API</p> 
     * @return GroupIds <p>Batch query by user group ID; user group ID can be obtained through the ListWorkspaceGroups API</p>
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>Batch query by user group ID; user group ID can be obtained through the ListWorkspaceGroups API</p>
     * @param GroupIds <p>Batch query by user group ID; user group ID can be obtained through the ListWorkspaceGroups API</p>
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>Fuzzy matching by user group name</p> 
     * @return GroupKeyword <p>Fuzzy matching by user group name</p>
     */
    public String getGroupKeyword() {
        return this.GroupKeyword;
    }

    /**
     * Set <p>Fuzzy matching by user group name</p>
     * @param GroupKeyword <p>Fuzzy matching by user group name</p>
     */
    public void setGroupKeyword(String GroupKeyword) {
        this.GroupKeyword = GroupKeyword;
    }

    /**
     * Get <p>Used to filter user groups associated with roles; can be obtained through the ListWorkspaceRoles API</p> 
     * @return RoleIds <p>Used to filter user groups associated with roles; can be obtained through the ListWorkspaceRoles API</p>
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set <p>Used to filter user groups associated with roles; can be obtained through the ListWorkspaceRoles API</p>
     * @param RoleIds <p>Used to filter user groups associated with roles; can be obtained through the ListWorkspaceRoles API</p>
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    /**
     * Get <p>Multi-field sorting, for example, [{Name: 'CreateTime', Direction: 'Desc'}]; import one for single-field sorting. By default, sort in descending order by creation time.</p> 
     * @return OrderBys <p>Multi-field sorting, for example, [{Name: 'CreateTime', Direction: 'Desc'}]; import one for single-field sorting. By default, sort in descending order by creation time.</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>Multi-field sorting, for example, [{Name: 'CreateTime', Direction: 'Desc'}]; import one for single-field sorting. By default, sort in descending order by creation time.</p>
     * @param OrderBys <p>Multi-field sorting, for example, [{Name: 'CreateTime', Direction: 'Desc'}]; import one for single-field sorting. By default, sort in descending order by creation time.</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    /**
     * Get <p>Page number. Value range: starts from 1. Default value: 1. Values less than 1 are handled as 1.</p> 
     * @return PageNumber <p>Page number. Value range: starts from 1. Default value: 1. Values less than 1 are handled as 1.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number. Value range: starts from 1. Default value: 1. Values less than 1 are handled as 1.</p>
     * @param PageNumber <p>Page number. Value range: starts from 1. Default value: 1. Values less than 1 are handled as 1.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Size per page. Default: 10. Value range: [1,100]. Out-of-bounds values automatically converge to the boundary value.</p> 
     * @return PageSize <p>Size per page. Default: 10. Value range: [1,100]. Out-of-bounds values automatically converge to the boundary value.</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Size per page. Default: 10. Value range: [1,100]. Out-of-bounds values automatically converge to the boundary value.</p>
     * @param PageSize <p>Size per page. Default: 10. Value range: [1,100]. Out-of-bounds values automatically converge to the boundary value.</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>User group type filter criteria. The value is a string form of an enumerated numeric value: "0" = console system type (including all users), "1" = console custom type, "2" = workspace system type (including all workspace users), "3" = workspace custom type.</p> 
     * @return GroupType <p>User group type filter criteria. The value is a string form of an enumerated numeric value: "0" = console system type (including all users), "1" = console custom type, "2" = workspace system type (including all workspace users), "3" = workspace custom type.</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>User group type filter criteria. The value is a string form of an enumerated numeric value: "0" = console system type (including all users), "1" = console custom type, "2" = workspace system type (including all workspace users), "3" = workspace custom type.</p>
     * @param GroupType <p>User group type filter criteria. The value is a string form of an enumerated numeric value: "0" = console system type (including all users), "1" = console custom type, "2" = workspace system type (including all workspace users), "3" = workspace custom type.</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    public ListWorkspaceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkspaceGroupsRequest(ListWorkspaceGroupsRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.GroupKeyword != null) {
            this.GroupKeyword = new String(source.GroupKeyword);
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
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "GroupKeyword", this.GroupKeyword);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);

    }
}

