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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageTrackItem extends AbstractModel {

    /**
    * Specifies the consumer group name.
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * Consumption status. CONSUMED: Consumed CONSUMED_BUT_FILTERED: Filtered NOT_CONSUME: Not consumed ENTER_RETRY: Enter retry queue. ENTER_DLQ: Enter dead letter queue. UNKNOWN: Consumption status unknown
    */
    @SerializedName("ConsumeStatus")
    @Expose
    private String ConsumeStatus;

    /**
    * Track type
    */
    @SerializedName("TrackType")
    @Expose
    private String TrackType;

    /**
    * Exception information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExceptionDesc")
    @Expose
    private String ExceptionDesc;

    /**
     * Get Specifies the consumer group name. 
     * @return ConsumerGroup Specifies the consumer group name.
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set Specifies the consumer group name.
     * @param ConsumerGroup Specifies the consumer group name.
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get Consumption status. CONSUMED: Consumed CONSUMED_BUT_FILTERED: Filtered NOT_CONSUME: Not consumed ENTER_RETRY: Enter retry queue. ENTER_DLQ: Enter dead letter queue. UNKNOWN: Consumption status unknown 
     * @return ConsumeStatus Consumption status. CONSUMED: Consumed CONSUMED_BUT_FILTERED: Filtered NOT_CONSUME: Not consumed ENTER_RETRY: Enter retry queue. ENTER_DLQ: Enter dead letter queue. UNKNOWN: Consumption status unknown
     */
    public String getConsumeStatus() {
        return this.ConsumeStatus;
    }

    /**
     * Set Consumption status. CONSUMED: Consumed CONSUMED_BUT_FILTERED: Filtered NOT_CONSUME: Not consumed ENTER_RETRY: Enter retry queue. ENTER_DLQ: Enter dead letter queue. UNKNOWN: Consumption status unknown
     * @param ConsumeStatus Consumption status. CONSUMED: Consumed CONSUMED_BUT_FILTERED: Filtered NOT_CONSUME: Not consumed ENTER_RETRY: Enter retry queue. ENTER_DLQ: Enter dead letter queue. UNKNOWN: Consumption status unknown
     */
    public void setConsumeStatus(String ConsumeStatus) {
        this.ConsumeStatus = ConsumeStatus;
    }

    /**
     * Get Track type 
     * @return TrackType Track type
     */
    public String getTrackType() {
        return this.TrackType;
    }

    /**
     * Set Track type
     * @param TrackType Track type
     */
    public void setTrackType(String TrackType) {
        this.TrackType = TrackType;
    }

    /**
     * Get Exception information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExceptionDesc Exception information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExceptionDesc() {
        return this.ExceptionDesc;
    }

    /**
     * Set Exception information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExceptionDesc Exception information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExceptionDesc(String ExceptionDesc) {
        this.ExceptionDesc = ExceptionDesc;
    }

    public MessageTrackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageTrackItem(MessageTrackItem source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.ConsumeStatus != null) {
            this.ConsumeStatus = new String(source.ConsumeStatus);
        }
        if (source.TrackType != null) {
            this.TrackType = new String(source.TrackType);
        }
        if (source.ExceptionDesc != null) {
            this.ExceptionDesc = new String(source.ExceptionDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "ConsumeStatus", this.ConsumeStatus);
        this.setParamSimple(map, prefix + "TrackType", this.TrackType);
        this.setParamSimple(map, prefix + "ExceptionDesc", this.ExceptionDesc);

    }
}

