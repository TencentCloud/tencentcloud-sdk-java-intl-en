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

public class ListRoleConfigurationsRequest extends AbstractModel {

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
    * Filter criteria, which are case insensitive. Currently, only RoleConfigurationName is supported and only eq (Equals) and sw (Start With) are supported. Example: Filter = "RoleConfigurationName, only sw test" means querying all permission configurations starting with test. Filter = "RoleConfigurationName, only eq TestRoleConfiguration" means querying the permission configuration named TestRoleConfiguration.
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * Check whether the member account has been configured with permissions. If configured, return IsSelected: true; otherwise, return false.
    */
    @SerializedName("FilterTargets")
    @Expose
    private Long [] FilterTargets;

    /**
    * UserId of the authorized user or GroupId of the authorized user group, which must be set together with the input parameter FilterTargets.
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

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
     * Get Filter criteria, which are case insensitive. Currently, only RoleConfigurationName is supported and only eq (Equals) and sw (Start With) are supported. Example: Filter = "RoleConfigurationName, only sw test" means querying all permission configurations starting with test. Filter = "RoleConfigurationName, only eq TestRoleConfiguration" means querying the permission configuration named TestRoleConfiguration. 
     * @return Filter Filter criteria, which are case insensitive. Currently, only RoleConfigurationName is supported and only eq (Equals) and sw (Start With) are supported. Example: Filter = "RoleConfigurationName, only sw test" means querying all permission configurations starting with test. Filter = "RoleConfigurationName, only eq TestRoleConfiguration" means querying the permission configuration named TestRoleConfiguration.
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter criteria, which are case insensitive. Currently, only RoleConfigurationName is supported and only eq (Equals) and sw (Start With) are supported. Example: Filter = "RoleConfigurationName, only sw test" means querying all permission configurations starting with test. Filter = "RoleConfigurationName, only eq TestRoleConfiguration" means querying the permission configuration named TestRoleConfiguration.
     * @param Filter Filter criteria, which are case insensitive. Currently, only RoleConfigurationName is supported and only eq (Equals) and sw (Start With) are supported. Example: Filter = "RoleConfigurationName, only sw test" means querying all permission configurations starting with test. Filter = "RoleConfigurationName, only eq TestRoleConfiguration" means querying the permission configuration named TestRoleConfiguration.
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get Check whether the member account has been configured with permissions. If configured, return IsSelected: true; otherwise, return false. 
     * @return FilterTargets Check whether the member account has been configured with permissions. If configured, return IsSelected: true; otherwise, return false.
     */
    public Long [] getFilterTargets() {
        return this.FilterTargets;
    }

    /**
     * Set Check whether the member account has been configured with permissions. If configured, return IsSelected: true; otherwise, return false.
     * @param FilterTargets Check whether the member account has been configured with permissions. If configured, return IsSelected: true; otherwise, return false.
     */
    public void setFilterTargets(Long [] FilterTargets) {
        this.FilterTargets = FilterTargets;
    }

    /**
     * Get UserId of the authorized user or GroupId of the authorized user group, which must be set together with the input parameter FilterTargets. 
     * @return PrincipalId UserId of the authorized user or GroupId of the authorized user group, which must be set together with the input parameter FilterTargets.
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set UserId of the authorized user or GroupId of the authorized user group, which must be set together with the input parameter FilterTargets.
     * @param PrincipalId UserId of the authorized user or GroupId of the authorized user group, which must be set together with the input parameter FilterTargets.
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    public ListRoleConfigurationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRoleConfigurationsRequest(ListRoleConfigurationsRequest source) {
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
        if (source.FilterTargets != null) {
            this.FilterTargets = new Long[source.FilterTargets.length];
            for (int i = 0; i < source.FilterTargets.length; i++) {
                this.FilterTargets[i] = new Long(source.FilterTargets[i]);
            }
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
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
        this.setParamArraySimple(map, prefix + "FilterTargets.", this.FilterTargets);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);

    }
}

