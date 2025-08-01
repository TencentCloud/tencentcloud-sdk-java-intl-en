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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NativeNodePoolInfo extends AbstractModel {

    /**
    * Scaling configuration
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Scaling")
    @Expose
    private MachineSetScaling Scaling;

    /**
    * Subnet list
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Security group list
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Automatic upgrade configuration
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("UpgradeSettings")
    @Expose
    private MachineUpgradeSettings UpgradeSettings;

    /**
    * Whether to enable self-healing capability
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("AutoRepair")
    @Expose
    private Boolean AutoRepair;

    /**
    * Node billing type
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Billing configuration of monthly subscription models
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * System disk configuration
    */
    @SerializedName("SystemDisk")
    @Expose
    private Disk SystemDisk;

    /**
    * Key ID list
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * Machine system configuration
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Management")
    @Expose
    private ManagementConfig Management;

    /**
    * Fault self-healing rule name
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("HealthCheckPolicyName")
    @Expose
    private String HealthCheckPolicyName;

    /**
    * hostname pattern string of native node pools
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("HostNamePattern")
    @Expose
    private String HostNamePattern;

    /**
    * kubelet custom parameters
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("KubeletArgs")
    @Expose
    private String [] KubeletArgs;

    /**
    * Predefined script
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Lifecycle")
    @Expose
    private LifecycleConfig Lifecycle;

    /**
    * Runtime root directory
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("RuntimeRootDir")
    @Expose
    private String RuntimeRootDir;

    /**
    * Whether to enable Auto Scaling (AS)
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("EnableAutoscaling")
    @Expose
    private Boolean EnableAutoscaling;

    /**
    * List of models
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * Desired node count
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * Number of ready machines
    */
    @SerializedName("ReadyReplicas")
    @Expose
    private Long ReadyReplicas;

    /**
    * Public network bandwidth configuration
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Data disk of native node pools
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Native node models: Native, NativeCVM
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get Scaling configuration
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Scaling Scaling configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public MachineSetScaling getScaling() {
        return this.Scaling;
    }

    /**
     * Set Scaling configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Scaling Scaling configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setScaling(MachineSetScaling Scaling) {
        this.Scaling = Scaling;
    }

    /**
     * Get Subnet list 
     * @return SubnetIds Subnet list
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set Subnet list
     * @param SubnetIds Subnet list
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Security group list
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return SecurityGroupIds Security group list
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group list
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param SecurityGroupIds Security group list
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Automatic upgrade configuration
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return UpgradeSettings Automatic upgrade configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public MachineUpgradeSettings getUpgradeSettings() {
        return this.UpgradeSettings;
    }

    /**
     * Set Automatic upgrade configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param UpgradeSettings Automatic upgrade configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setUpgradeSettings(MachineUpgradeSettings UpgradeSettings) {
        this.UpgradeSettings = UpgradeSettings;
    }

    /**
     * Get Whether to enable self-healing capability
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return AutoRepair Whether to enable self-healing capability
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Boolean getAutoRepair() {
        return this.AutoRepair;
    }

    /**
     * Set Whether to enable self-healing capability
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param AutoRepair Whether to enable self-healing capability
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setAutoRepair(Boolean AutoRepair) {
        this.AutoRepair = AutoRepair;
    }

    /**
     * Get Node billing type 
     * @return InstanceChargeType Node billing type
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Node billing type
     * @param InstanceChargeType Node billing type
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Billing configuration of monthly subscription models
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return InstanceChargePrepaid Billing configuration of monthly subscription models
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Billing configuration of monthly subscription models
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param InstanceChargePrepaid Billing configuration of monthly subscription models
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get System disk configuration 
     * @return SystemDisk System disk configuration
     */
    public Disk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk configuration
     * @param SystemDisk System disk configuration
     */
    public void setSystemDisk(Disk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Key ID list
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return KeyIds Key ID list
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set Key ID list
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param KeyIds Key ID list
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get Machine system configuration
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Management Machine system configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public ManagementConfig getManagement() {
        return this.Management;
    }

    /**
     * Set Machine system configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Management Machine system configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setManagement(ManagementConfig Management) {
        this.Management = Management;
    }

    /**
     * Get Fault self-healing rule name
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return HealthCheckPolicyName Fault self-healing rule name
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getHealthCheckPolicyName() {
        return this.HealthCheckPolicyName;
    }

    /**
     * Set Fault self-healing rule name
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param HealthCheckPolicyName Fault self-healing rule name
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setHealthCheckPolicyName(String HealthCheckPolicyName) {
        this.HealthCheckPolicyName = HealthCheckPolicyName;
    }

    /**
     * Get hostname pattern string of native node pools
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return HostNamePattern hostname pattern string of native node pools
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getHostNamePattern() {
        return this.HostNamePattern;
    }

    /**
     * Set hostname pattern string of native node pools
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param HostNamePattern hostname pattern string of native node pools
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setHostNamePattern(String HostNamePattern) {
        this.HostNamePattern = HostNamePattern;
    }

    /**
     * Get kubelet custom parameters
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return KubeletArgs kubelet custom parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String [] getKubeletArgs() {
        return this.KubeletArgs;
    }

    /**
     * Set kubelet custom parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param KubeletArgs kubelet custom parameters
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setKubeletArgs(String [] KubeletArgs) {
        this.KubeletArgs = KubeletArgs;
    }

    /**
     * Get Predefined script
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Lifecycle Predefined script
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public LifecycleConfig getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set Predefined script
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Lifecycle Predefined script
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setLifecycle(LifecycleConfig Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get Runtime root directory
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return RuntimeRootDir Runtime root directory
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getRuntimeRootDir() {
        return this.RuntimeRootDir;
    }

    /**
     * Set Runtime root directory
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param RuntimeRootDir Runtime root directory
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setRuntimeRootDir(String RuntimeRootDir) {
        this.RuntimeRootDir = RuntimeRootDir;
    }

    /**
     * Get Whether to enable Auto Scaling (AS)
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return EnableAutoscaling Whether to enable Auto Scaling (AS)
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Boolean getEnableAutoscaling() {
        return this.EnableAutoscaling;
    }

    /**
     * Set Whether to enable Auto Scaling (AS)
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param EnableAutoscaling Whether to enable Auto Scaling (AS)
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setEnableAutoscaling(Boolean EnableAutoscaling) {
        this.EnableAutoscaling = EnableAutoscaling;
    }

    /**
     * Get List of models 
     * @return InstanceTypes List of models
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set List of models
     * @param InstanceTypes List of models
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get Desired node count
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Replicas Desired node count
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set Desired node count
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Replicas Desired node count
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get Number of ready machines 
     * @return ReadyReplicas Number of ready machines
     */
    public Long getReadyReplicas() {
        return this.ReadyReplicas;
    }

    /**
     * Set Number of ready machines
     * @param ReadyReplicas Number of ready machines
     */
    public void setReadyReplicas(Long ReadyReplicas) {
        this.ReadyReplicas = ReadyReplicas;
    }

    /**
     * Get Public network bandwidth configuration
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return InternetAccessible Public network bandwidth configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Public network bandwidth configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param InternetAccessible Public network bandwidth configuration
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Data disk of native node pools
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DataDisks Data disk of native node pools
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Data disk of native node pools
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DataDisks Data disk of native node pools
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get Native node models: Native, NativeCVM
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return MachineType Native node models: Native, NativeCVM
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Native node models: Native, NativeCVM
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param MachineType Native node models: Native, NativeCVM
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    public NativeNodePoolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NativeNodePoolInfo(NativeNodePoolInfo source) {
        if (source.Scaling != null) {
            this.Scaling = new MachineSetScaling(source.Scaling);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.UpgradeSettings != null) {
            this.UpgradeSettings = new MachineUpgradeSettings(source.UpgradeSettings);
        }
        if (source.AutoRepair != null) {
            this.AutoRepair = new Boolean(source.AutoRepair);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new Disk(source.SystemDisk);
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.Management != null) {
            this.Management = new ManagementConfig(source.Management);
        }
        if (source.HealthCheckPolicyName != null) {
            this.HealthCheckPolicyName = new String(source.HealthCheckPolicyName);
        }
        if (source.HostNamePattern != null) {
            this.HostNamePattern = new String(source.HostNamePattern);
        }
        if (source.KubeletArgs != null) {
            this.KubeletArgs = new String[source.KubeletArgs.length];
            for (int i = 0; i < source.KubeletArgs.length; i++) {
                this.KubeletArgs[i] = new String(source.KubeletArgs[i]);
            }
        }
        if (source.Lifecycle != null) {
            this.Lifecycle = new LifecycleConfig(source.Lifecycle);
        }
        if (source.RuntimeRootDir != null) {
            this.RuntimeRootDir = new String(source.RuntimeRootDir);
        }
        if (source.EnableAutoscaling != null) {
            this.EnableAutoscaling = new Boolean(source.EnableAutoscaling);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.ReadyReplicas != null) {
            this.ReadyReplicas = new Long(source.ReadyReplicas);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Scaling.", this.Scaling);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "UpgradeSettings.", this.UpgradeSettings);
        this.setParamSimple(map, prefix + "AutoRepair", this.AutoRepair);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamObj(map, prefix + "Management.", this.Management);
        this.setParamSimple(map, prefix + "HealthCheckPolicyName", this.HealthCheckPolicyName);
        this.setParamSimple(map, prefix + "HostNamePattern", this.HostNamePattern);
        this.setParamArraySimple(map, prefix + "KubeletArgs.", this.KubeletArgs);
        this.setParamObj(map, prefix + "Lifecycle.", this.Lifecycle);
        this.setParamSimple(map, prefix + "RuntimeRootDir", this.RuntimeRootDir);
        this.setParamSimple(map, prefix + "EnableAutoscaling", this.EnableAutoscaling);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "ReadyReplicas", this.ReadyReplicas);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

