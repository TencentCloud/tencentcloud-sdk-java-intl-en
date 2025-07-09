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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupBackend extends AbstractModel {

    /**
    * Target group ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * Backend service type. Valid values: CVM, ENI (to be supported soon)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Unique backend service ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Listening port of backend service
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Forwarding weight of backend service. Value range: [0, 100]. Default value: 10.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Public network IP of the real server

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * Private network IP of backend serviceNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * Instance name of the real server

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Real server binding time

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RegisteredTime")
    @Expose
    private String RegisteredTime;

    /**
    * Unique ID of the ENI

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EniId")
    @Expose
    private String EniId;

    /**
    * Available zone ID of backend serviceNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
     * Get Target group ID 
     * @return TargetGroupId Target group ID
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set Target group ID
     * @param TargetGroupId Target group ID
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get Backend service type. Valid values: CVM, ENI (to be supported soon) 
     * @return Type Backend service type. Valid values: CVM, ENI (to be supported soon)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Backend service type. Valid values: CVM, ENI (to be supported soon)
     * @param Type Backend service type. Valid values: CVM, ENI (to be supported soon)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Unique backend service ID 
     * @return InstanceId Unique backend service ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Unique backend service ID
     * @param InstanceId Unique backend service ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Listening port of backend service 
     * @return Port Listening port of backend service
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Listening port of backend service
     * @param Port Listening port of backend service
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Forwarding weight of backend service. Value range: [0, 100]. Default value: 10. 
     * @return Weight Forwarding weight of backend service. Value range: [0, 100]. Default value: 10.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Forwarding weight of backend service. Value range: [0, 100]. Default value: 10.
     * @param Weight Forwarding weight of backend service. Value range: [0, 100]. Default value: 10.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Public network IP of the real server

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PublicIpAddresses Public network IP of the real server

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set Public network IP of the real server

Note: This field may return null, indicating that no valid value can be obtained.
     * @param PublicIpAddresses Public network IP of the real server

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get Private network IP of backend serviceNote: This field may return null, indicating that no valid value can be obtained. 
     * @return PrivateIpAddresses Private network IP of backend serviceNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set Private network IP of backend serviceNote: This field may return null, indicating that no valid value can be obtained.
     * @param PrivateIpAddresses Private network IP of backend serviceNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get Instance name of the real server

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceName Instance name of the real server

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name of the real server

Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceName Instance name of the real server

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Real server binding time

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RegisteredTime Real server binding time

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegisteredTime() {
        return this.RegisteredTime;
    }

    /**
     * Set Real server binding time

Note: This field may return null, indicating that no valid value can be obtained.
     * @param RegisteredTime Real server binding time

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegisteredTime(String RegisteredTime) {
        this.RegisteredTime = RegisteredTime;
    }

    /**
     * Get Unique ID of the ENI

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EniId Unique ID of the ENI

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEniId() {
        return this.EniId;
    }

    /**
     * Set Unique ID of the ENI

Note: This field may return null, indicating that no valid value can be obtained.
     * @param EniId Unique ID of the ENI

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEniId(String EniId) {
        this.EniId = EniId;
    }

    /**
     * Get Available zone ID of backend serviceNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ZoneId Available zone ID of backend serviceNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Available zone ID of backend serviceNote: This field may return null, indicating that no valid value can be obtained.
     * @param ZoneId Available zone ID of backend serviceNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    public TargetGroupBackend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupBackend(TargetGroupBackend source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RegisteredTime != null) {
            this.RegisteredTime = new String(source.RegisteredTime);
        }
        if (source.EniId != null) {
            this.EniId = new String(source.EniId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegisteredTime", this.RegisteredTime);
        this.setParamSimple(map, prefix + "EniId", this.EniId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

