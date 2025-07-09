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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVideoModerationTaskRequest extends AbstractModel {

    /**
    * Business type, which is used to define a template policy.
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * Task type. Values: `VIDEO` (video on demand), `LIVE_VIDEO` (live video).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Task information. You can create up to 10 tasks at a time.
    */
    @SerializedName("Tasks")
    @Expose
    private TaskInput [] Tasks;

    /**
    * Key of the callback signature. For more details, see the signature documentation.
    */
    @SerializedName("Seed")
    @Expose
    private String Seed;

    /**
    * Callback URL that will receive moderation information. After it is configured, the non-compliant audio segments detected in moderation will be sent through this API.
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * Priority, which determines the execution order of your moderation tasks. The default value is 0.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get Business type, which is used to define a template policy. 
     * @return BizType Business type, which is used to define a template policy.
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set Business type, which is used to define a template policy.
     * @param BizType Business type, which is used to define a template policy.
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get Task type. Values: `VIDEO` (video on demand), `LIVE_VIDEO` (live video). 
     * @return Type Task type. Values: `VIDEO` (video on demand), `LIVE_VIDEO` (live video).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type. Values: `VIDEO` (video on demand), `LIVE_VIDEO` (live video).
     * @param Type Task type. Values: `VIDEO` (video on demand), `LIVE_VIDEO` (live video).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Task information. You can create up to 10 tasks at a time. 
     * @return Tasks Task information. You can create up to 10 tasks at a time.
     */
    public TaskInput [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task information. You can create up to 10 tasks at a time.
     * @param Tasks Task information. You can create up to 10 tasks at a time.
     */
    public void setTasks(TaskInput [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Key of the callback signature. For more details, see the signature documentation. 
     * @return Seed Key of the callback signature. For more details, see the signature documentation.
     */
    public String getSeed() {
        return this.Seed;
    }

    /**
     * Set Key of the callback signature. For more details, see the signature documentation.
     * @param Seed Key of the callback signature. For more details, see the signature documentation.
     */
    public void setSeed(String Seed) {
        this.Seed = Seed;
    }

    /**
     * Get Callback URL that will receive moderation information. After it is configured, the non-compliant audio segments detected in moderation will be sent through this API. 
     * @return CallbackUrl Callback URL that will receive moderation information. After it is configured, the non-compliant audio segments detected in moderation will be sent through this API.
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set Callback URL that will receive moderation information. After it is configured, the non-compliant audio segments detected in moderation will be sent through this API.
     * @param CallbackUrl Callback URL that will receive moderation information. After it is configured, the non-compliant audio segments detected in moderation will be sent through this API.
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get Priority, which determines the execution order of your moderation tasks. The default value is 0. 
     * @return Priority Priority, which determines the execution order of your moderation tasks. The default value is 0.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority, which determines the execution order of your moderation tasks. The default value is 0.
     * @param Priority Priority, which determines the execution order of your moderation tasks. The default value is 0.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public CreateVideoModerationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVideoModerationTaskRequest(CreateVideoModerationTaskRequest source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskInput[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskInput(source.Tasks[i]);
            }
        }
        if (source.Seed != null) {
            this.Seed = new String(source.Seed);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

