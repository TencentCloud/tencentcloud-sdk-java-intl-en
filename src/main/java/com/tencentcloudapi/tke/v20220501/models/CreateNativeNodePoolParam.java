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

public class CreateNativeNodePoolParam extends AbstractModel {

    /**
    * Node pool scaling configuration
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
    * Node billing type. PREPAID: Monthly subscription; POSTPAID_BY_HOUR: Pay-as-you-go (default);
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * System disk configuration
    */
    @SerializedName("SystemDisk")
    @Expose
    private Disk SystemDisk;

    /**
    * List of models
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * Security group list
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Automatic upgrade configuration
    */
    @SerializedName("UpgradeSettings")
    @Expose
    private MachineUpgradeSettings UpgradeSettings;

    /**
    * Whether to enable self-healing capability
    */
    @SerializedName("AutoRepair")
    @Expose
    private Boolean AutoRepair;

    /**
    * Billing configuration of monthly subscription models
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Management parameter configuration of node pools
    */
    @SerializedName("Management")
    @Expose
    private ManagementConfig Management;

    /**
    * Fault self-healing rule name
    */
    @SerializedName("HealthCheckPolicyName")
    @Expose
    private String HealthCheckPolicyName;

    /**
    * hostname pattern string of native node pools
    */
    @SerializedName("HostNamePattern")
    @Expose
    private String HostNamePattern;

    /**
    * kubelet custom parameters
    */
    @SerializedName("KubeletArgs")
    @Expose
    private String [] KubeletArgs;

    /**
    * Predefined script
    */
    @SerializedName("Lifecycle")
    @Expose
    private LifecycleConfig Lifecycle;

    /**
    * Runtime root directory
    */
    @SerializedName("RuntimeRootDir")
    @Expose
    private String RuntimeRootDir;

    /**
    * Whether to enable Auto Scaling (AS)
    */
    @SerializedName("EnableAutoscaling")
    @Expose
    private Boolean EnableAutoscaling;

    /**
    * Desired node count
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * Public network bandwidth configuration
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Data disk list of native node pools
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Node pool ssh public key ID array
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * Node pool type
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get Node pool scaling configuration 
     * @return Scaling Node pool scaling configuration
     */
    public MachineSetScaling getScaling() {
        return this.Scaling;
    }

    /**
     * Set Node pool scaling configuration
     * @param Scaling Node pool scaling configuration
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
     * Get Node billing type. PREPAID: Monthly subscription; POSTPAID_BY_HOUR: Pay-as-you-go (default); 
     * @return InstanceChargeType Node billing type. PREPAID: Monthly subscription; POSTPAID_BY_HOUR: Pay-as-you-go (default);
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Node billing type. PREPAID: Monthly subscription; POSTPAID_BY_HOUR: Pay-as-you-go (default);
     * @param InstanceChargeType Node billing type. PREPAID: Monthly subscription; POSTPAID_BY_HOUR: Pay-as-you-go (default);
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
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
     * Get Security group list 
     * @return SecurityGroupIds Security group list
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group list
     * @param SecurityGroupIds Security group list
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Automatic upgrade configuration 
     * @return UpgradeSettings Automatic upgrade configuration
     */
    public MachineUpgradeSettings getUpgradeSettings() {
        return this.UpgradeSettings;
    }

    /**
     * Set Automatic upgrade configuration
     * @param UpgradeSettings Automatic upgrade configuration
     */
    public void setUpgradeSettings(MachineUpgradeSettings UpgradeSettings) {
        this.UpgradeSettings = UpgradeSettings;
    }

    /**
     * Get Whether to enable self-healing capability 
     * @return AutoRepair Whether to enable self-healing capability
     */
    public Boolean getAutoRepair() {
        return this.AutoRepair;
    }

    /**
     * Set Whether to enable self-healing capability
     * @param AutoRepair Whether to enable self-healing capability
     */
    public void setAutoRepair(Boolean AutoRepair) {
        this.AutoRepair = AutoRepair;
    }

    /**
     * Get Billing configuration of monthly subscription models 
     * @return InstanceChargePrepaid Billing configuration of monthly subscription models
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Billing configuration of monthly subscription models
     * @param InstanceChargePrepaid Billing configuration of monthly subscription models
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get Management parameter configuration of node pools 
     * @return Management Management parameter configuration of node pools
     */
    public ManagementConfig getManagement() {
        return this.Management;
    }

