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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BoundIpInfo extends AbstractModel {

    /**
    * IP address
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Category of product that can be bound. Valid values: `public` (CVM and CLB), `bm` (BM), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), and `other` (hosted IP). This field is required when you perform binding.
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * Anti-DDoS instance ID of the IP. This field is required only when the instance is bound to an IP. For example, this field InstanceId will be `eni-*` if the instance ID is bound to an ENI IP; `none` if there is no instance to bind to a managed IP.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Sub-product category. Valid values: `cvm` (CVM), `lb` (Load balancer), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), `eip` (BM EIP) and `other` (managed IP). This field is required when you perform binding.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * ISP. Valid values: `0` (China Telecom), `1` (China Unicom), `2` (China Mobile), and `5` (BGP). This field is required when you perform binding.
    */
    @SerializedName("IspCode")
    @Expose
    private Long IspCode;

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
     * Get Category of product that can be bound. Valid values: `public` (CVM and CLB), `bm` (BM), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), and `other` (hosted IP). This field is required when you perform binding. 
     * @return BizType Category of product that can be bound. Valid values: `public` (CVM and CLB), `bm` (BM), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), and `other` (hosted IP). This field is required when you perform binding.
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set Category of product that can be bound. Valid values: `public` (CVM and CLB), `bm` (BM), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), and `other` (hosted IP). This field is required when you perform binding.
     * @param BizType Category of product that can be bound. Valid values: `public` (CVM and CLB), `bm` (BM), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), and `other` (hosted IP). This field is required when you perform binding.
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get Anti-DDoS instance ID of the IP. This field is required only when the instance is bound to an IP. For example, this field InstanceId will be `eni-*` if the instance ID is bound to an ENI IP; `none` if there is no instance to bind to a managed IP. 
     * @return InstanceId Anti-DDoS instance ID of the IP. This field is required only when the instance is bound to an IP. For example, this field InstanceId will be `eni-*` if the instance ID is bound to an ENI IP; `none` if there is no instance to bind to a managed IP.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Anti-DDoS instance ID of the IP. This field is required only when the instance is bound to an IP. For example, this field InstanceId will be `eni-*` if the instance ID is bound to an ENI IP; `none` if there is no instance to bind to a managed IP.
     * @param InstanceId Anti-DDoS instance ID of the IP. This field is required only when the instance is bound to an IP. For example, this field InstanceId will be `eni-*` if the instance ID is bound to an ENI IP; `none` if there is no instance to bind to a managed IP.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Sub-product category. Valid values: `cvm` (CVM), `lb` (Load balancer), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), `eip` (BM EIP) and `other` (managed IP). This field is required when you perform binding. 
     * @return DeviceType Sub-product category. Valid values: `cvm` (CVM), `lb` (Load balancer), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), `eip` (BM EIP) and `other` (managed IP). This field is required when you perform binding.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Sub-product category. Valid values: `cvm` (CVM), `lb` (Load balancer), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), `eip` (BM EIP) and `other` (managed IP). This field is required when you perform binding.
     * @param DeviceType Sub-product category. Valid values: `cvm` (CVM), `lb` (Load balancer), `eni` (ENI), `vpngw` (VPN gateway), `natgw` (NAT gateway), `waf` (WAF), `fpc` (financial products), `gaap` (GAAP), `eip` (BM EIP) and `other` (managed IP). This field is required when you perform binding.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get ISP. Valid values: `0` (China Telecom), `1` (China Unicom), `2` (China Mobile), and `5` (BGP). This field is required when you perform binding. 
     * @return IspCode ISP. Valid values: `0` (China Telecom), `1` (China Unicom), `2` (China Mobile), and `5` (BGP). This field is required when you perform binding.
     */
    public Long getIspCode() {
        return this.IspCode;
    }

    /**
     * Set ISP. Valid values: `0` (China Telecom), `1` (China Unicom), `2` (China Mobile), and `5` (BGP). This field is required when you perform binding.
     * @param IspCode ISP. Valid values: `0` (China Telecom), `1` (China Unicom), `2` (China Mobile), and `5` (BGP). This field is required when you perform binding.
     */
    public void setIspCode(Long IspCode) {
        this.IspCode = IspCode;
    }

    public BoundIpInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BoundIpInfo(BoundIpInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.IspCode != null) {
            this.IspCode = new Long(source.IspCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "IspCode", this.IspCode);

    }
}

