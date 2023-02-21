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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerRecord extends AbstractModel{

    /**
    * Topic name
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Partition ID
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Message key
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Message value
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Message timestamp
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Message headers
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Headers")
    @Expose
    private String Headers;

    /**
     * Get Topic name 
     * @return Topic Topic name
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name
     * @param Topic Topic name
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Partition ID 
     * @return Partition Partition ID
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition ID
     * @param Partition Partition ID
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Message key
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Key Message key
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Message key
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Key Message key
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Message value
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Value Message value
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Message value
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Value Message value
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Message timestamp
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Timestamp Message timestamp
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Message timestamp
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Timestamp Message timestamp
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Message headers
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Headers Message headers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHeaders() {
        return this.Headers;
    }

    /**
     * Set Message headers
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Headers Message headers
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeaders(String Headers) {
        this.Headers = Headers;
    }

    public ConsumerRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerRecord(ConsumerRecord source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Headers != null) {
            this.Headers = new String(source.Headers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Headers", this.Headers);

    }
}

