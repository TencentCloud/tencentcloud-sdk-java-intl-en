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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSSwitchRequest extends AbstractModel{

    /**
    * Anti-DDoS service type. `basic`: Anti-DDoS Basic
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * `get`: read DDoS protection status, `set`: modify DDoS protection status
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Anti-DDoS Basic IP, which is required only if `Business` is Anti-DDoS Basic;
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Product type of IP, which is required only if `Business` is Anti-DDoS Basic. Valid values: [public (CVM), bm (BM), eni (ENI), vpngw (VPN Gateway), natgw (NAT Gateway), waf (WAF), fpc (finance product), gaap (GAAP), other (hosted IP)]
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * Product subtype of IP, which is required only if `Business` is Anti-DDoS Basic. Valid values: [cvm (CVM), lb (CLB), eni (ENI), vpngw (VPN), natgw (NAT), waf (WAF), fpc (finance), gaap (GAAP), other (hosted IP), eip (BM EIP)]
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Resource instance ID of IP, which is required only if `Business` is Anti-DDoS Basic. This field is required when binding a new IP. For example, if it is an ENI IP, enter `ID(eni-*)` of the ENI for `InstanceId`;
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * This field is required only if `Business` is Anti-DDoS Basic, indicating the IP region. Valid values:
"bj":     North China (Beijing)
"cd":     Southwest China (Chengdu)
"cq":     Southwest China (Chongqing)
"gz":     South China (Guangzhou)
"gzopen": South China (Guangzhou Open)
"hk":     Hong Kong (China)
"kr":     Southeast Asia (Seoul)
"sh":     East China (Shanghai)
"shjr":   East China (Shanghai Finance)
"szjr":   South China (Shenzhen Finance)
"sg":     Southeast Asia (Singapore)
"th":     Southeast Asia (Thailand)
"de":     Europe (Germany)
"usw":    West US (Silicon Valley)
"ca":     North America (Toronto)
"jp":     Japan
"hzec":   Hangzhou
"in":     India
"use":    East US (Virginia)
"ru":     Russia
"tpe":    Taiwan (China)
"nj":     Nanjing
    */
    @SerializedName("IPRegion")
    @Expose
    private String IPRegion;

    /**
    * Protection status value, which is optional. Valid values: [0 (disabled), 1 (enabled)]. If `Method` is `get`, this field can be left empty;
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Anti-DDoS service type. `basic`: Anti-DDoS Basic 
     * @return Business Anti-DDoS service type. `basic`: Anti-DDoS Basic
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `basic`: Anti-DDoS Basic
     * @param Business Anti-DDoS service type. `basic`: Anti-DDoS Basic
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get `get`: read DDoS protection status, `set`: modify DDoS protection status 
     * @return Method `get`: read DDoS protection status, `set`: modify DDoS protection status
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set `get`: read DDoS protection status, `set`: modify DDoS protection status
     * @param Method `get`: read DDoS protection status, `set`: modify DDoS protection status
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Anti-DDoS Basic IP, which is required only if `Business` is Anti-DDoS Basic; 
     * @return Ip Anti-DDoS Basic IP, which is required only if `Business` is Anti-DDoS Basic;
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Anti-DDoS Basic IP, which is required only if `Business` is Anti-DDoS Basic;
     * @param Ip Anti-DDoS Basic IP, which is required only if `Business` is Anti-DDoS Basic;
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Product type of IP, which is required only if `Business` is Anti-DDoS Basic. Valid values: [public (CVM), bm (BM), eni (ENI), vpngw (VPN Gateway), natgw (NAT Gateway), waf (WAF), fpc (finance product), gaap (GAAP), other (hosted IP)] 
     * @return BizType Product type of IP, which is required only if `Business` is Anti-DDoS Basic. Valid values: [public (CVM), bm (BM), eni (ENI), vpngw (VPN Gateway), natgw (NAT Gateway), waf (WAF), fpc (finance product), gaap (GAAP), other (hosted IP)]
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set Product type of IP, which is required only if `Business` is Anti-DDoS Basic. Valid values: [public (CVM), bm (BM), eni (ENI), vpngw (VPN Gateway), natgw (NAT Gateway), waf (WAF), fpc (finance product), gaap (GAAP), other (hosted IP)]
     * @param BizType Product type of IP, which is required only if `Business` is Anti-DDoS Basic. Valid values: [public (CVM), bm (BM), eni (ENI), vpngw (VPN Gateway), natgw (NAT Gateway), waf (WAF), fpc (finance product), gaap (GAAP), other (hosted IP)]
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get Product subtype of IP, which is required only if `Business` is Anti-DDoS Basic. Valid values: [cvm (CVM), lb (CLB), eni (ENI), vpngw (VPN), natgw (NAT), waf (WAF), fpc (finance), gaap (GAAP), other (hosted IP), eip (BM EIP)] 
     * @return DeviceType Product subtype of IP, which is required only if `Business` is Anti-DDoS Basic. Valid values: [cvm (CVM), lb (CLB), eni (ENI), vpngw (VPN), natgw (NAT), waf (WAF), fpc (finance), gaap (GAAP), other (hosted IP), eip (BM EIP)]
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Product subtype of IP, which is required only if `Business` is Anti-DDoS Basic. Valid values: [cvm (CVM), lb (CLB), eni (ENI), vpngw (VPN), natgw (NAT), waf (WAF), fpc (finance), gaap (GAAP), other (hosted IP), eip (BM EIP)]
     * @param DeviceType Product subtype of IP, which is required only if `Business` is Anti-DDoS Basic. Valid values: [cvm (CVM), lb (CLB), eni (ENI), vpngw (VPN), natgw (NAT), waf (WAF), fpc (finance), gaap (GAAP), other (hosted IP), eip (BM EIP)]
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Resource instance ID of IP, which is required only if `Business` is Anti-DDoS Basic. This field is required when binding a new IP. For example, if it is an ENI IP, enter `ID(eni-*)` of the ENI for `InstanceId`; 
     * @return InstanceId Resource instance ID of IP, which is required only if `Business` is Anti-DDoS Basic. This field is required when binding a new IP. For example, if it is an ENI IP, enter `ID(eni-*)` of the ENI for `InstanceId`;
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Resource instance ID of IP, which is required only if `Business` is Anti-DDoS Basic. This field is required when binding a new IP. For example, if it is an ENI IP, enter `ID(eni-*)` of the ENI for `InstanceId`;
     * @param InstanceId Resource instance ID of IP, which is required only if `Business` is Anti-DDoS Basic. This field is required when binding a new IP. For example, if it is an ENI IP, enter `ID(eni-*)` of the ENI for `InstanceId`;
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get This field is required only if `Business` is Anti-DDoS Basic, indicating the IP region. Valid values:
"bj":     North China (Beijing)
"cd":     Southwest China (Chengdu)
"cq":     Southwest China (Chongqing)
"gz":     South China (Guangzhou)
"gzopen": South China (Guangzhou Open)
"hk":     Hong Kong (China)
"kr":     Southeast Asia (Seoul)
"sh":     East China (Shanghai)
"shjr":   East China (Shanghai Finance)
"szjr":   South China (Shenzhen Finance)
"sg":     Southeast Asia (Singapore)
"th":     Southeast Asia (Thailand)
"de":     Europe (Germany)
"usw":    West US (Silicon Valley)
"ca":     North America (Toronto)
"jp":     Japan
"hzec":   Hangzhou
"in":     India
"use":    East US (Virginia)
"ru":     Russia
"tpe":    Taiwan (China)
"nj":     Nanjing 
     * @return IPRegion This field is required only if `Business` is Anti-DDoS Basic, indicating the IP region. Valid values:
"bj":     North China (Beijing)
"cd":     Southwest China (Chengdu)
"cq":     Southwest China (Chongqing)
"gz":     South China (Guangzhou)
"gzopen": South China (Guangzhou Open)
"hk":     Hong Kong (China)
"kr":     Southeast Asia (Seoul)
"sh":     East China (Shanghai)
"shjr":   East China (Shanghai Finance)
"szjr":   South China (Shenzhen Finance)
"sg":     Southeast Asia (Singapore)
"th":     Southeast Asia (Thailand)
"de":     Europe (Germany)
"usw":    West US (Silicon Valley)
"ca":     North America (Toronto)
"jp":     Japan
"hzec":   Hangzhou
"in":     India
"use":    East US (Virginia)
"ru":     Russia
"tpe":    Taiwan (China)
"nj":     Nanjing
     */
    public String getIPRegion() {
        return this.IPRegion;
    }

    /**
     * Set This field is required only if `Business` is Anti-DDoS Basic, indicating the IP region. Valid values:
"bj":     North China (Beijing)
"cd":     Southwest China (Chengdu)
"cq":     Southwest China (Chongqing)
"gz":     South China (Guangzhou)
"gzopen": South China (Guangzhou Open)
"hk":     Hong Kong (China)
"kr":     Southeast Asia (Seoul)
"sh":     East China (Shanghai)
"shjr":   East China (Shanghai Finance)
"szjr":   South China (Shenzhen Finance)
"sg":     Southeast Asia (Singapore)
"th":     Southeast Asia (Thailand)
"de":     Europe (Germany)
"usw":    West US (Silicon Valley)
"ca":     North America (Toronto)
"jp":     Japan
"hzec":   Hangzhou
"in":     India
"use":    East US (Virginia)
"ru":     Russia
"tpe":    Taiwan (China)
"nj":     Nanjing
     * @param IPRegion This field is required only if `Business` is Anti-DDoS Basic, indicating the IP region. Valid values:
"bj":     North China (Beijing)
"cd":     Southwest China (Chengdu)
"cq":     Southwest China (Chongqing)
"gz":     South China (Guangzhou)
"gzopen": South China (Guangzhou Open)
"hk":     Hong Kong (China)
"kr":     Southeast Asia (Seoul)
"sh":     East China (Shanghai)
"shjr":   East China (Shanghai Finance)
"szjr":   South China (Shenzhen Finance)
"sg":     Southeast Asia (Singapore)
"th":     Southeast Asia (Thailand)
"de":     Europe (Germany)
"usw":    West US (Silicon Valley)
"ca":     North America (Toronto)
"jp":     Japan
"hzec":   Hangzhou
"in":     India
"use":    East US (Virginia)
"ru":     Russia
"tpe":    Taiwan (China)
"nj":     Nanjing
     */
    public void setIPRegion(String IPRegion) {
        this.IPRegion = IPRegion;
    }

    /**
     * Get Protection status value, which is optional. Valid values: [0 (disabled), 1 (enabled)]. If `Method` is `get`, this field can be left empty; 
     * @return Status Protection status value, which is optional. Valid values: [0 (disabled), 1 (enabled)]. If `Method` is `get`, this field can be left empty;
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Protection status value, which is optional. Valid values: [0 (disabled), 1 (enabled)]. If `Method` is `get`, this field can be left empty;
     * @param Status Protection status value, which is optional. Valid values: [0 (disabled), 1 (enabled)]. If `Method` is `get`, this field can be left empty;
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IPRegion", this.IPRegion);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

