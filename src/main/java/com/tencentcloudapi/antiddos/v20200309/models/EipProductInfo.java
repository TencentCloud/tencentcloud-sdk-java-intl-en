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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipProductInfo extends AbstractModel{

    /**
    * IP address
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Cloud product category. Valid values:
`public`: CVM
`bm`: BM
`eni`: ENI
`vpngw`: VPN gateway
 `natgw`: NAT gateway
`waf`: WAF
`fpc`: financial products
`gaap`: GAAP 
`other`: hosted IP
]
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * Cloud sub-product category. Valid values: `cvm` (CVM), `lb` (Load balancer), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), `eip` (BM EIP) and `other` (hosted IP).
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Cloud instance ID of the IP. This field InstanceId will be `eni-*` if the instance ID is bound to an ENI IP; `none` if there is no instance ID to bind to a hosted IP.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get IP address 
     * @return Ip IP address
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address
     * @param Ip IP address
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Cloud product category. Valid values:
`public`: CVM
`bm`: BM
`eni`: ENI
`vpngw`: VPN gateway
 `natgw`: NAT gateway
`waf`: WAF
`fpc`: financial products
`gaap`: GAAP 
`other`: hosted IP
] 
     * @return BizType Cloud product category. Valid values:
`public`: CVM
`bm`: BM
`eni`: ENI
`vpngw`: VPN gateway
 `natgw`: NAT gateway
`waf`: WAF
`fpc`: financial products
`gaap`: GAAP 
`other`: hosted IP
]
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set Cloud product category. Valid values:
`public`: CVM
`bm`: BM
`eni`: ENI
`vpngw`: VPN gateway
 `natgw`: NAT gateway
`waf`: WAF
`fpc`: financial products
`gaap`: GAAP 
`other`: hosted IP
]
     * @param BizType Cloud product category. Valid values:
`public`: CVM
`bm`: BM
`eni`: ENI
`vpngw`: VPN gateway
 `natgw`: NAT gateway
`waf`: WAF
`fpc`: financial products
`gaap`: GAAP 
`other`: hosted IP
]
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get Cloud sub-product category. Valid values: `cvm` (CVM), `lb` (Load balancer), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), `eip` (BM EIP) and `other` (hosted IP). 
     * @return DeviceType Cloud sub-product category. Valid values: `cvm` (CVM), `lb` (Load balancer), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), `eip` (BM EIP) and `other` (hosted IP).
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Cloud sub-product category. Valid values: `cvm` (CVM), `lb` (Load balancer), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), `eip` (BM EIP) and `other` (hosted IP).
     * @param DeviceType Cloud sub-product category. Valid values: `cvm` (CVM), `lb` (Load balancer), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), `eip` (BM EIP) and `other` (hosted IP).
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Cloud instance ID of the IP. This field InstanceId will be `eni-*` if the instance ID is bound to an ENI IP; `none` if there is no instance ID to bind to a hosted IP. 
     * @return InstanceId Cloud instance ID of the IP. This field InstanceId will be `eni-*` if the instance ID is bound to an ENI IP; `none` if there is no instance ID to bind to a hosted IP.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cloud instance ID of the IP. This field InstanceId will be `eni-*` if the instance ID is bound to an ENI IP; `none` if there is no instance ID to bind to a hosted IP.
     * @param InstanceId Cloud instance ID of the IP. This field InstanceId will be `eni-*` if the instance ID is bound to an ENI IP; `none` if there is no instance ID to bind to a hosted IP.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public EipProductInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipProductInfo(EipProductInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

