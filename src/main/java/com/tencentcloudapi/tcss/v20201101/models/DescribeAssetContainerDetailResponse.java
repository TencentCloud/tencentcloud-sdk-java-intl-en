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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetContainerDetailResponse extends AbstractModel {

    /**
    * Server ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Server IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Operator
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * Command line
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * CPU utilization * 1000
    */
    @SerializedName("CPUUsage")
    @Expose
    private Long CPUUsage;

    /**
    * Memory usage in KB
    */
    @SerializedName("RamUsage")
    @Expose
    private Long RamUsage;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Pod
    */
    @SerializedName("POD")
    @Expose
    private String POD;

    /**
    * K8s master node
    */
    @SerializedName("K8sMaster")
    @Expose
    private String K8sMaster;

    /**
    * Number of processes in the container
    */
    @SerializedName("ProcessCnt")
    @Expose
    private Long ProcessCnt;

    /**
    * Number of ports in the container
    */
    @SerializedName("PortCnt")
    @Expose
    private Long PortCnt;

    /**
    * Number of components
    */
    @SerializedName("ComponentCnt")
    @Expose
    private Long ComponentCnt;

    /**
    * Number of applications
    */
    @SerializedName("AppCnt")
    @Expose
    private Long AppCnt;

    /**
    * Number of web services
    */
    @SerializedName("WebServiceCnt")
    @Expose
    private Long WebServiceCnt;

    /**
    * Mount
    */
    @SerializedName("Mounts")
    @Expose
    private ContainerMount [] Mounts;

    /**
    * Container network information
    */
    @SerializedName("Network")
    @Expose
    private ContainerNetwork Network;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Image creation time
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * Image size
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * Server status. Valid values: `offline`, `online`, `pause`.
    */
    @SerializedName("HostStatus")
    @Expose
    private String HostStatus;

    /**
    * Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
    */
    @SerializedName("NetStatus")
    @Expose
    private String NetStatus;

    /**
    * Sub-status of the network
    */
    @SerializedName("NetSubStatus")
    @Expose
    private String NetSubStatus;

    /**
    * Isolation source
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolateSource")
    @Expose
    private String IsolateSource;

    /**
    * Isolation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * Node ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * Node name
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Node subnet ID
    */
    @SerializedName("NodeSubNetID")
    @Expose
    private String NodeSubNetID;

    /**
    * Node subnet name
    */
    @SerializedName("NodeSubNetName")
    @Expose
    private String NodeSubNetName;

    /**
    * Subnet IP range
    */
    @SerializedName("NodeSubNetCIDR")
    @Expose
    private String NodeSubNetCIDR;

    /**
    * Pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Pod IP
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * Pod status
    */
    @SerializedName("PodStatus")
    @Expose
    private String PodStatus;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Node type. Values: `NORMAL` (default), `SUPER`
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * UID of the super node
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * Public IP
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Server ID 
     * @return HostID Server ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set Server ID
     * @param HostID Server ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get Server IP 
     * @return HostIP Server IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server IP
     * @param HostIP Server IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Container name 
     * @return ContainerName Container name
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container name
     * @param ContainerName Container name
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Operator 
     * @return RunAs Operator
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set Operator
     * @param RunAs Operator
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get Command line 
     * @return Cmd Command line
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set Command line
     * @param Cmd Command line
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get CPU utilization * 1000 
     * @return CPUUsage CPU utilization * 1000
     */
    public Long getCPUUsage() {
        return this.CPUUsage;
    }

    /**
     * Set CPU utilization * 1000
     * @param CPUUsage CPU utilization * 1000
     */
    public void setCPUUsage(Long CPUUsage) {
        this.CPUUsage = CPUUsage;
    }

    /**
     * Get Memory usage in KB 
     * @return RamUsage Memory usage in KB
     */
    public Long getRamUsage() {
        return this.RamUsage;
    }

    /**
     * Set Memory usage in KB
     * @param RamUsage Memory usage in KB
     */
    public void setRamUsage(Long RamUsage) {
        this.RamUsage = RamUsage;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Image ID 
     * @return ImageID Image ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
     * @param ImageID Image ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get Pod 
     * @return POD Pod
     */
    public String getPOD() {
        return this.POD;
    }

    /**
     * Set Pod
     * @param POD Pod
     */
    public void setPOD(String POD) {
        this.POD = POD;
    }

    /**
     * Get K8s master node 
     * @return K8sMaster K8s master node
     */
    public String getK8sMaster() {
        return this.K8sMaster;
    }

    /**
     * Set K8s master node
     * @param K8sMaster K8s master node
     */
    public void setK8sMaster(String K8sMaster) {
        this.K8sMaster = K8sMaster;
    }

    /**
     * Get Number of processes in the container 
     * @return ProcessCnt Number of processes in the container
     */
    public Long getProcessCnt() {
        return this.ProcessCnt;
    }

    /**
     * Set Number of processes in the container
     * @param ProcessCnt Number of processes in the container
     */
    public void setProcessCnt(Long ProcessCnt) {
        this.ProcessCnt = ProcessCnt;
    }

    /**
     * Get Number of ports in the container 
     * @return PortCnt Number of ports in the container
     */
    public Long getPortCnt() {
        return this.PortCnt;
    }

    /**
     * Set Number of ports in the container
     * @param PortCnt Number of ports in the container
     */
    public void setPortCnt(Long PortCnt) {
        this.PortCnt = PortCnt;
    }

    /**
     * Get Number of components 
     * @return ComponentCnt Number of components
     */
    public Long getComponentCnt() {
        return this.ComponentCnt;
    }

    /**
     * Set Number of components
     * @param ComponentCnt Number of components
     */
    public void setComponentCnt(Long ComponentCnt) {
        this.ComponentCnt = ComponentCnt;
    }

    /**
     * Get Number of applications 
     * @return AppCnt Number of applications
     */
    public Long getAppCnt() {
        return this.AppCnt;
    }

    /**
     * Set Number of applications
     * @param AppCnt Number of applications
     */
    public void setAppCnt(Long AppCnt) {
        this.AppCnt = AppCnt;
    }

    /**
     * Get Number of web services 
     * @return WebServiceCnt Number of web services
     */
    public Long getWebServiceCnt() {
        return this.WebServiceCnt;
    }

    /**
     * Set Number of web services
     * @param WebServiceCnt Number of web services
     */
    public void setWebServiceCnt(Long WebServiceCnt) {
        this.WebServiceCnt = WebServiceCnt;
    }

    /**
     * Get Mount 
     * @return Mounts Mount
     */
    public ContainerMount [] getMounts() {
        return this.Mounts;
    }

    /**
     * Set Mount
     * @param Mounts Mount
     */
    public void setMounts(ContainerMount [] Mounts) {
        this.Mounts = Mounts;
    }

    /**
     * Get Container network information 
     * @return Network Container network information
     */
    public ContainerNetwork getNetwork() {
        return this.Network;
    }

    /**
     * Set Container network information
     * @param Network Container network information
     */
    public void setNetwork(ContainerNetwork Network) {
        this.Network = Network;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Image creation time 
     * @return ImageCreateTime Image creation time
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set Image creation time
     * @param ImageCreateTime Image creation time
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
    }

    /**
     * Get Image size 
     * @return ImageSize Image size
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set Image size
     * @param ImageSize Image size
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get Server status. Valid values: `offline`, `online`, `pause`. 
     * @return HostStatus Server status. Valid values: `offline`, `online`, `pause`.
     */
    public String getHostStatus() {
        return this.HostStatus;
    }

    /**
     * Set Server status. Valid values: `offline`, `online`, `pause`.
     * @param HostStatus Server status. Valid values: `offline`, `online`, `pause`.
     */
    public void setHostStatus(String HostStatus) {
        this.HostStatus = HostStatus;
    }

    /**
     * Get Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed. 
     * @return NetStatus Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
     */
    public String getNetStatus() {
        return this.NetStatus;
    }

    /**
     * Set Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
     * @param NetStatus Network status
`NORMAL`: 	Not isolated.
`ISOLATED`: 		Isolated.
`ISOLATING`: 		Isolating.
`ISOLATE_FAILED`: 	Isolation failed.
`RESTORING`: Recovering.
`RESTORE_FAILED`: Recovery failed.
     */
    public void setNetStatus(String NetStatus) {
        this.NetStatus = NetStatus;
    }

    /**
     * Get Sub-status of the network 
     * @return NetSubStatus Sub-status of the network
     */
    public String getNetSubStatus() {
        return this.NetSubStatus;
    }

    /**
     * Set Sub-status of the network
     * @param NetSubStatus Sub-status of the network
     */
    public void setNetSubStatus(String NetSubStatus) {
        this.NetSubStatus = NetSubStatus;
    }

    /**
     * Get Isolation source
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolateSource Isolation source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolateSource() {
        return this.IsolateSource;
    }

    /**
     * Set Isolation source
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolateSource Isolation source
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolateSource(String IsolateSource) {
        this.IsolateSource = IsolateSource;
    }

    /**
     * Get Isolation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolateTime Isolation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Isolation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolateTime Isolation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get Node ID 
     * @return NodeID Node ID
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set Node ID
     * @param NodeID Node ID
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get Node name 
     * @return NodeName Node name
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name
     * @param NodeName Node name
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Node subnet ID 
     * @return NodeSubNetID Node subnet ID
     */
    public String getNodeSubNetID() {
        return this.NodeSubNetID;
    }

    /**
     * Set Node subnet ID
     * @param NodeSubNetID Node subnet ID
     */
    public void setNodeSubNetID(String NodeSubNetID) {
        this.NodeSubNetID = NodeSubNetID;
    }

    /**
     * Get Node subnet name 
     * @return NodeSubNetName Node subnet name
     */
    public String getNodeSubNetName() {
        return this.NodeSubNetName;
    }

    /**
     * Set Node subnet name
     * @param NodeSubNetName Node subnet name
     */
    public void setNodeSubNetName(String NodeSubNetName) {
        this.NodeSubNetName = NodeSubNetName;
    }

    /**
     * Get Subnet IP range 
     * @return NodeSubNetCIDR Subnet IP range
     */
    public String getNodeSubNetCIDR() {
        return this.NodeSubNetCIDR;
    }

    /**
     * Set Subnet IP range
     * @param NodeSubNetCIDR Subnet IP range
     */
    public void setNodeSubNetCIDR(String NodeSubNetCIDR) {
        this.NodeSubNetCIDR = NodeSubNetCIDR;
    }

    /**
     * Get Pod name 
     * @return PodName Pod name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod name
     * @param PodName Pod name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Pod IP 
     * @return PodIP Pod IP
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set Pod IP
     * @param PodIP Pod IP
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get Pod status 
     * @return PodStatus Pod status
     */
    public String getPodStatus() {
        return this.PodStatus;
    }

    /**
     * Set Pod status
     * @param PodStatus Pod status
     */
    public void setPodStatus(String PodStatus) {
        this.PodStatus = PodStatus;
    }

    /**
     * Get Cluster ID 
     * @return ClusterID Cluster ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Cluster ID
     * @param ClusterID Cluster ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Node type. Values: `NORMAL` (default), `SUPER` 
     * @return NodeType Node type. Values: `NORMAL` (default), `SUPER`
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type. Values: `NORMAL` (default), `SUPER`
     * @param NodeType Node type. Values: `NORMAL` (default), `SUPER`
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get UID of the super node 
     * @return NodeUniqueID UID of the super node
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set UID of the super node
     * @param NodeUniqueID UID of the super node
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get Public IP 
     * @return PublicIP Public IP
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public IP
     * @param PublicIP Public IP
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAssetContainerDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetContainerDetailResponse(DescribeAssetContainerDetailResponse source) {
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.CPUUsage != null) {
            this.CPUUsage = new Long(source.CPUUsage);
        }
        if (source.RamUsage != null) {
            this.RamUsage = new Long(source.RamUsage);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.POD != null) {
            this.POD = new String(source.POD);
        }
        if (source.K8sMaster != null) {
            this.K8sMaster = new String(source.K8sMaster);
        }
        if (source.ProcessCnt != null) {
            this.ProcessCnt = new Long(source.ProcessCnt);
        }
        if (source.PortCnt != null) {
            this.PortCnt = new Long(source.PortCnt);
        }
        if (source.ComponentCnt != null) {
            this.ComponentCnt = new Long(source.ComponentCnt);
        }
        if (source.AppCnt != null) {
            this.AppCnt = new Long(source.AppCnt);
        }
        if (source.WebServiceCnt != null) {
            this.WebServiceCnt = new Long(source.WebServiceCnt);
        }
        if (source.Mounts != null) {
            this.Mounts = new ContainerMount[source.Mounts.length];
            for (int i = 0; i < source.Mounts.length; i++) {
                this.Mounts[i] = new ContainerMount(source.Mounts[i]);
            }
        }
        if (source.Network != null) {
            this.Network = new ContainerNetwork(source.Network);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ImageCreateTime != null) {
            this.ImageCreateTime = new String(source.ImageCreateTime);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.HostStatus != null) {
            this.HostStatus = new String(source.HostStatus);
        }
        if (source.NetStatus != null) {
            this.NetStatus = new String(source.NetStatus);
        }
        if (source.NetSubStatus != null) {
            this.NetSubStatus = new String(source.NetSubStatus);
        }
        if (source.IsolateSource != null) {
            this.IsolateSource = new String(source.IsolateSource);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeSubNetID != null) {
            this.NodeSubNetID = new String(source.NodeSubNetID);
        }
        if (source.NodeSubNetName != null) {
            this.NodeSubNetName = new String(source.NodeSubNetName);
        }
        if (source.NodeSubNetCIDR != null) {
            this.NodeSubNetCIDR = new String(source.NodeSubNetCIDR);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodStatus != null) {
            this.PodStatus = new String(source.PodStatus);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "CPUUsage", this.CPUUsage);
        this.setParamSimple(map, prefix + "RamUsage", this.RamUsage);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "POD", this.POD);
        this.setParamSimple(map, prefix + "K8sMaster", this.K8sMaster);
        this.setParamSimple(map, prefix + "ProcessCnt", this.ProcessCnt);
        this.setParamSimple(map, prefix + "PortCnt", this.PortCnt);
        this.setParamSimple(map, prefix + "ComponentCnt", this.ComponentCnt);
        this.setParamSimple(map, prefix + "AppCnt", this.AppCnt);
        this.setParamSimple(map, prefix + "WebServiceCnt", this.WebServiceCnt);
        this.setParamArrayObj(map, prefix + "Mounts.", this.Mounts);
        this.setParamObj(map, prefix + "Network.", this.Network);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "HostStatus", this.HostStatus);
        this.setParamSimple(map, prefix + "NetStatus", this.NetStatus);
        this.setParamSimple(map, prefix + "NetSubStatus", this.NetSubStatus);
        this.setParamSimple(map, prefix + "IsolateSource", this.IsolateSource);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeSubNetID", this.NodeSubNetID);
        this.setParamSimple(map, prefix + "NodeSubNetName", this.NodeSubNetName);
        this.setParamSimple(map, prefix + "NodeSubNetCIDR", this.NodeSubNetCIDR);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodStatus", this.PodStatus);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

