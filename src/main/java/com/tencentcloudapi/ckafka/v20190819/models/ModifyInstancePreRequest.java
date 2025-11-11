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

public class ModifyInstancePreRequest extends AbstractModel {

    /**
    * ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the disk capacity in GB. value range: 100 to 500000 with a step length of 100.
Specification limits can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1

    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Peak bandwidth in MB/s.
Specifies the specification limits and corresponding step length through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1

    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * Partition upper bound. maximum value of 40000. step length of 100.
Specifies the specifications and limits that can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
     * Get ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1). 
     * @return InstanceId ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
     * @param InstanceId ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the disk capacity in GB. value range: 100 to 500000 with a step length of 100.
Specification limits can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1
 
     * @return DiskSize Specifies the disk capacity in GB. value range: 100 to 500000 with a step length of 100.
Specification limits can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1

     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Specifies the disk capacity in GB. value range: 100 to 500000 with a step length of 100.
Specification limits can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1

     * @param DiskSize Specifies the disk capacity in GB. value range: 100 to 500000 with a step length of 100.
Specification limits can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122562.?from_cn_redirect=1

     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Peak bandwidth in MB/s.
Specifies the specification limits and corresponding step length through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1
 
     * @return BandWidth Peak bandwidth in MB/s.
Specifies the specification limits and corresponding step length through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1

     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set Peak bandwidth in MB/s.
Specifies the specification limits and corresponding step length through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1

     * @param BandWidth Peak bandwidth in MB/s.
Specifies the specification limits and corresponding step length through the following link: https://www.tencentcloud.comom/document/product/597/11745.?from_cn_redirect=1

     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get Partition upper bound. maximum value of 40000. step length of 100.
Specifies the specifications and limits that can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1 
     * @return Partition Partition upper bound. maximum value of 40000. step length of 100.
Specifies the specifications and limits that can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition upper bound. maximum value of 40000. step length of 100.
Specifies the specifications and limits that can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
     * @param Partition Partition upper bound. maximum value of 40000. step length of 100.
Specifies the specifications and limits that can be viewed through the following link: https://www.tencentcloud.comom/document/product/597/122563.?from_cn_redirect=1
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    public ModifyInstancePreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancePreRequest(ModifyInstancePreRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "Partition", this.Partition);

    }
}

