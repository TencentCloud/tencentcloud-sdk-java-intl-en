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

public class CreateDynamicInstanceRequest extends AbstractModel {

    /**
    * <p>EMR cluster ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Name of the service that supports DynamicInstance.</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>DynamicInstance type.</p><p>Enumeration values:</p><ul><li>RayCluster: RayCluster type</li></ul>
    */
    @SerializedName("DynamicInstanceType")
    @Expose
    private String DynamicInstanceType;

    /**
    * <p>Form creation information.</p>
    */
    @SerializedName("DynamicInstanceForm")
    @Expose
    private DynamicInstanceForm DynamicInstanceForm;

    /**
    * <p>YAML creation information.</p>
    */
    @SerializedName("DynamicInstanceYaml")
    @Expose
    private String DynamicInstanceYaml;

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
     * Get <p>Name of the service that supports DynamicInstance.</p> 
     * @return ServiceName <p>Name of the service that supports DynamicInstance.</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>Name of the service that supports DynamicInstance.</p>
     * @param ServiceName <p>Name of the service that supports DynamicInstance.</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
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
     * Get <p>Form creation information.</p> 
     * @return DynamicInstanceForm <p>Form creation information.</p>
     */
    public DynamicInstanceForm getDynamicInstanceForm() {
        return this.DynamicInstanceForm;
    }

    /**
     * Set <p>Form creation information.</p>
     * @param DynamicInstanceForm <p>Form creation information.</p>
     */
    public void setDynamicInstanceForm(DynamicInstanceForm DynamicInstanceForm) {
        this.DynamicInstanceForm = DynamicInstanceForm;
    }

    /**
     * Get <p>YAML creation information.</p> 
     * @return DynamicInstanceYaml <p>YAML creation information.</p>
     */
    public String getDynamicInstanceYaml() {
        return this.DynamicInstanceYaml;
    }

    /**
     * Set <p>YAML creation information.</p>
     * @param DynamicInstanceYaml <p>YAML creation information.</p>
     */
    public void setDynamicInstanceYaml(String DynamicInstanceYaml) {
        this.DynamicInstanceYaml = DynamicInstanceYaml;
    }

    public CreateDynamicInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDynamicInstanceRequest(CreateDynamicInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.DynamicInstanceType != null) {
            this.DynamicInstanceType = new String(source.DynamicInstanceType);
        }
        if (source.DynamicInstanceForm != null) {
            this.DynamicInstanceForm = new DynamicInstanceForm(source.DynamicInstanceForm);
        }
        if (source.DynamicInstanceYaml != null) {
            this.DynamicInstanceYaml = new String(source.DynamicInstanceYaml);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "DynamicInstanceType", this.DynamicInstanceType);
        this.setParamObj(map, prefix + "DynamicInstanceForm.", this.DynamicInstanceForm);
        this.setParamSimple(map, prefix + "DynamicInstanceYaml", this.DynamicInstanceYaml);

    }
}

