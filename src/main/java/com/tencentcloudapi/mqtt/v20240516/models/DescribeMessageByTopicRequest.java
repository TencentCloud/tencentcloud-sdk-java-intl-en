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

public class DescribeMessageByTopicRequest extends AbstractModel {

    /**
    * tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * home/room
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Start time. millisecond-level timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Specifies the number of query messages. value range: 1-1024. default: 100.
    */
    @SerializedName("MaxNumber")
    @Expose
    private Long MaxNumber;

    /**
     * Get tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console. 
     * @return InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.
     * @param InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get home/room 
     * @return Topic home/room
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set home/room
     * @param Topic home/room
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Start time. millisecond-level timestamp. 
     * @return StartTime Start time. millisecond-level timestamp.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. millisecond-level timestamp.
     * @param StartTime Start time. millisecond-level timestamp.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Specifies the number of query messages. value range: 1-1024. default: 100. 
     * @return MaxNumber Specifies the number of query messages. value range: 1-1024. default: 100.
     */
    public Long getMaxNumber() {
        return this.MaxNumber;
    }

    /**
     * Set Specifies the number of query messages. value range: 1-1024. default: 100.
     * @param MaxNumber Specifies the number of query messages. value range: 1-1024. default: 100.
     */
    public void setMaxNumber(Long MaxNumber) {
        this.MaxNumber = MaxNumber;
    }

    public DescribeMessageByTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageByTopicRequest(DescribeMessageByTopicRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.MaxNumber != null) {
            this.MaxNumber = new Long(source.MaxNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "MaxNumber", this.MaxNumber);

    }
}

