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

public class InquiryPriceCreateDBInstancesRequest extends AbstractModel {

    /**
    * <p>Availability zone name. The value of this parameter can be obtained from the returned Zone field of the <a href="https://www.tencentcloud.com/document/product/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Specification ID. The value of this parameter can be obtained from the returned SpecCode field of the <a href="https://www.tencentcloud.com/document/product/409/89019?from_cn_redirect=1">DescribeClasses</a> API.</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>Storage capacity, in GB. The value for this parameter must be set in increments of 10.</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>Instance quantity. The maximum allowed quantity is no more than 100. If you need to create more instances at a time, please contact customer service.</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>Purchased duration, in months. Only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>[Deprecated and no longer effective] Billing ID. The value of this parameter can be obtained from the returned Pid field of the DescribeProductConfig API.</p>
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * <p>Instance billing type. Valid values: PREPAID (prepaid, also known as yearly/monthly subscription) and POSTPAID (pay-as-you-go).<br>Default value: PREPAID.</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Instance type. The default value is primary. Valid values:<br>primary (dual-server high availability (one primary and one standby)).<br>readonly (read-only instance).</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Database engine. The default value is postgresql. Valid values:<br>postgresql (TencentDB for PostgreSQL).<br>mssql_compatible (MSSQL compatible - TencentDB for PostgreSQL).</p>
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * <p>Instance storage type. Valid values: PHYSICAL_LOCAL_SSD: local SSD of physical machine. CLOUD_PREMIUM: Premium Disk. CLOUD_SSD: Cloud SSD. CLOUD_HSSD: Enhanced SSD.</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get <p>Availability zone name. The value of this parameter can be obtained from the returned Zone field of the <a href="https://www.tencentcloud.com/document/product/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p> 
     * @return Zone <p>Availability zone name. The value of this parameter can be obtained from the returned Zone field of the <a href="https://www.tencentcloud.com/document/product/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Availability zone name. The value of this parameter can be obtained from the returned Zone field of the <a href="https://www.tencentcloud.com/document/product/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
     * @param Zone <p>Availability zone name. The value of this parameter can be obtained from the returned Zone field of the <a href="https://www.tencentcloud.com/document/product/409/16769?from_cn_redirect=1">DescribeZones</a> API.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Specification ID. The value of this parameter can be obtained from the returned SpecCode field of the <a href="https://www.tencentcloud.com/document/product/409/89019?from_cn_redirect=1">DescribeClasses</a> API.</p> 
     * @return SpecCode <p>Specification ID. The value of this parameter can be obtained from the returned SpecCode field of the <a href="https://www.tencentcloud.com/document/product/409/89019?from_cn_redirect=1">DescribeClasses</a> API.</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>Specification ID. The value of this parameter can be obtained from the returned SpecCode field of the <a href="https://www.tencentcloud.com/document/product/409/89019?from_cn_redirect=1">DescribeClasses</a> API.</p>
     * @param SpecCode <p>Specification ID. The value of this parameter can be obtained from the returned SpecCode field of the <a href="https://www.tencentcloud.com/document/product/409/89019?from_cn_redirect=1">DescribeClasses</a> API.</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>Storage capacity, in GB. The value for this parameter must be set in increments of 10.</p> 
     * @return Storage <p>Storage capacity, in GB. The value for this parameter must be set in increments of 10.</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>Storage capacity, in GB. The value for this parameter must be set in increments of 10.</p>
     * @param Storage <p>Storage capacity, in GB. The value for this parameter must be set in increments of 10.</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>Instance quantity. The maximum allowed quantity is no more than 100. If you need to create more instances at a time, please contact customer service.</p> 
     * @return InstanceCount <p>Instance quantity. The maximum allowed quantity is no more than 100. If you need to create more instances at a time, please contact customer service.</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>Instance quantity. The maximum allowed quantity is no more than 100. If you need to create more instances at a time, please contact customer service.</p>
     * @param InstanceCount <p>Instance quantity. The maximum allowed quantity is no more than 100. If you need to create more instances at a time, please contact customer service.</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>Purchased duration, in months. Only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.</p> 
     * @return Period <p>Purchased duration, in months. Only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Purchased duration, in months. Only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.</p>
     * @param Period <p>Purchased duration, in months. Only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>[Deprecated and no longer effective] Billing ID. The value of this parameter can be obtained from the returned Pid field of the DescribeProductConfig API.</p> 
     * @return Pid <p>[Deprecated and no longer effective] Billing ID. The value of this parameter can be obtained from the returned Pid field of the DescribeProductConfig API.</p>
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set <p>[Deprecated and no longer effective] Billing ID. The value of this parameter can be obtained from the returned Pid field of the DescribeProductConfig API.</p>
     * @param Pid <p>[Deprecated and no longer effective] Billing ID. The value of this parameter can be obtained from the returned Pid field of the DescribeProductConfig API.</p>
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get <p>Instance billing type. Valid values: PREPAID (prepaid, also known as yearly/monthly subscription) and POSTPAID (pay-as-you-go).<br>Default value: PREPAID.</p> 
     * @return InstanceChargeType <p>Instance billing type. Valid values: PREPAID (prepaid, also known as yearly/monthly subscription) and POSTPAID (pay-as-you-go).<br>Default value: PREPAID.</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Instance billing type. Valid values: PREPAID (prepaid, also known as yearly/monthly subscription) and POSTPAID (pay-as-you-go).<br>Default value: PREPAID.</p>
     * @param InstanceChargeType <p>Instance billing type. Valid values: PREPAID (prepaid, also known as yearly/monthly subscription) and POSTPAID (pay-as-you-go).<br>Default value: PREPAID.</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Instance type. The default value is primary. Valid values:<br>primary (dual-server high availability (one primary and one standby)).<br>readonly (read-only instance).</p> 
     * @return InstanceType <p>Instance type. The default value is primary. Valid values:<br>primary (dual-server high availability (one primary and one standby)).<br>readonly (read-only instance).</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type. The default value is primary. Valid values:<br>primary (dual-server high availability (one primary and one standby)).<br>readonly (read-only instance).</p>
     * @param InstanceType <p>Instance type. The default value is primary. Valid values:<br>primary (dual-server high availability (one primary and one standby)).<br>readonly (read-only instance).</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Database engine. The default value is postgresql. Valid values:<br>postgresql (TencentDB for PostgreSQL).<br>mssql_compatible (MSSQL compatible - TencentDB for PostgreSQL).</p> 
     * @return DBEngine <p>Database engine. The default value is postgresql. Valid values:<br>postgresql (TencentDB for PostgreSQL).<br>mssql_compatible (MSSQL compatible - TencentDB for PostgreSQL).</p>
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set <p>Database engine. The default value is postgresql. Valid values:<br>postgresql (TencentDB for PostgreSQL).<br>mssql_compatible (MSSQL compatible - TencentDB for PostgreSQL).</p>
     * @param DBEngine <p>Database engine. The default value is postgresql. Valid values:<br>postgresql (TencentDB for PostgreSQL).<br>mssql_compatible (MSSQL compatible - TencentDB for PostgreSQL).</p>
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get <p>Instance storage type. Valid values: PHYSICAL_LOCAL_SSD: local SSD of physical machine. CLOUD_PREMIUM: Premium Disk. CLOUD_SSD: Cloud SSD. CLOUD_HSSD: Enhanced SSD.</p> 
     * @return StorageType <p>Instance storage type. Valid values: PHYSICAL_LOCAL_SSD: local SSD of physical machine. CLOUD_PREMIUM: Premium Disk. CLOUD_SSD: Cloud SSD. CLOUD_HSSD: Enhanced SSD.</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Instance storage type. Valid values: PHYSICAL_LOCAL_SSD: local SSD of physical machine. CLOUD_PREMIUM: Premium Disk. CLOUD_SSD: Cloud SSD. CLOUD_HSSD: Enhanced SSD.</p>
     * @param StorageType <p>Instance storage type. Valid values: PHYSICAL_LOCAL_SSD: local SSD of physical machine. CLOUD_PREMIUM: Premium Disk. CLOUD_SSD: Cloud SSD. CLOUD_HSSD: Enhanced SSD.</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public InquiryPriceCreateDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateDBInstancesRequest(InquiryPriceCreateDBInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
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
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

