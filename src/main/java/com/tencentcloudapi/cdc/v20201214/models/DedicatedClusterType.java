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

public class DedicatedClusterType extends AbstractModel {

    /**
    * Configuration id
    */
    @SerializedName("DedicatedClusterTypeId")
    @Expose
    private String DedicatedClusterTypeId;

    /**
    * Configuration description, corresponding to description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Configuration name, corresponding to computing resource type
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Configuration creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * List of supported storage types
    */
    @SerializedName("SupportedStorageType")
    @Expose
    private String [] SupportedStorageType;

    /**
    * Supported uplink switch transmission rate
    */
    @SerializedName("SupportedUplinkGiB")
    @Expose
    private Long [] SupportedUplinkGiB;

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
    @SerializedName("PowerDrawKva")
    @Expose
    private Float PowerDrawKva;

    /**
    * Displays the details of computing resource types, and does not display resources such as storage; corresponding to type
    */
    @SerializedName("ComputeFormatDesc")
    @Expose
    private String ComputeFormatDesc;

    /**
     * Get Configuration id 
     * @return DedicatedClusterTypeId Configuration id
     */
    public String getDedicatedClusterTypeId() {
        return this.DedicatedClusterTypeId;
    }

    /**
     * Set Configuration id
     * @param DedicatedClusterTypeId Configuration id
     */
    public void setDedicatedClusterTypeId(String DedicatedClusterTypeId) {
        this.DedicatedClusterTypeId = DedicatedClusterTypeId;
    }

    /**
     * Get Configuration description, corresponding to description 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Description Configuration description, corresponding to description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Configuration description, corresponding to description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Description Configuration description, corresponding to description 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Configuration name, corresponding to computing resource type 
     * @return Name Configuration name, corresponding to computing resource type
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Configuration name, corresponding to computing resource type
     * @param Name Configuration name, corresponding to computing resource type
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Configuration creation time 
     * @return CreateTime Configuration creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Configuration creation time
     * @param CreateTime Configuration creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get Supported uplink switch transmission rate 
     * @return SupportedUplinkGiB Supported uplink switch transmission rate
     */
    public Long [] getSupportedUplinkGiB() {
        return this.SupportedUplinkGiB;
    }

    /**
     * Set Supported uplink switch transmission rate
     * @param SupportedUplinkGiB Supported uplink switch transmission rate
     */
    public void setSupportedUplinkGiB(Long [] SupportedUplinkGiB) {
        this.SupportedUplinkGiB = SupportedUplinkGiB;
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
     * @return PowerDrawKva Power requirements (KW)
     */
    public Float getPowerDrawKva() {
        return this.PowerDrawKva;
    }

    /**
     * Set Power requirements (KW)
     * @param PowerDrawKva Power requirements (KW)
     */
    public void setPowerDrawKva(Float PowerDrawKva) {
        this.PowerDrawKva = PowerDrawKva;
    }

    /**
     * Get Displays the details of computing resource types, and does not display resources such as storage; corresponding to type 
     * @return ComputeFormatDesc Displays the details of computing resource types, and does not display resources such as storage; corresponding to type
     */
    public String getComputeFormatDesc() {
        return this.ComputeFormatDesc;
    }

    /**
     * Set Displays the details of computing resource types, and does not display resources such as storage; corresponding to type
     * @param ComputeFormatDesc Displays the details of computing resource types, and does not display resources such as storage; corresponding to type
     */
    public void setComputeFormatDesc(String ComputeFormatDesc) {
        this.ComputeFormatDesc = ComputeFormatDesc;
    }

    public DedicatedClusterType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedClusterType(DedicatedClusterType source) {
        if (source.DedicatedClusterTypeId != null) {
            this.DedicatedClusterTypeId = new String(source.DedicatedClusterTypeId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SupportedStorageType != null) {
            this.SupportedStorageType = new String[source.SupportedStorageType.length];
            for (int i = 0; i < source.SupportedStorageType.length; i++) {
                this.SupportedStorageType[i] = new String(source.SupportedStorageType[i]);
            }
        }
        if (source.SupportedUplinkGiB != null) {
            this.SupportedUplinkGiB = new Long[source.SupportedUplinkGiB.length];
            for (int i = 0; i < source.SupportedUplinkGiB.length; i++) {
                this.SupportedUplinkGiB[i] = new Long(source.SupportedUplinkGiB[i]);
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
        if (source.PowerDrawKva != null) {
            this.PowerDrawKva = new Float(source.PowerDrawKva);
        }
        if (source.ComputeFormatDesc != null) {
            this.ComputeFormatDesc = new String(source.ComputeFormatDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterTypeId", this.DedicatedClusterTypeId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "SupportedStorageType.", this.SupportedStorageType);
        this.setParamArraySimple(map, prefix + "SupportedUplinkGiB.", this.SupportedUplinkGiB);
        this.setParamArraySimple(map, prefix + "SupportedInstanceFamily.", this.SupportedInstanceFamily);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "PowerDrawKva", this.PowerDrawKva);
        this.setParamSimple(map, prefix + "ComputeFormatDesc", this.ComputeFormatDesc);

    }
}

