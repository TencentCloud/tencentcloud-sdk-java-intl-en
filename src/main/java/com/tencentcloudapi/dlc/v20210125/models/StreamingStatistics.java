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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamingStatistics extends AbstractModel {

    /**
    * Task start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Number of data receivers
    */
    @SerializedName("Receivers")
    @Expose
    private Long Receivers;

    /**
    * Number of receivers in service
    */
    @SerializedName("NumActiveReceivers")
    @Expose
    private Long NumActiveReceivers;

    /**
    * Number of inactive receivers
    */
    @SerializedName("NumInactiveReceivers")
    @Expose
    private Long NumInactiveReceivers;

    /**
    * Number of running batches
    */
    @SerializedName("NumActiveBatches")
    @Expose
    private Long NumActiveBatches;

    /**
    * Number of batches to be processed
    */
    @SerializedName("NumRetainedCompletedBatches")
    @Expose
    private Long NumRetainedCompletedBatches;

    /**
    * Number of completed batches
    */
    @SerializedName("NumTotalCompletedBatches")
    @Expose
    private Long NumTotalCompletedBatches;

    /**
    * Average input speed
    */
    @SerializedName("AverageInputRate")
    @Expose
    private Float AverageInputRate;

    /**
    * Average queue time
    */
    @SerializedName("AverageSchedulingDelay")
    @Expose
    private Float AverageSchedulingDelay;

    /**
    * Average processing time
    */
    @SerializedName("AverageProcessingTime")
    @Expose
    private Float AverageProcessingTime;

    /**
    * Average latency
    */
    @SerializedName("AverageTotalDelay")
    @Expose
    private Float AverageTotalDelay;

    /**
     * Get Task start time 
     * @return StartTime Task start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time
     * @param StartTime Task start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Number of data receivers 
     * @return Receivers Number of data receivers
     */
    public Long getReceivers() {
        return this.Receivers;
    }

    /**
     * Set Number of data receivers
     * @param Receivers Number of data receivers
     */
    public void setReceivers(Long Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get Number of receivers in service 
     * @return NumActiveReceivers Number of receivers in service
     */
    public Long getNumActiveReceivers() {
        return this.NumActiveReceivers;
    }

    /**
     * Set Number of receivers in service
     * @param NumActiveReceivers Number of receivers in service
     */
    public void setNumActiveReceivers(Long NumActiveReceivers) {
        this.NumActiveReceivers = NumActiveReceivers;
    }

    /**
     * Get Number of inactive receivers 
     * @return NumInactiveReceivers Number of inactive receivers
     */
    public Long getNumInactiveReceivers() {
        return this.NumInactiveReceivers;
    }

    /**
     * Set Number of inactive receivers
     * @param NumInactiveReceivers Number of inactive receivers
     */
    public void setNumInactiveReceivers(Long NumInactiveReceivers) {
        this.NumInactiveReceivers = NumInactiveReceivers;
    }

    /**
     * Get Number of running batches 
     * @return NumActiveBatches Number of running batches
     */
    public Long getNumActiveBatches() {
        return this.NumActiveBatches;
    }

    /**
     * Set Number of running batches
     * @param NumActiveBatches Number of running batches
     */
    public void setNumActiveBatches(Long NumActiveBatches) {
        this.NumActiveBatches = NumActiveBatches;
    }

    /**
     * Get Number of batches to be processed 
     * @return NumRetainedCompletedBatches Number of batches to be processed
     */
    public Long getNumRetainedCompletedBatches() {
        return this.NumRetainedCompletedBatches;
    }

    /**
     * Set Number of batches to be processed
     * @param NumRetainedCompletedBatches Number of batches to be processed
     */
    public void setNumRetainedCompletedBatches(Long NumRetainedCompletedBatches) {
        this.NumRetainedCompletedBatches = NumRetainedCompletedBatches;
    }

    /**
     * Get Number of completed batches 
     * @return NumTotalCompletedBatches Number of completed batches
     */
    public Long getNumTotalCompletedBatches() {
        return this.NumTotalCompletedBatches;
    }

    /**
     * Set Number of completed batches
     * @param NumTotalCompletedBatches Number of completed batches
     */
    public void setNumTotalCompletedBatches(Long NumTotalCompletedBatches) {
        this.NumTotalCompletedBatches = NumTotalCompletedBatches;
    }

    /**
     * Get Average input speed 
     * @return AverageInputRate Average input speed
     */
    public Float getAverageInputRate() {
        return this.AverageInputRate;
    }

    /**
     * Set Average input speed
     * @param AverageInputRate Average input speed
     */
    public void setAverageInputRate(Float AverageInputRate) {
        this.AverageInputRate = AverageInputRate;
    }

    /**
     * Get Average queue time 
     * @return AverageSchedulingDelay Average queue time
     */
    public Float getAverageSchedulingDelay() {
        return this.AverageSchedulingDelay;
    }

    /**
     * Set Average queue time
     * @param AverageSchedulingDelay Average queue time
     */
    public void setAverageSchedulingDelay(Float AverageSchedulingDelay) {
        this.AverageSchedulingDelay = AverageSchedulingDelay;
    }

    /**
     * Get Average processing time 
     * @return AverageProcessingTime Average processing time
     */
    public Float getAverageProcessingTime() {
        return this.AverageProcessingTime;
    }

    /**
     * Set Average processing time
     * @param AverageProcessingTime Average processing time
     */
    public void setAverageProcessingTime(Float AverageProcessingTime) {
        this.AverageProcessingTime = AverageProcessingTime;
    }

    /**
     * Get Average latency 
     * @return AverageTotalDelay Average latency
     */
    public Float getAverageTotalDelay() {
        return this.AverageTotalDelay;
    }

    /**
     * Set Average latency
     * @param AverageTotalDelay Average latency
     */
    public void setAverageTotalDelay(Float AverageTotalDelay) {
        this.AverageTotalDelay = AverageTotalDelay;
    }

    public StreamingStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamingStatistics(StreamingStatistics source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Receivers != null) {
            this.Receivers = new Long(source.Receivers);
        }
        if (source.NumActiveReceivers != null) {
            this.NumActiveReceivers = new Long(source.NumActiveReceivers);
        }
        if (source.NumInactiveReceivers != null) {
            this.NumInactiveReceivers = new Long(source.NumInactiveReceivers);
        }
        if (source.NumActiveBatches != null) {
            this.NumActiveBatches = new Long(source.NumActiveBatches);
        }
        if (source.NumRetainedCompletedBatches != null) {
            this.NumRetainedCompletedBatches = new Long(source.NumRetainedCompletedBatches);
        }
        if (source.NumTotalCompletedBatches != null) {
            this.NumTotalCompletedBatches = new Long(source.NumTotalCompletedBatches);
        }
        if (source.AverageInputRate != null) {
            this.AverageInputRate = new Float(source.AverageInputRate);
        }
        if (source.AverageSchedulingDelay != null) {
            this.AverageSchedulingDelay = new Float(source.AverageSchedulingDelay);
        }
        if (source.AverageProcessingTime != null) {
            this.AverageProcessingTime = new Float(source.AverageProcessingTime);
        }
        if (source.AverageTotalDelay != null) {
            this.AverageTotalDelay = new Float(source.AverageTotalDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Receivers", this.Receivers);
        this.setParamSimple(map, prefix + "NumActiveReceivers", this.NumActiveReceivers);
        this.setParamSimple(map, prefix + "NumInactiveReceivers", this.NumInactiveReceivers);
        this.setParamSimple(map, prefix + "NumActiveBatches", this.NumActiveBatches);
        this.setParamSimple(map, prefix + "NumRetainedCompletedBatches", this.NumRetainedCompletedBatches);
        this.setParamSimple(map, prefix + "NumTotalCompletedBatches", this.NumTotalCompletedBatches);
        this.setParamSimple(map, prefix + "AverageInputRate", this.AverageInputRate);
        this.setParamSimple(map, prefix + "AverageSchedulingDelay", this.AverageSchedulingDelay);
        this.setParamSimple(map, prefix + "AverageProcessingTime", this.AverageProcessingTime);
        this.setParamSimple(map, prefix + "AverageTotalDelay", this.AverageTotalDelay);

    }
}

