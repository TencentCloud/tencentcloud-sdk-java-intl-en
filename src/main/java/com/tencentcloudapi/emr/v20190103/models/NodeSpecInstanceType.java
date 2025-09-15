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
    * Specifications.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 4
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 8, in GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Order, with the smaller coming first.
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * Quantity.
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * Reasons for running out of stock.
    */
    @SerializedName("SellOutReason")
    @Expose
    private String SellOutReason;

    /**
    * System disk.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SystemDisk")
    @Expose
    private NodeSpecDisk [] SystemDisk;

    /**
    * Data disk.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataDisk")
    @Expose
    private NodeSpecDisk [] DataDisk;

    /**
    * Local data disk.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocalDataDisk")
    @Expose
    private NodeSpecDisk [] LocalDataDisk;

    /**
    * Reasons for running out of stock.
    */
    @SerializedName("SoldOutReason")
    @Expose
    private String SoldOutReason;

    /**
    * Model category.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Node type.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Category.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Category name.
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Category classification.
    */
    @SerializedName("FamilyName")
    @Expose
    private String FamilyName;

    /**
    * CPU type.
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * RunOut (denoting running out of stock), Less (denoting low inventory), and Enough (denoting sufficient).
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Original price.
    */
    @SerializedName("OriginPrice")
    @Expose
    private Float OriginPrice;

    /**
    * Supported purchase terms for committed use billing models.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrepaidUnderwritePeriods")
    @Expose
    private Long [] PrepaidUnderwritePeriods;

    /**
    * GPU information.
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
     * Get Specifications. 
     * @return InstanceType Specifications.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specifications.
     * @param InstanceType Specifications.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 4 
     * @return Cpu 4
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 4
     * @param Cpu 4
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 8, in GB. 
     * @return Memory 8, in GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 8, in GB.
     * @param Memory 8, in GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Order, with the smaller coming first. 
     * @return Order Order, with the smaller coming first.
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set Order, with the smaller coming first.
     * @param Order Order, with the smaller coming first.
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get Quantity. 
     * @return Num Quantity.
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set Quantity.
     * @param Num Quantity.
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get Reasons for running out of stock. 
     * @return SellOutReason Reasons for running out of stock.
     */
    public String getSellOutReason() {
        return this.SellOutReason;
    }

    /**
     * Set Reasons for running out of stock.
     * @param SellOutReason Reasons for running out of stock.
     */
    public void setSellOutReason(String SellOutReason) {
        this.SellOutReason = SellOutReason;
    }

    /**
     * Get System disk.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SystemDisk System disk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeSpecDisk [] getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SystemDisk System disk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSystemDisk(NodeSpecDisk [] SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Data disk.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataDisk Data disk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeSpecDisk [] getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set Data disk.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataDisk Data disk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataDisk(NodeSpecDisk [] DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get Local data disk.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LocalDataDisk Local data disk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NodeSpecDisk [] getLocalDataDisk() {
        return this.LocalDataDisk;
    }

    /**
     * Set Local data disk.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LocalDataDisk Local data disk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocalDataDisk(NodeSpecDisk [] LocalDataDisk) {
        this.LocalDataDisk = LocalDataDisk;
    }

    /**
     * Get Reasons for running out of stock. 
     * @return SoldOutReason Reasons for running out of stock.
     */
    public String getSoldOutReason() {
        return this.SoldOutReason;
    }

    /**
     * Set Reasons for running out of stock.
     * @param SoldOutReason Reasons for running out of stock.
     */
    public void setSoldOutReason(String SoldOutReason) {
        this.SoldOutReason = SoldOutReason;
    }

    /**
     * Get Model category. 
     * @return InstanceFamily Model category.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Model category.
     * @param InstanceFamily Model category.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
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
     * Get Node type. 
     * @return NodeType Node type.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type.
     * @param NodeType Node type.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Category. 
     * @return Type Category.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Category.
     * @param Type Category.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Category name. 
     * @return TypeName Category name.
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Category name.
     * @param TypeName Category name.
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Category classification. 
     * @return FamilyName Category classification.
     */
    public String getFamilyName() {
        return this.FamilyName;
    }

    /**
     * Set Category classification.
     * @param FamilyName Category classification.
     */
    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
    }

    /**
     * Get CPU type. 
     * @return CpuType CPU type.
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set CPU type.
     * @param CpuType CPU type.
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get RunOut (denoting running out of stock), Less (denoting low inventory), and Enough (denoting sufficient). 
     * @return Remark RunOut (denoting running out of stock), Less (denoting low inventory), and Enough (denoting sufficient).
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set RunOut (denoting running out of stock), Less (denoting low inventory), and Enough (denoting sufficient).
     * @param Remark RunOut (denoting running out of stock), Less (denoting low inventory), and Enough (denoting sufficient).
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Original price. 
     * @return OriginPrice Original price.
     */
    public Float getOriginPrice() {
        return this.OriginPrice;
    }

    /**
     * Set Original price.
     * @param OriginPrice Original price.
     */
    public void setOriginPrice(Float OriginPrice) {
        this.OriginPrice = OriginPrice;
    }

    /**
     * Get Supported purchase terms for committed use billing models.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrepaidUnderwritePeriods Supported purchase terms for committed use billing models.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getPrepaidUnderwritePeriods() {
        return this.PrepaidUnderwritePeriods;
    }

    /**
     * Set Supported purchase terms for committed use billing models.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrepaidUnderwritePeriods Supported purchase terms for committed use billing models.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrepaidUnderwritePeriods(Long [] PrepaidUnderwritePeriods) {
        this.PrepaidUnderwritePeriods = PrepaidUnderwritePeriods;
    }

    /**
     * Get GPU information. 
     * @return GpuDesc GPU information.
     */
    public String getGpuDesc() {
        return this.GpuDesc;
    }

    /**
     * Set GPU information.
     * @param GpuDesc GPU information.
     */
    public void setGpuDesc(String GpuDesc) {
        this.GpuDesc = GpuDesc;
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

    }
}

