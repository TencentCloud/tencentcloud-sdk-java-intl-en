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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Resource.
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Task type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Node cache purge method, with values:
<li>invalidate: Marks as expired. A back-to-origin validation is triggered upon user request, sending an HTTP conditional request with If-None-Match and If-Modified-Since headers. If the origin server responds with 200, the node will fetch new resources from the origin and update the cache; if the origin server responds with 304, the cache will not be updated;</li>
<li>delete: Directly deletes the node's cache, triggering a resource fetch from the origin upon user request.</li>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Status. Valid values:
<li>processing: Processing;</li>
<li>success: Succeeded;</li>
<li>failed: Failed;</li>
<li>timeout: Timed out;</li>
<li>canceled: Canceled.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task completion time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Failure type of update and preheating. Valid values:
<li>taskFailed: Task failure;</li>
<li>quotaExceeded: quota exceeded;</li>
<li>downloadManifestFailed: Failed to download the description file;</li>
<li>accessDenied: access denied.</li>
<li>originPullFailed: origin-pull failure.</li>
    */
    @SerializedName("FailType")
    @Expose
    private String FailType;

    /**
    * Failure reason description for cache purge and cache pre-warming.
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
     * Get Task ID. 
     * @return JobId Task ID.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Task ID.
     * @param JobId Task ID.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Resource. 
     * @return Target Resource.
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Resource.
     * @param Target Resource.
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Task type. 
     * @return Type Task type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type.
     * @param Type Task type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Node cache purge method, with values:
<li>invalidate: Marks as expired. A back-to-origin validation is triggered upon user request, sending an HTTP conditional request with If-None-Match and If-Modified-Since headers. If the origin server responds with 200, the node will fetch new resources from the origin and update the cache; if the origin server responds with 304, the cache will not be updated;</li>
<li>delete: Directly deletes the node's cache, triggering a resource fetch from the origin upon user request.</li> 
     * @return Method Node cache purge method, with values:
<li>invalidate: Marks as expired. A back-to-origin validation is triggered upon user request, sending an HTTP conditional request with If-None-Match and If-Modified-Since headers. If the origin server responds with 200, the node will fetch new resources from the origin and update the cache; if the origin server responds with 304, the cache will not be updated;</li>
<li>delete: Directly deletes the node's cache, triggering a resource fetch from the origin upon user request.</li>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Node cache purge method, with values:
<li>invalidate: Marks as expired. A back-to-origin validation is triggered upon user request, sending an HTTP conditional request with If-None-Match and If-Modified-Since headers. If the origin server responds with 200, the node will fetch new resources from the origin and update the cache; if the origin server responds with 304, the cache will not be updated;</li>
<li>delete: Directly deletes the node's cache, triggering a resource fetch from the origin upon user request.</li>
     * @param Method Node cache purge method, with values:
<li>invalidate: Marks as expired. A back-to-origin validation is triggered upon user request, sending an HTTP conditional request with If-None-Match and If-Modified-Since headers. If the origin server responds with 200, the node will fetch new resources from the origin and update the cache; if the origin server responds with 304, the cache will not be updated;</li>
<li>delete: Directly deletes the node's cache, triggering a resource fetch from the origin upon user request.</li>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Status. Valid values:
<li>processing: Processing;</li>
<li>success: Succeeded;</li>
<li>failed: Failed;</li>
<li>timeout: Timed out;</li>
<li>canceled: Canceled.</li> 
     * @return Status Status. Valid values:
<li>processing: Processing;</li>
<li>success: Succeeded;</li>
<li>failed: Failed;</li>
<li>timeout: Timed out;</li>
<li>canceled: Canceled.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values:
<li>processing: Processing;</li>
<li>success: Succeeded;</li>
<li>failed: Failed;</li>
<li>timeout: Timed out;</li>
<li>canceled: Canceled.</li>
     * @param Status Status. Valid values:
<li>processing: Processing;</li>
<li>success: Succeeded;</li>
<li>failed: Failed;</li>
<li>timeout: Timed out;</li>
<li>canceled: Canceled.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task creation time. 
     * @return CreateTime Task creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time.
     * @param CreateTime Task creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task completion time. 
     * @return UpdateTime Task completion time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Task completion time.
     * @param UpdateTime Task completion time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Failure type of update and preheating. Valid values:
<li>taskFailed: Task failure;</li>
<li>quotaExceeded: quota exceeded;</li>
<li>downloadManifestFailed: Failed to download the description file;</li>
<li>accessDenied: access denied.</li>
<li>originPullFailed: origin-pull failure.</li> 
     * @return FailType Failure type of update and preheating. Valid values:
<li>taskFailed: Task failure;</li>
<li>quotaExceeded: quota exceeded;</li>
<li>downloadManifestFailed: Failed to download the description file;</li>
<li>accessDenied: access denied.</li>
<li>originPullFailed: origin-pull failure.</li>
     */
    public String getFailType() {
        return this.FailType;
    }

    /**
     * Set Failure type of update and preheating. Valid values:
<li>taskFailed: Task failure;</li>
<li>quotaExceeded: quota exceeded;</li>
<li>downloadManifestFailed: Failed to download the description file;</li>
<li>accessDenied: access denied.</li>
<li>originPullFailed: origin-pull failure.</li>
     * @param FailType Failure type of update and preheating. Valid values:
<li>taskFailed: Task failure;</li>
<li>quotaExceeded: quota exceeded;</li>
<li>downloadManifestFailed: Failed to download the description file;</li>
<li>accessDenied: access denied.</li>
<li>originPullFailed: origin-pull failure.</li>
     */
    public void setFailType(String FailType) {
        this.FailType = FailType;
    }

    /**
     * Get Failure reason description for cache purge and cache pre-warming. 
     * @return FailMessage Failure reason description for cache purge and cache pre-warming.
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set Failure reason description for cache purge and cache pre-warming.
     * @param FailMessage Failure reason description for cache purge and cache pre-warming.
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FailType != null) {
            this.FailType = new String(source.FailType);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FailType", this.FailType);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);

    }
}

