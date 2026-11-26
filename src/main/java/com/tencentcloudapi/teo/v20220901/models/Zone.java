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
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Identical site identifier. It can contain digits, letters, ".", "-", and "_", up to 200 characters.
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
    * Site acceleration region. Valid values:
<li> global: global availability zone;</li>
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland).</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Site access type. Valid values:
<li>full: NS access type;</li>
<li>partial: CNAME access type;</li>
<li>noDomainAccess: domainless access type.</li>
<li>dnsPodAccess: DNSPod managed type. This type requires your domain name to be hosted on Tencent Cloud DNSPod;</li>
<li> pages: Pages type;</li>
<li> ai: Edge reasoning access type.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Tag associated with the site.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * List of billable resources.
    */
    @SerializedName("Resources")
    @Expose
    private Resource [] Resources;

    /**
    * Site detail of the NS type. This value is returned only when Type is full.
    */
    @SerializedName("NSDetail")
    @Expose
    private NSDetail NSDetail;

    /**
    * Site detail of CNAME type. This value is returned only when Type is partial.
    */
    @SerializedName("CNAMEDetail")
    @Expose
    private CNAMEDetail CNAMEDetail;

    /**
    * DNSPod managed type site detail. This return value is only available when Type = dnsPodAccess.
    */
    @SerializedName("DNSPodDetail")
    @Expose
    private DNSPodDetail DNSPodDetail;

    /**
    * Site creation time.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Site modification time.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * Site status. Valid values:
<li> active: NS switched; </li>
<li>pending: NS not switched.</li>
<li> moved: The NS has been moved away;</li>
<li>`deactivated`: The name server is blocked.</li>
<li> initializing: Package to be bound. </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CNAME access status. Valid values:
<li> finished: site verified;</li>
<li> pending: verifying site.</li>
    */
    @SerializedName("CnameStatus")
    @Expose
    private String CnameStatus;

    /**
    * Display status. Valid values:
<li> active: enabled;</li>
<li> inactive: Not effective;</li>
<li> paused: disabled.</li>
    */
    @SerializedName("ActiveStatus")
    @Expose
    private String ActiveStatus;

    /**
    * Lock status. Valid values: <li> enable: normal. Modifications are allowed;</li><li> disable: locked. Modifications are not allowed;</li><li> plan_migrate: package migrating. Modifications are not allowed.</li>
    */
    @SerializedName("LockStatus")
    @Expose
    private String LockStatus;

    /**
    * Whether to close the site.
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
    * Whether it is a fake site (this field is a reserved field for history and is no longer maintained. According to the website type, see the corresponding field). Valid values:
<li>0: non-fake site</li>
<li> 1: Fake site.</li>

    */
    @SerializedName("IsFake")
    @Expose
    private Long IsFake;

    /**
    * Whether CNAME acceleration is enabled (this is a historic reserved field and no longer maintained. For the corresponding field, see the website type). Valid values:
<li> enabled: Enable;</li>
<li> disabled: Disable.</li>
    */
    @SerializedName("CnameSpeedUp")
    @Expose
    private String CnameSpeedUp;

    /**
    * Ownership verification information. (This field is a historic reserved field and is no longer maintained. For the corresponding field, see the website type.)
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * List of NS currently used by the site. (This field is a reserved field for history and is no longer maintained. According to the website type, see the corresponding field for reference.)
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * List of NS assigned by Tencent Cloud. (This field is a reserved field for history and no longer maintained. For reference, see the corresponding field based on the website type.)
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * User-customized NS information. (This is a reserved field for history and is no longer maintained. Refer to the corresponding field based on the website type.)
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * User-customized NS IP information. (This is a reserved field for historical purposes and is no longer maintained. Refer to the corresponding field based on the website type.)
    */
    @SerializedName("VanityNameServersIps")
    @Expose
    private VanityNameServersIps [] VanityNameServersIps;

    /**
    * Version management configuration group working mode. Each configuration module of a site can enable "version management mode" or "immediate effect mode" by configuration group dimension. For details, see [Version Management](https://www.tencentcloud.com/document/product/1552/113690?from_cn_redirect=1).
    */
    @SerializedName("WorkModeInfos")
    @Expose
    private ConfigGroupWorkModeInfo [] WorkModeInfos;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Site name. 
     * @return ZoneName Site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name.
     * @param ZoneName Site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Identical site identifier. It can contain digits, letters, ".", "-", and "_", up to 200 characters. 
     * @return AliasZoneName Identical site identifier. It can contain digits, letters, ".", "-", and "_", up to 200 characters.
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set Identical site identifier. It can contain digits, letters, ".", "-", and "_", up to 200 characters.
     * @param AliasZoneName Identical site identifier. It can contain digits, letters, ".", "-", and "_", up to 200 characters.
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    /**
     * Get Site acceleration region. Valid values:
<li> global: global availability zone;</li>
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland).</li> 
     * @return Area Site acceleration region. Valid values:
<li> global: global availability zone;</li>
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland).</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Site acceleration region. Valid values:
<li> global: global availability zone;</li>
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland).</li>
     * @param Area Site acceleration region. Valid values:
<li> global: global availability zone;</li>
<li>mainland: Chinese mainland availability zone;</li>
<li>overseas: global availability zone (excluding the Chinese mainland).</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Site access type. Valid values:
<li>full: NS access type;</li>
<li>partial: CNAME access type;</li>
<li>noDomainAccess: domainless access type.</li>
<li>dnsPodAccess: DNSPod managed type. This type requires your domain name to be hosted on Tencent Cloud DNSPod;</li>
<li> pages: Pages type;</li>
<li> ai: Edge reasoning access type.</li> 
     * @return Type Site access type. Valid values:
<li>full: NS access type;</li>
<li>partial: CNAME access type;</li>
<li>noDomainAccess: domainless access type.</li>
<li>dnsPodAccess: DNSPod managed type. This type requires your domain name to be hosted on Tencent Cloud DNSPod;</li>
<li> pages: Pages type;</li>
<li> ai: Edge reasoning access type.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Site access type. Valid values:
<li>full: NS access type;</li>
<li>partial: CNAME access type;</li>
<li>noDomainAccess: domainless access type.</li>
<li>dnsPodAccess: DNSPod managed type. This type requires your domain name to be hosted on Tencent Cloud DNSPod;</li>
<li> pages: Pages type;</li>
<li> ai: Edge reasoning access type.</li>
     * @param Type Site access type. Valid values:
<li>full: NS access type;</li>
<li>partial: CNAME access type;</li>
<li>noDomainAccess: domainless access type.</li>
<li>dnsPodAccess: DNSPod managed type. This type requires your domain name to be hosted on Tencent Cloud DNSPod;</li>
<li> pages: Pages type;</li>
<li> ai: Edge reasoning access type.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Tag associated with the site. 
     * @return Tags Tag associated with the site.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag associated with the site.
     * @param Tags Tag associated with the site.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get List of billable resources. 
     * @return Resources List of billable resources.
     */
    public Resource [] getResources() {
        return this.Resources;
    }

    /**
     * Set List of billable resources.
     * @param Resources List of billable resources.
     */
    public void setResources(Resource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Site detail of the NS type. This value is returned only when Type is full. 
     * @return NSDetail Site detail of the NS type. This value is returned only when Type is full.
     */
    public NSDetail getNSDetail() {
        return this.NSDetail;
    }

    /**
     * Set Site detail of the NS type. This value is returned only when Type is full.
     * @param NSDetail Site detail of the NS type. This value is returned only when Type is full.
     */
    public void setNSDetail(NSDetail NSDetail) {
        this.NSDetail = NSDetail;
    }

    /**
     * Get Site detail of CNAME type. This value is returned only when Type is partial. 
     * @return CNAMEDetail Site detail of CNAME type. This value is returned only when Type is partial.
     */
    public CNAMEDetail getCNAMEDetail() {
        return this.CNAMEDetail;
    }

    /**
     * Set Site detail of CNAME type. This value is returned only when Type is partial.
     * @param CNAMEDetail Site detail of CNAME type. This value is returned only when Type is partial.
     */
    public void setCNAMEDetail(CNAMEDetail CNAMEDetail) {
        this.CNAMEDetail = CNAMEDetail;
    }

    /**
     * Get DNSPod managed type site detail. This return value is only available when Type = dnsPodAccess. 
     * @return DNSPodDetail DNSPod managed type site detail. This return value is only available when Type = dnsPodAccess.
     */
    public DNSPodDetail getDNSPodDetail() {
        return this.DNSPodDetail;
    }

    /**
     * Set DNSPod managed type site detail. This return value is only available when Type = dnsPodAccess.
     * @param DNSPodDetail DNSPod managed type site detail. This return value is only available when Type = dnsPodAccess.
     */
    public void setDNSPodDetail(DNSPodDetail DNSPodDetail) {
        this.DNSPodDetail = DNSPodDetail;
    }

    /**
     * Get Site creation time. 
     * @return CreatedOn Site creation time.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Site creation time.
     * @param CreatedOn Site creation time.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Site modification time. 
     * @return ModifiedOn Site modification time.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Site modification time.
     * @param ModifiedOn Site modification time.
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get Site status. Valid values:
<li> active: NS switched; </li>
<li>pending: NS not switched.</li>
<li> moved: The NS has been moved away;</li>
<li>`deactivated`: The name server is blocked.</li>
<li> initializing: Package to be bound. </li> 
     * @return Status Site status. Valid values:
<li> active: NS switched; </li>
<li>pending: NS not switched.</li>
<li> moved: The NS has been moved away;</li>
<li>`deactivated`: The name server is blocked.</li>
<li> initializing: Package to be bound. </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Site status. Valid values:
<li> active: NS switched; </li>
<li>pending: NS not switched.</li>
<li> moved: The NS has been moved away;</li>
<li>`deactivated`: The name server is blocked.</li>
<li> initializing: Package to be bound. </li>
     * @param Status Site status. Valid values:
<li> active: NS switched; </li>
<li>pending: NS not switched.</li>
<li> moved: The NS has been moved away;</li>
<li>`deactivated`: The name server is blocked.</li>
<li> initializing: Package to be bound. </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CNAME access status. Valid values:
<li> finished: site verified;</li>
<li> pending: verifying site.</li> 
     * @return CnameStatus CNAME access status. Valid values:
<li> finished: site verified;</li>
<li> pending: verifying site.</li>
     */
    public String getCnameStatus() {
        return this.CnameStatus;
    }

    /**
     * Set CNAME access status. Valid values:
<li> finished: site verified;</li>
<li> pending: verifying site.</li>
     * @param CnameStatus CNAME access status. Valid values:
<li> finished: site verified;</li>
<li> pending: verifying site.</li>
     */
    public void setCnameStatus(String CnameStatus) {
        this.CnameStatus = CnameStatus;
    }

    /**
     * Get Display status. Valid values:
<li> active: enabled;</li>
<li> inactive: Not effective;</li>
<li> paused: disabled.</li> 
     * @return ActiveStatus Display status. Valid values:
<li> active: enabled;</li>
<li> inactive: Not effective;</li>
<li> paused: disabled.</li>
     */
    public String getActiveStatus() {
        return this.ActiveStatus;
    }

    /**
     * Set Display status. Valid values:
<li> active: enabled;</li>
<li> inactive: Not effective;</li>
<li> paused: disabled.</li>
     * @param ActiveStatus Display status. Valid values:
<li> active: enabled;</li>
<li> inactive: Not effective;</li>
<li> paused: disabled.</li>
     */
    public void setActiveStatus(String ActiveStatus) {
        this.ActiveStatus = ActiveStatus;
    }

    /**
     * Get Lock status. Valid values: <li> enable: normal. Modifications are allowed;</li><li> disable: locked. Modifications are not allowed;</li><li> plan_migrate: package migrating. Modifications are not allowed.</li> 
     * @return LockStatus Lock status. Valid values: <li> enable: normal. Modifications are allowed;</li><li> disable: locked. Modifications are not allowed;</li><li> plan_migrate: package migrating. Modifications are not allowed.</li>
     */
    public String getLockStatus() {
        return this.LockStatus;
    }

    /**
     * Set Lock status. Valid values: <li> enable: normal. Modifications are allowed;</li><li> disable: locked. Modifications are not allowed;</li><li> plan_migrate: package migrating. Modifications are not allowed.</li>
     * @param LockStatus Lock status. Valid values: <li> enable: normal. Modifications are allowed;</li><li> disable: locked. Modifications are not allowed;</li><li> plan_migrate: package migrating. Modifications are not allowed.</li>
     */
    public void setLockStatus(String LockStatus) {
        this.LockStatus = LockStatus;
    }

    /**
     * Get Whether to close the site. 
     * @return Paused Whether to close the site.
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set Whether to close the site.
     * @param Paused Whether to close the site.
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    /**
     * Get Whether it is a fake site (this field is a reserved field for history and is no longer maintained. According to the website type, see the corresponding field). Valid values:
<li>0: non-fake site</li>
<li> 1: Fake site.</li>
 
     * @return IsFake Whether it is a fake site (this field is a reserved field for history and is no longer maintained. According to the website type, see the corresponding field). Valid values:
<li>0: non-fake site</li>
<li> 1: Fake site.</li>

     */
    public Long getIsFake() {
        return this.IsFake;
    }

    /**
     * Set Whether it is a fake site (this field is a reserved field for history and is no longer maintained. According to the website type, see the corresponding field). Valid values:
<li>0: non-fake site</li>
<li> 1: Fake site.</li>

     * @param IsFake Whether it is a fake site (this field is a reserved field for history and is no longer maintained. According to the website type, see the corresponding field). Valid values:
<li>0: non-fake site</li>
<li> 1: Fake site.</li>

     */
    public void setIsFake(Long IsFake) {
        this.IsFake = IsFake;
    }

    /**
     * Get Whether CNAME acceleration is enabled (this is a historic reserved field and no longer maintained. For the corresponding field, see the website type). Valid values:
<li> enabled: Enable;</li>
<li> disabled: Disable.</li> 
     * @return CnameSpeedUp Whether CNAME acceleration is enabled (this is a historic reserved field and no longer maintained. For the corresponding field, see the website type). Valid values:
<li> enabled: Enable;</li>
<li> disabled: Disable.</li>
     */
    public String getCnameSpeedUp() {
        return this.CnameSpeedUp;
    }

    /**
     * Set Whether CNAME acceleration is enabled (this is a historic reserved field and no longer maintained. For the corresponding field, see the website type). Valid values:
<li> enabled: Enable;</li>
<li> disabled: Disable.</li>
     * @param CnameSpeedUp Whether CNAME acceleration is enabled (this is a historic reserved field and no longer maintained. For the corresponding field, see the website type). Valid values:
<li> enabled: Enable;</li>
<li> disabled: Disable.</li>
     */
    public void setCnameSpeedUp(String CnameSpeedUp) {
        this.CnameSpeedUp = CnameSpeedUp;
    }

    /**
     * Get Ownership verification information. (This field is a historic reserved field and is no longer maintained. For the corresponding field, see the website type.) 
     * @return OwnershipVerification Ownership verification information. (This field is a historic reserved field and is no longer maintained. For the corresponding field, see the website type.)
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set Ownership verification information. (This field is a historic reserved field and is no longer maintained. For the corresponding field, see the website type.)
     * @param OwnershipVerification Ownership verification information. (This field is a historic reserved field and is no longer maintained. For the corresponding field, see the website type.)
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get List of NS currently used by the site. (This field is a reserved field for history and is no longer maintained. According to the website type, see the corresponding field for reference.) 
     * @return OriginalNameServers List of NS currently used by the site. (This field is a reserved field for history and is no longer maintained. According to the website type, see the corresponding field for reference.)
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set List of NS currently used by the site. (This field is a reserved field for history and is no longer maintained. According to the website type, see the corresponding field for reference.)
     * @param OriginalNameServers List of NS currently used by the site. (This field is a reserved field for history and is no longer maintained. According to the website type, see the corresponding field for reference.)
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get List of NS assigned by Tencent Cloud. (This field is a reserved field for history and no longer maintained. For reference, see the corresponding field based on the website type.) 
     * @return NameServers List of NS assigned by Tencent Cloud. (This field is a reserved field for history and no longer maintained. For reference, see the corresponding field based on the website type.)
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set List of NS assigned by Tencent Cloud. (This field is a reserved field for history and no longer maintained. For reference, see the corresponding field based on the website type.)
     * @param NameServers List of NS assigned by Tencent Cloud. (This field is a reserved field for history and no longer maintained. For reference, see the corresponding field based on the website type.)
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get User-customized NS information. (This is a reserved field for history and is no longer maintained. Refer to the corresponding field based on the website type.) 
     * @return VanityNameServers User-customized NS information. (This is a reserved field for history and is no longer maintained. Refer to the corresponding field based on the website type.)
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set User-customized NS information. (This is a reserved field for history and is no longer maintained. Refer to the corresponding field based on the website type.)
     * @param VanityNameServers User-customized NS information. (This is a reserved field for history and is no longer maintained. Refer to the corresponding field based on the website type.)
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get User-customized NS IP information. (This is a reserved field for historical purposes and is no longer maintained. Refer to the corresponding field based on the website type.) 
     * @return VanityNameServersIps User-customized NS IP information. (This is a reserved field for historical purposes and is no longer maintained. Refer to the corresponding field based on the website type.)
     */
    public VanityNameServersIps [] getVanityNameServersIps() {
        return this.VanityNameServersIps;
    }

    /**
     * Set User-customized NS IP information. (This is a reserved field for historical purposes and is no longer maintained. Refer to the corresponding field based on the website type.)
     * @param VanityNameServersIps User-customized NS IP information. (This is a reserved field for historical purposes and is no longer maintained. Refer to the corresponding field based on the website type.)
     */
    public void setVanityNameServersIps(VanityNameServersIps [] VanityNameServersIps) {
        this.VanityNameServersIps = VanityNameServersIps;
    }

    /**
     * Get Version management configuration group working mode. Each configuration module of a site can enable "version management mode" or "immediate effect mode" by configuration group dimension. For details, see [Version Management](https://www.tencentcloud.com/document/product/1552/113690?from_cn_redirect=1). 
     * @return WorkModeInfos Version management configuration group working mode. Each configuration module of a site can enable "version management mode" or "immediate effect mode" by configuration group dimension. For details, see [Version Management](https://www.tencentcloud.com/document/product/1552/113690?from_cn_redirect=1).
     */
    public ConfigGroupWorkModeInfo [] getWorkModeInfos() {
        return this.WorkModeInfos;
    }

    /**
     * Set Version management configuration group working mode. Each configuration module of a site can enable "version management mode" or "immediate effect mode" by configuration group dimension. For details, see [Version Management](https://www.tencentcloud.com/document/product/1552/113690?from_cn_redirect=1).
     * @param WorkModeInfos Version management configuration group working mode. Each configuration module of a site can enable "version management mode" or "immediate effect mode" by configuration group dimension. For details, see [Version Management](https://www.tencentcloud.com/document/product/1552/113690?from_cn_redirect=1).
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

