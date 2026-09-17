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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatGatewayFlowMonitorDetail extends AbstractModel {

    /**
    * Source `IP` address.
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * Number of inbound packets.
    */
    @SerializedName("InPkg")
    @Expose
    private Long InPkg;

    /**
    * Number of outbound packets.
    */
    @SerializedName("OutPkg")
    @Expose
    private Long OutPkg;

    /**
    * Inbound traffic. Unit: `bytes`.
    */
    @SerializedName("InTraffic")
    @Expose
    private Long InTraffic;

    /**
    * Outbound traffic. Unit: `bytes`.
    */
    @SerializedName("OutTraffic")
    @Expose
    private Long OutTraffic;

    /**
    * Number of concurrent connections. Only standard NAT gateways support this parameter.
    */
    @SerializedName("ConcurrentConnectionCount")
    @Expose
    private Long ConcurrentConnectionCount;

    /**
    * New connection rate. Only standard NAT gateways support this parameter.
    */
    @SerializedName("NewConnectionRate")
    @Expose
    private Long NewConnectionRate;

    /**
     * Get Source `IP` address. 
     * @return PrivateIpAddress Source `IP` address.
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set Source `IP` address.
     * @param PrivateIpAddress Source `IP` address.
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get Number of inbound packets. 
     * @return InPkg Number of inbound packets.
     */
    public Long getInPkg() {
        return this.InPkg;
    }

    /**
     * Set Number of inbound packets.
     * @param InPkg Number of inbound packets.
     */
    public void setInPkg(Long InPkg) {
        this.InPkg = InPkg;
    }

    /**
     * Get Number of outbound packets. 
     * @return OutPkg Number of outbound packets.
     */
    public Long getOutPkg() {
        return this.OutPkg;
    }

    /**
     * Set Number of outbound packets.
     * @param OutPkg Number of outbound packets.
     */
    public void setOutPkg(Long OutPkg) {
        this.OutPkg = OutPkg;
    }

    /**
     * Get Inbound traffic. Unit: `bytes`. 
     * @return InTraffic Inbound traffic. Unit: `bytes`.
     */
    public Long getInTraffic() {
        return this.InTraffic;
    }

    /**
     * Set Inbound traffic. Unit: `bytes`.
     * @param InTraffic Inbound traffic. Unit: `bytes`.
     */
    public void setInTraffic(Long InTraffic) {
        this.InTraffic = InTraffic;
    }

    /**
     * Get Outbound traffic. Unit: `bytes`. 
     * @return OutTraffic Outbound traffic. Unit: `bytes`.
     */
    public Long getOutTraffic() {
        return this.OutTraffic;
    }

    /**
     * Set Outbound traffic. Unit: `bytes`.
     * @param OutTraffic Outbound traffic. Unit: `bytes`.
     */
    public void setOutTraffic(Long OutTraffic) {
        this.OutTraffic = OutTraffic;
    }

    /**
     * Get Number of concurrent connections. Only standard NAT gateways support this parameter. 
     * @return ConcurrentConnectionCount Number of concurrent connections. Only standard NAT gateways support this parameter.
     */
    public Long getConcurrentConnectionCount() {
        return this.ConcurrentConnectionCount;
    }

    /**
     * Set Number of concurrent connections. Only standard NAT gateways support this parameter.
     * @param ConcurrentConnectionCount Number of concurrent connections. Only standard NAT gateways support this parameter.
     */
    public void setConcurrentConnectionCount(Long ConcurrentConnectionCount) {
        this.ConcurrentConnectionCount = ConcurrentConnectionCount;
    }

    /**
     * Get New connection rate. Only standard NAT gateways support this parameter. 
     * @return NewConnectionRate New connection rate. Only standard NAT gateways support this parameter.
     */
    public Long getNewConnectionRate() {
        return this.NewConnectionRate;
    }

    /**
     * Set New connection rate. Only standard NAT gateways support this parameter.
     * @param NewConnectionRate New connection rate. Only standard NAT gateways support this parameter.
     */
    public void setNewConnectionRate(Long NewConnectionRate) {
        this.NewConnectionRate = NewConnectionRate;
    }

    public NatGatewayFlowMonitorDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatGatewayFlowMonitorDetail(NatGatewayFlowMonitorDetail source) {
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.InPkg != null) {
            this.InPkg = new Long(source.InPkg);
        }
        if (source.OutPkg != null) {
            this.OutPkg = new Long(source.OutPkg);
        }
        if (source.InTraffic != null) {
            this.InTraffic = new Long(source.InTraffic);
        }
        if (source.OutTraffic != null) {
            this.OutTraffic = new Long(source.OutTraffic);
        }
        if (source.ConcurrentConnectionCount != null) {
            this.ConcurrentConnectionCount = new Long(source.ConcurrentConnectionCount);
        }
        if (source.NewConnectionRate != null) {
            this.NewConnectionRate = new Long(source.NewConnectionRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "InPkg", this.InPkg);
        this.setParamSimple(map, prefix + "OutPkg", this.OutPkg);
        this.setParamSimple(map, prefix + "InTraffic", this.InTraffic);
        this.setParamSimple(map, prefix + "OutTraffic", this.OutTraffic);
        this.setParamSimple(map, prefix + "ConcurrentConnectionCount", this.ConcurrentConnectionCount);
        this.setParamSimple(map, prefix + "NewConnectionRate", this.NewConnectionRate);

    }
}

