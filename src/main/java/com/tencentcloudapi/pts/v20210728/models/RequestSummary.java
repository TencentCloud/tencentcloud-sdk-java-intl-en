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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestSummary extends AbstractModel {

    /**
    * Request URL.
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Request method.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Number of requests.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Average request response time (seconds).
    */
    @SerializedName("Average")
    @Expose
    private Float Average;

    /**
    * Request p90 latency (seconds).
    */
    @SerializedName("P90")
    @Expose
    private Float P90;

    /**
    * Request p95 latency (seconds).
    */
    @SerializedName("P95")
    @Expose
    private Float P95;

    /**
    * Minimum request latency (seconds).
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * Maximum request latency (seconds).
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * Request error rate.
    */
    @SerializedName("ErrorPercentage")
    @Expose
    private Float ErrorPercentage;

    /**
    * Request p99 latency (seconds).
    */
    @SerializedName("P99")
    @Expose
    private Float P99;

    /**
    * Response status code.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Response details.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Request per seconds, unit req/s.
    */
    @SerializedName("RPS")
    @Expose
    private Float RPS;

    /**
     * Get Request URL. 
     * @return Service Request URL.
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Request URL.
     * @param Service Request URL.
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Request method. 
     * @return Method Request method.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Request method.
     * @param Method Request method.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Number of requests. 
     * @return Count Number of requests.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of requests.
     * @param Count Number of requests.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Average request response time (seconds). 
     * @return Average Average request response time (seconds).
     */
    public Float getAverage() {
        return this.Average;
    }

    /**
     * Set Average request response time (seconds).
     * @param Average Average request response time (seconds).
     */
    public void setAverage(Float Average) {
        this.Average = Average;
    }

    /**
     * Get Request p90 latency (seconds). 
     * @return P90 Request p90 latency (seconds).
     */
    public Float getP90() {
        return this.P90;
    }

    /**
     * Set Request p90 latency (seconds).
     * @param P90 Request p90 latency (seconds).
     */
    public void setP90(Float P90) {
        this.P90 = P90;
    }

    /**
     * Get Request p95 latency (seconds). 
     * @return P95 Request p95 latency (seconds).
     */
    public Float getP95() {
        return this.P95;
    }

    /**
     * Set Request p95 latency (seconds).
     * @param P95 Request p95 latency (seconds).
     */
    public void setP95(Float P95) {
        this.P95 = P95;
    }

    /**
     * Get Minimum request latency (seconds). 
     * @return Min Minimum request latency (seconds).
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set Minimum request latency (seconds).
     * @param Min Minimum request latency (seconds).
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get Maximum request latency (seconds). 
     * @return Max Maximum request latency (seconds).
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set Maximum request latency (seconds).
     * @param Max Maximum request latency (seconds).
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get Request error rate. 
     * @return ErrorPercentage Request error rate.
     */
    public Float getErrorPercentage() {
        return this.ErrorPercentage;
    }

    /**
     * Set Request error rate.
     * @param ErrorPercentage Request error rate.
     */
    public void setErrorPercentage(Float ErrorPercentage) {
        this.ErrorPercentage = ErrorPercentage;
    }

    /**
     * Get Request p99 latency (seconds). 
     * @return P99 Request p99 latency (seconds).
     */
    public Float getP99() {
        return this.P99;
    }

    /**
     * Set Request p99 latency (seconds).
     * @param P99 Request p99 latency (seconds).
     */
    public void setP99(Float P99) {
        this.P99 = P99;
    }

    /**
     * Get Response status code. 
     * @return Status Response status code.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Response status code.
     * @param Status Response status code.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Response details. 
     * @return Result Response details.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Response details.
     * @param Result Response details.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Request per seconds, unit req/s. 
     * @return RPS Request per seconds, unit req/s.
     */
    public Float getRPS() {
        return this.RPS;
    }

    /**
     * Set Request per seconds, unit req/s.
     * @param RPS Request per seconds, unit req/s.
     */
    public void setRPS(Float RPS) {
        this.RPS = RPS;
    }

    public RequestSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestSummary(RequestSummary source) {
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Average != null) {
            this.Average = new Float(source.Average);
        }
        if (source.P90 != null) {
            this.P90 = new Float(source.P90);
        }
        if (source.P95 != null) {
            this.P95 = new Float(source.P95);
        }
        if (source.Min != null) {
            this.Min = new Float(source.Min);
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
        if (source.ErrorPercentage != null) {
            this.ErrorPercentage = new Float(source.ErrorPercentage);
        }
        if (source.P99 != null) {
            this.P99 = new Float(source.P99);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.RPS != null) {
            this.RPS = new Float(source.RPS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Average", this.Average);
        this.setParamSimple(map, prefix + "P90", this.P90);
        this.setParamSimple(map, prefix + "P95", this.P95);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "ErrorPercentage", this.ErrorPercentage);
        this.setParamSimple(map, prefix + "P99", this.P99);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "RPS", this.RPS);

    }
}

