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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpCodeValue extends AbstractModel {

    /**
    * Time in the format of `yyyy-mm-dd HH:MM:SS`.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Occurrences.
    */
    @SerializedName("Numbers")
    @Expose
    private Long Numbers;

    /**
    * Proportion.
    */
    @SerializedName("Percentage")
    @Expose
    private Float Percentage;

    /**
     * Get Time in the format of `yyyy-mm-dd HH:MM:SS`. 
     * @return Time Time in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time in the format of `yyyy-mm-dd HH:MM:SS`.
     * @param Time Time in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Occurrences. 
     * @return Numbers Occurrences.
     */
    public Long getNumbers() {
        return this.Numbers;
    }

    /**
     * Set Occurrences.
     * @param Numbers Occurrences.
     */
    public void setNumbers(Long Numbers) {
        this.Numbers = Numbers;
    }

    /**
     * Get Proportion. 
     * @return Percentage Proportion.
     */
    public Float getPercentage() {
        return this.Percentage;
    }

    /**
     * Set Proportion.
     * @param Percentage Proportion.
     */
    public void setPercentage(Float Percentage) {
        this.Percentage = Percentage;
    }

    public HttpCodeValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpCodeValue(HttpCodeValue source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Numbers != null) {
            this.Numbers = new Long(source.Numbers);
        }
        if (source.Percentage != null) {
            this.Percentage = new Float(source.Percentage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Numbers", this.Numbers);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);

    }
}

