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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUserGroupsOfUserRequest extends AbstractModel{

    /**
    * User ID, which is globally unique.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Fuzzy search criterion. You can search by user group name (DisplayName). If this field is left empty, all of the user's user groups will be displayed by default.
    */
    @SerializedName("SearchCondition")
    @Expose
    private UserGroupInformationSearchCriteria SearchCondition;

    /**
    * Set of sort criteria. Valid values: DisplayName: user group name; UserGroupId: user group ID; CreatedDate: creation time. If this field is left empty, the results will be sorted in alphabetical order by user group name.
    */
    @SerializedName("Sort")
    @Expose
    private SortCondition Sort;

    /**
    * Pagination offset. Default value: 0. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated, and up to 50 user groups will be returned.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results read per page. Default value: 50. Maximum value: 100. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated, and up to 50 user groups will be returned.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get User ID, which is globally unique. 
     * @return UserId User ID, which is globally unique.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID, which is globally unique.
     * @param UserId User ID, which is globally unique.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Fuzzy search criterion. You can search by user group name (DisplayName). If this field is left empty, all of the user's user groups will be displayed by default. 
     * @return SearchCondition Fuzzy search criterion. You can search by user group name (DisplayName). If this field is left empty, all of the user's user groups will be displayed by default.
     */
    public UserGroupInformationSearchCriteria getSearchCondition() {
        return this.SearchCondition;
    }

    /**
     * Set Fuzzy search criterion. You can search by user group name (DisplayName). If this field is left empty, all of the user's user groups will be displayed by default.
     * @param SearchCondition Fuzzy search criterion. You can search by user group name (DisplayName). If this field is left empty, all of the user's user groups will be displayed by default.
     */
    public void setSearchCondition(UserGroupInformationSearchCriteria SearchCondition) {
        this.SearchCondition = SearchCondition;
    }

    /**
     * Get Set of sort criteria. Valid values: DisplayName: user group name; UserGroupId: user group ID; CreatedDate: creation time. If this field is left empty, the results will be sorted in alphabetical order by user group name. 
     * @return Sort Set of sort criteria. Valid values: DisplayName: user group name; UserGroupId: user group ID; CreatedDate: creation time. If this field is left empty, the results will be sorted in alphabetical order by user group name.
     */
    public SortCondition getSort() {
        return this.Sort;
    }

    /**
     * Set Set of sort criteria. Valid values: DisplayName: user group name; UserGroupId: user group ID; CreatedDate: creation time. If this field is left empty, the results will be sorted in alphabetical order by user group name.
     * @param Sort Set of sort criteria. Valid values: DisplayName: user group name; UserGroupId: user group ID; CreatedDate: creation time. If this field is left empty, the results will be sorted in alphabetical order by user group name.
     */
    public void setSort(SortCondition Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Pagination offset. Default value: 0. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated, and up to 50 user groups will be returned. 
     * @return Offset Pagination offset. Default value: 0. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated, and up to 50 user groups will be returned.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Default value: 0. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated, and up to 50 user groups will be returned.
     * @param Offset Pagination offset. Default value: 0. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated, and up to 50 user groups will be returned.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results read per page. Default value: 50. Maximum value: 100. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated, and up to 50 user groups will be returned. 
     * @return Limit Number of results read per page. Default value: 50. Maximum value: 100. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated, and up to 50 user groups will be returned.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results read per page. Default value: 50. Maximum value: 100. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated, and up to 50 user groups will be returned.
     * @param Limit Number of results read per page. Default value: 50. Maximum value: 100. The `Offset` and `Limit` fields need to be used together; otherwise, the query results will not be paginated, and up to 50 user groups will be returned.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public ListUserGroupsOfUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserGroupsOfUserRequest(ListUserGroupsOfUserRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SearchCondition != null) {
            this.SearchCondition = new UserGroupInformationSearchCriteria(source.SearchCondition);
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
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamObj(map, prefix + "SearchCondition.", this.SearchCondition);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

