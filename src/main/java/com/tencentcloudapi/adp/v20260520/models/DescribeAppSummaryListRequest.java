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

public class DescribeAppSummaryListRequest extends AbstractModel {

    /**
    * Space ID (required)
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * Filter criteria (multiple filters are in an AND relationship with each other, AND multiple Values of the same Filter are in an OR relationship): - AppStatus: APP STATUS, enumeration value, exact match (APP_STATUS_OFFLINE=1/APP_STATUS_RUNNING=2/APP_STATUS_DISABLED=3) - AppMode: application MODE, enumeration value, exact match (APP_MODE_STANDARD=1/APP_MODE_AGENT=2/APP_MODE_SINGLE_WORKFLOW=3/APP_MODE_CLAW_AGENT=4)
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * Page number, starting from 0.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page. Maximum: 100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Fuzzy query
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get Space ID (required) 
     * @return SpaceId Space ID (required)
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set Space ID (required)
     * @param SpaceId Space ID (required)
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get Filter criteria (multiple filters are in an AND relationship with each other, AND multiple Values of the same Filter are in an OR relationship): - AppStatus: APP STATUS, enumeration value, exact match (APP_STATUS_OFFLINE=1/APP_STATUS_RUNNING=2/APP_STATUS_DISABLED=3) - AppMode: application MODE, enumeration value, exact match (APP_MODE_STANDARD=1/APP_MODE_AGENT=2/APP_MODE_SINGLE_WORKFLOW=3/APP_MODE_CLAW_AGENT=4) 
     * @return FilterList Filter criteria (multiple filters are in an AND relationship with each other, AND multiple Values of the same Filter are in an OR relationship): - AppStatus: APP STATUS, enumeration value, exact match (APP_STATUS_OFFLINE=1/APP_STATUS_RUNNING=2/APP_STATUS_DISABLED=3) - AppMode: application MODE, enumeration value, exact match (APP_MODE_STANDARD=1/APP_MODE_AGENT=2/APP_MODE_SINGLE_WORKFLOW=3/APP_MODE_CLAW_AGENT=4)
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set Filter criteria (multiple filters are in an AND relationship with each other, AND multiple Values of the same Filter are in an OR relationship): - AppStatus: APP STATUS, enumeration value, exact match (APP_STATUS_OFFLINE=1/APP_STATUS_RUNNING=2/APP_STATUS_DISABLED=3) - AppMode: application MODE, enumeration value, exact match (APP_MODE_STANDARD=1/APP_MODE_AGENT=2/APP_MODE_SINGLE_WORKFLOW=3/APP_MODE_CLAW_AGENT=4)
     * @param FilterList Filter criteria (multiple filters are in an AND relationship with each other, AND multiple Values of the same Filter are in an OR relationship): - AppStatus: APP STATUS, enumeration value, exact match (APP_STATUS_OFFLINE=1/APP_STATUS_RUNNING=2/APP_STATUS_DISABLED=3) - AppMode: application MODE, enumeration value, exact match (APP_MODE_STANDARD=1/APP_MODE_AGENT=2/APP_MODE_SINGLE_WORKFLOW=3/APP_MODE_CLAW_AGENT=4)
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get Page number, starting from 0. 
     * @return PageNumber Page number, starting from 0.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, starting from 0.
     * @param PageNumber Page number, starting from 0.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page. Maximum: 100. 
     * @return PageSize Number of items per page. Maximum: 100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page. Maximum: 100.
     * @param PageSize Number of items per page. Maximum: 100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Fuzzy query 
     * @return Query Fuzzy query
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Fuzzy query
     * @param Query Fuzzy query
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public DescribeAppSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppSummaryListRequest(DescribeAppSummaryListRequest source) {
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

