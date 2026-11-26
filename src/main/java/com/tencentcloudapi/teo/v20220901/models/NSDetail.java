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

public class NSDetail extends AbstractModel {

    /**
    * Whether CNAME acceleration is enabled. Valid values:
<li> enabled: Enable;</li>
<li> disabled: Disable.</li>
    */
    @SerializedName("CnameSpeedUp")
    @Expose
    private String CnameSpeedUp;

    /**
    * Existence of a site with the same name. Valid values:
<li> 0: No site with the same name exists;</li>
<li> 1: A site with the same name already exists.</li>
    */
    @SerializedName("IsFake")
    @Expose
    private Long IsFake;

    /**
    * Ownership verification information. For sites with NS access type, switching the current NS server to the NS server designated by Tencent Cloud EdgeOne is deemed as passing ownership verification. For details, see [Site/Domain Ownership Verification](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1).
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * List of NS servers currently in use by the site detected by EdgeOne.
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * List of NS servers assigned by Tencent Cloud EdgeOne. Point the NS server of the current site to this address for the site to take effect.
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * User-customized NS server domain info. If the custom NS service is enabled, the NS need to be pointed to this address at the domain name registered vendor.
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * IP address information corresponding to the user-customized NS server.
    */
    @SerializedName("VanityNameServersIps")
    @Expose
    private VanityNameServersIps [] VanityNameServersIps;

    /**
     * Get Whether CNAME acceleration is enabled. Valid values:
<li> enabled: Enable;</li>
<li> disabled: Disable.</li> 
     * @return CnameSpeedUp Whether CNAME acceleration is enabled. Valid values:
<li> enabled: Enable;</li>
<li> disabled: Disable.</li>
     */
    public String getCnameSpeedUp() {
        return this.CnameSpeedUp;
    }

    /**
     * Set Whether CNAME acceleration is enabled. Valid values:
<li> enabled: Enable;</li>
<li> disabled: Disable.</li>
     * @param CnameSpeedUp Whether CNAME acceleration is enabled. Valid values:
<li> enabled: Enable;</li>
<li> disabled: Disable.</li>
     */
    public void setCnameSpeedUp(String CnameSpeedUp) {
        this.CnameSpeedUp = CnameSpeedUp;
    }

    /**
     * Get Existence of a site with the same name. Valid values:
<li> 0: No site with the same name exists;</li>
<li> 1: A site with the same name already exists.</li> 
     * @return IsFake Existence of a site with the same name. Valid values:
<li> 0: No site with the same name exists;</li>
<li> 1: A site with the same name already exists.</li>
     */
    public Long getIsFake() {
        return this.IsFake;
    }

    /**
     * Set Existence of a site with the same name. Valid values:
<li> 0: No site with the same name exists;</li>
<li> 1: A site with the same name already exists.</li>
     * @param IsFake Existence of a site with the same name. Valid values:
<li> 0: No site with the same name exists;</li>
<li> 1: A site with the same name already exists.</li>
     */
    public void setIsFake(Long IsFake) {
        this.IsFake = IsFake;
    }

    /**
     * Get Ownership verification information. For sites with NS access type, switching the current NS server to the NS server designated by Tencent Cloud EdgeOne is deemed as passing ownership verification. For details, see [Site/Domain Ownership Verification](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1). 
     * @return OwnershipVerification Ownership verification information. For sites with NS access type, switching the current NS server to the NS server designated by Tencent Cloud EdgeOne is deemed as passing ownership verification. For details, see [Site/Domain Ownership Verification](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1).
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set Ownership verification information. For sites with NS access type, switching the current NS server to the NS server designated by Tencent Cloud EdgeOne is deemed as passing ownership verification. For details, see [Site/Domain Ownership Verification](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1).
     * @param OwnershipVerification Ownership verification information. For sites with NS access type, switching the current NS server to the NS server designated by Tencent Cloud EdgeOne is deemed as passing ownership verification. For details, see [Site/Domain Ownership Verification](https://www.tencentcloud.com/document/product/1552/70789?from_cn_redirect=1).
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get List of NS servers currently in use by the site detected by EdgeOne. 
     * @return OriginalNameServers List of NS servers currently in use by the site detected by EdgeOne.
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set List of NS servers currently in use by the site detected by EdgeOne.
     * @param OriginalNameServers List of NS servers currently in use by the site detected by EdgeOne.
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get List of NS servers assigned by Tencent Cloud EdgeOne. Point the NS server of the current site to this address for the site to take effect. 
     * @return NameServers List of NS servers assigned by Tencent Cloud EdgeOne. Point the NS server of the current site to this address for the site to take effect.
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set List of NS servers assigned by Tencent Cloud EdgeOne. Point the NS server of the current site to this address for the site to take effect.
     * @param NameServers List of NS servers assigned by Tencent Cloud EdgeOne. Point the NS server of the current site to this address for the site to take effect.
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get User-customized NS server domain info. If the custom NS service is enabled, the NS need to be pointed to this address at the domain name registered vendor. 
     * @return VanityNameServers User-customized NS server domain info. If the custom NS service is enabled, the NS need to be pointed to this address at the domain name registered vendor.
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set User-customized NS server domain info. If the custom NS service is enabled, the NS need to be pointed to this address at the domain name registered vendor.
     * @param VanityNameServers User-customized NS server domain info. If the custom NS service is enabled, the NS need to be pointed to this address at the domain name registered vendor.
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get IP address information corresponding to the user-customized NS server. 
     * @return VanityNameServersIps IP address information corresponding to the user-customized NS server.
     */
    public VanityNameServersIps [] getVanityNameServersIps() {
        return this.VanityNameServersIps;
    }

    /**
     * Set IP address information corresponding to the user-customized NS server.
     * @param VanityNameServersIps IP address information corresponding to the user-customized NS server.
     */
    public void setVanityNameServersIps(VanityNameServersIps [] VanityNameServersIps) {
        this.VanityNameServersIps = VanityNameServersIps;
    }

    public NSDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NSDetail(NSDetail source) {
        if (source.CnameSpeedUp != null) {
            this.CnameSpeedUp = new String(source.CnameSpeedUp);
        }
        if (source.IsFake != null) {
            this.IsFake = new Long(source.IsFake);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CnameSpeedUp", this.CnameSpeedUp);
        this.setParamSimple(map, prefix + "IsFake", this.IsFake);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);
        this.setParamArraySimple(map, prefix + "OriginalNameServers.", this.OriginalNameServers);
        this.setParamArraySimple(map, prefix + "NameServers.", this.NameServers);
        this.setParamObj(map, prefix + "VanityNameServers.", this.VanityNameServers);
        this.setParamArrayObj(map, prefix + "VanityNameServersIps.", this.VanityNameServersIps);

    }
}

