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

public class NodeSpecInstanceType extends AbstractModel {

    /**
    * <p>Specifications.</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>4</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>8, unit: GB.</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Sorting order. Smaller values come first.</p>
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * <p>Quantity.</p>
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * <p>Sold-out reason.</p>
    */
    @SerializedName("SellOutReason")
    @Expose
    private String SellOutReason;

    /**
    * <p>System disk.</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private NodeSpecDisk [] SystemDisk;

    /**
    * <p>Data disk.</p>
    */
    @SerializedName("DataDisk")
    @Expose
    private NodeSpecDisk [] DataDisk;

    /**
    * <p>Local data disk.</p>
    */
    @SerializedName("LocalDataDisk")
    @Expose
    private NodeSpecDisk [] LocalDataDisk;

    /**
    * <p>Sold-out reason.</p>
    */
    @SerializedName("SoldOutReason")
    @Expose
    private String SoldOutReason;

    /**
    * <p>Instance family.</p>
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * <p>Node name.</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>Node type.</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>Category.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Category name.</p>
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * <p>Category classification.</p>
    */
    @SerializedName("FamilyName")
    @Expose
    private String FamilyName;

    /**
    * <p>CPU type.</p>
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * <p>RunOut: sold out; Less: low inventory; Enough: sufficient inventory</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Original price.</p>
    */
    @SerializedName("OriginPrice")
    @Expose
    private Float OriginPrice;

    /**
    * <p>Purchase duration supported by instance types using the committed use billing mode.</p>
    */
    @SerializedName("PrepaidUnderwritePeriods")
    @Expose
    private Long [] PrepaidUnderwritePeriods;

    /**
    * <p>GPU information.</p>
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
    * <p>Number of quotas.</p>
    */
    @SerializedName("QuotaNum")
    @Expose
    private Long QuotaNum;

    /**
    * <p>Quota unit.</p>
    */
    @SerializedName("QuotaUnit")
    @Expose
    private String QuotaUnit;

    /**
    * <p>Whether a high-performance computing cluster needs to be provided.</p>
    */
    @SerializedName("NeedHpcClusterId")
    @Expose
    private Boolean NeedHpcClusterId;

    /**
    * <p>Whether it is a GPU instance type.</p>
    */
    @SerializedName("IsGpuInstance")
    @Expose
    private Boolean IsGpuInstance;

    /**
    * <p>GPU resource definition in the Kubernetes scenario.</p>
    */
    @SerializedName("GpuResourceKey")
    @Expose
    private String GpuResourceKey;

    /**
    * <p>Number of GPU cards.</p>
    */
    @SerializedName("GpuNum")
    @Expose
    private Long GpuNum;

    /**
     * Get <p>Specifications.</p> 
     * @return InstanceType <p>Specifications.</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Specifications.</p>
     * @param InstanceType <p>Specifications.</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>4</p> 
     * @return Cpu <p>4</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>4</p>
     * @param Cpu <p>4</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>8, unit: GB.</p> 
     * @return Memory <p>8, unit: GB.</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>8, unit: GB.</p>
     * @param Memory <p>8, unit: GB.</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Sorting order. Smaller values come first.</p> 
     * @return Order <p>Sorting order. Smaller values come first.</p>
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting order. Smaller values come first.</p>
     * @param Order <p>Sorting order. Smaller values come first.</p>
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Quantity.</p> 
     * @return Num <p>Quantity.</p>
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set <p>Quantity.</p>
     * @param Num <p>Quantity.</p>
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get <p>Sold-out reason.</p> 
     * @return SellOutReason <p>Sold-out reason.</p>
     */
    public String getSellOutReason() {
        return this.SellOutReason;
    }

    /**
     * Set <p>Sold-out reason.</p>
     * @param SellOutReason <p>Sold-out reason.</p>
     */
    public void setSellOutReason(String SellOutReason) {
        this.SellOutReason = SellOutReason;
    }

