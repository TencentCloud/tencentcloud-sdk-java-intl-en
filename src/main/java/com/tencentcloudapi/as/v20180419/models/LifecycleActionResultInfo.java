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

public class LifecycleActionResultInfo extends AbstractModel{

    /**
    * ID of the lifecycle hook
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * ID of the instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Execution task ID. You can query the result by using the [DescribeInvocations](https://intl.cloud.tencent.com/document/api/1340/52679?from_cn_redirect=1) API of TAT. 
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * Result of command invocation,
<li>`SUCCESSFUL`: Successful command invocation. It does mean that the task is successfully. You can query the task result with the `InvocationId.</li>
<li>`FAILED`: Failed to invoke the command</li>
<li>`NONE`</li>
    */
    @SerializedName("InvokeCommandResult")
    @Expose
    private String InvokeCommandResult;

    /**
    * Notification result, which indicates whether it is successful to notify CMQ/TDMQ.<br>
<li>SUCCESSFUL: It is successful to notify CMQ/TDMQ.</li>
<li>FAILED: It is failed to notify CMQ/TDMQ.</li>
<li>NONE</li>
    */
    @SerializedName("NotificationResult")
    @Expose
    private String NotificationResult;

    /**
    * Result of the lifecyle hook action. Values: CONTINUE, ABANDON
    */
    @SerializedName("LifecycleActionResult")
    @Expose
    private String LifecycleActionResult;

    /**
    * Reason of the result <br>
<li>`HEARTBEAT_TIMEOUT`: Heartbeat timed out. The setting of `DefaultResult` is used.</li>
<li>`NOTIFICATION_FAILURE`: Failed to send the notification. The setting of `DefaultResult` is used.</li>
<li>`CALL_INTERFACE`: Calls the `CompleteLifecycleAction` to set the result</li>
<li>ANOTHER_ACTION_ABANDON: It has been set to `ABANDON` by another operation.</li>
<li>COMMAND_CALL_FAILURE: Failed to call the command. The DefaultResult is applied.</li>
<li>COMMAND_EXEC_FINISH: Command completed</li>
<li>COMMAND_CALL_FAILURE: Failed to execute the command. The DefaultResult is applied.</li>
<li>COMMAND_EXEC_RESULT_CHECK_FAILURE: Failed to check the command result. The DefaultResult is applied.</li>
    */
    @SerializedName("ResultReason")
    @Expose
    private String ResultReason;

    /**
     * Get ID of the lifecycle hook 
     * @return LifecycleHookId ID of the lifecycle hook
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set ID of the lifecycle hook
     * @param LifecycleHookId ID of the lifecycle hook
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get ID of the instance 
     * @return InstanceId ID of the instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance
     * @param InstanceId ID of the instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Execution task ID. You can query the result by using the [DescribeInvocations](https://intl.cloud.tencent.com/document/api/1340/52679?from_cn_redirect=1) API of TAT.  
     * @return InvocationId Execution task ID. You can query the result by using the [DescribeInvocations](https://intl.cloud.tencent.com/document/api/1340/52679?from_cn_redirect=1) API of TAT. 
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set Execution task ID. You can query the result by using the [DescribeInvocations](https://intl.cloud.tencent.com/document/api/1340/52679?from_cn_redirect=1) API of TAT. 
     * @param InvocationId Execution task ID. You can query the result by using the [DescribeInvocations](https://intl.cloud.tencent.com/document/api/1340/52679?from_cn_redirect=1) API of TAT. 
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

    /**
     * Get Result of command invocation,
<li>`SUCCESSFUL`: Successful command invocation. It does mean that the task is successfully. You can query the task result with the `InvocationId.</li>
<li>`FAILED`: Failed to invoke the command</li>
<li>`NONE`</li> 
     * @return InvokeCommandResult Result of command invocation,
<li>`SUCCESSFUL`: Successful command invocation. It does mean that the task is successfully. You can query the task result with the `InvocationId.</li>
<li>`FAILED`: Failed to invoke the command</li>
<li>`NONE`</li>
     */
    public String getInvokeCommandResult() {
        return this.InvokeCommandResult;
    }

