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
    * Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
-CONTINUE execution by default means capacity expansion or reduction.
-For scale-out hooks, cvms with hook timeout or failed LifecycleCommand execution will be released directly or removed; for scale-in hooks, scale-in activities will continue.
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * Specifies the timeout waiting time of the lifecycle hook in seconds. value range: 30 to 7200.
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Long HeartbeatTimeout;

    /**
    * Scenario for entering the lifecycle hook. valid values:.
-`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.
-INSTANCE_TERMINATING: scale-in lifecycle hook.
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
    * Creation time. uses UTC for timing.
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
    * Specifies the scenario type for performing the lifecycle hook. valid values: NORMAL and EXTENSION. default value: NORMAL.
Description: when set to `EXTENSION`, the lifecycle hook will be triggered during `AttachInstances`, `DetachInstances`, or `RemoveInstances` API calls. if set to `NORMAL`, the lifecycle hook will not be triggered by these apis.
    */
    @SerializedName("LifecycleTransitionType")
    @Expose
    private String LifecycleTransitionType;

    /**
    * Remote command execution object.
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
     * Get Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
-CONTINUE execution by default means capacity expansion or reduction.
-For scale-out hooks, cvms with hook timeout or failed LifecycleCommand execution will be released directly or removed; for scale-in hooks, scale-in activities will continue. 
     * @return DefaultResult Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
-CONTINUE execution by default means capacity expansion or reduction.
-For scale-out hooks, cvms with hook timeout or failed LifecycleCommand execution will be released directly or removed; for scale-in hooks, scale-in activities will continue.
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
-CONTINUE execution by default means capacity expansion or reduction.
-For scale-out hooks, cvms with hook timeout or failed LifecycleCommand execution will be released directly or removed; for scale-in hooks, scale-in activities will continue.
     * @param DefaultResult Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
-CONTINUE execution by default means capacity expansion or reduction.
-For scale-out hooks, cvms with hook timeout or failed LifecycleCommand execution will be released directly or removed; for scale-in hooks, scale-in activities will continue.
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Get Specifies the timeout waiting time of the lifecycle hook in seconds. value range: 30 to 7200. 
     * @return HeartbeatTimeout Specifies the timeout waiting time of the lifecycle hook in seconds. value range: 30 to 7200.
     */
    public Long getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Set Specifies the timeout waiting time of the lifecycle hook in seconds. value range: 30 to 7200.
     * @param HeartbeatTimeout Specifies the timeout waiting time of the lifecycle hook in seconds. value range: 30 to 7200.
     */
    public void setHeartbeatTimeout(Long HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Get Scenario for entering the lifecycle hook. valid values:.
-`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.
-INSTANCE_TERMINATING: scale-in lifecycle hook. 
     * @return LifecycleTransition Scenario for entering the lifecycle hook. valid values:.
-`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.
-INSTANCE_TERMINATING: scale-in lifecycle hook.
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set Scenario for entering the lifecycle hook. valid values:.
-`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.
-INSTANCE_TERMINATING: scale-in lifecycle hook.
     * @param LifecycleTransition Scenario for entering the lifecycle hook. valid values:.
-`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.
-INSTANCE_TERMINATING: scale-in lifecycle hook.
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
     * Get Creation time. uses UTC for timing. 
     * @return CreatedTime Creation time. uses UTC for timing.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time. uses UTC for timing.
     * @param CreatedTime Creation time. uses UTC for timing.
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
     * Get Specifies the scenario type for performing the lifecycle hook. valid values: NORMAL and EXTENSION. default value: NORMAL.
Description: when set to `EXTENSION`, the lifecycle hook will be triggered during `AttachInstances`, `DetachInstances`, or `RemoveInstances` API calls. if set to `NORMAL`, the lifecycle hook will not be triggered by these apis. 
     * @return LifecycleTransitionType Specifies the scenario type for performing the lifecycle hook. valid values: NORMAL and EXTENSION. default value: NORMAL.
Description: when set to `EXTENSION`, the lifecycle hook will be triggered during `AttachInstances`, `DetachInstances`, or `RemoveInstances` API calls. if set to `NORMAL`, the lifecycle hook will not be triggered by these apis.
     */
    public String getLifecycleTransitionType() {
        return this.LifecycleTransitionType;
    }

    /**
     * Set Specifies the scenario type for performing the lifecycle hook. valid values: NORMAL and EXTENSION. default value: NORMAL.
Description: when set to `EXTENSION`, the lifecycle hook will be triggered during `AttachInstances`, `DetachInstances`, or `RemoveInstances` API calls. if set to `NORMAL`, the lifecycle hook will not be triggered by these apis.
     * @param LifecycleTransitionType Specifies the scenario type for performing the lifecycle hook. valid values: NORMAL and EXTENSION. default value: NORMAL.
Description: when set to `EXTENSION`, the lifecycle hook will be triggered during `AttachInstances`, `DetachInstances`, or `RemoveInstances` API calls. if set to `NORMAL`, the lifecycle hook will not be triggered by these apis.
     */
    public void setLifecycleTransitionType(String LifecycleTransitionType) {
        this.LifecycleTransitionType = LifecycleTransitionType;
    }

    /**
     * Get Remote command execution object. 
     * @return LifecycleCommand Remote command execution object.
     */
    public LifecycleCommand getLifecycleCommand() {
        return this.LifecycleCommand;
    }

    /**
     * Set Remote command execution object.
     * @param LifecycleCommand Remote command execution object.
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

