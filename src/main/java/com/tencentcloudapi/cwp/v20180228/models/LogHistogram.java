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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogHistogram extends AbstractModel {

    /**
    * Number of logs within the statistical period
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Unix timestamp rounded by period, in ms
    */
    @SerializedName("TimeStamp")
    @Expose
    private Long TimeStamp;

    /**
     * Get Number of logs within the statistical period 
     * @return Count Number of logs within the statistical period
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of logs within the statistical period
     * @param Count Number of logs within the statistical period
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Unix timestamp rounded by period, in ms 
     * @return TimeStamp Unix timestamp rounded by period, in ms
     */
    public Long getTimeStamp() {
        return this.TimeStamp;
    }

    /**
     * Set Unix timestamp rounded by period, in ms
     * @param TimeStamp Unix timestamp rounded by period, in ms
     */
    public void setTimeStamp(Long TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public LogHistogram() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogHistogram(LogHistogram source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.TimeStamp != null) {
            this.TimeStamp = new Long(source.TimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "TimeStamp", this.TimeStamp);

    }
}

