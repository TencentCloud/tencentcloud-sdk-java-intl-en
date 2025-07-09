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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroupReference extends AbstractModel {

    /**
    * Services referencing the origin group. Values:
<li>`AccelerationDomain`: Acceleration domain name</li>
<li>`RuleEngine`: Rules engine</li>
<li>`Loadbalance`: Load balancer</li>
<li>`ApplicationProxy`: L4 proxy</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * ID of the instances referencing the origin group
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Name of the instance referencing the origin group
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get Services referencing the origin group. Values:
<li>`AccelerationDomain`: Acceleration domain name</li>
<li>`RuleEngine`: Rules engine</li>
<li>`Loadbalance`: Load balancer</li>
<li>`ApplicationProxy`: L4 proxy</li> 
     * @return InstanceType Services referencing the origin group. Values:
<li>`AccelerationDomain`: Acceleration domain name</li>
<li>`RuleEngine`: Rules engine</li>
<li>`Loadbalance`: Load balancer</li>
<li>`ApplicationProxy`: L4 proxy</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Services referencing the origin group. Values:
<li>`AccelerationDomain`: Acceleration domain name</li>
<li>`RuleEngine`: Rules engine</li>
<li>`Loadbalance`: Load balancer</li>
<li>`ApplicationProxy`: L4 proxy</li>
     * @param InstanceType Services referencing the origin group. Values:
<li>`AccelerationDomain`: Acceleration domain name</li>
<li>`RuleEngine`: Rules engine</li>
<li>`Loadbalance`: Load balancer</li>
<li>`ApplicationProxy`: L4 proxy</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get ID of the instances referencing the origin group 
     * @return InstanceId ID of the instances referencing the origin group
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instances referencing the origin group
     * @param InstanceId ID of the instances referencing the origin group
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Name of the instance referencing the origin group 
     * @return InstanceName Name of the instance referencing the origin group
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Name of the instance referencing the origin group
     * @param InstanceName Name of the instance referencing the origin group
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public OriginGroupReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupReference(OriginGroupReference source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

