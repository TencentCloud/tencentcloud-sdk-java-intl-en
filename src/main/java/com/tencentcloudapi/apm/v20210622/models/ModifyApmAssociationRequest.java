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

public class ModifyApmAssociationRequest extends AbstractModel {

    /**
    * <p>Associated product name, currently only support Prometheus, CKafka</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>Status of the association relationship: // Association relationship status: 1 (enabled), 2 (disabled)</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Business system ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>ID of the associated product instance</p>
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
    * <p>CKafka message topic</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>Ckafka message topic</p>
    */
    @SerializedName("MetricTopic")
    @Expose
    private String MetricTopic;

    /**
     * Get <p>Associated product name, currently only support Prometheus, CKafka</p> 
     * @return ProductName <p>Associated product name, currently only support Prometheus, CKafka</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>Associated product name, currently only support Prometheus, CKafka</p>
     * @param ProductName <p>Associated product name, currently only support Prometheus, CKafka</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>Status of the association relationship: // Association relationship status: 1 (enabled), 2 (disabled)</p> 
     * @return Status <p>Status of the association relationship: // Association relationship status: 1 (enabled), 2 (disabled)</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status of the association relationship: // Association relationship status: 1 (enabled), 2 (disabled)</p>
     * @param Status <p>Status of the association relationship: // Association relationship status: 1 (enabled), 2 (disabled)</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Business system ID</p> 
     * @return InstanceId <p>Business system ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Business system ID</p>
     * @param InstanceId <p>Business system ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>ID of the associated product instance</p> 
     * @return PeerId <p>ID of the associated product instance</p>
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set <p>ID of the associated product instance</p>
     * @param PeerId <p>ID of the associated product instance</p>
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
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
     * Get <p>Ckafka message topic</p> 
     * @return MetricTopic <p>Ckafka message topic</p>
     */
    public String getMetricTopic() {
        return this.MetricTopic;
    }

    /**
     * Set <p>Ckafka message topic</p>
     * @param MetricTopic <p>Ckafka message topic</p>
     */
    public void setMetricTopic(String MetricTopic) {
        this.MetricTopic = MetricTopic;
    }

    public ModifyApmAssociationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApmAssociationRequest(ModifyApmAssociationRequest source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PeerId != null) {
            this.PeerId = new String(source.PeerId);
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
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PeerId", this.PeerId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "MetricTopic", this.MetricTopic);

    }
}

