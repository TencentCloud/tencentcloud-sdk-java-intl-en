/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUserGroupsRequest extends AbstractModel {

    /**
    * Search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, an asterisk (*) at the end of the field indicates partial match, and an empty field indicates to query the full table by default.
    */
    @SerializedName("SearchCondition")
    @Expose
    private UserGroupInfoSearchCriteria SearchCondition;

    /**
    * Set of sort criteria. The supported attributes for sorting include user group name (DisplayName), user group ID (UserGroupId), and last modification time (LastModifiedDate). If this field is left empty, the results will be sorted in alphabetical order by user group name.
    */
    @SerializedName("Sort")
    @Expose
    private SortCondition Sort;

    /**
    * Pagination offset. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results read per page. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, an asterisk (*) at the end of the field indicates partial match, and an empty field indicates to query the full table by default. 
     * @return SearchCondition Search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, an asterisk (*) at the end of the field indicates partial match, and an empty field indicates to query the full table by default.
     */
    public UserGroupInfoSearchCriteria getSearchCondition() {
        return this.SearchCondition;
    }

    /**
     * Set Search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, an asterisk (*) at the end of the field indicates partial match, and an empty field indicates to query the full table by default.
     * @param SearchCondition Search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, an asterisk (*) at the end of the field indicates partial match, and an empty field indicates to query the full table by default.
     */
    public void setSearchCondition(UserGroupInfoSearchCriteria SearchCondition) {
        this.SearchCondition = SearchCondition;
    }

    /**
     * Get Set of sort criteria. The supported attributes for sorting include user group name (DisplayName), user group ID (UserGroupId), and last modification time (LastModifiedDate). If this field is left empty, the results will be sorted in alphabetical order by user group name. 
     * @return Sort Set of sort criteria. The supported attributes for sorting include user group name (DisplayName), user group ID (UserGroupId), and last modification time (LastModifiedDate). If this field is left empty, the results will be sorted in alphabetical order by user group name.
     */
    public SortCondition getSort() {
        return this.Sort;
    }

    /**
     * Set Set of sort criteria. The supported attributes for sorting include user group name (DisplayName), user group ID (UserGroupId), and last modification time (LastModifiedDate). If this field is left empty, the results will be sorted in alphabetical order by user group name.
     * @param Sort Set of sort criteria. The supported attributes for sorting include user group name (DisplayName), user group ID (UserGroupId), and last modification time (LastModifiedDate). If this field is left empty, the results will be sorted in alphabetical order by user group name.
     */
    public void setSort(SortCondition Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Pagination offset. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated. 
     * @return Offset Pagination offset. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated.
     * @param Offset Pagination offset. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results read per page. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated. 
     * @return Limit Number of results read per page. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results read per page. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated.
     * @param Limit Number of results read per page. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public ListUserGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserGroupsRequest(ListUserGroupsRequest source) {
        if (source.SearchCondition != null) {
            this.SearchCondition = new UserGroupInfoSearchCriteria(source.SearchCondition);
        }
        if (source.Sort != null) {
            this.Sort = new SortCondition(source.Sort);
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
        this.setParamObj(map, prefix + "SearchCondition.", this.SearchCondition);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

