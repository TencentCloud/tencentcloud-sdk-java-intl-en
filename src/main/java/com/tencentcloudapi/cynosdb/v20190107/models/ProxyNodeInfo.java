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

public class ProxyNodeInfo extends AbstractModel {

    /**
    * <p>Database Proxy Node ID</p>
    */
    @SerializedName("ProxyNodeId")
    @Expose
    private String ProxyNodeId;

    /**
    * <p>Current connection number of nodes. This field value does not return in the DescribeProxyNodes API.</p>
    */
    @SerializedName("ProxyNodeConnections")
    @Expose
    private Long ProxyNodeConnections;

    /**
    * <p>Database proxy node cpu</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Database proxy node memory</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * <p>Database Proxy Node Status</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Database Proxy Group ID</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>User AppID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>AZ.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Database Proxy Node Name</p>
    */
    @SerializedName("OssProxyNodeName")
    @Expose
    private String OssProxyNodeName;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Database Proxy Node ID</p> 
     * @return ProxyNodeId <p>Database Proxy Node ID</p>
     */
    public String getProxyNodeId() {
        return this.ProxyNodeId;
    }

    /**
     * Set <p>Database Proxy Node ID</p>
     * @param ProxyNodeId <p>Database Proxy Node ID</p>
     */
    public void setProxyNodeId(String ProxyNodeId) {
        this.ProxyNodeId = ProxyNodeId;
    }

    /**
     * Get <p>Current connection number of nodes. This field value does not return in the DescribeProxyNodes API.</p> 
     * @return ProxyNodeConnections <p>Current connection number of nodes. This field value does not return in the DescribeProxyNodes API.</p>
     */
    public Long getProxyNodeConnections() {
        return this.ProxyNodeConnections;
    }

    /**
     * Set <p>Current connection number of nodes. This field value does not return in the DescribeProxyNodes API.</p>
     * @param ProxyNodeConnections <p>Current connection number of nodes. This field value does not return in the DescribeProxyNodes API.</p>
     */
    public void setProxyNodeConnections(Long ProxyNodeConnections) {
        this.ProxyNodeConnections = ProxyNodeConnections;
    }

    /**
     * Get <p>Database proxy node cpu</p> 
     * @return Cpu <p>Database proxy node cpu</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Database proxy node cpu</p>
     * @param Cpu <p>Database proxy node cpu</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Database proxy node memory</p> 
     * @return Mem <p>Database proxy node memory</p>
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>Database proxy node memory</p>
     * @param Mem <p>Database proxy node memory</p>
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>Database Proxy Node Status</p> 
     * @return Status <p>Database Proxy Node Status</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Database Proxy Node Status</p>
     * @param Status <p>Database Proxy Node Status</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Database Proxy Group ID</p> 
     * @return ProxyGroupId <p>Database Proxy Group ID</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>Database Proxy Group ID</p>
     * @param ProxyGroupId <p>Database Proxy Group ID</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>User AppID</p> 
     * @return AppId <p>User AppID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>User AppID</p>
     * @param AppId <p>User AppID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Region.</p> 
     * @return Region <p>Region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region.</p>
     * @param Region <p>Region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>AZ.</p> 
     * @return Zone <p>AZ.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ.</p>
     * @param Zone <p>AZ.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Database Proxy Node Name</p> 
     * @return OssProxyNodeName <p>Database Proxy Node Name</p>
     */
    public String getOssProxyNodeName() {
        return this.OssProxyNodeName;
    }

    /**
     * Set <p>Database Proxy Node Name</p>
     * @param OssProxyNodeName <p>Database Proxy Node Name</p>
     */
    public void setOssProxyNodeName(String OssProxyNodeName) {
        this.OssProxyNodeName = OssProxyNodeName;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ProxyNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyNodeInfo(ProxyNodeInfo source) {
        if (source.ProxyNodeId != null) {
            this.ProxyNodeId = new String(source.ProxyNodeId);
        }
        if (source.ProxyNodeConnections != null) {
            this.ProxyNodeConnections = new Long(source.ProxyNodeConnections);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.OssProxyNodeName != null) {
            this.OssProxyNodeName = new String(source.OssProxyNodeName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyNodeId", this.ProxyNodeId);
        this.setParamSimple(map, prefix + "ProxyNodeConnections", this.ProxyNodeConnections);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "OssProxyNodeName", this.OssProxyNodeName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

