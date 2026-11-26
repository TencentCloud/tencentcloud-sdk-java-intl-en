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

public class ModifyZoneRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Site access method. Valid values:
<li>full: NS access;</li>
<li>partial: CNAME access. If the site is currently accessed with no domain name, it can be switched only to CNAME access.</li>
<li>dnsPodAccess: DNSPod hosted access. To use this access mode, your domain name should have been hosted on DNSPod.</li>If this parameter is not input, the original configuration is maintained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Custom site info used as an alternative to the default name server assigned by the system. Maintain the original configuration if not specified. This parameter cannot be passed when the site uses the no domain access method.
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * Identical site identifier. Enter numbers, letters, ".", "-", and "_" only, up to 200 characters.
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
    * Site access region. Valid values:
<li> global: global;</li>
<li>mainland: Chinese mainland;</li>
<li> overseas: outside the Chinese mainland.</li>This parameter is not allowed when the site uses no domain access method.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Site name. This field is valid only when the site is switched from the no domain access method to the CNAME access method.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

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
     * Get Site access method. Valid values:
<li>full: NS access;</li>
<li>partial: CNAME access. If the site is currently accessed with no domain name, it can be switched only to CNAME access.</li>
<li>dnsPodAccess: DNSPod hosted access. To use this access mode, your domain name should have been hosted on DNSPod.</li>If this parameter is not input, the original configuration is maintained. 
     * @return Type Site access method. Valid values:
<li>full: NS access;</li>
<li>partial: CNAME access. If the site is currently accessed with no domain name, it can be switched only to CNAME access.</li>
<li>dnsPodAccess: DNSPod hosted access. To use this access mode, your domain name should have been hosted on DNSPod.</li>If this parameter is not input, the original configuration is maintained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Site access method. Valid values:
<li>full: NS access;</li>
<li>partial: CNAME access. If the site is currently accessed with no domain name, it can be switched only to CNAME access.</li>
<li>dnsPodAccess: DNSPod hosted access. To use this access mode, your domain name should have been hosted on DNSPod.</li>If this parameter is not input, the original configuration is maintained.
     * @param Type Site access method. Valid values:
<li>full: NS access;</li>
<li>partial: CNAME access. If the site is currently accessed with no domain name, it can be switched only to CNAME access.</li>
<li>dnsPodAccess: DNSPod hosted access. To use this access mode, your domain name should have been hosted on DNSPod.</li>If this parameter is not input, the original configuration is maintained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Custom site info used as an alternative to the default name server assigned by the system. Maintain the original configuration if not specified. This parameter cannot be passed when the site uses the no domain access method. 
     * @return VanityNameServers Custom site info used as an alternative to the default name server assigned by the system. Maintain the original configuration if not specified. This parameter cannot be passed when the site uses the no domain access method.
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set Custom site info used as an alternative to the default name server assigned by the system. Maintain the original configuration if not specified. This parameter cannot be passed when the site uses the no domain access method.
     * @param VanityNameServers Custom site info used as an alternative to the default name server assigned by the system. Maintain the original configuration if not specified. This parameter cannot be passed when the site uses the no domain access method.
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get Identical site identifier. Enter numbers, letters, ".", "-", and "_" only, up to 200 characters. 
     * @return AliasZoneName Identical site identifier. Enter numbers, letters, ".", "-", and "_" only, up to 200 characters.
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set Identical site identifier. Enter numbers, letters, ".", "-", and "_" only, up to 200 characters.
     * @param AliasZoneName Identical site identifier. Enter numbers, letters, ".", "-", and "_" only, up to 200 characters.
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    /**
     * Get Site access region. Valid values:
<li> global: global;</li>
<li>mainland: Chinese mainland;</li>
<li> overseas: outside the Chinese mainland.</li>This parameter is not allowed when the site uses no domain access method. 
     * @return Area Site access region. Valid values:
<li> global: global;</li>
<li>mainland: Chinese mainland;</li>
<li> overseas: outside the Chinese mainland.</li>This parameter is not allowed when the site uses no domain access method.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Site access region. Valid values:
<li> global: global;</li>
<li>mainland: Chinese mainland;</li>
<li> overseas: outside the Chinese mainland.</li>This parameter is not allowed when the site uses no domain access method.
     * @param Area Site access region. Valid values:
<li> global: global;</li>
<li>mainland: Chinese mainland;</li>
<li> overseas: outside the Chinese mainland.</li>This parameter is not allowed when the site uses no domain access method.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Site name. This field is valid only when the site is switched from the no domain access method to the CNAME access method. 
     * @return ZoneName Site name. This field is valid only when the site is switched from the no domain access method to the CNAME access method.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name. This field is valid only when the site is switched from the no domain access method to the CNAME access method.
     * @param ZoneName Site name. This field is valid only when the site is switched from the no domain access method to the CNAME access method.
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

