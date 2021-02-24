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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchTarget extends AbstractModel{

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Binding port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * CVM instance ID. Indicating binding the primary IP of the primary ENI.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ENI IP or other private IP. This parameter is required for binding a dual-stack IPv6 CVM instance.
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * CVM instance weight. Value range: [0, 100]. If it is not specified when binding the instance, 10 will be used by default.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Layer-7 rule ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
     * Get Listener ID 
     * @return ListenerId Listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
     * @param ListenerId Listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Binding port 
     * @return Port Binding port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Binding port
     * @param Port Binding port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get CVM instance ID. Indicating binding the primary IP of the primary ENI. 
     * @return InstanceId CVM instance ID. Indicating binding the primary IP of the primary ENI.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CVM instance ID. Indicating binding the primary IP of the primary ENI.
     * @param InstanceId CVM instance ID. Indicating binding the primary IP of the primary ENI.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ENI IP or other private IP. This parameter is required for binding a dual-stack IPv6 CVM instance. 
     * @return EniIp ENI IP or other private IP. This parameter is required for binding a dual-stack IPv6 CVM instance.
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set ENI IP or other private IP. This parameter is required for binding a dual-stack IPv6 CVM instance.
     * @param EniIp ENI IP or other private IP. This parameter is required for binding a dual-stack IPv6 CVM instance.
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Get CVM instance weight. Value range: [0, 100]. If it is not specified when binding the instance, 10 will be used by default. 
     * @return Weight CVM instance weight. Value range: [0, 100]. If it is not specified when binding the instance, 10 will be used by default.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set CVM instance weight. Value range: [0, 100]. If it is not specified when binding the instance, 10 will be used by default.
     * @param Weight CVM instance weight. Value range: [0, 100]. If it is not specified when binding the instance, 10 will be used by default.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Layer-7 rule ID 
     * @return LocationId Layer-7 rule ID
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Layer-7 rule ID
     * @param LocationId Layer-7 rule ID
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EniIp", this.EniIp);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);

    }
}

