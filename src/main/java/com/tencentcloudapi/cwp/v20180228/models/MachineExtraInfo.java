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
    * 
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * 
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * 
    */
    @SerializedName("NetworkType")
    @Expose
    private Long NetworkType;

    /**
    * 
    */
    @SerializedName("NetworkName")
    @Expose
    private String NetworkName;

    /**
    * 
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
     * Get  
     * @return WanIP 
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set 
     * @param WanIP 
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get  
     * @return PrivateIP 
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set 
     * @param PrivateIP 
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get  
     * @return NetworkType 
     */
    public Long getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 
     * @param NetworkType 
     */
    public void setNetworkType(Long NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get  
     * @return NetworkName 
     */
    public String getNetworkName() {
        return this.NetworkName;
    }

    /**
     * Set 
     * @param NetworkName 
     */
    public void setNetworkName(String NetworkName) {
        this.NetworkName = NetworkName;
    }

    /**
     * Get  
     * @return InstanceID 
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 
     * @param InstanceID 
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get  
     * @return HostName 
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 
     * @param HostName 
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

