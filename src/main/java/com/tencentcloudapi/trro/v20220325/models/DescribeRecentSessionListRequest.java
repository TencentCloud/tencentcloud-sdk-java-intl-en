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

public class DescribeRecentSessionListRequest extends AbstractModel {

    /**
    * Project id.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page number, beginning from 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of entries per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Device id, supports filtering by remote device or on-site device.
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Start time of the time range. the maximum time range is the last two hours. if not specified or out of range, the start time is calculated as two hours ago.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time of the time range. the maximum time range is the last two hours. if not specified or out of range, the end time is calculated as the current time.
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
     * Get Page number, beginning from 1. 
     * @return PageNumber Page number, beginning from 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, beginning from 1.
     * @param PageNumber Page number, beginning from 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of entries per page. 
     * @return PageSize Number of entries per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page.
     * @param PageSize Number of entries per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Device id, supports filtering by remote device or on-site device. 
     * @return DeviceId Device id, supports filtering by remote device or on-site device.
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device id, supports filtering by remote device or on-site device.
     * @param DeviceId Device id, supports filtering by remote device or on-site device.
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Start time of the time range. the maximum time range is the last two hours. if not specified or out of range, the start time is calculated as two hours ago. 
     * @return StartTime Start time of the time range. the maximum time range is the last two hours. if not specified or out of range, the start time is calculated as two hours ago.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the time range. the maximum time range is the last two hours. if not specified or out of range, the start time is calculated as two hours ago.
     * @param StartTime Start time of the time range. the maximum time range is the last two hours. if not specified or out of range, the start time is calculated as two hours ago.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the time range. the maximum time range is the last two hours. if not specified or out of range, the end time is calculated as the current time. 
     * @return EndTime End time of the time range. the maximum time range is the last two hours. if not specified or out of range, the end time is calculated as the current time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the time range. the maximum time range is the last two hours. if not specified or out of range, the end time is calculated as the current time.
     * @param EndTime End time of the time range. the maximum time range is the last two hours. if not specified or out of range, the end time is calculated as the current time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeRecentSessionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecentSessionListRequest(DescribeRecentSessionListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

