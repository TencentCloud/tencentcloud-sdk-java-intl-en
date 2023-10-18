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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddInstancesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Number of added read-only instances. Value range: (0,16].
    */
    @SerializedName("ReadOnlyCount")
    @Expose
    private Long ReadOnlyCount;

    /**
    * Instance group ID, which will be used when you add an instance in an existing RO group. If this parameter is left empty, an RO group will be created. But it is not recommended to pass in this parameter for the current version, as this version has been disused.
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID. If `VpcId` is set, `SubnetId` is required.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The port used when adding an RO group. Value range: [0,65535).
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Instance name. String length range: [0,64).
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Whether to automatically select a voucher. 1: yes; 0: no. Default value: 0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Database type. Valid values: 
<li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Order source. String length range: [0,64).
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * Parameter template ID
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * Parameter list, which is valid only if `InstanceParams` is passed in to `ParamTemplateId`.
    */
    @SerializedName("InstanceParams")
    @Expose
    private ModifyParamItem [] InstanceParams;

    /**
    * Security group ID. You can specify an security group when creating a read-only instance.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Number of CPU cores 
     * @return Cpu Number of CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores
     * @param Cpu Number of CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory in GB 
     * @return Memory Memory in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory in GB
     * @param Memory Memory in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Number of added read-only instances. Value range: (0,16]. 
     * @return ReadOnlyCount Number of added read-only instances. Value range: (0,16].
     */
    public Long getReadOnlyCount() {
        return this.ReadOnlyCount;
    }

    /**
     * Set Number of added read-only instances. Value range: (0,16].
     * @param ReadOnlyCount Number of added read-only instances. Value range: (0,16].
     */
    public void setReadOnlyCount(Long ReadOnlyCount) {
        this.ReadOnlyCount = ReadOnlyCount;
    }

    /**
     * Get Instance group ID, which will be used when you add an instance in an existing RO group. If this parameter is left empty, an RO group will be created. But it is not recommended to pass in this parameter for the current version, as this version has been disused. 
     * @return InstanceGrpId Instance group ID, which will be used when you add an instance in an existing RO group. If this parameter is left empty, an RO group will be created. But it is not recommended to pass in this parameter for the current version, as this version has been disused.
     */
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set Instance group ID, which will be used when you add an instance in an existing RO group. If this parameter is left empty, an RO group will be created. But it is not recommended to pass in this parameter for the current version, as this version has been disused.
     * @param InstanceGrpId Instance group ID, which will be used when you add an instance in an existing RO group. If this parameter is left empty, an RO group will be created. But it is not recommended to pass in this parameter for the current version, as this version has been disused.
     */
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. If `VpcId` is set, `SubnetId` is required. 
     * @return SubnetId Subnet ID. If `VpcId` is set, `SubnetId` is required.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. If `VpcId` is set, `SubnetId` is required.
     * @param SubnetId Subnet ID. If `VpcId` is set, `SubnetId` is required.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The port used when adding an RO group. Value range: [0,65535). 
     * @return Port The port used when adding an RO group. Value range: [0,65535).
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set The port used when adding an RO group. Value range: [0,65535).
     * @param Port The port used when adding an RO group. Value range: [0,65535).
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Instance name. String length range: [0,64). 
     * @return InstanceName Instance name. String length range: [0,64).
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name. String length range: [0,64).
     * @param InstanceName Instance name. String length range: [0,64).
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Whether to automatically select a voucher. 1: yes; 0: no. Default value: 0 
     * @return AutoVoucher Whether to automatically select a voucher. 1: yes; 0: no. Default value: 0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically select a voucher. 1: yes; 0: no. Default value: 0
     * @param AutoVoucher Whether to automatically select a voucher. 1: yes; 0: no. Default value: 0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Database type. Valid values: 
<li> MYSQL </li> 
     * @return DbType Database type. Valid values: 
<li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Database type. Valid values: 
<li> MYSQL </li>
     * @param DbType Database type. Valid values: 
<li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Order source. String length range: [0,64). 
     * @return OrderSource Order source. String length range: [0,64).
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set Order source. String length range: [0,64).
     * @param OrderSource Order source. String length range: [0,64).
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order) 
     * @return DealMode Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
     * @param DealMode Transaction mode. Valid values: `0` (place and pay for an order), `1` (place an order)
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get Parameter template ID 
     * @return ParamTemplateId Parameter template ID
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set Parameter template ID
     * @param ParamTemplateId Parameter template ID
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get Parameter list, which is valid only if `InstanceParams` is passed in to `ParamTemplateId`. 
     * @return InstanceParams Parameter list, which is valid only if `InstanceParams` is passed in to `ParamTemplateId`.
     */
    public ModifyParamItem [] getInstanceParams() {
        return this.InstanceParams;
    }

    /**
     * Set Parameter list, which is valid only if `InstanceParams` is passed in to `ParamTemplateId`.
     * @param InstanceParams Parameter list, which is valid only if `InstanceParams` is passed in to `ParamTemplateId`.
     */
    public void setInstanceParams(ModifyParamItem [] InstanceParams) {
        this.InstanceParams = InstanceParams;
    }

    /**
     * Get Security group ID. You can specify an security group when creating a read-only instance. 
     * @return SecurityGroupIds Security group ID. You can specify an security group when creating a read-only instance.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group ID. You can specify an security group when creating a read-only instance.
     * @param SecurityGroupIds Security group ID. You can specify an security group when creating a read-only instance.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public AddInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddInstancesRequest(AddInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.ReadOnlyCount != null) {
            this.ReadOnlyCount = new Long(source.ReadOnlyCount);
        }
        if (source.InstanceGrpId != null) {
            this.InstanceGrpId = new String(source.InstanceGrpId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.OrderSource != null) {
            this.OrderSource = new String(source.OrderSource);
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
        if (source.InstanceParams != null) {
            this.InstanceParams = new ModifyParamItem[source.InstanceParams.length];
            for (int i = 0; i < source.InstanceParams.length; i++) {
                this.InstanceParams[i] = new ModifyParamItem(source.InstanceParams[i]);
            }
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "ReadOnlyCount", this.ReadOnlyCount);
        this.setParamSimple(map, prefix + "InstanceGrpId", this.InstanceGrpId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamArrayObj(map, prefix + "InstanceParams.", this.InstanceParams);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

