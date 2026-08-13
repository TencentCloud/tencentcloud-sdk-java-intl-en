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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAigcTaskListRequest extends AbstractModel {

    /**
    * <p>Query page started</p>
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * <p>How many data to get on the current page</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Query filter criteria</p>
    */
    @SerializedName("QueryTaskFilter")
    @Expose
    private QueryTaskFilter QueryTaskFilter;

    /**
     * Get <p>Query page started</p> 
     * @return PageNum <p>Query page started</p>
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>Query page started</p>
     * @param PageNum <p>Query page started</p>
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get <p>How many data to get on the current page</p> 
     * @return PageSize <p>How many data to get on the current page</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>How many data to get on the current page</p>
     * @param PageSize <p>How many data to get on the current page</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Query filter criteria</p> 
     * @return QueryTaskFilter <p>Query filter criteria</p>
     */
    public QueryTaskFilter getQueryTaskFilter() {
        return this.QueryTaskFilter;
    }

    /**
     * Set <p>Query filter criteria</p>
     * @param QueryTaskFilter <p>Query filter criteria</p>
     */
    public void setQueryTaskFilter(QueryTaskFilter QueryTaskFilter) {
        this.QueryTaskFilter = QueryTaskFilter;
    }

    public DescribeAigcTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcTaskListRequest(DescribeAigcTaskListRequest source) {
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.QueryTaskFilter != null) {
            this.QueryTaskFilter = new QueryTaskFilter(source.QueryTaskFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamObj(map, prefix + "QueryTaskFilter.", this.QueryTaskFilter);

    }
}

