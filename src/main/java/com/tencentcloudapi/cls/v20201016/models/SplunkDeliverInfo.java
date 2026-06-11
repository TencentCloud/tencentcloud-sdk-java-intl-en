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

public class SplunkDeliverInfo extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task Name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>User id</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>Log topic id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Task status; 1. Running; 2. Suspended; 3. Exception</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Enable status; 0: Disabled; 1: Enabled</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>Creation time; unit: second</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Update time; Unit: seconds</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>splunk delivery task - target configuration</p>
    */
    @SerializedName("NetInfo")
    @Expose
    private NetInfo NetInfo;

    /**
    * <p>splunk delivery task meta-information</p>
    */
    @SerializedName("Metadata")
    @Expose
    private MetadataInfo Metadata;

    /**
    * <p>Whether to enable service logs; 1: disable; 2: enable</p>
    */
    @SerializedName("HasServiceLog")
    @Expose
    private Long HasServiceLog;

    /**
    * <p>Advanced configuration - data source;</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Advanced configuration - data source type;</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>Advanced configuration - Splunk write indexes</p>
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * <p>Advanced configuration - Whether to enable indexer; 1 - not enabled; 2 - enable;</p>
    */
    @SerializedName("IndexAck")
    @Expose
    private Long IndexAck;

    /**
    * <p>Advanced configuration - Channel</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>Pre-filtering process - perform pre-filtering statements on original data written to Splunk</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
    * <p>Advanced configuration - Cross-account delivery parameter</p>
    */
    @SerializedName("ExternalRole")
    @Expose
    private ExternalRole ExternalRole;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task Name</p> 
     * @return Name <p>Task Name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Task Name</p>
     * @param Name <p>Task Name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>User id</p> 
     * @return Uin <p>User id</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>User id</p>
     * @param Uin <p>User id</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Log topic id</p> 
     * @return TopicId <p>Log topic id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Log topic id</p>
     * @param TopicId <p>Log topic id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Task status; 1. Running; 2. Suspended; 3. Exception</p> 
     * @return Status <p>Task status; 1. Running; 2. Suspended; 3. Exception</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status; 1. Running; 2. Suspended; 3. Exception</p>
     * @param Status <p>Task status; 1. Running; 2. Suspended; 3. Exception</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Enable status; 0: Disabled; 1: Enabled</p> 
     * @return Enable <p>Enable status; 0: Disabled; 1: Enabled</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Enable status; 0: Disabled; 1: Enabled</p>
     * @param Enable <p>Enable status; 0: Disabled; 1: Enabled</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Creation time; unit: second</p> 
     * @return CreateTime <p>Creation time; unit: second</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time; unit: second</p>
     * @param CreateTime <p>Creation time; unit: second</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time; Unit: seconds</p> 
     * @return UpdateTime <p>Update time; Unit: seconds</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time; Unit: seconds</p>
     * @param UpdateTime <p>Update time; Unit: seconds</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>splunk delivery task - target configuration</p> 
     * @return NetInfo <p>splunk delivery task - target configuration</p>
     */
    public NetInfo getNetInfo() {
        return this.NetInfo;
    }

    /**
     * Set <p>splunk delivery task - target configuration</p>
     * @param NetInfo <p>splunk delivery task - target configuration</p>
     */
    public void setNetInfo(NetInfo NetInfo) {
        this.NetInfo = NetInfo;
    }

    /**
     * Get <p>splunk delivery task meta-information</p> 
     * @return Metadata <p>splunk delivery task meta-information</p>
     */
    public MetadataInfo getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>splunk delivery task meta-information</p>
     * @param Metadata <p>splunk delivery task meta-information</p>
     */
    public void setMetadata(MetadataInfo Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>Whether to enable service logs; 1: disable; 2: enable</p> 
     * @return HasServiceLog <p>Whether to enable service logs; 1: disable; 2: enable</p>
     */
    public Long getHasServiceLog() {
        return this.HasServiceLog;
    }

    /**
     * Set <p>Whether to enable service logs; 1: disable; 2: enable</p>
     * @param HasServiceLog <p>Whether to enable service logs; 1: disable; 2: enable</p>
     */
    public void setHasServiceLog(Long HasServiceLog) {
        this.HasServiceLog = HasServiceLog;
    }

    /**
     * Get <p>Advanced configuration - data source;</p> 
     * @return Source <p>Advanced configuration - data source;</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Advanced configuration - data source;</p>
     * @param Source <p>Advanced configuration - data source;</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Advanced configuration - data source type;</p> 
     * @return SourceType <p>Advanced configuration - data source type;</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>Advanced configuration - data source type;</p>
     * @param SourceType <p>Advanced configuration - data source type;</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>Advanced configuration - Splunk write indexes</p> 
     * @return Index <p>Advanced configuration - Splunk write indexes</p>
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set <p>Advanced configuration - Splunk write indexes</p>
     * @param Index <p>Advanced configuration - Splunk write indexes</p>
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get <p>Advanced configuration - Whether to enable indexer; 1 - not enabled; 2 - enable;</p> 
     * @return IndexAck <p>Advanced configuration - Whether to enable indexer; 1 - not enabled; 2 - enable;</p>
     */
    public Long getIndexAck() {
        return this.IndexAck;
    }

    /**
     * Set <p>Advanced configuration - Whether to enable indexer; 1 - not enabled; 2 - enable;</p>
     * @param IndexAck <p>Advanced configuration - Whether to enable indexer; 1 - not enabled; 2 - enable;</p>
     */
    public void setIndexAck(Long IndexAck) {
        this.IndexAck = IndexAck;
    }

    /**
     * Get <p>Advanced configuration - Channel</p> 
     * @return Channel <p>Advanced configuration - Channel</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>Advanced configuration - Channel</p>
     * @param Channel <p>Advanced configuration - Channel</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>Pre-filtering process - perform pre-filtering statements on original data written to Splunk</p> 
     * @return DSLFilter <p>Pre-filtering process - perform pre-filtering statements on original data written to Splunk</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>Pre-filtering process - perform pre-filtering statements on original data written to Splunk</p>
     * @param DSLFilter <p>Pre-filtering process - perform pre-filtering statements on original data written to Splunk</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
    }

    /**
     * Get <p>Advanced configuration - Cross-account delivery parameter</p> 
     * @return ExternalRole <p>Advanced configuration - Cross-account delivery parameter</p>
     */
    public ExternalRole getExternalRole() {
        return this.ExternalRole;
    }

    /**
     * Set <p>Advanced configuration - Cross-account delivery parameter</p>
     * @param ExternalRole <p>Advanced configuration - Cross-account delivery parameter</p>
     */
    public void setExternalRole(ExternalRole ExternalRole) {
        this.ExternalRole = ExternalRole;
    }

    public SplunkDeliverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SplunkDeliverInfo(SplunkDeliverInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.NetInfo != null) {
            this.NetInfo = new NetInfo(source.NetInfo);
        }
        if (source.Metadata != null) {
            this.Metadata = new MetadataInfo(source.Metadata);
        }
        if (source.HasServiceLog != null) {
            this.HasServiceLog = new Long(source.HasServiceLog);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.IndexAck != null) {
            this.IndexAck = new Long(source.IndexAck);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.DSLFilter != null) {
            this.DSLFilter = new String(source.DSLFilter);
        }
        if (source.ExternalRole != null) {
            this.ExternalRole = new ExternalRole(source.ExternalRole);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "NetInfo.", this.NetInfo);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamSimple(map, prefix + "HasServiceLog", this.HasServiceLog);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "IndexAck", this.IndexAck);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);
        this.setParamObj(map, prefix + "ExternalRole.", this.ExternalRole);

    }
}

