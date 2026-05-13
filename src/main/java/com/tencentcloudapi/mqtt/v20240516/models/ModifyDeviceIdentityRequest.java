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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceIdentityRequest extends AbstractModel {

    /**
    * Tencent Cloud MQTT instance ID can be obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or the console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Device ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 1:ENABLED-Available
2: DISABLED - Unavailable
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Primary signature key, Base64 encode is required.
    */
    @SerializedName("PrimaryKey")
    @Expose
    private String PrimaryKey;

    /**
    * Secondary signature key, must be Base64 encoded.
    */
    @SerializedName("SecondaryKey")
    @Expose
    private String SecondaryKey;

    /**
    * Device id spread attribute setting	
    */
    @SerializedName("PropagatingProperties")
    @Expose
    private PropagatingProperty [] PropagatingProperties;

    /**
     * Get Tencent Cloud MQTT instance ID can be obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or the console. 
     * @return InstanceId Tencent Cloud MQTT instance ID can be obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or the console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Tencent Cloud MQTT instance ID can be obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or the console.
     * @param InstanceId Tencent Cloud MQTT instance ID can be obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or the console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Device ID 
     * @return DeviceId Device ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID
     * @param DeviceId Device ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 1:ENABLED-Available
2: DISABLED - Unavailable 
     * @return Status 1:ENABLED-Available
2: DISABLED - Unavailable
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 1:ENABLED-Available
2: DISABLED - Unavailable
     * @param Status 1:ENABLED-Available
2: DISABLED - Unavailable
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Primary signature key, Base64 encode is required. 
     * @return PrimaryKey Primary signature key, Base64 encode is required.
     */
    public String getPrimaryKey() {
        return this.PrimaryKey;
    }

    /**
     * Set Primary signature key, Base64 encode is required.
     * @param PrimaryKey Primary signature key, Base64 encode is required.
     */
    public void setPrimaryKey(String PrimaryKey) {
        this.PrimaryKey = PrimaryKey;
    }

    /**
     * Get Secondary signature key, must be Base64 encoded. 
     * @return SecondaryKey Secondary signature key, must be Base64 encoded.
     */
    public String getSecondaryKey() {
        return this.SecondaryKey;
    }

    /**
     * Set Secondary signature key, must be Base64 encoded.
     * @param SecondaryKey Secondary signature key, must be Base64 encoded.
     */
    public void setSecondaryKey(String SecondaryKey) {
        this.SecondaryKey = SecondaryKey;
    }

    /**
     * Get Device id spread attribute setting	 
     * @return PropagatingProperties Device id spread attribute setting	
     */
    public PropagatingProperty [] getPropagatingProperties() {
        return this.PropagatingProperties;
    }

    /**
     * Set Device id spread attribute setting	
     * @param PropagatingProperties Device id spread attribute setting	
     */
    public void setPropagatingProperties(PropagatingProperty [] PropagatingProperties) {
        this.PropagatingProperties = PropagatingProperties;
    }

    public ModifyDeviceIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceIdentityRequest(ModifyDeviceIdentityRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PrimaryKey != null) {
            this.PrimaryKey = new String(source.PrimaryKey);
        }
        if (source.SecondaryKey != null) {
            this.SecondaryKey = new String(source.SecondaryKey);
        }
        if (source.PropagatingProperties != null) {
            this.PropagatingProperties = new PropagatingProperty[source.PropagatingProperties.length];
            for (int i = 0; i < source.PropagatingProperties.length; i++) {
                this.PropagatingProperties[i] = new PropagatingProperty(source.PropagatingProperties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PrimaryKey", this.PrimaryKey);
        this.setParamSimple(map, prefix + "SecondaryKey", this.SecondaryKey);
        this.setParamArrayObj(map, prefix + "PropagatingProperties.", this.PropagatingProperties);

    }
}

