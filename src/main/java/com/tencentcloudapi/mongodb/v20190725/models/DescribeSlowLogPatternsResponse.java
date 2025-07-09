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

public class DescribeSlowLogPatternsResponse extends AbstractModel {

    /**
    * Total number of slow logs
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Slow log statistics
    */
    @SerializedName("SlowLogPatterns")
    @Expose
    private SlowLogPattern [] SlowLogPatterns;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of slow logs 
     * @return Count Total number of slow logs
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Total number of slow logs
     * @param Count Total number of slow logs
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Slow log statistics 
     * @return SlowLogPatterns Slow log statistics
     */
    public SlowLogPattern [] getSlowLogPatterns() {
        return this.SlowLogPatterns;
    }

    /**
     * Set Slow log statistics
     * @param SlowLogPatterns Slow log statistics
     */
    public void setSlowLogPatterns(SlowLogPattern [] SlowLogPatterns) {
        this.SlowLogPatterns = SlowLogPatterns;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSlowLogPatternsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogPatternsResponse(DescribeSlowLogPatternsResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.SlowLogPatterns != null) {
            this.SlowLogPatterns = new SlowLogPattern[source.SlowLogPatterns.length];
            for (int i = 0; i < source.SlowLogPatterns.length; i++) {
                this.SlowLogPatterns[i] = new SlowLogPattern(source.SlowLogPatterns[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "SlowLogPatterns.", this.SlowLogPatterns);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

