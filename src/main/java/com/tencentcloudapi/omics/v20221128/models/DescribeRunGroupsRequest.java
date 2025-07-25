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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRunGroupsRequest extends AbstractModel {

    /**
    * Project ID
(If you leave it blank, the default item in the specified region will be used.)
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Quantity of returns. It is 10 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which defaults to 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter, which supports filtering fields:
- Name: Run group name
- RunGroupId: Run group ID
- Status: Run group status
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Project ID
(If you leave it blank, the default item in the specified region will be used.) 
     * @return ProjectId Project ID
(If you leave it blank, the default item in the specified region will be used.)
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
(If you leave it blank, the default item in the specified region will be used.)
     * @param ProjectId Project ID
(If you leave it blank, the default item in the specified region will be used.)
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Quantity of returns. It is 10 by default, and the maximum value is 100. 
     * @return Limit Quantity of returns. It is 10 by default, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity of returns. It is 10 by default, and the maximum value is 100.
     * @param Limit Quantity of returns. It is 10 by default, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which defaults to 0. 
     * @return Offset Offset, which defaults to 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which defaults to 0.
     * @param Offset Offset, which defaults to 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter, which supports filtering fields:
- Name: Run group name
- RunGroupId: Run group ID
- Status: Run group status 
     * @return Filters Filter, which supports filtering fields:
- Name: Run group name
- RunGroupId: Run group ID
- Status: Run group status
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter, which supports filtering fields:
- Name: Run group name
- RunGroupId: Run group ID
- Status: Run group status
     * @param Filters Filter, which supports filtering fields:
- Name: Run group name
- RunGroupId: Run group ID
- Status: Run group status
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRunGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRunGroupsRequest(DescribeRunGroupsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

