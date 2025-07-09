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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedClusterOrderItem extends AbstractModel {

    /**
    * CDC type id
    */
    @SerializedName("DedicatedClusterTypeId")
    @Expose
    private String DedicatedClusterTypeId;

    /**
    * List of supported storage types
    */
    @SerializedName("SupportedStorageType")
    @Expose
    private String [] SupportedStorageType;

    /**
    * Supported uplink switch transmission rate (GiB)
    */
    @SerializedName("SupportedUplinkSpeed")
    @Expose
    private Long [] SupportedUplinkSpeed;

    /**
    * List of supported instance families
    */
    @SerializedName("SupportedInstanceFamily")
    @Expose
    private String [] SupportedInstanceFamily;

    /**
    * Floor weight capacity (KG)
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Power requirements (KW)
    */
    @SerializedName("PowerDraw")
    @Expose
    private Float PowerDraw;

    /**
    * Order status
    */
    @SerializedName("SubOrderStatus")
    @Expose
    private String SubOrderStatus;

    /**
    * Order creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Sub-order ID
    */
    @SerializedName("SubOrderId")
    @Expose
    private String SubOrderId;

    /**
    * Number of linked cluster types
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Brief description of type
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Detailed description of type
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Number of CPUs
    */
    @SerializedName("TotalCpu")
    @Expose
    private Long TotalCpu;

    /**
    * Number of memories
    */
    @SerializedName("TotalMem")
    @Expose
    private Long TotalMem;

    /**
    * Total GPUs
    */
    @SerializedName("TotalGpu")
    @Expose
    private Long TotalGpu;

    /**
    * English type name
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Type display 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("ComputeFormat")
    @Expose
    private String ComputeFormat;

    /**
    * Type family 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("TypeFamily")
    @Expose
    private String TypeFamily;

    /**
    * 0 for unpaid, 1 for paid 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("SubOrderPayStatus")
    @Expose
    private Long SubOrderPayStatus;

    /**
     * Get CDC type id 
     * @return DedicatedClusterTypeId CDC type id
     */
    public String getDedicatedClusterTypeId() {
        return this.DedicatedClusterTypeId;
    }

    /**
     * Set CDC type id
     * @param DedicatedClusterTypeId CDC type id
     */
    public void setDedicatedClusterTypeId(String DedicatedClusterTypeId) {
        this.DedicatedClusterTypeId = DedicatedClusterTypeId;
    }

    /**
     * Get List of supported storage types 
     * @return SupportedStorageType List of supported storage types
     */
    public String [] getSupportedStorageType() {
        return this.SupportedStorageType;
    }

    /**
     * Set List of supported storage types
     * @param SupportedStorageType List of supported storage types
     */
    public void setSupportedStorageType(String [] SupportedStorageType) {
        this.SupportedStorageType = SupportedStorageType;
    }

    /**
     * Get Supported uplink switch transmission rate (GiB) 
     * @return SupportedUplinkSpeed Supported uplink switch transmission rate (GiB)
     */
    public Long [] getSupportedUplinkSpeed() {
        return this.SupportedUplinkSpeed;
    }

    /**
     * Set Supported uplink switch transmission rate (GiB)
     * @param SupportedUplinkSpeed Supported uplink switch transmission rate (GiB)
     */
    public void setSupportedUplinkSpeed(Long [] SupportedUplinkSpeed) {
        this.SupportedUplinkSpeed = SupportedUplinkSpeed;
    }

    /**
     * Get List of supported instance families 
     * @return SupportedInstanceFamily List of supported instance families
     */
    public String [] getSupportedInstanceFamily() {
        return this.SupportedInstanceFamily;
    }

    /**
     * Set List of supported instance families
     * @param SupportedInstanceFamily List of supported instance families
     */
    public void setSupportedInstanceFamily(String [] SupportedInstanceFamily) {
        this.SupportedInstanceFamily = SupportedInstanceFamily;
    }

    /**
     * Get Floor weight capacity (KG) 
     * @return Weight Floor weight capacity (KG)
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Floor weight capacity (KG)
     * @param Weight Floor weight capacity (KG)
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Power requirements (KW) 
     * @return PowerDraw Power requirements (KW)
     */
    public Float getPowerDraw() {
        return this.PowerDraw;
    }

    /**
     * Set Power requirements (KW)
     * @param PowerDraw Power requirements (KW)
     */
    public void setPowerDraw(Float PowerDraw) {
        this.PowerDraw = PowerDraw;
    }

    /**
     * Get Order status 
     * @return SubOrderStatus Order status
     */
    public String getSubOrderStatus() {
        return this.SubOrderStatus;
    }

    /**
     * Set Order status
     * @param SubOrderStatus Order status
     */
    public void setSubOrderStatus(String SubOrderStatus) {
        this.SubOrderStatus = SubOrderStatus;
    }

    /**
     * Get Order creation time 
     * @return CreateTime Order creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Order creation time
     * @param CreateTime Order creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Sub-order ID 
     * @return SubOrderId Sub-order ID
     */
    public String getSubOrderId() {
        return this.SubOrderId;
    }

    /**
     * Set Sub-order ID
     * @param SubOrderId Sub-order ID
     */
    public void setSubOrderId(String SubOrderId) {
        this.SubOrderId = SubOrderId;
    }

    /**
     * Get Number of linked cluster types 
     * @return Count Number of linked cluster types
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of linked cluster types
     * @param Count Number of linked cluster types
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Brief description of type 
     * @return Name Brief description of type
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Brief description of type
     * @param Name Brief description of type
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Detailed description of type 
     * @return Description Detailed description of type
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Detailed description of type
     * @param Description Detailed description of type
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Number of CPUs 
     * @return TotalCpu Number of CPUs
     */
    public Long getTotalCpu() {
        return this.TotalCpu;
    }

    /**
     * Set Number of CPUs
     * @param TotalCpu Number of CPUs
     */
    public void setTotalCpu(Long TotalCpu) {
        this.TotalCpu = TotalCpu;
    }

    /**
     * Get Number of memories 
     * @return TotalMem Number of memories
     */
    public Long getTotalMem() {
        return this.TotalMem;
    }

    /**
     * Set Number of memories
     * @param TotalMem Number of memories
     */
    public void setTotalMem(Long TotalMem) {
        this.TotalMem = TotalMem;
    }

    /**
     * Get Total GPUs 
     * @return TotalGpu Total GPUs
     */
    public Long getTotalGpu() {
        return this.TotalGpu;
    }

    /**
     * Set Total GPUs
     * @param TotalGpu Total GPUs
     */
    public void setTotalGpu(Long TotalGpu) {
        this.TotalGpu = TotalGpu;
    }

    /**
     * Get English type name 
     * @return TypeName English type name
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set English type name
     * @param TypeName English type name
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Type display 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return ComputeFormat Type display 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getComputeFormat() {
        return this.ComputeFormat;
    }

    /**
     * Set Type display 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param ComputeFormat Type display 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setComputeFormat(String ComputeFormat) {
        this.ComputeFormat = ComputeFormat;
    }

    /**
     * Get Type family 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return TypeFamily Type family 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getTypeFamily() {
        return this.TypeFamily;
    }

    /**
     * Set Type family 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param TypeFamily Type family 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setTypeFamily(String TypeFamily) {
        this.TypeFamily = TypeFamily;
    }

    /**
     * Get 0 for unpaid, 1 for paid 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return SubOrderPayStatus 0 for unpaid, 1 for paid 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Long getSubOrderPayStatus() {
        return this.SubOrderPayStatus;
    }

    /**
     * Set 0 for unpaid, 1 for paid 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param SubOrderPayStatus 0 for unpaid, 1 for paid 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setSubOrderPayStatus(Long SubOrderPayStatus) {
        this.SubOrderPayStatus = SubOrderPayStatus;
    }

    public DedicatedClusterOrderItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedClusterOrderItem(DedicatedClusterOrderItem source) {
        if (source.DedicatedClusterTypeId != null) {
            this.DedicatedClusterTypeId = new String(source.DedicatedClusterTypeId);
        }
        if (source.SupportedStorageType != null) {
            this.SupportedStorageType = new String[source.SupportedStorageType.length];
            for (int i = 0; i < source.SupportedStorageType.length; i++) {
                this.SupportedStorageType[i] = new String(source.SupportedStorageType[i]);
            }
        }
        if (source.SupportedUplinkSpeed != null) {
            this.SupportedUplinkSpeed = new Long[source.SupportedUplinkSpeed.length];
            for (int i = 0; i < source.SupportedUplinkSpeed.length; i++) {
                this.SupportedUplinkSpeed[i] = new Long(source.SupportedUplinkSpeed[i]);
            }
        }
        if (source.SupportedInstanceFamily != null) {
            this.SupportedInstanceFamily = new String[source.SupportedInstanceFamily.length];
            for (int i = 0; i < source.SupportedInstanceFamily.length; i++) {
                this.SupportedInstanceFamily[i] = new String(source.SupportedInstanceFamily[i]);
            }
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.PowerDraw != null) {
            this.PowerDraw = new Float(source.PowerDraw);
        }
        if (source.SubOrderStatus != null) {
            this.SubOrderStatus = new String(source.SubOrderStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SubOrderId != null) {
            this.SubOrderId = new String(source.SubOrderId);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TotalCpu != null) {
            this.TotalCpu = new Long(source.TotalCpu);
        }
        if (source.TotalMem != null) {
            this.TotalMem = new Long(source.TotalMem);
        }
        if (source.TotalGpu != null) {
            this.TotalGpu = new Long(source.TotalGpu);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.ComputeFormat != null) {
            this.ComputeFormat = new String(source.ComputeFormat);
        }
        if (source.TypeFamily != null) {
            this.TypeFamily = new String(source.TypeFamily);
        }
        if (source.SubOrderPayStatus != null) {
            this.SubOrderPayStatus = new Long(source.SubOrderPayStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterTypeId", this.DedicatedClusterTypeId);
        this.setParamArraySimple(map, prefix + "SupportedStorageType.", this.SupportedStorageType);
        this.setParamArraySimple(map, prefix + "SupportedUplinkSpeed.", this.SupportedUplinkSpeed);
        this.setParamArraySimple(map, prefix + "SupportedInstanceFamily.", this.SupportedInstanceFamily);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "PowerDraw", this.PowerDraw);
        this.setParamSimple(map, prefix + "SubOrderStatus", this.SubOrderStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SubOrderId", this.SubOrderId);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TotalCpu", this.TotalCpu);
        this.setParamSimple(map, prefix + "TotalMem", this.TotalMem);
        this.setParamSimple(map, prefix + "TotalGpu", this.TotalGpu);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "ComputeFormat", this.ComputeFormat);
        this.setParamSimple(map, prefix + "TypeFamily", this.TypeFamily);
        this.setParamSimple(map, prefix + "SubOrderPayStatus", this.SubOrderPayStatus);

    }
}

