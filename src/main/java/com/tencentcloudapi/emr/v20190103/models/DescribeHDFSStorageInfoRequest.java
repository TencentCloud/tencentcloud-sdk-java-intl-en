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

public class DescribeHDFSStorageInfoRequest extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Query information obtainment start time (seconds).
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query information obtainment end time (seconds).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

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
     * Get Query information obtainment start time (seconds). 
     * @return StartTime Query information obtainment start time (seconds).
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query information obtainment start time (seconds).
     * @param StartTime Query information obtainment start time (seconds).
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query information obtainment end time (seconds). 
     * @return EndTime Query information obtainment end time (seconds).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query information obtainment end time (seconds).
     * @param EndTime Query information obtainment end time (seconds).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeHDFSStorageInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHDFSStorageInfoRequest(DescribeHDFSStorageInfoRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

