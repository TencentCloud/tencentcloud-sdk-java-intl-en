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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancePostData extends AbstractModel {

    /**
    * This parameter has a fixed value of 0 returned by `CreateInstancePre`. It is only used for backend data alignment  and cannot be used as the query condition for `CheckTaskStatus`. 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * List of order IDs Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * Instance ID. When multiple instances are purchased, the ID of the first one is returned by default . Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Mapping between orders and the purchased instances.  Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DealNameInstanceIdMapping")
    @Expose
    private DealInstanceDTO [] DealNameInstanceIdMapping;

    /**
     * Get This parameter has a fixed value of 0 returned by `CreateInstancePre`. It is only used for backend data alignment  and cannot be used as the query condition for `CheckTaskStatus`. 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return FlowId This parameter has a fixed value of 0 returned by `CreateInstancePre`. It is only used for backend data alignment  and cannot be used as the query condition for `CheckTaskStatus`. 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set This parameter has a fixed value of 0 returned by `CreateInstancePre`. It is only used for backend data alignment  and cannot be used as the query condition for `CheckTaskStatus`. 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param FlowId This parameter has a fixed value of 0 returned by `CreateInstancePre`. It is only used for backend data alignment  and cannot be used as the query condition for `CheckTaskStatus`. 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get List of order IDs Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DealNames List of order IDs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set List of order IDs Note: This field may return null, indicating that no valid values can be obtained.
     * @param DealNames List of order IDs Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get Instance ID. When multiple instances are purchased, the ID of the first one is returned by default . Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID. When multiple instances are purchased, the ID of the first one is returned by default . Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. When multiple instances are purchased, the ID of the first one is returned by default . Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID. When multiple instances are purchased, the ID of the first one is returned by default . Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Mapping between orders and the purchased instances.  Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DealNameInstanceIdMapping Mapping between orders and the purchased instances.  Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DealInstanceDTO [] getDealNameInstanceIdMapping() {
        return this.DealNameInstanceIdMapping;
    }

    /**
     * Set Mapping between orders and the purchased instances.  Note: This field may return null, indicating that no valid values can be obtained.
     * @param DealNameInstanceIdMapping Mapping between orders and the purchased instances.  Note: This field may return null, indicating that no valid values can be obtained.
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

