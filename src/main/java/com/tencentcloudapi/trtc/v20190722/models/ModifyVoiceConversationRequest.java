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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVoiceConversationRequest extends AbstractModel {

    /**
    * <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid">SdkAppId</a> of TRTC, which is the same as the SdkAppId corresponding to the conversation room.</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Unique ID of the conversation task. Returned when the conversation task starts successfully.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * For the same task, `SequenceNumber` must increase with each modification request. This prevents requests from being applied out of order.
    */
    @SerializedName("SequenceNumber")
    @Expose
    private Long SequenceNumber;

    /**
    * Large language model (LLM) configuration. Applies only in `Cascade` mode. In `S2S` mode, the request returns an error.
    */
    @SerializedName("LLMConfig")
    @Expose
    private VoiceConversationLLMConfig LLMConfig;

    /**
    * End-to-end speech-to-speech model configuration. Applies only in `S2S` mode. In `Cascade` mode, the request returns an error.
    */
    @SerializedName("S2SConfig")
    @Expose
    private VoiceConversationS2SConfig S2SConfig;

    /**
    * Conversation control configuration. Applies only in `Cascade` mode.
    */
    @SerializedName("DialogConfig")
    @Expose
    private VoiceConversationDialogConfig DialogConfig;

    /**
     * Get <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid">SdkAppId</a> of TRTC, which is the same as the SdkAppId corresponding to the conversation room.</p> 
     * @return SdkAppId <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid">SdkAppId</a> of TRTC, which is the same as the SdkAppId corresponding to the conversation room.</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid">SdkAppId</a> of TRTC, which is the same as the SdkAppId corresponding to the conversation room.</p>
     * @param SdkAppId <p>The <a href="https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid">SdkAppId</a> of TRTC, which is the same as the SdkAppId corresponding to the conversation room.</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Unique ID of the conversation task. Returned when the conversation task starts successfully. 
     * @return TaskId Unique ID of the conversation task. Returned when the conversation task starts successfully.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Unique ID of the conversation task. Returned when the conversation task starts successfully.
     * @param TaskId Unique ID of the conversation task. Returned when the conversation task starts successfully.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get For the same task, `SequenceNumber` must increase with each modification request. This prevents requests from being applied out of order. 
     * @return SequenceNumber For the same task, `SequenceNumber` must increase with each modification request. This prevents requests from being applied out of order.
     */
    public Long getSequenceNumber() {
        return this.SequenceNumber;
    }

    /**
     * Set For the same task, `SequenceNumber` must increase with each modification request. This prevents requests from being applied out of order.
     * @param SequenceNumber For the same task, `SequenceNumber` must increase with each modification request. This prevents requests from being applied out of order.
     */
    public void setSequenceNumber(Long SequenceNumber) {
        this.SequenceNumber = SequenceNumber;
    }

    /**
     * Get Large language model (LLM) configuration. Applies only in `Cascade` mode. In `S2S` mode, the request returns an error. 
     * @return LLMConfig Large language model (LLM) configuration. Applies only in `Cascade` mode. In `S2S` mode, the request returns an error.
     */
    public VoiceConversationLLMConfig getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set Large language model (LLM) configuration. Applies only in `Cascade` mode. In `S2S` mode, the request returns an error.
     * @param LLMConfig Large language model (LLM) configuration. Applies only in `Cascade` mode. In `S2S` mode, the request returns an error.
     */
    public void setLLMConfig(VoiceConversationLLMConfig LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get End-to-end speech-to-speech model configuration. Applies only in `S2S` mode. In `Cascade` mode, the request returns an error. 
     * @return S2SConfig End-to-end speech-to-speech model configuration. Applies only in `S2S` mode. In `Cascade` mode, the request returns an error.
     */
    public VoiceConversationS2SConfig getS2SConfig() {
        return this.S2SConfig;
    }

    /**
     * Set End-to-end speech-to-speech model configuration. Applies only in `S2S` mode. In `Cascade` mode, the request returns an error.
     * @param S2SConfig End-to-end speech-to-speech model configuration. Applies only in `S2S` mode. In `Cascade` mode, the request returns an error.
     */
    public void setS2SConfig(VoiceConversationS2SConfig S2SConfig) {
        this.S2SConfig = S2SConfig;
    }

    /**
     * Get Conversation control configuration. Applies only in `Cascade` mode. 
     * @return DialogConfig Conversation control configuration. Applies only in `Cascade` mode.
     */
    public VoiceConversationDialogConfig getDialogConfig() {
        return this.DialogConfig;
    }

    /**
     * Set Conversation control configuration. Applies only in `Cascade` mode.
     * @param DialogConfig Conversation control configuration. Applies only in `Cascade` mode.
     */
    public void setDialogConfig(VoiceConversationDialogConfig DialogConfig) {
        this.DialogConfig = DialogConfig;
    }

    public ModifyVoiceConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVoiceConversationRequest(ModifyVoiceConversationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SequenceNumber != null) {
            this.SequenceNumber = new Long(source.SequenceNumber);
        }
        if (source.LLMConfig != null) {
            this.LLMConfig = new VoiceConversationLLMConfig(source.LLMConfig);
        }
        if (source.S2SConfig != null) {
            this.S2SConfig = new VoiceConversationS2SConfig(source.S2SConfig);
        }
        if (source.DialogConfig != null) {
            this.DialogConfig = new VoiceConversationDialogConfig(source.DialogConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SequenceNumber", this.SequenceNumber);
        this.setParamObj(map, prefix + "LLMConfig.", this.LLMConfig);
        this.setParamObj(map, prefix + "S2SConfig.", this.S2SConfig);
        this.setParamObj(map, prefix + "DialogConfig.", this.DialogConfig);

    }
}

