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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProClusterRequest extends AbstractModel {

    /**
    * Specifies multi-az deployment with three azs, for example [200002,200003,200004].

Single-AZ deployment selects an availability zone. example: [200002].
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * Cluster specification code.
Refers to professional cluster specifications (https://www.tencentcloud.comom/document/product/1179/83705?from_cn_redirect=1).
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Specifies the storage specification.
Refers to professional cluster specifications (https://www.tencentcloud.comom/document/product/1179/83705?from_cn_redirect=1).
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * `1`: true. enables automatic monthly renewal.

false. disables automatic monthly renewal.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Purchase duration. value range: 1–50.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Specifies the cluster name, which does not support chinese characters and special characters other than hyphens and underscores, with a length of no more than 64 characters.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Whether to automatically select voucher. valid values: 1 (yes), 0 (no). default is 0.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Specifies the vpc network tag.
    */
    @SerializedName("Vpc")
    @Expose
    private VpcInfo Vpc;

    /**
    * Tag list of the cluster (abandoned).
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Specifies multi-az deployment with three azs, for example [200002,200003,200004].

Single-AZ deployment selects an availability zone. example: [200002]. 
     * @return ZoneIds Specifies multi-az deployment with three azs, for example [200002,200003,200004].

Single-AZ deployment selects an availability zone. example: [200002].
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Specifies multi-az deployment with three azs, for example [200002,200003,200004].

Single-AZ deployment selects an availability zone. example: [200002].
     * @param ZoneIds Specifies multi-az deployment with three azs, for example [200002,200003,200004].

Single-AZ deployment selects an availability zone. example: [200002].
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Cluster specification code.
Refers to professional cluster specifications (https://www.tencentcloud.comom/document/product/1179/83705?from_cn_redirect=1). 
     * @return ProductName Cluster specification code.
Refers to professional cluster specifications (https://www.tencentcloud.comom/document/product/1179/83705?from_cn_redirect=1).
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Cluster specification code.
Refers to professional cluster specifications (https://www.tencentcloud.comom/document/product/1179/83705?from_cn_redirect=1).
     * @param ProductName Cluster specification code.
Refers to professional cluster specifications (https://www.tencentcloud.comom/document/product/1179/83705?from_cn_redirect=1).
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Specifies the storage specification.
Refers to professional cluster specifications (https://www.tencentcloud.comom/document/product/1179/83705?from_cn_redirect=1). 
     * @return StorageSize Specifies the storage specification.
Refers to professional cluster specifications (https://www.tencentcloud.comom/document/product/1179/83705?from_cn_redirect=1).
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Specifies the storage specification.
Refers to professional cluster specifications (https://www.tencentcloud.comom/document/product/1179/83705?from_cn_redirect=1).
     * @param StorageSize Specifies the storage specification.
Refers to professional cluster specifications (https://www.tencentcloud.comom/document/product/1179/83705?from_cn_redirect=1).
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get `1`: true. enables automatic monthly renewal.

false. disables automatic monthly renewal. 
     * @return AutoRenewFlag `1`: true. enables automatic monthly renewal.

false. disables automatic monthly renewal.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set `1`: true. enables automatic monthly renewal.

false. disables automatic monthly renewal.
     * @param AutoRenewFlag `1`: true. enables automatic monthly renewal.

false. disables automatic monthly renewal.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Purchase duration. value range: 1–50. 
     * @return TimeSpan Purchase duration. value range: 1–50.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Purchase duration. value range: 1–50.
     * @param TimeSpan Purchase duration. value range: 1–50.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Specifies the cluster name, which does not support chinese characters and special characters other than hyphens and underscores, with a length of no more than 64 characters. 
     * @return ClusterName Specifies the cluster name, which does not support chinese characters and special characters other than hyphens and underscores, with a length of no more than 64 characters.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Specifies the cluster name, which does not support chinese characters and special characters other than hyphens and underscores, with a length of no more than 64 characters.
     * @param ClusterName Specifies the cluster name, which does not support chinese characters and special characters other than hyphens and underscores, with a length of no more than 64 characters.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Whether to automatically select voucher. valid values: 1 (yes), 0 (no). default is 0. 
     * @return AutoVoucher Whether to automatically select voucher. valid values: 1 (yes), 0 (no). default is 0.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically select voucher. valid values: 1 (yes), 0 (no). default is 0.
     * @param AutoVoucher Whether to automatically select voucher. valid values: 1 (yes), 0 (no). default is 0.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Specifies the vpc network tag. 
     * @return Vpc Specifies the vpc network tag.
     */
    public VpcInfo getVpc() {
        return this.Vpc;
    }

    /**
     * Set Specifies the vpc network tag.
     * @param Vpc Specifies the vpc network tag.
     */
    public void setVpc(VpcInfo Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get Tag list of the cluster (abandoned). 
     * @return Tags Tag list of the cluster (abandoned).
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list of the cluster (abandoned).
     * @param Tags Tag list of the cluster (abandoned).
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateProClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProClusterRequest(CreateProClusterRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.Vpc != null) {
            this.Vpc = new VpcInfo(source.Vpc);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamObj(map, prefix + "Vpc.", this.Vpc);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

