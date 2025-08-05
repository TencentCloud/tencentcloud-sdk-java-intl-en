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
    * Package type. valid values:.
<Li>`Plan-Trial`: trial plan</li>.
<Li>`Plan-Personal`: personal plan</li>.
<Li>`Plan-Basic`: basic plan</li>.
<Li>`Plan-Standard`: standard edition plan</li>.
<li>plan-enterprise-v2: enterprise plan;</li>.
<li>plan-enterprise-model-a: enterprise edition model a package.</li>.
<Li>Plan-Enterprise: legacy enterprise plan.</li>.
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * Package ID. such as edgeone-2y041pblwaxe.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Service area. valid values:.
<Li>`Mainland`: chinese mainland</li>.
<li>`overseas`: global (chinese mainland not included)</li>.
<Li>`Global`: global (chinese mainland included)</li>.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Auto-Renew switch. valid values:.
<li>true: automatic renewal is enabled.</li>.
<li>false: automatic renewal is not enabled.</li>.
    */
    @SerializedName("AutoRenewal")
    @Expose
    private Boolean AutoRenewal;

    /**
    * Package status. valid values:.
<Li>Normal: indicates the normal status.</li>.
<li>`expiring-soon`: will expire soon;</li>.
<li>`expired`: expiration status;</li>.
<Li>`Isolated`: isolated state</li>.
<li>`overdue-isolated`: arrears isolated state.</li>.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Payment type. valid values:.
<Li>0: postpaid;</li>.
<Li>1: prepaid.</li>.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Describes the site information bound to the package, including the site id, site name, and site status.
    */
    @SerializedName("ZonesInfo")
    @Expose
    private ZoneInfo [] ZonesInfo;

    /**
    * Smart acceleration request quantity in the package, unit: times.
    */
    @SerializedName("SmartRequestCapacity")
    @Expose
    private Long SmartRequestCapacity;

    /**
    * Specifies the VAU specification in the package. measurement unit: unit.
    */
    @SerializedName("VAUCapacity")
    @Expose
    private Long VAUCapacity;

    /**
    * Specifies the content acceleration traffic specification in the package, measurement unit: byte.
    */
    @SerializedName("AccTrafficCapacity")
    @Expose
    private Long AccTrafficCapacity;

    /**
    * Specifies the smart acceleration traffic specification in the package. measurement unit: byte.
    */
    @SerializedName("SmartTrafficCapacity")
    @Expose
    private Long SmartTrafficCapacity;

    /**
    * Specifies the DDoS protection traffic specification in the package, measurement unit: byte.
    */
    @SerializedName("DDoSTrafficCapacity")
    @Expose
    private Long DDoSTrafficCapacity;

    /**
    * Security traffic specification in the package. measurement unit: byte.
    */
    @SerializedName("SecTrafficCapacity")
    @Expose
    private Long SecTrafficCapacity;

    /**
    * Security requests in the package, unit: times.
    */
    @SerializedName("SecRequestCapacity")
    @Expose
    private Long SecRequestCapacity;

    /**
    * Specifies the layer 4 acceleration traffic specification in the package, measurement unit: byte.
    */
    @SerializedName("L4TrafficCapacity")
    @Expose
    private Long L4TrafficCapacity;

    /**
    * Specifies the network optimization traffic specification in the package for the chinese mainland, measurement unit: byte.
    */
    @SerializedName("CrossMLCTrafficCapacity")
    @Expose
    private Long CrossMLCTrafficCapacity;

    /**
    * Specifies whether the package allows binding to new sites. valid values:.
<li>true: allows binding a new site.</li>.
<li>`false`: cannot bind new sites.</li>.
    */
    @SerializedName("Bindable")
    @Expose
    private String Bindable;

    /**
    * Package activation time.
    */
    @SerializedName("EnabledTime")
    @Expose
    private String EnabledTime;

    /**
    * Plan expiration time.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Supported features of the package include: <li>ContentAcceleration: content acceleration feature;</li> <li>SmartAcceleration: intelligent acceleration feature;</li> <li>L4: L4 acceleration feature;</li> <li>Waf: advanced Web protection;</li> <li>QUIC: QUIC feature;</li> <li>CrossMLC: network optimization in the chinese mainland;</li> <li>ProcessMedia: media processing feature;</li> <li>L4DDoS: L4 DDoS protection feature;</li> L7DDoS feature will only appear in one of the following specifications: <li>L7DDoS.CM30G; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.CM60G; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.CM100G; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.Anycast300G; layer-7 DDoS protection feature - 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.AnycastUnlimited; layer-7 DDoS protection feature - unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM30G_Anycast300G; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM60G_Anycast300G; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM100G_Anycast300G; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM30G_AnycastUnlimited; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM60G_AnycastUnlimited; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM100G_AnycastUnlimited; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li>.
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
     * Get Package type. valid values:.
<Li>`Plan-Trial`: trial plan</li>.
<Li>`Plan-Personal`: personal plan</li>.
<Li>`Plan-Basic`: basic plan</li>.
<Li>`Plan-Standard`: standard edition plan</li>.
<li>plan-enterprise-v2: enterprise plan;</li>.
<li>plan-enterprise-model-a: enterprise edition model a package.</li>.
<Li>Plan-Enterprise: legacy enterprise plan.</li>. 
     * @return PlanType Package type. valid values:.
<Li>`Plan-Trial`: trial plan</li>.
<Li>`Plan-Personal`: personal plan</li>.
<Li>`Plan-Basic`: basic plan</li>.
<Li>`Plan-Standard`: standard edition plan</li>.
<li>plan-enterprise-v2: enterprise plan;</li>.
<li>plan-enterprise-model-a: enterprise edition model a package.</li>.
<Li>Plan-Enterprise: legacy enterprise plan.</li>.
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set Package type. valid values:.
<Li>`Plan-Trial`: trial plan</li>.
<Li>`Plan-Personal`: personal plan</li>.
<Li>`Plan-Basic`: basic plan</li>.
<Li>`Plan-Standard`: standard edition plan</li>.
<li>plan-enterprise-v2: enterprise plan;</li>.
<li>plan-enterprise-model-a: enterprise edition model a package.</li>.
<Li>Plan-Enterprise: legacy enterprise plan.</li>.
     * @param PlanType Package type. valid values:.
<Li>`Plan-Trial`: trial plan</li>.
<Li>`Plan-Personal`: personal plan</li>.
<Li>`Plan-Basic`: basic plan</li>.
<Li>`Plan-Standard`: standard edition plan</li>.
<li>plan-enterprise-v2: enterprise plan;</li>.
<li>plan-enterprise-model-a: enterprise edition model a package.</li>.
<Li>Plan-Enterprise: legacy enterprise plan.</li>.
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get Package ID. such as edgeone-2y041pblwaxe. 
     * @return PlanId Package ID. such as edgeone-2y041pblwaxe.
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Package ID. such as edgeone-2y041pblwaxe.
     * @param PlanId Package ID. such as edgeone-2y041pblwaxe.
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Service area. valid values:.
<Li>`Mainland`: chinese mainland</li>.
<li>`overseas`: global (chinese mainland not included)</li>.
<Li>`Global`: global (chinese mainland included)</li>. 
     * @return Area Service area. valid values:.
<Li>`Mainland`: chinese mainland</li>.
<li>`overseas`: global (chinese mainland not included)</li>.
<Li>`Global`: global (chinese mainland included)</li>.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Service area. valid values:.
<Li>`Mainland`: chinese mainland</li>.
<li>`overseas`: global (chinese mainland not included)</li>.
<Li>`Global`: global (chinese mainland included)</li>.
     * @param Area Service area. valid values:.
<Li>`Mainland`: chinese mainland</li>.
<li>`overseas`: global (chinese mainland not included)</li>.
<Li>`Global`: global (chinese mainland included)</li>.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Auto-Renew switch. valid values:.
<li>true: automatic renewal is enabled.</li>.
<li>false: automatic renewal is not enabled.</li>. 
     * @return AutoRenewal Auto-Renew switch. valid values:.
<li>true: automatic renewal is enabled.</li>.
<li>false: automatic renewal is not enabled.</li>.
     */
    public Boolean getAutoRenewal() {
        return this.AutoRenewal;
    }

    /**
     * Set Auto-Renew switch. valid values:.
<li>true: automatic renewal is enabled.</li>.
<li>false: automatic renewal is not enabled.</li>.
     * @param AutoRenewal Auto-Renew switch. valid values:.
<li>true: automatic renewal is enabled.</li>.
<li>false: automatic renewal is not enabled.</li>.
     */
    public void setAutoRenewal(Boolean AutoRenewal) {
        this.AutoRenewal = AutoRenewal;
    }

    /**
     * Get Package status. valid values:.
<Li>Normal: indicates the normal status.</li>.
<li>`expiring-soon`: will expire soon;</li>.
<li>`expired`: expiration status;</li>.
<Li>`Isolated`: isolated state</li>.
<li>`overdue-isolated`: arrears isolated state.</li>. 
     * @return Status Package status. valid values:.
<Li>Normal: indicates the normal status.</li>.
<li>`expiring-soon`: will expire soon;</li>.
<li>`expired`: expiration status;</li>.
<Li>`Isolated`: isolated state</li>.
<li>`overdue-isolated`: arrears isolated state.</li>.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Package status. valid values:.
<Li>Normal: indicates the normal status.</li>.
<li>`expiring-soon`: will expire soon;</li>.
<li>`expired`: expiration status;</li>.
<Li>`Isolated`: isolated state</li>.
<li>`overdue-isolated`: arrears isolated state.</li>.
     * @param Status Package status. valid values:.
<Li>Normal: indicates the normal status.</li>.
<li>`expiring-soon`: will expire soon;</li>.
<li>`expired`: expiration status;</li>.
<Li>`Isolated`: isolated state</li>.
<li>`overdue-isolated`: arrears isolated state.</li>.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Payment type. valid values:.
<Li>0: postpaid;</li>.
<Li>1: prepaid.</li>. 
     * @return PayMode Payment type. valid values:.
<Li>0: postpaid;</li>.
<Li>1: prepaid.</li>.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment type. valid values:.
<Li>0: postpaid;</li>.
<Li>1: prepaid.</li>.
     * @param PayMode Payment type. valid values:.
<Li>0: postpaid;</li>.
<Li>1: prepaid.</li>.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Describes the site information bound to the package, including the site id, site name, and site status. 
     * @return ZonesInfo Describes the site information bound to the package, including the site id, site name, and site status.
     */
    public ZoneInfo [] getZonesInfo() {
        return this.ZonesInfo;
    }

    /**
     * Set Describes the site information bound to the package, including the site id, site name, and site status.
     * @param ZonesInfo Describes the site information bound to the package, including the site id, site name, and site status.
     */
    public void setZonesInfo(ZoneInfo [] ZonesInfo) {
        this.ZonesInfo = ZonesInfo;
    }

    /**
     * Get Smart acceleration request quantity in the package, unit: times. 
     * @return SmartRequestCapacity Smart acceleration request quantity in the package, unit: times.
     */
    public Long getSmartRequestCapacity() {
        return this.SmartRequestCapacity;
    }

    /**
     * Set Smart acceleration request quantity in the package, unit: times.
     * @param SmartRequestCapacity Smart acceleration request quantity in the package, unit: times.
     */
    public void setSmartRequestCapacity(Long SmartRequestCapacity) {
        this.SmartRequestCapacity = SmartRequestCapacity;
    }

    /**
     * Get Specifies the VAU specification in the package. measurement unit: unit. 
     * @return VAUCapacity Specifies the VAU specification in the package. measurement unit: unit.
     */
    public Long getVAUCapacity() {
        return this.VAUCapacity;
    }

    /**
     * Set Specifies the VAU specification in the package. measurement unit: unit.
     * @param VAUCapacity Specifies the VAU specification in the package. measurement unit: unit.
     */
    public void setVAUCapacity(Long VAUCapacity) {
        this.VAUCapacity = VAUCapacity;
    }

    /**
     * Get Specifies the content acceleration traffic specification in the package, measurement unit: byte. 
     * @return AccTrafficCapacity Specifies the content acceleration traffic specification in the package, measurement unit: byte.
     */
    public Long getAccTrafficCapacity() {
        return this.AccTrafficCapacity;
    }

    /**
     * Set Specifies the content acceleration traffic specification in the package, measurement unit: byte.
     * @param AccTrafficCapacity Specifies the content acceleration traffic specification in the package, measurement unit: byte.
     */
    public void setAccTrafficCapacity(Long AccTrafficCapacity) {
        this.AccTrafficCapacity = AccTrafficCapacity;
    }

    /**
     * Get Specifies the smart acceleration traffic specification in the package. measurement unit: byte. 
     * @return SmartTrafficCapacity Specifies the smart acceleration traffic specification in the package. measurement unit: byte.
     */
    public Long getSmartTrafficCapacity() {
        return this.SmartTrafficCapacity;
    }

    /**
     * Set Specifies the smart acceleration traffic specification in the package. measurement unit: byte.
     * @param SmartTrafficCapacity Specifies the smart acceleration traffic specification in the package. measurement unit: byte.
     */
    public void setSmartTrafficCapacity(Long SmartTrafficCapacity) {
        this.SmartTrafficCapacity = SmartTrafficCapacity;
    }

    /**
     * Get Specifies the DDoS protection traffic specification in the package, measurement unit: byte. 
     * @return DDoSTrafficCapacity Specifies the DDoS protection traffic specification in the package, measurement unit: byte.
     */
    public Long getDDoSTrafficCapacity() {
        return this.DDoSTrafficCapacity;
    }

    /**
     * Set Specifies the DDoS protection traffic specification in the package, measurement unit: byte.
     * @param DDoSTrafficCapacity Specifies the DDoS protection traffic specification in the package, measurement unit: byte.
     */
    public void setDDoSTrafficCapacity(Long DDoSTrafficCapacity) {
        this.DDoSTrafficCapacity = DDoSTrafficCapacity;
    }

    /**
     * Get Security traffic specification in the package. measurement unit: byte. 
     * @return SecTrafficCapacity Security traffic specification in the package. measurement unit: byte.
     */
    public Long getSecTrafficCapacity() {
        return this.SecTrafficCapacity;
    }

    /**
     * Set Security traffic specification in the package. measurement unit: byte.
     * @param SecTrafficCapacity Security traffic specification in the package. measurement unit: byte.
     */
    public void setSecTrafficCapacity(Long SecTrafficCapacity) {
        this.SecTrafficCapacity = SecTrafficCapacity;
    }

    /**
     * Get Security requests in the package, unit: times. 
     * @return SecRequestCapacity Security requests in the package, unit: times.
     */
    public Long getSecRequestCapacity() {
        return this.SecRequestCapacity;
    }

    /**
     * Set Security requests in the package, unit: times.
     * @param SecRequestCapacity Security requests in the package, unit: times.
     */
    public void setSecRequestCapacity(Long SecRequestCapacity) {
        this.SecRequestCapacity = SecRequestCapacity;
    }

    /**
     * Get Specifies the layer 4 acceleration traffic specification in the package, measurement unit: byte. 
     * @return L4TrafficCapacity Specifies the layer 4 acceleration traffic specification in the package, measurement unit: byte.
     */
    public Long getL4TrafficCapacity() {
        return this.L4TrafficCapacity;
    }

    /**
     * Set Specifies the layer 4 acceleration traffic specification in the package, measurement unit: byte.
     * @param L4TrafficCapacity Specifies the layer 4 acceleration traffic specification in the package, measurement unit: byte.
     */
    public void setL4TrafficCapacity(Long L4TrafficCapacity) {
        this.L4TrafficCapacity = L4TrafficCapacity;
    }

    /**
     * Get Specifies the network optimization traffic specification in the package for the chinese mainland, measurement unit: byte. 
     * @return CrossMLCTrafficCapacity Specifies the network optimization traffic specification in the package for the chinese mainland, measurement unit: byte.
     */
    public Long getCrossMLCTrafficCapacity() {
        return this.CrossMLCTrafficCapacity;
    }

    /**
     * Set Specifies the network optimization traffic specification in the package for the chinese mainland, measurement unit: byte.
     * @param CrossMLCTrafficCapacity Specifies the network optimization traffic specification in the package for the chinese mainland, measurement unit: byte.
     */
    public void setCrossMLCTrafficCapacity(Long CrossMLCTrafficCapacity) {
        this.CrossMLCTrafficCapacity = CrossMLCTrafficCapacity;
    }

    /**
     * Get Specifies whether the package allows binding to new sites. valid values:.
<li>true: allows binding a new site.</li>.
<li>`false`: cannot bind new sites.</li>. 
     * @return Bindable Specifies whether the package allows binding to new sites. valid values:.
<li>true: allows binding a new site.</li>.
<li>`false`: cannot bind new sites.</li>.
     */
    public String getBindable() {
        return this.Bindable;
    }

    /**
     * Set Specifies whether the package allows binding to new sites. valid values:.
<li>true: allows binding a new site.</li>.
<li>`false`: cannot bind new sites.</li>.
     * @param Bindable Specifies whether the package allows binding to new sites. valid values:.
<li>true: allows binding a new site.</li>.
<li>`false`: cannot bind new sites.</li>.
     */
    public void setBindable(String Bindable) {
        this.Bindable = Bindable;
    }

    /**
     * Get Package activation time. 
     * @return EnabledTime Package activation time.
     */
    public String getEnabledTime() {
        return this.EnabledTime;
    }

    /**
     * Set Package activation time.
     * @param EnabledTime Package activation time.
     */
    public void setEnabledTime(String EnabledTime) {
        this.EnabledTime = EnabledTime;
    }

    /**
     * Get Plan expiration time. 
     * @return ExpiredTime Plan expiration time.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Plan expiration time.
     * @param ExpiredTime Plan expiration time.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Supported features of the package include: <li>ContentAcceleration: content acceleration feature;</li> <li>SmartAcceleration: intelligent acceleration feature;</li> <li>L4: L4 acceleration feature;</li> <li>Waf: advanced Web protection;</li> <li>QUIC: QUIC feature;</li> <li>CrossMLC: network optimization in the chinese mainland;</li> <li>ProcessMedia: media processing feature;</li> <li>L4DDoS: L4 DDoS protection feature;</li> L7DDoS feature will only appear in one of the following specifications: <li>L7DDoS.CM30G; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.CM60G; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.CM100G; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.Anycast300G; layer-7 DDoS protection feature - 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.AnycastUnlimited; layer-7 DDoS protection feature - unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM30G_Anycast300G; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM60G_Anycast300G; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM100G_Anycast300G; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM30G_AnycastUnlimited; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM60G_AnycastUnlimited; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM100G_AnycastUnlimited; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li>. 
     * @return Features Supported features of the package include: <li>ContentAcceleration: content acceleration feature;</li> <li>SmartAcceleration: intelligent acceleration feature;</li> <li>L4: L4 acceleration feature;</li> <li>Waf: advanced Web protection;</li> <li>QUIC: QUIC feature;</li> <li>CrossMLC: network optimization in the chinese mainland;</li> <li>ProcessMedia: media processing feature;</li> <li>L4DDoS: L4 DDoS protection feature;</li> L7DDoS feature will only appear in one of the following specifications: <li>L7DDoS.CM30G; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.CM60G; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.CM100G; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.Anycast300G; layer-7 DDoS protection feature - 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.AnycastUnlimited; layer-7 DDoS protection feature - unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM30G_Anycast300G; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM60G_Anycast300G; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM100G_Anycast300G; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM30G_AnycastUnlimited; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM60G_AnycastUnlimited; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM100G_AnycastUnlimited; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li>.
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set Supported features of the package include: <li>ContentAcceleration: content acceleration feature;</li> <li>SmartAcceleration: intelligent acceleration feature;</li> <li>L4: L4 acceleration feature;</li> <li>Waf: advanced Web protection;</li> <li>QUIC: QUIC feature;</li> <li>CrossMLC: network optimization in the chinese mainland;</li> <li>ProcessMedia: media processing feature;</li> <li>L4DDoS: L4 DDoS protection feature;</li> L7DDoS feature will only appear in one of the following specifications: <li>L7DDoS.CM30G; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.CM60G; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.CM100G; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.Anycast300G; layer-7 DDoS protection feature - 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.AnycastUnlimited; layer-7 DDoS protection feature - unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM30G_Anycast300G; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM60G_Anycast300G; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM100G_Anycast300G; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM30G_AnycastUnlimited; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM60G_AnycastUnlimited; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM100G_AnycastUnlimited; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li>.
     * @param Features Supported features of the package include: <li>ContentAcceleration: content acceleration feature;</li> <li>SmartAcceleration: intelligent acceleration feature;</li> <li>L4: L4 acceleration feature;</li> <li>Waf: advanced Web protection;</li> <li>QUIC: QUIC feature;</li> <li>CrossMLC: network optimization in the chinese mainland;</li> <li>ProcessMedia: media processing feature;</li> <li>L4DDoS: L4 DDoS protection feature;</li> L7DDoS feature will only appear in one of the following specifications: <li>L7DDoS.CM30G; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.CM60G; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.CM100G; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland;</li> <li>L7DDoS.Anycast300G; layer-7 DDoS protection feature - 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.AnycastUnlimited; layer-7 DDoS protection feature - unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM30G_Anycast300G; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM60G_Anycast300G; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM100G_Anycast300G; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland and 300G guaranteed minimum bandwidth specification outside the chinese mainland with Anycast;</li> <li>L7DDoS.CM30G_AnycastUnlimited; layer-7 DDoS protection feature - 30G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM60G_AnycastUnlimited; layer-7 DDoS protection feature - 60G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li> <li>L7DDoS.CM100G_AnycastUnlimited; layer-7 DDoS protection feature - 100G guaranteed minimum bandwidth specification in the chinese mainland and unlimited Anycast full protection outside the chinese mainland;</li>.
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

