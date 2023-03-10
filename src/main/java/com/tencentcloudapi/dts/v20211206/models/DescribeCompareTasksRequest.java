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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCompareTasksRequest extends AbstractModel{

    /**
    * Migration task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Number of tasks to be displayed per page. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Check task ID
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * Data consistency check task status. Valid values: `created`, `readyRun`, `running`, `success`, `stopping`, `failed`, `canceled`.
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
     * Get Migration task ID 
     * @return JobId Migration task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Migration task ID
     * @param JobId Migration task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Number of tasks to be displayed per page. Default value: `20`. 
     * @return Limit Number of tasks to be displayed per page. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of tasks to be displayed per page. Default value: `20`.
     * @param Limit Number of tasks to be displayed per page. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Check task ID 
     * @return CompareTaskId Check task ID
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set Check task ID
     * @param CompareTaskId Check task ID
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get Data consistency check task status. Valid values: `created`, `readyRun`, `running`, `success`, `stopping`, `failed`, `canceled`. 
     * @return Status Data consistency check task status. Valid values: `created`, `readyRun`, `running`, `success`, `stopping`, `failed`, `canceled`.
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set Data consistency check task status. Valid values: `created`, `readyRun`, `running`, `success`, `stopping`, `failed`, `canceled`.
     * @param Status Data consistency check task status. Valid values: `created`, `readyRun`, `running`, `success`, `stopping`, `failed`, `canceled`.
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    public DescribeCompareTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompareTasksRequest(DescribeCompareTasksRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

