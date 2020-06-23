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

public class SchedulingDomain extends AbstractModel{

    /**
    * Scheduling domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * List of BGP IPs
    */
    @SerializedName("BGPIpList")
    @Expose
    private String [] BGPIpList;

    /**
    * List of CTCC IPs
    */
    @SerializedName("CTCCIpList")
    @Expose
    private String [] CTCCIpList;

    /**
    * List of CUCC IPs
    */
    @SerializedName("CUCCIpList")
    @Expose
    private String [] CUCCIpList;

    /**
    * List of CMCC IPs
    */
    @SerializedName("CMCCIpList")
    @Expose
    private String [] CMCCIpList;

    /**
    * List of IPs outside Mainland China
    */
    @SerializedName("OverseaIpList")
    @Expose
    private String [] OverseaIpList;

    /**
    * Scheduling method. It only supports `priority` now.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * The creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Scheduling domain name 
     * @return Domain Scheduling domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Scheduling domain name
     * @param Domain Scheduling domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get List of BGP IPs 
     * @return BGPIpList List of BGP IPs
     */
    public String [] getBGPIpList() {
        return this.BGPIpList;
    }

    /**
     * Set List of BGP IPs
     * @param BGPIpList List of BGP IPs
     */
    public void setBGPIpList(String [] BGPIpList) {
        this.BGPIpList = BGPIpList;
    }

    /**
     * Get List of CTCC IPs 
     * @return CTCCIpList List of CTCC IPs
     */
    public String [] getCTCCIpList() {
        return this.CTCCIpList;
    }

    /**
     * Set List of CTCC IPs
     * @param CTCCIpList List of CTCC IPs
     */
    public void setCTCCIpList(String [] CTCCIpList) {
        this.CTCCIpList = CTCCIpList;
    }

    /**
     * Get List of CUCC IPs 
     * @return CUCCIpList List of CUCC IPs
     */
    public String [] getCUCCIpList() {
        return this.CUCCIpList;
    }

    /**
     * Set List of CUCC IPs
     * @param CUCCIpList List of CUCC IPs
     */
    public void setCUCCIpList(String [] CUCCIpList) {
        this.CUCCIpList = CUCCIpList;
    }

    /**
     * Get List of CMCC IPs 
     * @return CMCCIpList List of CMCC IPs
     */
    public String [] getCMCCIpList() {
        return this.CMCCIpList;
    }

    /**
     * Set List of CMCC IPs
     * @param CMCCIpList List of CMCC IPs
     */
    public void setCMCCIpList(String [] CMCCIpList) {
        this.CMCCIpList = CMCCIpList;
    }

    /**
     * Get List of IPs outside Mainland China 
     * @return OverseaIpList List of IPs outside Mainland China
     */
    public String [] getOverseaIpList() {
        return this.OverseaIpList;
    }

    /**
     * Set List of IPs outside Mainland China
     * @param OverseaIpList List of IPs outside Mainland China
     */
    public void setOverseaIpList(String [] OverseaIpList) {
        this.OverseaIpList = OverseaIpList;
    }

    /**
     * Get Scheduling method. It only supports `priority` now. 
     * @return Method Scheduling method. It only supports `priority` now.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Scheduling method. It only supports `priority` now.
     * @param Method Scheduling method. It only supports `priority` now.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get The creation time. 
     * @return CreateTime The creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
     * @param CreateTime The creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return TTL 
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 
     * @param TTL 
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "BGPIpList.", this.BGPIpList);
        this.setParamArraySimple(map, prefix + "CTCCIpList.", this.CTCCIpList);
        this.setParamArraySimple(map, prefix + "CUCCIpList.", this.CUCCIpList);
        this.setParamArraySimple(map, prefix + "CMCCIpList.", this.CMCCIpList);
        this.setParamArraySimple(map, prefix + "OverseaIpList.", this.OverseaIpList);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

