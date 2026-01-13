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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceScalingDownRequest extends AbstractModel {

    /**
    * ckafka cluster instance Id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Shrink mode. 1: stable mode. 
2. specifies high-speed configuration change.
    */
    @SerializedName("UpgradeStrategy")
    @Expose
    private Long UpgradeStrategy;

    /**
    * Specifies the disk capacity in GB. value range: maximum value 500000, step length 100.
The specifications and limitations can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122562.?from_cn_redirect=1


    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Peak bandwidth in MB/s.
Specifies the url (https://www.tencentcloud.com/document/product/597/11745?from_cn_redirect=1) to view specification limits and corresponding step length.
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * Partition upper limit maximum value of 40000, step length 100.
Specification limits can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122563.?from_cn_redirect=1

    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
     * Get ckafka cluster instance Id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api. 
     * @return InstanceId ckafka cluster instance Id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka cluster instance Id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     * @param InstanceId ckafka cluster instance Id. can be obtained through the [DescribeInstances](https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1) api.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Shrink mode. 1: stable mode. 
2. specifies high-speed configuration change. 
     * @return UpgradeStrategy Shrink mode. 1: stable mode. 
2. specifies high-speed configuration change.
     */
    public Long getUpgradeStrategy() {
        return this.UpgradeStrategy;
    }

    /**
     * Set Shrink mode. 1: stable mode. 
2. specifies high-speed configuration change.
     * @param UpgradeStrategy Shrink mode. 1: stable mode. 
2. specifies high-speed configuration change.
     */
    public void setUpgradeStrategy(Long UpgradeStrategy) {
        this.UpgradeStrategy = UpgradeStrategy;
    }

    /**
     * Get Specifies the disk capacity in GB. value range: maximum value 500000, step length 100.
The specifications and limitations can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122562.?from_cn_redirect=1

 
     * @return DiskSize Specifies the disk capacity in GB. value range: maximum value 500000, step length 100.
The specifications and limitations can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122562.?from_cn_redirect=1


     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Specifies the disk capacity in GB. value range: maximum value 500000, step length 100.
The specifications and limitations can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122562.?from_cn_redirect=1


     * @param DiskSize Specifies the disk capacity in GB. value range: maximum value 500000, step length 100.
The specifications and limitations can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122562.?from_cn_redirect=1


     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Peak bandwidth in MB/s.
Specifies the url (https://www.tencentcloud.com/document/product/597/11745?from_cn_redirect=1) to view specification limits and corresponding step length. 
     * @return BandWidth Peak bandwidth in MB/s.
Specifies the url (https://www.tencentcloud.com/document/product/597/11745?from_cn_redirect=1) to view specification limits and corresponding step length.
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set Peak bandwidth in MB/s.
Specifies the url (https://www.tencentcloud.com/document/product/597/11745?from_cn_redirect=1) to view specification limits and corresponding step length.
     * @param BandWidth Peak bandwidth in MB/s.
Specifies the url (https://www.tencentcloud.com/document/product/597/11745?from_cn_redirect=1) to view specification limits and corresponding step length.
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get Partition upper limit maximum value of 40000, step length 100.
Specification limits can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122563.?from_cn_redirect=1
 
     * @return Partition Partition upper limit maximum value of 40000, step length 100.
Specification limits can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122563.?from_cn_redirect=1

     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition upper limit maximum value of 40000, step length 100.
Specification limits can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122563.?from_cn_redirect=1

     * @param Partition Partition upper limit maximum value of 40000, step length 100.
Specification limits can be viewed through the following link: https://www.tencentcloud.com/document/product/597/122563.?from_cn_redirect=1

     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    public InstanceScalingDownRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceScalingDownRequest(InstanceScalingDownRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UpgradeStrategy != null) {
            this.UpgradeStrategy = new Long(source.UpgradeStrategy);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UpgradeStrategy", this.UpgradeStrategy);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "Partition", this.Partition);

    }
}

