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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticInfo extends AbstractModel {

    /**
    * Task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Amount of data scanned
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalProcessedBytes")
    @Expose
    private Long TotalProcessedBytes;

    /**
    * Calculation time: ms
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsedTime")
    @Expose
    private Long UsedTime;

    /**
    * Creation Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Task end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Task start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Number of rows affected
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RowsAffect")
    @Expose
    private Long RowsAffect;

    /**
    * Task duration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
     * Get Task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Amount of data scanned
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalProcessedBytes Amount of data scanned
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalProcessedBytes() {
        return this.TotalProcessedBytes;
    }

    /**
     * Set Amount of data scanned
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalProcessedBytes Amount of data scanned
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalProcessedBytes(Long TotalProcessedBytes) {
        this.TotalProcessedBytes = TotalProcessedBytes;
    }

    /**
     * Get Calculation time: ms
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UsedTime Calculation time: ms
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set Calculation time: ms
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UsedTime Calculation time: ms
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsedTime(Long UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get Creation Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Task end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Task start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Task start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Number of rows affected
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RowsAffect Number of rows affected
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRowsAffect() {
        return this.RowsAffect;
    }

    /**
     * Set Number of rows affected
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RowsAffect Number of rows affected
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRowsAffect(Long RowsAffect) {
        this.RowsAffect = RowsAffect;
    }

    /**
     * Get Task duration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalTime Task duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set Task duration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalTime Task duration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    public StatisticInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticInfo(StatisticInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TotalProcessedBytes != null) {
            this.TotalProcessedBytes = new Long(source.TotalProcessedBytes);
        }
        if (source.UsedTime != null) {
            this.UsedTime = new Long(source.UsedTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.RowsAffect != null) {
            this.RowsAffect = new Long(source.RowsAffect);
        }
        if (source.TotalTime != null) {
            this.TotalTime = new Long(source.TotalTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TotalProcessedBytes", this.TotalProcessedBytes);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RowsAffect", this.RowsAffect);
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);

    }
}

