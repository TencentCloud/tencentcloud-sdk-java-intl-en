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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallInMetrics extends AbstractModel {

    /**
    * Number of IVR residency.
    */
    @SerializedName("IvrCount")
    @Expose
    private Long IvrCount;

    /**
    * Number in queue.
    */
    @SerializedName("QueueCount")
    @Expose
    private Long QueueCount;

    /**
    * Number in ringing.
    */
    @SerializedName("RingCount")
    @Expose
    private Long RingCount;

    /**
    * Number in connection.
    */
    @SerializedName("AcceptCount")
    @Expose
    private Long AcceptCount;

    /**
    * Number of customer service transferring to the external line.
    */
    @SerializedName("TransferOuterCount")
    @Expose
    private Long TransferOuterCount;

    /**
    * Maximum queue duration.
    */
    @SerializedName("MaxQueueDuration")
    @Expose
    private Long MaxQueueDuration;

    /**
    * Average queue duration.
    */
    @SerializedName("AvgQueueDuration")
    @Expose
    private Long AvgQueueDuration;

    /**
    * Maximum ringing duration.
    */
    @SerializedName("MaxRingDuration")
    @Expose
    private Long MaxRingDuration;

    /**
    * Average ringing duration.
    */
    @SerializedName("AvgRingDuration")
    @Expose
    private Long AvgRingDuration;

    /**
    * Maximum connection duration.
    */
    @SerializedName("MaxAcceptDuration")
    @Expose
    private Long MaxAcceptDuration;

    /**
    * Average connection duration.
    */
    @SerializedName("AvgAcceptDuration")
    @Expose
    private Long AvgAcceptDuration;

    /**
     * Get Number of IVR residency. 
     * @return IvrCount Number of IVR residency.
     */
    public Long getIvrCount() {
        return this.IvrCount;
    }

    /**
     * Set Number of IVR residency.
     * @param IvrCount Number of IVR residency.
     */
    public void setIvrCount(Long IvrCount) {
        this.IvrCount = IvrCount;
    }

    /**
     * Get Number in queue. 
     * @return QueueCount Number in queue.
     */
    public Long getQueueCount() {
        return this.QueueCount;
    }

    /**
     * Set Number in queue.
     * @param QueueCount Number in queue.
     */
    public void setQueueCount(Long QueueCount) {
        this.QueueCount = QueueCount;
    }

    /**
     * Get Number in ringing. 
     * @return RingCount Number in ringing.
     */
    public Long getRingCount() {
        return this.RingCount;
    }

    /**
     * Set Number in ringing.
     * @param RingCount Number in ringing.
     */
    public void setRingCount(Long RingCount) {
        this.RingCount = RingCount;
    }

    /**
     * Get Number in connection. 
     * @return AcceptCount Number in connection.
     */
    public Long getAcceptCount() {
        return this.AcceptCount;
    }

    /**
     * Set Number in connection.
     * @param AcceptCount Number in connection.
     */
    public void setAcceptCount(Long AcceptCount) {
        this.AcceptCount = AcceptCount;
    }

    /**
     * Get Number of customer service transferring to the external line. 
     * @return TransferOuterCount Number of customer service transferring to the external line.
     */
    public Long getTransferOuterCount() {
        return this.TransferOuterCount;
    }

    /**
     * Set Number of customer service transferring to the external line.
     * @param TransferOuterCount Number of customer service transferring to the external line.
     */
    public void setTransferOuterCount(Long TransferOuterCount) {
        this.TransferOuterCount = TransferOuterCount;
    }

    /**
     * Get Maximum queue duration. 
     * @return MaxQueueDuration Maximum queue duration.
     */
    public Long getMaxQueueDuration() {
        return this.MaxQueueDuration;
    }

    /**
     * Set Maximum queue duration.
     * @param MaxQueueDuration Maximum queue duration.
     */
    public void setMaxQueueDuration(Long MaxQueueDuration) {
        this.MaxQueueDuration = MaxQueueDuration;
    }

    /**
     * Get Average queue duration. 
     * @return AvgQueueDuration Average queue duration.
     */
    public Long getAvgQueueDuration() {
        return this.AvgQueueDuration;
    }

    /**
     * Set Average queue duration.
     * @param AvgQueueDuration Average queue duration.
     */
    public void setAvgQueueDuration(Long AvgQueueDuration) {
        this.AvgQueueDuration = AvgQueueDuration;
    }

    /**
     * Get Maximum ringing duration. 
     * @return MaxRingDuration Maximum ringing duration.
     */
    public Long getMaxRingDuration() {
        return this.MaxRingDuration;
    }

    /**
     * Set Maximum ringing duration.
     * @param MaxRingDuration Maximum ringing duration.
     */
    public void setMaxRingDuration(Long MaxRingDuration) {
        this.MaxRingDuration = MaxRingDuration;
    }

    /**
     * Get Average ringing duration. 
     * @return AvgRingDuration Average ringing duration.
     */
    public Long getAvgRingDuration() {
        return this.AvgRingDuration;
    }

    /**
     * Set Average ringing duration.
     * @param AvgRingDuration Average ringing duration.
     */
    public void setAvgRingDuration(Long AvgRingDuration) {
        this.AvgRingDuration = AvgRingDuration;
    }

    /**
     * Get Maximum connection duration. 
     * @return MaxAcceptDuration Maximum connection duration.
     */
    public Long getMaxAcceptDuration() {
        return this.MaxAcceptDuration;
    }

    /**
     * Set Maximum connection duration.
     * @param MaxAcceptDuration Maximum connection duration.
     */
    public void setMaxAcceptDuration(Long MaxAcceptDuration) {
        this.MaxAcceptDuration = MaxAcceptDuration;
    }

    /**
     * Get Average connection duration. 
     * @return AvgAcceptDuration Average connection duration.
     */
    public Long getAvgAcceptDuration() {
        return this.AvgAcceptDuration;
    }

    /**
     * Set Average connection duration.
     * @param AvgAcceptDuration Average connection duration.
     */
    public void setAvgAcceptDuration(Long AvgAcceptDuration) {
        this.AvgAcceptDuration = AvgAcceptDuration;
    }

    public CallInMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallInMetrics(CallInMetrics source) {
        if (source.IvrCount != null) {
            this.IvrCount = new Long(source.IvrCount);
        }
        if (source.QueueCount != null) {
            this.QueueCount = new Long(source.QueueCount);
        }
        if (source.RingCount != null) {
            this.RingCount = new Long(source.RingCount);
        }
        if (source.AcceptCount != null) {
            this.AcceptCount = new Long(source.AcceptCount);
        }
        if (source.TransferOuterCount != null) {
            this.TransferOuterCount = new Long(source.TransferOuterCount);
        }
        if (source.MaxQueueDuration != null) {
            this.MaxQueueDuration = new Long(source.MaxQueueDuration);
        }
        if (source.AvgQueueDuration != null) {
            this.AvgQueueDuration = new Long(source.AvgQueueDuration);
        }
        if (source.MaxRingDuration != null) {
            this.MaxRingDuration = new Long(source.MaxRingDuration);
        }
        if (source.AvgRingDuration != null) {
            this.AvgRingDuration = new Long(source.AvgRingDuration);
        }
        if (source.MaxAcceptDuration != null) {
            this.MaxAcceptDuration = new Long(source.MaxAcceptDuration);
        }
        if (source.AvgAcceptDuration != null) {
            this.AvgAcceptDuration = new Long(source.AvgAcceptDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IvrCount", this.IvrCount);
        this.setParamSimple(map, prefix + "QueueCount", this.QueueCount);
        this.setParamSimple(map, prefix + "RingCount", this.RingCount);
        this.setParamSimple(map, prefix + "AcceptCount", this.AcceptCount);
        this.setParamSimple(map, prefix + "TransferOuterCount", this.TransferOuterCount);
        this.setParamSimple(map, prefix + "MaxQueueDuration", this.MaxQueueDuration);
        this.setParamSimple(map, prefix + "AvgQueueDuration", this.AvgQueueDuration);
        this.setParamSimple(map, prefix + "MaxRingDuration", this.MaxRingDuration);
        this.setParamSimple(map, prefix + "AvgRingDuration", this.AvgRingDuration);
        this.setParamSimple(map, prefix + "MaxAcceptDuration", this.MaxAcceptDuration);
        this.setParamSimple(map, prefix + "AvgAcceptDuration", this.AvgAcceptDuration);

    }
}