    /**
     * Get <p>System disk.</p> 
     * @return SystemDisk <p>System disk.</p>
     */
    public NodeSpecDisk [] getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>System disk.</p>
     * @param SystemDisk <p>System disk.</p>
     */
    public void setSystemDisk(NodeSpecDisk [] SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>Data disk.</p> 
     * @return DataDisk <p>Data disk.</p>
     */
    public NodeSpecDisk [] getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set <p>Data disk.</p>
     * @param DataDisk <p>Data disk.</p>
     */
    public void setDataDisk(NodeSpecDisk [] DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get <p>Local data disk.</p> 
     * @return LocalDataDisk <p>Local data disk.</p>
     */
    public NodeSpecDisk [] getLocalDataDisk() {
        return this.LocalDataDisk;
    }

    /**
     * Set <p>Local data disk.</p>
     * @param LocalDataDisk <p>Local data disk.</p>
     */
    public void setLocalDataDisk(NodeSpecDisk [] LocalDataDisk) {
        this.LocalDataDisk = LocalDataDisk;
    }

    /**
     * Get <p>Sold-out reason.</p> 
     * @return SoldOutReason <p>Sold-out reason.</p>
     */
    public String getSoldOutReason() {
        return this.SoldOutReason;
    }

    /**
     * Set <p>Sold-out reason.</p>
     * @param SoldOutReason <p>Sold-out reason.</p>
     */
    public void setSoldOutReason(String SoldOutReason) {
        this.SoldOutReason = SoldOutReason;
    }

    /**
     * Get <p>Instance family.</p> 
     * @return InstanceFamily <p>Instance family.</p>
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set <p>Instance family.</p>
     * @param InstanceFamily <p>Instance family.</p>
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
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
     * Get <p>Node type.</p> 
     * @return NodeType <p>Node type.</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Node type.</p>
     * @param NodeType <p>Node type.</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>Category.</p> 
     * @return Type <p>Category.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Category.</p>
     * @param Type <p>Category.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Category name.</p> 
     * @return TypeName <p>Category name.</p>
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set <p>Category name.</p>
     * @param TypeName <p>Category name.</p>
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get <p>Category classification.</p> 
     * @return FamilyName <p>Category classification.</p>
     */
    public String getFamilyName() {
        return this.FamilyName;
    }

    /**
     * Set <p>Category classification.</p>
     * @param FamilyName <p>Category classification.</p>
     */
    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
    }

    /**
     * Get <p>CPU type.</p> 
     * @return CpuType <p>CPU type.</p>
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set <p>CPU type.</p>
     * @param CpuType <p>CPU type.</p>
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get <p>RunOut: sold out; Less: low inventory; Enough: sufficient inventory</p> 
     * @return Remark <p>RunOut: sold out; Less: low inventory; Enough: sufficient inventory</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>RunOut: sold out; Less: low inventory; Enough: sufficient inventory</p>
     * @param Remark <p>RunOut: sold out; Less: low inventory; Enough: sufficient inventory</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Original price.</p> 
     * @return OriginPrice <p>Original price.</p>
     */
    public Float getOriginPrice() {
        return this.OriginPrice;
    }

    /**
     * Set <p>Original price.</p>
     * @param OriginPrice <p>Original price.</p>
     */
    public void setOriginPrice(Float OriginPrice) {
        this.OriginPrice = OriginPrice;
    }

    /**
     * Get <p>Purchase duration supported by instance types using the committed use billing mode.</p> 
     * @return PrepaidUnderwritePeriods <p>Purchase duration supported by instance types using the committed use billing mode.</p>
     */
    public Long [] getPrepaidUnderwritePeriods() {
        return this.PrepaidUnderwritePeriods;
    }

    /**
     * Set <p>Purchase duration supported by instance types using the committed use billing mode.</p>
     * @param PrepaidUnderwritePeriods <p>Purchase duration supported by instance types using the committed use billing mode.</p>
     */
    public void setPrepaidUnderwritePeriods(Long [] PrepaidUnderwritePeriods) {
        this.PrepaidUnderwritePeriods = PrepaidUnderwritePeriods;
    }

    /**
     * Get <p>GPU information.</p> 
     * @return GpuDesc <p>GPU information.</p>
     */
    public String getGpuDesc() {
        return this.GpuDesc;
    }

    /**
     * Set <p>GPU information.</p>
     * @param GpuDesc <p>GPU information.</p>
     */
    public void setGpuDesc(String GpuDesc) {
        this.GpuDesc = GpuDesc;
    }

    /**
     * Get <p>Number of quotas.</p> 
     * @return QuotaNum <p>Number of quotas.</p>
     */
    public Long getQuotaNum() {
        return this.QuotaNum;
    }

    /**
     * Set <p>Number of quotas.</p>
     * @param QuotaNum <p>Number of quotas.</p>
     */
    public void setQuotaNum(Long QuotaNum) {
        this.QuotaNum = QuotaNum;
    }

    /**
     * Get <p>Quota unit.</p> 
     * @return QuotaUnit <p>Quota unit.</p>
     */
    public String getQuotaUnit() {
        return this.QuotaUnit;
    }

    /**
     * Set <p>Quota unit.</p>
     * @param QuotaUnit <p>Quota unit.</p>
     */
    public void setQuotaUnit(String QuotaUnit) {
        this.QuotaUnit = QuotaUnit;
    }

    /**
     * Get <p>Whether a high-performance computing cluster needs to be provided.</p> 
     * @return NeedHpcClusterId <p>Whether a high-performance computing cluster needs to be provided.</p>
     */
    public Boolean getNeedHpcClusterId() {
        return this.NeedHpcClusterId;
    }

    /**
     * Set <p>Whether a high-performance computing cluster needs to be provided.</p>
     * @param NeedHpcClusterId <p>Whether a high-performance computing cluster needs to be provided.</p>
     */
    public void setNeedHpcClusterId(Boolean NeedHpcClusterId) {
        this.NeedHpcClusterId = NeedHpcClusterId;
    }

    /**
     * Get <p>Whether it is a GPU instance type.</p> 
     * @return IsGpuInstance <p>Whether it is a GPU instance type.</p>
     */
    public Boolean getIsGpuInstance() {
        return this.IsGpuInstance;
    }

    /**
     * Set <p>Whether it is a GPU instance type.</p>
     * @param IsGpuInstance <p>Whether it is a GPU instance type.</p>
     */
    public void setIsGpuInstance(Boolean IsGpuInstance) {
        this.IsGpuInstance = IsGpuInstance;
    }

    /**
     * Get <p>GPU resource definition in the Kubernetes scenario.</p> 
     * @return GpuResourceKey <p>GPU resource definition in the Kubernetes scenario.</p>
     */
    public String getGpuResourceKey() {
        return this.GpuResourceKey;
    }

    /**
     * Set <p>GPU resource definition in the Kubernetes scenario.</p>
     * @param GpuResourceKey <p>GPU resource definition in the Kubernetes scenario.</p>
     */
    public void setGpuResourceKey(String GpuResourceKey) {
        this.GpuResourceKey = GpuResourceKey;
    }

    /**
     * Get <p>Number of GPU cards.</p> 
     * @return GpuNum <p>Number of GPU cards.</p>
     */
    public Long getGpuNum() {
        return this.GpuNum;
    }

    /**
     * Set <p>Number of GPU cards.</p>
     * @param GpuNum <p>Number of GPU cards.</p>
     */
    public void setGpuNum(Long GpuNum) {
        this.GpuNum = GpuNum;
    }

    public NodeSpecInstanceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSpecInstanceType(NodeSpecInstanceType source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.SellOutReason != null) {
            this.SellOutReason = new String(source.SellOutReason);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new NodeSpecDisk[source.SystemDisk.length];
            for (int i = 0; i < source.SystemDisk.length; i++) {
                this.SystemDisk[i] = new NodeSpecDisk(source.SystemDisk[i]);
            }
        }
        if (source.DataDisk != null) {
            this.DataDisk = new NodeSpecDisk[source.DataDisk.length];
            for (int i = 0; i < source.DataDisk.length; i++) {
                this.DataDisk[i] = new NodeSpecDisk(source.DataDisk[i]);
            }
        }
        if (source.LocalDataDisk != null) {
            this.LocalDataDisk = new NodeSpecDisk[source.LocalDataDisk.length];
            for (int i = 0; i < source.LocalDataDisk.length; i++) {
                this.LocalDataDisk[i] = new NodeSpecDisk(source.LocalDataDisk[i]);
            }
        }
        if (source.SoldOutReason != null) {
            this.SoldOutReason = new String(source.SoldOutReason);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.FamilyName != null) {
            this.FamilyName = new String(source.FamilyName);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.OriginPrice != null) {
            this.OriginPrice = new Float(source.OriginPrice);
        }
        if (source.PrepaidUnderwritePeriods != null) {
            this.PrepaidUnderwritePeriods = new Long[source.PrepaidUnderwritePeriods.length];
            for (int i = 0; i < source.PrepaidUnderwritePeriods.length; i++) {
                this.PrepaidUnderwritePeriods[i] = new Long(source.PrepaidUnderwritePeriods[i]);
            }
        }
        if (source.GpuDesc != null) {
            this.GpuDesc = new String(source.GpuDesc);
        }
        if (source.QuotaNum != null) {
            this.QuotaNum = new Long(source.QuotaNum);
        }
        if (source.QuotaUnit != null) {
            this.QuotaUnit = new String(source.QuotaUnit);
        }
        if (source.NeedHpcClusterId != null) {
            this.NeedHpcClusterId = new Boolean(source.NeedHpcClusterId);
        }
        if (source.IsGpuInstance != null) {
            this.IsGpuInstance = new Boolean(source.IsGpuInstance);
        }
        if (source.GpuResourceKey != null) {
            this.GpuResourceKey = new String(source.GpuResourceKey);
        }
        if (source.GpuNum != null) {
            this.GpuNum = new Long(source.GpuNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "SellOutReason", this.SellOutReason);
        this.setParamArrayObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisk.", this.DataDisk);
        this.setParamArrayObj(map, prefix + "LocalDataDisk.", this.LocalDataDisk);
        this.setParamSimple(map, prefix + "SoldOutReason", this.SoldOutReason);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "FamilyName", this.FamilyName);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "OriginPrice", this.OriginPrice);
        this.setParamArraySimple(map, prefix + "PrepaidUnderwritePeriods.", this.PrepaidUnderwritePeriods);
        this.setParamSimple(map, prefix + "GpuDesc", this.GpuDesc);
        this.setParamSimple(map, prefix + "QuotaNum", this.QuotaNum);
        this.setParamSimple(map, prefix + "QuotaUnit", this.QuotaUnit);
        this.setParamSimple(map, prefix + "NeedHpcClusterId", this.NeedHpcClusterId);
        this.setParamSimple(map, prefix + "IsGpuInstance", this.IsGpuInstance);
        this.setParamSimple(map, prefix + "GpuResourceKey", this.GpuResourceKey);
        this.setParamSimple(map, prefix + "GpuNum", this.GpuNum);

    }
}

