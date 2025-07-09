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

public class ProxyGroup extends AbstractModel {

    /**
    * Database proxy group ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Number of nodes in the proxy group
    */
    @SerializedName("ProxyNodeCount")
    @Expose
    private Long ProxyNodeCount;

    /**
    * Database proxy group status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Current proxy version
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * User AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Specifies that a read-write node activates the database proxy.
    */
    @SerializedName("OpenRw")
    @Expose
    private String OpenRw;

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
     * Get Number of nodes in the proxy group 
     * @return ProxyNodeCount Number of nodes in the proxy group
     */
    public Long getProxyNodeCount() {
        return this.ProxyNodeCount;
    }

    /**
     * Set Number of nodes in the proxy group
     * @param ProxyNodeCount Number of nodes in the proxy group
     */
    public void setProxyNodeCount(Long ProxyNodeCount) {
        this.ProxyNodeCount = ProxyNodeCount;
    }

    /**
     * Get Database proxy group status 
     * @return Status Database proxy group status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Database proxy group status
     * @param Status Database proxy group status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get AZ 
     * @return Zone AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ
     * @param Zone AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Current proxy version 
     * @return CurrentProxyVersion Current proxy version
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set Current proxy version
     * @param CurrentProxyVersion Current proxy version
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

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
     * Get User AppId 
     * @return AppId User AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppId
     * @param AppId User AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Specifies that a read-write node activates the database proxy. 
     * @return OpenRw Specifies that a read-write node activates the database proxy.
     */
    public String getOpenRw() {
        return this.OpenRw;
    }

    /**
     * Set Specifies that a read-write node activates the database proxy.
     * @param OpenRw Specifies that a read-write node activates the database proxy.
     */
    public void setOpenRw(String OpenRw) {
        this.OpenRw = OpenRw;
    }

    public ProxyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroup(ProxyGroup source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyNodeCount != null) {
            this.ProxyNodeCount = new Long(source.ProxyNodeCount);
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
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OpenRw != null) {
            this.OpenRw = new String(source.OpenRw);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ProxyNodeCount", this.ProxyNodeCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OpenRw", this.OpenRw);

    }
}

