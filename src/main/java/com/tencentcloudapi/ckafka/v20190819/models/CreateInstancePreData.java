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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancePreData extends AbstractModel {

    /**
    * <p>CreateInstancePre returns fixed as 0 and cannot be used as a query condition for CheckTaskStatus. It is merely to ensure alignment with the backend data structure.</p>
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * <p>Order number list</p>
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * <p>Cluster instance Id of ckafka. When you purchase multiple instances, the first instance Id is returned by default.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Order and purchase mapping list corresponding to the instance</p>
    */
    @SerializedName("DealNameInstanceIdMapping")
    @Expose
    private DealInstanceDTO [] DealNameInstanceIdMapping;

    /**
    * <p>Event ID returned by CAM authentication</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get <p>CreateInstancePre returns fixed as 0 and cannot be used as a query condition for CheckTaskStatus. It is merely to ensure alignment with the backend data structure.</p> 
     * @return FlowId <p>CreateInstancePre returns fixed as 0 and cannot be used as a query condition for CheckTaskStatus. It is merely to ensure alignment with the backend data structure.</p>
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>CreateInstancePre returns fixed as 0 and cannot be used as a query condition for CheckTaskStatus. It is merely to ensure alignment with the backend data structure.</p>
     * @param FlowId <p>CreateInstancePre returns fixed as 0 and cannot be used as a query condition for CheckTaskStatus. It is merely to ensure alignment with the backend data structure.</p>
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>Order number list</p> 
     * @return DealNames <p>Order number list</p>
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set <p>Order number list</p>
     * @param DealNames <p>Order number list</p>
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get <p>Cluster instance Id of ckafka. When you purchase multiple instances, the first instance Id is returned by default.</p> 
     * @return InstanceId <p>Cluster instance Id of ckafka. When you purchase multiple instances, the first instance Id is returned by default.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Cluster instance Id of ckafka. When you purchase multiple instances, the first instance Id is returned by default.</p>
     * @param InstanceId <p>Cluster instance Id of ckafka. When you purchase multiple instances, the first instance Id is returned by default.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Order and purchase mapping list corresponding to the instance</p> 
     * @return DealNameInstanceIdMapping <p>Order and purchase mapping list corresponding to the instance</p>
     */
    public DealInstanceDTO [] getDealNameInstanceIdMapping() {
        return this.DealNameInstanceIdMapping;
    }

    /**
     * Set <p>Order and purchase mapping list corresponding to the instance</p>
     * @param DealNameInstanceIdMapping <p>Order and purchase mapping list corresponding to the instance</p>
     */
    public void setDealNameInstanceIdMapping(DealInstanceDTO [] DealNameInstanceIdMapping) {
        this.DealNameInstanceIdMapping = DealNameInstanceIdMapping;
    }

    /**
     * Get <p>Event ID returned by CAM authentication</p> 
     * @return EventId <p>Event ID returned by CAM authentication</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>Event ID returned by CAM authentication</p>
     * @param EventId <p>Event ID returned by CAM authentication</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    public CreateInstancePreData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePreData(CreateInstancePreData source) {
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DealNameInstanceIdMapping != null) {
            this.DealNameInstanceIdMapping = new DealInstanceDTO[source.DealNameInstanceIdMapping.length];
            for (int i = 0; i < source.DealNameInstanceIdMapping.length; i++) {
                this.DealNameInstanceIdMapping[i] = new DealInstanceDTO(source.DealNameInstanceIdMapping[i]);
            }
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "DealNameInstanceIdMapping.", this.DealNameInstanceIdMapping);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

