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

public class ModifyLifecycleHookRequest extends AbstractModel {

    /**
    * Lifecycle hook ID. you can get the lifecycle hook ID by calling the api [DescribeLifecycleHooks](https://intl.cloud.tencent.com/document/api/377/34452?from_cn_redirect=1) and retrieving the LifecycleHookId from the returned information.
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * Lifecycle hook name. Name only supports chinese, english, digits, underscore (_), hyphen (-), decimal point (.), maximum length cannot exceed 128.
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * Scenario for entering the lifecycle hook. valid values:.
`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.
`INSTANCE_TERMINATING`: the lifecycle hook is being scaled in.
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
Default value means CONTINUE to execute capacity expansion or reduction.
* ABANDON: for scale-out hooks, cvms that time out or fail to execute LifecycleCommand are released directly or removed. for scale-in hooks, scale-in activities continue.
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * The maximum length of time (in seconds) that can elapse before the lifecycle hook times out. Value range: 30 - 7,200 seconds.
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Long HeartbeatTimeout;

    /**
    * Specifies the additional information sent by auto scaling to the notification target. NotificationMetadata and LifecycleCommand are mutually exclusive. the two cannot be specified simultaneously.
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * The scenario where the lifecycle hook is applied. `EXTENSION`: The lifecycle hook will be triggered when `AttachInstances`, `DetachInstances` or `RemoveInstances` is called. `NORMAL`: The lifecycle hook is not triggered by the above APIs.
    */
    @SerializedName("LifecycleTransitionType")
    @Expose
    private String LifecycleTransitionType;

    /**
    * Notify the target information. NotificationTarget and LifecycleCommand are mutually exclusive. the two cannot be specified simultaneously.
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
    * Remote command execution object. `NotificationMetadata`, `NotificationTarget`, and `LifecycleCommand` cannot be specified at the same time.
    */
    @SerializedName("LifecycleCommand")
    @Expose
    private LifecycleCommand LifecycleCommand;

