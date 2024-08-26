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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUsersRequest extends AbstractModel {

    /**
    * Space ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * User status: Enabled, Disabled.
    */
    @SerializedName("UserStatus")
    @Expose
    private String UserStatus;

    /**
    * User type. Manual: manually created; Synchronized: externally imported.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * Filter criterion, which currently only supports username, email address, userId, and description.
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * Maximum number of data entries per page. Value range: 1-100. Default value: 10.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Token for querying the next page of returned results. During use of the API for the first time, NextToken is not needed. When you call the API for the first time, if the total number of returned data entries exceeds the MaxResults limit, the data is truncated and only MaxResults data entries are returned. Meanwhile, the return parameter IsTruncated is true and a NextToken is returned. You can use the NextToken returned last time to continue calling the API with other request parameters unchanged, to query the truncated data. You can use this method for multiple queries until IsTruncated is false, indicating that all data has been queried.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Filtered user group. IsSelected=1 will be returned for the sub-user associated with this user group.
    */
    @SerializedName("FilterGroups")
    @Expose
    private String [] FilterGroups;

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
     * Get User status: Enabled, Disabled. 
     * @return UserStatus User status: Enabled, Disabled.
     */
    public String getUserStatus() {
        return this.UserStatus;
    }

    /**
     * Set User status: Enabled, Disabled.
     * @param UserStatus User status: Enabled, Disabled.
     */
    public void setUserStatus(String UserStatus) {
        this.UserStatus = UserStatus;
    }

    /**
     * Get User type. Manual: manually created; Synchronized: externally imported. 
     * @return UserType User type. Manual: manually created; Synchronized: externally imported.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set User type. Manual: manually created; Synchronized: externally imported.
     * @param UserType User type. Manual: manually created; Synchronized: externally imported.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get Filter criterion, which currently only supports username, email address, userId, and description. 
     * @return Filter Filter criterion, which currently only supports username, email address, userId, and description.
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter criterion, which currently only supports username, email address, userId, and description.
     * @param Filter Filter criterion, which currently only supports username, email address, userId, and description.
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
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
     * Get Filtered user group. IsSelected=1 will be returned for the sub-user associated with this user group. 
     * @return FilterGroups Filtered user group. IsSelected=1 will be returned for the sub-user associated with this user group.
     */
    public String [] getFilterGroups() {
        return this.FilterGroups;
    }

    /**
     * Set Filtered user group. IsSelected=1 will be returned for the sub-user associated with this user group.
     * @param FilterGroups Filtered user group. IsSelected=1 will be returned for the sub-user associated with this user group.
     */
    public void setFilterGroups(String [] FilterGroups) {
        this.FilterGroups = FilterGroups;
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

    public ListUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUsersRequest(ListUsersRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.UserStatus != null) {
            this.UserStatus = new String(source.UserStatus);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.FilterGroups != null) {
            this.FilterGroups = new String[source.FilterGroups.length];
            for (int i = 0; i < source.FilterGroups.length; i++) {
                this.FilterGroups[i] = new String(source.FilterGroups[i]);
            }
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "UserStatus", this.UserStatus);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArraySimple(map, prefix + "FilterGroups.", this.FilterGroups);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

