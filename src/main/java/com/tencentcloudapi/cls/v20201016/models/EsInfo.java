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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsInfo extends AbstractModel {

    /**
    * ES Types. 1: Cloud ES, 2: Self-build ES.
    */
    @SerializedName("EsType")
    @Expose
    private Long EsType;

    /**
    * Access method 1: private network, 2: public network. Self-built ES required.
    */
    @SerializedName("AccessMode")
    @Expose
    private Long AccessMode;

    /**
    * Instance id. Required for es instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Username.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Access address. Self-built ES required.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Access port. Self-built ES required.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Network. Required when accessing self-built ES via private network.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Network service type. Required when accessing a self-built ES via private network.
CLB:1025 Cloud Virtual Machine (CVM):0
    */
    @SerializedName("VirtualGatewayType")
    @Expose
    private Long VirtualGatewayType;

    /**
    * Password.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get ES Types. 1: Cloud ES, 2: Self-build ES. 
     * @return EsType ES Types. 1: Cloud ES, 2: Self-build ES.
     */
    public Long getEsType() {
        return this.EsType;
    }

    /**
     * Set ES Types. 1: Cloud ES, 2: Self-build ES.
     * @param EsType ES Types. 1: Cloud ES, 2: Self-build ES.
     */
    public void setEsType(Long EsType) {
        this.EsType = EsType;
    }

    /**
     * Get Access method 1: private network, 2: public network. Self-built ES required. 
     * @return AccessMode Access method 1: private network, 2: public network. Self-built ES required.
     */
    public Long getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set Access method 1: private network, 2: public network. Self-built ES required.
     * @param AccessMode Access method 1: private network, 2: public network. Self-built ES required.
     */
    public void setAccessMode(Long AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get Instance id. Required for es instance. 
     * @return InstanceId Instance id. Required for es instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance id. Required for es instance.
     * @param InstanceId Instance id. Required for es instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Username. 
     * @return User Username.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username.
     * @param User Username.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Access address. Self-built ES required. 
     * @return Address Access address. Self-built ES required.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Access address. Self-built ES required.
     * @param Address Access address. Self-built ES required.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Access port. Self-built ES required. 
     * @return Port Access port. Self-built ES required.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Access port. Self-built ES required.
     * @param Port Access port. Self-built ES required.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Network. Required when accessing self-built ES via private network. 
     * @return VpcId Network. Required when accessing self-built ES via private network.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Network. Required when accessing self-built ES via private network.
     * @param VpcId Network. Required when accessing self-built ES via private network.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Network service type. Required when accessing a self-built ES via private network.
CLB:1025 Cloud Virtual Machine (CVM):0 
     * @return VirtualGatewayType Network service type. Required when accessing a self-built ES via private network.
CLB:1025 Cloud Virtual Machine (CVM):0
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set Network service type. Required when accessing a self-built ES via private network.
CLB:1025 Cloud Virtual Machine (CVM):0
     * @param VirtualGatewayType Network service type. Required when accessing a self-built ES via private network.
CLB:1025 Cloud Virtual Machine (CVM):0
     */
    public void setVirtualGatewayType(Long VirtualGatewayType) {
        this.VirtualGatewayType = VirtualGatewayType;
    }

    /**
     * Get Password. 
     * @return Password Password.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password.
     * @param Password Password.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public EsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EsInfo(EsInfo source) {
        if (source.EsType != null) {
            this.EsType = new Long(source.EsType);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new Long(source.AccessMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VirtualGatewayType != null) {
            this.VirtualGatewayType = new Long(source.VirtualGatewayType);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EsType", this.EsType);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VirtualGatewayType", this.VirtualGatewayType);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

