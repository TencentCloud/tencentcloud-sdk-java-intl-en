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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmAssociation extends AbstractModel {

    /**
    * <p>Instance ID of the associated product</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
    * <p>Association status: 1 (enabled), 2 (not enabled), 3 (invalid)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>CKafka message topic</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>Ckafka consumption topic</p><p>Used for Kafka metric delivery</p>
    */
    @SerializedName("MetricTopic")
    @Expose
    private String MetricTopic;

    /**
     * Get <p>Instance ID of the associated product</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PeerId <p>Instance ID of the associated product</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set <p>Instance ID of the associated product</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PeerId <p>Instance ID of the associated product</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    /**
     * Get <p>Association status: 1 (enabled), 2 (not enabled), 3 (invalid)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status <p>Association status: 1 (enabled), 2 (not enabled), 3 (invalid)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Association status: 1 (enabled), 2 (not enabled), 3 (invalid)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status <p>Association status: 1 (enabled), 2 (not enabled), 3 (invalid)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>CKafka message topic</p> 
     * @return Topic <p>CKafka message topic</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>CKafka message topic</p>
     * @param Topic <p>CKafka message topic</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>Ckafka consumption topic</p><p>Used for Kafka metric delivery</p> 
     * @return MetricTopic <p>Ckafka consumption topic</p><p>Used for Kafka metric delivery</p>
     */
    public String getMetricTopic() {
        return this.MetricTopic;
    }

    /**
     * Set <p>Ckafka consumption topic</p><p>Used for Kafka metric delivery</p>
     * @param MetricTopic <p>Ckafka consumption topic</p><p>Used for Kafka metric delivery</p>
     */
    public void setMetricTopic(String MetricTopic) {
        this.MetricTopic = MetricTopic;
    }

    public ApmAssociation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmAssociation(ApmAssociation source) {
        if (source.PeerId != null) {
            this.PeerId = new String(source.PeerId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.MetricTopic != null) {
            this.MetricTopic = new String(source.MetricTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeerId", this.PeerId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "MetricTopic", this.MetricTopic);

    }
}

