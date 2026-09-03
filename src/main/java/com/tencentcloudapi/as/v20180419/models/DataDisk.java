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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataDisk extends AbstractModel {

    /**
    * <p>Data disk type. For detailed restrictions on data disk types, see <a href="https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1">Cloud Disk Types</a>. Value range:</p><li>LOCAL_BASIC: local hard disk</li><li>LOCAL_SSD: local SSD</li><li>CLOUD_BASIC: basic cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_SSD: SSD cloud disk</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_TSSD: ultra-fast SSD CBS</li><li>CLOUD_BSSD: universal SSD cloud disk</li>The default value is consistent with the system disk type (SystemDisk.DiskType).
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>Data disk size, in GB. The value range varies according to the data disk type. For specific restrictions, see <a href="https://www.tencentcloud.com/document/product/213/2177?from_cn_redirect=1">CVM instance configuration</a>. Default value: 0, which means that no data disk is purchased. For more restrictions, see the <a href="https://www.tencentcloud.com/document/product/362/5145?from_cn_redirect=1">product documentation</a>.</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>Data disk snapshot ID, obtain this parameter through the <a href="https://www.tencentcloud.com/document/product/362/15647?from_cn_redirect=1">DescribeSnapshots</a> API.</p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>Whether the data disk is destroyed with the instance. Value ranges from:</p><li>TRUE: When the instance is terminated, destroy the data disk. Only hourly postpaid cloud disks are supported.</li><li>FALSE: When the instance is terminated, retain the data disk.</li>
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * <p>Whether to encrypt the data disk. TRUE means encrypted, FALSE means not encrypted; the specific disk type, region, and KMS rules are validated by CVM.</p>
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * <p>Cloud disk performance, unit: MB/s. Using this parameter can purchase additional performance for cloud disks. For feature introduction and type limitations, see: <a href="https://www.tencentcloud.com/document/product/362/51896?from_cn_redirect=1#.E5.A2.9E.E5.BC.BA.E5.9E.8B-ssd-.E4.BA.91.E7.A1.AC.E7.9B.98.E9.A2.9D.E5.A4.96.E6.80.A7.E8.83.BD">enhanced SSD cloud disk additional performance note</a>.<br>Currently only supports Extreme CBS (CLOUD_TSSD) and enhanced SSD cloud disks (CLOUD_HSSD) with capacity &gt; 460 GB.</p>
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
    * <p>Burst performance. Whether to enable burst performance. The default value is false. Currently, this parameter only supports Extreme CBS (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) with capacity greater than 460 GB.<br>Note: In beta test. Requires ticket submission before usage.</p>
    */
    @SerializedName("BurstPerformance")
    @Expose
    private Boolean BurstPerformance;

    /**
    * <p>KMS Key ID used for data disk encryption. The key validity, permission, as well as adaptability to disk type and region are validated by CVM.</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
     * Get <p>Data disk type. For detailed restrictions on data disk types, see <a href="https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1">Cloud Disk Types</a>. Value range:</p><li>LOCAL_BASIC: local hard disk</li><li>LOCAL_SSD: local SSD</li><li>CLOUD_BASIC: basic cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_SSD: SSD cloud disk</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_TSSD: ultra-fast SSD CBS</li><li>CLOUD_BSSD: universal SSD cloud disk</li>The default value is consistent with the system disk type (SystemDisk.DiskType). 
     * @return DiskType <p>Data disk type. For detailed restrictions on data disk types, see <a href="https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1">Cloud Disk Types</a>. Value range:</p><li>LOCAL_BASIC: local hard disk</li><li>LOCAL_SSD: local SSD</li><li>CLOUD_BASIC: basic cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_SSD: SSD cloud disk</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_TSSD: ultra-fast SSD CBS</li><li>CLOUD_BSSD: universal SSD cloud disk</li>The default value is consistent with the system disk type (SystemDisk.DiskType).
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>Data disk type. For detailed restrictions on data disk types, see <a href="https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1">Cloud Disk Types</a>. Value range:</p><li>LOCAL_BASIC: local hard disk</li><li>LOCAL_SSD: local SSD</li><li>CLOUD_BASIC: basic cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_SSD: SSD cloud disk</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_TSSD: ultra-fast SSD CBS</li><li>CLOUD_BSSD: universal SSD cloud disk</li>The default value is consistent with the system disk type (SystemDisk.DiskType).
     * @param DiskType <p>Data disk type. For detailed restrictions on data disk types, see <a href="https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1">Cloud Disk Types</a>. Value range:</p><li>LOCAL_BASIC: local hard disk</li><li>LOCAL_SSD: local SSD</li><li>CLOUD_BASIC: basic cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_SSD: SSD cloud disk</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_TSSD: ultra-fast SSD CBS</li><li>CLOUD_BSSD: universal SSD cloud disk</li>The default value is consistent with the system disk type (SystemDisk.DiskType).
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>Data disk size, in GB. The value range varies according to the data disk type. For specific restrictions, see <a href="https://www.tencentcloud.com/document/product/213/2177?from_cn_redirect=1">CVM instance configuration</a>. Default value: 0, which means that no data disk is purchased. For more restrictions, see the <a href="https://www.tencentcloud.com/document/product/362/5145?from_cn_redirect=1">product documentation</a>.</p> 
     * @return DiskSize <p>Data disk size, in GB. The value range varies according to the data disk type. For specific restrictions, see <a href="https://www.tencentcloud.com/document/product/213/2177?from_cn_redirect=1">CVM instance configuration</a>. Default value: 0, which means that no data disk is purchased. For more restrictions, see the <a href="https://www.tencentcloud.com/document/product/362/5145?from_cn_redirect=1">product documentation</a>.</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Data disk size, in GB. The value range varies according to the data disk type. For specific restrictions, see <a href="https://www.tencentcloud.com/document/product/213/2177?from_cn_redirect=1">CVM instance configuration</a>. Default value: 0, which means that no data disk is purchased. For more restrictions, see the <a href="https://www.tencentcloud.com/document/product/362/5145?from_cn_redirect=1">product documentation</a>.</p>
     * @param DiskSize <p>Data disk size, in GB. The value range varies according to the data disk type. For specific restrictions, see <a href="https://www.tencentcloud.com/document/product/213/2177?from_cn_redirect=1">CVM instance configuration</a>. Default value: 0, which means that no data disk is purchased. For more restrictions, see the <a href="https://www.tencentcloud.com/document/product/362/5145?from_cn_redirect=1">product documentation</a>.</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>Data disk snapshot ID, obtain this parameter through the <a href="https://www.tencentcloud.com/document/product/362/15647?from_cn_redirect=1">DescribeSnapshots</a> API.</p> 
     * @return SnapshotId <p>Data disk snapshot ID, obtain this parameter through the <a href="https://www.tencentcloud.com/document/product/362/15647?from_cn_redirect=1">DescribeSnapshots</a> API.</p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>Data disk snapshot ID, obtain this parameter through the <a href="https://www.tencentcloud.com/document/product/362/15647?from_cn_redirect=1">DescribeSnapshots</a> API.</p>
     * @param SnapshotId <p>Data disk snapshot ID, obtain this parameter through the <a href="https://www.tencentcloud.com/document/product/362/15647?from_cn_redirect=1">DescribeSnapshots</a> API.</p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>Whether the data disk is destroyed with the instance. Value ranges from:</p><li>TRUE: When the instance is terminated, destroy the data disk. Only hourly postpaid cloud disks are supported.</li><li>FALSE: When the instance is terminated, retain the data disk.</li> 
     * @return DeleteWithInstance <p>Whether the data disk is destroyed with the instance. Value ranges from:</p><li>TRUE: When the instance is terminated, destroy the data disk. Only hourly postpaid cloud disks are supported.</li><li>FALSE: When the instance is terminated, retain the data disk.</li>
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set <p>Whether the data disk is destroyed with the instance. Value ranges from:</p><li>TRUE: When the instance is terminated, destroy the data disk. Only hourly postpaid cloud disks are supported.</li><li>FALSE: When the instance is terminated, retain the data disk.</li>
     * @param DeleteWithInstance <p>Whether the data disk is destroyed with the instance. Value ranges from:</p><li>TRUE: When the instance is terminated, destroy the data disk. Only hourly postpaid cloud disks are supported.</li><li>FALSE: When the instance is terminated, retain the data disk.</li>
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get <p>Whether to encrypt the data disk. TRUE means encrypted, FALSE means not encrypted; the specific disk type, region, and KMS rules are validated by CVM.</p> 
     * @return Encrypt <p>Whether to encrypt the data disk. TRUE means encrypted, FALSE means not encrypted; the specific disk type, region, and KMS rules are validated by CVM.</p>
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set <p>Whether to encrypt the data disk. TRUE means encrypted, FALSE means not encrypted; the specific disk type, region, and KMS rules are validated by CVM.</p>
     * @param Encrypt <p>Whether to encrypt the data disk. TRUE means encrypted, FALSE means not encrypted; the specific disk type, region, and KMS rules are validated by CVM.</p>
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get <p>Cloud disk performance, unit: MB/s. Using this parameter can purchase additional performance for cloud disks. For feature introduction and type limitations, see: <a href="https://www.tencentcloud.com/document/product/362/51896?from_cn_redirect=1#.E5.A2.9E.E5.BC.BA.E5.9E.8B-ssd-.E4.BA.91.E7.A1.AC.E7.9B.98.E9.A2.9D.E5.A4.96.E6.80.A7.E8.83.BD">enhanced SSD cloud disk additional performance note</a>.<br>Currently only supports Extreme CBS (CLOUD_TSSD) and enhanced SSD cloud disks (CLOUD_HSSD) with capacity &gt; 460 GB.</p> 
     * @return ThroughputPerformance <p>Cloud disk performance, unit: MB/s. Using this parameter can purchase additional performance for cloud disks. For feature introduction and type limitations, see: <a href="https://www.tencentcloud.com/document/product/362/51896?from_cn_redirect=1#.E5.A2.9E.E5.BC.BA.E5.9E.8B-ssd-.E4.BA.91.E7.A1.AC.E7.9B.98.E9.A2.9D.E5.A4.96.E6.80.A7.E8.83.BD">enhanced SSD cloud disk additional performance note</a>.<br>Currently only supports Extreme CBS (CLOUD_TSSD) and enhanced SSD cloud disks (CLOUD_HSSD) with capacity &gt; 460 GB.</p>
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set <p>Cloud disk performance, unit: MB/s. Using this parameter can purchase additional performance for cloud disks. For feature introduction and type limitations, see: <a href="https://www.tencentcloud.com/document/product/362/51896?from_cn_redirect=1#.E5.A2.9E.E5.BC.BA.E5.9E.8B-ssd-.E4.BA.91.E7.A1.AC.E7.9B.98.E9.A2.9D.E5.A4.96.E6.80.A7.E8.83.BD">enhanced SSD cloud disk additional performance note</a>.<br>Currently only supports Extreme CBS (CLOUD_TSSD) and enhanced SSD cloud disks (CLOUD_HSSD) with capacity &gt; 460 GB.</p>
     * @param ThroughputPerformance <p>Cloud disk performance, unit: MB/s. Using this parameter can purchase additional performance for cloud disks. For feature introduction and type limitations, see: <a href="https://www.tencentcloud.com/document/product/362/51896?from_cn_redirect=1#.E5.A2.9E.E5.BC.BA.E5.9E.8B-ssd-.E4.BA.91.E7.A1.AC.E7.9B.98.E9.A2.9D.E5.A4.96.E6.80.A7.E8.83.BD">enhanced SSD cloud disk additional performance note</a>.<br>Currently only supports Extreme CBS (CLOUD_TSSD) and enhanced SSD cloud disks (CLOUD_HSSD) with capacity &gt; 460 GB.</p>
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    /**
     * Get <p>Burst performance. Whether to enable burst performance. The default value is false. Currently, this parameter only supports Extreme CBS (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) with capacity greater than 460 GB.<br>Note: In beta test. Requires ticket submission before usage.</p> 
     * @return BurstPerformance <p>Burst performance. Whether to enable burst performance. The default value is false. Currently, this parameter only supports Extreme CBS (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) with capacity greater than 460 GB.<br>Note: In beta test. Requires ticket submission before usage.</p>
     */
    public Boolean getBurstPerformance() {
        return this.BurstPerformance;
    }

    /**
     * Set <p>Burst performance. Whether to enable burst performance. The default value is false. Currently, this parameter only supports Extreme CBS (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) with capacity greater than 460 GB.<br>Note: In beta test. Requires ticket submission before usage.</p>
     * @param BurstPerformance <p>Burst performance. Whether to enable burst performance. The default value is false. Currently, this parameter only supports Extreme CBS (CLOUD_TSSD) and enhanced SSD CLOUD disk (CLOUD_HSSD) with capacity greater than 460 GB.<br>Note: In beta test. Requires ticket submission before usage.</p>
     */
    public void setBurstPerformance(Boolean BurstPerformance) {
        this.BurstPerformance = BurstPerformance;
    }

    /**
     * Get <p>KMS Key ID used for data disk encryption. The key validity, permission, as well as adaptability to disk type and region are validated by CVM.</p> 
     * @return KmsKeyId <p>KMS Key ID used for data disk encryption. The key validity, permission, as well as adaptability to disk type and region are validated by CVM.</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>KMS Key ID used for data disk encryption. The key validity, permission, as well as adaptability to disk type and region are validated by CVM.</p>
     * @param KmsKeyId <p>KMS Key ID used for data disk encryption. The key validity, permission, as well as adaptability to disk type and region are validated by CVM.</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    public DataDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataDisk(DataDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Boolean(source.Encrypt);
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
        if (source.BurstPerformance != null) {
            this.BurstPerformance = new Boolean(source.BurstPerformance);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);
        this.setParamSimple(map, prefix + "BurstPerformance", this.BurstPerformance);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);

    }
}

