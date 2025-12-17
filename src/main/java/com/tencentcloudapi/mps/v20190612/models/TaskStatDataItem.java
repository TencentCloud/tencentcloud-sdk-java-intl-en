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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatDataItem extends AbstractModel {

    /**
    * Start time of the time interval where the data resides. Use the [ISO date and time format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 indicates the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Number of tasks.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Task usage.
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

    /**
     * Get Start time of the time interval where the data resides. Use the [ISO date and time format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 indicates the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive). 
     * @return Time Start time of the time interval where the data resides. Use the [ISO date and time format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 indicates the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Start time of the time interval where the data resides. Use the [ISO date and time format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 indicates the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
     * @param Time Start time of the time interval where the data resides. Use the [ISO date and time format](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). For example, when the time granularity is day, 2018-12-01T00:00:00+08:00 indicates the interval from December 1, 2018 (inclusive) to December 2, 2018 (exclusive).
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Number of tasks. 
     * @return Count Number of tasks.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of tasks.
     * @param Count Number of tasks.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Task usage. 
     * @return Usage Task usage.
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set Task usage.
     * @param Usage Task usage.
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    public TaskStatDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatDataItem(TaskStatDataItem source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Usage", this.Usage);

    }
}

