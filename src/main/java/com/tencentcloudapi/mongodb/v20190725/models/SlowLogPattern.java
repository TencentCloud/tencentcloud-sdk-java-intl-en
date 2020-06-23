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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogPattern extends AbstractModel{

    /**
    * Slow log pattern
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * Maximum execution time
    */
    @SerializedName("MaxTime")
    @Expose
    private Long MaxTime;

    /**
    * Average execution time
    */
    @SerializedName("AverageTime")
    @Expose
    private Long AverageTime;

    /**
    * Number of slow logs in this pattern
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get Slow log pattern 
     * @return Pattern Slow log pattern
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Slow log pattern
     * @param Pattern Slow log pattern
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get Maximum execution time 
     * @return MaxTime Maximum execution time
     */
    public Long getMaxTime() {
        return this.MaxTime;
    }

    /**
     * Set Maximum execution time
     * @param MaxTime Maximum execution time
     */
    public void setMaxTime(Long MaxTime) {
        this.MaxTime = MaxTime;
    }

    /**
     * Get Average execution time 
     * @return AverageTime Average execution time
     */
    public Long getAverageTime() {
        return this.AverageTime;
    }

    /**
     * Set Average execution time
     * @param AverageTime Average execution time
     */
    public void setAverageTime(Long AverageTime) {
        this.AverageTime = AverageTime;
    }

    /**
     * Get Number of slow logs in this pattern 
     * @return Total Number of slow logs in this pattern
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Number of slow logs in this pattern
     * @param Total Number of slow logs in this pattern
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "MaxTime", this.MaxTime);
        this.setParamSimple(map, prefix + "AverageTime", this.AverageTime);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

