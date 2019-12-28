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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeQuotaItem extends AbstractModel{

    /**
    * Availability zone.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance model.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance billing method. Valid values: <br><li>`PREPAID`: prepaid, i.e., monthly subscription <br><li>`POSTPAID_BY_HOUR`: pay-as-you-go <br><li>`CDHPAID`: you are only billed for the [CDH](https://cloud.tencent.com/document/product/416) instances, not the CVMs running on the CDHs. <br><li>`SPOTPAID`: you are billed based on your bid.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * ENI type. For example, 25 represents an ENI of 25 GB.
    */
    @SerializedName("NetworkCard")
    @Expose
    private Long NetworkCard;

    /**
    * Additional data.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * Number of CPU cores of an instance model.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Instance memory capacity; unit: `GB`.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance model family.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Model name.
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * List of local disk specifications. If the parameter returns null, it means that local disks cannot be created.
    */
    @SerializedName("LocalDiskTypeList")
    @Expose
    private LocalDiskType [] LocalDiskTypeList;

    /**
    * Whether an instance model is available. Valid values: <br><li>SELL: available <br><li>SOLD_OUT: sold out
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Price of an instance model.
    */
    @SerializedName("Price")
    @Expose
    private ItemPrice Price;

    /**
     * Get Availability zone. 
     * @return Zone Availability zone.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone.
     * @param Zone Availability zone.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance model. 
     * @return InstanceType Instance model.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model.
     * @param InstanceType Instance model.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance billing method. Valid values: <br><li>`PREPAID`: prepaid, i.e., monthly subscription <br><li>`POSTPAID_BY_HOUR`: pay-as-you-go <br><li>`CDHPAID`: you are only billed for the [CDH](https://cloud.tencent.com/document/product/416) instances, not the CVMs running on the CDHs. <br><li>`SPOTPAID`: you are billed based on your bid. 
     * @return InstanceChargeType Instance billing method. Valid values: <br><li>`PREPAID`: prepaid, i.e., monthly subscription <br><li>`POSTPAID_BY_HOUR`: pay-as-you-go <br><li>`CDHPAID`: you are only billed for the [CDH](https://cloud.tencent.com/document/product/416) instances, not the CVMs running on the CDHs. <br><li>`SPOTPAID`: you are billed based on your bid.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing method. Valid values: <br><li>`PREPAID`: prepaid, i.e., monthly subscription <br><li>`POSTPAID_BY_HOUR`: pay-as-you-go <br><li>`CDHPAID`: you are only billed for the [CDH](https://cloud.tencent.com/document/product/416) instances, not the CVMs running on the CDHs. <br><li>`SPOTPAID`: you are billed based on your bid.
     * @param InstanceChargeType Instance billing method. Valid values: <br><li>`PREPAID`: prepaid, i.e., monthly subscription <br><li>`POSTPAID_BY_HOUR`: pay-as-you-go <br><li>`CDHPAID`: you are only billed for the [CDH](https://cloud.tencent.com/document/product/416) instances, not the CVMs running on the CDHs. <br><li>`SPOTPAID`: you are billed based on your bid.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get ENI type. For example, 25 represents an ENI of 25 GB. 
     * @return NetworkCard ENI type. For example, 25 represents an ENI of 25 GB.
     */
    public Long getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * Set ENI type. For example, 25 represents an ENI of 25 GB.
     * @param NetworkCard ENI type. For example, 25 represents an ENI of 25 GB.
     */
    public void setNetworkCard(Long NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    /**
     * Get Additional data.
Note: This field may return null, indicating that no valid value is found. 
     * @return Externals Additional data.
Note: This field may return null, indicating that no valid value is found.
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * Set Additional data.
Note: This field may return null, indicating that no valid value is found.
     * @param Externals Additional data.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * Get Number of CPU cores of an instance model. 
     * @return Cpu Number of CPU cores of an instance model.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores of an instance model.
     * @param Cpu Number of CPU cores of an instance model.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Instance memory capacity; unit: `GB`. 
     * @return Memory Instance memory capacity; unit: `GB`.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory capacity; unit: `GB`.
     * @param Memory Instance memory capacity; unit: `GB`.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance model family. 
     * @return InstanceFamily Instance model family.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Instance model family.
     * @param InstanceFamily Instance model family.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get Model name. 
     * @return TypeName Model name.
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Model name.
     * @param TypeName Model name.
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get List of local disk specifications. If the parameter returns null, it means that local disks cannot be created. 
     * @return LocalDiskTypeList List of local disk specifications. If the parameter returns null, it means that local disks cannot be created.
     */
    public LocalDiskType [] getLocalDiskTypeList() {
        return this.LocalDiskTypeList;
    }

    /**
     * Set List of local disk specifications. If the parameter returns null, it means that local disks cannot be created.
     * @param LocalDiskTypeList List of local disk specifications. If the parameter returns null, it means that local disks cannot be created.
     */
    public void setLocalDiskTypeList(LocalDiskType [] LocalDiskTypeList) {
        this.LocalDiskTypeList = LocalDiskTypeList;
    }

    /**
     * Get Whether an instance model is available. Valid values: <br><li>SELL: available <br><li>SOLD_OUT: sold out 
     * @return Status Whether an instance model is available. Valid values: <br><li>SELL: available <br><li>SOLD_OUT: sold out
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether an instance model is available. Valid values: <br><li>SELL: available <br><li>SOLD_OUT: sold out
     * @param Status Whether an instance model is available. Valid values: <br><li>SELL: available <br><li>SOLD_OUT: sold out
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Price of an instance model. 
     * @return Price Price of an instance model.
     */
    public ItemPrice getPrice() {
        return this.Price;
    }

    /**
     * Set Price of an instance model.
     * @param Price Price of an instance model.
     */
    public void setPrice(ItemPrice Price) {
        this.Price = Price;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "NetworkCard", this.NetworkCard);
        this.setParamObj(map, prefix + "Externals.", this.Externals);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamArrayObj(map, prefix + "LocalDiskTypeList.", this.LocalDiskTypeList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Price.", this.Price);

    }
}

