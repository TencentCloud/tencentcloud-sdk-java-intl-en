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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspMemShellEvent extends AbstractModel {

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Server QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Server name
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Server IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * First detection time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last detection time
    */
    @SerializedName("RecentFoundTime")
    @Expose
    private String RecentFoundTime;

    /**
    * Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Class file md5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Class name
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * Parent class name
    */
    @SerializedName("SuperClassName")
    @Expose
    private String SuperClassName;

    /**
    * Inherited API
    */
    @SerializedName("Interfaces")
    @Expose
    private String Interfaces;

    /**
    * Annotation
    */
    @SerializedName("Annotations")
    @Expose
    private String Annotations;

    /**
    * Associated class loader.
    */
    @SerializedName("LoaderClassName")
    @Expose
    private String LoaderClassName;

    /**
    * Process ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Java Process Path
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * Java process command line parameters
    */
    @SerializedName("Args")
    @Expose
    private String Args;

    /**
    * Node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Node ID.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * container id
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Container running status
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * Container isolation status
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * Image ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * podip
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Same as the node id, the frontend can leave this unused.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Private ip address of the server
    */
    @SerializedName("HostInnerIP")
    @Expose
    private String HostInnerIP;

    /**
    * Public ip of the server
    */
    @SerializedName("HostPublicIP")
    @Expose
    private String HostPublicIP;

    /**
    * Regular node: NORMAL
Super node: SUPER
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Super Node Unique ID
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
     * Get Event ID 
     * @return Id Event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Server QUUID 
     * @return Quuid Server QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server QUUID
     * @param Quuid Server QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Server name 
     * @return Alias Server name
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Server name
     * @param Alias Server name
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Server IP address 
     * @return HostIp Server IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Server IP address
     * @param HostIp Server IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other 
     * @return Type Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
     * @param Type Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get First detection time 
     * @return CreateTime First detection time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set First detection time
     * @param CreateTime First detection time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last detection time 
     * @return RecentFoundTime Last detection time
     */
    public String getRecentFoundTime() {
        return this.RecentFoundTime;
    }

    /**
     * Set Last detection time
     * @param RecentFoundTime Last detection time
     */
    public void setRecentFoundTime(String RecentFoundTime) {
        this.RecentFoundTime = RecentFoundTime;
    }

    /**
     * Get Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed 
     * @return Status Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
     * @param Status Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Class file md5 
     * @return Md5 Class file md5
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set Class file md5
     * @param Md5 Class file md5
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Class name 
     * @return ClassName Class name
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set Class name
     * @param ClassName Class name
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get Parent class name 
     * @return SuperClassName Parent class name
     */
    public String getSuperClassName() {
        return this.SuperClassName;
    }

    /**
     * Set Parent class name
     * @param SuperClassName Parent class name
     */
    public void setSuperClassName(String SuperClassName) {
        this.SuperClassName = SuperClassName;
    }

    /**
     * Get Inherited API 
     * @return Interfaces Inherited API
     */
    public String getInterfaces() {
        return this.Interfaces;
    }

    /**
     * Set Inherited API
     * @param Interfaces Inherited API
     */
    public void setInterfaces(String Interfaces) {
        this.Interfaces = Interfaces;
    }

    /**
     * Get Annotation 
     * @return Annotations Annotation
     */
    public String getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set Annotation
     * @param Annotations Annotation
     */
    public void setAnnotations(String Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get Associated class loader. 
     * @return LoaderClassName Associated class loader.
     */
    public String getLoaderClassName() {
        return this.LoaderClassName;
    }

    /**
     * Set Associated class loader.
     * @param LoaderClassName Associated class loader.
     */
    public void setLoaderClassName(String LoaderClassName) {
        this.LoaderClassName = LoaderClassName;
    }

    /**
     * Get Process ID 
     * @return Pid Process ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Process ID
     * @param Pid Process ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Java Process Path 
     * @return Exe Java Process Path
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set Java Process Path
     * @param Exe Java Process Path
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get Java process command line parameters 
     * @return Args Java process command line parameters
     */
    public String getArgs() {
        return this.Args;
    }

    /**
     * Set Java process command line parameters
     * @param Args Java process command line parameters
     */
    public void setArgs(String Args) {
        this.Args = Args;
    }

    /**
     * Get Node name. 
     * @return NodeName Node name.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name.
     * @param NodeName Node name.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Node ID. 
     * @return NodeId Node ID.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID.
     * @param NodeId Node ID.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
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
     * Get container id 
     * @return ContainerId container id
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set container id
     * @param ContainerId container id
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get Container running status 
     * @return ContainerStatus Container running status
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set Container running status
     * @param ContainerStatus Container running status
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get Container isolation status 
     * @return ContainerNetStatus Container isolation status
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set Container isolation status
     * @param ContainerNetStatus Container isolation status
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get Image ID 
     * @return ImageId Image ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
     * @param ImageId Image ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
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
     * Get podip 
     * @return PodIp podip
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set podip
     * @param PodIp podip
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Same as the node id, the frontend can leave this unused. 
     * @return InstanceID Same as the node id, the frontend can leave this unused.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Same as the node id, the frontend can leave this unused.
     * @param InstanceID Same as the node id, the frontend can leave this unused.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Private ip address of the server 
     * @return HostInnerIP Private ip address of the server
     */
    public String getHostInnerIP() {
        return this.HostInnerIP;
    }

    /**
     * Set Private ip address of the server
     * @param HostInnerIP Private ip address of the server
     */
    public void setHostInnerIP(String HostInnerIP) {
        this.HostInnerIP = HostInnerIP;
    }

    /**
     * Get Public ip of the server 
     * @return HostPublicIP Public ip of the server
     */
    public String getHostPublicIP() {
        return this.HostPublicIP;
    }

    /**
     * Set Public ip of the server
     * @param HostPublicIP Public ip of the server
     */
    public void setHostPublicIP(String HostPublicIP) {
        this.HostPublicIP = HostPublicIP;
    }

    /**
     * Get Regular node: NORMAL
Super node: SUPER 
     * @return NodeType Regular node: NORMAL
Super node: SUPER
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Regular node: NORMAL
Super node: SUPER
     * @param NodeType Regular node: NORMAL
Super node: SUPER
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Super Node Unique ID 
     * @return NodeUniqueID Super Node Unique ID
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set Super Node Unique ID
     * @param NodeUniqueID Super Node Unique ID
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    public RaspMemShellEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspMemShellEvent(RaspMemShellEvent source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RecentFoundTime != null) {
            this.RecentFoundTime = new String(source.RecentFoundTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.SuperClassName != null) {
            this.SuperClassName = new String(source.SuperClassName);
        }
        if (source.Interfaces != null) {
            this.Interfaces = new String(source.Interfaces);
        }
        if (source.Annotations != null) {
            this.Annotations = new String(source.Annotations);
        }
        if (source.LoaderClassName != null) {
            this.LoaderClassName = new String(source.LoaderClassName);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.Args != null) {
            this.Args = new String(source.Args);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerStatus != null) {
            this.ContainerStatus = new String(source.ContainerStatus);
        }
        if (source.ContainerNetStatus != null) {
            this.ContainerNetStatus = new String(source.ContainerNetStatus);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.HostInnerIP != null) {
            this.HostInnerIP = new String(source.HostInnerIP);
        }
        if (source.HostPublicIP != null) {
            this.HostPublicIP = new String(source.HostPublicIP);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RecentFoundTime", this.RecentFoundTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "SuperClassName", this.SuperClassName);
        this.setParamSimple(map, prefix + "Interfaces", this.Interfaces);
        this.setParamSimple(map, prefix + "Annotations", this.Annotations);
        this.setParamSimple(map, prefix + "LoaderClassName", this.LoaderClassName);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Args", this.Args);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "HostInnerIP", this.HostInnerIP);
        this.setParamSimple(map, prefix + "HostPublicIP", this.HostPublicIP);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);

    }
}

