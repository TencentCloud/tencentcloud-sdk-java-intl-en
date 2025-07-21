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

public class CompleteLifecycleActionRequest extends AbstractModel {

    /**
    * Lifecycle hook ID. you can get the lifecycle hook ID by calling the api [DescribeLifecycleHooks](https://intl.cloud.tencent.com/document/api/377/34452?from_cn_redirect=1) and retrieving the `LifecycleHookId` from the returned information.
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * Describes the result of the lifecycle action. valid values are as follows:.
<Li>CONTINUE: default value, means continue execution of capacity expansion or reduction</li>.
<li>ABANDON: for scale-out hooks, CVM instances with hook timeout or failed LifecycleCommand execution will be released directly or moved; for scale-in hooks, scale-in activities will continue.</li>.
    */
    @SerializedName("LifecycleActionResult")
    @Expose
    private String LifecycleActionResult;

    /**
    * One of the parameters `InstanceId` or `LifecycleActionToken` is required. you can get the instance ID by logging in to the [console](https://console.cloud.tencent.com/cvm/index) or making an api call to [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and retrieving the `InstanceId` from the returned information.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Lifecycle action token. specifies that one of `InstanceId` or `LifecycleActionToken` must be filled.
The method for accessing the parameter is as follows: when the hook of the `NotificationTarget` parameter is triggered, deliver a message containing the token to the message queue specified in the `NotificationTarget` parameter. the message queue consumer can obtain the token from the message.
    */
    @SerializedName("LifecycleActionToken")
    @Expose
    private String LifecycleActionToken;

    /**
     * Get Lifecycle hook ID. you can get the lifecycle hook ID by calling the api [DescribeLifecycleHooks](https://intl.cloud.tencent.com/document/api/377/34452?from_cn_redirect=1) and retrieving the `LifecycleHookId` from the returned information. 
     * @return LifecycleHookId Lifecycle hook ID. you can get the lifecycle hook ID by calling the api [DescribeLifecycleHooks](https://intl.cloud.tencent.com/document/api/377/34452?from_cn_redirect=1) and retrieving the `LifecycleHookId` from the returned information.
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set Lifecycle hook ID. you can get the lifecycle hook ID by calling the api [DescribeLifecycleHooks](https://intl.cloud.tencent.com/document/api/377/34452?from_cn_redirect=1) and retrieving the `LifecycleHookId` from the returned information.
     * @param LifecycleHookId Lifecycle hook ID. you can get the lifecycle hook ID by calling the api [DescribeLifecycleHooks](https://intl.cloud.tencent.com/document/api/377/34452?from_cn_redirect=1) and retrieving the `LifecycleHookId` from the returned information.
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get Describes the result of the lifecycle action. valid values are as follows:.
<Li>CONTINUE: default value, means continue execution of capacity expansion or reduction</li>.
<li>ABANDON: for scale-out hooks, CVM instances with hook timeout or failed LifecycleCommand execution will be released directly or moved; for scale-in hooks, scale-in activities will continue.</li>. 
     * @return LifecycleActionResult Describes the result of the lifecycle action. valid values are as follows:.
<Li>CONTINUE: default value, means continue execution of capacity expansion or reduction</li>.
<li>ABANDON: for scale-out hooks, CVM instances with hook timeout or failed LifecycleCommand execution will be released directly or moved; for scale-in hooks, scale-in activities will continue.</li>.
     */
    public String getLifecycleActionResult() {
        return this.LifecycleActionResult;
    }

    /**
     * Set Describes the result of the lifecycle action. valid values are as follows:.
<Li>CONTINUE: default value, means continue execution of capacity expansion or reduction</li>.
<li>ABANDON: for scale-out hooks, CVM instances with hook timeout or failed LifecycleCommand execution will be released directly or moved; for scale-in hooks, scale-in activities will continue.</li>.
     * @param LifecycleActionResult Describes the result of the lifecycle action. valid values are as follows:.
<Li>CONTINUE: default value, means continue execution of capacity expansion or reduction</li>.
<li>ABANDON: for scale-out hooks, CVM instances with hook timeout or failed LifecycleCommand execution will be released directly or moved; for scale-in hooks, scale-in activities will continue.</li>.
     */
    public void setLifecycleActionResult(String LifecycleActionResult) {
        this.LifecycleActionResult = LifecycleActionResult;
    }

    /**
     * Get One of the parameters `InstanceId` or `LifecycleActionToken` is required. you can get the instance ID by logging in to the [console](https://console.cloud.tencent.com/cvm/index) or making an api call to [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and retrieving the `InstanceId` from the returned information. 
     * @return InstanceId One of the parameters `InstanceId` or `LifecycleActionToken` is required. you can get the instance ID by logging in to the [console](https://console.cloud.tencent.com/cvm/index) or making an api call to [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and retrieving the `InstanceId` from the returned information.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set One of the parameters `InstanceId` or `LifecycleActionToken` is required. you can get the instance ID by logging in to the [console](https://console.cloud.tencent.com/cvm/index) or making an api call to [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and retrieving the `InstanceId` from the returned information.
     * @param InstanceId One of the parameters `InstanceId` or `LifecycleActionToken` is required. you can get the instance ID by logging in to the [console](https://console.cloud.tencent.com/cvm/index) or making an api call to [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1) and retrieving the `InstanceId` from the returned information.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Lifecycle action token. specifies that one of `InstanceId` or `LifecycleActionToken` must be filled.
The method for accessing the parameter is as follows: when the hook of the `NotificationTarget` parameter is triggered, deliver a message containing the token to the message queue specified in the `NotificationTarget` parameter. the message queue consumer can obtain the token from the message. 
     * @return LifecycleActionToken Lifecycle action token. specifies that one of `InstanceId` or `LifecycleActionToken` must be filled.
The method for accessing the parameter is as follows: when the hook of the `NotificationTarget` parameter is triggered, deliver a message containing the token to the message queue specified in the `NotificationTarget` parameter. the message queue consumer can obtain the token from the message.
     */
    public String getLifecycleActionToken() {
        return this.LifecycleActionToken;
    }

    /**
     * Set Lifecycle action token. specifies that one of `InstanceId` or `LifecycleActionToken` must be filled.
The method for accessing the parameter is as follows: when the hook of the `NotificationTarget` parameter is triggered, deliver a message containing the token to the message queue specified in the `NotificationTarget` parameter. the message queue consumer can obtain the token from the message.
     * @param LifecycleActionToken Lifecycle action token. specifies that one of `InstanceId` or `LifecycleActionToken` must be filled.
The method for accessing the parameter is as follows: when the hook of the `NotificationTarget` parameter is triggered, deliver a message containing the token to the message queue specified in the `NotificationTarget` parameter. the message queue consumer can obtain the token from the message.
     */
    public void setLifecycleActionToken(String LifecycleActionToken) {
        this.LifecycleActionToken = LifecycleActionToken;
    }

    public CompleteLifecycleActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompleteLifecycleActionRequest(CompleteLifecycleActionRequest source) {
        if (source.LifecycleHookId != null) {
            this.LifecycleHookId = new String(source.LifecycleHookId);
        }
        if (source.LifecycleActionResult != null) {
            this.LifecycleActionResult = new String(source.LifecycleActionResult);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LifecycleActionToken != null) {
            this.LifecycleActionToken = new String(source.LifecycleActionToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "LifecycleActionResult", this.LifecycleActionResult);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LifecycleActionToken", this.LifecycleActionToken);

    }
}

