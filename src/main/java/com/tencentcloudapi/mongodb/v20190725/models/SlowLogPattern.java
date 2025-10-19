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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogPattern extends AbstractModel {

    /**
    * Slow log output format: database name.table name.command.
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * queryHash value carried during slow log recording. It can be used to identify a query type.
    */
    @SerializedName("QueryHash")
    @Expose
    private String QueryHash;

    /**
    * Maximum execution time, in milliseconds.
    */
    @SerializedName("MaxTime")
    @Expose
    private Long MaxTime;

    /**
    * Average execution time, in milliseconds.
    */
    @SerializedName("AverageTime")
    @Expose
    private Long AverageTime;

    /**
    * Number of slow logs.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get Slow log output format: database name.table name.command. 
     * @return Pattern Slow log output format: database name.table name.command.
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Slow log output format: database name.table name.command.
     * @param Pattern Slow log output format: database name.table name.command.
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get queryHash value carried during slow log recording. It can be used to identify a query type. 
     * @return QueryHash queryHash value carried during slow log recording. It can be used to identify a query type.
     */
    public String getQueryHash() {
        return this.QueryHash;
    }

    /**
     * Set queryHash value carried during slow log recording. It can be used to identify a query type.
     * @param QueryHash queryHash value carried during slow log recording. It can be used to identify a query type.
     */
    public void setQueryHash(String QueryHash) {
        this.QueryHash = QueryHash;
    }

    /**
     * Get Maximum execution time, in milliseconds. 
     * @return MaxTime Maximum execution time, in milliseconds.
     */
    public Long getMaxTime() {
        return this.MaxTime;
    }

    /**
     * Set Maximum execution time, in milliseconds.
     * @param MaxTime Maximum execution time, in milliseconds.
     */
    public void setMaxTime(Long MaxTime) {
        this.MaxTime = MaxTime;
    }

    /**
     * Get Average execution time, in milliseconds. 
     * @return AverageTime Average execution time, in milliseconds.
     */
    public Long getAverageTime() {
        return this.AverageTime;
    }

    /**
     * Set Average execution time, in milliseconds.
     * @param AverageTime Average execution time, in milliseconds.
     */
    public void setAverageTime(Long AverageTime) {
        this.AverageTime = AverageTime;
    }

    /**
     * Get Number of slow logs. 
     * @return Total Number of slow logs.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Number of slow logs.
     * @param Total Number of slow logs.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public SlowLogPattern() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogPattern(SlowLogPattern source) {
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.QueryHash != null) {
            this.QueryHash = new String(source.QueryHash);
        }
        if (source.MaxTime != null) {
            this.MaxTime = new Long(source.MaxTime);
        }
        if (source.AverageTime != null) {
            this.AverageTime = new Long(source.AverageTime);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "QueryHash", this.QueryHash);
        this.setParamSimple(map, prefix + "MaxTime", this.MaxTime);
        this.setParamSimple(map, prefix + "AverageTime", this.AverageTime);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

