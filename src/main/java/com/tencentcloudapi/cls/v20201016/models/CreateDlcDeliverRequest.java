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

public class CreateDlcDeliverRequest extends AbstractModel {

    /**
    * <p>Log topic id.</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Name: Length not exceeding 64 characters, starts with a letter, accepts 0-9, a-z, A-Z, _, -, Chinese character.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Delivery Type. 0: Batch delivery, 1: Real-time delivery</p>
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
    * <p>dlc configuration message</p>
    */
    @SerializedName("DlcInfo")
    @Expose
    private DlcInfo DlcInfo;

    /**
    * <p>Delivery file size in MB. Required when DeliverType=0. Range: 5&lt;= MaxSize &lt;= 256.</p>
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
    * <p>End time of the delivery time range. If empty, it means unlimited time. When EndTime is not empty, it must be greater than StartTime.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Whether to enable delivery service log. Valid values: 1: disable; 2: enable. Enabled by default.</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>Auto-create dlc field</p><p>Default value: false</p><p>When there are additional fields in your log, the system will automatically ship them to DLC.</p>
    */
    @SerializedName("AutoCreateField")
    @Expose
    private Boolean AutoCreateField;

    /**
    * <p>Store delivery failure logs in DLC tables</p>
    */
    @SerializedName("DlcFailHandle")
    @Expose
    private DlcFailHandle DlcFailHandle;

    /**
    * <p>Log pre-filtering - Perform pre-filtering on original data for data ingestion into Splunk</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
     * Get <p>Log topic id.</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul> 
     * @return TopicId <p>Log topic id.</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Log topic id.</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
     * @param TopicId <p>Log topic id.</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
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
     * Get <p>Delivery Type. 0: Batch delivery, 1: Real-time delivery</p> 
     * @return DeliverType <p>Delivery Type. 0: Batch delivery, 1: Real-time delivery</p>
     */
    public Long getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set <p>Delivery Type. 0: Batch delivery, 1: Real-time delivery</p>
     * @param DeliverType <p>Delivery Type. 0: Batch delivery, 1: Real-time delivery</p>
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
     * Get <p>Delivery file size in MB. Required when DeliverType=0. Range: 5&lt;= MaxSize &lt;= 256.</p> 
     * @return MaxSize <p>Delivery file size in MB. Required when DeliverType=0. Range: 5&lt;= MaxSize &lt;= 256.</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>Delivery file size in MB. Required when DeliverType=0. Range: 5&lt;= MaxSize &lt;= 256.</p>
     * @param MaxSize <p>Delivery file size in MB. Required when DeliverType=0. Range: 5&lt;= MaxSize &lt;= 256.</p>
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
     * Get <p>End time of the delivery time range. If empty, it means unlimited time. When EndTime is not empty, it must be greater than StartTime.</p> 
     * @return EndTime <p>End time of the delivery time range. If empty, it means unlimited time. When EndTime is not empty, it must be greater than StartTime.</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time of the delivery time range. If empty, it means unlimited time. When EndTime is not empty, it must be greater than StartTime.</p>
     * @param EndTime <p>End time of the delivery time range. If empty, it means unlimited time. When EndTime is not empty, it must be greater than StartTime.</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Whether to enable delivery service log. Valid values: 1: disable; 2: enable. Enabled by default.</p> 
     * @return HasServicesLog <p>Whether to enable delivery service log. Valid values: 1: disable; 2: enable. Enabled by default.</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>Whether to enable delivery service log. Valid values: 1: disable; 2: enable. Enabled by default.</p>
     * @param HasServicesLog <p>Whether to enable delivery service log. Valid values: 1: disable; 2: enable. Enabled by default.</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
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
     * Get <p>Store delivery failure logs in DLC tables</p> 
     * @return DlcFailHandle <p>Store delivery failure logs in DLC tables</p>
     */
    public DlcFailHandle getDlcFailHandle() {
        return this.DlcFailHandle;
    }

    /**
     * Set <p>Store delivery failure logs in DLC tables</p>
     * @param DlcFailHandle <p>Store delivery failure logs in DLC tables</p>
     */
    public void setDlcFailHandle(DlcFailHandle DlcFailHandle) {
        this.DlcFailHandle = DlcFailHandle;
    }

    /**
     * Get <p>Log pre-filtering - Perform pre-filtering on original data for data ingestion into Splunk</p> 
     * @return DSLFilter <p>Log pre-filtering - Perform pre-filtering on original data for data ingestion into Splunk</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>Log pre-filtering - Perform pre-filtering on original data for data ingestion into Splunk</p>
     * @param DSLFilter <p>Log pre-filtering - Perform pre-filtering on original data for data ingestion into Splunk</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
    }

    public CreateDlcDeliverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDlcDeliverRequest(CreateDlcDeliverRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
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
        if (source.DlcInfo != null) {
            this.DlcInfo = new DlcInfo(source.DlcInfo);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
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
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamObj(map, prefix + "DlcInfo.", this.DlcInfo);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "AutoCreateField", this.AutoCreateField);
        this.setParamObj(map, prefix + "DlcFailHandle.", this.DlcFailHandle);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);

    }
}

