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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTokenPlanApiKeyListRequest extends AbstractModel {

    /**
    * Package ID. You can obtain it through the DescribeTokenPlanList API.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results returned by paging query. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Paginate the list of query filter criteria. Supported filter fields: ApiKeyId (API Key ID), Name (API Key name), Status (whether the API Key is available), StopReason (reason for disabling the API Key), UseStatus (API Key user-side switch).
    */
    @SerializedName("Filters")
    @Expose
    private RequestFilter [] Filters;

    /**
    * Paginate the list of sorting criteria. Supported sorting fields: CreatedAt (creation time) and UpdatedAt (update time). By default, results are sorted by CreatedAt in descending order.
    */
    @SerializedName("Sorts")
    @Expose
    private RequestSort [] Sorts;

    /**
     * Get Package ID. You can obtain it through the DescribeTokenPlanList API. 
     * @return TeamId Package ID. You can obtain it through the DescribeTokenPlanList API.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Package ID. You can obtain it through the DescribeTokenPlanList API.
     * @param TeamId Package ID. You can obtain it through the DescribeTokenPlanList API.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Offset of paginated query. Default value: 0. 
     * @return Offset Offset of paginated query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of paginated query. Default value: 0.
     * @param Offset Offset of paginated query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results returned by paging query. Default value: 20. Maximum value: 100. 
     * @return Limit Number of results returned by paging query. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results returned by paging query. Default value: 20. Maximum value: 100.
     * @param Limit Number of results returned by paging query. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Paginate the list of query filter criteria. Supported filter fields: ApiKeyId (API Key ID), Name (API Key name), Status (whether the API Key is available), StopReason (reason for disabling the API Key), UseStatus (API Key user-side switch). 
     * @return Filters Paginate the list of query filter criteria. Supported filter fields: ApiKeyId (API Key ID), Name (API Key name), Status (whether the API Key is available), StopReason (reason for disabling the API Key), UseStatus (API Key user-side switch).
     */
    public RequestFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Paginate the list of query filter criteria. Supported filter fields: ApiKeyId (API Key ID), Name (API Key name), Status (whether the API Key is available), StopReason (reason for disabling the API Key), UseStatus (API Key user-side switch).
     * @param Filters Paginate the list of query filter criteria. Supported filter fields: ApiKeyId (API Key ID), Name (API Key name), Status (whether the API Key is available), StopReason (reason for disabling the API Key), UseStatus (API Key user-side switch).
     */
    public void setFilters(RequestFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Paginate the list of sorting criteria. Supported sorting fields: CreatedAt (creation time) and UpdatedAt (update time). By default, results are sorted by CreatedAt in descending order. 
     * @return Sorts Paginate the list of sorting criteria. Supported sorting fields: CreatedAt (creation time) and UpdatedAt (update time). By default, results are sorted by CreatedAt in descending order.
     */
    public RequestSort [] getSorts() {
        return this.Sorts;
    }

    /**
     * Set Paginate the list of sorting criteria. Supported sorting fields: CreatedAt (creation time) and UpdatedAt (update time). By default, results are sorted by CreatedAt in descending order.
     * @param Sorts Paginate the list of sorting criteria. Supported sorting fields: CreatedAt (creation time) and UpdatedAt (update time). By default, results are sorted by CreatedAt in descending order.
     */
    public void setSorts(RequestSort [] Sorts) {
        this.Sorts = Sorts;
    }

    public DescribeTokenPlanApiKeyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenPlanApiKeyListRequest(DescribeTokenPlanApiKeyListRequest source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new RequestFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RequestFilter(source.Filters[i]);
            }
        }
        if (source.Sorts != null) {
            this.Sorts = new RequestSort[source.Sorts.length];
            for (int i = 0; i < source.Sorts.length; i++) {
                this.Sorts[i] = new RequestSort(source.Sorts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Sorts.", this.Sorts);

    }
}