    /**
     * Set Result of command invocation,
<li>`SUCCESSFUL`: Successful command invocation. It does mean that the task is successfully. You can query the task result with the `InvocationId.</li>
<li>`FAILED`: Failed to invoke the command</li>
<li>`NONE`</li>
     * @param InvokeCommandResult Result of command invocation,
<li>`SUCCESSFUL`: Successful command invocation. It does mean that the task is successfully. You can query the task result with the `InvocationId.</li>
<li>`FAILED`: Failed to invoke the command</li>
<li>`NONE`</li>
     */
    public void setInvokeCommandResult(String InvokeCommandResult) {
        this.InvokeCommandResult = InvokeCommandResult;
    }

    /**
     * Get Notification result, which indicates whether it is successful to notify CMQ/TDMQ.<br>
<li>SUCCESSFUL: It is successful to notify CMQ/TDMQ.</li>
<li>FAILED: It is failed to notify CMQ/TDMQ.</li>
<li>NONE</li> 
     * @return NotificationResult Notification result, which indicates whether it is successful to notify CMQ/TDMQ.<br>
<li>SUCCESSFUL: It is successful to notify CMQ/TDMQ.</li>
<li>FAILED: It is failed to notify CMQ/TDMQ.</li>
<li>NONE</li>
     */
    public String getNotificationResult() {
        return this.NotificationResult;
    }

    /**
     * Set Notification result, which indicates whether it is successful to notify CMQ/TDMQ.<br>
<li>SUCCESSFUL: It is successful to notify CMQ/TDMQ.</li>
<li>FAILED: It is failed to notify CMQ/TDMQ.</li>
<li>NONE</li>
     * @param NotificationResult Notification result, which indicates whether it is successful to notify CMQ/TDMQ.<br>
<li>SUCCESSFUL: It is successful to notify CMQ/TDMQ.</li>
<li>FAILED: It is failed to notify CMQ/TDMQ.</li>
<li>NONE</li>
     */
    public void setNotificationResult(String NotificationResult) {
        this.NotificationResult = NotificationResult;
    }

    /**
     * Get Result of the lifecyle hook action. Values: CONTINUE, ABANDON 
     * @return LifecycleActionResult Result of the lifecyle hook action. Values: CONTINUE, ABANDON
     */
    public String getLifecycleActionResult() {
        return this.LifecycleActionResult;
    }

    /**
     * Set Result of the lifecyle hook action. Values: CONTINUE, ABANDON
     * @param LifecycleActionResult Result of the lifecyle hook action. Values: CONTINUE, ABANDON
     */
    public void setLifecycleActionResult(String LifecycleActionResult) {
        this.LifecycleActionResult = LifecycleActionResult;
    }

    /**
     * Get Reason of the result <br>
<li>`HEARTBEAT_TIMEOUT`: Heartbeat timed out. The setting of `DefaultResult` is used.</li>
<li>`NOTIFICATION_FAILURE`: Failed to send the notification. The setting of `DefaultResult` is used.</li>
<li>`CALL_INTERFACE`: Calls the `CompleteLifecycleAction` to set the result</li>
<li>ANOTHER_ACTION_ABANDON: It has been set to `ABANDON` by another operation.</li>
<li>COMMAND_CALL_FAILURE: Failed to call the command. The DefaultResult is applied.</li>
<li>COMMAND_EXEC_FINISH: Command completed</li>
<li>COMMAND_CALL_FAILURE: Failed to execute the command. The DefaultResult is applied.</li>
<li>COMMAND_EXEC_RESULT_CHECK_FAILURE: Failed to check the command result. The DefaultResult is applied.</li> 
     * @return ResultReason Reason of the result <br>
<li>`HEARTBEAT_TIMEOUT`: Heartbeat timed out. The setting of `DefaultResult` is used.</li>
<li>`NOTIFICATION_FAILURE`: Failed to send the notification. The setting of `DefaultResult` is used.</li>
<li>`CALL_INTERFACE`: Calls the `CompleteLifecycleAction` to set the result</li>
<li>ANOTHER_ACTION_ABANDON: It has been set to `ABANDON` by another operation.</li>
<li>COMMAND_CALL_FAILURE: Failed to call the command. The DefaultResult is applied.</li>
<li>COMMAND_EXEC_FINISH: Command completed</li>
<li>COMMAND_CALL_FAILURE: Failed to execute the command. The DefaultResult is applied.</li>
<li>COMMAND_EXEC_RESULT_CHECK_FAILURE: Failed to check the command result. The DefaultResult is applied.</li>
     */
    public String getResultReason() {
        return this.ResultReason;
    }

