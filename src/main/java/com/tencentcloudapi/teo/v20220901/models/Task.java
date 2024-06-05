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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel {

    /**
    * ID of the task.
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
    * Type of the task.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Node cache purge method, with values:
<li>invalidate: Marks as expired. A back-to-origin validation is triggered upon user request, sending an HTTP conditional request with If-None-Match and If-Modified-Since headers. If the origin server responds with 200, the node will fetch new resources from the origin and update the cache; if the origin server responds with 304, the cache will not be updated;</li>
<li>delete: Directly deletes the node's cache, triggering a resource fetch from the origin upon user request.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Status. Valid values:
<li>processing: Processing;</li>
<li>success: Succeeded;</li>
<li>failed: Failed;</li>
<li>timeout: Timed out. </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time of the task.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Completion time of the task.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get ID of the task. 
     * @return JobId ID of the task.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set ID of the task.
     * @param JobId ID of the task.
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
     * Get Type of the task. 
     * @return Type Type of the task.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the task.
     * @param Type Type of the task.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Node cache purge method, with values:
<li>invalidate: Marks as expired. A back-to-origin validation is triggered upon user request, sending an HTTP conditional request with If-None-Match and If-Modified-Since headers. If the origin server responds with 200, the node will fetch new resources from the origin and update the cache; if the origin server responds with 304, the cache will not be updated;</li>
<li>delete: Directly deletes the node's cache, triggering a resource fetch from the origin upon user request.</li>
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return Method Node cache purge method, with values:
<li>invalidate: Marks as expired. A back-to-origin validation is triggered upon user request, sending an HTTP conditional request with If-None-Match and If-Modified-Since headers. If the origin server responds with 200, the node will fetch new resources from the origin and update the cache; if the origin server responds with 304, the cache will not be updated;</li>
<li>delete: Directly deletes the node's cache, triggering a resource fetch from the origin upon user request.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Node cache purge method, with values:
<li>invalidate: Marks as expired. A back-to-origin validation is triggered upon user request, sending an HTTP conditional request with If-None-Match and If-Modified-Since headers. If the origin server responds with 200, the node will fetch new resources from the origin and update the cache; if the origin server responds with 304, the cache will not be updated;</li>
<li>delete: Directly deletes the node's cache, triggering a resource fetch from the origin upon user request.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param Method Node cache purge method, with values:
<li>invalidate: Marks as expired. A back-to-origin validation is triggered upon user request, sending an HTTP conditional request with If-None-Match and If-Modified-Since headers. If the origin server responds with 200, the node will fetch new resources from the origin and update the cache; if the origin server responds with 304, the cache will not be updated;</li>
<li>delete: Directly deletes the node's cache, triggering a resource fetch from the origin upon user request.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Status. Valid values:
<li>processing: Processing;</li>
<li>success: Succeeded;</li>
<li>failed: Failed;</li>
<li>timeout: Timed out. </li> 
     * @return Status Status. Valid values:
<li>processing: Processing;</li>
<li>success: Succeeded;</li>
<li>failed: Failed;</li>
<li>timeout: Timed out. </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values:
<li>processing: Processing;</li>
<li>success: Succeeded;</li>
<li>failed: Failed;</li>
<li>timeout: Timed out. </li>
     * @param Status Status. Valid values:
<li>processing: Processing;</li>
<li>success: Succeeded;</li>
<li>failed: Failed;</li>
<li>timeout: Timed out. </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time of the task. 
     * @return CreateTime Creation time of the task.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the task.
     * @param CreateTime Creation time of the task.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Completion time of the task. 
     * @return UpdateTime Completion time of the task.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Completion time of the task.
     * @param UpdateTime Completion time of the task.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    }
}

