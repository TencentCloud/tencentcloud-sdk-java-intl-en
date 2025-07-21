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

public class CreateLifecycleHookRequest extends AbstractModel {

    /**
    * Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Query the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Specifies the scaling group ID obtained by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.</li>.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Lifecycle hook name, which can contain Chinese characters, letters, numbers, underscores (_), hyphens (-), and periods (.) with a maximum length of 128 bytes.
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * Scenario for performing the lifecycle hook. valid values:.
<Li>`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.</li>.
<Li>`INSTANCE_TERMINATING`: scaling in lifecycle hook</li>.
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
<Li>CONTINUE: default value, means continue execution of capacity expansion or reduction</li>.
<li>ABANDON: for scale-out hooks, CVM instances with hook timeout or failed LifecycleCommand execution will be released directly or removed. for scale-in hooks, scale-in activities will continue.</li>.
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
    * Additional information of a notification that auto scaling sends to targets. this parameter is set when you configure a notification (default value: ""), with a maximum length of 1024 characters. NotificationMetadata and LifecycleCommand are mutually exclusive, and either can be specified.
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * Notification target. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
    * Specifies the scenario type for performing the lifecycle hook. valid values: NORMAL and EXTENSION. default value: NORMAL.
`EXTENSION`: the lifecycle hook will be triggered when calling [AttachInstances](https://intl.cloud.tencent.com/document/api/377/20441?from_cn_redirect=1), [DetachInstances](https://intl.cloud.tencent.com/document/api/377/20436?from_cn_redirect=1), [removeinstances](https://intl.cloud.tencent.com/document/api/377/20431?from_cn_redirect=1), [StopAutoScalingInstances](https://intl.cloud.tencent.com/document/api/377/40286?from_cn_redirect=1), [StartAutoScalingInstances](https://intl.cloud.tencent.com/document/api/377/40287?from_cn_redirect=1), or [StartInstanceRefresh](https://intl.cloud.tencent.com/document/api/377/99172?from_cn_redirect=1). `NORMAL`: the lifecycle hook is not triggered by these apis.
    */
    @SerializedName("LifecycleTransitionType")
    @Expose
    private String LifecycleTransitionType;

    /**
    * Specifies the remote command execution object. NotificationTarget and NotificationMetadata are mutually exclusive with this parameter. either cannot be specified simultaneously.
    */
    @SerializedName("LifecycleCommand")
    @Expose
    private LifecycleCommand LifecycleCommand;

