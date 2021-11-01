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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShipperTaskInfo extends AbstractModel{

    /**
    * Shipping task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Shipping information ID
    */
    @SerializedName("ShipperId")
    @Expose
    private String ShipperId;

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Start timestamp of the current batch of shipped logs in milliseconds
    */
    @SerializedName("RangeStart")
    @Expose
    private Long RangeStart;

    /**
    * End timestamp of the current batch of shipped logs in milliseconds
    */
    @SerializedName("RangeEnd")
    @Expose
    private Long RangeEnd;

    /**
    * Start timestamp of the current shipping task in milliseconds
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End timestamp of the current shipping task in milliseconds
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Result of the current shipping task. Valid values: `success`, `running`, `failed`
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Result details
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Shipping task ID 
     * @return TaskId Shipping task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Shipping task ID
     * @param TaskId Shipping task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Shipping information ID 
     * @return ShipperId Shipping information ID
     */
    public String getShipperId() {
        return this.ShipperId;
    }

    /**
     * Set Shipping information ID
     * @param ShipperId Shipping information ID
     */
    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

    /**
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Start timestamp of the current batch of shipped logs in milliseconds 
     * @return RangeStart Start timestamp of the current batch of shipped logs in milliseconds
     */
    public Long getRangeStart() {
        return this.RangeStart;
    }

    /**
     * Set Start timestamp of the current batch of shipped logs in milliseconds
     * @param RangeStart Start timestamp of the current batch of shipped logs in milliseconds
     */
    public void setRangeStart(Long RangeStart) {
        this.RangeStart = RangeStart;
    }

    /**
     * Get End timestamp of the current batch of shipped logs in milliseconds 
     * @return RangeEnd End timestamp of the current batch of shipped logs in milliseconds
     */
    public Long getRangeEnd() {
        return this.RangeEnd;
    }

    /**
     * Set End timestamp of the current batch of shipped logs in milliseconds
     * @param RangeEnd End timestamp of the current batch of shipped logs in milliseconds
     */
    public void setRangeEnd(Long RangeEnd) {
        this.RangeEnd = RangeEnd;
    }

    /**
     * Get Start timestamp of the current shipping task in milliseconds 
     * @return StartTime Start timestamp of the current shipping task in milliseconds
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp of the current shipping task in milliseconds
     * @param StartTime Start timestamp of the current shipping task in milliseconds
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timestamp of the current shipping task in milliseconds 
     * @return EndTime End timestamp of the current shipping task in milliseconds
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp of the current shipping task in milliseconds
     * @param EndTime End timestamp of the current shipping task in milliseconds
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Result of the current shipping task. Valid values: `success`, `running`, `failed` 
     * @return Status Result of the current shipping task. Valid values: `success`, `running`, `failed`
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Result of the current shipping task. Valid values: `success`, `running`, `failed`
     * @param Status Result of the current shipping task. Valid values: `success`, `running`, `failed`
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Result details 
     * @return Message Result details
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Result details
     * @param Message Result details
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ShipperTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShipperTaskInfo(ShipperTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ShipperId != null) {
            this.ShipperId = new String(source.ShipperId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.RangeStart != null) {
            this.RangeStart = new Long(source.RangeStart);
        }
        if (source.RangeEnd != null) {
            this.RangeEnd = new Long(source.RangeEnd);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ShipperId", this.ShipperId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "RangeStart", this.RangeStart);
        this.setParamSimple(map, prefix + "RangeEnd", this.RangeEnd);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

