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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBDiagEventsRequest extends AbstractModel {

    /**
    * Start time in the format of “2021-05-27 00:00:00”. The earliest time that can be queried is 30 days before the current time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in the format of "2021-05-27 01:00:00". The interval between the end time and the start time can be up to 7 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Risk level list. Valid values in descending order of severity: `1` (critical), `2` (serious), `3` (alarm), `4` (warning), `5` (healthy).
    */
    @SerializedName("Severities")
    @Expose
    private Long [] Severities;

    /**
    * Instance ID list.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 50.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Start time in the format of “2021-05-27 00:00:00”. The earliest time that can be queried is 30 days before the current time. 
     * @return StartTime Start time in the format of “2021-05-27 00:00:00”. The earliest time that can be queried is 30 days before the current time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in the format of “2021-05-27 00:00:00”. The earliest time that can be queried is 30 days before the current time.
     * @param StartTime Start time in the format of “2021-05-27 00:00:00”. The earliest time that can be queried is 30 days before the current time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in the format of "2021-05-27 01:00:00". The interval between the end time and the start time can be up to 7 days. 
     * @return EndTime End time in the format of "2021-05-27 01:00:00". The interval between the end time and the start time can be up to 7 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of "2021-05-27 01:00:00". The interval between the end time and the start time can be up to 7 days.
     * @param EndTime End time in the format of "2021-05-27 01:00:00". The interval between the end time and the start time can be up to 7 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Risk level list. Valid values in descending order of severity: `1` (critical), `2` (serious), `3` (alarm), `4` (warning), `5` (healthy). 
     * @return Severities Risk level list. Valid values in descending order of severity: `1` (critical), `2` (serious), `3` (alarm), `4` (warning), `5` (healthy).
     */
    public Long [] getSeverities() {
        return this.Severities;
    }

    /**
     * Set Risk level list. Valid values in descending order of severity: `1` (critical), `2` (serious), `3` (alarm), `4` (warning), `5` (healthy).
     * @param Severities Risk level list. Valid values in descending order of severity: `1` (critical), `2` (serious), `3` (alarm), `4` (warning), `5` (healthy).
     */
    public void setSeverities(Long [] Severities) {
        this.Severities = Severities;
    }

    /**
     * Get Instance ID list. 
     * @return InstanceIds Instance ID list.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list.
     * @param InstanceIds Instance ID list.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 50. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 50.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 50.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 50.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDBDiagEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBDiagEventsRequest(DescribeDBDiagEventsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Severities != null) {
            this.Severities = new Long[source.Severities.length];
            for (int i = 0; i < source.Severities.length; i++) {
                this.Severities[i] = new Long(source.Severities[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Severities.", this.Severities);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

