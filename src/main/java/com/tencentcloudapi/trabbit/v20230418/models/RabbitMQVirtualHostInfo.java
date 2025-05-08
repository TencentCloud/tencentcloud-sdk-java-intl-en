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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQVirtualHostInfo extends AbstractModel {

    /**
    * instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost name.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Specifies the description information of the vhost.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Specifies the Tag of the vhost.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Specifies the overview statistics information of the vhost.
    */
    @SerializedName("VirtualHostStatistics")
    @Expose
    private RabbitMQVirtualHostStatistics VirtualHostStatistics;

    /**
    * vhost status. specifies the status that corresponds to the native console and can be running, partial, stopped, or unknown.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Specifies the number of message backlogs.
    */
    @SerializedName("MessageHeapCount")
    @Expose
    private Long MessageHeapCount;

    /**
    * Input message rate.
    */
    @SerializedName("MessageRateIn")
    @Expose
    private Float MessageRateIn;

    /**
    * Output message rate.
    */
    @SerializedName("MessageRateOut")
    @Expose
    private Float MessageRateOut;

    /**
    * Specifies whether a mirrored queue policy exists. true indicates existence, and false indicates non-existence.
    */
    @SerializedName("MirrorQueuePolicyFlag")
    @Expose
    private Boolean MirrorQueuePolicyFlag;

    /**
     * Get instance ID 
     * @return InstanceId instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set instance ID
     * @param InstanceId instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost name. 
     * @return VirtualHost Vhost name.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost name.
     * @param VirtualHost Vhost name.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Specifies the description information of the vhost. 
     * @return Description Specifies the description information of the vhost.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Specifies the description information of the vhost.
     * @param Description Specifies the description information of the vhost.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Specifies the Tag of the vhost. 
     * @return Tags Specifies the Tag of the vhost.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Specifies the Tag of the vhost.
     * @param Tags Specifies the Tag of the vhost.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Specifies the overview statistics information of the vhost. 
     * @return VirtualHostStatistics Specifies the overview statistics information of the vhost.
     */
    public RabbitMQVirtualHostStatistics getVirtualHostStatistics() {
        return this.VirtualHostStatistics;
    }

    /**
     * Set Specifies the overview statistics information of the vhost.
     * @param VirtualHostStatistics Specifies the overview statistics information of the vhost.
     */
    public void setVirtualHostStatistics(RabbitMQVirtualHostStatistics VirtualHostStatistics) {
        this.VirtualHostStatistics = VirtualHostStatistics;
    }

    /**
     * Get vhost status. specifies the status that corresponds to the native console and can be running, partial, stopped, or unknown. 
     * @return Status vhost status. specifies the status that corresponds to the native console and can be running, partial, stopped, or unknown.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set vhost status. specifies the status that corresponds to the native console and can be running, partial, stopped, or unknown.
     * @param Status vhost status. specifies the status that corresponds to the native console and can be running, partial, stopped, or unknown.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies the number of message backlogs. 
     * @return MessageHeapCount Specifies the number of message backlogs.
     */
    public Long getMessageHeapCount() {
        return this.MessageHeapCount;
    }

    /**
     * Set Specifies the number of message backlogs.
     * @param MessageHeapCount Specifies the number of message backlogs.
     */
    public void setMessageHeapCount(Long MessageHeapCount) {
        this.MessageHeapCount = MessageHeapCount;
    }

    /**
     * Get Input message rate. 
     * @return MessageRateIn Input message rate.
     */
    public Float getMessageRateIn() {
        return this.MessageRateIn;
    }

    /**
     * Set Input message rate.
     * @param MessageRateIn Input message rate.
     */
    public void setMessageRateIn(Float MessageRateIn) {
        this.MessageRateIn = MessageRateIn;
    }

    /**
     * Get Output message rate. 
     * @return MessageRateOut Output message rate.
     */
    public Float getMessageRateOut() {
        return this.MessageRateOut;
    }

    /**
     * Set Output message rate.
     * @param MessageRateOut Output message rate.
     */
    public void setMessageRateOut(Float MessageRateOut) {
        this.MessageRateOut = MessageRateOut;
    }

    /**
     * Get Specifies whether a mirrored queue policy exists. true indicates existence, and false indicates non-existence. 
     * @return MirrorQueuePolicyFlag Specifies whether a mirrored queue policy exists. true indicates existence, and false indicates non-existence.
     */
    public Boolean getMirrorQueuePolicyFlag() {
        return this.MirrorQueuePolicyFlag;
    }

    /**
     * Set Specifies whether a mirrored queue policy exists. true indicates existence, and false indicates non-existence.
     * @param MirrorQueuePolicyFlag Specifies whether a mirrored queue policy exists. true indicates existence, and false indicates non-existence.
     */
    public void setMirrorQueuePolicyFlag(Boolean MirrorQueuePolicyFlag) {
        this.MirrorQueuePolicyFlag = MirrorQueuePolicyFlag;
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MessageHeapCount", this.MessageHeapCount);
        this.setParamSimple(map, prefix + "MessageRateIn", this.MessageRateIn);
        this.setParamSimple(map, prefix + "MessageRateOut", this.MessageRateOut);
        this.setParamSimple(map, prefix + "MirrorQueuePolicyFlag", this.MirrorQueuePolicyFlag);

    }
}

