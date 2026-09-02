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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterContainerDetailResponse extends AbstractModel {

    /**
    * <p>Primary Account AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Container ID</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>Container startup CMD</p>
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * <p>Container creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Running state</p>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>Isolation status</p>
    */
    @SerializedName("IsolateStatus")
    @Expose
    private String IsolateStatus;

    /**
    * <p>Number of critical risk events</p>
    */
    @SerializedName("RiskEventCriticalCount")
    @Expose
    private Long RiskEventCriticalCount;

    /**
    * <p>Number of high-risk events</p>
    */
    @SerializedName("RiskEventHighCount")
    @Expose
    private Long RiskEventHighCount;

    /**
    * <p>Number of medium-risk events</p>
    */
    @SerializedName("RiskEventMiddleCount")
    @Expose
    private Long RiskEventMiddleCount;

    /**
    * <p>Number of low-risk events</p>
    */
    @SerializedName("RiskEventLowCount")
    @Expose
    private Long RiskEventLowCount;

    /**
    * <p>Image name.</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>Image ID.</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>Image size.</p>
    */
    @SerializedName("ImageSize")
    @Expose
    private String ImageSize;

    /**
    * <p>Image creation time</p>
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * <p>Node name.</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>Node private network IP</p>
    */
    @SerializedName("NodeInternalIP")
    @Expose
    private String NodeInternalIP;

    /**
    * <p>Node running status</p>
    */
    @SerializedName("NodeRunStatus")
    @Expose
    private String NodeRunStatus;

    /**
    * <p>Mount information list</p>
    */
    @SerializedName("Mounts")
    @Expose
    private ContainerMountItem [] Mounts;

    /**
    * <p>Network name</p>
    */
    @SerializedName("NetworkName")
    @Expose
    private String NetworkName;

    /**
    * <p>Network mode</p>
    */
    @SerializedName("NetworkMode")
    @Expose
    private String NetworkMode;

    /**
    * <p>Network ID</p>
    */
    @SerializedName("NetworkId")
    @Expose
    private String NetworkId;

    /**
    * <p>Endpoint ID</p>
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
    * <p>Gateway address</p>
    */
    @SerializedName("Gateway")
    @Expose
    private String Gateway;

    /**
    * <p>IPv4 address</p>
    */
    @SerializedName("IPv4")
    @Expose
    private String IPv4;

    /**
    * <p>IPv6 address</p>
    */
    @SerializedName("IPv6")
    @Expose
    private String IPv6;

    /**
    * <p>MAC address</p>
    */
    @SerializedName("MAC")
    @Expose
    private String MAC;

    /**
    * <p>Container name</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>Node instance ID</p>
    */
    @SerializedName("NodeInstanceId")
    @Expose
    private String NodeInstanceId;

    /**
    * <p>Node type of the container associated node</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>Unique ID of the node associated with the container</p>
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * <p>md5 value of the cluster ca certificate of the associated cluster and unique identifier of the cluster</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * <p>Whether the container image can be associated with records in the mirror repository</p>
    */
    @SerializedName("EnableLinkImage")
    @Expose
    private Boolean EnableLinkImage;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Primary Account AppID</p> 
     * @return AppID <p>Primary Account AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>Primary Account AppID</p>
     * @param AppID <p>Primary Account AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Container ID</p> 
     * @return ContainerId <p>Container ID</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>Container ID</p>
     * @param ContainerId <p>Container ID</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>Container startup CMD</p> 
     * @return Cmd <p>Container startup CMD</p>
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set <p>Container startup CMD</p>
     * @param Cmd <p>Container startup CMD</p>
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get <p>Container creation time</p> 
     * @return CreateTime <p>Container creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Container creation time</p>
     * @param CreateTime <p>Container creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Running state</p> 
     * @return RunStatus <p>Running state</p>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>Running state</p>
     * @param RunStatus <p>Running state</p>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
    }

    /**
     * Get <p>Isolation status</p> 
     * @return IsolateStatus <p>Isolation status</p>
     */
    public String getIsolateStatus() {
        return this.IsolateStatus;
    }

    /**
     * Set <p>Isolation status</p>
     * @param IsolateStatus <p>Isolation status</p>
     */
    public void setIsolateStatus(String IsolateStatus) {
        this.IsolateStatus = IsolateStatus;
    }

    /**
     * Get <p>Number of critical risk events</p> 
     * @return RiskEventCriticalCount <p>Number of critical risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventCriticalCount() {
        return this.RiskEventCriticalCount;
    }

    /**
     * Set <p>Number of critical risk events</p>
     * @param RiskEventCriticalCount <p>Number of critical risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventCriticalCount(Long RiskEventCriticalCount) {
        this.RiskEventCriticalCount = RiskEventCriticalCount;
    }

    /**
     * Get <p>Number of high-risk events</p> 
     * @return RiskEventHighCount <p>Number of high-risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventHighCount() {
        return this.RiskEventHighCount;
    }

    /**
     * Set <p>Number of high-risk events</p>
     * @param RiskEventHighCount <p>Number of high-risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventHighCount(Long RiskEventHighCount) {
        this.RiskEventHighCount = RiskEventHighCount;
    }

    /**
     * Get <p>Number of medium-risk events</p> 
     * @return RiskEventMiddleCount <p>Number of medium-risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventMiddleCount() {
        return this.RiskEventMiddleCount;
    }

    /**
     * Set <p>Number of medium-risk events</p>
     * @param RiskEventMiddleCount <p>Number of medium-risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventMiddleCount(Long RiskEventMiddleCount) {
        this.RiskEventMiddleCount = RiskEventMiddleCount;
    }

    /**
     * Get <p>Number of low-risk events</p> 
     * @return RiskEventLowCount <p>Number of low-risk events</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventLowCount() {
        return this.RiskEventLowCount;
    }

    /**
     * Set <p>Number of low-risk events</p>
     * @param RiskEventLowCount <p>Number of low-risk events</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventLowCount(Long RiskEventLowCount) {
        this.RiskEventLowCount = RiskEventLowCount;
    }

    /**
     * Get <p>Image name.</p> 
     * @return ImageName <p>Image name.</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>Image name.</p>
     * @param ImageName <p>Image name.</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>Image ID.</p> 
     * @return ImageId <p>Image ID.</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Image ID.</p>
     * @param ImageId <p>Image ID.</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>Image size.</p> 
     * @return ImageSize <p>Image size.</p>
     */
    public String getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set <p>Image size.</p>
     * @param ImageSize <p>Image size.</p>
     */
    public void setImageSize(String ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get <p>Image creation time</p> 
     * @return ImageCreateTime <p>Image creation time</p>
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set <p>Image creation time</p>
     * @param ImageCreateTime <p>Image creation time</p>
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
    }

    /**
     * Get <p>Node name.</p> 
     * @return NodeName <p>Node name.</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>Node name.</p>
     * @param NodeName <p>Node name.</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>Node private network IP</p> 
     * @return NodeInternalIP <p>Node private network IP</p>
     */
    public String getNodeInternalIP() {
        return this.NodeInternalIP;
    }

    /**
     * Set <p>Node private network IP</p>
     * @param NodeInternalIP <p>Node private network IP</p>
     */
    public void setNodeInternalIP(String NodeInternalIP) {
        this.NodeInternalIP = NodeInternalIP;
    }

    /**
     * Get <p>Node running status</p> 
     * @return NodeRunStatus <p>Node running status</p>
     */
    public String getNodeRunStatus() {
        return this.NodeRunStatus;
    }

    /**
     * Set <p>Node running status</p>
     * @param NodeRunStatus <p>Node running status</p>
     */
    public void setNodeRunStatus(String NodeRunStatus) {
        this.NodeRunStatus = NodeRunStatus;
    }

    /**
     * Get <p>Mount information list</p> 
     * @return Mounts <p>Mount information list</p>
     */
    public ContainerMountItem [] getMounts() {
        return this.Mounts;
    }

    /**
     * Set <p>Mount information list</p>
     * @param Mounts <p>Mount information list</p>
     */
    public void setMounts(ContainerMountItem [] Mounts) {
        this.Mounts = Mounts;
    }

    /**
     * Get <p>Network name</p> 
     * @return NetworkName <p>Network name</p>
     */
    public String getNetworkName() {
        return this.NetworkName;
    }

    /**
     * Set <p>Network name</p>
     * @param NetworkName <p>Network name</p>
     */
    public void setNetworkName(String NetworkName) {
        this.NetworkName = NetworkName;
    }

    /**
     * Get <p>Network mode</p> 
     * @return NetworkMode <p>Network mode</p>
     */
    public String getNetworkMode() {
        return this.NetworkMode;
    }

    /**
     * Set <p>Network mode</p>
     * @param NetworkMode <p>Network mode</p>
     */
    public void setNetworkMode(String NetworkMode) {
        this.NetworkMode = NetworkMode;
    }

    /**
     * Get <p>Network ID</p> 
     * @return NetworkId <p>Network ID</p>
     */
    public String getNetworkId() {
        return this.NetworkId;
    }

    /**
     * Set <p>Network ID</p>
     * @param NetworkId <p>Network ID</p>
     */
    public void setNetworkId(String NetworkId) {
        this.NetworkId = NetworkId;
    }

    /**
     * Get <p>Endpoint ID</p> 
     * @return EndpointId <p>Endpoint ID</p>
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set <p>Endpoint ID</p>
     * @param EndpointId <p>Endpoint ID</p>
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    /**
     * Get <p>Gateway address</p> 
     * @return Gateway <p>Gateway address</p>
     */
    public String getGateway() {
        return this.Gateway;
    }

    /**
     * Set <p>Gateway address</p>
     * @param Gateway <p>Gateway address</p>
     */
    public void setGateway(String Gateway) {
        this.Gateway = Gateway;
    }

    /**
     * Get <p>IPv4 address</p> 
     * @return IPv4 <p>IPv4 address</p>
     */
    public String getIPv4() {
        return this.IPv4;
    }

    /**
     * Set <p>IPv4 address</p>
     * @param IPv4 <p>IPv4 address</p>
     */
    public void setIPv4(String IPv4) {
        this.IPv4 = IPv4;
    }

    /**
     * Get <p>IPv6 address</p> 
     * @return IPv6 <p>IPv6 address</p>
     */
    public String getIPv6() {
        return this.IPv6;
    }

    /**
     * Set <p>IPv6 address</p>
     * @param IPv6 <p>IPv6 address</p>
     */
    public void setIPv6(String IPv6) {
        this.IPv6 = IPv6;
    }

    /**
     * Get <p>MAC address</p> 
     * @return MAC <p>MAC address</p>
     */
    public String getMAC() {
        return this.MAC;
    }

    /**
     * Set <p>MAC address</p>
     * @param MAC <p>MAC address</p>
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    /**
     * Get <p>Container name</p> 
     * @return ContainerName <p>Container name</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>Container name</p>
     * @param ContainerName <p>Container name</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>Node instance ID</p> 
     * @return NodeInstanceId <p>Node instance ID</p>
     */
    public String getNodeInstanceId() {
        return this.NodeInstanceId;
    }

    /**
     * Set <p>Node instance ID</p>
     * @param NodeInstanceId <p>Node instance ID</p>
     */
    public void setNodeInstanceId(String NodeInstanceId) {
        this.NodeInstanceId = NodeInstanceId;
    }

    /**
     * Get <p>Node type of the container associated node</p> 
     * @return NodeType <p>Node type of the container associated node</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Node type of the container associated node</p>
     * @param NodeType <p>Node type of the container associated node</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>Unique ID of the node associated with the container</p> 
     * @return NodeUniqueID <p>Unique ID of the node associated with the container</p>
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set <p>Unique ID of the node associated with the container</p>
     * @param NodeUniqueID <p>Unique ID of the node associated with the container</p>
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get <p>md5 value of the cluster ca certificate of the associated cluster and unique identifier of the cluster</p> 
     * @return ClusterCaMD5 <p>md5 value of the cluster ca certificate of the associated cluster and unique identifier of the cluster</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>md5 value of the cluster ca certificate of the associated cluster and unique identifier of the cluster</p>
     * @param ClusterCaMD5 <p>md5 value of the cluster ca certificate of the associated cluster and unique identifier of the cluster</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get <p>Whether the container image can be associated with records in the mirror repository</p> 
     * @return EnableLinkImage <p>Whether the container image can be associated with records in the mirror repository</p>
     */
    public Boolean getEnableLinkImage() {
        return this.EnableLinkImage;
    }

    /**
     * Set <p>Whether the container image can be associated with records in the mirror repository</p>
     * @param EnableLinkImage <p>Whether the container image can be associated with records in the mirror repository</p>
     */
    public void setEnableLinkImage(Boolean EnableLinkImage) {
        this.EnableLinkImage = EnableLinkImage;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterContainerDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterContainerDetailResponse(DescribeClusterContainerDetailResponse source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.IsolateStatus != null) {
            this.IsolateStatus = new String(source.IsolateStatus);
        }
        if (source.RiskEventCriticalCount != null) {
            this.RiskEventCriticalCount = new Long(source.RiskEventCriticalCount);
        }
        if (source.RiskEventHighCount != null) {
            this.RiskEventHighCount = new Long(source.RiskEventHighCount);
        }
        if (source.RiskEventMiddleCount != null) {
            this.RiskEventMiddleCount = new Long(source.RiskEventMiddleCount);
        }
        if (source.RiskEventLowCount != null) {
            this.RiskEventLowCount = new Long(source.RiskEventLowCount);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new String(source.ImageSize);
        }
        if (source.ImageCreateTime != null) {
            this.ImageCreateTime = new String(source.ImageCreateTime);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeInternalIP != null) {
            this.NodeInternalIP = new String(source.NodeInternalIP);
        }
        if (source.NodeRunStatus != null) {
            this.NodeRunStatus = new String(source.NodeRunStatus);
        }
        if (source.Mounts != null) {
            this.Mounts = new ContainerMountItem[source.Mounts.length];
            for (int i = 0; i < source.Mounts.length; i++) {
                this.Mounts[i] = new ContainerMountItem(source.Mounts[i]);
            }
        }
        if (source.NetworkName != null) {
            this.NetworkName = new String(source.NetworkName);
        }
        if (source.NetworkMode != null) {
            this.NetworkMode = new String(source.NetworkMode);
        }
        if (source.NetworkId != null) {
            this.NetworkId = new String(source.NetworkId);
        }
        if (source.EndpointId != null) {
            this.EndpointId = new String(source.EndpointId);
        }
        if (source.Gateway != null) {
            this.Gateway = new String(source.Gateway);
        }
        if (source.IPv4 != null) {
            this.IPv4 = new String(source.IPv4);
        }
        if (source.IPv6 != null) {
            this.IPv6 = new String(source.IPv6);
        }
        if (source.MAC != null) {
            this.MAC = new String(source.MAC);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.NodeInstanceId != null) {
            this.NodeInstanceId = new String(source.NodeInstanceId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.EnableLinkImage != null) {
            this.EnableLinkImage = new Boolean(source.EnableLinkImage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamSimple(map, prefix + "IsolateStatus", this.IsolateStatus);
        this.setParamSimple(map, prefix + "RiskEventCriticalCount", this.RiskEventCriticalCount);
        this.setParamSimple(map, prefix + "RiskEventHighCount", this.RiskEventHighCount);
        this.setParamSimple(map, prefix + "RiskEventMiddleCount", this.RiskEventMiddleCount);
        this.setParamSimple(map, prefix + "RiskEventLowCount", this.RiskEventLowCount);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeInternalIP", this.NodeInternalIP);
        this.setParamSimple(map, prefix + "NodeRunStatus", this.NodeRunStatus);
        this.setParamArrayObj(map, prefix + "Mounts.", this.Mounts);
        this.setParamSimple(map, prefix + "NetworkName", this.NetworkName);
        this.setParamSimple(map, prefix + "NetworkMode", this.NetworkMode);
        this.setParamSimple(map, prefix + "NetworkId", this.NetworkId);
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);
        this.setParamSimple(map, prefix + "Gateway", this.Gateway);
        this.setParamSimple(map, prefix + "IPv4", this.IPv4);
        this.setParamSimple(map, prefix + "IPv6", this.IPv6);
        this.setParamSimple(map, prefix + "MAC", this.MAC);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "NodeInstanceId", this.NodeInstanceId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamSimple(map, prefix + "EnableLinkImage", this.EnableLinkImage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

