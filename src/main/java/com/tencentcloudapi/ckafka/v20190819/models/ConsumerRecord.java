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
    * Topic name.
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Partition ID.
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Message key.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Message value.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Message timestamp.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
     * Get Topic name. 
     * @return Topic Topic name.
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name.
     * @param Topic Topic name.
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Partition ID. 
     * @return Partition Partition ID.
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition ID.
     * @param Partition Partition ID.
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Message key.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return Key Message key.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Message key.
Note: this field may return `null`, indicating that no valid value was found.
     * @param Key Message key.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Message value.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return Value Message value.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Message value.
Note: this field may return `null`, indicating that no valid value was found.
     * @param Value Message value.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Message timestamp.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return Timestamp Message timestamp.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Message timestamp.
Note: this field may return `null`, indicating that no valid value was found.
     * @param Timestamp Message timestamp.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
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

    }
}

