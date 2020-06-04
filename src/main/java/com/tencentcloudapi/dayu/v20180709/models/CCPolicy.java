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

public class CCPolicy extends AbstractModel{

    /**
    * Policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Matching mode. Valid values: [matching (matching mode), speedlimit (speed limiting mode)]
    */
    @SerializedName("Smode")
    @Expose
    private String Smode;

    /**
    * Policy ID
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

    /**
    * Number of requests allowed per minute
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * Executed policy mode. Valid values: [alg (verification code), drop (blocking)]
    */
    @SerializedName("ExeMode")
    @Expose
    private String ExeMode;

    /**
    * Specifies whether the policy is activated
    */
    @SerializedName("Switch")
    @Expose
    private Long Switch;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Rule list
    */
    @SerializedName("RuleList")
    @Expose
    private CCRule [] RuleList;

    /**
    * IP list. If this field is to be left empty, please pass in an empty instead of null;
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * CC protection type. Valid values: [http, https]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * ID of the forwarding rule corresponding to the HTTPS CC protection domain name
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * HTTPS CC protection domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get Policy name 
     * @return Name Policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy name
     * @param Name Policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Matching mode. Valid values: [matching (matching mode), speedlimit (speed limiting mode)] 
     * @return Smode Matching mode. Valid values: [matching (matching mode), speedlimit (speed limiting mode)]
     */
    public String getSmode() {
        return this.Smode;
    }

    /**
     * Set Matching mode. Valid values: [matching (matching mode), speedlimit (speed limiting mode)]
     * @param Smode Matching mode. Valid values: [matching (matching mode), speedlimit (speed limiting mode)]
     */
    public void setSmode(String Smode) {
        this.Smode = Smode;
    }

    /**
     * Get Policy ID 
     * @return SetId Policy ID
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * Set Policy ID
     * @param SetId Policy ID
     */
    public void setSetId(String SetId) {
        this.SetId = SetId;
    }

    /**
     * Get Number of requests allowed per minute 
     * @return Frequency Number of requests allowed per minute
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set Number of requests allowed per minute
     * @param Frequency Number of requests allowed per minute
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get Executed policy mode. Valid values: [alg (verification code), drop (blocking)] 
     * @return ExeMode Executed policy mode. Valid values: [alg (verification code), drop (blocking)]
     */
    public String getExeMode() {
        return this.ExeMode;
    }

    /**
     * Set Executed policy mode. Valid values: [alg (verification code), drop (blocking)]
     * @param ExeMode Executed policy mode. Valid values: [alg (verification code), drop (blocking)]
     */
    public void setExeMode(String ExeMode) {
        this.ExeMode = ExeMode;
    }

    /**
     * Get Specifies whether the policy is activated 
     * @return Switch Specifies whether the policy is activated
     */
    public Long getSwitch() {
        return this.Switch;
    }

    /**
     * Set Specifies whether the policy is activated
     * @param Switch Specifies whether the policy is activated
     */
    public void setSwitch(Long Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Rule list 
     * @return RuleList Rule list
     */
    public CCRule [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set Rule list
     * @param RuleList Rule list
     */
    public void setRuleList(CCRule [] RuleList) {
        this.RuleList = RuleList;
    }

    /**
     * Get IP list. If this field is to be left empty, please pass in an empty instead of null; 
     * @return IpList IP list. If this field is to be left empty, please pass in an empty instead of null;
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP list. If this field is to be left empty, please pass in an empty instead of null;
     * @param IpList IP list. If this field is to be left empty, please pass in an empty instead of null;
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get CC protection type. Valid values: [http, https] 
     * @return Protocol CC protection type. Valid values: [http, https]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set CC protection type. Valid values: [http, https]
     * @param Protocol CC protection type. Valid values: [http, https]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get ID of the forwarding rule corresponding to the HTTPS CC protection domain name 
     * @return RuleId ID of the forwarding rule corresponding to the HTTPS CC protection domain name
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set ID of the forwarding rule corresponding to the HTTPS CC protection domain name
     * @param RuleId ID of the forwarding rule corresponding to the HTTPS CC protection domain name
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get HTTPS CC protection domain name 
     * @return Domain HTTPS CC protection domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set HTTPS CC protection domain name
     * @param Domain HTTPS CC protection domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Smode", this.Smode);
        this.setParamSimple(map, prefix + "SetId", this.SetId);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "ExeMode", this.ExeMode);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

