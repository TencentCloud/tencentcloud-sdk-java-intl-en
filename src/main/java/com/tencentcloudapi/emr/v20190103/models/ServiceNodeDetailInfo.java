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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceNodeDetailInfo extends AbstractModel {

    /**
    * Process node IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Process type.
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * Process name
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Service component status
    */
    @SerializedName("ServiceStatus")
    @Expose
    private Long ServiceStatus;

    /**
    * Process monitoring status
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * Service component status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Process port information
    */
    @SerializedName("PortsInfo")
    @Expose
    private String PortsInfo;

    /**
    * Last restart time.
    */
    @SerializedName("LastRestartTime")
    @Expose
    private String LastRestartTime;

    /**
    * Node type.
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * Configuration group ID.
    */
    @SerializedName("ConfGroupId")
    @Expose
    private Long ConfGroupId;

    /**
    * Configuration group name.
    */
    @SerializedName("ConfGroupName")
    @Expose
    private String ConfGroupName;

    /**
    * Whether the node needs to be restarted
    */
    @SerializedName("ConfStatus")
    @Expose
    private Long ConfStatus;

    /**
    * Process detection information

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceDetectionInfo")
    @Expose
    private ServiceProcessFunctionInfo [] ServiceDetectionInfo;

    /**
    * Node type.
    */
    @SerializedName("NodeFlagFilter")
    @Expose
    private String NodeFlagFilter;

    /**
    * Process health status

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HealthStatus")
    @Expose
    private HealthStatus HealthStatus;

    /**
    * Whether the role supports monitoring.
    */
    @SerializedName("IsSupportRoleMonitor")
    @Expose
    private Boolean IsSupportRoleMonitor;

    /**
    * Suspension policy

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StopPolicies")
    @Expose
    private RestartPolicy [] StopPolicies;

    /**
    * Strong validation of the API in a test environment. This strong validation doesn't exist on the current network, but it does exist in the data returned by the emrcc interface. If it’s not applied, an error will be reported. Omitting it will result in an error.
    */
    @SerializedName("HAState")
    @Expose
    private String HAState;

    /**
    * NameService name.
    */
    @SerializedName("NameService")
    @Expose
    private String NameService;

    /**
    * Whether the federation is supported.
    */
    @SerializedName("IsFederation")
    @Expose
    private Boolean IsFederation;

    /**
    * Whether the DataNode is in maintenance status.
    */
    @SerializedName("DataNodeMaintenanceState")
    @Expose
    private Long DataNodeMaintenanceState;

    /**
     * Get Process node IP 
     * @return Ip Process node IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Process node IP
     * @param Ip Process node IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Process type. 
     * @return NodeType Process type.
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Process type.
     * @param NodeType Process type.
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Process name 
     * @return NodeName Process name
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Process name
     * @param NodeName Process name
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Service component status 
     * @return ServiceStatus Service component status
     */
    public Long getServiceStatus() {
        return this.ServiceStatus;
    }

    /**
     * Set Service component status
     * @param ServiceStatus Service component status
     */
    public void setServiceStatus(Long ServiceStatus) {
        this.ServiceStatus = ServiceStatus;
    }

    /**
     * Get Process monitoring status 
     * @return MonitorStatus Process monitoring status
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set Process monitoring status
     * @param MonitorStatus Process monitoring status
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get Service component status 
     * @return Status Service component status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Service component status
     * @param Status Service component status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Process port information 
     * @return PortsInfo Process port information
     */
    public String getPortsInfo() {
        return this.PortsInfo;
    }

    /**
     * Set Process port information
     * @param PortsInfo Process port information
     */
    public void setPortsInfo(String PortsInfo) {
        this.PortsInfo = PortsInfo;
    }

    /**
     * Get Last restart time. 
     * @return LastRestartTime Last restart time.
     */
    public String getLastRestartTime() {
        return this.LastRestartTime;
    }

    /**
     * Set Last restart time.
     * @param LastRestartTime Last restart time.
     */
    public void setLastRestartTime(String LastRestartTime) {
        this.LastRestartTime = LastRestartTime;
    }

    /**
     * Get Node type. 
     * @return Flag Node type.
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set Node type.
     * @param Flag Node type.
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get Configuration group ID. 
     * @return ConfGroupId Configuration group ID.
     */
    public Long getConfGroupId() {
        return this.ConfGroupId;
    }

    /**
     * Set Configuration group ID.
     * @param ConfGroupId Configuration group ID.
     */
    public void setConfGroupId(Long ConfGroupId) {
        this.ConfGroupId = ConfGroupId;
    }

    /**
     * Get Configuration group name. 
     * @return ConfGroupName Configuration group name.
     */
    public String getConfGroupName() {
        return this.ConfGroupName;
    }

    /**
     * Set Configuration group name.
     * @param ConfGroupName Configuration group name.
     */
    public void setConfGroupName(String ConfGroupName) {
        this.ConfGroupName = ConfGroupName;
    }

    /**
     * Get Whether the node needs to be restarted 
     * @return ConfStatus Whether the node needs to be restarted
     */
    public Long getConfStatus() {
        return this.ConfStatus;
    }

    /**
     * Set Whether the node needs to be restarted
     * @param ConfStatus Whether the node needs to be restarted
     */
    public void setConfStatus(Long ConfStatus) {
        this.ConfStatus = ConfStatus;
    }

    /**
     * Get Process detection information

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceDetectionInfo Process detection information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ServiceProcessFunctionInfo [] getServiceDetectionInfo() {
        return this.ServiceDetectionInfo;
    }

    /**
     * Set Process detection information

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceDetectionInfo Process detection information

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceDetectionInfo(ServiceProcessFunctionInfo [] ServiceDetectionInfo) {
        this.ServiceDetectionInfo = ServiceDetectionInfo;
    }

    /**
     * Get Node type. 
     * @return NodeFlagFilter Node type.
     */
    public String getNodeFlagFilter() {
        return this.NodeFlagFilter;
    }

    /**
     * Set Node type.
     * @param NodeFlagFilter Node type.
     */
    public void setNodeFlagFilter(String NodeFlagFilter) {
        this.NodeFlagFilter = NodeFlagFilter;
    }

    /**
     * Get Process health status

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HealthStatus Process health status

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HealthStatus getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set Process health status

Note: This field may return null, indicating that no valid values can be obtained.
     * @param HealthStatus Process health status

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHealthStatus(HealthStatus HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get Whether the role supports monitoring. 
     * @return IsSupportRoleMonitor Whether the role supports monitoring.
     */
    public Boolean getIsSupportRoleMonitor() {
        return this.IsSupportRoleMonitor;
    }

    /**
     * Set Whether the role supports monitoring.
     * @param IsSupportRoleMonitor Whether the role supports monitoring.
     */
    public void setIsSupportRoleMonitor(Boolean IsSupportRoleMonitor) {
        this.IsSupportRoleMonitor = IsSupportRoleMonitor;
    }

    /**
     * Get Suspension policy

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StopPolicies Suspension policy

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RestartPolicy [] getStopPolicies() {
        return this.StopPolicies;
    }

    /**
     * Set Suspension policy

Note: This field may return null, indicating that no valid values can be obtained.
     * @param StopPolicies Suspension policy

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStopPolicies(RestartPolicy [] StopPolicies) {
        this.StopPolicies = StopPolicies;
    }

    /**
     * Get Strong validation of the API in a test environment. This strong validation doesn't exist on the current network, but it does exist in the data returned by the emrcc interface. If it’s not applied, an error will be reported. Omitting it will result in an error. 
     * @return HAState Strong validation of the API in a test environment. This strong validation doesn't exist on the current network, but it does exist in the data returned by the emrcc interface. If it’s not applied, an error will be reported. Omitting it will result in an error.
     */
    public String getHAState() {
        return this.HAState;
    }

    /**
     * Set Strong validation of the API in a test environment. This strong validation doesn't exist on the current network, but it does exist in the data returned by the emrcc interface. If it’s not applied, an error will be reported. Omitting it will result in an error.
     * @param HAState Strong validation of the API in a test environment. This strong validation doesn't exist on the current network, but it does exist in the data returned by the emrcc interface. If it’s not applied, an error will be reported. Omitting it will result in an error.
     */
    public void setHAState(String HAState) {
        this.HAState = HAState;
    }

    /**
     * Get NameService name. 
     * @return NameService NameService name.
     */
    public String getNameService() {
        return this.NameService;
    }

    /**
     * Set NameService name.
     * @param NameService NameService name.
     */
    public void setNameService(String NameService) {
        this.NameService = NameService;
    }

    /**
     * Get Whether the federation is supported. 
     * @return IsFederation Whether the federation is supported.
     */
    public Boolean getIsFederation() {
        return this.IsFederation;
    }

    /**
     * Set Whether the federation is supported.
     * @param IsFederation Whether the federation is supported.
     */
    public void setIsFederation(Boolean IsFederation) {
        this.IsFederation = IsFederation;
    }

    /**
     * Get Whether the DataNode is in maintenance status. 
     * @return DataNodeMaintenanceState Whether the DataNode is in maintenance status.
     */
    public Long getDataNodeMaintenanceState() {
        return this.DataNodeMaintenanceState;
    }

    /**
     * Set Whether the DataNode is in maintenance status.
     * @param DataNodeMaintenanceState Whether the DataNode is in maintenance status.
     */
    public void setDataNodeMaintenanceState(Long DataNodeMaintenanceState) {
        this.DataNodeMaintenanceState = DataNodeMaintenanceState;
    }

    public ServiceNodeDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceNodeDetailInfo(ServiceNodeDetailInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.ServiceStatus != null) {
            this.ServiceStatus = new Long(source.ServiceStatus);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PortsInfo != null) {
            this.PortsInfo = new String(source.PortsInfo);
        }
        if (source.LastRestartTime != null) {
            this.LastRestartTime = new String(source.LastRestartTime);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
        if (source.ConfGroupId != null) {
            this.ConfGroupId = new Long(source.ConfGroupId);
        }
        if (source.ConfGroupName != null) {
            this.ConfGroupName = new String(source.ConfGroupName);
        }
        if (source.ConfStatus != null) {
            this.ConfStatus = new Long(source.ConfStatus);
        }
        if (source.ServiceDetectionInfo != null) {
            this.ServiceDetectionInfo = new ServiceProcessFunctionInfo[source.ServiceDetectionInfo.length];
            for (int i = 0; i < source.ServiceDetectionInfo.length; i++) {
                this.ServiceDetectionInfo[i] = new ServiceProcessFunctionInfo(source.ServiceDetectionInfo[i]);
            }
        }
        if (source.NodeFlagFilter != null) {
            this.NodeFlagFilter = new String(source.NodeFlagFilter);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new HealthStatus(source.HealthStatus);
        }
        if (source.IsSupportRoleMonitor != null) {
            this.IsSupportRoleMonitor = new Boolean(source.IsSupportRoleMonitor);
        }
        if (source.StopPolicies != null) {
            this.StopPolicies = new RestartPolicy[source.StopPolicies.length];
            for (int i = 0; i < source.StopPolicies.length; i++) {
                this.StopPolicies[i] = new RestartPolicy(source.StopPolicies[i]);
            }
        }
        if (source.HAState != null) {
            this.HAState = new String(source.HAState);
        }
        if (source.NameService != null) {
            this.NameService = new String(source.NameService);
        }
        if (source.IsFederation != null) {
            this.IsFederation = new Boolean(source.IsFederation);
        }
        if (source.DataNodeMaintenanceState != null) {
            this.DataNodeMaintenanceState = new Long(source.DataNodeMaintenanceState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "ServiceStatus", this.ServiceStatus);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PortsInfo", this.PortsInfo);
        this.setParamSimple(map, prefix + "LastRestartTime", this.LastRestartTime);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "ConfGroupId", this.ConfGroupId);
        this.setParamSimple(map, prefix + "ConfGroupName", this.ConfGroupName);
        this.setParamSimple(map, prefix + "ConfStatus", this.ConfStatus);
        this.setParamArrayObj(map, prefix + "ServiceDetectionInfo.", this.ServiceDetectionInfo);
        this.setParamSimple(map, prefix + "NodeFlagFilter", this.NodeFlagFilter);
        this.setParamObj(map, prefix + "HealthStatus.", this.HealthStatus);
        this.setParamSimple(map, prefix + "IsSupportRoleMonitor", this.IsSupportRoleMonitor);
        this.setParamArrayObj(map, prefix + "StopPolicies.", this.StopPolicies);
        this.setParamSimple(map, prefix + "HAState", this.HAState);
        this.setParamSimple(map, prefix + "NameService", this.NameService);
        this.setParamSimple(map, prefix + "IsFederation", this.IsFederation);
        this.setParamSimple(map, prefix + "DataNodeMaintenanceState", this.DataNodeMaintenanceState);

    }
}

