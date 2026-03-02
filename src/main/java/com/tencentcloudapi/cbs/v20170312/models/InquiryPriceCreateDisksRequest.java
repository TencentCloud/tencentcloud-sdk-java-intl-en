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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateDisksRequest extends AbstractModel {

    /**
    * Cloud disk billing mode. <br>
<li>PREPAID: Prepaid by month.</li>
<li>POSTPAID_BY_HOUR: Hourly pay-as-you-go.</li>
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * Hard disk media type. valid values: <ul> <li>CLOUD_PREMIUM: high-performance CLOUD block storage</li> <li>CLOUD_SSD: SSD CLOUD disk</li> <li>CLOUD_HSSD: enhanced SSD CLOUD disk</li> <li>CLOUD_TSSD: ultra-fast SSD cbs</li> </ul>.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Specifies the disk capacity in GiB. for the cloud disk size range, please refer to the product type of cloud block storage (https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1).
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * cloud disk project ID. obtain this parameter by calling the projectId field in the return value of [DescribeProject](https://www.tencentcloud.comom/document/api/651/78725?from_cn_redirect=1). default to the default project.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Specifies the number of cloud block storage (cbs) disks to purchase. defaults to 1 if left blank.
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * Specifies the additional performance value of the CBS disk in MiB/s. extra performance is only supported for enhanced SSD (CLOUD_HSSD) and ultra-fast SSD (CLOUD_TSSD) CBS disks exceeding 460GiB in size.
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
    * Prepaid mode, that is, the settings for the monthly subscription-related parameters. through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk, whether to enable auto-renewal, and other attributes. this parameter is required for creating a prepaid cloud disk, but no need to specify it when creating an hourly postpaid cloud disk.
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
    * Specifies the cloud disk backup point quota.
    */
    @SerializedName("DiskBackupQuota")
    @Expose
    private Long DiskBackupQuota;

    /**
     * Get Cloud disk billing mode. <br>
<li>PREPAID: Prepaid by month.</li>
<li>POSTPAID_BY_HOUR: Hourly pay-as-you-go.</li> 
     * @return DiskChargeType Cloud disk billing mode. <br>
<li>PREPAID: Prepaid by month.</li>
<li>POSTPAID_BY_HOUR: Hourly pay-as-you-go.</li>
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set Cloud disk billing mode. <br>
<li>PREPAID: Prepaid by month.</li>
<li>POSTPAID_BY_HOUR: Hourly pay-as-you-go.</li>
     * @param DiskChargeType Cloud disk billing mode. <br>
<li>PREPAID: Prepaid by month.</li>
<li>POSTPAID_BY_HOUR: Hourly pay-as-you-go.</li>
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get Hard disk media type. valid values: <ul> <li>CLOUD_PREMIUM: high-performance CLOUD block storage</li> <li>CLOUD_SSD: SSD CLOUD disk</li> <li>CLOUD_HSSD: enhanced SSD CLOUD disk</li> <li>CLOUD_TSSD: ultra-fast SSD cbs</li> </ul>. 
     * @return DiskType Hard disk media type. valid values: <ul> <li>CLOUD_PREMIUM: high-performance CLOUD block storage</li> <li>CLOUD_SSD: SSD CLOUD disk</li> <li>CLOUD_HSSD: enhanced SSD CLOUD disk</li> <li>CLOUD_TSSD: ultra-fast SSD cbs</li> </ul>.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Hard disk media type. valid values: <ul> <li>CLOUD_PREMIUM: high-performance CLOUD block storage</li> <li>CLOUD_SSD: SSD CLOUD disk</li> <li>CLOUD_HSSD: enhanced SSD CLOUD disk</li> <li>CLOUD_TSSD: ultra-fast SSD cbs</li> </ul>.
     * @param DiskType Hard disk media type. valid values: <ul> <li>CLOUD_PREMIUM: high-performance CLOUD block storage</li> <li>CLOUD_SSD: SSD CLOUD disk</li> <li>CLOUD_HSSD: enhanced SSD CLOUD disk</li> <li>CLOUD_TSSD: ultra-fast SSD cbs</li> </ul>.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Specifies the disk capacity in GiB. for the cloud disk size range, please refer to the product type of cloud block storage (https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1). 
     * @return DiskSize Specifies the disk capacity in GiB. for the cloud disk size range, please refer to the product type of cloud block storage (https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1).
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Specifies the disk capacity in GiB. for the cloud disk size range, please refer to the product type of cloud block storage (https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1).
     * @param DiskSize Specifies the disk capacity in GiB. for the cloud disk size range, please refer to the product type of cloud block storage (https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1).
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get cloud disk project ID. obtain this parameter by calling the projectId field in the return value of [DescribeProject](https://www.tencentcloud.comom/document/api/651/78725?from_cn_redirect=1). default to the default project. 
     * @return ProjectId cloud disk project ID. obtain this parameter by calling the projectId field in the return value of [DescribeProject](https://www.tencentcloud.comom/document/api/651/78725?from_cn_redirect=1). default to the default project.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set cloud disk project ID. obtain this parameter by calling the projectId field in the return value of [DescribeProject](https://www.tencentcloud.comom/document/api/651/78725?from_cn_redirect=1). default to the default project.
     * @param ProjectId cloud disk project ID. obtain this parameter by calling the projectId field in the return value of [DescribeProject](https://www.tencentcloud.comom/document/api/651/78725?from_cn_redirect=1). default to the default project.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Specifies the number of cloud block storage (cbs) disks to purchase. defaults to 1 if left blank. 
     * @return DiskCount Specifies the number of cloud block storage (cbs) disks to purchase. defaults to 1 if left blank.
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set Specifies the number of cloud block storage (cbs) disks to purchase. defaults to 1 if left blank.
     * @param DiskCount Specifies the number of cloud block storage (cbs) disks to purchase. defaults to 1 if left blank.
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get Specifies the additional performance value of the CBS disk in MiB/s. extra performance is only supported for enhanced SSD (CLOUD_HSSD) and ultra-fast SSD (CLOUD_TSSD) CBS disks exceeding 460GiB in size. 
     * @return ThroughputPerformance Specifies the additional performance value of the CBS disk in MiB/s. extra performance is only supported for enhanced SSD (CLOUD_HSSD) and ultra-fast SSD (CLOUD_TSSD) CBS disks exceeding 460GiB in size.
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set Specifies the additional performance value of the CBS disk in MiB/s. extra performance is only supported for enhanced SSD (CLOUD_HSSD) and ultra-fast SSD (CLOUD_TSSD) CBS disks exceeding 460GiB in size.
     * @param ThroughputPerformance Specifies the additional performance value of the CBS disk in MiB/s. extra performance is only supported for enhanced SSD (CLOUD_HSSD) and ultra-fast SSD (CLOUD_TSSD) CBS disks exceeding 460GiB in size.
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    /**
     * Get Prepaid mode, that is, the settings for the monthly subscription-related parameters. through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk, whether to enable auto-renewal, and other attributes. this parameter is required for creating a prepaid cloud disk, but no need to specify it when creating an hourly postpaid cloud disk. 
     * @return DiskChargePrepaid Prepaid mode, that is, the settings for the monthly subscription-related parameters. through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk, whether to enable auto-renewal, and other attributes. this parameter is required for creating a prepaid cloud disk, but no need to specify it when creating an hourly postpaid cloud disk.
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set Prepaid mode, that is, the settings for the monthly subscription-related parameters. through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk, whether to enable auto-renewal, and other attributes. this parameter is required for creating a prepaid cloud disk, but no need to specify it when creating an hourly postpaid cloud disk.
     * @param DiskChargePrepaid Prepaid mode, that is, the settings for the monthly subscription-related parameters. through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk, whether to enable auto-renewal, and other attributes. this parameter is required for creating a prepaid cloud disk, but no need to specify it when creating an hourly postpaid cloud disk.
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get Specifies the cloud disk backup point quota. 
     * @return DiskBackupQuota Specifies the cloud disk backup point quota.
     */
    public Long getDiskBackupQuota() {
        return this.DiskBackupQuota;
    }

    /**
     * Set Specifies the cloud disk backup point quota.
     * @param DiskBackupQuota Specifies the cloud disk backup point quota.
     */
    public void setDiskBackupQuota(Long DiskBackupQuota) {
        this.DiskBackupQuota = DiskBackupQuota;
    }

    public InquiryPriceCreateDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateDisksRequest(InquiryPriceCreateDisksRequest source) {
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
        if (source.DiskChargePrepaid != null) {
            this.DiskChargePrepaid = new DiskChargePrepaid(source.DiskChargePrepaid);
        }
        if (source.DiskBackupQuota != null) {
            this.DiskBackupQuota = new Long(source.DiskBackupQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DiskBackupQuota", this.DiskBackupQuota);

    }
}

