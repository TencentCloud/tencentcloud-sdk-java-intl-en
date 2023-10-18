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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAudioModerationTaskRequest extends AbstractModel {

    /**
    * This field indicates the input audio moderation task information. For the specific input content, see the detailed description of the `TaskInput` data structure.<br>Note: you can create up to **10 tasks** at a time.
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
    * This field indicates the input audio moderation type. Valid values: **AUDIO** (audio on demand), **LIVE_AUDIO** (audio live streaming). Default value: AUDIO.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This field is optional and indicates the key information of the callback signature, which is used to ensure the data security. The signature algorithm is to add the `X-Signature` field to the returned HTTP header, whose value is the SHA256-encoded hex string of `seed` + `body` . After receiving the callback data, you can calculate `X-Signature` by using **sha256(seed + body)** based on the returned `body` for verification.<br>For specific use cases, see [Signature Algorithm v3](https://intl.cloud.tencent.com/document/product/1219/53263?from_cn_redirect=1).
    */
    @SerializedName("Seed")
    @Expose
    private String Seed;

    /**
    * This field is optional and indicates the address for receiving the moderation information callback in the default format of URL. After it is configured successfully, the non-compliant audio/video segments generated during moderation will be sent through this API. For the format of the returned callback content, see [Sample Callback Signature](https://intl.cloud.tencent.com/document/product/1219/53257?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E5.9B.9E.E8.B0.83.E7.AD.BE.E5.90.8D.E7.A4.BA.E4.BE.8B)
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get This field indicates the input audio moderation task information. For the specific input content, see the detailed description of the `TaskInput` data structure.<br>Note: you can create up to **10 tasks** at a time. 
     * @return Tasks This field indicates the input audio moderation task information. For the specific input content, see the detailed description of the `TaskInput` data structure.<br>Note: you can create up to **10 tasks** at a time.
     */
    public TaskInput [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set This field indicates the input audio moderation task information. For the specific input content, see the detailed description of the `TaskInput` data structure.<br>Note: you can create up to **10 tasks** at a time.
     * @param Tasks This field indicates the input audio moderation task information. For the specific input content, see the detailed description of the `TaskInput` data structure.<br>Note: you can create up to **10 tasks** at a time.
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
     * Get This field indicates the input audio moderation type. Valid values: **AUDIO** (audio on demand), **LIVE_AUDIO** (audio live streaming). Default value: AUDIO. 
     * @return Type This field indicates the input audio moderation type. Valid values: **AUDIO** (audio on demand), **LIVE_AUDIO** (audio live streaming). Default value: AUDIO.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set This field indicates the input audio moderation type. Valid values: **AUDIO** (audio on demand), **LIVE_AUDIO** (audio live streaming). Default value: AUDIO.
     * @param Type This field indicates the input audio moderation type. Valid values: **AUDIO** (audio on demand), **LIVE_AUDIO** (audio live streaming). Default value: AUDIO.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This field is optional and indicates the key information of the callback signature, which is used to ensure the data security. The signature algorithm is to add the `X-Signature` field to the returned HTTP header, whose value is the SHA256-encoded hex string of `seed` + `body` . After receiving the callback data, you can calculate `X-Signature` by using **sha256(seed + body)** based on the returned `body` for verification.<br>For specific use cases, see [Signature Algorithm v3](https://intl.cloud.tencent.com/document/product/1219/53263?from_cn_redirect=1). 
     * @return Seed This field is optional and indicates the key information of the callback signature, which is used to ensure the data security. The signature algorithm is to add the `X-Signature` field to the returned HTTP header, whose value is the SHA256-encoded hex string of `seed` + `body` . After receiving the callback data, you can calculate `X-Signature` by using **sha256(seed + body)** based on the returned `body` for verification.<br>For specific use cases, see [Signature Algorithm v3](https://intl.cloud.tencent.com/document/product/1219/53263?from_cn_redirect=1).
     */
    public String getSeed() {
        return this.Seed;
    }

    /**
     * Set This field is optional and indicates the key information of the callback signature, which is used to ensure the data security. The signature algorithm is to add the `X-Signature` field to the returned HTTP header, whose value is the SHA256-encoded hex string of `seed` + `body` . After receiving the callback data, you can calculate `X-Signature` by using **sha256(seed + body)** based on the returned `body` for verification.<br>For specific use cases, see [Signature Algorithm v3](https://intl.cloud.tencent.com/document/product/1219/53263?from_cn_redirect=1).
     * @param Seed This field is optional and indicates the key information of the callback signature, which is used to ensure the data security. The signature algorithm is to add the `X-Signature` field to the returned HTTP header, whose value is the SHA256-encoded hex string of `seed` + `body` . After receiving the callback data, you can calculate `X-Signature` by using **sha256(seed + body)** based on the returned `body` for verification.<br>For specific use cases, see [Signature Algorithm v3](https://intl.cloud.tencent.com/document/product/1219/53263?from_cn_redirect=1).
     */
    public void setSeed(String Seed) {
        this.Seed = Seed;
    }

    /**
     * Get This field is optional and indicates the address for receiving the moderation information callback in the default format of URL. After it is configured successfully, the non-compliant audio/video segments generated during moderation will be sent through this API. For the format of the returned callback content, see [Sample Callback Signature](https://intl.cloud.tencent.com/document/product/1219/53257?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E5.9B.9E.E8.B0.83.E7.AD.BE.E5.90.8D.E7.A4.BA.E4.BE.8B) 
     * @return CallbackUrl This field is optional and indicates the address for receiving the moderation information callback in the default format of URL. After it is configured successfully, the non-compliant audio/video segments generated during moderation will be sent through this API. For the format of the returned callback content, see [Sample Callback Signature](https://intl.cloud.tencent.com/document/product/1219/53257?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E5.9B.9E.E8.B0.83.E7.AD.BE.E5.90.8D.E7.A4.BA.E4.BE.8B)
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set This field is optional and indicates the address for receiving the moderation information callback in the default format of URL. After it is configured successfully, the non-compliant audio/video segments generated during moderation will be sent through this API. For the format of the returned callback content, see [Sample Callback Signature](https://intl.cloud.tencent.com/document/product/1219/53257?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E5.9B.9E.E8.B0.83.E7.AD.BE.E5.90.8D.E7.A4.BA.E4.BE.8B)
     * @param CallbackUrl This field is optional and indicates the address for receiving the moderation information callback in the default format of URL. After it is configured successfully, the non-compliant audio/video segments generated during moderation will be sent through this API. For the format of the returned callback content, see [Sample Callback Signature](https://intl.cloud.tencent.com/document/product/1219/53257?from_cn_redirect=1#.E7.A4.BA.E4.BE.8B2-.E5.9B.9E.E8.B0.83.E7.AD.BE.E5.90.8D.E7.A4.BA.E4.BE.8B)
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public CreateAudioModerationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAudioModerationTaskRequest(CreateAudioModerationTaskRequest source) {
        if (source.Tasks != null) {
            this.Tasks = new TaskInput[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskInput(source.Tasks[i]);
            }
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Seed != null) {
            this.Seed = new String(source.Seed);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);

    }
}

