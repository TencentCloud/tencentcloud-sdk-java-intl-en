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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNodeInfo extends AbstractModel {

    /**
    * Database proxy node ID
    */
    @SerializedName("ProxyNodeId")
    @Expose
    private String ProxyNodeId;

    /**
    * Current node connections, which is not returned by the `DescribeProxyNodes` API.
    */
    @SerializedName("ProxyNodeConnections")
    @Expose
    private Long ProxyNodeConnections;

    /**
    * CPU of the database proxy node
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory of the database proxy node
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Status of the database proxy node
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Database proxy group ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * User AppID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

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
    * 
    */
    @SerializedName("OssProxyNodeName")
    @Expose
    private String OssProxyNodeName;

    /**
     * Get Database proxy node ID 
     * @return ProxyNodeId Database proxy node ID
     */
    public String getProxyNodeId() {
        return this.ProxyNodeId;
    }

    /**
     * Set Database proxy node ID
     * @param ProxyNodeId Database proxy node ID
     */
    public void setProxyNodeId(String ProxyNodeId) {
        this.ProxyNodeId = ProxyNodeId;
    }

    /**
     * Get Current node connections, which is not returned by the `DescribeProxyNodes` API. 
     * @return ProxyNodeConnections Current node connections, which is not returned by the `DescribeProxyNodes` API.
     */
    public Long getProxyNodeConnections() {
        return this.ProxyNodeConnections;
    }

    /**
     * Set Current node connections, which is not returned by the `DescribeProxyNodes` API.
     * @param ProxyNodeConnections Current node connections, which is not returned by the `DescribeProxyNodes` API.
     */
    public void setProxyNodeConnections(Long ProxyNodeConnections) {
        this.ProxyNodeConnections = ProxyNodeConnections;
    }

    /**
     * Get CPU of the database proxy node 
     * @return Cpu CPU of the database proxy node
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU of the database proxy node
     * @param Cpu CPU of the database proxy node
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory of the database proxy node 
     * @return Mem Memory of the database proxy node
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Memory of the database proxy node
     * @param Mem Memory of the database proxy node
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Status of the database proxy node 
     * @return Status Status of the database proxy node
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the database proxy node
     * @param Status Status of the database proxy node
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get User AppID 
     * @return AppId User AppID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppID
     * @param AppId User AppID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
     * Get  
     * @return OssProxyNodeName 
     */
    public String getOssProxyNodeName() {
        return this.OssProxyNodeName;
    }

    /**
     * Set 
     * @param OssProxyNodeName 
     */
    public void setOssProxyNodeName(String OssProxyNodeName) {
        this.OssProxyNodeName = OssProxyNodeName;
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

    }
}