    /**
     * Get Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Query the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Specifies the scaling group ID obtained by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.</li>. 
     * @return AutoScalingGroupId Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Query the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Specifies the scaling group ID obtained by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.</li>.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Query the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Specifies the scaling group ID obtained by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.</li>.
     * @param AutoScalingGroupId Scaling group ID. obtain available scaling group ids in the following ways:.
<li>Query the scaling group ID by logging in to the [console](https://console.cloud.tencent.com/autoscaling/group).</li>.
<li>Specifies the scaling group ID obtained by calling the api [DescribeAutoScalingGroups](https://intl.cloud.tencent.com/document/api/377/20438?from_cn_redirect=1) and retrieving the AutoScalingGroupId from the return information.</li>.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Lifecycle hook name, which can contain Chinese characters, letters, numbers, underscores (_), hyphens (-), and periods (.) with a maximum length of 128 bytes. 
     * @return LifecycleHookName Lifecycle hook name, which can contain Chinese characters, letters, numbers, underscores (_), hyphens (-), and periods (.) with a maximum length of 128 bytes.
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Set Lifecycle hook name, which can contain Chinese characters, letters, numbers, underscores (_), hyphens (-), and periods (.) with a maximum length of 128 bytes.
     * @param LifecycleHookName Lifecycle hook name, which can contain Chinese characters, letters, numbers, underscores (_), hyphens (-), and periods (.) with a maximum length of 128 bytes.
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Get Scenario for performing the lifecycle hook. valid values:.
<Li>`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.</li>.
<Li>`INSTANCE_TERMINATING`: scaling in lifecycle hook</li>. 
     * @return LifecycleTransition Scenario for performing the lifecycle hook. valid values:.
<Li>`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.</li>.
<Li>`INSTANCE_TERMINATING`: scaling in lifecycle hook</li>.
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set Scenario for performing the lifecycle hook. valid values:.
<Li>`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.</li>.
<Li>`INSTANCE_TERMINATING`: scaling in lifecycle hook</li>.
     * @param LifecycleTransition Scenario for performing the lifecycle hook. valid values:.
<Li>`INSTANCE_LAUNCHING`: the lifecycle hook is being scaled out.</li>.
<Li>`INSTANCE_TERMINATING`: scaling in lifecycle hook</li>.
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Get Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
<Li>CONTINUE: default value, means continue execution of capacity expansion or reduction</li>.
<li>ABANDON: for scale-out hooks, CVM instances with hook timeout or failed LifecycleCommand execution will be released directly or removed. for scale-in hooks, scale-in activities will continue.</li>. 
     * @return DefaultResult Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
<Li>CONTINUE: default value, means continue execution of capacity expansion or reduction</li>.
<li>ABANDON: for scale-out hooks, CVM instances with hook timeout or failed LifecycleCommand execution will be released directly or removed. for scale-in hooks, scale-in activities will continue.</li>.
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
<Li>CONTINUE: default value, means continue execution of capacity expansion or reduction</li>.
<li>ABANDON: for scale-out hooks, CVM instances with hook timeout or failed LifecycleCommand execution will be released directly or removed. for scale-in hooks, scale-in activities will continue.</li>.
     * @param DefaultResult Action to be taken by the scaling group in case of lifecycle hook timeout or LifecycleCommand execution failure. valid values:.
<Li>CONTINUE: default value, means continue execution of capacity expansion or reduction</li>.
<li>ABANDON: for scale-out hooks, CVM instances with hook timeout or failed LifecycleCommand execution will be released directly or removed. for scale-in hooks, scale-in activities will continue.</li>.
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
     * Get Additional information of a notification that auto scaling sends to targets. this parameter is set when you configure a notification (default value: ""), with a maximum length of 1024 characters. NotificationMetadata and LifecycleCommand are mutually exclusive, and either can be specified. 
     * @return NotificationMetadata Additional information of a notification that auto scaling sends to targets. this parameter is set when you configure a notification (default value: ""), with a maximum length of 1024 characters. NotificationMetadata and LifecycleCommand are mutually exclusive, and either can be specified.
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set Additional information of a notification that auto scaling sends to targets. this parameter is set when you configure a notification (default value: ""), with a maximum length of 1024 characters. NotificationMetadata and LifecycleCommand are mutually exclusive, and either can be specified.
     * @param NotificationMetadata Additional information of a notification that auto scaling sends to targets. this parameter is set when you configure a notification (default value: ""), with a maximum length of 1024 characters. NotificationMetadata and LifecycleCommand are mutually exclusive, and either can be specified.
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Get Notification target. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time. 
     * @return NotificationTarget Notification target. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set Notification target. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
     * @param NotificationTarget Notification target. `NotificationTarget` and `LifecycleCommand` cannot be specified at the same time.
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * Get Specifies the scenario type for performing the lifecycle hook. valid values: NORMAL and EXTENSION. default value: NORMAL.
`EXTENSION`: the lifecycle hook will be triggered when calling [AttachInstances](https://intl.cloud.tencent.com/document/api/377/20441?from_cn_redirect=1), [DetachInstances](https://intl.cloud.tencent.com/document/api/377/20436?from_cn_redirect=1), [removeinstances](https://intl.cloud.tencent.com/document/api/377/20431?from_cn_redirect=1), [StopAutoScalingInstances](https://intl.cloud.tencent.com/document/api/377/40286?from_cn_redirect=1), [StartAutoScalingInstances](https://intl.cloud.tencent.com/document/api/377/40287?from_cn_redirect=1), or [StartInstanceRefresh](https://intl.cloud.tencent.com/document/api/377/99172?from_cn_redirect=1). `NORMAL`: the lifecycle hook is not triggered by these apis. 
     * @return LifecycleTransitionType Specifies the scenario type for performing the lifecycle hook. valid values: NORMAL and EXTENSION. default value: NORMAL.
`EXTENSION`: the lifecycle hook will be triggered when calling [AttachInstances](https://intl.cloud.tencent.com/document/api/377/20441?from_cn_redirect=1), [DetachInstances](https://intl.cloud.tencent.com/document/api/377/20436?from_cn_redirect=1), [removeinstances](https://intl.cloud.tencent.com/document/api/377/20431?from_cn_redirect=1), [StopAutoScalingInstances](https://intl.cloud.tencent.com/document/api/377/40286?from_cn_redirect=1), [StartAutoScalingInstances](https://intl.cloud.tencent.com/document/api/377/40287?from_cn_redirect=1), or [StartInstanceRefresh](https://intl.cloud.tencent.com/document/api/377/99172?from_cn_redirect=1). `NORMAL`: the lifecycle hook is not triggered by these apis.
     */
    public String getLifecycleTransitionType() {
        return this.LifecycleTransitionType;
    }

