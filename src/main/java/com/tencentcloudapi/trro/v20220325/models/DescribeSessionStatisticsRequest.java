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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSessionStatisticsRequest extends AbstractModel {

    /**
    * Project id.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Device id.
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Start time, unit: seconds.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time in seconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Project id. 
     * @return ProjectId Project id.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project id.
     * @param ProjectId Project id.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Device id. 
     * @return DeviceId Device id.
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device id.
     * @param DeviceId Device id.
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Start time, unit: seconds. 
     * @return StartTime Start time, unit: seconds.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, unit: seconds.
     * @param StartTime Start time, unit: seconds.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in seconds. 
     * @return EndTime End time in seconds.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in seconds.
     * @param EndTime End time in seconds.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeSessionStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionStatisticsRequest(DescribeSessionStatisticsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

