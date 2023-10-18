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

public class ListApplicationAuthorizationsRequest extends AbstractModel {

    /**
    * Query type. Valid values: User: user; UserGroup: user group; OrgNode: organization.
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * Search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, an asterisk (*) at the end of the field indicates partial match, and an empty field indicates to query the full table by default.
    */
    @SerializedName("SearchCondition")
    @Expose
    private AuthorizationInfoSearchCriteria SearchCondition;

    /**
    * Set of sort criteria. You can sort the results by last modification time (lastModifiedDate). If this field is left empty, the results will be sorted in alphabetical order by application name.
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
     * Get Query type. Valid values: User: user; UserGroup: user group; OrgNode: organization. 
     * @return EntityType Query type. Valid values: User: user; UserGroup: user group; OrgNode: organization.
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set Query type. Valid values: User: user; UserGroup: user group; OrgNode: organization.
     * @param EntityType Query type. Valid values: User: user; UserGroup: user group; OrgNode: organization.
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get Search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, an asterisk (*) at the end of the field indicates partial match, and an empty field indicates to query the full table by default. 
     * @return SearchCondition Search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, an asterisk (*) at the end of the field indicates partial match, and an empty field indicates to query the full table by default.
     */
    public AuthorizationInfoSearchCriteria getSearchCondition() {
        return this.SearchCondition;
    }

    /**
     * Set Search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, an asterisk (*) at the end of the field indicates partial match, and an empty field indicates to query the full table by default.
     * @param SearchCondition Search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, an asterisk (*) at the end of the field indicates partial match, and an empty field indicates to query the full table by default.
     */
    public void setSearchCondition(AuthorizationInfoSearchCriteria SearchCondition) {
        this.SearchCondition = SearchCondition;
    }

    /**
     * Get Set of sort criteria. You can sort the results by last modification time (lastModifiedDate). If this field is left empty, the results will be sorted in alphabetical order by application name. 
     * @return Sort Set of sort criteria. You can sort the results by last modification time (lastModifiedDate). If this field is left empty, the results will be sorted in alphabetical order by application name.
     */
    public SortCondition getSort() {
        return this.Sort;
    }

    /**
     * Set Set of sort criteria. You can sort the results by last modification time (lastModifiedDate). If this field is left empty, the results will be sorted in alphabetical order by application name.
     * @param Sort Set of sort criteria. You can sort the results by last modification time (lastModifiedDate). If this field is left empty, the results will be sorted in alphabetical order by application name.
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

    public ListApplicationAuthorizationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListApplicationAuthorizationsRequest(ListApplicationAuthorizationsRequest source) {
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.SearchCondition != null) {
            this.SearchCondition = new AuthorizationInfoSearchCriteria(source.SearchCondition);
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
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamObj(map, prefix + "SearchCondition.", this.SearchCondition);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

