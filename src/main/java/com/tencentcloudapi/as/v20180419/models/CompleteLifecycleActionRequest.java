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

public class CompleteLifecycleActionRequest extends AbstractModel{

    /**
    * Lifecycle hook ID
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * Result of the lifecycle action. Value range: "CONTINUE", "ABANDON"
    */
    @SerializedName("LifecycleActionResult")
    @Expose
    private String LifecycleActionResult;

    /**
    * Instance ID. Either "InstanceId" or "LifecycleActionToken" must be specified
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Either "InstanceId" or "LifecycleActionToken" must be specified
    */
    @SerializedName("LifecycleActionToken")
    @Expose
    private String LifecycleActionToken;

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
     * Get Result of the lifecycle action. Value range: "CONTINUE", "ABANDON" 
     * @return LifecycleActionResult Result of the lifecycle action. Value range: "CONTINUE", "ABANDON"
     */
    public String getLifecycleActionResult() {
        return this.LifecycleActionResult;
    }

    /**
     * Set Result of the lifecycle action. Value range: "CONTINUE", "ABANDON"
     * @param LifecycleActionResult Result of the lifecycle action. Value range: "CONTINUE", "ABANDON"
     */
    public void setLifecycleActionResult(String LifecycleActionResult) {
        this.LifecycleActionResult = LifecycleActionResult;
    }

    /**
     * Get Instance ID. Either "InstanceId" or "LifecycleActionToken" must be specified 
     * @return InstanceId Instance ID. Either "InstanceId" or "LifecycleActionToken" must be specified
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. Either "InstanceId" or "LifecycleActionToken" must be specified
     * @param InstanceId Instance ID. Either "InstanceId" or "LifecycleActionToken" must be specified
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Either "InstanceId" or "LifecycleActionToken" must be specified 
     * @return LifecycleActionToken Either "InstanceId" or "LifecycleActionToken" must be specified
     */
    public String getLifecycleActionToken() {
        return this.LifecycleActionToken;
    }

    /**
     * Set Either "InstanceId" or "LifecycleActionToken" must be specified
     * @param LifecycleActionToken Either "InstanceId" or "LifecycleActionToken" must be specified
     */
    public void setLifecycleActionToken(String LifecycleActionToken) {
        this.LifecycleActionToken = LifecycleActionToken;
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

