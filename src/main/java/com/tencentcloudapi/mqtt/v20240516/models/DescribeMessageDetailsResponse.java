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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMessageDetailsResponse extends AbstractModel {

    /**
    * Message body.
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * Describes the user-customized attribute.
    */
    @SerializedName("UserProperties")
    @Expose
    private UserProperty [] UserProperties;

    /**
    * Specifies the message storage time. millisecond-level timestamp.
    */
    @SerializedName("StoreTimestamp")
    @Expose
    private Long StoreTimestamp;

    /**
    * Message ID.
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * Producer address.
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Topic
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * Specifies the source topic.
    */
    @SerializedName("OriginTopic")
    @Expose
    private String OriginTopic;

    /**
    * Content type (MQTT5).
Indicates the content type of the message payload using standard MIME type format. helps the receiver correctly parse and process the message content.
Specifies the example.
application/json: indicates the payload is data in json format.
Text/Plain: indicates the payload is plain text.
application/octet-stream: indicates the payload is binary data.
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * Payload format indicator (MQTT5).
Indicates the payload format, which is a boolean value. 0 means an unspecified format (binary), and 1 means a UTF-8 encoded string.
Specifies the example.
Valid values: 0 indicates the payload is binary data, such as images or audio.
Valid value 1: when the payload is UTF-8 encoded text, such as JSON string or XML.
    */
    @SerializedName("PayloadFormatIndicator")
    @Expose
    private Long PayloadFormatIndicator;

    /**
    * Message expiration interval (MQTT5).
Specifies the validity time (in seconds) of the specified message before it is discarded. if the message fails to reach the MQTT server before expiration, it will be discarded.
Specifies the example.
The value 60 indicates that the message is valid within 60 seconds after release. unreached messages will be dropped after expiry.
A value of 0 indicates the message never expires and remains permanently valid until received or the session ends.
    */
    @SerializedName("MessageExpiryInterval")
    @Expose
    private Long MessageExpiryInterval;

    /**
    * Response topic (MQTT5).
Specifies a topic for the response message in request-response mode. the sender can specify which topic the recipient should send the response to.
Specifies the example.
Sender publishes a request to the topic devices/device1/commands and sets ResponseTopic to devices/device1/responses.
Specifies the topic where the response is published after the recipient processes the request.
    */
    @SerializedName("ResponseTopic")
    @Expose
    private String ResponseTopic;

    /**
    * Associated data (MQTT5).
Specifies the identifier used to associate a request and response, usually a byte array. in request-response mode, the sender sets this value, and the recipient includes the same value in the response so that the sender can identify the corresponding request.
Specifies the example.
The sender generates a unique ID (such as a byte[] of UUID) as CorrelationData and adds it to the request message.
The recipient includes the same CorrelationData in the response message. the sender compares this value to match the response and the request.
    */
    @SerializedName("CorrelationData")
    @Expose
    private String CorrelationData;

    /**
    * Subscription identifier (MQTT5).
Specifies the unique identifier assigned to the subscription, used to identify a specific subscription of the client. when sending a message to the client, the server can include this identifier to help with client identification of the corresponding subscription.
Specifies the example.
The client subscribes to the topic devices/+/temperature and sets SubscriptionIdentifier to 123.
When the server sends a message of this topic to the client, the message will contain SubscriptionIdentifier: 123. the client can know which subscription the message is sent through based on this value.
    */
    @SerializedName("SubscriptionIdentifier")
    @Expose
    private String SubscriptionIdentifier;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Message body. 
     * @return Body Message body.
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set Message body.
     * @param Body Message body.
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get Describes the user-customized attribute. 
     * @return UserProperties Describes the user-customized attribute.
     */
    public UserProperty [] getUserProperties() {
        return this.UserProperties;
    }

    /**
     * Set Describes the user-customized attribute.
     * @param UserProperties Describes the user-customized attribute.
     */
    public void setUserProperties(UserProperty [] UserProperties) {
        this.UserProperties = UserProperties;
    }

    /**
     * Get Specifies the message storage time. millisecond-level timestamp. 
     * @return StoreTimestamp Specifies the message storage time. millisecond-level timestamp.
     */
    public Long getStoreTimestamp() {
        return this.StoreTimestamp;
    }

    /**
     * Set Specifies the message storage time. millisecond-level timestamp.
     * @param StoreTimestamp Specifies the message storage time. millisecond-level timestamp.
     */
    public void setStoreTimestamp(Long StoreTimestamp) {
        this.StoreTimestamp = StoreTimestamp;
    }

    /**
     * Get Message ID. 
     * @return MessageId Message ID.
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set Message ID.
     * @param MessageId Message ID.
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get Producer address. 
     * @return ClientId Producer address.
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Producer address.
     * @param ClientId Producer address.
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Topic 
     * @return Qos Topic
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set Topic
     * @param Qos Topic
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get Specifies the source topic. 
     * @return OriginTopic Specifies the source topic.
     */
    public String getOriginTopic() {
        return this.OriginTopic;
    }

    /**
     * Set Specifies the source topic.
     * @param OriginTopic Specifies the source topic.
     */
    public void setOriginTopic(String OriginTopic) {
        this.OriginTopic = OriginTopic;
    }

    /**
     * Get Content type (MQTT5).
Indicates the content type of the message payload using standard MIME type format. helps the receiver correctly parse and process the message content.
Specifies the example.
application/json: indicates the payload is data in json format.
Text/Plain: indicates the payload is plain text.
application/octet-stream: indicates the payload is binary data. 
     * @return ContentType Content type (MQTT5).
Indicates the content type of the message payload using standard MIME type format. helps the receiver correctly parse and process the message content.
Specifies the example.
application/json: indicates the payload is data in json format.
Text/Plain: indicates the payload is plain text.
application/octet-stream: indicates the payload is binary data.
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set Content type (MQTT5).
Indicates the content type of the message payload using standard MIME type format. helps the receiver correctly parse and process the message content.
Specifies the example.
application/json: indicates the payload is data in json format.
Text/Plain: indicates the payload is plain text.
application/octet-stream: indicates the payload is binary data.
     * @param ContentType Content type (MQTT5).
Indicates the content type of the message payload using standard MIME type format. helps the receiver correctly parse and process the message content.
Specifies the example.
application/json: indicates the payload is data in json format.
Text/Plain: indicates the payload is plain text.
application/octet-stream: indicates the payload is binary data.
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get Payload format indicator (MQTT5).
Indicates the payload format, which is a boolean value. 0 means an unspecified format (binary), and 1 means a UTF-8 encoded string.
Specifies the example.
Valid values: 0 indicates the payload is binary data, such as images or audio.
Valid value 1: when the payload is UTF-8 encoded text, such as JSON string or XML. 
     * @return PayloadFormatIndicator Payload format indicator (MQTT5).
Indicates the payload format, which is a boolean value. 0 means an unspecified format (binary), and 1 means a UTF-8 encoded string.
Specifies the example.
Valid values: 0 indicates the payload is binary data, such as images or audio.
Valid value 1: when the payload is UTF-8 encoded text, such as JSON string or XML.
     */
    public Long getPayloadFormatIndicator() {
        return this.PayloadFormatIndicator;
    }

    /**
     * Set Payload format indicator (MQTT5).
Indicates the payload format, which is a boolean value. 0 means an unspecified format (binary), and 1 means a UTF-8 encoded string.
Specifies the example.
Valid values: 0 indicates the payload is binary data, such as images or audio.
Valid value 1: when the payload is UTF-8 encoded text, such as JSON string or XML.
     * @param PayloadFormatIndicator Payload format indicator (MQTT5).
Indicates the payload format, which is a boolean value. 0 means an unspecified format (binary), and 1 means a UTF-8 encoded string.
Specifies the example.
Valid values: 0 indicates the payload is binary data, such as images or audio.
Valid value 1: when the payload is UTF-8 encoded text, such as JSON string or XML.
     */
    public void setPayloadFormatIndicator(Long PayloadFormatIndicator) {
        this.PayloadFormatIndicator = PayloadFormatIndicator;
    }

    /**
     * Get Message expiration interval (MQTT5).
Specifies the validity time (in seconds) of the specified message before it is discarded. if the message fails to reach the MQTT server before expiration, it will be discarded.
Specifies the example.
The value 60 indicates that the message is valid within 60 seconds after release. unreached messages will be dropped after expiry.
A value of 0 indicates the message never expires and remains permanently valid until received or the session ends. 
     * @return MessageExpiryInterval Message expiration interval (MQTT5).
Specifies the validity time (in seconds) of the specified message before it is discarded. if the message fails to reach the MQTT server before expiration, it will be discarded.
Specifies the example.
The value 60 indicates that the message is valid within 60 seconds after release. unreached messages will be dropped after expiry.
A value of 0 indicates the message never expires and remains permanently valid until received or the session ends.
     */
    public Long getMessageExpiryInterval() {
        return this.MessageExpiryInterval;
    }

    /**
     * Set Message expiration interval (MQTT5).
Specifies the validity time (in seconds) of the specified message before it is discarded. if the message fails to reach the MQTT server before expiration, it will be discarded.
Specifies the example.
The value 60 indicates that the message is valid within 60 seconds after release. unreached messages will be dropped after expiry.
A value of 0 indicates the message never expires and remains permanently valid until received or the session ends.
     * @param MessageExpiryInterval Message expiration interval (MQTT5).
Specifies the validity time (in seconds) of the specified message before it is discarded. if the message fails to reach the MQTT server before expiration, it will be discarded.
Specifies the example.
The value 60 indicates that the message is valid within 60 seconds after release. unreached messages will be dropped after expiry.
A value of 0 indicates the message never expires and remains permanently valid until received or the session ends.
     */
    public void setMessageExpiryInterval(Long MessageExpiryInterval) {
        this.MessageExpiryInterval = MessageExpiryInterval;
    }

    /**
     * Get Response topic (MQTT5).
Specifies a topic for the response message in request-response mode. the sender can specify which topic the recipient should send the response to.
Specifies the example.
Sender publishes a request to the topic devices/device1/commands and sets ResponseTopic to devices/device1/responses.
Specifies the topic where the response is published after the recipient processes the request. 
     * @return ResponseTopic Response topic (MQTT5).
Specifies a topic for the response message in request-response mode. the sender can specify which topic the recipient should send the response to.
Specifies the example.
Sender publishes a request to the topic devices/device1/commands and sets ResponseTopic to devices/device1/responses.
Specifies the topic where the response is published after the recipient processes the request.
     */
    public String getResponseTopic() {
        return this.ResponseTopic;
    }

    /**
     * Set Response topic (MQTT5).
Specifies a topic for the response message in request-response mode. the sender can specify which topic the recipient should send the response to.
Specifies the example.
Sender publishes a request to the topic devices/device1/commands and sets ResponseTopic to devices/device1/responses.
Specifies the topic where the response is published after the recipient processes the request.
     * @param ResponseTopic Response topic (MQTT5).
Specifies a topic for the response message in request-response mode. the sender can specify which topic the recipient should send the response to.
Specifies the example.
Sender publishes a request to the topic devices/device1/commands and sets ResponseTopic to devices/device1/responses.
Specifies the topic where the response is published after the recipient processes the request.
     */
    public void setResponseTopic(String ResponseTopic) {
        this.ResponseTopic = ResponseTopic;
    }

    /**
     * Get Associated data (MQTT5).
Specifies the identifier used to associate a request and response, usually a byte array. in request-response mode, the sender sets this value, and the recipient includes the same value in the response so that the sender can identify the corresponding request.
Specifies the example.
The sender generates a unique ID (such as a byte[] of UUID) as CorrelationData and adds it to the request message.
The recipient includes the same CorrelationData in the response message. the sender compares this value to match the response and the request. 
     * @return CorrelationData Associated data (MQTT5).
Specifies the identifier used to associate a request and response, usually a byte array. in request-response mode, the sender sets this value, and the recipient includes the same value in the response so that the sender can identify the corresponding request.
Specifies the example.
The sender generates a unique ID (such as a byte[] of UUID) as CorrelationData and adds it to the request message.
The recipient includes the same CorrelationData in the response message. the sender compares this value to match the response and the request.
     */
    public String getCorrelationData() {
        return this.CorrelationData;
    }

    /**
     * Set Associated data (MQTT5).
Specifies the identifier used to associate a request and response, usually a byte array. in request-response mode, the sender sets this value, and the recipient includes the same value in the response so that the sender can identify the corresponding request.
Specifies the example.
The sender generates a unique ID (such as a byte[] of UUID) as CorrelationData and adds it to the request message.
The recipient includes the same CorrelationData in the response message. the sender compares this value to match the response and the request.
     * @param CorrelationData Associated data (MQTT5).
Specifies the identifier used to associate a request and response, usually a byte array. in request-response mode, the sender sets this value, and the recipient includes the same value in the response so that the sender can identify the corresponding request.
Specifies the example.
The sender generates a unique ID (such as a byte[] of UUID) as CorrelationData and adds it to the request message.
The recipient includes the same CorrelationData in the response message. the sender compares this value to match the response and the request.
     */
    public void setCorrelationData(String CorrelationData) {
        this.CorrelationData = CorrelationData;
    }

    /**
     * Get Subscription identifier (MQTT5).
Specifies the unique identifier assigned to the subscription, used to identify a specific subscription of the client. when sending a message to the client, the server can include this identifier to help with client identification of the corresponding subscription.
Specifies the example.
The client subscribes to the topic devices/+/temperature and sets SubscriptionIdentifier to 123.
When the server sends a message of this topic to the client, the message will contain SubscriptionIdentifier: 123. the client can know which subscription the message is sent through based on this value. 
     * @return SubscriptionIdentifier Subscription identifier (MQTT5).
Specifies the unique identifier assigned to the subscription, used to identify a specific subscription of the client. when sending a message to the client, the server can include this identifier to help with client identification of the corresponding subscription.
Specifies the example.
The client subscribes to the topic devices/+/temperature and sets SubscriptionIdentifier to 123.
When the server sends a message of this topic to the client, the message will contain SubscriptionIdentifier: 123. the client can know which subscription the message is sent through based on this value.
     */
    public String getSubscriptionIdentifier() {
        return this.SubscriptionIdentifier;
    }

    /**
     * Set Subscription identifier (MQTT5).
Specifies the unique identifier assigned to the subscription, used to identify a specific subscription of the client. when sending a message to the client, the server can include this identifier to help with client identification of the corresponding subscription.
Specifies the example.
The client subscribes to the topic devices/+/temperature and sets SubscriptionIdentifier to 123.
When the server sends a message of this topic to the client, the message will contain SubscriptionIdentifier: 123. the client can know which subscription the message is sent through based on this value.
     * @param SubscriptionIdentifier Subscription identifier (MQTT5).
Specifies the unique identifier assigned to the subscription, used to identify a specific subscription of the client. when sending a message to the client, the server can include this identifier to help with client identification of the corresponding subscription.
Specifies the example.
The client subscribes to the topic devices/+/temperature and sets SubscriptionIdentifier to 123.
When the server sends a message of this topic to the client, the message will contain SubscriptionIdentifier: 123. the client can know which subscription the message is sent through based on this value.
     */
    public void setSubscriptionIdentifier(String SubscriptionIdentifier) {
        this.SubscriptionIdentifier = SubscriptionIdentifier;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMessageDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageDetailsResponse(DescribeMessageDetailsResponse source) {
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.UserProperties != null) {
            this.UserProperties = new UserProperty[source.UserProperties.length];
            for (int i = 0; i < source.UserProperties.length; i++) {
                this.UserProperties[i] = new UserProperty(source.UserProperties[i]);
            }
        }
        if (source.StoreTimestamp != null) {
            this.StoreTimestamp = new Long(source.StoreTimestamp);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Qos != null) {
            this.Qos = new String(source.Qos);
        }
        if (source.OriginTopic != null) {
            this.OriginTopic = new String(source.OriginTopic);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.PayloadFormatIndicator != null) {
            this.PayloadFormatIndicator = new Long(source.PayloadFormatIndicator);
        }
        if (source.MessageExpiryInterval != null) {
            this.MessageExpiryInterval = new Long(source.MessageExpiryInterval);
        }
        if (source.ResponseTopic != null) {
            this.ResponseTopic = new String(source.ResponseTopic);
        }
        if (source.CorrelationData != null) {
            this.CorrelationData = new String(source.CorrelationData);
        }
        if (source.SubscriptionIdentifier != null) {
            this.SubscriptionIdentifier = new String(source.SubscriptionIdentifier);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamArrayObj(map, prefix + "UserProperties.", this.UserProperties);
        this.setParamSimple(map, prefix + "StoreTimestamp", this.StoreTimestamp);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "OriginTopic", this.OriginTopic);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "PayloadFormatIndicator", this.PayloadFormatIndicator);
        this.setParamSimple(map, prefix + "MessageExpiryInterval", this.MessageExpiryInterval);
        this.setParamSimple(map, prefix + "ResponseTopic", this.ResponseTopic);
        this.setParamSimple(map, prefix + "CorrelationData", this.CorrelationData);
        this.setParamSimple(map, prefix + "SubscriptionIdentifier", this.SubscriptionIdentifier);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

