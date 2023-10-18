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

public class LifecycleHook extends AbstractModel {

    /**
    * Lifecycle hook ID
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * Lifecycle hook name
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * Auto scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Default result of the lifecycle hook
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * Wait timeout period of the lifecycle hook
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Long HeartbeatTimeout;

    /**
    * Applicable scenario of the lifecycle hook
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * Additional information for the notification target
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * Creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Notification target
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
    * Applicable scenario of the lifecycle hook
    */
    @SerializedName("LifecycleTransitionType")
    @Expose
    private String LifecycleTransitionType;

    /**
    * Remote command execution object.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LifecycleCommand")
    @Expose
    private LifecycleCommand LifecycleCommand;

    /**
     * Get Lifecycle hook ID 
     * @return LifecycleHookId Lifecycle hook ID
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set Lifecycle hook ID
     * @param LifecycleHookId Lifecycle hook ID
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get Lifecycle hook name 
     * @return LifecycleHookName Lifecycle hook name
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Set Lifecycle hook name
     * @param LifecycleHookName Lifecycle hook name
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Get Auto scaling group ID 
     * @return AutoScalingGroupId Auto scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Auto scaling group ID
     * @param AutoScalingGroupId Auto scaling group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Default result of the lifecycle hook 
     * @return DefaultResult Default result of the lifecycle hook
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set Default result of the lifecycle hook
     * @param DefaultResult Default result of the lifecycle hook
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Get Wait timeout period of the lifecycle hook 
     * @return HeartbeatTimeout Wait timeout period of the lifecycle hook
     */
    public Long getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Set Wait timeout period of the lifecycle hook
     * @param HeartbeatTimeout Wait timeout period of the lifecycle hook
     */
    public void setHeartbeatTimeout(Long HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Get Applicable scenario of the lifecycle hook 
     * @return LifecycleTransition Applicable scenario of the lifecycle hook
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set Applicable scenario of the lifecycle hook
     * @param LifecycleTransition Applicable scenario of the lifecycle hook
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Get Additional information for the notification target 
     * @return NotificationMetadata Additional information for the notification target
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set Additional information for the notification target
     * @param NotificationMetadata Additional information for the notification target
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Get Creation time 
     * @return CreatedTime Creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time
     * @param CreatedTime Creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Notification target 
     * @return NotificationTarget Notification target
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set Notification target
     * @param NotificationTarget Notification target
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * Get Applicable scenario of the lifecycle hook 
     * @return LifecycleTransitionType Applicable scenario of the lifecycle hook
     */
    public String getLifecycleTransitionType() {
        return this.LifecycleTransitionType;
    }

    /**
     * Set Applicable scenario of the lifecycle hook
     * @param LifecycleTransitionType Applicable scenario of the lifecycle hook
     */
    public void setLifecycleTransitionType(String LifecycleTransitionType) {
        this.LifecycleTransitionType = LifecycleTransitionType;
    }

    /**
     * Get Remote command execution object.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LifecycleCommand Remote command execution object.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LifecycleCommand getLifecycleCommand() {
        return this.LifecycleCommand;
    }

    /**
     * Set Remote command execution object.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LifecycleCommand Remote command execution object.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLifecycleCommand(LifecycleCommand LifecycleCommand) {
        this.LifecycleCommand = LifecycleCommand;
    }

    public LifecycleHook() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleHook(LifecycleHook source) {
        if (source.LifecycleHookId != null) {
            this.LifecycleHookId = new String(source.LifecycleHookId);
        }
        if (source.LifecycleHookName != null) {
            this.LifecycleHookName = new String(source.LifecycleHookName);
        }
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.DefaultResult != null) {
            this.DefaultResult = new String(source.DefaultResult);
        }
        if (source.HeartbeatTimeout != null) {
            this.HeartbeatTimeout = new Long(source.HeartbeatTimeout);
        }
        if (source.LifecycleTransition != null) {
            this.LifecycleTransition = new String(source.LifecycleTransition);
        }
        if (source.NotificationMetadata != null) {
            this.NotificationMetadata = new String(source.NotificationMetadata);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.NotificationTarget != null) {
            this.NotificationTarget = new NotificationTarget(source.NotificationTarget);
        }
        if (source.LifecycleTransitionType != null) {
            this.LifecycleTransitionType = new String(source.LifecycleTransitionType);
        }
        if (source.LifecycleCommand != null) {
            this.LifecycleCommand = new LifecycleCommand(source.LifecycleCommand);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "LifecycleHookName", this.LifecycleHookName);
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "DefaultResult", this.DefaultResult);
        this.setParamSimple(map, prefix + "HeartbeatTimeout", this.HeartbeatTimeout);
        this.setParamSimple(map, prefix + "LifecycleTransition", this.LifecycleTransition);
        this.setParamSimple(map, prefix + "NotificationMetadata", this.NotificationMetadata);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamObj(map, prefix + "NotificationTarget.", this.NotificationTarget);
        this.setParamSimple(map, prefix + "LifecycleTransitionType", this.LifecycleTransitionType);
        this.setParamObj(map, prefix + "LifecycleCommand.", this.LifecycleCommand);

    }
}

