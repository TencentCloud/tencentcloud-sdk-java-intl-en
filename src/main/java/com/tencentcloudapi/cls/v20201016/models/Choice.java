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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Choice extends AbstractModel {

    /**
    * <p>End flag, which may be stop, sensitive, or tool_calls.<br>stop means the output ends normally.<br>sensitive means the security review is not passed.<br>tool_calls identifies a function call.</p><p>Note:<br>Partial content may have been output, but if the FinishReason value in the middle of the response is sensitive, it means the security review is not passed. If the business scenario requires real-time text display on the screen, manually withdraw the displayed content and recommend replacing it with a custom reminder, such as "I can't answer this issue. Let's try another topic," to ensure terminal experience.</p>
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * <p>Incremental return value. This field is used when streaming.</p>
    */
    @SerializedName("Delta")
    @Expose
    private Delta Delta;

    /**
    * <p>Return value, used when Non-streaming calls.</p>
    */
    @SerializedName("Message")
    @Expose
    private Message Message;

    /**
    * <p>Index value. This field is used when streaming.</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get <p>End flag, which may be stop, sensitive, or tool_calls.<br>stop means the output ends normally.<br>sensitive means the security review is not passed.<br>tool_calls identifies a function call.</p><p>Note:<br>Partial content may have been output, but if the FinishReason value in the middle of the response is sensitive, it means the security review is not passed. If the business scenario requires real-time text display on the screen, manually withdraw the displayed content and recommend replacing it with a custom reminder, such as "I can't answer this issue. Let's try another topic," to ensure terminal experience.</p> 
     * @return FinishReason <p>End flag, which may be stop, sensitive, or tool_calls.<br>stop means the output ends normally.<br>sensitive means the security review is not passed.<br>tool_calls identifies a function call.</p><p>Note:<br>Partial content may have been output, but if the FinishReason value in the middle of the response is sensitive, it means the security review is not passed. If the business scenario requires real-time text display on the screen, manually withdraw the displayed content and recommend replacing it with a custom reminder, such as "I can't answer this issue. Let's try another topic," to ensure terminal experience.</p>
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set <p>End flag, which may be stop, sensitive, or tool_calls.<br>stop means the output ends normally.<br>sensitive means the security review is not passed.<br>tool_calls identifies a function call.</p><p>Note:<br>Partial content may have been output, but if the FinishReason value in the middle of the response is sensitive, it means the security review is not passed. If the business scenario requires real-time text display on the screen, manually withdraw the displayed content and recommend replacing it with a custom reminder, such as "I can't answer this issue. Let's try another topic," to ensure terminal experience.</p>
     * @param FinishReason <p>End flag, which may be stop, sensitive, or tool_calls.<br>stop means the output ends normally.<br>sensitive means the security review is not passed.<br>tool_calls identifies a function call.</p><p>Note:<br>Partial content may have been output, but if the FinishReason value in the middle of the response is sensitive, it means the security review is not passed. If the business scenario requires real-time text display on the screen, manually withdraw the displayed content and recommend replacing it with a custom reminder, such as "I can't answer this issue. Let's try another topic," to ensure terminal experience.</p>
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get <p>Incremental return value. This field is used when streaming.</p> 
     * @return Delta <p>Incremental return value. This field is used when streaming.</p>
     */
    public Delta getDelta() {
        return this.Delta;
    }

    /**
     * Set <p>Incremental return value. This field is used when streaming.</p>
     * @param Delta <p>Incremental return value. This field is used when streaming.</p>
     */
    public void setDelta(Delta Delta) {
        this.Delta = Delta;
    }

    /**
     * Get <p>Return value, used when Non-streaming calls.</p> 
     * @return Message <p>Return value, used when Non-streaming calls.</p>
     */
    public Message getMessage() {
        return this.Message;
    }

    /**
     * Set <p>Return value, used when Non-streaming calls.</p>
     * @param Message <p>Return value, used when Non-streaming calls.</p>
     */
    public void setMessage(Message Message) {
        this.Message = Message;
    }

    /**
     * Get <p>Index value. This field is used when streaming.</p> 
     * @return Index <p>Index value. This field is used when streaming.</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>Index value. This field is used when streaming.</p>
     * @param Index <p>Index value. This field is used when streaming.</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public Choice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Choice(Choice source) {
        if (source.FinishReason != null) {
            this.FinishReason = new String(source.FinishReason);
        }
        if (source.Delta != null) {
            this.Delta = new Delta(source.Delta);
        }
        if (source.Message != null) {
            this.Message = new Message(source.Message);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinishReason", this.FinishReason);
        this.setParamObj(map, prefix + "Delta.", this.Delta);
        this.setParamObj(map, prefix + "Message.", this.Message);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

