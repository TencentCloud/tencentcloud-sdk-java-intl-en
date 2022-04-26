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

public class ListApplicationsRequest extends AbstractModel{

    /**
    * Fuzzy match search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, and an asterisk (*) at the end of the field indicates partial match. The fuzzy match search feature and the exact match query feature will not take effect at the same time. If both `SearchCondition` and `ApplicationIdList` are specified, `ApplicationIdList` will take effect by default for exact match query; otherwise, the information of all applications will be returned by default.
    */
    @SerializedName("SearchCondition")
    @Expose
    private ApplicationInfoSearchCriteria SearchCondition;

    /**
    * Set of sort criteria. Valid values: DisplayName: application name; CreatedDate: creation time; LastModifiedDate: last modification time. If this field is left empty, the results will be sorted in alphabetical order by application name.
    */
    @SerializedName("Sort")
    @Expose
    private SortCondition Sort;

    /**
    * Set of sort criteria. Valid values: DisplayName: application name; CreatedDate: creation time; LastModifiedDate: last modification time. If this field is left empty, the results will be sorted in alphabetical order by application name.
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
    * Application ID list, through which the corresponding application information will be matched exactly. The fuzzy match search feature and the exact match query feature will not take effect at the same time. If both `SearchCondition` and `ApplicationIdList` are specified, `ApplicationIdList` will take effect by default for exact match query; otherwise, the information of all applications will be returned by default.
    */
    @SerializedName("ApplicationIdList")
    @Expose
    private String [] ApplicationIdList;

    /**
     * Get Fuzzy match search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, and an asterisk (*) at the end of the field indicates partial match. The fuzzy match search feature and the exact match query feature will not take effect at the same time. If both `SearchCondition` and `ApplicationIdList` are specified, `ApplicationIdList` will take effect by default for exact match query; otherwise, the information of all applications will be returned by default. 
     * @return SearchCondition Fuzzy match search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, and an asterisk (*) at the end of the field indicates partial match. The fuzzy match search feature and the exact match query feature will not take effect at the same time. If both `SearchCondition` and `ApplicationIdList` are specified, `ApplicationIdList` will take effect by default for exact match query; otherwise, the information of all applications will be returned by default.
     */
    public ApplicationInfoSearchCriteria getSearchCondition() {
        return this.SearchCondition;
    }

    /**
     * Set Fuzzy match search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, and an asterisk (*) at the end of the field indicates partial match. The fuzzy match search feature and the exact match query feature will not take effect at the same time. If both `SearchCondition` and `ApplicationIdList` are specified, `ApplicationIdList` will take effect by default for exact match query; otherwise, the information of all applications will be returned by default.
     * @param SearchCondition Fuzzy match search criterion. You can combine multiple search criteria and search in multiple data ranges. In addition, multiple query methods such as full match, partial match, and range match are supported. Specifically, double quotation marks ("") indicate full match, and an asterisk (*) at the end of the field indicates partial match. The fuzzy match search feature and the exact match query feature will not take effect at the same time. If both `SearchCondition` and `ApplicationIdList` are specified, `ApplicationIdList` will take effect by default for exact match query; otherwise, the information of all applications will be returned by default.
     */
    public void setSearchCondition(ApplicationInfoSearchCriteria SearchCondition) {
        this.SearchCondition = SearchCondition;
    }

    /**
     * Get Set of sort criteria. Valid values: DisplayName: application name; CreatedDate: creation time; LastModifiedDate: last modification time. If this field is left empty, the results will be sorted in alphabetical order by application name. 
     * @return Sort Set of sort criteria. Valid values: DisplayName: application name; CreatedDate: creation time; LastModifiedDate: last modification time. If this field is left empty, the results will be sorted in alphabetical order by application name.
     */
    public SortCondition getSort() {
        return this.Sort;
    }

    /**
     * Set Set of sort criteria. Valid values: DisplayName: application name; CreatedDate: creation time; LastModifiedDate: last modification time. If this field is left empty, the results will be sorted in alphabetical order by application name.
     * @param Sort Set of sort criteria. Valid values: DisplayName: application name; CreatedDate: creation time; LastModifiedDate: last modification time. If this field is left empty, the results will be sorted in alphabetical order by application name.
     */
    public void setSort(SortCondition Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Set of sort criteria. Valid values: DisplayName: application name; CreatedDate: creation time; LastModifiedDate: last modification time. If this field is left empty, the results will be sorted in alphabetical order by application name. 
     * @return Offset Set of sort criteria. Valid values: DisplayName: application name; CreatedDate: creation time; LastModifiedDate: last modification time. If this field is left empty, the results will be sorted in alphabetical order by application name.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Set of sort criteria. Valid values: DisplayName: application name; CreatedDate: creation time; LastModifiedDate: last modification time. If this field is left empty, the results will be sorted in alphabetical order by application name.
     * @param Offset Set of sort criteria. Valid values: DisplayName: application name; CreatedDate: creation time; LastModifiedDate: last modification time. If this field is left empty, the results will be sorted in alphabetical order by application name.
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

    /**
     * Get Application ID list, through which the corresponding application information will be matched exactly. The fuzzy match search feature and the exact match query feature will not take effect at the same time. If both `SearchCondition` and `ApplicationIdList` are specified, `ApplicationIdList` will take effect by default for exact match query; otherwise, the information of all applications will be returned by default. 
     * @return ApplicationIdList Application ID list, through which the corresponding application information will be matched exactly. The fuzzy match search feature and the exact match query feature will not take effect at the same time. If both `SearchCondition` and `ApplicationIdList` are specified, `ApplicationIdList` will take effect by default for exact match query; otherwise, the information of all applications will be returned by default.
     */
    public String [] getApplicationIdList() {
        return this.ApplicationIdList;
    }

    /**
     * Set Application ID list, through which the corresponding application information will be matched exactly. The fuzzy match search feature and the exact match query feature will not take effect at the same time. If both `SearchCondition` and `ApplicationIdList` are specified, `ApplicationIdList` will take effect by default for exact match query; otherwise, the information of all applications will be returned by default.
     * @param ApplicationIdList Application ID list, through which the corresponding application information will be matched exactly. The fuzzy match search feature and the exact match query feature will not take effect at the same time. If both `SearchCondition` and `ApplicationIdList` are specified, `ApplicationIdList` will take effect by default for exact match query; otherwise, the information of all applications will be returned by default.
     */
    public void setApplicationIdList(String [] ApplicationIdList) {
        this.ApplicationIdList = ApplicationIdList;
    }

    public ListApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListApplicationsRequest(ListApplicationsRequest source) {
        if (source.SearchCondition != null) {
            this.SearchCondition = new ApplicationInfoSearchCriteria(source.SearchCondition);
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
        if (source.ApplicationIdList != null) {
            this.ApplicationIdList = new String[source.ApplicationIdList.length];
            for (int i = 0; i < source.ApplicationIdList.length; i++) {
                this.ApplicationIdList[i] = new String(source.ApplicationIdList[i]);
            }
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
        this.setParamArraySimple(map, prefix + "ApplicationIdList.", this.ApplicationIdList);

    }
}

