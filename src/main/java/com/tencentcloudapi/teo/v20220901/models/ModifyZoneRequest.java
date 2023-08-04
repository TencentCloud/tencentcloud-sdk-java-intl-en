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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyZoneRequest extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Access mode of the site. Values:
<li> `full`: Access through a name server.</li>
<li> `partial`: Access through a CNAME u200drecord. A site using domainless access can only switch to CNAME access. </li>The original configuration applies if this field is not specified.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The custom name servers. The original configuration applies if this field is not specified. It is not allowed to pass this field when a site is connected without using a domain name.
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * The site alias. It can be up to 20 characters consisting of digits, letters, hyphens (-) and underscores (_).
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
    * The region where the site requests access. Values:
<li> `global`: Global coverage</li>
<li> `mainland`: Chinese mainland</li>
<li> `overseas`: Outside the Chinese mainland </li>It is not allowed to pass this field when a site is connected without using a domain name.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Name of the site. This field takes effect only when the site switches from domainless access to CNAME access.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Access mode of the site. Values:
<li> `full`: Access through a name server.</li>
<li> `partial`: Access through a CNAME u200drecord. A site using domainless access can only switch to CNAME access. </li>The original configuration applies if this field is not specified. 
     * @return Type Access mode of the site. Values:
<li> `full`: Access through a name server.</li>
<li> `partial`: Access through a CNAME u200drecord. A site using domainless access can only switch to CNAME access. </li>The original configuration applies if this field is not specified.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Access mode of the site. Values:
<li> `full`: Access through a name server.</li>
<li> `partial`: Access through a CNAME u200drecord. A site using domainless access can only switch to CNAME access. </li>The original configuration applies if this field is not specified.
     * @param Type Access mode of the site. Values:
<li> `full`: Access through a name server.</li>
<li> `partial`: Access through a CNAME u200drecord. A site using domainless access can only switch to CNAME access. </li>The original configuration applies if this field is not specified.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The custom name servers. The original configuration applies if this field is not specified. It is not allowed to pass this field when a site is connected without using a domain name. 
     * @return VanityNameServers The custom name servers. The original configuration applies if this field is not specified. It is not allowed to pass this field when a site is connected without using a domain name.
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set The custom name servers. The original configuration applies if this field is not specified. It is not allowed to pass this field when a site is connected without using a domain name.
     * @param VanityNameServers The custom name servers. The original configuration applies if this field is not specified. It is not allowed to pass this field when a site is connected without using a domain name.
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get The site alias. It can be up to 20 characters consisting of digits, letters, hyphens (-) and underscores (_). 
     * @return AliasZoneName The site alias. It can be up to 20 characters consisting of digits, letters, hyphens (-) and underscores (_).
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set The site alias. It can be up to 20 characters consisting of digits, letters, hyphens (-) and underscores (_).
     * @param AliasZoneName The site alias. It can be up to 20 characters consisting of digits, letters, hyphens (-) and underscores (_).
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    /**
     * Get The region where the site requests access. Values:
<li> `global`: Global coverage</li>
<li> `mainland`: Chinese mainland</li>
<li> `overseas`: Outside the Chinese mainland </li>It is not allowed to pass this field when a site is connected without using a domain name. 
     * @return Area The region where the site requests access. Values:
<li> `global`: Global coverage</li>
<li> `mainland`: Chinese mainland</li>
<li> `overseas`: Outside the Chinese mainland </li>It is not allowed to pass this field when a site is connected without using a domain name.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set The region where the site requests access. Values:
<li> `global`: Global coverage</li>
<li> `mainland`: Chinese mainland</li>
<li> `overseas`: Outside the Chinese mainland </li>It is not allowed to pass this field when a site is connected without using a domain name.
     * @param Area The region where the site requests access. Values:
<li> `global`: Global coverage</li>
<li> `mainland`: Chinese mainland</li>
<li> `overseas`: Outside the Chinese mainland </li>It is not allowed to pass this field when a site is connected without using a domain name.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Name of the site. This field takes effect only when the site switches from domainless access to CNAME access. 
     * @return ZoneName Name of the site. This field takes effect only when the site switches from domainless access to CNAME access.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Name of the site. This field takes effect only when the site switches from domainless access to CNAME access.
     * @param ZoneName Name of the site. This field takes effect only when the site switches from domainless access to CNAME access.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    public ModifyZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneRequest(ModifyZoneRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VanityNameServers != null) {
            this.VanityNameServers = new VanityNameServers(source.VanityNameServers);
        }
        if (source.AliasZoneName != null) {
            this.AliasZoneName = new String(source.AliasZoneName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "VanityNameServers.", this.VanityNameServers);
        this.setParamSimple(map, prefix + "AliasZoneName", this.AliasZoneName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

