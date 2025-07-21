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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNotificationConfigurationRequest extends AbstractModel {

    /**
    * Specifies the notification ID that needs modification. get the notification ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeNotificationConfigurations](https://intl.cloud.tencent.com/document/api/377/33183?from_cn_redirect=1) and getting `AutoScalingNotificationId` from the returned information.
    */
    @SerializedName("AutoScalingNotificationId")
    @Expose
    private String AutoScalingNotificationId;

    /**
    * Notification type, i.e., the set of types of notifications to be subscribed to. Value range:
<li>SCALE_OUT_SUCCESSFUL: scale-out succeeded</li>
<li>SCALE_OUT_FAILED: scale-out failed</li>
<li>SCALE_IN_SUCCESSFUL: scale-in succeeded</li>
<li>SCALE_IN_FAILED: scale-in failed</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL: unhealthy instance replacement succeeded</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED: unhealthy instance replacement failed</li>
    */
    @SerializedName("NotificationTypes")
    @Expose
    private String [] NotificationTypes;

    /**
    * Notification GROUP ID, which is the USER GROUP ID collection. USER GROUP ID can be accessed through [ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1). this parameter is valid only when `TargetType` is `USER_GROUP`.
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
    * The TDMQ CMQ QUEUE name. [the original CMQ is offline](https://intl.cloud.tencent.com/document/product/1496/83970?from_cn_redirect=1). currently, only TDMQ CMQ is recommended for use. this parameter is valid only when `TargetType` is `TDMQ_CMQ_QUEUE`.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * The TDMQ CMQ TOPIC name. [original CMQ is offline](https://intl.cloud.tencent.com/document/product/1496/83970?from_cn_redirect=1). currently, only TDMQ CMQ is recommended for use. this parameter is valid only when `TargetType` is `TDMQ_CMQ_TOPIC`.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get Specifies the notification ID that needs modification. get the notification ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeNotificationConfigurations](https://intl.cloud.tencent.com/document/api/377/33183?from_cn_redirect=1) and getting `AutoScalingNotificationId` from the returned information. 
     * @return AutoScalingNotificationId Specifies the notification ID that needs modification. get the notification ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeNotificationConfigurations](https://intl.cloud.tencent.com/document/api/377/33183?from_cn_redirect=1) and getting `AutoScalingNotificationId` from the returned information.
     */
    public String getAutoScalingNotificationId() {
        return this.AutoScalingNotificationId;
    }

    /**
     * Set Specifies the notification ID that needs modification. get the notification ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeNotificationConfigurations](https://intl.cloud.tencent.com/document/api/377/33183?from_cn_redirect=1) and getting `AutoScalingNotificationId` from the returned information.
     * @param AutoScalingNotificationId Specifies the notification ID that needs modification. get the notification ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeNotificationConfigurations](https://intl.cloud.tencent.com/document/api/377/33183?from_cn_redirect=1) and getting `AutoScalingNotificationId` from the returned information.
     */
    public void setAutoScalingNotificationId(String AutoScalingNotificationId) {
        this.AutoScalingNotificationId = AutoScalingNotificationId;
    }

    /**
     * Get Notification type, i.e., the set of types of notifications to be subscribed to. Value range:
<li>SCALE_OUT_SUCCESSFUL: scale-out succeeded</li>
<li>SCALE_OUT_FAILED: scale-out failed</li>
<li>SCALE_IN_SUCCESSFUL: scale-in succeeded</li>
<li>SCALE_IN_FAILED: scale-in failed</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL: unhealthy instance replacement succeeded</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED: unhealthy instance replacement failed</li> 
     * @return NotificationTypes Notification type, i.e., the set of types of notifications to be subscribed to. Value range:
<li>SCALE_OUT_SUCCESSFUL: scale-out succeeded</li>
<li>SCALE_OUT_FAILED: scale-out failed</li>
<li>SCALE_IN_SUCCESSFUL: scale-in succeeded</li>
<li>SCALE_IN_FAILED: scale-in failed</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL: unhealthy instance replacement succeeded</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED: unhealthy instance replacement failed</li>
     */
    public String [] getNotificationTypes() {
        return this.NotificationTypes;
    }

    /**
     * Set Notification type, i.e., the set of types of notifications to be subscribed to. Value range:
<li>SCALE_OUT_SUCCESSFUL: scale-out succeeded</li>
<li>SCALE_OUT_FAILED: scale-out failed</li>
<li>SCALE_IN_SUCCESSFUL: scale-in succeeded</li>
<li>SCALE_IN_FAILED: scale-in failed</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL: unhealthy instance replacement succeeded</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED: unhealthy instance replacement failed</li>
     * @param NotificationTypes Notification type, i.e., the set of types of notifications to be subscribed to. Value range:
<li>SCALE_OUT_SUCCESSFUL: scale-out succeeded</li>
<li>SCALE_OUT_FAILED: scale-out failed</li>
<li>SCALE_IN_SUCCESSFUL: scale-in succeeded</li>
<li>SCALE_IN_FAILED: scale-in failed</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL: unhealthy instance replacement succeeded</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED: unhealthy instance replacement failed</li>
     */
    public void setNotificationTypes(String [] NotificationTypes) {
        this.NotificationTypes = NotificationTypes;
    }

    /**
     * Get Notification GROUP ID, which is the USER GROUP ID collection. USER GROUP ID can be accessed through [ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1). this parameter is valid only when `TargetType` is `USER_GROUP`. 
     * @return NotificationUserGroupIds Notification GROUP ID, which is the USER GROUP ID collection. USER GROUP ID can be accessed through [ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1). this parameter is valid only when `TargetType` is `USER_GROUP`.
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set Notification GROUP ID, which is the USER GROUP ID collection. USER GROUP ID can be accessed through [ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1). this parameter is valid only when `TargetType` is `USER_GROUP`.
     * @param NotificationUserGroupIds Notification GROUP ID, which is the USER GROUP ID collection. USER GROUP ID can be accessed through [ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1). this parameter is valid only when `TargetType` is `USER_GROUP`.
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * Get The TDMQ CMQ QUEUE name. [the original CMQ is offline](https://intl.cloud.tencent.com/document/product/1496/83970?from_cn_redirect=1). currently, only TDMQ CMQ is recommended for use. this parameter is valid only when `TargetType` is `TDMQ_CMQ_QUEUE`. 
     * @return QueueName The TDMQ CMQ QUEUE name. [the original CMQ is offline](https://intl.cloud.tencent.com/document/product/1496/83970?from_cn_redirect=1). currently, only TDMQ CMQ is recommended for use. this parameter is valid only when `TargetType` is `TDMQ_CMQ_QUEUE`.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set The TDMQ CMQ QUEUE name. [the original CMQ is offline](https://intl.cloud.tencent.com/document/product/1496/83970?from_cn_redirect=1). currently, only TDMQ CMQ is recommended for use. this parameter is valid only when `TargetType` is `TDMQ_CMQ_QUEUE`.
     * @param QueueName The TDMQ CMQ QUEUE name. [the original CMQ is offline](https://intl.cloud.tencent.com/document/product/1496/83970?from_cn_redirect=1). currently, only TDMQ CMQ is recommended for use. this parameter is valid only when `TargetType` is `TDMQ_CMQ_QUEUE`.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get The TDMQ CMQ TOPIC name. [original CMQ is offline](https://intl.cloud.tencent.com/document/product/1496/83970?from_cn_redirect=1). currently, only TDMQ CMQ is recommended for use. this parameter is valid only when `TargetType` is `TDMQ_CMQ_TOPIC`. 
     * @return TopicName The TDMQ CMQ TOPIC name. [original CMQ is offline](https://intl.cloud.tencent.com/document/product/1496/83970?from_cn_redirect=1). currently, only TDMQ CMQ is recommended for use. this parameter is valid only when `TargetType` is `TDMQ_CMQ_TOPIC`.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set The TDMQ CMQ TOPIC name. [original CMQ is offline](https://intl.cloud.tencent.com/document/product/1496/83970?from_cn_redirect=1). currently, only TDMQ CMQ is recommended for use. this parameter is valid only when `TargetType` is `TDMQ_CMQ_TOPIC`.
     * @param TopicName The TDMQ CMQ TOPIC name. [original CMQ is offline](https://intl.cloud.tencent.com/document/product/1496/83970?from_cn_redirect=1). currently, only TDMQ CMQ is recommended for use. this parameter is valid only when `TargetType` is `TDMQ_CMQ_TOPIC`.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public ModifyNotificationConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNotificationConfigurationRequest(ModifyNotificationConfigurationRequest source) {
        if (source.AutoScalingNotificationId != null) {
            this.AutoScalingNotificationId = new String(source.AutoScalingNotificationId);
        }
        if (source.NotificationTypes != null) {
            this.NotificationTypes = new String[source.NotificationTypes.length];
            for (int i = 0; i < source.NotificationTypes.length; i++) {
                this.NotificationTypes[i] = new String(source.NotificationTypes[i]);
            }
        }
        if (source.NotificationUserGroupIds != null) {
            this.NotificationUserGroupIds = new String[source.NotificationUserGroupIds.length];
            for (int i = 0; i < source.NotificationUserGroupIds.length; i++) {
                this.NotificationUserGroupIds[i] = new String(source.NotificationUserGroupIds[i]);
            }
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingNotificationId", this.AutoScalingNotificationId);
        this.setParamArraySimple(map, prefix + "NotificationTypes.", this.NotificationTypes);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

