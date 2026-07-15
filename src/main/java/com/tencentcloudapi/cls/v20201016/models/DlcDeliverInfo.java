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
    * <p>Task id.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Account id.</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>Log topic id.</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Task name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Delivery Type, 0: real-time delivery, 1: history delivery</p>
    */
    @SerializedName("DeliverType")
    @Expose
    private Long DeliverType;

    /**
    * <p>Delivery file size, in MB.</p>
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <p>Delivery interval in seconds</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>Start time of the delivery time range</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>End time of the delivery time range</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>dlc configuration message</p>
    */
    @SerializedName("DlcInfo")
    @Expose
    private DlcInfo DlcInfo;

    /**
    * <p>Whether to enable delivery service log. 1 Disabled, 2 Enabled</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>Task status.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Task progress. Historic delivery tasks take effect.</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>Log topic type. 0: Standard topic, 1: Metric topic</p>
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * <p>Task creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Task last modified.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>Auto-create dlc field</p><p>Default value: false</p><p>When there are additional fields in your log, the system will automatically ship them to DLC.</p>
    */
    @SerializedName("AutoCreateField")
    @Expose
    private Boolean AutoCreateField;

    /**
    * <p>Store logs with delivery failure in a DLC table</p>
    */
    @SerializedName("DlcFailHandle")
    @Expose
    private DlcFailHandle DlcFailHandle;

    /**
    * <p>Log pre-filtering - Perform pre-filtering process on the original data for data ingestion into Splunk.</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
     * Get <p>Task id.</p> 
     * @return TaskId <p>Task id.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task id.</p>
     * @param TaskId <p>Task id.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Account id.</p> 
     * @return Uin <p>Account id.</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Account id.</p>
     * @param Uin <p>Account id.</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Log topic id.</p> 
     * @return TopicId <p>Log topic id.</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Log topic id.</p>
     * @param TopicId <p>Log topic id.</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Task name.</p> 
     * @return Name <p>Task name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Task name.</p>
     * @param Name <p>Task name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Delivery Type, 0: real-time delivery, 1: history delivery</p> 
     * @return DeliverType <p>Delivery Type, 0: real-time delivery, 1: history delivery</p>
     */
    public Long getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set <p>Delivery Type, 0: real-time delivery, 1: history delivery</p>
     * @param DeliverType <p>Delivery Type, 0: real-time delivery, 1: history delivery</p>
     */
    public void setDeliverType(Long DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get <p>Delivery file size, in MB.</p> 
     * @return MaxSize <p>Delivery file size, in MB.</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>Delivery file size, in MB.</p>
     * @param MaxSize <p>Delivery file size, in MB.</p>
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <p>Delivery interval in seconds</p> 
     * @return Interval <p>Delivery interval in seconds</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Delivery interval in seconds</p>
     * @param Interval <p>Delivery interval in seconds</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Start time of the delivery time range</p> 
     * @return StartTime <p>Start time of the delivery time range</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time of the delivery time range</p>
     * @param StartTime <p>Start time of the delivery time range</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time of the delivery time range</p> 
     * @return EndTime <p>End time of the delivery time range</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time of the delivery time range</p>
     * @param EndTime <p>End time of the delivery time range</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>dlc configuration message</p> 
     * @return DlcInfo <p>dlc configuration message</p>
     */
    public DlcInfo getDlcInfo() {
        return this.DlcInfo;
    }

    /**
     * Set <p>dlc configuration message</p>
     * @param DlcInfo <p>dlc configuration message</p>
     */
    public void setDlcInfo(DlcInfo DlcInfo) {
        this.DlcInfo = DlcInfo;
    }

    /**
     * Get <p>Whether to enable delivery service log. 1 Disabled, 2 Enabled</p> 
     * @return HasServicesLog <p>Whether to enable delivery service log. 1 Disabled, 2 Enabled</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>Whether to enable delivery service log. 1 Disabled, 2 Enabled</p>
     * @param HasServicesLog <p>Whether to enable delivery service log. 1 Disabled, 2 Enabled</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>Task status.</p> 
     * @return Status <p>Task status.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status.</p>
     * @param Status <p>Task status.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Task progress. Historic delivery tasks take effect.</p> 
     * @return Progress <p>Task progress. Historic delivery tasks take effect.</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Task progress. Historic delivery tasks take effect.</p>
     * @param Progress <p>Task progress. Historic delivery tasks take effect.</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>Log topic type. 0: Standard topic, 1: Metric topic</p> 
     * @return BizType <p>Log topic type. 0: Standard topic, 1: Metric topic</p>
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>Log topic type. 0: Standard topic, 1: Metric topic</p>
     * @param BizType <p>Log topic type. 0: Standard topic, 1: Metric topic</p>
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>Task creation time.</p> 
     * @return CreateTime <p>Task creation time.</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Task creation time.</p>
     * @param CreateTime <p>Task creation time.</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Task last modified.</p> 
     * @return UpdateTime <p>Task last modified.</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Task last modified.</p>
     * @param UpdateTime <p>Task last modified.</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Auto-create dlc field</p><p>Default value: false</p><p>When there are additional fields in your log, the system will automatically ship them to DLC.</p> 
     * @return AutoCreateField <p>Auto-create dlc field</p><p>Default value: false</p><p>When there are additional fields in your log, the system will automatically ship them to DLC.</p>
     */
    public Boolean getAutoCreateField() {
        return this.AutoCreateField;
    }

    /**
     * Set <p>Auto-create dlc field</p><p>Default value: false</p><p>When there are additional fields in your log, the system will automatically ship them to DLC.</p>
     * @param AutoCreateField <p>Auto-create dlc field</p><p>Default value: false</p><p>When there are additional fields in your log, the system will automatically ship them to DLC.</p>
     */
    public void setAutoCreateField(Boolean AutoCreateField) {
        this.AutoCreateField = AutoCreateField;
    }

    /**
     * Get <p>Store logs with delivery failure in a DLC table</p> 
     * @return DlcFailHandle <p>Store logs with delivery failure in a DLC table</p>
     */
    public DlcFailHandle getDlcFailHandle() {
        return this.DlcFailHandle;
    }

    /**
     * Set <p>Store logs with delivery failure in a DLC table</p>
     * @param DlcFailHandle <p>Store logs with delivery failure in a DLC table</p>
     */
    public void setDlcFailHandle(DlcFailHandle DlcFailHandle) {
        this.DlcFailHandle = DlcFailHandle;
    }

    /**
     * Get <p>Log pre-filtering - Perform pre-filtering process on the original data for data ingestion into Splunk.</p> 
     * @return DSLFilter <p>Log pre-filtering - Perform pre-filtering process on the original data for data ingestion into Splunk.</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>Log pre-filtering - Perform pre-filtering process on the original data for data ingestion into Splunk.</p>
     * @param DSLFilter <p>Log pre-filtering - Perform pre-filtering process on the original data for data ingestion into Splunk.</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
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
        if (source.AutoCreateField != null) {
            this.AutoCreateField = new Boolean(source.AutoCreateField);
        }
        if (source.DlcFailHandle != null) {
            this.DlcFailHandle = new DlcFailHandle(source.DlcFailHandle);
        }
        if (source.DSLFilter != null) {
            this.DSLFilter = new String(source.DSLFilter);
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
        this.setParamSimple(map, prefix + "AutoCreateField", this.AutoCreateField);
        this.setParamObj(map, prefix + "DlcFailHandle.", this.DlcFailHandle);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);

    }
}

