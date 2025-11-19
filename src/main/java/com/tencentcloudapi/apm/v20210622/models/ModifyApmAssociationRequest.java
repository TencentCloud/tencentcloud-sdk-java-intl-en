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
    * Associated product name. currently only supports Prometheus.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Status of the association relationship: // association status: 1 (enabled), 2 (disabled), 4 (deleted).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Business system ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Associated product instance ID.
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
    * Specifies the CKafka message topic.
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
     * Get Associated product name. currently only supports Prometheus. 
     * @return ProductName Associated product name. currently only supports Prometheus.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Associated product name. currently only supports Prometheus.
     * @param ProductName Associated product name. currently only supports Prometheus.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Status of the association relationship: // association status: 1 (enabled), 2 (disabled), 4 (deleted). 
     * @return Status Status of the association relationship: // association status: 1 (enabled), 2 (disabled), 4 (deleted).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the association relationship: // association status: 1 (enabled), 2 (disabled), 4 (deleted).
     * @param Status Status of the association relationship: // association status: 1 (enabled), 2 (disabled), 4 (deleted).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Business system ID 
     * @return InstanceId Business system ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system ID
     * @param InstanceId Business system ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Associated product instance ID. 
     * @return PeerId Associated product instance ID.
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set Associated product instance ID.
     * @param PeerId Associated product instance ID.
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    /**
     * Get Specifies the CKafka message topic. 
     * @return Topic Specifies the CKafka message topic.
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Specifies the CKafka message topic.
     * @param Topic Specifies the CKafka message topic.
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
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

    }
}

