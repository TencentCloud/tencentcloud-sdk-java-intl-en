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

public class VirusTaskInfo extends AbstractModel {

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Container ID
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Node name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Private IP of the node
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Scanning status:
`WAIT`: Pending scanning.
`FAILED`: Failed.
`SCANNING`: Scanning.
`FINISHED`: Ended.
`CANCELING`: Canceling.
`CANCELED`: Canceled.
`CANCEL_FAILED`: Failed to cancel.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Check start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Check end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Number of risks
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Cause:
`SEND_SUCCESSED`: Task submitted.
`SCAN_WAIT`: Waiting to scan...
`OFFLINE`: Offline.
`SEND_FAILED`: Failed to deploy.
`TIMEOUT`: Timed out.
`LOW_AGENT_VERSION`: The Agent version is too old.
`AGENT_NOT_FOUND`: The image's agent doesn't exist.
`TOO_MANY`: Too many tasks.
`VALIDATION`: Invalid parameter.
`INTERNAL`: Internal service error.
`MISC`: Other errors.
`UNAUTH`: The image is not assigned with a license.
`SEND_CANCEL_SUCCESSED`: Task submitted.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * Node type. Values: `NORMAL` (general node), `SUPER` (super node).
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Public IP of the node
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * Node ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

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
     * Get Container ID 
     * @return ContainerId Container ID
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set Container ID
     * @param ContainerId Container ID
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
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
     * Get Node name 
     * @return HostName Node name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Node name
     * @param HostName Node name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Private IP of the node 
     * @return HostIp Private IP of the node
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Private IP of the node
     * @param HostIp Private IP of the node
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Scanning status:
`WAIT`: Pending scanning.
`FAILED`: Failed.
`SCANNING`: Scanning.
`FINISHED`: Ended.
`CANCELING`: Canceling.
`CANCELED`: Canceled.
`CANCEL_FAILED`: Failed to cancel. 
     * @return Status Scanning status:
`WAIT`: Pending scanning.
`FAILED`: Failed.
`SCANNING`: Scanning.
`FINISHED`: Ended.
`CANCELING`: Canceling.
`CANCELED`: Canceled.
`CANCEL_FAILED`: Failed to cancel.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Scanning status:
`WAIT`: Pending scanning.
`FAILED`: Failed.
`SCANNING`: Scanning.
`FINISHED`: Ended.
`CANCELING`: Canceling.
`CANCELED`: Canceled.
`CANCEL_FAILED`: Failed to cancel.
     * @param Status Scanning status:
`WAIT`: Pending scanning.
`FAILED`: Failed.
`SCANNING`: Scanning.
`FINISHED`: Ended.
`CANCELING`: Canceling.
`CANCELED`: Canceled.
`CANCEL_FAILED`: Failed to cancel.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Check start time 
     * @return StartTime Check start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Check start time
     * @param StartTime Check start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Check end time 
     * @return EndTime Check end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Check end time
     * @param EndTime Check end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of risks 
     * @return RiskCnt Number of risks
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set Number of risks
     * @param RiskCnt Number of risks
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get Event ID 
     * @return Id Event ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Cause:
`SEND_SUCCESSED`: Task submitted.
`SCAN_WAIT`: Waiting to scan...
`OFFLINE`: Offline.
`SEND_FAILED`: Failed to deploy.
`TIMEOUT`: Timed out.
`LOW_AGENT_VERSION`: The Agent version is too old.
`AGENT_NOT_FOUND`: The image's agent doesn't exist.
`TOO_MANY`: Too many tasks.
`VALIDATION`: Invalid parameter.
`INTERNAL`: Internal service error.
`MISC`: Other errors.
`UNAUTH`: The image is not assigned with a license.
`SEND_CANCEL_SUCCESSED`: Task submitted. 
     * @return ErrorMsg Cause:
`SEND_SUCCESSED`: Task submitted.
`SCAN_WAIT`: Waiting to scan...
`OFFLINE`: Offline.
`SEND_FAILED`: Failed to deploy.
`TIMEOUT`: Timed out.
`LOW_AGENT_VERSION`: The Agent version is too old.
`AGENT_NOT_FOUND`: The image's agent doesn't exist.
`TOO_MANY`: Too many tasks.
`VALIDATION`: Invalid parameter.
`INTERNAL`: Internal service error.
`MISC`: Other errors.
`UNAUTH`: The image is not assigned with a license.
`SEND_CANCEL_SUCCESSED`: Task submitted.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set Cause:
`SEND_SUCCESSED`: Task submitted.
`SCAN_WAIT`: Waiting to scan...
`OFFLINE`: Offline.
`SEND_FAILED`: Failed to deploy.
`TIMEOUT`: Timed out.
`LOW_AGENT_VERSION`: The Agent version is too old.
`AGENT_NOT_FOUND`: The image's agent doesn't exist.
`TOO_MANY`: Too many tasks.
`VALIDATION`: Invalid parameter.
`INTERNAL`: Internal service error.
`MISC`: Other errors.
`UNAUTH`: The image is not assigned with a license.
`SEND_CANCEL_SUCCESSED`: Task submitted.
     * @param ErrorMsg Cause:
`SEND_SUCCESSED`: Task submitted.
`SCAN_WAIT`: Waiting to scan...
`OFFLINE`: Offline.
`SEND_FAILED`: Failed to deploy.
`TIMEOUT`: Timed out.
`LOW_AGENT_VERSION`: The Agent version is too old.
`AGENT_NOT_FOUND`: The image's agent doesn't exist.
`TOO_MANY`: Too many tasks.
`VALIDATION`: Invalid parameter.
`INTERNAL`: Internal service error.
`MISC`: Other errors.
`UNAUTH`: The image is not assigned with a license.
`SEND_CANCEL_SUCCESSED`: Task submitted.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get Node type. Values: `NORMAL` (general node), `SUPER` (super node). 
     * @return NodeType Node type. Values: `NORMAL` (general node), `SUPER` (super node).
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type. Values: `NORMAL` (general node), `SUPER` (super node).
     * @param NodeType Node type. Values: `NORMAL` (general node), `SUPER` (super node).
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Public IP of the node 
     * @return PublicIP Public IP of the node
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public IP of the node
     * @param PublicIP Public IP of the node
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
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

    public VirusTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirusTaskInfo(VirusTaskInfo source) {
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);

    }
}

