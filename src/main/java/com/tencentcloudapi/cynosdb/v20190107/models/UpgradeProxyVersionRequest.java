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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeProxyVersionRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Current version of database proxy
    */
    @SerializedName("SrcProxyVersion")
    @Expose
    private String SrcProxyVersion;

    /**
    * Target version of database proxy
    */
    @SerializedName("DstProxyVersion")
    @Expose
    private String DstProxyVersion;

    /**
    * Database proxy group ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Upgrade time. Valid values: `no` (upon upgrade completion), `yes` (upgrade during instance maintenance time)
    */
    @SerializedName("IsInMaintainPeriod")
    @Expose
    private String IsInMaintainPeriod;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Current version of database proxy 
     * @return SrcProxyVersion Current version of database proxy
     */
    public String getSrcProxyVersion() {
        return this.SrcProxyVersion;
    }

    /**
     * Set Current version of database proxy
     * @param SrcProxyVersion Current version of database proxy
     */
    public void setSrcProxyVersion(String SrcProxyVersion) {
        this.SrcProxyVersion = SrcProxyVersion;
    }

    /**
     * Get Target version of database proxy 
     * @return DstProxyVersion Target version of database proxy
     */
    public String getDstProxyVersion() {
        return this.DstProxyVersion;
    }

    /**
     * Set Target version of database proxy
     * @param DstProxyVersion Target version of database proxy
     */
    public void setDstProxyVersion(String DstProxyVersion) {
        this.DstProxyVersion = DstProxyVersion;
    }

    /**
     * Get Database proxy group ID 
     * @return ProxyGroupId Database proxy group ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Database proxy group ID
     * @param ProxyGroupId Database proxy group ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Upgrade time. Valid values: `no` (upon upgrade completion), `yes` (upgrade during instance maintenance time) 
     * @return IsInMaintainPeriod Upgrade time. Valid values: `no` (upon upgrade completion), `yes` (upgrade during instance maintenance time)
     */
    public String getIsInMaintainPeriod() {
        return this.IsInMaintainPeriod;
    }

    /**
     * Set Upgrade time. Valid values: `no` (upon upgrade completion), `yes` (upgrade during instance maintenance time)
     * @param IsInMaintainPeriod Upgrade time. Valid values: `no` (upon upgrade completion), `yes` (upgrade during instance maintenance time)
     */
    public void setIsInMaintainPeriod(String IsInMaintainPeriod) {
        this.IsInMaintainPeriod = IsInMaintainPeriod;
    }

    public UpgradeProxyVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeProxyVersionRequest(UpgradeProxyVersionRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SrcProxyVersion != null) {
            this.SrcProxyVersion = new String(source.SrcProxyVersion);
        }
        if (source.DstProxyVersion != null) {
            this.DstProxyVersion = new String(source.DstProxyVersion);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.IsInMaintainPeriod != null) {
            this.IsInMaintainPeriod = new String(source.IsInMaintainPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "SrcProxyVersion", this.SrcProxyVersion);
        this.setParamSimple(map, prefix + "DstProxyVersion", this.DstProxyVersion);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "IsInMaintainPeriod", this.IsInMaintainPeriod);

    }
}

