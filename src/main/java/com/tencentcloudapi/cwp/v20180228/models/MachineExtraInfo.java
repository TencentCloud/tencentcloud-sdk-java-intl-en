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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineExtraInfo extends AbstractModel {

    /**
    * Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * Network Type. 1: VPC network; 2: Basic Network; 3: Non-Tencent Cloud Network
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkType")
    @Expose
    private Long NetworkType;

    /**
    * Network Name, returns vpc_id in the case of a VPC network
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkName")
    @Expose
    private String NetworkName;

    /**
    * Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Host name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
     * Get Public IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WanIP Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WanIP Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get Private IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivateIP Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivateIP Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get Network Type. 1: VPC network; 2: Basic Network; 3: Non-Tencent Cloud Network
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkType Network Type. 1: VPC network; 2: Basic Network; 3: Non-Tencent Cloud Network
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Network Type. 1: VPC network; 2: Basic Network; 3: Non-Tencent Cloud Network
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkType Network Type. 1: VPC network; 2: Basic Network; 3: Non-Tencent Cloud Network
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkType(Long NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get Network Name, returns vpc_id in the case of a VPC network
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkName Network Name, returns vpc_id in the case of a VPC network
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNetworkName() {
        return this.NetworkName;
    }

    /**
     * Set Network Name, returns vpc_id in the case of a VPC network
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkName Network Name, returns vpc_id in the case of a VPC network
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkName(String NetworkName) {
        this.NetworkName = NetworkName;
    }

    /**
     * Get Instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceID Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceID Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Host name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    public MachineExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineExtraInfo(MachineExtraInfo source) {
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new Long(source.NetworkType);
        }
        if (source.NetworkName != null) {
            this.NetworkName = new String(source.NetworkName);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NetworkName", this.NetworkName);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "HostName", this.HostName);

    }
}

