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

public class DescribeKBSummaryListRequest extends AbstractModel {

    /**
    * <p>Workspace ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Common filter</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>Page number, starting from 0</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Number of items per page. Default value: 10. Maximum value: 100.</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Keyword</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get <p>Workspace ID</p> 
     * @return SpaceId <p>Workspace ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Workspace ID</p>
     * @param SpaceId <p>Workspace ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Common filter</p> 
     * @return FilterList <p>Common filter</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>Common filter</p>
     * @param FilterList <p>Common filter</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>Page number, starting from 0</p> 
     * @return PageNumber <p>Page number, starting from 0</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number, starting from 0</p>
     * @param PageNumber <p>Page number, starting from 0</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Number of items per page. Default value: 10. Maximum value: 100.</p> 
     * @return PageSize <p>Number of items per page. Default value: 10. Maximum value: 100.</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Number of items per page. Default value: 10. Maximum value: 100.</p>
     * @param PageSize <p>Number of items per page. Default value: 10. Maximum value: 100.</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Keyword</p> 
     * @return Query <p>Keyword</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Keyword</p>
     * @param Query <p>Keyword</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public DescribeKBSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKBSummaryListRequest(DescribeKBSummaryListRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

