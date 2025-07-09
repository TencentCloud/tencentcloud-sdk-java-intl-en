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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardRule extends AbstractModel {

    /**
    * Private domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Forwarding rule type. DOWN: From cloud to off-cloud; UP: From off-cloud to cloud.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Update time
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Endpoint name.
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * Endpoint ID.
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
    * Forwarding address.
    */
    @SerializedName("ForwardAddress")
    @Expose
    private String [] ForwardAddress;

    /**
    * List of VPCs bound to the private domain.
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcInfo [] VpcSet;

    /**
    * ID of the bound private domain.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Tag
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get Private domain name. 
     * @return Domain Private domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Private domain name.
     * @param Domain Private domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding rule name. 
     * @return RuleName Forwarding rule name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Forwarding rule name.
     * @param RuleName Forwarding rule name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Forwarding rule type. DOWN: From cloud to off-cloud; UP: From off-cloud to cloud. 
     * @return RuleType Forwarding rule type. DOWN: From cloud to off-cloud; UP: From off-cloud to cloud.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Forwarding rule type. DOWN: From cloud to off-cloud; UP: From off-cloud to cloud.
     * @param RuleType Forwarding rule type. DOWN: From cloud to off-cloud; UP: From off-cloud to cloud.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Creation time 
     * @return CreatedAt Creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time
     * @param CreatedAt Creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Update time 
     * @return UpdatedAt Update time
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time
     * @param UpdatedAt Update time
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Endpoint name. 
     * @return EndPointName Endpoint name.
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set Endpoint name.
     * @param EndPointName Endpoint name.
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get Endpoint ID. 
     * @return EndPointId Endpoint ID.
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set Endpoint ID.
     * @param EndPointId Endpoint ID.
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get Forwarding address. 
     * @return ForwardAddress Forwarding address.
     */
    public String [] getForwardAddress() {
        return this.ForwardAddress;
    }

    /**
     * Set Forwarding address.
     * @param ForwardAddress Forwarding address.
     */
    public void setForwardAddress(String [] ForwardAddress) {
        this.ForwardAddress = ForwardAddress;
    }

    /**
     * Get List of VPCs bound to the private domain. 
     * @return VpcSet List of VPCs bound to the private domain.
     */
    public VpcInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set List of VPCs bound to the private domain.
     * @param VpcSet List of VPCs bound to the private domain.
     */
    public void setVpcSet(VpcInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    /**
     * Get ID of the bound private domain. 
     * @return ZoneId ID of the bound private domain.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the bound private domain.
     * @param ZoneId ID of the bound private domain.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Tag 
     * @return Tags Tag
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
     * @param Tags Tag
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public ForwardRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardRule(ForwardRule source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
        if (source.ForwardAddress != null) {
            this.ForwardAddress = new String[source.ForwardAddress.length];
            for (int i = 0; i < source.ForwardAddress.length; i++) {
                this.ForwardAddress[i] = new String(source.ForwardAddress[i]);
            }
        }
        if (source.VpcSet != null) {
            this.VpcSet = new VpcInfo[source.VpcSet.length];
            for (int i = 0; i < source.VpcSet.length; i++) {
                this.VpcSet[i] = new VpcInfo(source.VpcSet[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);
        this.setParamArraySimple(map, prefix + "ForwardAddress.", this.ForwardAddress);
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