    /**
     * Get Lifecycle hook ID. you can get the lifecycle hook ID by calling the api [DescribeLifecycleHooks](https://intl.cloud.tencent.com/document/api/377/34452?from_cn_redirect=1) and retrieving the LifecycleHookId from the returned information. 
     * @return LifecycleHookId Lifecycle hook ID. you can get the lifecycle hook ID by calling the api [DescribeLifecycleHooks](https://intl.cloud.tencent.com/document/api/377/34452?from_cn_redirect=1) and retrieving the LifecycleHookId from the returned information.
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set Lifecycle hook ID. you can get the lifecycle hook ID by calling the api [DescribeLifecycleHooks](https://intl.cloud.tencent.com/document/api/377/34452?from_cn_redirect=1) and retrieving the LifecycleHookId from the returned information.
     * @param LifecycleHookId Lifecycle hook ID. you can get the lifecycle hook ID by calling the api [DescribeLifecycleHooks](https://intl.cloud.tencent.com/document/api/377/34452?from_cn_redirect=1) and retrieving the LifecycleHookId from the returned information.
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get Lifecycle hook name. Name only supports chinese, english, digits, underscore (_), hyphen (-), decimal point (.), maximum length cannot exceed 128. 
     * @return LifecycleHookName Lifecycle hook name. Name only supports chinese, english, digits, underscore (_), hyphen (-), decimal point (.), maximum length cannot exceed 128.
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Set Lifecycle hook name. Name only supports chinese, english, digits, underscore (_), hyphen (-), decimal point (.), maximum length cannot exceed 128.
     * @param LifecycleHookName Lifecycle hook name. Name only supports chinese, english, digits, underscore (_), hyphen (-), decimal point (.), maximum length cannot exceed 128.
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Get Scenario for entering the lifecycle hook. valid values:.
`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.
`INSTANCE_TERMINATING`: the lifecycle hook is being scaled in. 
     * @return LifecycleTransition Scenario for entering the lifecycle hook. valid values:.
`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.
`INSTANCE_TERMINATING`: the lifecycle hook is being scaled in.
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set Scenario for entering the lifecycle hook. valid values:.
`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.
`INSTANCE_TERMINATING`: the lifecycle hook is being scaled in.
     * @param LifecycleTransition Scenario for entering the lifecycle hook. valid values:.
`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.
`INSTANCE_TERMINATING`: the lifecycle hook is being scaled in.
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Get Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
Default value means CONTINUE to execute capacity expansion or reduction.
* ABANDON: for scale-out hooks, cvms that time out or fail to execute LifecycleCommand are released directly or removed. for scale-in hooks, scale-in activities continue. 
     * @return DefaultResult Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
Default value means CONTINUE to execute capacity expansion or reduction.
* ABANDON: for scale-out hooks, cvms that time out or fail to execute LifecycleCommand are released directly or removed. for scale-in hooks, scale-in activities continue.
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
Default value means CONTINUE to execute capacity expansion or reduction.
* ABANDON: for scale-out hooks, cvms that time out or fail to execute LifecycleCommand are released directly or removed. for scale-in hooks, scale-in activities continue.
     * @param DefaultResult Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
Default value means CONTINUE to execute capacity expansion or reduction.
* ABANDON: for scale-out hooks, cvms that time out or fail to execute LifecycleCommand are released directly or removed. for scale-in hooks, scale-in activities continue.
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Get The maximum length of time (in seconds) that can elapse before the lifecycle hook times out. Value range: 30 - 7,200 seconds. 
     * @return HeartbeatTimeout The maximum length of time (in seconds) that can elapse before the lifecycle hook times out. Value range: 30 - 7,200 seconds.
     */
    public Long getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Set The maximum length of time (in seconds) that can elapse before the lifecycle hook times out. Value range: 30 - 7,200 seconds.
     * @param HeartbeatTimeout The maximum length of time (in seconds) that can elapse before the lifecycle hook times out. Value range: 30 - 7,200 seconds.
     */
    public void setHeartbeatTimeout(Long HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Get Specifies the additional information sent by auto scaling to the notification target. NotificationMetadata and LifecycleCommand are mutually exclusive. the two cannot be specified simultaneously. 
     * @return NotificationMetadata Specifies the additional information sent by auto scaling to the notification target. NotificationMetadata and LifecycleCommand are mutually exclusive. the two cannot be specified simultaneously.
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set Specifies the additional information sent by auto scaling to the notification target. NotificationMetadata and LifecycleCommand are mutually exclusive. the two cannot be specified simultaneously.
     * @param NotificationMetadata Specifies the additional information sent by auto scaling to the notification target. NotificationMetadata and LifecycleCommand are mutually exclusive. the two cannot be specified simultaneously.
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Get The scenario where the lifecycle hook is applied. `EXTENSION`: The lifecycle hook will be triggered when `AttachInstances`, `DetachInstances` or `RemoveInstances` is called. `NORMAL`: The lifecycle hook is not triggered by the above APIs. 
     * @return LifecycleTransitionType The scenario where the lifecycle hook is applied. `EXTENSION`: The lifecycle hook will be triggered when `AttachInstances`, `DetachInstances` or `RemoveInstances` is called. `NORMAL`: The lifecycle hook is not triggered by the above APIs.
     */
    public String getLifecycleTransitionType() {
        return this.LifecycleTransitionType;
    }

    /**
     * Set The scenario where the lifecycle hook is applied. `EXTENSION`: The lifecycle hook will be triggered when `AttachInstances`, `DetachInstances` or `RemoveInstances` is called. `NORMAL`: The lifecycle hook is not triggered by the above APIs.
     * @param LifecycleTransitionType The scenario where the lifecycle hook is applied. `EXTENSION`: The lifecycle hook will be triggered when `AttachInstances`, `DetachInstances` or `RemoveInstances` is called. `NORMAL`: The lifecycle hook is not triggered by the above APIs.
     */
    public void setLifecycleTransitionType(String LifecycleTransitionType) {
        this.LifecycleTransitionType = LifecycleTransitionType;
    }

    /**
     * Get Notify the target information. NotificationTarget and LifecycleCommand are mutually exclusive. the two cannot be specified simultaneously. 
     * @return NotificationTarget Notify the target information. NotificationTarget and LifecycleCommand are mutually exclusive. the two cannot be specified simultaneously.
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set Notify the target information. NotificationTarget and LifecycleCommand are mutually exclusive. the two cannot be specified simultaneously.
     * @param NotificationTarget Notify the target information. NotificationTarget and LifecycleCommand are mutually exclusive. the two cannot be specified simultaneously.
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * Get Remote command execution object. `NotificationMetadata`, `NotificationTarget`, and `LifecycleCommand` cannot be specified at the same time. 
     * @return LifecycleCommand Remote command execution object. `NotificationMetadata`, `NotificationTarget`, and `LifecycleCommand` cannot be specified at the same time.
     */
    public LifecycleCommand getLifecycleCommand() {
        return this.LifecycleCommand;
    }

    /**
     * Set Remote command execution object. `NotificationMetadata`, `NotificationTarget`, and `LifecycleCommand` cannot be specified at the same time.
     * @param LifecycleCommand Remote command execution object. `NotificationMetadata`, `NotificationTarget`, and `LifecycleCommand` cannot be specified at the same time.
     */
    public void setLifecycleCommand(LifecycleCommand LifecycleCommand) {
        this.LifecycleCommand = LifecycleCommand;
    }

    public ModifyLifecycleHookRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLifecycleHookRequest(ModifyLifecycleHookRequest source) {
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
        if (source.LifecycleTransitionType != null) {
            this.LifecycleTransitionType = new String(source.LifecycleTransitionType);
        }
        if (source.NotificationTarget != null) {
            this.NotificationTarget = new NotificationTarget(source.NotificationTarget);
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
        this.setParamSimple(map, prefix + "LifecycleTransitionType", this.LifecycleTransitionType);
        this.setParamObj(map, prefix + "NotificationTarget.", this.NotificationTarget);
        this.setParamObj(map, prefix + "LifecycleCommand.", this.LifecycleCommand);

    }
}

