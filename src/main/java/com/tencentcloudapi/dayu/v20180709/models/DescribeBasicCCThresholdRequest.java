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

public class DescribeBasicCCThresholdRequest extends AbstractModel{

    /**
    * Queried IP address, such as 1.1.1.1
    */
    @SerializedName("BasicIp")
    @Expose
    private String BasicIp;

    /**
    * IP region. Valid values: region abbreviations such as gz, bj, sh, and hk
    */
    @SerializedName("BasicRegion")
    @Expose
    private String BasicRegion;

    /**
    * Zone type. Valid values: public (public cloud zone), bm (BM zone), nat (NAT server zone), channel (internet channel).
    */
    @SerializedName("BasicBizType")
    @Expose
    private String BasicBizType;

    /**
    * Device type. Valid values: cvm (CVM), clb (public CLB), lb (BM CLB), nat (NAT server), channel (internet channel).
    */
    @SerializedName("BasicDeviceType")
    @Expose
    private String BasicDeviceType;

    /**
    * IPInstance Nat gateway, which is optional. (If the device type to be queried is a NAT server, this parameter is required, which can be obtained through the NAT resource query API)
    */
    @SerializedName("BasicIpInstance")
    @Expose
    private String BasicIpInstance;

    /**
    * ISP line, which is optional. (If the device type to be queried is a NAT server, this parameter should be 5)
    */
    @SerializedName("BasicIspCode")
    @Expose
    private Long BasicIspCode;

    /**
     * Get Queried IP address, such as 1.1.1.1 
     * @return BasicIp Queried IP address, such as 1.1.1.1
     */
    public String getBasicIp() {
        return this.BasicIp;
    }

    /**
     * Set Queried IP address, such as 1.1.1.1
     * @param BasicIp Queried IP address, such as 1.1.1.1
     */
    public void setBasicIp(String BasicIp) {
        this.BasicIp = BasicIp;
    }

    /**
     * Get IP region. Valid values: region abbreviations such as gz, bj, sh, and hk 
     * @return BasicRegion IP region. Valid values: region abbreviations such as gz, bj, sh, and hk
     */
    public String getBasicRegion() {
        return this.BasicRegion;
    }

    /**
     * Set IP region. Valid values: region abbreviations such as gz, bj, sh, and hk
     * @param BasicRegion IP region. Valid values: region abbreviations such as gz, bj, sh, and hk
     */
    public void setBasicRegion(String BasicRegion) {
        this.BasicRegion = BasicRegion;
    }

    /**
     * Get Zone type. Valid values: public (public cloud zone), bm (BM zone), nat (NAT server zone), channel (internet channel). 
     * @return BasicBizType Zone type. Valid values: public (public cloud zone), bm (BM zone), nat (NAT server zone), channel (internet channel).
     */
    public String getBasicBizType() {
        return this.BasicBizType;
    }

    /**
     * Set Zone type. Valid values: public (public cloud zone), bm (BM zone), nat (NAT server zone), channel (internet channel).
     * @param BasicBizType Zone type. Valid values: public (public cloud zone), bm (BM zone), nat (NAT server zone), channel (internet channel).
     */
    public void setBasicBizType(String BasicBizType) {
        this.BasicBizType = BasicBizType;
    }

    /**
     * Get Device type. Valid values: cvm (CVM), clb (public CLB), lb (BM CLB), nat (NAT server), channel (internet channel). 
     * @return BasicDeviceType Device type. Valid values: cvm (CVM), clb (public CLB), lb (BM CLB), nat (NAT server), channel (internet channel).
     */
    public String getBasicDeviceType() {
        return this.BasicDeviceType;
    }

    /**
     * Set Device type. Valid values: cvm (CVM), clb (public CLB), lb (BM CLB), nat (NAT server), channel (internet channel).
     * @param BasicDeviceType Device type. Valid values: cvm (CVM), clb (public CLB), lb (BM CLB), nat (NAT server), channel (internet channel).
     */
    public void setBasicDeviceType(String BasicDeviceType) {
        this.BasicDeviceType = BasicDeviceType;
    }

    /**
     * Get IPInstance Nat gateway, which is optional. (If the device type to be queried is a NAT server, this parameter is required, which can be obtained through the NAT resource query API) 
     * @return BasicIpInstance IPInstance Nat gateway, which is optional. (If the device type to be queried is a NAT server, this parameter is required, which can be obtained through the NAT resource query API)
     */
    public String getBasicIpInstance() {
        return this.BasicIpInstance;
    }

    /**
     * Set IPInstance Nat gateway, which is optional. (If the device type to be queried is a NAT server, this parameter is required, which can be obtained through the NAT resource query API)
     * @param BasicIpInstance IPInstance Nat gateway, which is optional. (If the device type to be queried is a NAT server, this parameter is required, which can be obtained through the NAT resource query API)
     */
    public void setBasicIpInstance(String BasicIpInstance) {
        this.BasicIpInstance = BasicIpInstance;
    }

    /**
     * Get ISP line, which is optional. (If the device type to be queried is a NAT server, this parameter should be 5) 
     * @return BasicIspCode ISP line, which is optional. (If the device type to be queried is a NAT server, this parameter should be 5)
     */
    public Long getBasicIspCode() {
        return this.BasicIspCode;
    }

    /**
     * Set ISP line, which is optional. (If the device type to be queried is a NAT server, this parameter should be 5)
     * @param BasicIspCode ISP line, which is optional. (If the device type to be queried is a NAT server, this parameter should be 5)
     */
    public void setBasicIspCode(Long BasicIspCode) {
        this.BasicIspCode = BasicIspCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BasicIp", this.BasicIp);
        this.setParamSimple(map, prefix + "BasicRegion", this.BasicRegion);
        this.setParamSimple(map, prefix + "BasicBizType", this.BasicBizType);
        this.setParamSimple(map, prefix + "BasicDeviceType", this.BasicDeviceType);
        this.setParamSimple(map, prefix + "BasicIpInstance", this.BasicIpInstance);
        this.setParamSimple(map, prefix + "BasicIspCode", this.BasicIspCode);

    }
}

