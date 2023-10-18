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
    * Vhost description
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Vhost tag
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Creation time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Statistics of vhost overview
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirtualHostStatistics")
    @Expose
    private RabbitMQVirtualHostStatistics VirtualHostStatistics;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("MessageHeapCount")
    @Expose
    private Long MessageHeapCount;

    /**
    * 
    */
    @SerializedName("MessageRateIn")
    @Expose
    private Float MessageRateIn;

    /**
    * 
    */
    @SerializedName("MessageRateOut")
    @Expose
    private Float MessageRateOut;

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
     * Get Vhost description
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return Description Vhost description
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Vhost description
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param Description Vhost description
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Vhost tag
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return Tags Vhost tag
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Vhost tag
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param Tags Vhost tag
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Creation time
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Modification time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Modification time
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Statistics of vhost overview
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return VirtualHostStatistics Statistics of vhost overview
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public RabbitMQVirtualHostStatistics getVirtualHostStatistics() {
        return this.VirtualHostStatistics;
    }

    /**
     * Set Statistics of vhost overview
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param VirtualHostStatistics Statistics of vhost overview
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setVirtualHostStatistics(RabbitMQVirtualHostStatistics VirtualHostStatistics) {
        this.VirtualHostStatistics = VirtualHostStatistics;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return MessageHeapCount 
     */
    public Long getMessageHeapCount() {
        return this.MessageHeapCount;
    }

    /**
     * Set 
     * @param MessageHeapCount 
     */
    public void setMessageHeapCount(Long MessageHeapCount) {
        this.MessageHeapCount = MessageHeapCount;
    }

    /**
     * Get  
     * @return MessageRateIn 
     */
    public Float getMessageRateIn() {
        return this.MessageRateIn;
    }

    /**
     * Set 
     * @param MessageRateIn 
     */
    public void setMessageRateIn(Float MessageRateIn) {
        this.MessageRateIn = MessageRateIn;
    }

    /**
     * Get  
     * @return MessageRateOut 
     */
    public Float getMessageRateOut() {
        return this.MessageRateOut;
    }

    /**
     * Set 
     * @param MessageRateOut 
     */
    public void setMessageRateOut(Float MessageRateOut) {
        this.MessageRateOut = MessageRateOut;
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

    }
}

