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

public class ConsumerInfo extends AbstractModel {

    /**
    * Shipping rule ID
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Whether the shipping task is effective.
    */
    @SerializedName("Effective")
    @Expose
    private Boolean Effective;

    /**
    * Description of CKafka
    */
    @SerializedName("Ckafka")
    @Expose
    private Ckafka Ckafka;

    /**
    * Whether to ship the log's metadata information
    */
    @SerializedName("NeedContent")
    @Expose
    private Boolean NeedContent;

    /**
    * Description of the metadata information to be shipped
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Content")
    @Expose
    private ConsumerContent Content;

    /**
    * Compression mode [0:NONE；2:SNAPPY；3:LZ4]
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
    * Creation time of a shipping task (a millisecond-level timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * ARN (Access Role Name) [Create role](https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1)	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * External ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * Task running status. Valid values: 0: stopped; 1: running; 2: abnormal.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * Advanced configuration
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private AdvancedConsumerConfiguration AdvancedConfig;

    /**
     * Get Shipping rule ID 
     * @return ConsumerId Shipping rule ID
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set Shipping rule ID
     * @param ConsumerId Shipping rule ID
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
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
     * Get Whether the shipping task is effective. 
     * @return Effective Whether the shipping task is effective.
     */
    public Boolean getEffective() {
        return this.Effective;
    }

    /**
     * Set Whether the shipping task is effective.
     * @param Effective Whether the shipping task is effective.
     */
    public void setEffective(Boolean Effective) {
        this.Effective = Effective;
    }

    /**
     * Get Description of CKafka 
     * @return Ckafka Description of CKafka
     */
    public Ckafka getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set Description of CKafka
     * @param Ckafka Description of CKafka
     */
    public void setCkafka(Ckafka Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * Get Whether to ship the log's metadata information 
     * @return NeedContent Whether to ship the log's metadata information
     */
    public Boolean getNeedContent() {
        return this.NeedContent;
    }

    /**
     * Set Whether to ship the log's metadata information
     * @param NeedContent Whether to ship the log's metadata information
     */
    public void setNeedContent(Boolean NeedContent) {
        this.NeedContent = NeedContent;
    }

    /**
     * Get Description of the metadata information to be shipped
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Content Description of the metadata information to be shipped
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ConsumerContent getContent() {
        return this.Content;
    }

    /**
     * Set Description of the metadata information to be shipped
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Content Description of the metadata information to be shipped
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContent(ConsumerContent Content) {
        this.Content = Content;
    }

    /**
     * Get Compression mode [0:NONE；2:SNAPPY；3:LZ4]
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Compression Compression mode [0:NONE；2:SNAPPY；3:LZ4]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set Compression mode [0:NONE；2:SNAPPY；3:LZ4]
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Compression Compression mode [0:NONE；2:SNAPPY；3:LZ4]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    /**
     * Get Creation time of a shipping task (a millisecond-level timestamp).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time of a shipping task (a millisecond-level timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of a shipping task (a millisecond-level timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time of a shipping task (a millisecond-level timestamp).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get ARN (Access Role Name) [Create role](https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1)	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleArn ARN (Access Role Name) [Create role](https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1)	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set ARN (Access Role Name) [Create role](https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1)	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleArn ARN (Access Role Name) [Create role](https://www.tencentcloud.com/document/product/598/19381?from_cn_redirect=1)	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get External ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExternalId External ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set External ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExternalId External ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get Task running status. Valid values: 0: stopped; 1: running; 2: abnormal.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskStatus Task running status. Valid values: 0: stopped; 1: running; 2: abnormal.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task running status. Valid values: 0: stopped; 1: running; 2: abnormal.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskStatus Task running status. Valid values: 0: stopped; 1: running; 2: abnormal.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Advanced configuration 
     * @return AdvancedConfig Advanced configuration
     */
    public AdvancedConsumerConfiguration getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set Advanced configuration
     * @param AdvancedConfig Advanced configuration
     */
    public void setAdvancedConfig(AdvancedConsumerConfiguration AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    public ConsumerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerInfo(ConsumerInfo source) {
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Effective != null) {
            this.Effective = new Boolean(source.Effective);
        }
        if (source.Ckafka != null) {
            this.Ckafka = new Ckafka(source.Ckafka);
        }
        if (source.NeedContent != null) {
            this.NeedContent = new Boolean(source.NeedContent);
        }
        if (source.Content != null) {
            this.Content = new ConsumerContent(source.Content);
        }
        if (source.Compression != null) {
            this.Compression = new Long(source.Compression);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new AdvancedConsumerConfiguration(source.AdvancedConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Effective", this.Effective);
        this.setParamObj(map, prefix + "Ckafka.", this.Ckafka);
        this.setParamSimple(map, prefix + "NeedContent", this.NeedContent);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "Compression", this.Compression);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamObj(map, prefix + "AdvancedConfig.", this.AdvancedConfig);

    }
}

