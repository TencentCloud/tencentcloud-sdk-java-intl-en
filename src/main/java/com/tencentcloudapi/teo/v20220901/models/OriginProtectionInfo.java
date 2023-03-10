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

public class OriginProtectionInfo extends AbstractModel{

    /**
    * ID of the site.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * List of domain names.
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
    * The existing intermediate IPs.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentIPWhitelist")
    @Expose
    private IPWhitelist CurrentIPWhitelist;

    /**
    * Whether the intermediate IP update is needed for the site. Values:
<li>`true`: Update needed;</li>
<li>`false`: Update not needed.</li>
    */
    @SerializedName("NeedUpdate")
    @Expose
    private Boolean NeedUpdate;

    /**
    * Status of the origin protection configuration. Values:
<li>`online`: Origin protection is activated;</li>
<li>`offline`: Origin protection is disabled.</li>
<li>`nonactivate`: Origin protection is not activated. This value is returned only when the feature is not activated before it’s used.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether origin protection is supported in the plan. Values:
<li>`true`: Origin protection supported;</li>
<li>`false`: Origin protection not supported.</li>
    */
    @SerializedName("PlanSupport")
    @Expose
    private Boolean PlanSupport;

    /**
    * Differences between the latest and existing intermediate IPs.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DiffIPWhitelist")
    @Expose
    private DiffIPWhitelist DiffIPWhitelist;

    /**
     * Get ID of the site. 
     * @return ZoneId ID of the site.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site.
     * @param ZoneId ID of the site.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get List of domain names. 
     * @return Hosts List of domain names.
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set List of domain names.
     * @param Hosts List of domain names.
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
     * Get The existing intermediate IPs.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CurrentIPWhitelist The existing intermediate IPs.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public IPWhitelist getCurrentIPWhitelist() {
        return this.CurrentIPWhitelist;
    }

    /**
     * Set The existing intermediate IPs.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CurrentIPWhitelist The existing intermediate IPs.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCurrentIPWhitelist(IPWhitelist CurrentIPWhitelist) {
        this.CurrentIPWhitelist = CurrentIPWhitelist;
    }

    /**
     * Get Whether the intermediate IP update is needed for the site. Values:
<li>`true`: Update needed;</li>
<li>`false`: Update not needed.</li> 
     * @return NeedUpdate Whether the intermediate IP update is needed for the site. Values:
<li>`true`: Update needed;</li>
<li>`false`: Update not needed.</li>
     */
    public Boolean getNeedUpdate() {
        return this.NeedUpdate;
    }

    /**
     * Set Whether the intermediate IP update is needed for the site. Values:
<li>`true`: Update needed;</li>
<li>`false`: Update not needed.</li>
     * @param NeedUpdate Whether the intermediate IP update is needed for the site. Values:
<li>`true`: Update needed;</li>
<li>`false`: Update not needed.</li>
     */
    public void setNeedUpdate(Boolean NeedUpdate) {
        this.NeedUpdate = NeedUpdate;
    }

    /**
     * Get Status of the origin protection configuration. Values:
<li>`online`: Origin protection is activated;</li>
<li>`offline`: Origin protection is disabled.</li>
<li>`nonactivate`: Origin protection is not activated. This value is returned only when the feature is not activated before it’s used.</li> 
     * @return Status Status of the origin protection configuration. Values:
<li>`online`: Origin protection is activated;</li>
<li>`offline`: Origin protection is disabled.</li>
<li>`nonactivate`: Origin protection is not activated. This value is returned only when the feature is not activated before it’s used.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the origin protection configuration. Values:
<li>`online`: Origin protection is activated;</li>
<li>`offline`: Origin protection is disabled.</li>
<li>`nonactivate`: Origin protection is not activated. This value is returned only when the feature is not activated before it’s used.</li>
     * @param Status Status of the origin protection configuration. Values:
<li>`online`: Origin protection is activated;</li>
<li>`offline`: Origin protection is disabled.</li>
<li>`nonactivate`: Origin protection is not activated. This value is returned only when the feature is not activated before it’s used.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether origin protection is supported in the plan. Values:
<li>`true`: Origin protection supported;</li>
<li>`false`: Origin protection not supported.</li> 
     * @return PlanSupport Whether origin protection is supported in the plan. Values:
<li>`true`: Origin protection supported;</li>
<li>`false`: Origin protection not supported.</li>
     */
    public Boolean getPlanSupport() {
        return this.PlanSupport;
    }

    /**
     * Set Whether origin protection is supported in the plan. Values:
<li>`true`: Origin protection supported;</li>
<li>`false`: Origin protection not supported.</li>
     * @param PlanSupport Whether origin protection is supported in the plan. Values:
<li>`true`: Origin protection supported;</li>
<li>`false`: Origin protection not supported.</li>
     */
    public void setPlanSupport(Boolean PlanSupport) {
        this.PlanSupport = PlanSupport;
    }

    /**
     * Get Differences between the latest and existing intermediate IPs.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DiffIPWhitelist Differences between the latest and existing intermediate IPs.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public DiffIPWhitelist getDiffIPWhitelist() {
        return this.DiffIPWhitelist;
    }

    /**
     * Set Differences between the latest and existing intermediate IPs.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DiffIPWhitelist Differences between the latest and existing intermediate IPs.
Note: This field may return `null`, indicating that no valid values can be obtained.
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

