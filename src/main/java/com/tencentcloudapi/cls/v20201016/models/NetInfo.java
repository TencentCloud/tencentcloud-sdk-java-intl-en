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

public class NetInfo extends AbstractModel {

    /**
    * Network address.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Authentication token
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * Network type; 1: Private network; 2: Public network
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * Associated network; If the network type is private network, this field is required.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Network service type. If the network type is private network, this field is required.
-0: Cloud cvm
-3: Cloud Direct Connect Gateway
-CCN
-1025: Cloud clb
    */
    @SerializedName("VirtualGatewayType")
    @Expose
    private Long VirtualGatewayType;

    /**
    * Authentication mechanism, whether to use SSL, default non-use
    */
    @SerializedName("IsSSL")
    @Expose
    private Boolean IsSSL;

    /**
     * Get Network address. 
     * @return Host Network address.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Network address.
     * @param Host Network address.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Port. 
     * @return Port Port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port.
     * @param Port Port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Authentication token 
     * @return Token Authentication token
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Authentication token
     * @param Token Authentication token
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get Network type; 1: Private network; 2: Public network 
     * @return NetType Network type; 1: Private network; 2: Public network
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type; 1: Private network; 2: Public network
     * @param NetType Network type; 1: Private network; 2: Public network
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Associated network; If the network type is private network, this field is required. 
     * @return VpcId Associated network; If the network type is private network, this field is required.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Associated network; If the network type is private network, this field is required.
     * @param VpcId Associated network; If the network type is private network, this field is required.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Network service type. If the network type is private network, this field is required.
-0: Cloud cvm
-3: Cloud Direct Connect Gateway
-CCN
-1025: Cloud clb 
     * @return VirtualGatewayType Network service type. If the network type is private network, this field is required.
-0: Cloud cvm
-3: Cloud Direct Connect Gateway
-CCN
-1025: Cloud clb
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set Network service type. If the network type is private network, this field is required.
-0: Cloud cvm
-3: Cloud Direct Connect Gateway
-CCN
-1025: Cloud clb
     * @param VirtualGatewayType Network service type. If the network type is private network, this field is required.
-0: Cloud cvm
-3: Cloud Direct Connect Gateway
-CCN
-1025: Cloud clb
     */
    public void setVirtualGatewayType(Long VirtualGatewayType) {
        this.VirtualGatewayType = VirtualGatewayType;
    }

    /**
     * Get Authentication mechanism, whether to use SSL, default non-use 
     * @return IsSSL Authentication mechanism, whether to use SSL, default non-use
     */
    public Boolean getIsSSL() {
        return this.IsSSL;
    }

    /**
     * Set Authentication mechanism, whether to use SSL, default non-use
     * @param IsSSL Authentication mechanism, whether to use SSL, default non-use
     */
    public void setIsSSL(Boolean IsSSL) {
        this.IsSSL = IsSSL;
    }

    public NetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetInfo(NetInfo source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VirtualGatewayType != null) {
            this.VirtualGatewayType = new Long(source.VirtualGatewayType);
        }
        if (source.IsSSL != null) {
            this.IsSSL = new Boolean(source.IsSSL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VirtualGatewayType", this.VirtualGatewayType);
        this.setParamSimple(map, prefix + "IsSSL", this.IsSSL);

    }
}

