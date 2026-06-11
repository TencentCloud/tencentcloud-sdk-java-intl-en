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

public class ModifySplunkDeliverRequest extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>log topic id</p><ul><li>Obtain the log topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Log Topic List</a>.</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>The delivery task name has the following restrictions: - Cannot be empty - Length not greater than 256 - Can only contain aA-zZ, underscore, -, 0-9</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Task enable status. Valid values: 0: disabled; 1: enabled.</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>splunk delivery task - target configuration</p>
    */
    @SerializedName("NetInfo")
    @Expose
    private NetInfo NetInfo;

    /**
    * <p>splunk delivery task meta information</p>
    */
    @SerializedName("MetadataInfo")
    @Expose
    private MetadataInfo MetadataInfo;

    /**
    * <p>Whether to enable the service log; 1: Disabled; 2: Enabled</p>
    */
    @SerializedName("HasServiceLog")
    @Expose
    private Long HasServiceLog;

    /**
    * <p>Advanced configuration - Whether to enable the indexer;<br>1 - Disable; 2 - Enable; Default: 1</p>
    */
    @SerializedName("IndexAck")
    @Expose
    private Long IndexAck;

    /**
    * <p>Advanced configuration - data source; no more than 64 characters</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Advanced configuration - data source type; no more than 64 characters</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>Advanced configuration - Indexes written to Splunk; no more than 64 characters</p>
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * <p>Advanced configuration - Channel.<br>To meet the limitation: If the indexer is enabled, the value cannot be empty.</p>
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * <p>Pre-filtering process - filter out original data before writing to Splunk</p>
    */
    @SerializedName("DSLFilter")
    @Expose
    private String DSLFilter;

    /**
    * <p>Advanced configuration - Cross-account delivery user role authorization information</p><p>For reference: <a href="https://console.cloud.tencent.com/cam/role/create?payloadType=account">Create custom role</a></p>
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
     * Get <p>The delivery task name has the following restrictions: - Cannot be empty - Length not greater than 256 - Can only contain aA-zZ, underscore, -, 0-9</p> 
     * @return Name <p>The delivery task name has the following restrictions: - Cannot be empty - Length not greater than 256 - Can only contain aA-zZ, underscore, -, 0-9</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>The delivery task name has the following restrictions: - Cannot be empty - Length not greater than 256 - Can only contain aA-zZ, underscore, -, 0-9</p>
     * @param Name <p>The delivery task name has the following restrictions: - Cannot be empty - Length not greater than 256 - Can only contain aA-zZ, underscore, -, 0-9</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Task enable status. Valid values: 0: disabled; 1: enabled.</p> 
     * @return Enable <p>Task enable status. Valid values: 0: disabled; 1: enabled.</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Task enable status. Valid values: 0: disabled; 1: enabled.</p>
     * @param Enable <p>Task enable status. Valid values: 0: disabled; 1: enabled.</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
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
     * Get <p>splunk delivery task meta information</p> 
     * @return MetadataInfo <p>splunk delivery task meta information</p>
     */
    public MetadataInfo getMetadataInfo() {
        return this.MetadataInfo;
    }

    /**
     * Set <p>splunk delivery task meta information</p>
     * @param MetadataInfo <p>splunk delivery task meta information</p>
     */
    public void setMetadataInfo(MetadataInfo MetadataInfo) {
        this.MetadataInfo = MetadataInfo;
    }

    /**
     * Get <p>Whether to enable the service log; 1: Disabled; 2: Enabled</p> 
     * @return HasServiceLog <p>Whether to enable the service log; 1: Disabled; 2: Enabled</p>
     */
    public Long getHasServiceLog() {
        return this.HasServiceLog;
    }

    /**
     * Set <p>Whether to enable the service log; 1: Disabled; 2: Enabled</p>
     * @param HasServiceLog <p>Whether to enable the service log; 1: Disabled; 2: Enabled</p>
     */
    public void setHasServiceLog(Long HasServiceLog) {
        this.HasServiceLog = HasServiceLog;
    }

    /**
     * Get <p>Advanced configuration - Whether to enable the indexer;<br>1 - Disable; 2 - Enable; Default: 1</p> 
     * @return IndexAck <p>Advanced configuration - Whether to enable the indexer;<br>1 - Disable; 2 - Enable; Default: 1</p>
     */
    public Long getIndexAck() {
        return this.IndexAck;
    }

    /**
     * Set <p>Advanced configuration - Whether to enable the indexer;<br>1 - Disable; 2 - Enable; Default: 1</p>
     * @param IndexAck <p>Advanced configuration - Whether to enable the indexer;<br>1 - Disable; 2 - Enable; Default: 1</p>
     */
    public void setIndexAck(Long IndexAck) {
        this.IndexAck = IndexAck;
    }

    /**
     * Get <p>Advanced configuration - data source; no more than 64 characters</p> 
     * @return Source <p>Advanced configuration - data source; no more than 64 characters</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Advanced configuration - data source; no more than 64 characters</p>
     * @param Source <p>Advanced configuration - data source; no more than 64 characters</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Advanced configuration - data source type; no more than 64 characters</p> 
     * @return SourceType <p>Advanced configuration - data source type; no more than 64 characters</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>Advanced configuration - data source type; no more than 64 characters</p>
     * @param SourceType <p>Advanced configuration - data source type; no more than 64 characters</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>Advanced configuration - Indexes written to Splunk; no more than 64 characters</p> 
     * @return Index <p>Advanced configuration - Indexes written to Splunk; no more than 64 characters</p>
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set <p>Advanced configuration - Indexes written to Splunk; no more than 64 characters</p>
     * @param Index <p>Advanced configuration - Indexes written to Splunk; no more than 64 characters</p>
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get <p>Advanced configuration - Channel.<br>To meet the limitation: If the indexer is enabled, the value cannot be empty.</p> 
     * @return Channel <p>Advanced configuration - Channel.<br>To meet the limitation: If the indexer is enabled, the value cannot be empty.</p>
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>Advanced configuration - Channel.<br>To meet the limitation: If the indexer is enabled, the value cannot be empty.</p>
     * @param Channel <p>Advanced configuration - Channel.<br>To meet the limitation: If the indexer is enabled, the value cannot be empty.</p>
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get <p>Pre-filtering process - filter out original data before writing to Splunk</p> 
     * @return DSLFilter <p>Pre-filtering process - filter out original data before writing to Splunk</p>
     */
    public String getDSLFilter() {
        return this.DSLFilter;
    }

    /**
     * Set <p>Pre-filtering process - filter out original data before writing to Splunk</p>
     * @param DSLFilter <p>Pre-filtering process - filter out original data before writing to Splunk</p>
     */
    public void setDSLFilter(String DSLFilter) {
        this.DSLFilter = DSLFilter;
    }

    /**
     * Get <p>Advanced configuration - Cross-account delivery user role authorization information</p><p>For reference: <a href="https://console.cloud.tencent.com/cam/role/create?payloadType=account">Create custom role</a></p> 
     * @return ExternalRole <p>Advanced configuration - Cross-account delivery user role authorization information</p><p>For reference: <a href="https://console.cloud.tencent.com/cam/role/create?payloadType=account">Create custom role</a></p>
     */
    public ExternalRole getExternalRole() {
        return this.ExternalRole;
    }

    /**
     * Set <p>Advanced configuration - Cross-account delivery user role authorization information</p><p>For reference: <a href="https://console.cloud.tencent.com/cam/role/create?payloadType=account">Create custom role</a></p>
     * @param ExternalRole <p>Advanced configuration - Cross-account delivery user role authorization information</p><p>For reference: <a href="https://console.cloud.tencent.com/cam/role/create?payloadType=account">Create custom role</a></p>
     */
    public void setExternalRole(ExternalRole ExternalRole) {
        this.ExternalRole = ExternalRole;
    }

    public ModifySplunkDeliverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySplunkDeliverRequest(ModifySplunkDeliverRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.NetInfo != null) {
            this.NetInfo = new NetInfo(source.NetInfo);
        }
        if (source.MetadataInfo != null) {
            this.MetadataInfo = new MetadataInfo(source.MetadataInfo);
        }
        if (source.HasServiceLog != null) {
            this.HasServiceLog = new Long(source.HasServiceLog);
        }
        if (source.IndexAck != null) {
            this.IndexAck = new Long(source.IndexAck);
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
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamObj(map, prefix + "NetInfo.", this.NetInfo);
        this.setParamObj(map, prefix + "MetadataInfo.", this.MetadataInfo);
        this.setParamSimple(map, prefix + "HasServiceLog", this.HasServiceLog);
        this.setParamSimple(map, prefix + "IndexAck", this.IndexAck);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "DSLFilter", this.DSLFilter);
        this.setParamObj(map, prefix + "ExternalRole.", this.ExternalRole);

    }
}

