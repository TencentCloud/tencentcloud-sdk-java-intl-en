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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentReleasePreviewListRequest extends AbstractModel {

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Page number.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Number of items per page: between 1 and 200</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Query keyword, used for fuzzy matching of heading</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>Filter criteria</p><p>Input parameter limits: supports StartTime, EndTime, ActionList, ReleaseStatusList</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
     * Get <p>Application ID.</p> 
     * @return AppId <p>Application ID.</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID.</p>
     * @param AppId <p>Application ID.</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Page number.</p> 
     * @return PageNumber <p>Page number.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number.</p>
     * @param PageNumber <p>Page number.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Number of items per page: between 1 and 200</p> 
     * @return PageSize <p>Number of items per page: between 1 and 200</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Number of items per page: between 1 and 200</p>
     * @param PageSize <p>Number of items per page: between 1 and 200</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Query keyword, used for fuzzy matching of heading</p> 
     * @return Query <p>Query keyword, used for fuzzy matching of heading</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Query keyword, used for fuzzy matching of heading</p>
     * @param Query <p>Query keyword, used for fuzzy matching of heading</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>Filter criteria</p><p>Input parameter limits: supports StartTime, EndTime, ActionList, ReleaseStatusList</p> 
     * @return FilterList <p>Filter criteria</p><p>Input parameter limits: supports StartTime, EndTime, ActionList, ReleaseStatusList</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>Filter criteria</p><p>Input parameter limits: supports StartTime, EndTime, ActionList, ReleaseStatusList</p>
     * @param FilterList <p>Filter criteria</p><p>Input parameter limits: supports StartTime, EndTime, ActionList, ReleaseStatusList</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    public DescribeAgentReleasePreviewListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentReleasePreviewListRequest(DescribeAgentReleasePreviewListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);

    }
}

