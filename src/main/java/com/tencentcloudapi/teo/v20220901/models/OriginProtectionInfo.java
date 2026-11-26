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

public class OriginProtectionInfo extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Domain name list.
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * List of proxy IDs.
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * IP allowlist of the current version.
    */
    @SerializedName("CurrentIPWhitelist")
    @Expose
    private IPWhitelist CurrentIPWhitelist;

    /**
    * Whether to update the origin server allowlist for this site. Valid values:
<li>true: The IP allowlist needs to be updated;</li>
<li>false: No need to update the IP allowlist.</li>
    */
    @SerializedName("NeedUpdate")
    @Expose
    private Boolean NeedUpdate;

    /**
    * Origin protection status. Valid values:
<li>online: origin protection enabled;</li>
<li>offline: Origin protection disabled;</li>
<li>nonactivate: Origin protection is inactive. It is only returned in calls for sites that have never used the origin protection feature.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether origin protection is supported for the site package, with values:
<li>true: support;</li>
<li>false: not supported.</li>
    */
    @SerializedName("PlanSupport")
    @Expose
    private Boolean PlanSupport;

    /**
    * Comparison between the latest IP allowlist and the current IP allowlist.
    */
    @SerializedName("DiffIPWhitelist")
    @Expose
    private DiffIPWhitelist DiffIPWhitelist;

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
     * Get Domain name list. 
     * @return Hosts Domain name list.
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set Domain name list.
     * @param Hosts Domain name list.
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get List of proxy IDs. 
     * @return ProxyIds List of proxy IDs.
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set List of proxy IDs.
     * @param ProxyIds List of proxy IDs.
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Get IP allowlist of the current version. 
     * @return CurrentIPWhitelist IP allowlist of the current version.
     */
    public IPWhitelist getCurrentIPWhitelist() {
        return this.CurrentIPWhitelist;
    }

    /**
     * Set IP allowlist of the current version.
     * @param CurrentIPWhitelist IP allowlist of the current version.
     */
    public void setCurrentIPWhitelist(IPWhitelist CurrentIPWhitelist) {
        this.CurrentIPWhitelist = CurrentIPWhitelist;
    }

    /**
     * Get Whether to update the origin server allowlist for this site. Valid values:
<li>true: The IP allowlist needs to be updated;</li>
<li>false: No need to update the IP allowlist.</li> 
     * @return NeedUpdate Whether to update the origin server allowlist for this site. Valid values:
<li>true: The IP allowlist needs to be updated;</li>
<li>false: No need to update the IP allowlist.</li>
     */
    public Boolean getNeedUpdate() {
        return this.NeedUpdate;
    }

    /**
     * Set Whether to update the origin server allowlist for this site. Valid values:
<li>true: The IP allowlist needs to be updated;</li>
<li>false: No need to update the IP allowlist.</li>
     * @param NeedUpdate Whether to update the origin server allowlist for this site. Valid values:
<li>true: The IP allowlist needs to be updated;</li>
<li>false: No need to update the IP allowlist.</li>
     */
    public void setNeedUpdate(Boolean NeedUpdate) {
        this.NeedUpdate = NeedUpdate;
    }

    /**
     * Get Origin protection status. Valid values:
<li>online: origin protection enabled;</li>
<li>offline: Origin protection disabled;</li>
<li>nonactivate: Origin protection is inactive. It is only returned in calls for sites that have never used the origin protection feature.</li> 
     * @return Status Origin protection status. Valid values:
<li>online: origin protection enabled;</li>
<li>offline: Origin protection disabled;</li>
<li>nonactivate: Origin protection is inactive. It is only returned in calls for sites that have never used the origin protection feature.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Origin protection status. Valid values:
<li>online: origin protection enabled;</li>
<li>offline: Origin protection disabled;</li>
<li>nonactivate: Origin protection is inactive. It is only returned in calls for sites that have never used the origin protection feature.</li>
     * @param Status Origin protection status. Valid values:
<li>online: origin protection enabled;</li>
<li>offline: Origin protection disabled;</li>
<li>nonactivate: Origin protection is inactive. It is only returned in calls for sites that have never used the origin protection feature.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether origin protection is supported for the site package, with values:
<li>true: support;</li>
<li>false: not supported.</li> 
     * @return PlanSupport Whether origin protection is supported for the site package, with values:
<li>true: support;</li>
<li>false: not supported.</li>
     */
    public Boolean getPlanSupport() {
        return this.PlanSupport;
    }

    /**
     * Set Whether origin protection is supported for the site package, with values:
<li>true: support;</li>
<li>false: not supported.</li>
     * @param PlanSupport Whether origin protection is supported for the site package, with values:
<li>true: support;</li>
<li>false: not supported.</li>
     */
    public void setPlanSupport(Boolean PlanSupport) {
        this.PlanSupport = PlanSupport;
    }

    /**
     * Get Comparison between the latest IP allowlist and the current IP allowlist. 
     * @return DiffIPWhitelist Comparison between the latest IP allowlist and the current IP allowlist.
     */
    public DiffIPWhitelist getDiffIPWhitelist() {
        return this.DiffIPWhitelist;
    }

    /**
     * Set Comparison between the latest IP allowlist and the current IP allowlist.
     * @param DiffIPWhitelist Comparison between the latest IP allowlist and the current IP allowlist.
     */
    public void setDiffIPWhitelist(DiffIPWhitelist DiffIPWhitelist) {
        this.DiffIPWhitelist = DiffIPWhitelist;
    }

    public OriginProtectionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginProtectionInfo(OriginProtectionInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.ProxyIds != null) {
            this.ProxyIds = new String[source.ProxyIds.length];
            for (int i = 0; i < source.ProxyIds.length; i++) {
                this.ProxyIds[i] = new String(source.ProxyIds[i]);
            }
        }
        if (source.CurrentIPWhitelist != null) {
            this.CurrentIPWhitelist = new IPWhitelist(source.CurrentIPWhitelist);
        }
        if (source.NeedUpdate != null) {
            this.NeedUpdate = new Boolean(source.NeedUpdate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PlanSupport != null) {
            this.PlanSupport = new Boolean(source.PlanSupport);
        }
        if (source.DiffIPWhitelist != null) {
            this.DiffIPWhitelist = new DiffIPWhitelist(source.DiffIPWhitelist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);
        this.setParamObj(map, prefix + "CurrentIPWhitelist.", this.CurrentIPWhitelist);
        this.setParamSimple(map, prefix + "NeedUpdate", this.NeedUpdate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PlanSupport", this.PlanSupport);
        this.setParamObj(map, prefix + "DiffIPWhitelist.", this.DiffIPWhitelist);

    }
}

