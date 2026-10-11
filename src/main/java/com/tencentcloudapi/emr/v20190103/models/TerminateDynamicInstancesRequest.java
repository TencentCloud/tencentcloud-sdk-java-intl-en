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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateDynamicInstancesRequest extends AbstractModel {

    /**
    * <p>EMR cluster ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>DynamicInstance type.</p><p>Enumeration values:</p><ul><li>RayCluster: RayCluster type</li></ul>
    */
    @SerializedName("DynamicInstanceType")
    @Expose
    private String DynamicInstanceType;

    /**
    * <p>YAML creation information.</p>
    */
    @SerializedName("DynamicInstanceIds")
    @Expose
    private Long [] DynamicInstanceIds;

    /**
     * Get <p>EMR cluster ID.</p> 
     * @return InstanceId <p>EMR cluster ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>EMR cluster ID.</p>
     * @param InstanceId <p>EMR cluster ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>DynamicInstance type.</p><p>Enumeration values:</p><ul><li>RayCluster: RayCluster type</li></ul> 
     * @return DynamicInstanceType <p>DynamicInstance type.</p><p>Enumeration values:</p><ul><li>RayCluster: RayCluster type</li></ul>
     */
    public String getDynamicInstanceType() {
        return this.DynamicInstanceType;
    }

    /**
     * Set <p>DynamicInstance type.</p><p>Enumeration values:</p><ul><li>RayCluster: RayCluster type</li></ul>
     * @param DynamicInstanceType <p>DynamicInstance type.</p><p>Enumeration values:</p><ul><li>RayCluster: RayCluster type</li></ul>
     */
    public void setDynamicInstanceType(String DynamicInstanceType) {
        this.DynamicInstanceType = DynamicInstanceType;
    }

    /**
     * Get <p>YAML creation information.</p> 
     * @return DynamicInstanceIds <p>YAML creation information.</p>
     */
    public Long [] getDynamicInstanceIds() {
        return this.DynamicInstanceIds;
    }

    /**
     * Set <p>YAML creation information.</p>
     * @param DynamicInstanceIds <p>YAML creation information.</p>
     */
    public void setDynamicInstanceIds(Long [] DynamicInstanceIds) {
        this.DynamicInstanceIds = DynamicInstanceIds;
    }

    public TerminateDynamicInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateDynamicInstancesRequest(TerminateDynamicInstancesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DynamicInstanceType != null) {
            this.DynamicInstanceType = new String(source.DynamicInstanceType);
        }
        if (source.DynamicInstanceIds != null) {
            this.DynamicInstanceIds = new Long[source.DynamicInstanceIds.length];
            for (int i = 0; i < source.DynamicInstanceIds.length; i++) {
                this.DynamicInstanceIds[i] = new Long(source.DynamicInstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DynamicInstanceType", this.DynamicInstanceType);
        this.setParamArraySimple(map, prefix + "DynamicInstanceIds.", this.DynamicInstanceIds);

    }
}

