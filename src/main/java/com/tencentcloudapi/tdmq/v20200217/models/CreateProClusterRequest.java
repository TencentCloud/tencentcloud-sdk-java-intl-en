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
    * <p>Multi-AZ deployment selects three AZs, example [200002,200003,200004]<br>Single-AZ deployment selects one availability zone, example [200002]</p><p>When PULSAR.P2.MINI1 is selected, it only supports two AZs. Other models support three AZs.</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>Cluster specification code<br>See <a href="https://www.tencentcloud.com/document/product/1179/83705?from_cn_redirect=1">professional cluster specifications</a></p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>1: true, enable automatic monthly renewal</p><p>0: false, disable automatic monthly renewal</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>Purchase period, value ranges from 1 to 50</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>Cluster name cannot be empty. It supports numbers, letters, Chinese, and symbols "-_=:.", with length not exceeding 64 characters.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Whether to automatically select voucher 1 Yes 0 No Default is 0</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>Storage specification<br>See <a href="https://www.tencentcloud.com/document/product/1179/83705?from_cn_redirect=1">professional cluster specifications</a></p>
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * <p>vpc network tag</p>
    */
    @SerializedName("Vpc")
    @Expose
    private VpcInfo Vpc;

    /**
    * <p>Tag list of the cluster (abandoned)</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Cluster version information</p>
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
     * Get <p>Multi-AZ deployment selects three AZs, example [200002,200003,200004]<br>Single-AZ deployment selects one availability zone, example [200002]</p><p>When PULSAR.P2.MINI1 is selected, it only supports two AZs. Other models support three AZs.</p> 
     * @return ZoneIds <p>Multi-AZ deployment selects three AZs, example [200002,200003,200004]<br>Single-AZ deployment selects one availability zone, example [200002]</p><p>When PULSAR.P2.MINI1 is selected, it only supports two AZs. Other models support three AZs.</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>Multi-AZ deployment selects three AZs, example [200002,200003,200004]<br>Single-AZ deployment selects one availability zone, example [200002]</p><p>When PULSAR.P2.MINI1 is selected, it only supports two AZs. Other models support three AZs.</p>
     * @param ZoneIds <p>Multi-AZ deployment selects three AZs, example [200002,200003,200004]<br>Single-AZ deployment selects one availability zone, example [200002]</p><p>When PULSAR.P2.MINI1 is selected, it only supports two AZs. Other models support three AZs.</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>Cluster specification code<br>See <a href="https://www.tencentcloud.com/document/product/1179/83705?from_cn_redirect=1">professional cluster specifications</a></p> 
     * @return ProductName <p>Cluster specification code<br>See <a href="https://www.tencentcloud.com/document/product/1179/83705?from_cn_redirect=1">professional cluster specifications</a></p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>Cluster specification code<br>See <a href="https://www.tencentcloud.com/document/product/1179/83705?from_cn_redirect=1">professional cluster specifications</a></p>
     * @param ProductName <p>Cluster specification code<br>See <a href="https://www.tencentcloud.com/document/product/1179/83705?from_cn_redirect=1">professional cluster specifications</a></p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>1: true, enable automatic monthly renewal</p><p>0: false, disable automatic monthly renewal</p> 
     * @return AutoRenewFlag <p>1: true, enable automatic monthly renewal</p><p>0: false, disable automatic monthly renewal</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>1: true, enable automatic monthly renewal</p><p>0: false, disable automatic monthly renewal</p>
     * @param AutoRenewFlag <p>1: true, enable automatic monthly renewal</p><p>0: false, disable automatic monthly renewal</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>Purchase period, value ranges from 1 to 50</p> 
     * @return TimeSpan <p>Purchase period, value ranges from 1 to 50</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>Purchase period, value ranges from 1 to 50</p>
     * @param TimeSpan <p>Purchase period, value ranges from 1 to 50</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>Cluster name cannot be empty. It supports numbers, letters, Chinese, and symbols "-_=:.", with length not exceeding 64 characters.</p> 
     * @return ClusterName <p>Cluster name cannot be empty. It supports numbers, letters, Chinese, and symbols "-_=:.", with length not exceeding 64 characters.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name cannot be empty. It supports numbers, letters, Chinese, and symbols "-_=:.", with length not exceeding 64 characters.</p>
     * @param ClusterName <p>Cluster name cannot be empty. It supports numbers, letters, Chinese, and symbols "-_=:.", with length not exceeding 64 characters.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Whether to automatically select voucher 1 Yes 0 No Default is 0</p> 
     * @return AutoVoucher <p>Whether to automatically select voucher 1 Yes 0 No Default is 0</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>Whether to automatically select voucher 1 Yes 0 No Default is 0</p>
     * @param AutoVoucher <p>Whether to automatically select voucher 1 Yes 0 No Default is 0</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>Storage specification<br>See <a href="https://www.tencentcloud.com/document/product/1179/83705?from_cn_redirect=1">professional cluster specifications</a></p> 
     * @return StorageSize <p>Storage specification<br>See <a href="https://www.tencentcloud.com/document/product/1179/83705?from_cn_redirect=1">professional cluster specifications</a></p>
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set <p>Storage specification<br>See <a href="https://www.tencentcloud.com/document/product/1179/83705?from_cn_redirect=1">professional cluster specifications</a></p>
     * @param StorageSize <p>Storage specification<br>See <a href="https://www.tencentcloud.com/document/product/1179/83705?from_cn_redirect=1">professional cluster specifications</a></p>
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get <p>vpc network tag</p> 
     * @return Vpc <p>vpc network tag</p>
     */
    public VpcInfo getVpc() {
        return this.Vpc;
    }

    /**
     * Set <p>vpc network tag</p>
     * @param Vpc <p>vpc network tag</p>
     */
    public void setVpc(VpcInfo Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get <p>Tag list of the cluster (abandoned)</p> 
     * @return Tags <p>Tag list of the cluster (abandoned)</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag list of the cluster (abandoned)</p>
     * @param Tags <p>Tag list of the cluster (abandoned)</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Cluster version information</p> 
     * @return InstanceVersion <p>Cluster version information</p>
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set <p>Cluster version information</p>
     * @param InstanceVersion <p>Cluster version information</p>
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
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
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
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
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamObj(map, prefix + "Vpc.", this.Vpc);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);

    }
}

