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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeSlice extends AbstractModel {

    /**
    * Total number
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Statistics start time
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
     * Get Total number 
     * @return Count Total number
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Total number
     * @param Count Total number
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Statistics start time 
     * @return Timestamp Statistics start time
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Statistics start time
     * @param Timestamp Statistics start time
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    public TimeSlice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeSlice(TimeSlice source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

