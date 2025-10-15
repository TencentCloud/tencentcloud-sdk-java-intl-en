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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataBackfillRange extends AbstractModel {

    /**
    * Start date in yyyy-MM-dd format. indicates the start from 00:00:00 on the specified date.

    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * End date in the format yyyy-MM-dd, indicates ending at 23:59:59 of the specified date.

    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * Start time of each day between [StartDate, EndDate] in HH:mm format. effective for tasks with a period of hours or less.

    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * End time point between [StartDate, EndDate] in HH:mm format. effective for tasks with a period of hours or less.

    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
     * Get Start date in yyyy-MM-dd format. indicates the start from 00:00:00 on the specified date.
 
     * @return StartDate Start date in yyyy-MM-dd format. indicates the start from 00:00:00 on the specified date.

     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set Start date in yyyy-MM-dd format. indicates the start from 00:00:00 on the specified date.

     * @param StartDate Start date in yyyy-MM-dd format. indicates the start from 00:00:00 on the specified date.

     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get End date in the format yyyy-MM-dd, indicates ending at 23:59:59 of the specified date.
 
     * @return EndDate End date in the format yyyy-MM-dd, indicates ending at 23:59:59 of the specified date.

     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set End date in the format yyyy-MM-dd, indicates ending at 23:59:59 of the specified date.

     * @param EndDate End date in the format yyyy-MM-dd, indicates ending at 23:59:59 of the specified date.

     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get Start time of each day between [StartDate, EndDate] in HH:mm format. effective for tasks with a period of hours or less.
 
     * @return ExecutionStartTime Start time of each day between [StartDate, EndDate] in HH:mm format. effective for tasks with a period of hours or less.

     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Start time of each day between [StartDate, EndDate] in HH:mm format. effective for tasks with a period of hours or less.

     * @param ExecutionStartTime Start time of each day between [StartDate, EndDate] in HH:mm format. effective for tasks with a period of hours or less.

     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get End time point between [StartDate, EndDate] in HH:mm format. effective for tasks with a period of hours or less.
 
     * @return ExecutionEndTime End time point between [StartDate, EndDate] in HH:mm format. effective for tasks with a period of hours or less.

     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set End time point between [StartDate, EndDate] in HH:mm format. effective for tasks with a period of hours or less.

     * @param ExecutionEndTime End time point between [StartDate, EndDate] in HH:mm format. effective for tasks with a period of hours or less.

     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    public DataBackfillRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataBackfillRange(DataBackfillRange source) {
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);

    }
}

