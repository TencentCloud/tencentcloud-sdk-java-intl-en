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
    * Whether the notification is sent to CMQ successfully
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
    * Cause of the result
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
     * Get Whether the notification is sent to CMQ successfully 
     * @return NotificationResult Whether the notification is sent to CMQ successfully
     */
    public String getNotificationResult() {
        return this.NotificationResult;
    }

    /**
     * Set Whether the notification is sent to CMQ successfully
     * @param NotificationResult Whether the notification is sent to CMQ successfully
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
     * Get Cause of the result 
     * @return ResultReason Cause of the result
     */
    public String getResultReason() {
        return this.ResultReason;
    }

    /**
     * Set Cause of the result
     * @param ResultReason Cause of the result
     */
    public void setResultReason(String ResultReason) {
        this.ResultReason = ResultReason;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NotificationResult", this.NotificationResult);
        this.setParamSimple(map, prefix + "LifecycleActionResult", this.LifecycleActionResult);
        this.setParamSimple(map, prefix + "ResultReason", this.ResultReason);

    }
}

