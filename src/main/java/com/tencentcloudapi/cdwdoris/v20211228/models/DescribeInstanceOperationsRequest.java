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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceOperationsRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Pagination parameter, offset, starting from 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination parameter, page size, default 10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Start Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Pagination parameter, offset, starting from 0 
     * @return Offset Pagination parameter, offset, starting from 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter, offset, starting from 0
     * @param Offset Pagination parameter, offset, starting from 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination parameter, page size, default 10 
     * @return Limit Pagination parameter, page size, default 10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameter, page size, default 10
     * @param Limit Pagination parameter, page size, default 10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Start Time 
     * @return StartTime Start Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start Time
     * @param StartTime Start Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End Time 
     * @return EndTime End Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End Time
     * @param EndTime End Time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeInstanceOperationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceOperationsRequest(DescribeInstanceOperationsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

