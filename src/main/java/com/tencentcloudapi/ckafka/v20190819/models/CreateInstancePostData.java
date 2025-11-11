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

public class CreateInstancePostData extends AbstractModel {

    /**
    * CreateInstancePre returns fixed as 0. it cannot be used as a query condition for CheckTaskStatus. this is merely to ensure alignment with the backend data structure.
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * Order ID list
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * The ckafka cluster instance Id. by default, returns the Id of the first purchased instance when purchasing multiple instances.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Order and purchase mapping list corresponding to the instance.
    */
    @SerializedName("DealNameInstanceIdMapping")
    @Expose
    private DealInstanceDTO [] DealNameInstanceIdMapping;

    /**
     * Get CreateInstancePre returns fixed as 0. it cannot be used as a query condition for CheckTaskStatus. this is merely to ensure alignment with the backend data structure. 
     * @return FlowId CreateInstancePre returns fixed as 0. it cannot be used as a query condition for CheckTaskStatus. this is merely to ensure alignment with the backend data structure.
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set CreateInstancePre returns fixed as 0. it cannot be used as a query condition for CheckTaskStatus. this is merely to ensure alignment with the backend data structure.
     * @param FlowId CreateInstancePre returns fixed as 0. it cannot be used as a query condition for CheckTaskStatus. this is merely to ensure alignment with the backend data structure.
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get Order ID list 
     * @return DealNames Order ID list
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set Order ID list
     * @param DealNames Order ID list
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get The ckafka cluster instance Id. by default, returns the Id of the first purchased instance when purchasing multiple instances. 
     * @return InstanceId The ckafka cluster instance Id. by default, returns the Id of the first purchased instance when purchasing multiple instances.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id. by default, returns the Id of the first purchased instance when purchasing multiple instances.
     * @param InstanceId The ckafka cluster instance Id. by default, returns the Id of the first purchased instance when purchasing multiple instances.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Order and purchase mapping list corresponding to the instance. 
     * @return DealNameInstanceIdMapping Order and purchase mapping list corresponding to the instance.
     */
    public DealInstanceDTO [] getDealNameInstanceIdMapping() {
        return this.DealNameInstanceIdMapping;
    }

    /**
     * Set Order and purchase mapping list corresponding to the instance.
     * @param DealNameInstanceIdMapping Order and purchase mapping list corresponding to the instance.
     */
    public void setDealNameInstanceIdMapping(DealInstanceDTO [] DealNameInstanceIdMapping) {
        this.DealNameInstanceIdMapping = DealNameInstanceIdMapping;
    }

    public CreateInstancePostData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePostData(CreateInstancePostData source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "DealNameInstanceIdMapping.", this.DealNameInstanceIdMapping);

    }
}

