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

public class SystemDisk extends AbstractModel {

    /**
    * <p>System disk type. For restrictions on system disk types, see <a href="https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1">Cloud Disk Types</a>. Value range:</p><li>LOCAL_BASIC: local hard disk</li><li>LOCAL_SSD: local SSD</li><li>CLOUD_BASIC: basic cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_SSD: SSD cloud disk</li><li>CLOUD_BSSD: universal SSD cloud disk</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_TSSD: ultra-fast SSD CBS</li><li>Default value: CLOUD_PREMIUM.</li>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>System disk size (GB). Default value: 50</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>Whether to encrypt the system disk. TRUE means encrypted, FALSE means not encrypted. The specific disk type, region, and KMS rules are validated by CVM.</p>
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * <p>KMS Key ID used for system disk encryption. The key validity, permission, as well as adaptability to disk type and region are validated by CVM.</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
     * Get <p>System disk type. For restrictions on system disk types, see <a href="https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1">Cloud Disk Types</a>. Value range:</p><li>LOCAL_BASIC: local hard disk</li><li>LOCAL_SSD: local SSD</li><li>CLOUD_BASIC: basic cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_SSD: SSD cloud disk</li><li>CLOUD_BSSD: universal SSD cloud disk</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_TSSD: ultra-fast SSD CBS</li><li>Default value: CLOUD_PREMIUM.</li> 
     * @return DiskType <p>System disk type. For restrictions on system disk types, see <a href="https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1">Cloud Disk Types</a>. Value range:</p><li>LOCAL_BASIC: local hard disk</li><li>LOCAL_SSD: local SSD</li><li>CLOUD_BASIC: basic cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_SSD: SSD cloud disk</li><li>CLOUD_BSSD: universal SSD cloud disk</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_TSSD: ultra-fast SSD CBS</li><li>Default value: CLOUD_PREMIUM.</li>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>System disk type. For restrictions on system disk types, see <a href="https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1">Cloud Disk Types</a>. Value range:</p><li>LOCAL_BASIC: local hard disk</li><li>LOCAL_SSD: local SSD</li><li>CLOUD_BASIC: basic cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_SSD: SSD cloud disk</li><li>CLOUD_BSSD: universal SSD cloud disk</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_TSSD: ultra-fast SSD CBS</li><li>Default value: CLOUD_PREMIUM.</li>
     * @param DiskType <p>System disk type. For restrictions on system disk types, see <a href="https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1">Cloud Disk Types</a>. Value range:</p><li>LOCAL_BASIC: local hard disk</li><li>LOCAL_SSD: local SSD</li><li>CLOUD_BASIC: basic cloud disk</li><li>CLOUD_PREMIUM: high-performance cloud block storage</li><li>CLOUD_SSD: SSD cloud disk</li><li>CLOUD_BSSD: universal SSD cloud disk</li><li>CLOUD_HSSD: enhanced SSD cloud disk</li><li>CLOUD_TSSD: ultra-fast SSD CBS</li><li>Default value: CLOUD_PREMIUM.</li>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>System disk size (GB). Default value: 50</p> 
     * @return DiskSize <p>System disk size (GB). Default value: 50</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>System disk size (GB). Default value: 50</p>
     * @param DiskSize <p>System disk size (GB). Default value: 50</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>Whether to encrypt the system disk. TRUE means encrypted, FALSE means not encrypted. The specific disk type, region, and KMS rules are validated by CVM.</p> 
     * @return Encrypt <p>Whether to encrypt the system disk. TRUE means encrypted, FALSE means not encrypted. The specific disk type, region, and KMS rules are validated by CVM.</p>
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set <p>Whether to encrypt the system disk. TRUE means encrypted, FALSE means not encrypted. The specific disk type, region, and KMS rules are validated by CVM.</p>
     * @param Encrypt <p>Whether to encrypt the system disk. TRUE means encrypted, FALSE means not encrypted. The specific disk type, region, and KMS rules are validated by CVM.</p>
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get <p>KMS Key ID used for system disk encryption. The key validity, permission, as well as adaptability to disk type and region are validated by CVM.</p> 
     * @return KmsKeyId <p>KMS Key ID used for system disk encryption. The key validity, permission, as well as adaptability to disk type and region are validated by CVM.</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>KMS Key ID used for system disk encryption. The key validity, permission, as well as adaptability to disk type and region are validated by CVM.</p>
     * @param KmsKeyId <p>KMS Key ID used for system disk encryption. The key validity, permission, as well as adaptability to disk type and region are validated by CVM.</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    public SystemDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemDisk(SystemDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Boolean(source.Encrypt);
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
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);

    }
}