    /**
     * Set Specifies the scenario type for performing the lifecycle hook. valid values: NORMAL and EXTENSION. default value: NORMAL.
`EXTENSION`: the lifecycle hook will be triggered when calling [AttachInstances](https://intl.cloud.tencent.com/document/api/377/20441?from_cn_redirect=1), [DetachInstances](https://intl.cloud.tencent.com/document/api/377/20436?from_cn_redirect=1), [removeinstances](https://intl.cloud.tencent.com/document/api/377/20431?from_cn_redirect=1), [StopAutoScalingInstances](https://intl.cloud.tencent.com/document/api/377/40286?from_cn_redirect=1), [StartAutoScalingInstances](https://intl.cloud.tencent.com/document/api/377/40287?from_cn_redirect=1), or [StartInstanceRefresh](https://intl.cloud.tencent.com/document/api/377/99172?from_cn_redirect=1). `NORMAL`: the lifecycle hook is not triggered by these apis.
     * @param LifecycleTransitionType Specifies the scenario type for performing the lifecycle hook. valid values: NORMAL and EXTENSION. default value: NORMAL.
`EXTENSION`: the lifecycle hook will be triggered when calling [AttachInstances](https://intl.cloud.tencent.com/document/api/377/20441?from_cn_redirect=1), [DetachInstances](https://intl.cloud.tencent.com/document/api/377/20436?from_cn_redirect=1), [removeinstances](https://intl.cloud.tencent.com/document/api/377/20431?from_cn_redirect=1), [StopAutoScalingInstances](https://intl.cloud.tencent.com/document/api/377/40286?from_cn_redirect=1), [StartAutoScalingInstances](https://intl.cloud.tencent.com/document/api/377/40287?from_cn_redirect=1), or [StartInstanceRefresh](https://intl.cloud.tencent.com/document/api/377/99172?from_cn_redirect=1). `NORMAL`: the lifecycle hook is not triggered by these apis.
     */
    public void setLifecycleTransitionType(String LifecycleTransitionType) {
        this.LifecycleTransitionType = LifecycleTransitionType;
    }

    /**
     * Get Specifies the remote command execution object. NotificationTarget and NotificationMetadata are mutually exclusive with this parameter. either cannot be specified simultaneously. 
     * @return LifecycleCommand Specifies the remote command execution object. NotificationTarget and NotificationMetadata are mutually exclusive with this parameter. either cannot be specified simultaneously.
     */
    public LifecycleCommand getLifecycleCommand() {
        return this.LifecycleCommand;
    }

    /**
     * Set Specifies the remote command execution object. NotificationTarget and NotificationMetadata are mutually exclusive with this parameter. either cannot be specified simultaneously.
     * @param LifecycleCommand Specifies the remote command execution object. NotificationTarget and NotificationMetadata are mutually exclusive with this parameter. either cannot be specified simultaneously.
     */
    public void setLifecycleCommand(LifecycleCommand LifecycleCommand) {
        this.LifecycleCommand = LifecycleCommand;
    }

    public CreateLifecycleHookRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLifecycleHookRequest(CreateLifecycleHookRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
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
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
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

