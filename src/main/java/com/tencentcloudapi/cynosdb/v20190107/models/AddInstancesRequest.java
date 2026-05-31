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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddInstancesRequest extends AbstractModel {

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cpu cores</p>
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
    * <p>Instance Machine Type. Supported values are as follows:</p><ul><li>common: indicates universal type</li><li>exclusive: indicates exclusive</li></ul>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>Instance group ID, used when adding new instances to an existing RO group. If not passed, a new RO group will be created. The current version does not recommend transmitting this value.</p>
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * <p>ID of the associated VPC network.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet ID. If VpcId is set up, SubnetId is required.</p>
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
    * <p>Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>Database type, value ranges from...to...: </p><li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>Order source, string length range [0,64)</p>
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * <p>Transaction mode. 0: place order and pay; 1: place order</p>
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * <p>Parameter template ID</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * <p>Parameter list. InstanceParams is valid only when ParamTemplateId is passed in.</p>
    */
    @SerializedName("InstanceParams")
    @Expose
    private ModifyParamItem [] InstanceParams;

    /**
    * <p>Security group ID. You can specify security groups when creating a read-only instance.</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>proxy sync upgrade</p>
    */
    @SerializedName("UpgradeProxy")
    @Expose
    private UpgradeProxy UpgradeProxy;

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cpu cores</p> 
     * @return Cpu <p>Cpu cores</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Cpu cores</p>
     * @param Cpu <p>Cpu cores</p>
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
     * Get <p>Instance Machine Type. Supported values are as follows:</p><ul><li>common: indicates universal type</li><li>exclusive: indicates exclusive</li></ul> 
     * @return DeviceType <p>Instance Machine Type. Supported values are as follows:</p><ul><li>common: indicates universal type</li><li>exclusive: indicates exclusive</li></ul>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>Instance Machine Type. Supported values are as follows:</p><ul><li>common: indicates universal type</li><li>exclusive: indicates exclusive</li></ul>
     * @param DeviceType <p>Instance Machine Type. Supported values are as follows:</p><ul><li>common: indicates universal type</li><li>exclusive: indicates exclusive</li></ul>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>Instance group ID, used when adding new instances to an existing RO group. If not passed, a new RO group will be created. The current version does not recommend transmitting this value.</p> 
     * @return InstanceGrpId <p>Instance group ID, used when adding new instances to an existing RO group. If not passed, a new RO group will be created. The current version does not recommend transmitting this value.</p>
     * @deprecated
     */
    @Deprecated
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set <p>Instance group ID, used when adding new instances to an existing RO group. If not passed, a new RO group will be created. The current version does not recommend transmitting this value.</p>
     * @param InstanceGrpId <p>Instance group ID, used when adding new instances to an existing RO group. If not passed, a new RO group will be created. The current version does not recommend transmitting this value.</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get <p>ID of the associated VPC network.</p> 
     * @return VpcId <p>ID of the associated VPC network.</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>ID of the associated VPC network.</p>
     * @param VpcId <p>ID of the associated VPC network.</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID. If VpcId is set up, SubnetId is required.</p> 
     * @return SubnetId <p>Subnet ID. If VpcId is set up, SubnetId is required.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID. If VpcId is set up, SubnetId is required.</p>
     * @param SubnetId <p>Subnet ID. If VpcId is set up, SubnetId is required.</p>
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
     * Get <p>Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.</p> 
     * @return AutoVoucher <p>Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.</p>
     * @param AutoVoucher <p>Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>Database type, value ranges from...to...: </p><li> MYSQL </li> 
     * @return DbType <p>Database type, value ranges from...to...: </p><li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>Database type, value ranges from...to...: </p><li> MYSQL </li>
     * @param DbType <p>Database type, value ranges from...to...: </p><li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>Order source, string length range [0,64)</p> 
     * @return OrderSource <p>Order source, string length range [0,64)</p>
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set <p>Order source, string length range [0,64)</p>
     * @param OrderSource <p>Order source, string length range [0,64)</p>
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get <p>Transaction mode. 0: place order and pay; 1: place order</p> 
     * @return DealMode <p>Transaction mode. 0: place order and pay; 1: place order</p>
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set <p>Transaction mode. 0: place order and pay; 1: place order</p>
     * @param DealMode <p>Transaction mode. 0: place order and pay; 1: place order</p>
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get <p>Parameter template ID</p> 
     * @return ParamTemplateId <p>Parameter template ID</p>
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>Parameter template ID</p>
     * @param ParamTemplateId <p>Parameter template ID</p>
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>Parameter list. InstanceParams is valid only when ParamTemplateId is passed in.</p> 
     * @return InstanceParams <p>Parameter list. InstanceParams is valid only when ParamTemplateId is passed in.</p>
     */
    public ModifyParamItem [] getInstanceParams() {
        return this.InstanceParams;
    }

    /**
     * Set <p>Parameter list. InstanceParams is valid only when ParamTemplateId is passed in.</p>
     * @param InstanceParams <p>Parameter list. InstanceParams is valid only when ParamTemplateId is passed in.</p>
     */
    public void setInstanceParams(ModifyParamItem [] InstanceParams) {
        this.InstanceParams = InstanceParams;
    }

    /**
     * Get <p>Security group ID. You can specify security groups when creating a read-only instance.</p> 
     * @return SecurityGroupIds <p>Security group ID. You can specify security groups when creating a read-only instance.</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>Security group ID. You can specify security groups when creating a read-only instance.</p>
     * @param SecurityGroupIds <p>Security group ID. You can specify security groups when creating a read-only instance.</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>proxy sync upgrade</p> 
     * @return UpgradeProxy <p>proxy sync upgrade</p>
     */
    public UpgradeProxy getUpgradeProxy() {
        return this.UpgradeProxy;
    }

    /**
     * Set <p>proxy sync upgrade</p>
     * @param UpgradeProxy <p>proxy sync upgrade</p>
     */
    public void setUpgradeProxy(UpgradeProxy UpgradeProxy) {
        this.UpgradeProxy = UpgradeProxy;
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
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
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
        if (source.UpgradeProxy != null) {
            this.UpgradeProxy = new UpgradeProxy(source.UpgradeProxy);
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
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
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
        this.setParamObj(map, prefix + "UpgradeProxy.", this.UpgradeProxy);

    }
}

