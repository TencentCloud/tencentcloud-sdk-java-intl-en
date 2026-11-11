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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Plan extends AbstractModel {

    /**
    * <p>Plan type. Valid values:</p><li>plan-trial: Trial Edition plan;</li><li>plan-personal: Personal Edition plan;</li><li>plan-basic: Basic Edition plan;</li><li>plan-standard: Standard Edition plan;</li><li>plan-enterprise-v2: Enterprise Edition plan;</li><li>plan-enterprise-model-a: Enterprise Edition Model A plan;</li><li>plan-enterprise: Legacy Enterprise Edition plan;</li><li>plan-makers-pro: Makers Pro Edition plan;</li><li>plan-makers-business: Makers Business Edition plan;</li><p>Valid values:</p><ul><li>plan-trial: Trial Edition plan</li><li>plan-personal: Personal Edition plan</li><li>plan-basic: Basic Edition plan</li><li>plan-standard: Standard Edition plan</li><li>plan-enterprise-v2: Enterprise Edition plan</li><li>plan-enterprise-model-a: Enterprise Edition Model A plan</li><li>plan-enterprise: Legacy Enterprise Edition plan</li><li>plan-makers-pro: Makers Pro Edition plan</li><li>plan-makers-business: Makers Business Edition plan</li></ul>
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * <p>Plan ID, in the format of edgeone-2y041pblwaxe.</p>
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * <p>Service region. Valid values:</p><li>mainland: Chinese mainland;</li><li>overseas: Global (excluding the Chinese mainland);</li><li>global: Global (including the Chinese mainland).</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Auto-renewal switch. Valid values:</p><li>true: Auto-renewal enabled;</li><li>false: Auto-renewal disabled.</li>
    */
    @SerializedName("AutoRenewal")
    @Expose
    private Boolean AutoRenewal;

    /**
    * <p>Plan status. Valid values:</p><li>normal: Normal;</li><li>expiring-soon: Expiring soon;</li><li>expired: Expired;</li><li>isolated: Isolated;</li><li>overdue-isolated: Isolated due to overdue payment.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Billing type. Valid values:</p><li>0: Postpaid;</li><li>1: Prepaid.</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Information of the sites bound to the plan, including site id, site name, and site status.</p>
    */
    @SerializedName("ZonesInfo")
    @Expose
    private ZoneInfo [] ZonesInfo;

    /**
    * <p>Quota of smart acceleration requests in the plan, in the unit of requests.</p>
    */
    @SerializedName("SmartRequestCapacity")
    @Expose
    private Long SmartRequestCapacity;

    /**
    * <p>VAU quota in the plan, in the unit of VAUs.</p>
    */
    @SerializedName("VAUCapacity")
    @Expose
    private Long VAUCapacity;

    /**
    * <p>Quota of content acceleration traffic in the plan, in the unit of bytes.</p>
    */
    @SerializedName("AccTrafficCapacity")
    @Expose
    private Long AccTrafficCapacity;

    /**
    * <p>Quota of client authentication traffic in the plan, in the unit of bytes.</p>
    */
    @SerializedName("ClientAuthTrafficCapacity")
    @Expose
    private Long ClientAuthTrafficCapacity;

    /**
    * <p>Quota of smart acceleration traffic in the plan, in the unit of bytes.</p>
    */
    @SerializedName("SmartTrafficCapacity")
    @Expose
    private Long SmartTrafficCapacity;

    /**
    * <p>Quota of DDoS protection traffic in the plan, in the unit of bytes.</p>
    */
    @SerializedName("DDoSTrafficCapacity")
    @Expose
    private Long DDoSTrafficCapacity;

    /**
    * <p>Quota of security traffic in the plan, in the unit of bytes.</p>
    */
    @SerializedName("SecTrafficCapacity")
    @Expose
    private Long SecTrafficCapacity;

    /**
    * <p>Quota of security requests in the plan, in the unit of requests.</p>
    */
    @SerializedName("SecRequestCapacity")
    @Expose
    private Long SecRequestCapacity;

    /**
    * <p>Quota of L4 acceleration traffic in the plan, in the unit of bytes.</p>
    */
    @SerializedName("L4TrafficCapacity")
    @Expose
    private Long L4TrafficCapacity;

    /**
    * <p>Quota of network optimization traffic for the Chinese mainland in the plan, in the unit of bytes.</p>
    */
    @SerializedName("CrossMLCTrafficCapacity")
    @Expose
    private Long CrossMLCTrafficCapacity;

    /**
    * <p>Whether the plan allows binding new sites. Valid values:</p><li>true: Allows binding new sites;</li><li>false: Does not allow binding new sites.</li>
    */
    @SerializedName("Bindable")
    @Expose
    private String Bindable;

    /**
    * <p>Time when the plan takes effect.</p>
    */
    @SerializedName("EnabledTime")
    @Expose
    private String EnabledTime;

    /**
    * <p>Expiration time of the plan.</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * <p>Features supported by the plan. Valid values: <li>ContentAcceleration: content acceleration;</li><li>SmartAcceleration: smart acceleration;</li><li>L4: L4 acceleration;</li><li>Waf: advanced Web protection;</li><li>QUIC: QUIC;</li><li>CrossMLC: network optimization for the Chinese mainland;</li><li>ProcessMedia: media processing;</li><li>L4DDoS: L4 DDoS protection.</li>Only one of the following L7DDoS specifications can appear: <li>L7DDoS.CM30G: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.CM60G: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.CM100G: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.Anycast300G: L7 DDoS protection - 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.AnycastUnlimited: L7 DDoS protection - unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM30G_Anycast300G: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM60G_Anycast300G: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM100G_Anycast300G: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM30G_AnycastUnlimited: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM60G_AnycastUnlimited: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM100G_AnycastUnlimited: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland.</li></p>
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
     * Get <p>Plan type. Valid values:</p><li>plan-trial: Trial Edition plan;</li><li>plan-personal: Personal Edition plan;</li><li>plan-basic: Basic Edition plan;</li><li>plan-standard: Standard Edition plan;</li><li>plan-enterprise-v2: Enterprise Edition plan;</li><li>plan-enterprise-model-a: Enterprise Edition Model A plan;</li><li>plan-enterprise: Legacy Enterprise Edition plan;</li><li>plan-makers-pro: Makers Pro Edition plan;</li><li>plan-makers-business: Makers Business Edition plan;</li><p>Valid values:</p><ul><li>plan-trial: Trial Edition plan</li><li>plan-personal: Personal Edition plan</li><li>plan-basic: Basic Edition plan</li><li>plan-standard: Standard Edition plan</li><li>plan-enterprise-v2: Enterprise Edition plan</li><li>plan-enterprise-model-a: Enterprise Edition Model A plan</li><li>plan-enterprise: Legacy Enterprise Edition plan</li><li>plan-makers-pro: Makers Pro Edition plan</li><li>plan-makers-business: Makers Business Edition plan</li></ul> 
     * @return PlanType <p>Plan type. Valid values:</p><li>plan-trial: Trial Edition plan;</li><li>plan-personal: Personal Edition plan;</li><li>plan-basic: Basic Edition plan;</li><li>plan-standard: Standard Edition plan;</li><li>plan-enterprise-v2: Enterprise Edition plan;</li><li>plan-enterprise-model-a: Enterprise Edition Model A plan;</li><li>plan-enterprise: Legacy Enterprise Edition plan;</li><li>plan-makers-pro: Makers Pro Edition plan;</li><li>plan-makers-business: Makers Business Edition plan;</li><p>Valid values:</p><ul><li>plan-trial: Trial Edition plan</li><li>plan-personal: Personal Edition plan</li><li>plan-basic: Basic Edition plan</li><li>plan-standard: Standard Edition plan</li><li>plan-enterprise-v2: Enterprise Edition plan</li><li>plan-enterprise-model-a: Enterprise Edition Model A plan</li><li>plan-enterprise: Legacy Enterprise Edition plan</li><li>plan-makers-pro: Makers Pro Edition plan</li><li>plan-makers-business: Makers Business Edition plan</li></ul>
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set <p>Plan type. Valid values:</p><li>plan-trial: Trial Edition plan;</li><li>plan-personal: Personal Edition plan;</li><li>plan-basic: Basic Edition plan;</li><li>plan-standard: Standard Edition plan;</li><li>plan-enterprise-v2: Enterprise Edition plan;</li><li>plan-enterprise-model-a: Enterprise Edition Model A plan;</li><li>plan-enterprise: Legacy Enterprise Edition plan;</li><li>plan-makers-pro: Makers Pro Edition plan;</li><li>plan-makers-business: Makers Business Edition plan;</li><p>Valid values:</p><ul><li>plan-trial: Trial Edition plan</li><li>plan-personal: Personal Edition plan</li><li>plan-basic: Basic Edition plan</li><li>plan-standard: Standard Edition plan</li><li>plan-enterprise-v2: Enterprise Edition plan</li><li>plan-enterprise-model-a: Enterprise Edition Model A plan</li><li>plan-enterprise: Legacy Enterprise Edition plan</li><li>plan-makers-pro: Makers Pro Edition plan</li><li>plan-makers-business: Makers Business Edition plan</li></ul>
     * @param PlanType <p>Plan type. Valid values:</p><li>plan-trial: Trial Edition plan;</li><li>plan-personal: Personal Edition plan;</li><li>plan-basic: Basic Edition plan;</li><li>plan-standard: Standard Edition plan;</li><li>plan-enterprise-v2: Enterprise Edition plan;</li><li>plan-enterprise-model-a: Enterprise Edition Model A plan;</li><li>plan-enterprise: Legacy Enterprise Edition plan;</li><li>plan-makers-pro: Makers Pro Edition plan;</li><li>plan-makers-business: Makers Business Edition plan;</li><p>Valid values:</p><ul><li>plan-trial: Trial Edition plan</li><li>plan-personal: Personal Edition plan</li><li>plan-basic: Basic Edition plan</li><li>plan-standard: Standard Edition plan</li><li>plan-enterprise-v2: Enterprise Edition plan</li><li>plan-enterprise-model-a: Enterprise Edition Model A plan</li><li>plan-enterprise: Legacy Enterprise Edition plan</li><li>plan-makers-pro: Makers Pro Edition plan</li><li>plan-makers-business: Makers Business Edition plan</li></ul>
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get <p>Plan ID, in the format of edgeone-2y041pblwaxe.</p> 
     * @return PlanId <p>Plan ID, in the format of edgeone-2y041pblwaxe.</p>
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set <p>Plan ID, in the format of edgeone-2y041pblwaxe.</p>
     * @param PlanId <p>Plan ID, in the format of edgeone-2y041pblwaxe.</p>
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get <p>Service region. Valid values:</p><li>mainland: Chinese mainland;</li><li>overseas: Global (excluding the Chinese mainland);</li><li>global: Global (including the Chinese mainland).</li> 
     * @return Area <p>Service region. Valid values:</p><li>mainland: Chinese mainland;</li><li>overseas: Global (excluding the Chinese mainland);</li><li>global: Global (including the Chinese mainland).</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Service region. Valid values:</p><li>mainland: Chinese mainland;</li><li>overseas: Global (excluding the Chinese mainland);</li><li>global: Global (including the Chinese mainland).</li>
     * @param Area <p>Service region. Valid values:</p><li>mainland: Chinese mainland;</li><li>overseas: Global (excluding the Chinese mainland);</li><li>global: Global (including the Chinese mainland).</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Auto-renewal switch. Valid values:</p><li>true: Auto-renewal enabled;</li><li>false: Auto-renewal disabled.</li> 
     * @return AutoRenewal <p>Auto-renewal switch. Valid values:</p><li>true: Auto-renewal enabled;</li><li>false: Auto-renewal disabled.</li>
     */
    public Boolean getAutoRenewal() {
        return this.AutoRenewal;
    }

    /**
     * Set <p>Auto-renewal switch. Valid values:</p><li>true: Auto-renewal enabled;</li><li>false: Auto-renewal disabled.</li>
     * @param AutoRenewal <p>Auto-renewal switch. Valid values:</p><li>true: Auto-renewal enabled;</li><li>false: Auto-renewal disabled.</li>
     */
    public void setAutoRenewal(Boolean AutoRenewal) {
        this.AutoRenewal = AutoRenewal;
    }

    /**
     * Get <p>Plan status. Valid values:</p><li>normal: Normal;</li><li>expiring-soon: Expiring soon;</li><li>expired: Expired;</li><li>isolated: Isolated;</li><li>overdue-isolated: Isolated due to overdue payment.</li> 
     * @return Status <p>Plan status. Valid values:</p><li>normal: Normal;</li><li>expiring-soon: Expiring soon;</li><li>expired: Expired;</li><li>isolated: Isolated;</li><li>overdue-isolated: Isolated due to overdue payment.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Plan status. Valid values:</p><li>normal: Normal;</li><li>expiring-soon: Expiring soon;</li><li>expired: Expired;</li><li>isolated: Isolated;</li><li>overdue-isolated: Isolated due to overdue payment.</li>
     * @param Status <p>Plan status. Valid values:</p><li>normal: Normal;</li><li>expiring-soon: Expiring soon;</li><li>expired: Expired;</li><li>isolated: Isolated;</li><li>overdue-isolated: Isolated due to overdue payment.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Billing type. Valid values:</p><li>0: Postpaid;</li><li>1: Prepaid.</li> 
     * @return PayMode <p>Billing type. Valid values:</p><li>0: Postpaid;</li><li>1: Prepaid.</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Billing type. Valid values:</p><li>0: Postpaid;</li><li>1: Prepaid.</li>
     * @param PayMode <p>Billing type. Valid values:</p><li>0: Postpaid;</li><li>1: Prepaid.</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Information of the sites bound to the plan, including site id, site name, and site status.</p> 
     * @return ZonesInfo <p>Information of the sites bound to the plan, including site id, site name, and site status.</p>
     */
    public ZoneInfo [] getZonesInfo() {
        return this.ZonesInfo;
    }

    /**
     * Set <p>Information of the sites bound to the plan, including site id, site name, and site status.</p>
     * @param ZonesInfo <p>Information of the sites bound to the plan, including site id, site name, and site status.</p>
     */
    public void setZonesInfo(ZoneInfo [] ZonesInfo) {
        this.ZonesInfo = ZonesInfo;
    }

    /**
     * Get <p>Quota of smart acceleration requests in the plan, in the unit of requests.</p> 
     * @return SmartRequestCapacity <p>Quota of smart acceleration requests in the plan, in the unit of requests.</p>
     */
    public Long getSmartRequestCapacity() {
        return this.SmartRequestCapacity;
    }

    /**
     * Set <p>Quota of smart acceleration requests in the plan, in the unit of requests.</p>
     * @param SmartRequestCapacity <p>Quota of smart acceleration requests in the plan, in the unit of requests.</p>
     */
    public void setSmartRequestCapacity(Long SmartRequestCapacity) {
        this.SmartRequestCapacity = SmartRequestCapacity;
    }

    /**
     * Get <p>VAU quota in the plan, in the unit of VAUs.</p> 
     * @return VAUCapacity <p>VAU quota in the plan, in the unit of VAUs.</p>
     */
    public Long getVAUCapacity() {
        return this.VAUCapacity;
    }

    /**
     * Set <p>VAU quota in the plan, in the unit of VAUs.</p>
     * @param VAUCapacity <p>VAU quota in the plan, in the unit of VAUs.</p>
     */
    public void setVAUCapacity(Long VAUCapacity) {
        this.VAUCapacity = VAUCapacity;
    }

    /**
     * Get <p>Quota of content acceleration traffic in the plan, in the unit of bytes.</p> 
     * @return AccTrafficCapacity <p>Quota of content acceleration traffic in the plan, in the unit of bytes.</p>
     */
    public Long getAccTrafficCapacity() {
        return this.AccTrafficCapacity;
    }

    /**
     * Set <p>Quota of content acceleration traffic in the plan, in the unit of bytes.</p>
     * @param AccTrafficCapacity <p>Quota of content acceleration traffic in the plan, in the unit of bytes.</p>
     */
    public void setAccTrafficCapacity(Long AccTrafficCapacity) {
        this.AccTrafficCapacity = AccTrafficCapacity;
    }

    /**
     * Get <p>Quota of client authentication traffic in the plan, in the unit of bytes.</p> 
     * @return ClientAuthTrafficCapacity <p>Quota of client authentication traffic in the plan, in the unit of bytes.</p>
     */
    public Long getClientAuthTrafficCapacity() {
        return this.ClientAuthTrafficCapacity;
    }

    /**
     * Set <p>Quota of client authentication traffic in the plan, in the unit of bytes.</p>
     * @param ClientAuthTrafficCapacity <p>Quota of client authentication traffic in the plan, in the unit of bytes.</p>
     */
    public void setClientAuthTrafficCapacity(Long ClientAuthTrafficCapacity) {
        this.ClientAuthTrafficCapacity = ClientAuthTrafficCapacity;
    }

    /**
     * Get <p>Quota of smart acceleration traffic in the plan, in the unit of bytes.</p> 
     * @return SmartTrafficCapacity <p>Quota of smart acceleration traffic in the plan, in the unit of bytes.</p>
     */
    public Long getSmartTrafficCapacity() {
        return this.SmartTrafficCapacity;
    }

    /**
     * Set <p>Quota of smart acceleration traffic in the plan, in the unit of bytes.</p>
     * @param SmartTrafficCapacity <p>Quota of smart acceleration traffic in the plan, in the unit of bytes.</p>
     */
    public void setSmartTrafficCapacity(Long SmartTrafficCapacity) {
        this.SmartTrafficCapacity = SmartTrafficCapacity;
    }

    /**
     * Get <p>Quota of DDoS protection traffic in the plan, in the unit of bytes.</p> 
     * @return DDoSTrafficCapacity <p>Quota of DDoS protection traffic in the plan, in the unit of bytes.</p>
     */
    public Long getDDoSTrafficCapacity() {
        return this.DDoSTrafficCapacity;
    }

    /**
     * Set <p>Quota of DDoS protection traffic in the plan, in the unit of bytes.</p>
     * @param DDoSTrafficCapacity <p>Quota of DDoS protection traffic in the plan, in the unit of bytes.</p>
     */
    public void setDDoSTrafficCapacity(Long DDoSTrafficCapacity) {
        this.DDoSTrafficCapacity = DDoSTrafficCapacity;
    }

    /**
     * Get <p>Quota of security traffic in the plan, in the unit of bytes.</p> 
     * @return SecTrafficCapacity <p>Quota of security traffic in the plan, in the unit of bytes.</p>
     */
    public Long getSecTrafficCapacity() {
        return this.SecTrafficCapacity;
    }

    /**
     * Set <p>Quota of security traffic in the plan, in the unit of bytes.</p>
     * @param SecTrafficCapacity <p>Quota of security traffic in the plan, in the unit of bytes.</p>
     */
    public void setSecTrafficCapacity(Long SecTrafficCapacity) {
        this.SecTrafficCapacity = SecTrafficCapacity;
    }

    /**
     * Get <p>Quota of security requests in the plan, in the unit of requests.</p> 
     * @return SecRequestCapacity <p>Quota of security requests in the plan, in the unit of requests.</p>
     */
    public Long getSecRequestCapacity() {
        return this.SecRequestCapacity;
    }

    /**
     * Set <p>Quota of security requests in the plan, in the unit of requests.</p>
     * @param SecRequestCapacity <p>Quota of security requests in the plan, in the unit of requests.</p>
     */
    public void setSecRequestCapacity(Long SecRequestCapacity) {
        this.SecRequestCapacity = SecRequestCapacity;
    }

    /**
     * Get <p>Quota of L4 acceleration traffic in the plan, in the unit of bytes.</p> 
     * @return L4TrafficCapacity <p>Quota of L4 acceleration traffic in the plan, in the unit of bytes.</p>
     */
    public Long getL4TrafficCapacity() {
        return this.L4TrafficCapacity;
    }

    /**
     * Set <p>Quota of L4 acceleration traffic in the plan, in the unit of bytes.</p>
     * @param L4TrafficCapacity <p>Quota of L4 acceleration traffic in the plan, in the unit of bytes.</p>
     */
    public void setL4TrafficCapacity(Long L4TrafficCapacity) {
        this.L4TrafficCapacity = L4TrafficCapacity;
    }

    /**
     * Get <p>Quota of network optimization traffic for the Chinese mainland in the plan, in the unit of bytes.</p> 
     * @return CrossMLCTrafficCapacity <p>Quota of network optimization traffic for the Chinese mainland in the plan, in the unit of bytes.</p>
     */
    public Long getCrossMLCTrafficCapacity() {
        return this.CrossMLCTrafficCapacity;
    }

    /**
     * Set <p>Quota of network optimization traffic for the Chinese mainland in the plan, in the unit of bytes.</p>
     * @param CrossMLCTrafficCapacity <p>Quota of network optimization traffic for the Chinese mainland in the plan, in the unit of bytes.</p>
     */
    public void setCrossMLCTrafficCapacity(Long CrossMLCTrafficCapacity) {
        this.CrossMLCTrafficCapacity = CrossMLCTrafficCapacity;
    }

    /**
     * Get <p>Whether the plan allows binding new sites. Valid values:</p><li>true: Allows binding new sites;</li><li>false: Does not allow binding new sites.</li> 
     * @return Bindable <p>Whether the plan allows binding new sites. Valid values:</p><li>true: Allows binding new sites;</li><li>false: Does not allow binding new sites.</li>
     */
    public String getBindable() {
        return this.Bindable;
    }

    /**
     * Set <p>Whether the plan allows binding new sites. Valid values:</p><li>true: Allows binding new sites;</li><li>false: Does not allow binding new sites.</li>
     * @param Bindable <p>Whether the plan allows binding new sites. Valid values:</p><li>true: Allows binding new sites;</li><li>false: Does not allow binding new sites.</li>
     */
    public void setBindable(String Bindable) {
        this.Bindable = Bindable;
    }

    /**
     * Get <p>Time when the plan takes effect.</p> 
     * @return EnabledTime <p>Time when the plan takes effect.</p>
     */
    public String getEnabledTime() {
        return this.EnabledTime;
    }

    /**
     * Set <p>Time when the plan takes effect.</p>
     * @param EnabledTime <p>Time when the plan takes effect.</p>
     */
    public void setEnabledTime(String EnabledTime) {
        this.EnabledTime = EnabledTime;
    }

    /**
     * Get <p>Expiration time of the plan.</p> 
     * @return ExpiredTime <p>Expiration time of the plan.</p>
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>Expiration time of the plan.</p>
     * @param ExpiredTime <p>Expiration time of the plan.</p>
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>Features supported by the plan. Valid values: <li>ContentAcceleration: content acceleration;</li><li>SmartAcceleration: smart acceleration;</li><li>L4: L4 acceleration;</li><li>Waf: advanced Web protection;</li><li>QUIC: QUIC;</li><li>CrossMLC: network optimization for the Chinese mainland;</li><li>ProcessMedia: media processing;</li><li>L4DDoS: L4 DDoS protection.</li>Only one of the following L7DDoS specifications can appear: <li>L7DDoS.CM30G: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.CM60G: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.CM100G: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.Anycast300G: L7 DDoS protection - 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.AnycastUnlimited: L7 DDoS protection - unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM30G_Anycast300G: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM60G_Anycast300G: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM100G_Anycast300G: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM30G_AnycastUnlimited: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM60G_AnycastUnlimited: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM100G_AnycastUnlimited: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland.</li></p> 
     * @return Features <p>Features supported by the plan. Valid values: <li>ContentAcceleration: content acceleration;</li><li>SmartAcceleration: smart acceleration;</li><li>L4: L4 acceleration;</li><li>Waf: advanced Web protection;</li><li>QUIC: QUIC;</li><li>CrossMLC: network optimization for the Chinese mainland;</li><li>ProcessMedia: media processing;</li><li>L4DDoS: L4 DDoS protection.</li>Only one of the following L7DDoS specifications can appear: <li>L7DDoS.CM30G: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.CM60G: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.CM100G: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.Anycast300G: L7 DDoS protection - 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.AnycastUnlimited: L7 DDoS protection - unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM30G_Anycast300G: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM60G_Anycast300G: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM100G_Anycast300G: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM30G_AnycastUnlimited: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM60G_AnycastUnlimited: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM100G_AnycastUnlimited: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland.</li></p>
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set <p>Features supported by the plan. Valid values: <li>ContentAcceleration: content acceleration;</li><li>SmartAcceleration: smart acceleration;</li><li>L4: L4 acceleration;</li><li>Waf: advanced Web protection;</li><li>QUIC: QUIC;</li><li>CrossMLC: network optimization for the Chinese mainland;</li><li>ProcessMedia: media processing;</li><li>L4DDoS: L4 DDoS protection.</li>Only one of the following L7DDoS specifications can appear: <li>L7DDoS.CM30G: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.CM60G: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.CM100G: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.Anycast300G: L7 DDoS protection - 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.AnycastUnlimited: L7 DDoS protection - unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM30G_Anycast300G: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM60G_Anycast300G: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM100G_Anycast300G: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM30G_AnycastUnlimited: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM60G_AnycastUnlimited: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM100G_AnycastUnlimited: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland.</li></p>
     * @param Features <p>Features supported by the plan. Valid values: <li>ContentAcceleration: content acceleration;</li><li>SmartAcceleration: smart acceleration;</li><li>L4: L4 acceleration;</li><li>Waf: advanced Web protection;</li><li>QUIC: QUIC;</li><li>CrossMLC: network optimization for the Chinese mainland;</li><li>ProcessMedia: media processing;</li><li>L4DDoS: L4 DDoS protection.</li>Only one of the following L7DDoS specifications can appear: <li>L7DDoS.CM30G: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.CM60G: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.CM100G: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland;</li><li>L7DDoS.Anycast300G: L7 DDoS protection - 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.AnycastUnlimited: L7 DDoS protection - unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM30G_Anycast300G: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM60G_Anycast300G: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM100G_Anycast300G: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland and 300 Gbps Anycast guaranteed bandwidth outside the Chinese mainland;</li><li>L7DDoS.CM30G_AnycastUnlimited: L7 DDoS protection - 30 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM60G_AnycastUnlimited: L7 DDoS protection - 60 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland;</li><li>L7DDoS.CM100G_AnycastUnlimited: L7 DDoS protection - 100 Gbps guaranteed bandwidth in the Chinese mainland and unlimited Anycast full protection outside the Chinese mainland.</li></p>
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    public Plan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Plan(Plan source) {
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.AutoRenewal != null) {
            this.AutoRenewal = new Boolean(source.AutoRenewal);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ZonesInfo != null) {
            this.ZonesInfo = new ZoneInfo[source.ZonesInfo.length];
            for (int i = 0; i < source.ZonesInfo.length; i++) {
                this.ZonesInfo[i] = new ZoneInfo(source.ZonesInfo[i]);
            }
        }
        if (source.SmartRequestCapacity != null) {
            this.SmartRequestCapacity = new Long(source.SmartRequestCapacity);
        }
        if (source.VAUCapacity != null) {
            this.VAUCapacity = new Long(source.VAUCapacity);
        }
        if (source.AccTrafficCapacity != null) {
            this.AccTrafficCapacity = new Long(source.AccTrafficCapacity);
        }
        if (source.ClientAuthTrafficCapacity != null) {
            this.ClientAuthTrafficCapacity = new Long(source.ClientAuthTrafficCapacity);
        }
        if (source.SmartTrafficCapacity != null) {
            this.SmartTrafficCapacity = new Long(source.SmartTrafficCapacity);
        }
        if (source.DDoSTrafficCapacity != null) {
            this.DDoSTrafficCapacity = new Long(source.DDoSTrafficCapacity);
        }
        if (source.SecTrafficCapacity != null) {
            this.SecTrafficCapacity = new Long(source.SecTrafficCapacity);
        }
        if (source.SecRequestCapacity != null) {
            this.SecRequestCapacity = new Long(source.SecRequestCapacity);
        }
        if (source.L4TrafficCapacity != null) {
            this.L4TrafficCapacity = new Long(source.L4TrafficCapacity);
        }
        if (source.CrossMLCTrafficCapacity != null) {
            this.CrossMLCTrafficCapacity = new Long(source.CrossMLCTrafficCapacity);
        }
        if (source.Bindable != null) {
            this.Bindable = new String(source.Bindable);
        }
        if (source.EnabledTime != null) {
            this.EnabledTime = new String(source.EnabledTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.Features != null) {
            this.Features = new String[source.Features.length];
            for (int i = 0; i < source.Features.length; i++) {
                this.Features[i] = new String(source.Features[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "AutoRenewal", this.AutoRenewal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "ZonesInfo.", this.ZonesInfo);
        this.setParamSimple(map, prefix + "SmartRequestCapacity", this.SmartRequestCapacity);
        this.setParamSimple(map, prefix + "VAUCapacity", this.VAUCapacity);
        this.setParamSimple(map, prefix + "AccTrafficCapacity", this.AccTrafficCapacity);
        this.setParamSimple(map, prefix + "ClientAuthTrafficCapacity", this.ClientAuthTrafficCapacity);
        this.setParamSimple(map, prefix + "SmartTrafficCapacity", this.SmartTrafficCapacity);
        this.setParamSimple(map, prefix + "DDoSTrafficCapacity", this.DDoSTrafficCapacity);
        this.setParamSimple(map, prefix + "SecTrafficCapacity", this.SecTrafficCapacity);
        this.setParamSimple(map, prefix + "SecRequestCapacity", this.SecRequestCapacity);
        this.setParamSimple(map, prefix + "L4TrafficCapacity", this.L4TrafficCapacity);
        this.setParamSimple(map, prefix + "CrossMLCTrafficCapacity", this.CrossMLCTrafficCapacity);
        this.setParamSimple(map, prefix + "Bindable", this.Bindable);
        this.setParamSimple(map, prefix + "EnabledTime", this.EnabledTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);

    }
}

