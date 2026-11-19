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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneDomain extends AbstractModel {

    /**
    * <p>Custom or Preset</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Domain name.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Domain name status</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Bound environment slug. Default value: Production</p>
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * <p>Site ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Acceleration region</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>CNAME</p>
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>Primary domain name.</p>
    */
    @SerializedName("MainDomain")
    @Expose
    private String MainDomain;

    /**
    * <p>IPv6</p>
    */
    @SerializedName("Ipv6")
    @Expose
    private SwitchConfig Ipv6;

    /**
    * <p>HTTP/2</p>
    */
    @SerializedName("Http2")
    @Expose
    private SwitchConfig Http2;

    /**
    * <p>OCSP</p>
    */
    @SerializedName("OcspStapling")
    @Expose
    private SwitchConfig OcspStapling;

    /**
    * <p>Force HTTPS</p>
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirectConfig ForceRedirect;

    /**
    * <p>HSTS</p>
    */
    @SerializedName("Hsts")
    @Expose
    private HstsConfig Hsts;

    /**
    * <p>Ownership verification</p>
    */
    @SerializedName("OwnershipVerification")
    @Expose
    private OwnershipVerification OwnershipVerification;

    /**
     * Get <p>Custom or Preset</p> 
     * @return Type <p>Custom or Preset</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Custom or Preset</p>
     * @param Type <p>Custom or Preset</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Domain name.</p> 
     * @return Domain <p>Domain name.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain name.</p>
     * @param Domain <p>Domain name.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Domain name status</p> 
     * @return Status <p>Domain name status</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Domain name status</p>
     * @param Status <p>Domain name status</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Bound environment slug. Default value: Production</p> 
     * @return Env <p>Bound environment slug. Default value: Production</p>
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set <p>Bound environment slug. Default value: Production</p>
     * @param Env <p>Bound environment slug. Default value: Production</p>
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get <p>Site ID</p> 
     * @return ZoneId <p>Site ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID</p>
     * @param ZoneId <p>Site ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Acceleration region</p> 
     * @return Area <p>Acceleration region</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Acceleration region</p>
     * @param Area <p>Acceleration region</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>CNAME</p> 
     * @return Cname <p>CNAME</p>
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>CNAME</p>
     * @param Cname <p>CNAME</p>
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>Primary domain name.</p> 
     * @return MainDomain <p>Primary domain name.</p>
     */
    public String getMainDomain() {
        return this.MainDomain;
    }

    /**
     * Set <p>Primary domain name.</p>
     * @param MainDomain <p>Primary domain name.</p>
     */
    public void setMainDomain(String MainDomain) {
        this.MainDomain = MainDomain;
    }

    /**
     * Get <p>IPv6</p> 
     * @return Ipv6 <p>IPv6</p>
     */
    public SwitchConfig getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set <p>IPv6</p>
     * @param Ipv6 <p>IPv6</p>
     */
    public void setIpv6(SwitchConfig Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get <p>HTTP/2</p> 
     * @return Http2 <p>HTTP/2</p>
     */
    public SwitchConfig getHttp2() {
        return this.Http2;
    }

    /**
     * Set <p>HTTP/2</p>
     * @param Http2 <p>HTTP/2</p>
     */
    public void setHttp2(SwitchConfig Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get <p>OCSP</p> 
     * @return OcspStapling <p>OCSP</p>
     */
    public SwitchConfig getOcspStapling() {
        return this.OcspStapling;
    }

    /**
     * Set <p>OCSP</p>
     * @param OcspStapling <p>OCSP</p>
     */
    public void setOcspStapling(SwitchConfig OcspStapling) {
        this.OcspStapling = OcspStapling;
    }

    /**
     * Get <p>Force HTTPS</p> 
     * @return ForceRedirect <p>Force HTTPS</p>
     */
    public ForceRedirectConfig getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set <p>Force HTTPS</p>
     * @param ForceRedirect <p>Force HTTPS</p>
     */
    public void setForceRedirect(ForceRedirectConfig ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get <p>HSTS</p> 
     * @return Hsts <p>HSTS</p>
     */
    public HstsConfig getHsts() {
        return this.Hsts;
    }

    /**
     * Set <p>HSTS</p>
     * @param Hsts <p>HSTS</p>
     */
    public void setHsts(HstsConfig Hsts) {
        this.Hsts = Hsts;
    }

    /**
     * Get <p>Ownership verification</p> 
     * @return OwnershipVerification <p>Ownership verification</p>
     */
    public OwnershipVerification getOwnershipVerification() {
        return this.OwnershipVerification;
    }

    /**
     * Set <p>Ownership verification</p>
     * @param OwnershipVerification <p>Ownership verification</p>
     */
    public void setOwnershipVerification(OwnershipVerification OwnershipVerification) {
        this.OwnershipVerification = OwnershipVerification;
    }

    public ZoneDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneDomain(ZoneDomain source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.MainDomain != null) {
            this.MainDomain = new String(source.MainDomain);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new SwitchConfig(source.Ipv6);
        }
        if (source.Http2 != null) {
            this.Http2 = new SwitchConfig(source.Http2);
        }
        if (source.OcspStapling != null) {
            this.OcspStapling = new SwitchConfig(source.OcspStapling);
        }
        if (source.ForceRedirect != null) {
            this.ForceRedirect = new ForceRedirectConfig(source.ForceRedirect);
        }
        if (source.Hsts != null) {
            this.Hsts = new HstsConfig(source.Hsts);
        }
        if (source.OwnershipVerification != null) {
            this.OwnershipVerification = new OwnershipVerification(source.OwnershipVerification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "MainDomain", this.MainDomain);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "Http2.", this.Http2);
        this.setParamObj(map, prefix + "OcspStapling.", this.OcspStapling);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "Hsts.", this.Hsts);
        this.setParamObj(map, prefix + "OwnershipVerification.", this.OwnershipVerification);

    }
}

