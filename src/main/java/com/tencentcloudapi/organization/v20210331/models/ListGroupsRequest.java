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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListGroupsRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Maximum number of data entries per page. Value range: 1-100. Default value: 10.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Filter criterion. Format: <Attribute> <Operator> <Value>, case-insensitive. Currently, <Attribute> supports only GroupName, and <Operator> supports only eq (Equals) and sw (Start With). For example, Filter = "GroupName sw test" indicates querying all user groups with names starting with test; Filter = "GroupName eq testgroup" indicates querying the user group with the name testgroup.
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * User group type. Manual: manually created; Synchronized: externally imported.
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * Filtered user. IsSelected=1 will be returned for the user group associated with this user.
    */
    @SerializedName("FilterUsers")
    @Expose
    private String [] FilterUsers;

    /**
    * Sorting field, which currently only supports CreateTime. The default is the CreateTime field.
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * Sorting type. Desc: descending order; Asc: ascending order. It should be set along with SortField.
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * Pagination offset. Do not use it together with NextToken, prioritizing using NextToken.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Space ID. 
     * @return ZoneId Space ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Space ID.
     * @param ZoneId Space ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried. 
     * @return NextToken Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried.
     * @param NextToken Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Maximum number of data entries per page. Value range: 1-100. Default value: 10. 
     * @return MaxResults Maximum number of data entries per page. Value range: 1-100. Default value: 10.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Maximum number of data entries per page. Value range: 1-100. Default value: 10.
     * @param MaxResults Maximum number of data entries per page. Value range: 1-100. Default value: 10.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Filter criterion. Format: <Attribute> <Operator> <Value>, case-insensitive. Currently, <Attribute> supports only GroupName, and <Operator> supports only eq (Equals) and sw (Start With). For example, Filter = "GroupName sw test" indicates querying all user groups with names starting with test; Filter = "GroupName eq testgroup" indicates querying the user group with the name testgroup. 
     * @return Filter Filter criterion. Format: <Attribute> <Operator> <Value>, case-insensitive. Currently, <Attribute> supports only GroupName, and <Operator> supports only eq (Equals) and sw (Start With). For example, Filter = "GroupName sw test" indicates querying all user groups with names starting with test; Filter = "GroupName eq testgroup" indicates querying the user group with the name testgroup.
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter criterion. Format: <Attribute> <Operator> <Value>, case-insensitive. Currently, <Attribute> supports only GroupName, and <Operator> supports only eq (Equals) and sw (Start With). For example, Filter = "GroupName sw test" indicates querying all user groups with names starting with test; Filter = "GroupName eq testgroup" indicates querying the user group with the name testgroup.
     * @param Filter Filter criterion. Format: <Attribute> <Operator> <Value>, case-insensitive. Currently, <Attribute> supports only GroupName, and <Operator> supports only eq (Equals) and sw (Start With). For example, Filter = "GroupName sw test" indicates querying all user groups with names starting with test; Filter = "GroupName eq testgroup" indicates querying the user group with the name testgroup.
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get User group type. Manual: manually created; Synchronized: externally imported. 
     * @return GroupType User group type. Manual: manually created; Synchronized: externally imported.
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set User group type. Manual: manually created; Synchronized: externally imported.
     * @param GroupType User group type. Manual: manually created; Synchronized: externally imported.
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get Filtered user. IsSelected=1 will be returned for the user group associated with this user. 
     * @return FilterUsers Filtered user. IsSelected=1 will be returned for the user group associated with this user.
     */
    public String [] getFilterUsers() {
        return this.FilterUsers;
    }

    /**
     * Set Filtered user. IsSelected=1 will be returned for the user group associated with this user.
     * @param FilterUsers Filtered user. IsSelected=1 will be returned for the user group associated with this user.
     */
    public void setFilterUsers(String [] FilterUsers) {
        this.FilterUsers = FilterUsers;
    }

    /**
     * Get Sorting field, which currently only supports CreateTime. The default is the CreateTime field. 
     * @return SortField Sorting field, which currently only supports CreateTime. The default is the CreateTime field.
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set Sorting field, which currently only supports CreateTime. The default is the CreateTime field.
     * @param SortField Sorting field, which currently only supports CreateTime. The default is the CreateTime field.
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get Sorting type. Desc: descending order; Asc: ascending order. It should be set along with SortField. 
     * @return SortType Sorting type. Desc: descending order; Asc: ascending order. It should be set along with SortField.
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set Sorting type. Desc: descending order; Asc: ascending order. It should be set along with SortField.
     * @param SortType Sorting type. Desc: descending order; Asc: ascending order. It should be set along with SortField.
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get Pagination offset. Do not use it together with NextToken, prioritizing using NextToken. 
     * @return Offset Pagination offset. Do not use it together with NextToken, prioritizing using NextToken.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Do not use it together with NextToken, prioritizing using NextToken.
     * @param Offset Pagination offset. Do not use it together with NextToken, prioritizing using NextToken.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public ListGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGroupsRequest(ListGroupsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.FilterUsers != null) {
            this.FilterUsers = new String[source.FilterUsers.length];
            for (int i = 0; i < source.FilterUsers.length; i++) {
                this.FilterUsers[i] = new String(source.FilterUsers[i]);
            }
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamArraySimple(map, prefix + "FilterUsers.", this.FilterUsers);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

