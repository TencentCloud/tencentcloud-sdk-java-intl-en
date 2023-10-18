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

public class MessageList extends AbstractModel {

    /**
    * The message timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * The sender.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FromAccount")
    @Expose
    private String FromAccount;

    /**
    * The message sequence, which is unique across a class. The earlier a message is sent, the lower the sequence.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Seq")
    @Expose
    private Long Seq;

    /**
    * The message content.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageBody")
    @Expose
    private MessageItem [] MessageBody;

    /**
     * Get The message timestamp.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Timestamp The message timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set The message timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Timestamp The message timestamp.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get The sender.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FromAccount The sender.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFromAccount() {
        return this.FromAccount;
    }

    /**
     * Set The sender.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FromAccount The sender.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFromAccount(String FromAccount) {
        this.FromAccount = FromAccount;
    }

    /**
     * Get The message sequence, which is unique across a class. The earlier a message is sent, the lower the sequence.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Seq The message sequence, which is unique across a class. The earlier a message is sent, the lower the sequence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSeq() {
        return this.Seq;
    }

    /**
     * Set The message sequence, which is unique across a class. The earlier a message is sent, the lower the sequence.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Seq The message sequence, which is unique across a class. The earlier a message is sent, the lower the sequence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSeq(Long Seq) {
        this.Seq = Seq;
    }

    /**
     * Get The message content.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MessageBody The message content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MessageItem [] getMessageBody() {
        return this.MessageBody;
    }

    /**
     * Set The message content.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MessageBody The message content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessageBody(MessageItem [] MessageBody) {
        this.MessageBody = MessageBody;
    }

    public MessageList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageList(MessageList source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.FromAccount != null) {
            this.FromAccount = new String(source.FromAccount);
        }
        if (source.Seq != null) {
            this.Seq = new Long(source.Seq);
        }
        if (source.MessageBody != null) {
            this.MessageBody = new MessageItem[source.MessageBody.length];
            for (int i = 0; i < source.MessageBody.length; i++) {
                this.MessageBody[i] = new MessageItem(source.MessageBody[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "FromAccount", this.FromAccount);
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamArrayObj(map, prefix + "MessageBody.", this.MessageBody);

    }
}

