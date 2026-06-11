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

public class ModifyDlcDeliverRequest extends AbstractModel {

    /**
    * <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Task id.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Name: Length not exceeding 64 characters, starts with a letter, accepts 0-9, a-z, A-Z, _, -, Chinese character.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Delivery Type. Valid values: 0: batch delivery; 1: real-time delivery.</p>
    */
    @SerializedName("DeliverType")
    @Expose
    private Long DeliverType;

    /**
    * <p>Start time of the delivery time range</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>End time of the delivery time range. If empty, it means unlimited time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Delivery file size in MB. Required when DeliverType=0. Valid range: 5 &lt;= MaxSize &lt;= 256.</p>
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <p>Delivery interval in seconds. Required when DeliverType=0. Valid range: 300 &lt;= Interval &lt;= 900.</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>dlc configuration message</p>
    */
    @SerializedName("DlcInfo")
    @Expose
    private DlcInfo DlcInfo;

    /**
    * <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled. Enabled by default.</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>Task status.</p><p>Enumeration values: </p><ul><li>1: Running, </li><li>2: Stop.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul> 
     * @return TopicId <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
     * @param TopicId <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

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
     * Get <p>Name: Length not exceeding 64 characters, starts with a letter, accepts 0-9, a-z, A-Z, _, -, Chinese character.</p> 
     * @return Name <p>Name: Length not exceeding 64 characters, starts with a letter, accepts 0-9, a-z, A-Z, _, -, Chinese character.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name: Length not exceeding 64 characters, starts with a letter, accepts 0-9, a-z, A-Z, _, -, Chinese character.</p>
     * @param Name <p>Name: Length not exceeding 64 characters, starts with a letter, accepts 0-9, a-z, A-Z, _, -, Chinese character.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Delivery Type. Valid values: 0: batch delivery; 1: real-time delivery.</p> 
     * @return DeliverType <p>Delivery Type. Valid values: 0: batch delivery; 1: real-time delivery.</p>
     */
    public Long getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set <p>Delivery Type. Valid values: 0: batch delivery; 1: real-time delivery.</p>
     * @param DeliverType <p>Delivery Type. Valid values: 0: batch delivery; 1: real-time delivery.</p>
     */
    public void setDeliverType(Long DeliverType) {
        this.DeliverType = DeliverType;
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
     * Get <p>End time of the delivery time range. If empty, it means unlimited time.</p> 
     * @return EndTime <p>End time of the delivery time range. If empty, it means unlimited time.</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time of the delivery time range. If empty, it means unlimited time.</p>
     * @param EndTime <p>End time of the delivery time range. If empty, it means unlimited time.</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Delivery file size in MB. Required when DeliverType=0. Valid range: 5 &lt;= MaxSize &lt;= 256.</p> 
     * @return MaxSize <p>Delivery file size in MB. Required when DeliverType=0. Valid range: 5 &lt;= MaxSize &lt;= 256.</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>Delivery file size in MB. Required when DeliverType=0. Valid range: 5 &lt;= MaxSize &lt;= 256.</p>
     * @param MaxSize <p>Delivery file size in MB. Required when DeliverType=0. Valid range: 5 &lt;= MaxSize &lt;= 256.</p>
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <p>Delivery interval in seconds. Required when DeliverType=0. Valid range: 300 &lt;= Interval &lt;= 900.</p> 
     * @return Interval <p>Delivery interval in seconds. Required when DeliverType=0. Valid range: 300 &lt;= Interval &lt;= 900.</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Delivery interval in seconds. Required when DeliverType=0. Valid range: 300 &lt;= Interval &lt;= 900.</p>
     * @param Interval <p>Delivery interval in seconds. Required when DeliverType=0. Valid range: 300 &lt;= Interval &lt;= 900.</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
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
     * Get <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled. Enabled by default.</p> 
     * @return HasServicesLog <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled. Enabled by default.</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled. Enabled by default.</p>
     * @param HasServicesLog <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled. Enabled by default.</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>Task status.</p><p>Enumeration values: </p><ul><li>1: Running, </li><li>2: Stop.</li></ul> 
     * @return Status <p>Task status.</p><p>Enumeration values: </p><ul><li>1: Running, </li><li>2: Stop.</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status.</p><p>Enumeration values: </p><ul><li>1: Running, </li><li>2: Stop.</li></ul>
     * @param Status <p>Task status.</p><p>Enumeration values: </p><ul><li>1: Running, </li><li>2: Stop.</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyDlcDeliverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDlcDeliverRequest(ModifyDlcDeliverRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DeliverType != null) {
            this.DeliverType = new Long(source.DeliverType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamObj(map, prefix + "DlcInfo.", this.DlcInfo);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

