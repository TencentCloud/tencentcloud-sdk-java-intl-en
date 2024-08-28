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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseBindScheduleRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Limit number, 10 by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter parameters
Status - binding progress status. 0 - in progress; 1 - completed; 2 - failed
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Limit number, 10 by default. 
     * @return Limit Limit number, 10 by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit number, 10 by default.
     * @param Limit Limit number, 10 by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is 0 by default. 
     * @return Offset Offset, which is 0 by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is 0 by default.
     * @param Offset Offset, which is 0 by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter parameters
Status - binding progress status. 0 - in progress; 1 - completed; 2 - failed 
     * @return Filters Filter parameters
Status - binding progress status. 0 - in progress; 1 - completed; 2 - failed
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters
Status - binding progress status. 0 - in progress; 1 - completed; 2 - failed
     * @param Filters Filter parameters
Status - binding progress status. 0 - in progress; 1 - completed; 2 - failed
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeLicenseBindScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseBindScheduleRequest(DescribeLicenseBindScheduleRequest source) {
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

