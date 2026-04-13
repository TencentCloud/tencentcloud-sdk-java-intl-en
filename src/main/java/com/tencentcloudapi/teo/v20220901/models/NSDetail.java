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
    * Specifies whether CNAME acceleration is enabled. valid values:.
<Li>Enabled: specifies whether the feature is enabled.</li>.
<li>disabled: specifies that the feature is turned off.</li>.
    */
    @SerializedName("CnameSpeedUp")
    @Expose
    private String CnameSpeedUp;

    /**
    * Existence of a site with the same name. valid values:.
<Li>0: no site with the same name exists.</li>.
<Li>Specifies the name already exists.</li>.
    */
    @SerializedName("IsFake")
    @Expose
    private Long IsFake;

    /**
    * Ownership verification information. for sites with NS access type, switching the current NS server to the designated NS server of tencent cloud EdgeOne is deemed as passing the ownership verification. for details, refer to [site/domain ownership verification](https://www.tencentcloud.comom/document/product/1552/70789?from_cn_redirect=1).
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
    * Lists the NS servers currently in use by the selected site detected by EdgeOne.
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * Lists the NS servers allocated by tencent cloud EdgeOne. requires pointing the current site's NS servers to this address for the changes to take effect.
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * Specifies the user-customized NS server domain name information. if enabled, the NS needs to be pointed to this address in the registered vendor of the domains.
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * Describes the IP address information of the user-customized NS server.
    */
    @SerializedName("VanityNameServersIps")
    @Expose
    private VanityNameServersIps [] VanityNameServersIps;

    /**
     * Get Specifies whether CNAME acceleration is enabled. valid values:.
<Li>Enabled: specifies whether the feature is enabled.</li>.
<li>disabled: specifies that the feature is turned off.</li>. 
     * @return CnameSpeedUp Specifies whether CNAME acceleration is enabled. valid values:.
<Li>Enabled: specifies whether the feature is enabled.</li>.
<li>disabled: specifies that the feature is turned off.</li>.
     */
    public String getCnameSpeedUp() {
        return this.CnameSpeedUp;
    }

    /**
     * Set Specifies whether CNAME acceleration is enabled. valid values:.
<Li>Enabled: specifies whether the feature is enabled.</li>.
<li>disabled: specifies that the feature is turned off.</li>.
     * @param CnameSpeedUp Specifies whether CNAME acceleration is enabled. valid values:.
<Li>Enabled: specifies whether the feature is enabled.</li>.
<li>disabled: specifies that the feature is turned off.</li>.
     */
    public void setCnameSpeedUp(String CnameSpeedUp) {
        this.CnameSpeedUp = CnameSpeedUp;
    }

    /**
     * Get Existence of a site with the same name. valid values:.
<Li>0: no site with the same name exists.</li>.
<Li>Specifies the name already exists.</li>. 
     * @return IsFake Existence of a site with the same name. valid values:.
<Li>0: no site with the same name exists.</li>.
<Li>Specifies the name already exists.</li>.
     */
    public Long getIsFake() {
        return this.IsFake;
    }

    /**
     * Set Existence of a site with the same name. valid values:.
<Li>0: no site with the same name exists.</li>.
<Li>Specifies the name already exists.</li>.
     * @param IsFake Existence of a site with the same name. valid values:.
<Li>0: no site with the same name exists.</li>.
<Li>Specifies the name already exists.</li>.
     */
    public void setIsFake(Long IsFake) {
        this.IsFake = IsFake;
    }

    /**
     * Get Ownership verification information. for sites with NS access type, switching the current NS server to the designated NS server of tencent cloud EdgeOne is deemed as passing the ownership verification. for details, refer to [site/domain ownership verification](https://www.tencentcloud.comom/document/product/1552/70789?from_cn_redirect=1). 
     * @return OwnershipVerification Ownership verification information. for sites with NS access type, switching the current NS server to the designated NS server of tencent cloud EdgeOne is deemed as passing the ownership verification. for details, refer to [site/domain ownership verification](https://www.tencentcloud.comom/document/product/1552/70789?from_cn_redirect=1).
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set Ownership verification information. for sites with NS access type, switching the current NS server to the designated NS server of tencent cloud EdgeOne is deemed as passing the ownership verification. for details, refer to [site/domain ownership verification](https://www.tencentcloud.comom/document/product/1552/70789?from_cn_redirect=1).
     * @param OwnershipVerification Ownership verification information. for sites with NS access type, switching the current NS server to the designated NS server of tencent cloud EdgeOne is deemed as passing the ownership verification. for details, refer to [site/domain ownership verification](https://www.tencentcloud.comom/document/product/1552/70789?from_cn_redirect=1).
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    /**
     * Get Lists the NS servers currently in use by the selected site detected by EdgeOne. 
     * @return OriginalNameServers Lists the NS servers currently in use by the selected site detected by EdgeOne.
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set Lists the NS servers currently in use by the selected site detected by EdgeOne.
     * @param OriginalNameServers Lists the NS servers currently in use by the selected site detected by EdgeOne.
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get Lists the NS servers allocated by tencent cloud EdgeOne. requires pointing the current site's NS servers to this address for the changes to take effect. 
     * @return NameServers Lists the NS servers allocated by tencent cloud EdgeOne. requires pointing the current site's NS servers to this address for the changes to take effect.
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set Lists the NS servers allocated by tencent cloud EdgeOne. requires pointing the current site's NS servers to this address for the changes to take effect.
     * @param NameServers Lists the NS servers allocated by tencent cloud EdgeOne. requires pointing the current site's NS servers to this address for the changes to take effect.
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get Specifies the user-customized NS server domain name information. if enabled, the NS needs to be pointed to this address in the registered vendor of the domains. 
     * @return VanityNameServers Specifies the user-customized NS server domain name information. if enabled, the NS needs to be pointed to this address in the registered vendor of the domains.
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set Specifies the user-customized NS server domain name information. if enabled, the NS needs to be pointed to this address in the registered vendor of the domains.
     * @param VanityNameServers Specifies the user-customized NS server domain name information. if enabled, the NS needs to be pointed to this address in the registered vendor of the domains.
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get Describes the IP address information of the user-customized NS server. 
     * @return VanityNameServersIps Describes the IP address information of the user-customized NS server.
     */
    public VanityNameServersIps [] getVanityNameServersIps() {
        return this.VanityNameServersIps;
    }

    /**
     * Set Describes the IP address information of the user-customized NS server.
     * @param VanityNameServersIps Describes the IP address information of the user-customized NS server.
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

