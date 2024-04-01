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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageItem extends AbstractModel {

    /**
    * The message type. `0`: Text; `1`: Image.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageType")
    @Expose
    private Long MessageType;

    /**
    * The text. This parameter is valid if `MessageType` is `0`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TextMessage")
    @Expose
    private String TextMessage;

    /**
    * The image URL. This parameter is valid if `MessageType` is `1`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageMessage")
    @Expose
    private String ImageMessage;

    /**
    * Customize the message content. Vaild when message type=2.
    */
    @SerializedName("CustomMessage")
    @Expose
    private CustomMsgContent CustomMessage;

    /**
     * Get The message type. `0`: Text; `1`: Image.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MessageType The message type. `0`: Text; `1`: Image.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMessageType() {
        return this.MessageType;
    }

    /**
     * Set The message type. `0`: Text; `1`: Image.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MessageType The message type. `0`: Text; `1`: Image.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessageType(Long MessageType) {
        this.MessageType = MessageType;
    }

    /**
     * Get The text. This parameter is valid if `MessageType` is `0`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TextMessage The text. This parameter is valid if `MessageType` is `0`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTextMessage() {
        return this.TextMessage;
    }

    /**
     * Set The text. This parameter is valid if `MessageType` is `0`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TextMessage The text. This parameter is valid if `MessageType` is `0`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTextMessage(String TextMessage) {
        this.TextMessage = TextMessage;
    }

    /**
     * Get The image URL. This parameter is valid if `MessageType` is `1`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageMessage The image URL. This parameter is valid if `MessageType` is `1`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageMessage() {
        return this.ImageMessage;
    }

    /**
     * Set The image URL. This parameter is valid if `MessageType` is `1`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageMessage The image URL. This parameter is valid if `MessageType` is `1`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageMessage(String ImageMessage) {
        this.ImageMessage = ImageMessage;
    }

    /**
     * Get Customize the message content. Vaild when message type=2. 
     * @return CustomMessage Customize the message content. Vaild when message type=2.
     */
    public CustomMsgContent getCustomMessage() {
        return this.CustomMessage;
    }

    /**
     * Set Customize the message content. Vaild when message type=2.
     * @param CustomMessage Customize the message content. Vaild when message type=2.
     */
    public void setCustomMessage(CustomMsgContent CustomMessage) {
        this.CustomMessage = CustomMessage;
    }

    public MessageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageItem(MessageItem source) {
        if (source.MessageType != null) {
            this.MessageType = new Long(source.MessageType);
        }
        if (source.TextMessage != null) {
            this.TextMessage = new String(source.TextMessage);
        }
        if (source.ImageMessage != null) {
            this.ImageMessage = new String(source.ImageMessage);
        }
        if (source.CustomMessage != null) {
            this.CustomMessage = new CustomMsgContent(source.CustomMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);
        this.setParamSimple(map, prefix + "TextMessage", this.TextMessage);
        this.setParamSimple(map, prefix + "ImageMessage", this.ImageMessage);
        this.setParamObj(map, prefix + "CustomMessage.", this.CustomMessage);

    }
}

