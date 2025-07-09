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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportOverviewData extends AbstractModel {

    /**
    * Total count
    */
    @SerializedName("TotalTimes")
    @Expose
    private String TotalTimes;

    /**
    * Success rate
    */
    @SerializedName("SuccessPercent")
    @Expose
    private Float SuccessPercent;

    /**
    * Timeout rate
    */
    @SerializedName("TimeoutPercent")
    @Expose
    private Float TimeoutPercent;

    /**
    * Failure rate
    */
    @SerializedName("FailPercent")
    @Expose
    private Float FailPercent;

    /**
    * Average matching time
    */
    @SerializedName("AverageSec")
    @Expose
    private Float AverageSec;

    /**
     * Get Total count 
     * @return TotalTimes Total count
     */
    public String getTotalTimes() {
        return this.TotalTimes;
    }

    /**
     * Set Total count
     * @param TotalTimes Total count
     */
    public void setTotalTimes(String TotalTimes) {
        this.TotalTimes = TotalTimes;
    }

    /**
     * Get Success rate 
     * @return SuccessPercent Success rate
     */
    public Float getSuccessPercent() {
        return this.SuccessPercent;
    }

    /**
     * Set Success rate
     * @param SuccessPercent Success rate
     */
    public void setSuccessPercent(Float SuccessPercent) {
        this.SuccessPercent = SuccessPercent;
    }

    /**
     * Get Timeout rate 
     * @return TimeoutPercent Timeout rate
     */
    public Float getTimeoutPercent() {
        return this.TimeoutPercent;
    }

    /**
     * Set Timeout rate
     * @param TimeoutPercent Timeout rate
     */
    public void setTimeoutPercent(Float TimeoutPercent) {
        this.TimeoutPercent = TimeoutPercent;
    }

    /**
     * Get Failure rate 
     * @return FailPercent Failure rate
     */
    public Float getFailPercent() {
        return this.FailPercent;
    }

    /**
     * Set Failure rate
     * @param FailPercent Failure rate
     */
    public void setFailPercent(Float FailPercent) {
        this.FailPercent = FailPercent;
    }

    /**
     * Get Average matching time 
     * @return AverageSec Average matching time
     */
    public Float getAverageSec() {
        return this.AverageSec;
    }

    /**
     * Set Average matching time
     * @param AverageSec Average matching time
     */
    public void setAverageSec(Float AverageSec) {
        this.AverageSec = AverageSec;
    }

    public ReportOverviewData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportOverviewData(ReportOverviewData source) {
        if (source.TotalTimes != null) {
            this.TotalTimes = new String(source.TotalTimes);
        }
        if (source.SuccessPercent != null) {
            this.SuccessPercent = new Float(source.SuccessPercent);
        }
        if (source.TimeoutPercent != null) {
            this.TimeoutPercent = new Float(source.TimeoutPercent);
        }
        if (source.FailPercent != null) {
            this.FailPercent = new Float(source.FailPercent);
        }
        if (source.AverageSec != null) {
            this.AverageSec = new Float(source.AverageSec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTimes", this.TotalTimes);
        this.setParamSimple(map, prefix + "SuccessPercent", this.SuccessPercent);
        this.setParamSimple(map, prefix + "TimeoutPercent", this.TimeoutPercent);
        this.setParamSimple(map, prefix + "FailPercent", this.FailPercent);
        this.setParamSimple(map, prefix + "AverageSec", this.AverageSec);

    }
}

