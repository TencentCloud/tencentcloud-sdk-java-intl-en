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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkQueriesRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Starting offset for pages, starting from 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page size. Valid range: [1,100].
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Execution status: RUNNING,COMPLETED, FAILED.
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Starting offset for pages, starting from 0. 
     * @return Offset Starting offset for pages, starting from 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset for pages, starting from 0.
     * @param Offset Starting offset for pages, starting from 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page size. Valid range: [1,100]. 
     * @return Limit Page size. Valid range: [1,100].
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page size. Valid range: [1,100].
     * @param Limit Page size. Valid range: [1,100].
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Execution status: RUNNING,COMPLETED, FAILED. 
     * @return Status Execution status: RUNNING,COMPLETED, FAILED.
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set Execution status: RUNNING,COMPLETED, FAILED.
     * @param Status Execution status: RUNNING,COMPLETED, FAILED.
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    public DescribeSparkQueriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkQueriesRequest(DescribeSparkQueriesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

