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

public class Zone extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Identical site identifier. specifies a composite of numbers, english letters, ".", "-", and "_" with a character limit of 200.
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
    * Site acceleration region. valid values:.
<Li>Global: global availability zone.</li>.
<Li>Mainland: chinese mainland availability zone.</li>.
<li>overseas: global availability zone (excluding the chinese mainland).</li>.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Site access type. valid values:.
<li>full: NS access type;</li>.
<li>partial: CNAME access type;</li>.
<li>noDomainAccess: domainless access type.</li>.
<li>dnsPodAccess: DNSPod managed type. this type requires your domain name to be hosted on tencent cloud DNSPod.</li>.
<li> pages: pages data type;</li>.
<li>ai: edge reasoning access type.</li>.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Specifies the Tag associated with the site.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * The list of billable resources.
    */
    @SerializedName("Resources")
    @Expose
    private Resource [] Resources;

    /**
    * NS site detail. returned only when Type = full.
    */
    @SerializedName("NSDetail")
    @Expose
    private NSDetail NSDetail;

    /**
    * CNAME site detail. returned only when Type = partial.
    */
    @SerializedName("CNAMEDetail")
    @Expose
    private CNAMEDetail CNAMEDetail;

    /**
    * DNSPod managed Type site detail. returned only when Type = dnsPodAccess.
    */
    @SerializedName("DNSPodDetail")
    @Expose
    private DNSPodDetail DNSPodDetail;

    /**
    * The creation time of the site.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * The modification date of the site.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * The site status. Values:
u200c<li>`active`: The name server is switched to EdgeOne.</li>
u200c<li>`pending`: The name server is not switched.</li>
u200c<li>`moved`: The name server is changed to other service providers.</li>
u200c<li>`deactivated`: The site is blocked.</li>
<li>`initializing`: The site is not bound with any plan. </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CNAME record access status. Values:
<li>`finished`: The site is verified.</li>
<li>`pending`: The site is being verified.</li>
    */
    @SerializedName("CnameStatus")
    @Expose
    private String CnameStatus;

    /**
    * Status of the proxy. Values:
<li>`active`: Enabled</li>
<li>`inactive`: Not activated</li>
<li>`paused`: Disabled</li>
    */
    @SerializedName("ActiveStatus")
    @Expose
    private String ActiveStatus;

    /**
    * Lock status. Values: <li>`enable`: Normal. Modification is allowed.</li><li>`disable`: Locked. Modification is not allowed.</li><li>`plan_migrate`: Adjusting the plan. Modification is not allowed.</li> 
    */
    @SerializedName("LockStatus")
    @Expose
    private String LockStatus;

    /**
    * Whether the site is disabled.
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
    * Specifies whether it is a fake site (this field is a historic reserved field and is no longer maintained, refer to the website type for the corresponding field). valid values:.
<Li>0: non-fake site.</li>.
<Li>1: fake site.</li>.

    */
    @SerializedName("IsFake")
    @Expose
    private Long IsFake;

    /**
    * Whether to enable CNAME acceleration (this field is a historic reserved field and is no longer maintained. refer to the website type for the corresponding field). valid values:.
<Li>Enabled: specifies whether the feature is enabled.</li>.
<li>disabled: specifies that the feature is turned off.</li>.
    */
    @SerializedName("CnameSpeedUp")
    @Expose
    private String CnameSpeedUp;

    /**
    * Ownership verification information. (this field is a historic reserved field and is no longer maintained. refer to the website type for the corresponding field.).
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * Lists the currently used NS of the site. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field based on the website type.).
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * Lists of NS assigned by tencent cloud. (this field is a historic reserved field and no longer maintained. refer to the website type for the corresponding field.).
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * Specifies user-customized NS information. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field according to the website type.).
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * User-Customized NS IP information. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field according to the website type.).
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("VanityNameServersIps")
    @Expose
    private VanityNameServersIps [] VanityNameServersIps;

    /**
    * Version management configuration group working mode. site configuration modules can enable "version management mode" or "immediate effect mode" by configuration group dimension. for details, see [version management](https://www.tencentcloud.comom/document/product/1552/113690?from_cn_redirect=1).
    */
    @SerializedName("WorkModeInfos")
    @Expose
    private ConfigGroupWorkModeInfo [] WorkModeInfos;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The site name. 
     * @return ZoneName The site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set The site name.
     * @param ZoneName The site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Identical site identifier. specifies a composite of numbers, english letters, ".", "-", and "_" with a character limit of 200. 
     * @return AliasZoneName Identical site identifier. specifies a composite of numbers, english letters, ".", "-", and "_" with a character limit of 200.
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set Identical site identifier. specifies a composite of numbers, english letters, ".", "-", and "_" with a character limit of 200.
     * @param AliasZoneName Identical site identifier. specifies a composite of numbers, english letters, ".", "-", and "_" with a character limit of 200.
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    /**
     * Get Site acceleration region. valid values:.
<Li>Global: global availability zone.</li>.
<Li>Mainland: chinese mainland availability zone.</li>.
<li>overseas: global availability zone (excluding the chinese mainland).</li>. 
     * @return Area Site acceleration region. valid values:.
<Li>Global: global availability zone.</li>.
<Li>Mainland: chinese mainland availability zone.</li>.
<li>overseas: global availability zone (excluding the chinese mainland).</li>.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Site acceleration region. valid values:.
<Li>Global: global availability zone.</li>.
<Li>Mainland: chinese mainland availability zone.</li>.
<li>overseas: global availability zone (excluding the chinese mainland).</li>.
     * @param Area Site acceleration region. valid values:.
<Li>Global: global availability zone.</li>.
<Li>Mainland: chinese mainland availability zone.</li>.
<li>overseas: global availability zone (excluding the chinese mainland).</li>.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Site access type. valid values:.
<li>full: NS access type;</li>.
<li>partial: CNAME access type;</li>.
<li>noDomainAccess: domainless access type.</li>.
<li>dnsPodAccess: DNSPod managed type. this type requires your domain name to be hosted on tencent cloud DNSPod.</li>.
<li> pages: pages data type;</li>.
<li>ai: edge reasoning access type.</li>. 
     * @return Type Site access type. valid values:.
<li>full: NS access type;</li>.
<li>partial: CNAME access type;</li>.
<li>noDomainAccess: domainless access type.</li>.
<li>dnsPodAccess: DNSPod managed type. this type requires your domain name to be hosted on tencent cloud DNSPod.</li>.
<li> pages: pages data type;</li>.
<li>ai: edge reasoning access type.</li>.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Site access type. valid values:.
<li>full: NS access type;</li>.
<li>partial: CNAME access type;</li>.
<li>noDomainAccess: domainless access type.</li>.
<li>dnsPodAccess: DNSPod managed type. this type requires your domain name to be hosted on tencent cloud DNSPod.</li>.
<li> pages: pages data type;</li>.
<li>ai: edge reasoning access type.</li>.
     * @param Type Site access type. valid values:.
<li>full: NS access type;</li>.
<li>partial: CNAME access type;</li>.
<li>noDomainAccess: domainless access type.</li>.
<li>dnsPodAccess: DNSPod managed type. this type requires your domain name to be hosted on tencent cloud DNSPod.</li>.
<li> pages: pages data type;</li>.
<li>ai: edge reasoning access type.</li>.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Specifies the Tag associated with the site. 
     * @return Tags Specifies the Tag associated with the site.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Specifies the Tag associated with the site.
     * @param Tags Specifies the Tag associated with the site.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The list of billable resources. 
     * @return Resources The list of billable resources.
     */
    public Resource [] getResources() {
        return this.Resources;
    }

    /**
     * Set The list of billable resources.
     * @param Resources The list of billable resources.
     */
    public void setResources(Resource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get NS site detail. returned only when Type = full. 
     * @return NSDetail NS site detail. returned only when Type = full.
     */
    public NSDetail getNSDetail() {
        return this.NSDetail;
    }

    /**
     * Set NS site detail. returned only when Type = full.
     * @param NSDetail NS site detail. returned only when Type = full.
     */
    public void setNSDetail(NSDetail NSDetail) {
        this.NSDetail = NSDetail;
    }

    /**
     * Get CNAME site detail. returned only when Type = partial. 
     * @return CNAMEDetail CNAME site detail. returned only when Type = partial.
     */
    public CNAMEDetail getCNAMEDetail() {
        return this.CNAMEDetail;
    }

    /**
     * Set CNAME site detail. returned only when Type = partial.
     * @param CNAMEDetail CNAME site detail. returned only when Type = partial.
     */
    public void setCNAMEDetail(CNAMEDetail CNAMEDetail) {
        this.CNAMEDetail = CNAMEDetail;
    }

    /**
     * Get DNSPod managed Type site detail. returned only when Type = dnsPodAccess. 
     * @return DNSPodDetail DNSPod managed Type site detail. returned only when Type = dnsPodAccess.
     */
    public DNSPodDetail getDNSPodDetail() {
        return this.DNSPodDetail;
    }

    /**
     * Set DNSPod managed Type site detail. returned only when Type = dnsPodAccess.
     * @param DNSPodDetail DNSPod managed Type site detail. returned only when Type = dnsPodAccess.
     */
    public void setDNSPodDetail(DNSPodDetail DNSPodDetail) {
        this.DNSPodDetail = DNSPodDetail;
    }

    /**
     * Get The creation time of the site. 
     * @return CreatedOn The creation time of the site.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set The creation time of the site.
     * @param CreatedOn The creation time of the site.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get The modification date of the site. 
     * @return ModifiedOn The modification date of the site.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set The modification date of the site.
     * @param ModifiedOn The modification date of the site.
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get The site status. Values:
u200c<li>`active`: The name server is switched to EdgeOne.</li>
u200c<li>`pending`: The name server is not switched.</li>
u200c<li>`moved`: The name server is changed to other service providers.</li>
u200c<li>`deactivated`: The site is blocked.</li>
<li>`initializing`: The site is not bound with any plan. </li> 
     * @return Status The site status. Values:
u200c<li>`active`: The name server is switched to EdgeOne.</li>
u200c<li>`pending`: The name server is not switched.</li>
u200c<li>`moved`: The name server is changed to other service providers.</li>
u200c<li>`deactivated`: The site is blocked.</li>
<li>`initializing`: The site is not bound with any plan. </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The site status. Values:
u200c<li>`active`: The name server is switched to EdgeOne.</li>
u200c<li>`pending`: The name server is not switched.</li>
u200c<li>`moved`: The name server is changed to other service providers.</li>
u200c<li>`deactivated`: The site is blocked.</li>
<li>`initializing`: The site is not bound with any plan. </li>
     * @param Status The site status. Values:
u200c<li>`active`: The name server is switched to EdgeOne.</li>
u200c<li>`pending`: The name server is not switched.</li>
u200c<li>`moved`: The name server is changed to other service providers.</li>
u200c<li>`deactivated`: The site is blocked.</li>
<li>`initializing`: The site is not bound with any plan. </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CNAME record access status. Values:
<li>`finished`: The site is verified.</li>
<li>`pending`: The site is being verified.</li> 
     * @return CnameStatus CNAME record access status. Values:
<li>`finished`: The site is verified.</li>
<li>`pending`: The site is being verified.</li>
     */
    public String getCnameStatus() {
        return this.CnameStatus;
    }

    /**
     * Set CNAME record access status. Values:
<li>`finished`: The site is verified.</li>
<li>`pending`: The site is being verified.</li>
     * @param CnameStatus CNAME record access status. Values:
<li>`finished`: The site is verified.</li>
<li>`pending`: The site is being verified.</li>
     */
    public void setCnameStatus(String CnameStatus) {
        this.CnameStatus = CnameStatus;
    }

    /**
     * Get Status of the proxy. Values:
<li>`active`: Enabled</li>
<li>`inactive`: Not activated</li>
<li>`paused`: Disabled</li> 
     * @return ActiveStatus Status of the proxy. Values:
<li>`active`: Enabled</li>
<li>`inactive`: Not activated</li>
<li>`paused`: Disabled</li>
     */
    public String getActiveStatus() {
        return this.ActiveStatus;
    }

    /**
     * Set Status of the proxy. Values:
<li>`active`: Enabled</li>
<li>`inactive`: Not activated</li>
<li>`paused`: Disabled</li>
     * @param ActiveStatus Status of the proxy. Values:
<li>`active`: Enabled</li>
<li>`inactive`: Not activated</li>
<li>`paused`: Disabled</li>
     */
    public void setActiveStatus(String ActiveStatus) {
        this.ActiveStatus = ActiveStatus;
    }

    /**
     * Get Lock status. Values: <li>`enable`: Normal. Modification is allowed.</li><li>`disable`: Locked. Modification is not allowed.</li><li>`plan_migrate`: Adjusting the plan. Modification is not allowed.</li>  
     * @return LockStatus Lock status. Values: <li>`enable`: Normal. Modification is allowed.</li><li>`disable`: Locked. Modification is not allowed.</li><li>`plan_migrate`: Adjusting the plan. Modification is not allowed.</li> 
     */
    public String getLockStatus() {
        return this.LockStatus;
    }

    /**
     * Set Lock status. Values: <li>`enable`: Normal. Modification is allowed.</li><li>`disable`: Locked. Modification is not allowed.</li><li>`plan_migrate`: Adjusting the plan. Modification is not allowed.</li> 
     * @param LockStatus Lock status. Values: <li>`enable`: Normal. Modification is allowed.</li><li>`disable`: Locked. Modification is not allowed.</li><li>`plan_migrate`: Adjusting the plan. Modification is not allowed.</li> 
     */
    public void setLockStatus(String LockStatus) {
        this.LockStatus = LockStatus;
    }

    /**
     * Get Whether the site is disabled. 
     * @return Paused Whether the site is disabled.
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set Whether the site is disabled.
     * @param Paused Whether the site is disabled.
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    /**
     * Get Specifies whether it is a fake site (this field is a historic reserved field and is no longer maintained, refer to the website type for the corresponding field). valid values:.
<Li>0: non-fake site.</li>.
<Li>1: fake site.</li>.
 
     * @return IsFake Specifies whether it is a fake site (this field is a historic reserved field and is no longer maintained, refer to the website type for the corresponding field). valid values:.
<Li>0: non-fake site.</li>.
<Li>1: fake site.</li>.

     */
    public Long getIsFake() {
        return this.IsFake;
    }

    /**
     * Set Specifies whether it is a fake site (this field is a historic reserved field and is no longer maintained, refer to the website type for the corresponding field). valid values:.
<Li>0: non-fake site.</li>.
<Li>1: fake site.</li>.

     * @param IsFake Specifies whether it is a fake site (this field is a historic reserved field and is no longer maintained, refer to the website type for the corresponding field). valid values:.
<Li>0: non-fake site.</li>.
<Li>1: fake site.</li>.

     */
    public void setIsFake(Long IsFake) {
        this.IsFake = IsFake;
    }

    /**
     * Get Whether to enable CNAME acceleration (this field is a historic reserved field and is no longer maintained. refer to the website type for the corresponding field). valid values:.
<Li>Enabled: specifies whether the feature is enabled.</li>.
<li>disabled: specifies that the feature is turned off.</li>. 
     * @return CnameSpeedUp Whether to enable CNAME acceleration (this field is a historic reserved field and is no longer maintained. refer to the website type for the corresponding field). valid values:.
<Li>Enabled: specifies whether the feature is enabled.</li>.
<li>disabled: specifies that the feature is turned off.</li>.
     */
    public String getCnameSpeedUp() {
        return this.CnameSpeedUp;
    }

    /**
     * Set Whether to enable CNAME acceleration (this field is a historic reserved field and is no longer maintained. refer to the website type for the corresponding field). valid values:.
<Li>Enabled: specifies whether the feature is enabled.</li>.
<li>disabled: specifies that the feature is turned off.</li>.
     * @param CnameSpeedUp Whether to enable CNAME acceleration (this field is a historic reserved field and is no longer maintained. refer to the website type for the corresponding field). valid values:.
<Li>Enabled: specifies whether the feature is enabled.</li>.
<li>disabled: specifies that the feature is turned off.</li>.
     */
    public void setCnameSpeedUp(String CnameSpeedUp) {
        this.CnameSpeedUp = CnameSpeedUp;
    }

    /**
     * Get Ownership verification information. (this field is a historic reserved field and is no longer maintained. refer to the website type for the corresponding field.).
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return OwnershipVerification Ownership verification information. (this field is a historic reserved field and is no longer maintained. refer to the website type for the corresponding field.).
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set Ownership verification information. (this field is a historic reserved field and is no longer maintained. refer to the website type for the corresponding field.).
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param OwnershipVerification Ownership verification information. (this field is a historic reserved field and is no longer maintained. refer to the website type for the corresponding field.).
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get Lists the currently used NS of the site. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field based on the website type.). 
     * @return OriginalNameServers Lists the currently used NS of the site. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field based on the website type.).
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set Lists the currently used NS of the site. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field based on the website type.).
     * @param OriginalNameServers Lists the currently used NS of the site. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field based on the website type.).
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get Lists of NS assigned by tencent cloud. (this field is a historic reserved field and no longer maintained. refer to the website type for the corresponding field.). 
     * @return NameServers Lists of NS assigned by tencent cloud. (this field is a historic reserved field and no longer maintained. refer to the website type for the corresponding field.).
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set Lists of NS assigned by tencent cloud. (this field is a historic reserved field and no longer maintained. refer to the website type for the corresponding field.).
     * @param NameServers Lists of NS assigned by tencent cloud. (this field is a historic reserved field and no longer maintained. refer to the website type for the corresponding field.).
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get Specifies user-customized NS information. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field according to the website type.).
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return VanityNameServers Specifies user-customized NS information. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field according to the website type.).
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set Specifies user-customized NS information. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field according to the website type.).
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param VanityNameServers Specifies user-customized NS information. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field according to the website type.).
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get User-Customized NS IP information. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field according to the website type.).
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return VanityNameServersIps User-Customized NS IP information. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field according to the website type.).
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public VanityNameServersIps [] getVanityNameServersIps() {
        return this.VanityNameServersIps;
    }

    /**
     * Set User-Customized NS IP information. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field according to the website type.).
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param VanityNameServersIps User-Customized NS IP information. (this field is a historic reserved field and is no longer maintained. refer to the corresponding field according to the website type.).
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setVanityNameServersIps(VanityNameServersIps [] VanityNameServersIps) {
        this.VanityNameServersIps = VanityNameServersIps;
    }

    /**
     * Get Version management configuration group working mode. site configuration modules can enable "version management mode" or "immediate effect mode" by configuration group dimension. for details, see [version management](https://www.tencentcloud.comom/document/product/1552/113690?from_cn_redirect=1). 
     * @return WorkModeInfos Version management configuration group working mode. site configuration modules can enable "version management mode" or "immediate effect mode" by configuration group dimension. for details, see [version management](https://www.tencentcloud.comom/document/product/1552/113690?from_cn_redirect=1).
     */
    public ConfigGroupWorkModeInfo [] getWorkModeInfos() {
        return this.WorkModeInfos;
    }

    /**
     * Set Version management configuration group working mode. site configuration modules can enable "version management mode" or "immediate effect mode" by configuration group dimension. for details, see [version management](https://www.tencentcloud.comom/document/product/1552/113690?from_cn_redirect=1).
     * @param WorkModeInfos Version management configuration group working mode. site configuration modules can enable "version management mode" or "immediate effect mode" by configuration group dimension. for details, see [version management](https://www.tencentcloud.comom/document/product/1552/113690?from_cn_redirect=1).
     */
    public void setWorkModeInfos(ConfigGroupWorkModeInfo [] WorkModeInfos) {
        this.WorkModeInfos = WorkModeInfos;
    }

    public Zone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Zone(Zone source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.AliasZoneName != null) {
            this.AliasZoneName = new String(source.AliasZoneName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Resources != null) {
            this.Resources = new Resource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new Resource(source.Resources[i]);
            }
        }
        if (source.NSDetail != null) {
            this.NSDetail = new NSDetail(source.NSDetail);
        }
        if (source.CNAMEDetail != null) {
            this.CNAMEDetail = new CNAMEDetail(source.CNAMEDetail);
        }
        if (source.DNSPodDetail != null) {
            this.DNSPodDetail = new DNSPodDetail(source.DNSPodDetail);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CnameStatus != null) {
            this.CnameStatus = new String(source.CnameStatus);
        }
        if (source.ActiveStatus != null) {
            this.ActiveStatus = new String(source.ActiveStatus);
        }
        if (source.LockStatus != null) {
            this.LockStatus = new String(source.LockStatus);
        }
        if (source.Paused != null) {
            this.Paused = new Boolean(source.Paused);
        }
        if (source.IsFake != null) {
            this.IsFake = new Long(source.IsFake);
        }
        if (source.CnameSpeedUp != null) {
            this.CnameSpeedUp = new String(source.CnameSpeedUp);
        }
        if (source.OwnershipVerification != null) {
            this.OwnershipVerification = new OwnershipVerification(source.OwnershipVerification);
        }
        if (source.OriginalNameServers != null) {
            this.OriginalNameServers = new String[source.OriginalNameServers.length];
            for (int i = 0; i < source.OriginalNameServers.length; i++) {
                this.OriginalNameServers[i] = new String(source.OriginalNameServers[i]);
            }
        }
        if (source.NameServers != null) {
            this.NameServers = new String[source.NameServers.length];
            for (int i = 0; i < source.NameServers.length; i++) {
                this.NameServers[i] = new String(source.NameServers[i]);
            }
        }
        if (source.VanityNameServers != null) {
            this.VanityNameServers = new VanityNameServers(source.VanityNameServers);
        }
        if (source.VanityNameServersIps != null) {
            this.VanityNameServersIps = new VanityNameServersIps[source.VanityNameServersIps.length];
            for (int i = 0; i < source.VanityNameServersIps.length; i++) {
                this.VanityNameServersIps[i] = new VanityNameServersIps(source.VanityNameServersIps[i]);
            }
        }
        if (source.WorkModeInfos != null) {
            this.WorkModeInfos = new ConfigGroupWorkModeInfo[source.WorkModeInfos.length];
            for (int i = 0; i < source.WorkModeInfos.length; i++) {
                this.WorkModeInfos[i] = new ConfigGroupWorkModeInfo(source.WorkModeInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "AliasZoneName", this.AliasZoneName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamObj(map, prefix + "NSDetail.", this.NSDetail);
        this.setParamObj(map, prefix + "CNAMEDetail.", this.CNAMEDetail);
        this.setParamObj(map, prefix + "DNSPodDetail.", this.DNSPodDetail);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CnameStatus", this.CnameStatus);
        this.setParamSimple(map, prefix + "ActiveStatus", this.ActiveStatus);
        this.setParamSimple(map, prefix + "LockStatus", this.LockStatus);
        this.setParamSimple(map, prefix + "Paused", this.Paused);
        this.setParamSimple(map, prefix + "IsFake", this.IsFake);
        this.setParamSimple(map, prefix + "CnameSpeedUp", this.CnameSpeedUp);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);
        this.setParamArraySimple(map, prefix + "OriginalNameServers.", this.OriginalNameServers);
        this.setParamArraySimple(map, prefix + "NameServers.", this.NameServers);
        this.setParamObj(map, prefix + "VanityNameServers.", this.VanityNameServers);
        this.setParamArrayObj(map, prefix + "VanityNameServersIps.", this.VanityNameServersIps);
        this.setParamArrayObj(map, prefix + "WorkModeInfos.", this.WorkModeInfos);

    }
}