    /**
     * Set Management parameter configuration of node pools
     * @param Management Management parameter configuration of node pools
     */
    public void setManagement(ManagementConfig Management) {
        this.Management = Management;
    }

    /**
     * Get Fault self-healing rule name 
     * @return HealthCheckPolicyName Fault self-healing rule name
     */
    public String getHealthCheckPolicyName() {
        return this.HealthCheckPolicyName;
    }

    /**
     * Set Fault self-healing rule name
     * @param HealthCheckPolicyName Fault self-healing rule name
     */
    public void setHealthCheckPolicyName(String HealthCheckPolicyName) {
        this.HealthCheckPolicyName = HealthCheckPolicyName;
    }

    /**
     * Get hostname pattern string of native node pools 
     * @return HostNamePattern hostname pattern string of native node pools
     */
    public String getHostNamePattern() {
        return this.HostNamePattern;
    }

    /**
     * Set hostname pattern string of native node pools
     * @param HostNamePattern hostname pattern string of native node pools
     */
    public void setHostNamePattern(String HostNamePattern) {
        this.HostNamePattern = HostNamePattern;
    }

    /**
     * Get kubelet custom parameters 
     * @return KubeletArgs kubelet custom parameters
     */
    public String [] getKubeletArgs() {
        return this.KubeletArgs;
    }

    /**
     * Set kubelet custom parameters
     * @param KubeletArgs kubelet custom parameters
     */
    public void setKubeletArgs(String [] KubeletArgs) {
        this.KubeletArgs = KubeletArgs;
    }

    /**
     * Get Predefined script 
     * @return Lifecycle Predefined script
     */
    public LifecycleConfig getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set Predefined script
     * @param Lifecycle Predefined script
     */
    public void setLifecycle(LifecycleConfig Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get Runtime root directory 
     * @return RuntimeRootDir Runtime root directory
     */
    public String getRuntimeRootDir() {
        return this.RuntimeRootDir;
    }

    /**
     * Set Runtime root directory
     * @param RuntimeRootDir Runtime root directory
     */
    public void setRuntimeRootDir(String RuntimeRootDir) {
        this.RuntimeRootDir = RuntimeRootDir;
    }

    /**
     * Get Whether to enable Auto Scaling (AS) 
     * @return EnableAutoscaling Whether to enable Auto Scaling (AS)
     */
    public Boolean getEnableAutoscaling() {
        return this.EnableAutoscaling;
    }

    /**
     * Set Whether to enable Auto Scaling (AS)
     * @param EnableAutoscaling Whether to enable Auto Scaling (AS)
     */
    public void setEnableAutoscaling(Boolean EnableAutoscaling) {
        this.EnableAutoscaling = EnableAutoscaling;
    }

    /**
     * Get Desired node count 
     * @return Replicas Desired node count
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set Desired node count
     * @param Replicas Desired node count
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get Public network bandwidth configuration 
     * @return InternetAccessible Public network bandwidth configuration
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Public network bandwidth configuration
     * @param InternetAccessible Public network bandwidth configuration
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Data disk list of native node pools 
     * @return DataDisks Data disk list of native node pools
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Data disk list of native node pools
     * @param DataDisks Data disk list of native node pools
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get Node pool ssh public key ID array 
     * @return KeyIds Node pool ssh public key ID array
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set Node pool ssh public key ID array
     * @param KeyIds Node pool ssh public key ID array
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get Node pool type 
     * @return MachineType Node pool type
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Node pool type
     * @param MachineType Node pool type
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    public CreateNativeNodePoolParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNativeNodePoolParam(CreateNativeNodePoolParam source) {
        if (source.Scaling != null) {
            this.Scaling = new MachineSetScaling(source.Scaling);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new Disk(source.SystemDisk);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
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
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
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
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
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
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
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
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "UpgradeSettings.", this.UpgradeSettings);
        this.setParamSimple(map, prefix + "AutoRepair", this.AutoRepair);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamObj(map, prefix + "Management.", this.Management);
        this.setParamSimple(map, prefix + "HealthCheckPolicyName", this.HealthCheckPolicyName);
        this.setParamSimple(map, prefix + "HostNamePattern", this.HostNamePattern);
        this.setParamArraySimple(map, prefix + "KubeletArgs.", this.KubeletArgs);
        this.setParamObj(map, prefix + "Lifecycle.", this.Lifecycle);
        this.setParamSimple(map, prefix + "RuntimeRootDir", this.RuntimeRootDir);
        this.setParamSimple(map, prefix + "EnableAutoscaling", this.EnableAutoscaling);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

