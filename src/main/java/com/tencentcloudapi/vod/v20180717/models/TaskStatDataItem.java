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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatDataItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

    /**
     * Get  
     * @return Time 
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 
     * @param Time 
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get  
     * @return Count 
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 
     * @param Count 
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get  
     * @return Usage 
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set 
     * @param Usage 
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

