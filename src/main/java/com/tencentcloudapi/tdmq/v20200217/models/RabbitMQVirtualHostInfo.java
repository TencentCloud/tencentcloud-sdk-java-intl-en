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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQVirtualHostInfo extends AbstractModel {

    /**
    * Cluster instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost name
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Vhost description information.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Vhost tags.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Vhost overview statistics information.
    */
    @SerializedName("VirtualHostStatistics")
    @Expose
    private RabbitMQVirtualHostStatistics VirtualHostStatistics;

    /**
    * Message trace enabling status. true: enabled; false: disabled.
    */
    @SerializedName("TraceFlag")
    @Expose
    private Boolean TraceFlag;

    /**
    * Vhost status, which corresponds to status in the native product console. Valid values: running, partial, stopped, and unknown.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Message backlog count.
    */
    @SerializedName("MessageHeapCount")
    @Expose
    private Long MessageHeapCount;

    /**
    * Message input rate.
    */
    @SerializedName("MessageRateIn")
    @Expose
    private Float MessageRateIn;

    /**
    * Message output rate.
    */
    @SerializedName("MessageRateOut")
    @Expose
    private Float MessageRateOut;

    /**
    * Whether an image queue policy exists. true: Exists; false: Does not exist.
    */
    @SerializedName("MirrorQueuePolicyFlag")
    @Expose
    private Boolean MirrorQueuePolicyFlag;

    /**
    * Creation timestamp.
    */
    @SerializedName("CreateTs")
    @Expose
    private Long CreateTs;

    /**
    * Modification timestamp.
    */
    @SerializedName("ModifyTs")
    @Expose
    private Long ModifyTs;

    /**
     * Get Cluster instance ID 
     * @return InstanceId Cluster instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID
     * @param InstanceId Cluster instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost name 
     * @return VirtualHost Vhost name
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost name
     * @param VirtualHost Vhost name
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Vhost description information. 
     * @return Description Vhost description information.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Vhost description information.
     * @param Description Vhost description information.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Vhost tags. 
     * @return Tags Vhost tags.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Vhost tags.
     * @param Tags Vhost tags.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time. 
     * @return ModifyTime Modification time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time.
     * @param ModifyTime Modification time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Vhost overview statistics information. 
     * @return VirtualHostStatistics Vhost overview statistics information.
     */
    public RabbitMQVirtualHostStatistics getVirtualHostStatistics() {
        return this.VirtualHostStatistics;
    }

    /**
     * Set Vhost overview statistics information.
     * @param VirtualHostStatistics Vhost overview statistics information.
     */
    public void setVirtualHostStatistics(RabbitMQVirtualHostStatistics VirtualHostStatistics) {
        this.VirtualHostStatistics = VirtualHostStatistics;
    }

    /**
     * Get Message trace enabling status. true: enabled; false: disabled. 
     * @return TraceFlag Message trace enabling status. true: enabled; false: disabled.
     */
    public Boolean getTraceFlag() {
        return this.TraceFlag;
    }

    /**
     * Set Message trace enabling status. true: enabled; false: disabled.
     * @param TraceFlag Message trace enabling status. true: enabled; false: disabled.
     */
    public void setTraceFlag(Boolean TraceFlag) {
        this.TraceFlag = TraceFlag;
    }

    /**
     * Get Vhost status, which corresponds to status in the native product console. Valid values: running, partial, stopped, and unknown. 
     * @return Status Vhost status, which corresponds to status in the native product console. Valid values: running, partial, stopped, and unknown.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Vhost status, which corresponds to status in the native product console. Valid values: running, partial, stopped, and unknown.
     * @param Status Vhost status, which corresponds to status in the native product console. Valid values: running, partial, stopped, and unknown.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Message backlog count. 
     * @return MessageHeapCount Message backlog count.
     */
    public Long getMessageHeapCount() {
        return this.MessageHeapCount;
    }

    /**
     * Set Message backlog count.
     * @param MessageHeapCount Message backlog count.
     */
    public void setMessageHeapCount(Long MessageHeapCount) {
        this.MessageHeapCount = MessageHeapCount;
    }

    /**
     * Get Message input rate. 
     * @return MessageRateIn Message input rate.
     */
    public Float getMessageRateIn() {
        return this.MessageRateIn;
    }

    /**
     * Set Message input rate.
     * @param MessageRateIn Message input rate.
     */
    public void setMessageRateIn(Float MessageRateIn) {
        this.MessageRateIn = MessageRateIn;
    }

    /**
     * Get Message output rate. 
     * @return MessageRateOut Message output rate.
     */
    public Float getMessageRateOut() {
        return this.MessageRateOut;
    }

    /**
     * Set Message output rate.
     * @param MessageRateOut Message output rate.
     */
    public void setMessageRateOut(Float MessageRateOut) {
        this.MessageRateOut = MessageRateOut;
    }

    /**
     * Get Whether an image queue policy exists. true: Exists; false: Does not exist. 
     * @return MirrorQueuePolicyFlag Whether an image queue policy exists. true: Exists; false: Does not exist.
     */
    public Boolean getMirrorQueuePolicyFlag() {
        return this.MirrorQueuePolicyFlag;
    }

    /**
     * Set Whether an image queue policy exists. true: Exists; false: Does not exist.
     * @param MirrorQueuePolicyFlag Whether an image queue policy exists. true: Exists; false: Does not exist.
     */
    public void setMirrorQueuePolicyFlag(Boolean MirrorQueuePolicyFlag) {
        this.MirrorQueuePolicyFlag = MirrorQueuePolicyFlag;
    }

    /**
     * Get Creation timestamp. 
     * @return CreateTs Creation timestamp.
     */
    public Long getCreateTs() {
        return this.CreateTs;
    }

    /**
     * Set Creation timestamp.
     * @param CreateTs Creation timestamp.
     */
    public void setCreateTs(Long CreateTs) {
        this.CreateTs = CreateTs;
    }

    /**
     * Get Modification timestamp. 
     * @return ModifyTs Modification timestamp.
     */
    public Long getModifyTs() {
        return this.ModifyTs;
    }

    /**
     * Set Modification timestamp.
     * @param ModifyTs Modification timestamp.
     */
    public void setModifyTs(Long ModifyTs) {
        this.ModifyTs = ModifyTs;
    }

    public RabbitMQVirtualHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQVirtualHostInfo(RabbitMQVirtualHostInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.VirtualHostStatistics != null) {
            this.VirtualHostStatistics = new RabbitMQVirtualHostStatistics(source.VirtualHostStatistics);
        }
        if (source.TraceFlag != null) {
            this.TraceFlag = new Boolean(source.TraceFlag);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.MessageHeapCount != null) {
            this.MessageHeapCount = new Long(source.MessageHeapCount);
        }
        if (source.MessageRateIn != null) {
            this.MessageRateIn = new Float(source.MessageRateIn);
        }
        if (source.MessageRateOut != null) {
            this.MessageRateOut = new Float(source.MessageRateOut);
        }
        if (source.MirrorQueuePolicyFlag != null) {
            this.MirrorQueuePolicyFlag = new Boolean(source.MirrorQueuePolicyFlag);
        }
        if (source.CreateTs != null) {
            this.CreateTs = new Long(source.CreateTs);
        }
        if (source.ModifyTs != null) {
            this.ModifyTs = new Long(source.ModifyTs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamObj(map, prefix + "VirtualHostStatistics.", this.VirtualHostStatistics);
        this.setParamSimple(map, prefix + "TraceFlag", this.TraceFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MessageHeapCount", this.MessageHeapCount);
        this.setParamSimple(map, prefix + "MessageRateIn", this.MessageRateIn);
        this.setParamSimple(map, prefix + "MessageRateOut", this.MessageRateOut);
        this.setParamSimple(map, prefix + "MirrorQueuePolicyFlag", this.MirrorQueuePolicyFlag);
        this.setParamSimple(map, prefix + "CreateTs", this.CreateTs);
        this.setParamSimple(map, prefix + "ModifyTs", this.ModifyTs);

    }
}

