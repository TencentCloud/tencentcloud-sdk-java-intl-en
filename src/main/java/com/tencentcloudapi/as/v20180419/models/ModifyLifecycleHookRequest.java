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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLifecycleHookRequest extends AbstractModel{

    /**
    * Lifecycle hook ID.
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * Lifecycle hook name.
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * The time when the lifecycle hook is applied. Valid values:
<li> `INSTANCE_LAUNCHING`: After the instance launch
<li> `INSTANCE_TERMINATING`: Before the instance termination
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * Actions after the lifecycle hook times out. Valid values:
<li> `CONTINUE`: Continue the scaling activity after the timeout
<li> `ABANDON`: Terminate the scaling activity after the timeout
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
    * Additional information sent by AS to the notification target.
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
    * Information of the notification target.
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
    * Remote command execution object.
    */
    @SerializedName("LifecycleCommand")
    @Expose
    private LifecycleCommand LifecycleCommand;

    /**
     * Get Lifecycle hook ID. 
     * @return LifecycleHookId Lifecycle hook ID.
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set Lifecycle hook ID.
     * @param LifecycleHookId Lifecycle hook ID.
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get Lifecycle hook name. 
     * @return LifecycleHookName Lifecycle hook name.
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Set Lifecycle hook name.
     * @param LifecycleHookName Lifecycle hook name.
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Get The time when the lifecycle hook is applied. Valid values:
<li> `INSTANCE_LAUNCHING`: After the instance launch
<li> `INSTANCE_TERMINATING`: Before the instance termination 
     * @return LifecycleTransition The time when the lifecycle hook is applied. Valid values:
<li> `INSTANCE_LAUNCHING`: After the instance launch
<li> `INSTANCE_TERMINATING`: Before the instance termination
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set The time when the lifecycle hook is applied. Valid values:
<li> `INSTANCE_LAUNCHING`: After the instance launch
<li> `INSTANCE_TERMINATING`: Before the instance termination
     * @param LifecycleTransition The time when the lifecycle hook is applied. Valid values:
<li> `INSTANCE_LAUNCHING`: After the instance launch
<li> `INSTANCE_TERMINATING`: Before the instance termination
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Get Actions after the lifecycle hook times out. Valid values:
<li> `CONTINUE`: Continue the scaling activity after the timeout
<li> `ABANDON`: Terminate the scaling activity after the timeout 
     * @return DefaultResult Actions after the lifecycle hook times out. Valid values:
<li> `CONTINUE`: Continue the scaling activity after the timeout
<li> `ABANDON`: Terminate the scaling activity after the timeout
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set Actions after the lifecycle hook times out. Valid values:
<li> `CONTINUE`: Continue the scaling activity after the timeout
<li> `ABANDON`: Terminate the scaling activity after the timeout
     * @param DefaultResult Actions after the lifecycle hook times out. Valid values:
<li> `CONTINUE`: Continue the scaling activity after the timeout
<li> `ABANDON`: Terminate the scaling activity after the timeout
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
     * Get Additional information sent by AS to the notification target. 
     * @return NotificationMetadata Additional information sent by AS to the notification target.
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set Additional information sent by AS to the notification target.
     * @param NotificationMetadata Additional information sent by AS to the notification target.
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
     * Get Information of the notification target. 
     * @return NotificationTarget Information of the notification target.
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set Information of the notification target.
     * @param NotificationTarget Information of the notification target.
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
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

