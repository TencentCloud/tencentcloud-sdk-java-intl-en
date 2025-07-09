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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCHDFSBindingProductRequest extends AbstractModel {

    /**
    * Names of metadata acceleration buckets to be bound
    */
    @SerializedName("MountPoint")
    @Expose
    private String MountPoint;

    /**
    * Types of buckets which are divided into cos and lakefs
    */
    @SerializedName("BucketType")
    @Expose
    private String BucketType;

    /**
    * Product name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Engine name. When ProductName selects DLC products, this parameter must be specified. When ProductName selects other products, it can be unspecified.
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * VPC information. When the product name is other, this parameter must be specified.
    */
    @SerializedName("VpcInfo")
    @Expose
    private VpcInfo [] VpcInfo;

    /**
     * Get Names of metadata acceleration buckets to be bound 
     * @return MountPoint Names of metadata acceleration buckets to be bound
     */
    public String getMountPoint() {
        return this.MountPoint;
    }

    /**
     * Set Names of metadata acceleration buckets to be bound
     * @param MountPoint Names of metadata acceleration buckets to be bound
     */
    public void setMountPoint(String MountPoint) {
        this.MountPoint = MountPoint;
    }

    /**
     * Get Types of buckets which are divided into cos and lakefs 
     * @return BucketType Types of buckets which are divided into cos and lakefs
     */
    public String getBucketType() {
        return this.BucketType;
    }

    /**
     * Set Types of buckets which are divided into cos and lakefs
     * @param BucketType Types of buckets which are divided into cos and lakefs
     */
    public void setBucketType(String BucketType) {
        this.BucketType = BucketType;
    }

    /**
     * Get Product name 
     * @return ProductName Product name
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name
     * @param ProductName Product name
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Engine name. When ProductName selects DLC products, this parameter must be specified. When ProductName selects other products, it can be unspecified. 
     * @return EngineName Engine name. When ProductName selects DLC products, this parameter must be specified. When ProductName selects other products, it can be unspecified.
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set Engine name. When ProductName selects DLC products, this parameter must be specified. When ProductName selects other products, it can be unspecified.
     * @param EngineName Engine name. When ProductName selects DLC products, this parameter must be specified. When ProductName selects other products, it can be unspecified.
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get VPC information. When the product name is other, this parameter must be specified. 
     * @return VpcInfo VPC information. When the product name is other, this parameter must be specified.
     */
    public VpcInfo [] getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set VPC information. When the product name is other, this parameter must be specified.
     * @param VpcInfo VPC information. When the product name is other, this parameter must be specified.
     */
    public void setVpcInfo(VpcInfo [] VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    public CreateCHDFSBindingProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCHDFSBindingProductRequest(CreateCHDFSBindingProductRequest source) {
        if (source.MountPoint != null) {
            this.MountPoint = new String(source.MountPoint);
        }
        if (source.BucketType != null) {
            this.BucketType = new String(source.BucketType);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new VpcInfo[source.VpcInfo.length];
            for (int i = 0; i < source.VpcInfo.length; i++) {
                this.VpcInfo[i] = new VpcInfo(source.VpcInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountPoint", this.MountPoint);
        this.setParamSimple(map, prefix + "BucketType", this.BucketType);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamArrayObj(map, prefix + "VpcInfo.", this.VpcInfo);

    }
}

