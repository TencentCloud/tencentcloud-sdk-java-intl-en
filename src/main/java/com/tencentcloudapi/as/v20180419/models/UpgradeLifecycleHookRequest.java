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

public class UpgradeLifecycleHookRequest extends AbstractModel {

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
    * Scenario for the lifecycle hook. Value range: "INSTANCE_LAUNCHING", "INSTANCE_TERMINATING"
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * Defines the action to be taken by the auto scaling group upon lifecycle hook timeout. Value range: "CONTINUE", "ABANDON". Default value: "CONTINUE"
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * The maximum length of time (in seconds) that can elapse before the lifecycle hook times out. Value range: 30-7200. Default value: 300
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Long HeartbeatTimeout;

    /**
    * Additional information of a notification that Auto Scaling sends to targets. This parameter is set when you configure a notification (default value: "").
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * Notification result. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
    * The scenario where the lifecycle hook is applied. `EXTENSION`: the lifecycle hook will be triggered when AttachInstances, DetachInstances or RemoveInstaces is called. `NORMAL`: the lifecycle hook is not triggered by the above APIs. 
    */
    @SerializedName("LifecycleTransitionType")
    @Expose
    private String LifecycleTransitionType;

    /**
    * Remote command execution object. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
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
     * Get Scenario for the lifecycle hook. Value range: "INSTANCE_LAUNCHING", "INSTANCE_TERMINATING" 
     * @return LifecycleTransition Scenario for the lifecycle hook. Value range: "INSTANCE_LAUNCHING", "INSTANCE_TERMINATING"
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set Scenario for the lifecycle hook. Value range: "INSTANCE_LAUNCHING", "INSTANCE_TERMINATING"
     * @param LifecycleTransition Scenario for the lifecycle hook. Value range: "INSTANCE_LAUNCHING", "INSTANCE_TERMINATING"
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Get Defines the action to be taken by the auto scaling group upon lifecycle hook timeout. Value range: "CONTINUE", "ABANDON". Default value: "CONTINUE" 
     * @return DefaultResult Defines the action to be taken by the auto scaling group upon lifecycle hook timeout. Value range: "CONTINUE", "ABANDON". Default value: "CONTINUE"
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set Defines the action to be taken by the auto scaling group upon lifecycle hook timeout. Value range: "CONTINUE", "ABANDON". Default value: "CONTINUE"
     * @param DefaultResult Defines the action to be taken by the auto scaling group upon lifecycle hook timeout. Value range: "CONTINUE", "ABANDON". Default value: "CONTINUE"
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Get The maximum length of time (in seconds) that can elapse before the lifecycle hook times out. Value range: 30-7200. Default value: 300 
     * @return HeartbeatTimeout The maximum length of time (in seconds) that can elapse before the lifecycle hook times out. Value range: 30-7200. Default value: 300
     */
    public Long getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Set The maximum length of time (in seconds) that can elapse before the lifecycle hook times out. Value range: 30-7200. Default value: 300
     * @param HeartbeatTimeout The maximum length of time (in seconds) that can elapse before the lifecycle hook times out. Value range: 30-7200. Default value: 300
     */
    public void setHeartbeatTimeout(Long HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Get Additional information of a notification that Auto Scaling sends to targets. This parameter is set when you configure a notification (default value: ""). 
     * @return NotificationMetadata Additional information of a notification that Auto Scaling sends to targets. This parameter is set when you configure a notification (default value: "").
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set Additional information of a notification that Auto Scaling sends to targets. This parameter is set when you configure a notification (default value: "").
     * @param NotificationMetadata Additional information of a notification that Auto Scaling sends to targets. This parameter is set when you configure a notification (default value: "").
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Get Notification result. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time. 
     * @return NotificationTarget Notification result. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set Notification result. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
     * @param NotificationTarget Notification result. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * Get The scenario where the lifecycle hook is applied. `EXTENSION`: the lifecycle hook will be triggered when AttachInstances, DetachInstances or RemoveInstaces is called. `NORMAL`: the lifecycle hook is not triggered by the above APIs.  
     * @return LifecycleTransitionType The scenario where the lifecycle hook is applied. `EXTENSION`: the lifecycle hook will be triggered when AttachInstances, DetachInstances or RemoveInstaces is called. `NORMAL`: the lifecycle hook is not triggered by the above APIs. 
     */
    public String getLifecycleTransitionType() {
        return this.LifecycleTransitionType;
    }

    /**
     * Set The scenario where the lifecycle hook is applied. `EXTENSION`: the lifecycle hook will be triggered when AttachInstances, DetachInstances or RemoveInstaces is called. `NORMAL`: the lifecycle hook is not triggered by the above APIs. 
     * @param LifecycleTransitionType The scenario where the lifecycle hook is applied. `EXTENSION`: the lifecycle hook will be triggered when AttachInstances, DetachInstances or RemoveInstaces is called. `NORMAL`: the lifecycle hook is not triggered by the above APIs. 
     */
    public void setLifecycleTransitionType(String LifecycleTransitionType) {
        this.LifecycleTransitionType = LifecycleTransitionType;
    }

    /**
     * Get Remote command execution object. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time. 
     * @return LifecycleCommand Remote command execution object. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
     */
    public LifecycleCommand getLifecycleCommand() {
        return this.LifecycleCommand;
    }

    /**
     * Set Remote command execution object. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
     * @param LifecycleCommand Remote command execution object. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
     */
    public void setLifecycleCommand(LifecycleCommand LifecycleCommand) {
        this.LifecycleCommand = LifecycleCommand;
    }

    public UpgradeLifecycleHookRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeLifecycleHookRequest(UpgradeLifecycleHookRequest source) {
        if (source.LifecycleHookId != null) {
            this.LifecycleHookId = new String(source.LifecycleHookId);
        }
        if (source.LifecycleHookName != null) {
            this.LifecycleHookName = new String(source.LifecycleHookName);
        }
        if (source.LifecycleTransition != null) {
            this.LifecycleTransition = new String(source.LifecycleTransition);
        }
        if (source.DefaultResult != null) {
            this.DefaultResult = new String(source.DefaultResult);
        }
        if (source.HeartbeatTimeout != null) {
            this.HeartbeatTimeout = new Long(source.HeartbeatTimeout);
        }
        if (source.NotificationMetadata != null) {
            this.NotificationMetadata = new String(source.NotificationMetadata);
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
        this.setParamSimple(map, prefix + "LifecycleTransition", this.LifecycleTransition);
        this.setParamSimple(map, prefix + "DefaultResult", this.DefaultResult);
        this.setParamSimple(map, prefix + "HeartbeatTimeout", this.HeartbeatTimeout);
        this.setParamSimple(map, prefix + "NotificationMetadata", this.NotificationMetadata);
        this.setParamObj(map, prefix + "NotificationTarget.", this.NotificationTarget);
        this.setParamSimple(map, prefix + "LifecycleTransitionType", this.LifecycleTransitionType);
        this.setParamObj(map, prefix + "LifecycleCommand.", this.LifecycleCommand);

    }
}

