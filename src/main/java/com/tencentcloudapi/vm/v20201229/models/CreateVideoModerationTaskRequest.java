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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVideoModerationTaskRequest extends AbstractModel{

    /**
    * This parameter is used to pass in the task type of a moderation task. Valid values: **VIDEO** (video on demand), **LIVE_VIDEO** (video live streaming).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This field indicates the input video moderation task information. For the specific input content, see the detailed description of the `TaskInput` data structure.<br>Note: you can create up to **10 tasks** at a time.
    */
    @SerializedName("Tasks")
    @Expose
    private TaskInput [] Tasks;

    /**
    * This field indicates the specific number of the policy, which is used for API scheduling and can be configured in the CMS console. If the `Biztype` parameter is passed in, a moderation policy will be used based on the business scenario; otherwise, the default moderation policy will be used.<br>Note: `Biztype` can contain 3–32 digits, letters, and underscores; different `Biztype` values are associated with different business scenarios and moderation policies, so you need to verify the `Biztype` before calling this API.
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * This field is optional and indicates the key information of the callback signature, which is used to ensure the data security. The signature algorithm is to add the `X-Signature` field to the returned HTTP header, whose value is the SHA256-encoded hex string of `seed` + `body` . After receiving the callback data, you can calculate `X-Signature` by using **sha256(seed + body)** based on the returned `body` for verification.<br>For specific use cases, see [Signature Algorithm v3](https://intl.cloud.tencent.com/document/product/1265/51885?from_cn_redirect=1).
    */
    @SerializedName("Seed")
    @Expose
    private String Seed;

    /**
    * This field is optional and indicates the address for receiving the moderation information callback in the default format of URL. After it is configured successfully, the non-compliant audio/video segments generated during moderation will be sent through this API. For the format of the returned callback content, see [Sample Callback Signature](https://intl.cloud.tencent.com/document/product/1265/51879?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E5.9B.9E.E8.B0.83.E7.AD.BE.E5.90.8D.E7.A4.BA.E4.BE.8B) <br>Note: by default, audio segments are captured at intervals of **15 seconds**, and video frames are captured at intervals of **5 seconds**. If you configure the capturing interval, segments will be returned according to the configuration.
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * This parameter is optional and used to pass in the priority of a moderation task. When you have multiple tasks in the queue, you can use this parameter to control their priorities for processing the queue jumping logic. **Default value: 0**.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get This parameter is used to pass in the task type of a moderation task. Valid values: **VIDEO** (video on demand), **LIVE_VIDEO** (video live streaming). 
     * @return Type This parameter is used to pass in the task type of a moderation task. Valid values: **VIDEO** (video on demand), **LIVE_VIDEO** (video live streaming).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set This parameter is used to pass in the task type of a moderation task. Valid values: **VIDEO** (video on demand), **LIVE_VIDEO** (video live streaming).
     * @param Type This parameter is used to pass in the task type of a moderation task. Valid values: **VIDEO** (video on demand), **LIVE_VIDEO** (video live streaming).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This field indicates the input video moderation task information. For the specific input content, see the detailed description of the `TaskInput` data structure.<br>Note: you can create up to **10 tasks** at a time. 
     * @return Tasks This field indicates the input video moderation task information. For the specific input content, see the detailed description of the `TaskInput` data structure.<br>Note: you can create up to **10 tasks** at a time.
     */
    public TaskInput [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set This field indicates the input video moderation task information. For the specific input content, see the detailed description of the `TaskInput` data structure.<br>Note: you can create up to **10 tasks** at a time.
     * @param Tasks This field indicates the input video moderation task information. For the specific input content, see the detailed description of the `TaskInput` data structure.<br>Note: you can create up to **10 tasks** at a time.
     */
    public void setTasks(TaskInput [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get This field indicates the specific number of the policy, which is used for API scheduling and can be configured in the CMS console. If the `Biztype` parameter is passed in, a moderation policy will be used based on the business scenario; otherwise, the default moderation policy will be used.<br>Note: `Biztype` can contain 3–32 digits, letters, and underscores; different `Biztype` values are associated with different business scenarios and moderation policies, so you need to verify the `Biztype` before calling this API. 
     * @return BizType This field indicates the specific number of the policy, which is used for API scheduling and can be configured in the CMS console. If the `Biztype` parameter is passed in, a moderation policy will be used based on the business scenario; otherwise, the default moderation policy will be used.<br>Note: `Biztype` can contain 3–32 digits, letters, and underscores; different `Biztype` values are associated with different business scenarios and moderation policies, so you need to verify the `Biztype` before calling this API.
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set This field indicates the specific number of the policy, which is used for API scheduling and can be configured in the CMS console. If the `Biztype` parameter is passed in, a moderation policy will be used based on the business scenario; otherwise, the default moderation policy will be used.<br>Note: `Biztype` can contain 3–32 digits, letters, and underscores; different `Biztype` values are associated with different business scenarios and moderation policies, so you need to verify the `Biztype` before calling this API.
     * @param BizType This field indicates the specific number of the policy, which is used for API scheduling and can be configured in the CMS console. If the `Biztype` parameter is passed in, a moderation policy will be used based on the business scenario; otherwise, the default moderation policy will be used.<br>Note: `Biztype` can contain 3–32 digits, letters, and underscores; different `Biztype` values are associated with different business scenarios and moderation policies, so you need to verify the `Biztype` before calling this API.
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get This field is optional and indicates the key information of the callback signature, which is used to ensure the data security. The signature algorithm is to add the `X-Signature` field to the returned HTTP header, whose value is the SHA256-encoded hex string of `seed` + `body` . After receiving the callback data, you can calculate `X-Signature` by using **sha256(seed + body)** based on the returned `body` for verification.<br>For specific use cases, see [Signature Algorithm v3](https://intl.cloud.tencent.com/document/product/1265/51885?from_cn_redirect=1). 
     * @return Seed This field is optional and indicates the key information of the callback signature, which is used to ensure the data security. The signature algorithm is to add the `X-Signature` field to the returned HTTP header, whose value is the SHA256-encoded hex string of `seed` + `body` . After receiving the callback data, you can calculate `X-Signature` by using **sha256(seed + body)** based on the returned `body` for verification.<br>For specific use cases, see [Signature Algorithm v3](https://intl.cloud.tencent.com/document/product/1265/51885?from_cn_redirect=1).
     */
    public String getSeed() {
        return this.Seed;
    }

    /**
     * Set This field is optional and indicates the key information of the callback signature, which is used to ensure the data security. The signature algorithm is to add the `X-Signature` field to the returned HTTP header, whose value is the SHA256-encoded hex string of `seed` + `body` . After receiving the callback data, you can calculate `X-Signature` by using **sha256(seed + body)** based on the returned `body` for verification.<br>For specific use cases, see [Signature Algorithm v3](https://intl.cloud.tencent.com/document/product/1265/51885?from_cn_redirect=1).
     * @param Seed This field is optional and indicates the key information of the callback signature, which is used to ensure the data security. The signature algorithm is to add the `X-Signature` field to the returned HTTP header, whose value is the SHA256-encoded hex string of `seed` + `body` . After receiving the callback data, you can calculate `X-Signature` by using **sha256(seed + body)** based on the returned `body` for verification.<br>For specific use cases, see [Signature Algorithm v3](https://intl.cloud.tencent.com/document/product/1265/51885?from_cn_redirect=1).
     */
    public void setSeed(String Seed) {
        this.Seed = Seed;
    }

    /**
     * Get This field is optional and indicates the address for receiving the moderation information callback in the default format of URL. After it is configured successfully, the non-compliant audio/video segments generated during moderation will be sent through this API. For the format of the returned callback content, see [Sample Callback Signature](https://intl.cloud.tencent.com/document/product/1265/51879?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E5.9B.9E.E8.B0.83.E7.AD.BE.E5.90.8D.E7.A4.BA.E4.BE.8B) <br>Note: by default, audio segments are captured at intervals of **15 seconds**, and video frames are captured at intervals of **5 seconds**. If you configure the capturing interval, segments will be returned according to the configuration. 
     * @return CallbackUrl This field is optional and indicates the address for receiving the moderation information callback in the default format of URL. After it is configured successfully, the non-compliant audio/video segments generated during moderation will be sent through this API. For the format of the returned callback content, see [Sample Callback Signature](https://intl.cloud.tencent.com/document/product/1265/51879?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E5.9B.9E.E8.B0.83.E7.AD.BE.E5.90.8D.E7.A4.BA.E4.BE.8B) <br>Note: by default, audio segments are captured at intervals of **15 seconds**, and video frames are captured at intervals of **5 seconds**. If you configure the capturing interval, segments will be returned according to the configuration.
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set This field is optional and indicates the address for receiving the moderation information callback in the default format of URL. After it is configured successfully, the non-compliant audio/video segments generated during moderation will be sent through this API. For the format of the returned callback content, see [Sample Callback Signature](https://intl.cloud.tencent.com/document/product/1265/51879?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E5.9B.9E.E8.B0.83.E7.AD.BE.E5.90.8D.E7.A4.BA.E4.BE.8B) <br>Note: by default, audio segments are captured at intervals of **15 seconds**, and video frames are captured at intervals of **5 seconds**. If you configure the capturing interval, segments will be returned according to the configuration.
     * @param CallbackUrl This field is optional and indicates the address for receiving the moderation information callback in the default format of URL. After it is configured successfully, the non-compliant audio/video segments generated during moderation will be sent through this API. For the format of the returned callback content, see [Sample Callback Signature](https://intl.cloud.tencent.com/document/product/1265/51879?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E5.9B.9E.E8.B0.83.E7.AD.BE.E5.90.8D.E7.A4.BA.E4.BE.8B) <br>Note: by default, audio segments are captured at intervals of **15 seconds**, and video frames are captured at intervals of **5 seconds**. If you configure the capturing interval, segments will be returned according to the configuration.
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get This parameter is optional and used to pass in the priority of a moderation task. When you have multiple tasks in the queue, you can use this parameter to control their priorities for processing the queue jumping logic. **Default value: 0**. 
     * @return Priority This parameter is optional and used to pass in the priority of a moderation task. When you have multiple tasks in the queue, you can use this parameter to control their priorities for processing the queue jumping logic. **Default value: 0**.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set This parameter is optional and used to pass in the priority of a moderation task. When you have multiple tasks in the queue, you can use this parameter to control their priorities for processing the queue jumping logic. **Default value: 0**.
     * @param Priority This parameter is optional and used to pass in the priority of a moderation task. When you have multiple tasks in the queue, you can use this parameter to control their priorities for processing the queue jumping logic. **Default value: 0**.
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskInput[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskInput(source.Tasks[i]);
            }
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

