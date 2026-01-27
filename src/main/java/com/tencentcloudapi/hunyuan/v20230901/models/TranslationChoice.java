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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranslationChoice extends AbstractModel {

    /**
    * End flag, can be stop or sensitive.
stop means output ends normally.
sensitive only appears when streaming output review is enabled, indicating security review not passed.
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * Index value, used when streaming.
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * Incremental return value used when streaming this field.
    */
    @SerializedName("Delta")
    @Expose
    private TranslationDelta Delta;

    /**
    * Return value, used when non-streaming.
    */
    @SerializedName("Message")
    @Expose
    private TranslationMessage Message;

    /**
     * Get End flag, can be stop or sensitive.
stop means output ends normally.
sensitive only appears when streaming output review is enabled, indicating security review not passed. 
     * @return FinishReason End flag, can be stop or sensitive.
stop means output ends normally.
sensitive only appears when streaming output review is enabled, indicating security review not passed.
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set End flag, can be stop or sensitive.
stop means output ends normally.
sensitive only appears when streaming output review is enabled, indicating security review not passed.
     * @param FinishReason End flag, can be stop or sensitive.
stop means output ends normally.
sensitive only appears when streaming output review is enabled, indicating security review not passed.
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get Index value, used when streaming. 
     * @return Index Index value, used when streaming.
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Index value, used when streaming.
     * @param Index Index value, used when streaming.
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get Incremental return value used when streaming this field. 
     * @return Delta Incremental return value used when streaming this field.
     */
    public TranslationDelta getDelta() {
        return this.Delta;
    }

    /**
     * Set Incremental return value used when streaming this field.
     * @param Delta Incremental return value used when streaming this field.
     */
    public void setDelta(TranslationDelta Delta) {
        this.Delta = Delta;
    }

    /**
     * Get Return value, used when non-streaming. 
     * @return Message Return value, used when non-streaming.
     */
    public TranslationMessage getMessage() {
        return this.Message;
    }

    /**
     * Set Return value, used when non-streaming.
     * @param Message Return value, used when non-streaming.
     */
    public void setMessage(TranslationMessage Message) {
        this.Message = Message;
    }

    public TranslationChoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslationChoice(TranslationChoice source) {
        if (source.FinishReason != null) {
            this.FinishReason = new String(source.FinishReason);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Delta != null) {
            this.Delta = new TranslationDelta(source.Delta);
        }
        if (source.Message != null) {
            this.Message = new TranslationMessage(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinishReason", this.FinishReason);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamObj(map, prefix + "Delta.", this.Delta);
        this.setParamObj(map, prefix + "Message.", this.Message);

    }
}

