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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalingNotification extends AbstractModel {

    /**
    * Auto scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * List of user group IDs.
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
    * List of notification events.
    */
    @SerializedName("NotificationTypes")
    @Expose
    private String [] NotificationTypes;

    /**
    * Event notification ID.
    */
    @SerializedName("AutoScalingNotificationId")
    @Expose
    private String AutoScalingNotificationId;

    /**
    * Notification receiver type.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * CMQ queue name.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * CMQ topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get Auto scaling group ID. 
     * @return AutoScalingGroupId Auto scaling group ID.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Auto scaling group ID.
     * @param AutoScalingGroupId Auto scaling group ID.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get List of user group IDs. 
     * @return NotificationUserGroupIds List of user group IDs.
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set List of user group IDs.
     * @param NotificationUserGroupIds List of user group IDs.
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * Get List of notification events. 
     * @return NotificationTypes List of notification events.
     */
    public String [] getNotificationTypes() {
        return this.NotificationTypes;
    }

    /**
     * Set List of notification events.
     * @param NotificationTypes List of notification events.
     */
    public void setNotificationTypes(String [] NotificationTypes) {
        this.NotificationTypes = NotificationTypes;
    }

    /**
     * Get Event notification ID. 
     * @return AutoScalingNotificationId Event notification ID.
     */
    public String getAutoScalingNotificationId() {
        return this.AutoScalingNotificationId;
    }

    /**
     * Set Event notification ID.
     * @param AutoScalingNotificationId Event notification ID.
     */
    public void setAutoScalingNotificationId(String AutoScalingNotificationId) {
        this.AutoScalingNotificationId = AutoScalingNotificationId;
    }

    /**
     * Get Notification receiver type. 
     * @return TargetType Notification receiver type.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Notification receiver type.
     * @param TargetType Notification receiver type.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get CMQ queue name. 
     * @return QueueName CMQ queue name.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set CMQ queue name.
     * @param QueueName CMQ queue name.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get CMQ topic name. 
     * @return TopicName CMQ topic name.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set CMQ topic name.
     * @param TopicName CMQ topic name.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public AutoScalingNotification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalingNotification(AutoScalingNotification source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.NotificationUserGroupIds != null) {
            this.NotificationUserGroupIds = new String[source.NotificationUserGroupIds.length];
            for (int i = 0; i < source.NotificationUserGroupIds.length; i++) {
                this.NotificationUserGroupIds[i] = new String(source.NotificationUserGroupIds[i]);
            }
        }
        if (source.NotificationTypes != null) {
            this.NotificationTypes = new String[source.NotificationTypes.length];
            for (int i = 0; i < source.NotificationTypes.length; i++) {
                this.NotificationTypes[i] = new String(source.NotificationTypes[i]);
            }
        }
        if (source.AutoScalingNotificationId != null) {
            this.AutoScalingNotificationId = new String(source.AutoScalingNotificationId);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
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
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);
        this.setParamArraySimple(map, prefix + "NotificationTypes.", this.NotificationTypes);
        this.setParamSimple(map, prefix + "AutoScalingNotificationId", this.AutoScalingNotificationId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

