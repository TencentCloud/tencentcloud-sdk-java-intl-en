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

public class ModifyClusterMachineRequest extends AbstractModel {

    /**
    * <p>Cluster ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Node name list.</p>
    */
    @SerializedName("MachineNames")
    @Expose
    private String [] MachineNames;

    /**
    * <p>display name of the machine</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>System disk C</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private Disk SystemDisk;

    /**
    * <p>Security group list</p>
    */
    @SerializedName("SecurityGroupIDs")
    @Expose
    private String [] SecurityGroupIDs;

    /**
    * <p>Node prepayment information.</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>Change node billing type</p><p>Enumeration value:</p><ul><li>POSTPAID_BY_HOUR: The targeted billing type is pay-as-you-go.</li><li>PREPAID: The targeted billing type is annual and monthly subscription.</li></ul>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Whether to switch the billing mode of the elastic data cloud disk simultaneously. Value ranges from true to false: true indicates switching the billing mode of the elastic data cloud disk, false indicates not switching the billing mode of the elastic data cloud disk. Default value: true.</p><p>Default value: true</p>
    */
    @SerializedName("ModifyPortableDataDisk")
    @Expose
    private Boolean ModifyPortableDataDisk;

    /**
     * Get <p>Cluster ID</p> 
     * @return ClusterId <p>Cluster ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID</p>
     * @param ClusterId <p>Cluster ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Node name list.</p> 
     * @return MachineNames <p>Node name list.</p>
     */
    public String [] getMachineNames() {
        return this.MachineNames;
    }

    /**
     * Set <p>Node name list.</p>
     * @param MachineNames <p>Node name list.</p>
     */
    public void setMachineNames(String [] MachineNames) {
        this.MachineNames = MachineNames;
    }

    /**
     * Get <p>display name of the machine</p> 
     * @return DisplayName <p>display name of the machine</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>display name of the machine</p>
     * @param DisplayName <p>display name of the machine</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>System disk C</p> 
     * @return SystemDisk <p>System disk C</p>
     */
    public Disk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>System disk C</p>
     * @param SystemDisk <p>System disk C</p>
     */
    public void setSystemDisk(Disk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>Security group list</p> 
     * @return SecurityGroupIDs <p>Security group list</p>
     */
    public String [] getSecurityGroupIDs() {
        return this.SecurityGroupIDs;
    }

    /**
     * Set <p>Security group list</p>
     * @param SecurityGroupIDs <p>Security group list</p>
     */
    public void setSecurityGroupIDs(String [] SecurityGroupIDs) {
        this.SecurityGroupIDs = SecurityGroupIDs;
    }

    /**
     * Get <p>Node prepayment information.</p> 
     * @return InstanceChargePrepaid <p>Node prepayment information.</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>Node prepayment information.</p>
     * @param InstanceChargePrepaid <p>Node prepayment information.</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>Change node billing type</p><p>Enumeration value:</p><ul><li>POSTPAID_BY_HOUR: The targeted billing type is pay-as-you-go.</li><li>PREPAID: The targeted billing type is annual and monthly subscription.</li></ul> 
     * @return InstanceChargeType <p>Change node billing type</p><p>Enumeration value:</p><ul><li>POSTPAID_BY_HOUR: The targeted billing type is pay-as-you-go.</li><li>PREPAID: The targeted billing type is annual and monthly subscription.</li></ul>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Change node billing type</p><p>Enumeration value:</p><ul><li>POSTPAID_BY_HOUR: The targeted billing type is pay-as-you-go.</li><li>PREPAID: The targeted billing type is annual and monthly subscription.</li></ul>
     * @param InstanceChargeType <p>Change node billing type</p><p>Enumeration value:</p><ul><li>POSTPAID_BY_HOUR: The targeted billing type is pay-as-you-go.</li><li>PREPAID: The targeted billing type is annual and monthly subscription.</li></ul>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Whether to switch the billing mode of the elastic data cloud disk simultaneously. Value ranges from true to false: true indicates switching the billing mode of the elastic data cloud disk, false indicates not switching the billing mode of the elastic data cloud disk. Default value: true.</p><p>Default value: true</p> 
     * @return ModifyPortableDataDisk <p>Whether to switch the billing mode of the elastic data cloud disk simultaneously. Value ranges from true to false: true indicates switching the billing mode of the elastic data cloud disk, false indicates not switching the billing mode of the elastic data cloud disk. Default value: true.</p><p>Default value: true</p>
     */
    public Boolean getModifyPortableDataDisk() {
        return this.ModifyPortableDataDisk;
    }

    /**
     * Set <p>Whether to switch the billing mode of the elastic data cloud disk simultaneously. Value ranges from true to false: true indicates switching the billing mode of the elastic data cloud disk, false indicates not switching the billing mode of the elastic data cloud disk. Default value: true.</p><p>Default value: true</p>
     * @param ModifyPortableDataDisk <p>Whether to switch the billing mode of the elastic data cloud disk simultaneously. Value ranges from true to false: true indicates switching the billing mode of the elastic data cloud disk, false indicates not switching the billing mode of the elastic data cloud disk. Default value: true.</p><p>Default value: true</p>
     */
    public void setModifyPortableDataDisk(Boolean ModifyPortableDataDisk) {
        this.ModifyPortableDataDisk = ModifyPortableDataDisk;
    }

    public ModifyClusterMachineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterMachineRequest(ModifyClusterMachineRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.MachineNames != null) {
            this.MachineNames = new String[source.MachineNames.length];
            for (int i = 0; i < source.MachineNames.length; i++) {
                this.MachineNames[i] = new String(source.MachineNames[i]);
            }
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new Disk(source.SystemDisk);
        }
        if (source.SecurityGroupIDs != null) {
            this.SecurityGroupIDs = new String[source.SecurityGroupIDs.length];
            for (int i = 0; i < source.SecurityGroupIDs.length; i++) {
                this.SecurityGroupIDs[i] = new String(source.SecurityGroupIDs[i]);
            }
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.ModifyPortableDataDisk != null) {
            this.ModifyPortableDataDisk = new Boolean(source.ModifyPortableDataDisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "MachineNames.", this.MachineNames);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArraySimple(map, prefix + "SecurityGroupIDs.", this.SecurityGroupIDs);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "ModifyPortableDataDisk", this.ModifyPortableDataDisk);

    }
}

