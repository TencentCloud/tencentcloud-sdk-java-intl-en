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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeInfo extends AbstractModel {

    /**
    * <p>Node IP information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * <p>Node types, such as sqlengine, tdstore, mc</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Unique identifier of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>Node port information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>Availability zone of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Machine ip of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Node log service information</p>
    */
    @SerializedName("BinlogInfo")
    @Expose
    private BinlogInfo [] BinlogInfo;

    /**
    * <p>Number of CPUs of the node</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Node mem size</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * <p>Node disk size</p>
    */
    @SerializedName("DataDisk")
    @Expose
    private Long DataDisk;

    /**
     * Get <p>Node IP information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IP <p>Node IP information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set <p>Node IP information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IP <p>Node IP information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get <p>Node types, such as sqlengine, tdstore, mc</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type <p>Node types, such as sqlengine, tdstore, mc</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Node types, such as sqlengine, tdstore, mc</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type <p>Node types, such as sqlengine, tdstore, mc</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Unique identifier of the node</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeId <p>Unique identifier of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>Unique identifier of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeId <p>Unique identifier of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>Node port information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port <p>Node port information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>Node port information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port <p>Node port information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Availability zone of the node</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone <p>Availability zone of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Availability zone of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone <p>Availability zone of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Machine ip of the node</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Host <p>Machine ip of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Machine ip of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Host <p>Machine ip of the node</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Node log service information</p> 
     * @return BinlogInfo <p>Node log service information</p>
     */
    public BinlogInfo [] getBinlogInfo() {
        return this.BinlogInfo;
    }

    /**
     * Set <p>Node log service information</p>
     * @param BinlogInfo <p>Node log service information</p>
     */
    public void setBinlogInfo(BinlogInfo [] BinlogInfo) {
        this.BinlogInfo = BinlogInfo;
    }

    /**
     * Get <p>Number of CPUs of the node</p> 
     * @return Cpu <p>Number of CPUs of the node</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Number of CPUs of the node</p>
     * @param Cpu <p>Number of CPUs of the node</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Node mem size</p> 
     * @return Mem <p>Node mem size</p>
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>Node mem size</p>
     * @param Mem <p>Node mem size</p>
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>Node disk size</p> 
     * @return DataDisk <p>Node disk size</p>
     */
    public Long getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set <p>Node disk size</p>
     * @param DataDisk <p>Node disk size</p>
     */
    public void setDataDisk(Long DataDisk) {
        this.DataDisk = DataDisk;
    }

    public NodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeInfo(NodeInfo source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.BinlogInfo != null) {
            this.BinlogInfo = new BinlogInfo[source.BinlogInfo.length];
            for (int i = 0; i < source.BinlogInfo.length; i++) {
                this.BinlogInfo[i] = new BinlogInfo(source.BinlogInfo[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new Long(source.DataDisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamArrayObj(map, prefix + "BinlogInfo.", this.BinlogInfo);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "DataDisk", this.DataDisk);

    }
}

