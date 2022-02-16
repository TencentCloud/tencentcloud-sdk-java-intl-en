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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseGroupInfo extends AbstractModel{

    /**
    * Proxy group ID
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Number of proxy nodes
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Proxy group status. Valid values: `init` (delivering), `online` (active), `offline` (inactive), `destroy` (destoryed)
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Region
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Availability zone
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Whether read/write separation is enabled
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("OpenRW")
    @Expose
    private Boolean OpenRW;

    /**
    * Current proxy version
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * Target version to which the proxy can be upgraded
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("SupportUpgradeProxyVersion")
    @Expose
    private String SupportUpgradeProxyVersion;

    /**
     * Get Proxy group ID
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ProxyGroupId Proxy group ID
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Proxy group ID
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ProxyGroupId Proxy group ID
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Number of proxy nodes
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return NodeCount Number of proxy nodes
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of proxy nodes
Note: this field may return `null`, indicating that no valid value can be found.
     * @param NodeCount Number of proxy nodes
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Proxy group status. Valid values: `init` (delivering), `online` (active), `offline` (inactive), `destroy` (destoryed)
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Status Proxy group status. Valid values: `init` (delivering), `online` (active), `offline` (inactive), `destroy` (destoryed)
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Proxy group status. Valid values: `init` (delivering), `online` (active), `offline` (inactive), `destroy` (destoryed)
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Status Proxy group status. Valid values: `init` (delivering), `online` (active), `offline` (inactive), `destroy` (destoryed)
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Region
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Region Region
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Region Region
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Availability zone
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Zone Availability zone
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Zone Availability zone
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Whether read/write separation is enabled
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return OpenRW Whether read/write separation is enabled
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Boolean getOpenRW() {
        return this.OpenRW;
    }

    /**
     * Set Whether read/write separation is enabled
Note: this field may return `null`, indicating that no valid value can be found.
     * @param OpenRW Whether read/write separation is enabled
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setOpenRW(Boolean OpenRW) {
        this.OpenRW = OpenRW;
    }

    /**
     * Get Current proxy version
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return CurrentProxyVersion Current proxy version
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set Current proxy version
Note: this field may return `null`, indicating that no valid value can be found.
     * @param CurrentProxyVersion Current proxy version
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

    /**
     * Get Target version to which the proxy can be upgraded
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return SupportUpgradeProxyVersion Target version to which the proxy can be upgraded
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getSupportUpgradeProxyVersion() {
        return this.SupportUpgradeProxyVersion;
    }

    /**
     * Set Target version to which the proxy can be upgraded
Note: this field may return `null`, indicating that no valid value can be found.
     * @param SupportUpgradeProxyVersion Target version to which the proxy can be upgraded
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setSupportUpgradeProxyVersion(String SupportUpgradeProxyVersion) {
        this.SupportUpgradeProxyVersion = SupportUpgradeProxyVersion;
    }

    public BaseGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseGroupInfo(BaseGroupInfo source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.OpenRW != null) {
            this.OpenRW = new Boolean(source.OpenRW);
        }
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.SupportUpgradeProxyVersion != null) {
            this.SupportUpgradeProxyVersion = new String(source.SupportUpgradeProxyVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "OpenRW", this.OpenRW);
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamSimple(map, prefix + "SupportUpgradeProxyVersion", this.SupportUpgradeProxyVersion);

    }
}

