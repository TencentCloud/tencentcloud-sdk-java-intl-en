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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcDeliverInfo extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Account id.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Log topic ID.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Delivery Type. Valid values: 0: real-time delivery; 1: historic delivery.
    */
    @SerializedName("DeliverType")
    @Expose
    private Long DeliverType;

    /**
    * Delivery file size in MB
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * Delivery interval in seconds
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Start time of the delivery time range
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time of the delivery time range
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * dlc configuration message
    */
    @SerializedName("DlcInfo")
    @Expose
    private DlcInfo DlcInfo;

    /**
    * Whether to enable delivery service log. 1 for disabled, 2 for enabled
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * Task status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task progress. Historic delivery tasks take effect.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Topic type of logs. 0: standard topic; 1: metric topic.
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * Task creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Task modification time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Account id. 
     * @return Uin Account id.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Account id.
     * @param Uin Account id.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Log topic ID. 
     * @return TopicId Log topic ID.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID.
     * @param TopicId Log topic ID.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Task name. 
     * @return Name Task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task name.
     * @param Name Task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Delivery Type. Valid values: 0: real-time delivery; 1: historic delivery. 
     * @return DeliverType Delivery Type. Valid values: 0: real-time delivery; 1: historic delivery.
     */
    public Long getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set Delivery Type. Valid values: 0: real-time delivery; 1: historic delivery.
     * @param DeliverType Delivery Type. Valid values: 0: real-time delivery; 1: historic delivery.
     */
    public void setDeliverType(Long DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get Delivery file size in MB 
     * @return MaxSize Delivery file size in MB
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Delivery file size in MB
     * @param MaxSize Delivery file size in MB
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get Delivery interval in seconds 
     * @return Interval Delivery interval in seconds
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Delivery interval in seconds
     * @param Interval Delivery interval in seconds
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Start time of the delivery time range 
     * @return StartTime Start time of the delivery time range
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the delivery time range
     * @param StartTime Start time of the delivery time range
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the delivery time range 
     * @return EndTime End time of the delivery time range
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the delivery time range
     * @param EndTime End time of the delivery time range
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get dlc configuration message 
     * @return DlcInfo dlc configuration message
     */
    public DlcInfo getDlcInfo() {
        return this.DlcInfo;
    }

    /**
     * Set dlc configuration message
     * @param DlcInfo dlc configuration message
     */
    public void setDlcInfo(DlcInfo DlcInfo) {
        this.DlcInfo = DlcInfo;
    }

    /**
     * Get Whether to enable delivery service log. 1 for disabled, 2 for enabled 
     * @return HasServicesLog Whether to enable delivery service log. 1 for disabled, 2 for enabled
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set Whether to enable delivery service log. 1 for disabled, 2 for enabled
     * @param HasServicesLog Whether to enable delivery service log. 1 for disabled, 2 for enabled
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get Task status. 
     * @return Status Task status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status.
     * @param Status Task status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task progress. Historic delivery tasks take effect. 
     * @return Progress Task progress. Historic delivery tasks take effect.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress. Historic delivery tasks take effect.
     * @param Progress Task progress. Historic delivery tasks take effect.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Topic type of logs. 0: standard topic; 1: metric topic. 
     * @return BizType Topic type of logs. 0: standard topic; 1: metric topic.
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set Topic type of logs. 0: standard topic; 1: metric topic.
     * @param BizType Topic type of logs. 0: standard topic; 1: metric topic.
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get Task creation time. 
     * @return CreateTime Task creation time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time.
     * @param CreateTime Task creation time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task modification time. 
     * @return UpdateTime Task modification time.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Task modification time.
     * @param UpdateTime Task modification time.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DlcDeliverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcDeliverInfo(DlcDeliverInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DeliverType != null) {
            this.DeliverType = new Long(source.DeliverType);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.DlcInfo != null) {
            this.DlcInfo = new DlcInfo(source.DlcInfo);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "DlcInfo.", this.DlcInfo);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

