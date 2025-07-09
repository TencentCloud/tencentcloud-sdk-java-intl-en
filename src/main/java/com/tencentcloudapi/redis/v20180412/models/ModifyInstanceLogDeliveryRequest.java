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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceLogDeliveryRequest extends AbstractModel {

    /**
    * Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Log type. Currently, only slowlog is supported, indicating the slow query log.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Whether log shopping is enabled.
- true: enabled.
- false: disabled.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * ID of the shipped logset, which can be obtained through the sub-parameter **LogsetId** of the response parameter **SlowLog** of the API [DescribeInstanceLogDelivery](https://intl.cloud.tencent.com/document/product/239/110878?from_cn_redirect=1).
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * ID of the shipped log topic, which can be obtained through the sub-parameter **TopicId** of the response parameter **SlowLog** of the API [DescribeInstanceLogDelivery](https://intl.cloud.tencent.com/document/product/239/110878?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Logset name. If **LogsetId** is not specified, this parameter needs to be configured and the system will automatically create a logset with the specified name.
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * Log topic name. This parameter is required when TopicId is empty, and the system will automatically create a log topic.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Region where the logset is located. If it is not provided, the region where the instance is located will be used by default.
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
    * Log storage duration. Default value: 30 days. Value range: 1 to 3600 days.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Whether to create an index when creating a log topic.
    */
    @SerializedName("CreateIndex")
    @Expose
    private Boolean CreateIndex;

    /**
     * Get Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list. 
     * @return InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     * @param InstanceId Instance ID. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy it in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Log type. Currently, only slowlog is supported, indicating the slow query log. 
     * @return LogType Log type. Currently, only slowlog is supported, indicating the slow query log.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type. Currently, only slowlog is supported, indicating the slow query log.
     * @param LogType Log type. Currently, only slowlog is supported, indicating the slow query log.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Whether log shopping is enabled.
- true: enabled.
- false: disabled. 
     * @return Enabled Whether log shopping is enabled.
- true: enabled.
- false: disabled.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether log shopping is enabled.
- true: enabled.
- false: disabled.
     * @param Enabled Whether log shopping is enabled.
- true: enabled.
- false: disabled.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get ID of the shipped logset, which can be obtained through the sub-parameter **LogsetId** of the response parameter **SlowLog** of the API [DescribeInstanceLogDelivery](https://intl.cloud.tencent.com/document/product/239/110878?from_cn_redirect=1). 
     * @return LogsetId ID of the shipped logset, which can be obtained through the sub-parameter **LogsetId** of the response parameter **SlowLog** of the API [DescribeInstanceLogDelivery](https://intl.cloud.tencent.com/document/product/239/110878?from_cn_redirect=1).
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set ID of the shipped logset, which can be obtained through the sub-parameter **LogsetId** of the response parameter **SlowLog** of the API [DescribeInstanceLogDelivery](https://intl.cloud.tencent.com/document/product/239/110878?from_cn_redirect=1).
     * @param LogsetId ID of the shipped logset, which can be obtained through the sub-parameter **LogsetId** of the response parameter **SlowLog** of the API [DescribeInstanceLogDelivery](https://intl.cloud.tencent.com/document/product/239/110878?from_cn_redirect=1).
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get ID of the shipped log topic, which can be obtained through the sub-parameter **TopicId** of the response parameter **SlowLog** of the API [DescribeInstanceLogDelivery](https://intl.cloud.tencent.com/document/product/239/110878?from_cn_redirect=1). 
     * @return TopicId ID of the shipped log topic, which can be obtained through the sub-parameter **TopicId** of the response parameter **SlowLog** of the API [DescribeInstanceLogDelivery](https://intl.cloud.tencent.com/document/product/239/110878?from_cn_redirect=1).
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set ID of the shipped log topic, which can be obtained through the sub-parameter **TopicId** of the response parameter **SlowLog** of the API [DescribeInstanceLogDelivery](https://intl.cloud.tencent.com/document/product/239/110878?from_cn_redirect=1).
     * @param TopicId ID of the shipped log topic, which can be obtained through the sub-parameter **TopicId** of the response parameter **SlowLog** of the API [DescribeInstanceLogDelivery](https://intl.cloud.tencent.com/document/product/239/110878?from_cn_redirect=1).
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Logset name. If **LogsetId** is not specified, this parameter needs to be configured and the system will automatically create a logset with the specified name. 
     * @return LogsetName Logset name. If **LogsetId** is not specified, this parameter needs to be configured and the system will automatically create a logset with the specified name.
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set Logset name. If **LogsetId** is not specified, this parameter needs to be configured and the system will automatically create a logset with the specified name.
     * @param LogsetName Logset name. If **LogsetId** is not specified, this parameter needs to be configured and the system will automatically create a logset with the specified name.
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get Log topic name. This parameter is required when TopicId is empty, and the system will automatically create a log topic. 
     * @return TopicName Log topic name. This parameter is required when TopicId is empty, and the system will automatically create a log topic.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Log topic name. This parameter is required when TopicId is empty, and the system will automatically create a log topic.
     * @param TopicName Log topic name. This parameter is required when TopicId is empty, and the system will automatically create a log topic.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Region where the logset is located. If it is not provided, the region where the instance is located will be used by default. 
     * @return LogRegion Region where the logset is located. If it is not provided, the region where the instance is located will be used by default.
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set Region where the logset is located. If it is not provided, the region where the instance is located will be used by default.
     * @param LogRegion Region where the logset is located. If it is not provided, the region where the instance is located will be used by default.
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    /**
     * Get Log storage duration. Default value: 30 days. Value range: 1 to 3600 days. 
     * @return Period Log storage duration. Default value: 30 days. Value range: 1 to 3600 days.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Log storage duration. Default value: 30 days. Value range: 1 to 3600 days.
     * @param Period Log storage duration. Default value: 30 days. Value range: 1 to 3600 days.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Whether to create an index when creating a log topic. 
     * @return CreateIndex Whether to create an index when creating a log topic.
     */
    public Boolean getCreateIndex() {
        return this.CreateIndex;
    }

    /**
     * Set Whether to create an index when creating a log topic.
     * @param CreateIndex Whether to create an index when creating a log topic.
     */
    public void setCreateIndex(Boolean CreateIndex) {
        this.CreateIndex = CreateIndex;
    }

    public ModifyInstanceLogDeliveryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceLogDeliveryRequest(ModifyInstanceLogDeliveryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.LogRegion != null) {
            this.LogRegion = new String(source.LogRegion);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.CreateIndex != null) {
            this.CreateIndex = new Boolean(source.CreateIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "CreateIndex", this.CreateIndex);

    }
}

