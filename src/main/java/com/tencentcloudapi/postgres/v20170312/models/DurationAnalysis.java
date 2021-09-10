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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DurationAnalysis extends AbstractModel{

    /**
    * Time range
    */
    @SerializedName("TimeSegment")
    @Expose
    private String TimeSegment;

    /**
    * The number of slow query statements whose execution time falls within the time range
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Time range 
     * @return TimeSegment Time range
     */
    public String getTimeSegment() {
        return this.TimeSegment;
    }

    /**
     * Set Time range
     * @param TimeSegment Time range
     */
    public void setTimeSegment(String TimeSegment) {
        this.TimeSegment = TimeSegment;
    }

    /**
     * Get The number of slow query statements whose execution time falls within the time range 
     * @return Count The number of slow query statements whose execution time falls within the time range
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of slow query statements whose execution time falls within the time range
     * @param Count The number of slow query statements whose execution time falls within the time range
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public DurationAnalysis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DurationAnalysis(DurationAnalysis source) {
        if (source.TimeSegment != null) {
            this.TimeSegment = new String(source.TimeSegment);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSegment", this.TimeSegment);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

