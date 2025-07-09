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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoleListRequest extends AbstractModel {

    /**
    * Return all Roles
    */
    @SerializedName("ShowAllRoles")
    @Expose
    private Boolean ShowAllRoles;

    /**
    * Role type (system, tenant, project) that needs to be returned
    */
    @SerializedName("IncludeRoleTypes")
    @Expose
    private String [] IncludeRoleTypes;

    /**
    * Specifies the statistics of role binding personnel. Only supported in the private edition.
    */
    @SerializedName("DescribeMemberCount")
    @Expose
    private Boolean DescribeMemberCount;

    /**
    * Specifies the operator information. describes the privatized multi-tenancy version.
    */
    @SerializedName("DescribeOperator")
    @Expose
    private Boolean DescribeOperator;

    /**
    * System Role
    */
    @SerializedName("DescribeSystemRoleOnly")
    @Expose
    private Boolean DescribeSystemRoleOnly;

    /**
    * Custom Role
    */
    @SerializedName("DescribeCustomRoleOnly")
    @Expose
    private Boolean DescribeCustomRoleOnly;

    /**
    * Permission to view
    */
    @SerializedName("DescribePrivileges")
    @Expose
    private Boolean DescribePrivileges;

    /**
    * Filter criteria for Role ID
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Paging information
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Query Field
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting Field
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderFields [] OrderFields;

    /**
     * Get Return all Roles 
     * @return ShowAllRoles Return all Roles
     */
    public Boolean getShowAllRoles() {
        return this.ShowAllRoles;
    }

    /**
     * Set Return all Roles
     * @param ShowAllRoles Return all Roles
     */
    public void setShowAllRoles(Boolean ShowAllRoles) {
        this.ShowAllRoles = ShowAllRoles;
    }

    /**
     * Get Role type (system, tenant, project) that needs to be returned 
     * @return IncludeRoleTypes Role type (system, tenant, project) that needs to be returned
     */
    public String [] getIncludeRoleTypes() {
        return this.IncludeRoleTypes;
    }

    /**
     * Set Role type (system, tenant, project) that needs to be returned
     * @param IncludeRoleTypes Role type (system, tenant, project) that needs to be returned
     */
    public void setIncludeRoleTypes(String [] IncludeRoleTypes) {
        this.IncludeRoleTypes = IncludeRoleTypes;
    }

    /**
     * Get Specifies the statistics of role binding personnel. Only supported in the private edition. 
     * @return DescribeMemberCount Specifies the statistics of role binding personnel. Only supported in the private edition.
     */
    public Boolean getDescribeMemberCount() {
        return this.DescribeMemberCount;
    }

    /**
     * Set Specifies the statistics of role binding personnel. Only supported in the private edition.
     * @param DescribeMemberCount Specifies the statistics of role binding personnel. Only supported in the private edition.
     */
    public void setDescribeMemberCount(Boolean DescribeMemberCount) {
        this.DescribeMemberCount = DescribeMemberCount;
    }

    /**
     * Get Specifies the operator information. describes the privatized multi-tenancy version. 
     * @return DescribeOperator Specifies the operator information. describes the privatized multi-tenancy version.
     */
    public Boolean getDescribeOperator() {
        return this.DescribeOperator;
    }

    /**
     * Set Specifies the operator information. describes the privatized multi-tenancy version.
     * @param DescribeOperator Specifies the operator information. describes the privatized multi-tenancy version.
     */
    public void setDescribeOperator(Boolean DescribeOperator) {
        this.DescribeOperator = DescribeOperator;
    }

    /**
     * Get System Role 
     * @return DescribeSystemRoleOnly System Role
     */
    public Boolean getDescribeSystemRoleOnly() {
        return this.DescribeSystemRoleOnly;
    }

    /**
     * Set System Role
     * @param DescribeSystemRoleOnly System Role
     */
    public void setDescribeSystemRoleOnly(Boolean DescribeSystemRoleOnly) {
        this.DescribeSystemRoleOnly = DescribeSystemRoleOnly;
    }

    /**
     * Get Custom Role 
     * @return DescribeCustomRoleOnly Custom Role
     */
    public Boolean getDescribeCustomRoleOnly() {
        return this.DescribeCustomRoleOnly;
    }

    /**
     * Set Custom Role
     * @param DescribeCustomRoleOnly Custom Role
     */
    public void setDescribeCustomRoleOnly(Boolean DescribeCustomRoleOnly) {
        this.DescribeCustomRoleOnly = DescribeCustomRoleOnly;
    }

    /**
     * Get Permission to view 
     * @return DescribePrivileges Permission to view
     */
    public Boolean getDescribePrivileges() {
        return this.DescribePrivileges;
    }

    /**
     * Set Permission to view
     * @param DescribePrivileges Permission to view
     */
    public void setDescribePrivileges(Boolean DescribePrivileges) {
        this.DescribePrivileges = DescribePrivileges;
    }

    /**
     * Get Filter criteria for Role ID 
     * @return RoleIds Filter criteria for Role ID
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set Filter criteria for Role ID
     * @param RoleIds Filter criteria for Role ID
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Page number 
     * @return PageNumber Page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number
     * @param PageNumber Page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Paging information 
     * @return PageSize Paging information
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Paging information
     * @param PageSize Paging information
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Query Field 
     * @return Filters Query Field
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query Field
     * @param Filters Query Field
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting Field 
     * @return OrderFields Sorting Field
     */
    public OrderFields [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set Sorting Field
     * @param OrderFields Sorting Field
     */
    public void setOrderFields(OrderFields [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    public DescribeRoleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoleListRequest(DescribeRoleListRequest source) {
        if (source.ShowAllRoles != null) {
            this.ShowAllRoles = new Boolean(source.ShowAllRoles);
        }
        if (source.IncludeRoleTypes != null) {
            this.IncludeRoleTypes = new String[source.IncludeRoleTypes.length];
            for (int i = 0; i < source.IncludeRoleTypes.length; i++) {
                this.IncludeRoleTypes[i] = new String(source.IncludeRoleTypes[i]);
            }
        }
        if (source.DescribeMemberCount != null) {
            this.DescribeMemberCount = new Boolean(source.DescribeMemberCount);
        }
        if (source.DescribeOperator != null) {
            this.DescribeOperator = new Boolean(source.DescribeOperator);
        }
        if (source.DescribeSystemRoleOnly != null) {
            this.DescribeSystemRoleOnly = new Boolean(source.DescribeSystemRoleOnly);
        }
        if (source.DescribeCustomRoleOnly != null) {
            this.DescribeCustomRoleOnly = new Boolean(source.DescribeCustomRoleOnly);
        }
        if (source.DescribePrivileges != null) {
            this.DescribePrivileges = new Boolean(source.DescribePrivileges);
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderFields[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderFields(source.OrderFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShowAllRoles", this.ShowAllRoles);
        this.setParamArraySimple(map, prefix + "IncludeRoleTypes.", this.IncludeRoleTypes);
        this.setParamSimple(map, prefix + "DescribeMemberCount", this.DescribeMemberCount);
        this.setParamSimple(map, prefix + "DescribeOperator", this.DescribeOperator);
        this.setParamSimple(map, prefix + "DescribeSystemRoleOnly", this.DescribeSystemRoleOnly);
        this.setParamSimple(map, prefix + "DescribeCustomRoleOnly", this.DescribeCustomRoleOnly);
        this.setParamSimple(map, prefix + "DescribePrivileges", this.DescribePrivileges);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);

    }
}

