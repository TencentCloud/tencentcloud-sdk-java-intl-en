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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * The name of the cluster ID for the search
    */
    @SerializedName("SearchInstanceId")
    @Expose
    private String SearchInstanceId;

    /**
    * The cluster name for the search
    */
    @SerializedName("SearchInstanceName")
    @Expose
    private String SearchInstanceName;

    /**
    * Pagination parameters. The first page is 0, and the second page is 10.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination parameters. The pagination step length is 10 by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Search tag list
    */
    @SerializedName("SearchTags")
    @Expose
    private SearchTags [] SearchTags;

    /**
     * Get The name of the cluster ID for the search 
     * @return SearchInstanceId The name of the cluster ID for the search
     */
    public String getSearchInstanceId() {
        return this.SearchInstanceId;
    }

    /**
     * Set The name of the cluster ID for the search
     * @param SearchInstanceId The name of the cluster ID for the search
     */
    public void setSearchInstanceId(String SearchInstanceId) {
        this.SearchInstanceId = SearchInstanceId;
    }

    /**
     * Get The cluster name for the search 
     * @return SearchInstanceName The cluster name for the search
     */
    public String getSearchInstanceName() {
        return this.SearchInstanceName;
    }

    /**
     * Set The cluster name for the search
     * @param SearchInstanceName The cluster name for the search
     */
    public void setSearchInstanceName(String SearchInstanceName) {
        this.SearchInstanceName = SearchInstanceName;
    }

    /**
     * Get Pagination parameters. The first page is 0, and the second page is 10. 
     * @return Offset Pagination parameters. The first page is 0, and the second page is 10.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameters. The first page is 0, and the second page is 10.
     * @param Offset Pagination parameters. The first page is 0, and the second page is 10.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination parameters. The pagination step length is 10 by default. 
     * @return Limit Pagination parameters. The pagination step length is 10 by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameters. The pagination step length is 10 by default.
     * @param Limit Pagination parameters. The pagination step length is 10 by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Search tag list 
     * @return SearchTags Search tag list
     */
    public SearchTags [] getSearchTags() {
        return this.SearchTags;
    }

    /**
     * Set Search tag list
     * @param SearchTags Search tag list
     */
    public void setSearchTags(SearchTags [] SearchTags) {
        this.SearchTags = SearchTags;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.SearchInstanceId != null) {
            this.SearchInstanceId = new String(source.SearchInstanceId);
        }
        if (source.SearchInstanceName != null) {
            this.SearchInstanceName = new String(source.SearchInstanceName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchTags != null) {
            this.SearchTags = new SearchTags[source.SearchTags.length];
            for (int i = 0; i < source.SearchTags.length; i++) {
                this.SearchTags[i] = new SearchTags(source.SearchTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchInstanceId", this.SearchInstanceId);
        this.setParamSimple(map, prefix + "SearchInstanceName", this.SearchInstanceName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "SearchTags.", this.SearchTags);

    }
}

