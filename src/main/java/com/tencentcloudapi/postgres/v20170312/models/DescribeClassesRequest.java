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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClassesRequest extends AbstractModel {

    /**
    * <p>Availability zone name, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Database engine. Valid values:<br>1. postgresql (TencentDB for PostgreSQL).<br>2. mssql_compatible (MSSQL compatible - TencentDB for PostgreSQL).</p>
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * <p>Database major version number, such as 12 or 13, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/409/89018?from_cn_redirect=1">DescribeDBVersions</a> API.</p>
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * <p>Instance storage type. The supported specifications are returned based on the storage type.</p><p>Enumeration values:</p><ul><li>PHYSICAL_LOCAL_SSD: local SSD of physical machine.</li><li>CLOUD_PREMIUM: Premium Disk.</li><li>CLOUD_SSD: Cloud SSD.</li><li>CLOUD_HSSD: Enhanced SSD.</li></ul><p>Default value: PHYSICAL_LOCAL_SSD.</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get <p>Availability zone name, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p> 
     * @return Zone <p>Availability zone name, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Availability zone name, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
     * @param Zone <p>Availability zone name, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Database engine. Valid values:<br>1. postgresql (TencentDB for PostgreSQL).<br>2. mssql_compatible (MSSQL compatible - TencentDB for PostgreSQL).</p> 
     * @return DBEngine <p>Database engine. Valid values:<br>1. postgresql (TencentDB for PostgreSQL).<br>2. mssql_compatible (MSSQL compatible - TencentDB for PostgreSQL).</p>
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set <p>Database engine. Valid values:<br>1. postgresql (TencentDB for PostgreSQL).<br>2. mssql_compatible (MSSQL compatible - TencentDB for PostgreSQL).</p>
     * @param DBEngine <p>Database engine. Valid values:<br>1. postgresql (TencentDB for PostgreSQL).<br>2. mssql_compatible (MSSQL compatible - TencentDB for PostgreSQL).</p>
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get <p>Database major version number, such as 12 or 13, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/409/89018?from_cn_redirect=1">DescribeDBVersions</a> API.</p> 
     * @return DBMajorVersion <p>Database major version number, such as 12 or 13, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/409/89018?from_cn_redirect=1">DescribeDBVersions</a> API.</p>
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set <p>Database major version number, such as 12 or 13, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/409/89018?from_cn_redirect=1">DescribeDBVersions</a> API.</p>
     * @param DBMajorVersion <p>Database major version number, such as 12 or 13, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/409/89018?from_cn_redirect=1">DescribeDBVersions</a> API.</p>
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get <p>Instance storage type. The supported specifications are returned based on the storage type.</p><p>Enumeration values:</p><ul><li>PHYSICAL_LOCAL_SSD: local SSD of physical machine.</li><li>CLOUD_PREMIUM: Premium Disk.</li><li>CLOUD_SSD: Cloud SSD.</li><li>CLOUD_HSSD: Enhanced SSD.</li></ul><p>Default value: PHYSICAL_LOCAL_SSD.</p> 
     * @return StorageType <p>Instance storage type. The supported specifications are returned based on the storage type.</p><p>Enumeration values:</p><ul><li>PHYSICAL_LOCAL_SSD: local SSD of physical machine.</li><li>CLOUD_PREMIUM: Premium Disk.</li><li>CLOUD_SSD: Cloud SSD.</li><li>CLOUD_HSSD: Enhanced SSD.</li></ul><p>Default value: PHYSICAL_LOCAL_SSD.</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Instance storage type. The supported specifications are returned based on the storage type.</p><p>Enumeration values:</p><ul><li>PHYSICAL_LOCAL_SSD: local SSD of physical machine.</li><li>CLOUD_PREMIUM: Premium Disk.</li><li>CLOUD_SSD: Cloud SSD.</li><li>CLOUD_HSSD: Enhanced SSD.</li></ul><p>Default value: PHYSICAL_LOCAL_SSD.</p>
     * @param StorageType <p>Instance storage type. The supported specifications are returned based on the storage type.</p><p>Enumeration values:</p><ul><li>PHYSICAL_LOCAL_SSD: local SSD of physical machine.</li><li>CLOUD_PREMIUM: Premium Disk.</li><li>CLOUD_SSD: Cloud SSD.</li><li>CLOUD_HSSD: Enhanced SSD.</li></ul><p>Default value: PHYSICAL_LOCAL_SSD.</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public DescribeClassesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClassesRequest(DescribeClassesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

