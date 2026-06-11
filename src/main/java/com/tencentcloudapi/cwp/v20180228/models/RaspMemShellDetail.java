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

public class RaspMemShellDetail extends AbstractModel {

    /**
    * Event ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Server QUUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Server name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Host tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostTags")
    @Expose
    private String [] HostTags;

    /**
    * Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Associated class loader.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassLoaderName")
    @Expose
    private String ClassLoaderName;

    /**
    * Parent class name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuperClassName")
    @Expose
    private String SuperClassName;

    /**
    * Inherited API
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Interfaces")
    @Expose
    private String Interfaces;

    /**
    * Annotation
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Annotations")
    @Expose
    private String Annotations;

    /**
    * Class name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * Class file md5
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Process ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Java Process Path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * Java process command line parameters
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Args")
    @Expose
    private String Args;

    /**
    * Java Memory Horse Binary Code (base64)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassContent")
    @Expose
    private String ClassContent;

    /**
    * Java Memory Trojan Decompilation Code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassContentPretty")
    @Expose
    private String ClassContentPretty;

    /**
    * Event description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventDescription")
    @Expose
    private String EventDescription;

    /**
    * Security advice
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityAdvice")
    @Expose
    private String SecurityAdvice;

    /**
    * First detection time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last detection time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecentFoundTime")
    @Expose
    private String RecentFoundTime;

    /**
    * Node name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Container name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * container id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Container running status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * Container isolation status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * Image ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Pod name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * podip
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get Event ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Server QUUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuid Server QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuid Server QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Server name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Alias Server name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Server name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Alias Server name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Instance ID 
     * @return InstanceID Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
     * @param InstanceID Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Private IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivateIp Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivateIp Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Public IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicIp Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicIp Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Host tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostTags Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getHostTags() {
        return this.HostTags;
    }

    /**
     * Set Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostTags Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostTags(String [] HostTags) {
        this.HostTags = HostTags;
    }

    /**
     * Get Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Memory Trojan Type. 0: Filter Type; 1: Listener Type; 2: Servlet Type; 3: Interceptors Type; 4: Agent Type; 5: Other
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Processing Status. 0 - Pending; 1 - Allowlisted; 2 - Deleted; 3 - Ignored; 4 - Manually Processed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Associated class loader.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClassLoaderName Associated class loader.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClassLoaderName() {
        return this.ClassLoaderName;
    }

    /**
     * Set Associated class loader.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClassLoaderName Associated class loader.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClassLoaderName(String ClassLoaderName) {
        this.ClassLoaderName = ClassLoaderName;
    }

    /**
     * Get Parent class name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuperClassName Parent class name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSuperClassName() {
        return this.SuperClassName;
    }

    /**
     * Set Parent class name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuperClassName Parent class name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuperClassName(String SuperClassName) {
        this.SuperClassName = SuperClassName;
    }

    /**
     * Get Inherited API
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Interfaces Inherited API
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInterfaces() {
        return this.Interfaces;
    }

    /**
     * Set Inherited API
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Interfaces Inherited API
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInterfaces(String Interfaces) {
        this.Interfaces = Interfaces;
    }

    /**
     * Get Annotation
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Annotations Annotation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set Annotation
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Annotations Annotation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnnotations(String Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get Class name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClassName Class name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set Class name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClassName Class name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get Class file md5
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Md5 Class file md5
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set Class file md5
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Md5 Class file md5
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Process ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pid Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pid Process ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Java Process Path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Exe Java Process Path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set Java Process Path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Exe Java Process Path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get Java process command line parameters
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Args Java process command line parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getArgs() {
        return this.Args;
    }

    /**
     * Set Java process command line parameters
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Args Java process command line parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setArgs(String Args) {
        this.Args = Args;
    }

    /**
     * Get Java Memory Horse Binary Code (base64)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClassContent Java Memory Horse Binary Code (base64)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClassContent() {
        return this.ClassContent;
    }

    /**
     * Set Java Memory Horse Binary Code (base64)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClassContent Java Memory Horse Binary Code (base64)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClassContent(String ClassContent) {
        this.ClassContent = ClassContent;
    }

    /**
     * Get Java Memory Trojan Decompilation Code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClassContentPretty Java Memory Trojan Decompilation Code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClassContentPretty() {
        return this.ClassContentPretty;
    }

    /**
     * Set Java Memory Trojan Decompilation Code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClassContentPretty Java Memory Trojan Decompilation Code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClassContentPretty(String ClassContentPretty) {
        this.ClassContentPretty = ClassContentPretty;
    }

    /**
     * Get Event description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventDescription Event description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEventDescription() {
        return this.EventDescription;
    }

    /**
     * Set Event description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventDescription Event description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventDescription(String EventDescription) {
        this.EventDescription = EventDescription;
    }

    /**
     * Get Security advice
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecurityAdvice Security advice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecurityAdvice() {
        return this.SecurityAdvice;
    }

    /**
     * Set Security advice
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecurityAdvice Security advice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurityAdvice(String SecurityAdvice) {
        this.SecurityAdvice = SecurityAdvice;
    }

    /**
     * Get First detection time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime First detection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set First detection time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime First detection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last detection time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecentFoundTime Last detection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecentFoundTime() {
        return this.RecentFoundTime;
    }

    /**
     * Set Last detection time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecentFoundTime Last detection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecentFoundTime(String RecentFoundTime) {
        this.RecentFoundTime = RecentFoundTime;
    }

    /**
     * Get Node name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeName Node name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeName Node name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Node ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeId Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeId Node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Container name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerName Container name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerName Container name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get container id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerId container id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set container id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerId container id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get Container running status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerStatus Container running status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set Container running status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerStatus Container running status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get Container isolation status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerNetStatus Container isolation status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set Container isolation status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerNetStatus Container isolation status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get Image ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageId Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageId Image ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageName Image name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageName Image name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Pod name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodName Pod name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodName Pod name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get podip
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodIp podip
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set podip
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodIp podip
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get Cluster name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterName Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterName Cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId Cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public RaspMemShellDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspMemShellDetail(RaspMemShellDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.HostTags != null) {
            this.HostTags = new String[source.HostTags.length];
            for (int i = 0; i < source.HostTags.length; i++) {
                this.HostTags[i] = new String(source.HostTags[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ClassLoaderName != null) {
            this.ClassLoaderName = new String(source.ClassLoaderName);
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
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
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
        if (source.ClassContent != null) {
            this.ClassContent = new String(source.ClassContent);
        }
        if (source.ClassContentPretty != null) {
            this.ClassContentPretty = new String(source.ClassContentPretty);
        }
        if (source.EventDescription != null) {
            this.EventDescription = new String(source.EventDescription);
        }
        if (source.SecurityAdvice != null) {
            this.SecurityAdvice = new String(source.SecurityAdvice);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RecentFoundTime != null) {
            this.RecentFoundTime = new String(source.RecentFoundTime);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamArraySimple(map, prefix + "HostTags.", this.HostTags);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClassLoaderName", this.ClassLoaderName);
        this.setParamSimple(map, prefix + "SuperClassName", this.SuperClassName);
        this.setParamSimple(map, prefix + "Interfaces", this.Interfaces);
        this.setParamSimple(map, prefix + "Annotations", this.Annotations);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Args", this.Args);
        this.setParamSimple(map, prefix + "ClassContent", this.ClassContent);
        this.setParamSimple(map, prefix + "ClassContentPretty", this.ClassContentPretty);
        this.setParamSimple(map, prefix + "EventDescription", this.EventDescription);
        this.setParamSimple(map, prefix + "SecurityAdvice", this.SecurityAdvice);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RecentFoundTime", this.RecentFoundTime);
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

    }
}

