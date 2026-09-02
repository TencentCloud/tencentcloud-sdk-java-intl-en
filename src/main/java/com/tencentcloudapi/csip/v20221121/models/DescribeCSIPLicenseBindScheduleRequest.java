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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCSIPLicenseBindScheduleRequest extends AbstractModel {

    /**
    * <p>Returned task ID of ModifyCSIPLicenseBinds</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>Pagination size. Default value: 10.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Pagination offset</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Filter criteria, support filtering by Status (0-Initialization 1-Successful 2-Failed 3-Skipped)</p>
    */
    @SerializedName("Filters")
    @Expose
    private LicenseBindFilter [] Filters;

    /**
     * Get <p>Returned task ID of ModifyCSIPLicenseBinds</p> 
     * @return TaskId <p>Returned task ID of ModifyCSIPLicenseBinds</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Returned task ID of ModifyCSIPLicenseBinds</p>
     * @param TaskId <p>Returned task ID of ModifyCSIPLicenseBinds</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Pagination size. Default value: 10.</p> 
     * @return Limit <p>Pagination size. Default value: 10.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Pagination size. Default value: 10.</p>
     * @param Limit <p>Pagination size. Default value: 10.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Pagination offset</p> 
     * @return Offset <p>Pagination offset</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset</p>
     * @param Offset <p>Pagination offset</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Filter criteria, support filtering by Status (0-Initialization 1-Successful 2-Failed 3-Skipped)</p> 
     * @return Filters <p>Filter criteria, support filtering by Status (0-Initialization 1-Successful 2-Failed 3-Skipped)</p>
     */
    public LicenseBindFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria, support filtering by Status (0-Initialization 1-Successful 2-Failed 3-Skipped)</p>
     * @param Filters <p>Filter criteria, support filtering by Status (0-Initialization 1-Successful 2-Failed 3-Skipped)</p>
     */
    public void setFilters(LicenseBindFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCSIPLicenseBindScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCSIPLicenseBindScheduleRequest(DescribeCSIPLicenseBindScheduleRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new LicenseBindFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new LicenseBindFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

