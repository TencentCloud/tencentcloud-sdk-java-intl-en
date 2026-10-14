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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceOperationsRequest extends AbstractModel {

    /**
    * Cluster instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time, e.g., "2019-03-07 16:30:39"
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, e.g., "2019-03-30 20:18:03"
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Paging Starting Value
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination size.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Cluster instance ID. 
     * @return InstanceId Cluster instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID.
     * @param InstanceId Cluster instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time, e.g., "2019-03-07 16:30:39" 
     * @return StartTime Start time, e.g., "2019-03-07 16:30:39"
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, e.g., "2019-03-07 16:30:39"
     * @param StartTime Start time, e.g., "2019-03-07 16:30:39"
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, e.g., "2019-03-30 20:18:03" 
     * @return EndTime End time, e.g., "2019-03-30 20:18:03"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, e.g., "2019-03-30 20:18:03"
     * @param EndTime End time, e.g., "2019-03-30 20:18:03"
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Paging Starting Value 
     * @return Offset Paging Starting Value
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging Starting Value
     * @param Offset Paging Starting Value
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination size. 
     * @return Limit Pagination size.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination size.
     * @param Limit Pagination size.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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

    }
}

