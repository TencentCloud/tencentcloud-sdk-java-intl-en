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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiveMessageResponse extends AbstractModel{

    /**
    * Unique primary key used to identify the message
    */
    @SerializedName("MessageID")
    @Expose
    private String MessageID;

    /**
    * Content of the received message
    */
    @SerializedName("MessagePayload")
    @Expose
    private String MessagePayload;

    /**
    * Provided to the `Ack` API and used to acknowledge messages in the topic
    */
    @SerializedName("AckTopic")
    @Expose
    private String AckTopic;

    /**
    * Returned error message. If it is an empty string, no error occurred.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * Returned subscriber name, which will be used when an acknowledgment consumer is created.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubName")
    @Expose
    private String SubName;

    /**
    * MessageIDs returned by `BatchReceivePolicy` at a time, which are separated by “###”.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageIDList")
    @Expose
    private String MessageIDList;

    /**
    * Message contents returned by `BatchReceivePolicy` at a time, which are separated by “###”.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MessagesPayload")
    @Expose
    private String MessagesPayload;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Unique primary key used to identify the message 
     * @return MessageID Unique primary key used to identify the message
     */
    public String getMessageID() {
        return this.MessageID;
    }

    /**
     * Set Unique primary key used to identify the message
     * @param MessageID Unique primary key used to identify the message
     */
    public void setMessageID(String MessageID) {
        this.MessageID = MessageID;
    }

    /**
     * Get Content of the received message 
     * @return MessagePayload Content of the received message
     */
    public String getMessagePayload() {
        return this.MessagePayload;
    }

    /**
     * Set Content of the received message
     * @param MessagePayload Content of the received message
     */
    public void setMessagePayload(String MessagePayload) {
        this.MessagePayload = MessagePayload;
    }

    /**
     * Get Provided to the `Ack` API and used to acknowledge messages in the topic 
     * @return AckTopic Provided to the `Ack` API and used to acknowledge messages in the topic
     */
    public String getAckTopic() {
        return this.AckTopic;
    }

    /**
     * Set Provided to the `Ack` API and used to acknowledge messages in the topic
     * @param AckTopic Provided to the `Ack` API and used to acknowledge messages in the topic
     */
    public void setAckTopic(String AckTopic) {
        this.AckTopic = AckTopic;
    }

    /**
     * Get Returned error message. If it is an empty string, no error occurred.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ErrorMsg Returned error message. If it is an empty string, no error occurred.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set Returned error message. If it is an empty string, no error occurred.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ErrorMsg Returned error message. If it is an empty string, no error occurred.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get Returned subscriber name, which will be used when an acknowledgment consumer is created.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubName Returned subscriber name, which will be used when an acknowledgment consumer is created.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubName() {
        return this.SubName;
    }

    /**
     * Set Returned subscriber name, which will be used when an acknowledgment consumer is created.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubName Returned subscriber name, which will be used when an acknowledgment consumer is created.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubName(String SubName) {
        this.SubName = SubName;
    }

    /**
     * Get MessageIDs returned by `BatchReceivePolicy` at a time, which are separated by “###”.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MessageIDList MessageIDs returned by `BatchReceivePolicy` at a time, which are separated by “###”.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessageIDList() {
        return this.MessageIDList;
    }

    /**
     * Set MessageIDs returned by `BatchReceivePolicy` at a time, which are separated by “###”.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MessageIDList MessageIDs returned by `BatchReceivePolicy` at a time, which are separated by “###”.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessageIDList(String MessageIDList) {
        this.MessageIDList = MessageIDList;
    }

    /**
     * Get Message contents returned by `BatchReceivePolicy` at a time, which are separated by “###”.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MessagesPayload Message contents returned by `BatchReceivePolicy` at a time, which are separated by “###”.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessagesPayload() {
        return this.MessagesPayload;
    }

    /**
     * Set Message contents returned by `BatchReceivePolicy` at a time, which are separated by “###”.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MessagesPayload Message contents returned by `BatchReceivePolicy` at a time, which are separated by “###”.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessagesPayload(String MessagesPayload) {
        this.MessagesPayload = MessagesPayload;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ReceiveMessageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiveMessageResponse(ReceiveMessageResponse source) {
        if (source.MessageID != null) {
            this.MessageID = new String(source.MessageID);
        }
        if (source.MessagePayload != null) {
            this.MessagePayload = new String(source.MessagePayload);
        }
        if (source.AckTopic != null) {
            this.AckTopic = new String(source.AckTopic);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.SubName != null) {
            this.SubName = new String(source.SubName);
        }
        if (source.MessageIDList != null) {
            this.MessageIDList = new String(source.MessageIDList);
        }
        if (source.MessagesPayload != null) {
            this.MessagesPayload = new String(source.MessagesPayload);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageID", this.MessageID);
        this.setParamSimple(map, prefix + "MessagePayload", this.MessagePayload);
        this.setParamSimple(map, prefix + "AckTopic", this.AckTopic);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "SubName", this.SubName);
        this.setParamSimple(map, prefix + "MessageIDList", this.MessageIDList);
        this.setParamSimple(map, prefix + "MessagesPayload", this.MessagesPayload);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

