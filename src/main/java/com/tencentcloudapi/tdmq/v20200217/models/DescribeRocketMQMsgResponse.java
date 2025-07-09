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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQMsgResponse extends AbstractModel {

    /**
    * Message body
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * Details parameter
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * Production time
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * Message ID
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * Producer address
    */
    @SerializedName("ProducerAddr")
    @Expose
    private String ProducerAddr;

    /**
    * Consumption details of a consumer group
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageTracks")
    @Expose
    private RocketMQMessageTrack [] MessageTracks;

    /**
    * Topic name displayed on the details page
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShowTopicName")
    @Expose
    private String ShowTopicName;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Message body 
     * @return Body Message body
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set Message body
     * @param Body Message body
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get Details parameter 
     * @return Properties Details parameter
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set Details parameter
     * @param Properties Details parameter
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get Production time 
     * @return ProduceTime Production time
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set Production time
     * @param ProduceTime Production time
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get Message ID 
     * @return MsgId Message ID
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set Message ID
     * @param MsgId Message ID
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get Producer address 
     * @return ProducerAddr Producer address
     */
    public String getProducerAddr() {
        return this.ProducerAddr;
    }

    /**
     * Set Producer address
     * @param ProducerAddr Producer address
     */
    public void setProducerAddr(String ProducerAddr) {
        this.ProducerAddr = ProducerAddr;
    }

    /**
     * Get Consumption details of a consumer group
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return MessageTracks Consumption details of a consumer group
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public RocketMQMessageTrack [] getMessageTracks() {
        return this.MessageTracks;
    }

    /**
     * Set Consumption details of a consumer group
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param MessageTracks Consumption details of a consumer group
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setMessageTracks(RocketMQMessageTrack [] MessageTracks) {
        this.MessageTracks = MessageTracks;
    }

    /**
     * Get Topic name displayed on the details page
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return ShowTopicName Topic name displayed on the details page
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getShowTopicName() {
        return this.ShowTopicName;
    }

    /**
     * Set Topic name displayed on the details page
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param ShowTopicName Topic name displayed on the details page
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setShowTopicName(String ShowTopicName) {
        this.ShowTopicName = ShowTopicName;
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

    public DescribeRocketMQMsgResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQMsgResponse(DescribeRocketMQMsgResponse source) {
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.ProducerAddr != null) {
            this.ProducerAddr = new String(source.ProducerAddr);
        }
        if (source.MessageTracks != null) {
            this.MessageTracks = new RocketMQMessageTrack[source.MessageTracks.length];
            for (int i = 0; i < source.MessageTracks.length; i++) {
                this.MessageTracks[i] = new RocketMQMessageTrack(source.MessageTracks[i]);
            }
        }
        if (source.ShowTopicName != null) {
            this.ShowTopicName = new String(source.ShowTopicName);
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
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ProducerAddr", this.ProducerAddr);
        this.setParamArrayObj(map, prefix + "MessageTracks.", this.MessageTracks);
        this.setParamSimple(map, prefix + "ShowTopicName", this.ShowTopicName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