    /**
     * Set Reason of the result <br>
<li>`HEARTBEAT_TIMEOUT`: Heartbeat timed out. The setting of `DefaultResult` is used.</li>
<li>`NOTIFICATION_FAILURE`: Failed to send the notification. The setting of `DefaultResult` is used.</li>
<li>`CALL_INTERFACE`: Calls the `CompleteLifecycleAction` to set the result</li>
<li>ANOTHER_ACTION_ABANDON: It has been set to `ABANDON` by another operation.</li>
<li>COMMAND_CALL_FAILURE: Failed to call the command. The DefaultResult is applied.</li>
<li>COMMAND_EXEC_FINISH: Command completed</li>
<li>COMMAND_CALL_FAILURE: Failed to execute the command. The DefaultResult is applied.</li>
<li>COMMAND_EXEC_RESULT_CHECK_FAILURE: Failed to check the command result. The DefaultResult is applied.</li>
     * @param ResultReason Reason of the result <br>
<li>`HEARTBEAT_TIMEOUT`: Heartbeat timed out. The setting of `DefaultResult` is used.</li>
<li>`NOTIFICATION_FAILURE`: Failed to send the notification. The setting of `DefaultResult` is used.</li>
<li>`CALL_INTERFACE`: Calls the `CompleteLifecycleAction` to set the result</li>
<li>ANOTHER_ACTION_ABANDON: It has been set to `ABANDON` by another operation.</li>
<li>COMMAND_CALL_FAILURE: Failed to call the command. The DefaultResult is applied.</li>
<li>COMMAND_EXEC_FINISH: Command completed</li>
<li>COMMAND_CALL_FAILURE: Failed to execute the command. The DefaultResult is applied.</li>
<li>COMMAND_EXEC_RESULT_CHECK_FAILURE: Failed to check the command result. The DefaultResult is applied.</li>
     */
    public void setResultReason(String ResultReason) {
        this.ResultReason = ResultReason;
    }

    public LifecycleActionResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleActionResultInfo(LifecycleActionResultInfo source) {
        if (source.LifecycleHookId != null) {
            this.LifecycleHookId = new String(source.LifecycleHookId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
        if (source.InvokeCommandResult != null) {
            this.InvokeCommandResult = new String(source.InvokeCommandResult);
        }
        if (source.NotificationResult != null) {
            this.NotificationResult = new String(source.NotificationResult);
        }
        if (source.LifecycleActionResult != null) {
            this.LifecycleActionResult = new String(source.LifecycleActionResult);
        }
        if (source.ResultReason != null) {
            this.ResultReason = new String(source.ResultReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "InvokeCommandResult", this.InvokeCommandResult);
        this.setParamSimple(map, prefix + "NotificationResult", this.NotificationResult);
        this.setParamSimple(map, prefix + "LifecycleActionResult", this.LifecycleActionResult);
        this.setParamSimple(map, prefix + "ResultReason", this.ResultReason);

    }
}

