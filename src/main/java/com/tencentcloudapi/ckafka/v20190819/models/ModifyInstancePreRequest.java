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
    * <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Disk size in GB. Maximum value is 500000 with a step length of 100. View specification limits through the following url: https://www.tencentcloud.com/document/product/597/122562?from_cn_redirect=1</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>Peak bandwidth in MB/s can be accessed through the following link to view specifications limit and corresponding step length: https://www.tencentcloud.com/document/product/597/11745?from_cn_redirect=1</p>
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * <p>Partition upper limit maximum value: 40000, step length: 100. View specification limits through the following URL: https://www.tencentcloud.com/document/product/597/122563?from_cn_redirect=1</p>
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
     * Get <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p> 
     * @return InstanceId <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     * @param InstanceId <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Disk size in GB. Maximum value is 500000 with a step length of 100. View specification limits through the following url: https://www.tencentcloud.com/document/product/597/122562?from_cn_redirect=1</p> 
     * @return DiskSize <p>Disk size in GB. Maximum value is 500000 with a step length of 100. View specification limits through the following url: https://www.tencentcloud.com/document/product/597/122562?from_cn_redirect=1</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Disk size in GB. Maximum value is 500000 with a step length of 100. View specification limits through the following url: https://www.tencentcloud.com/document/product/597/122562?from_cn_redirect=1</p>
     * @param DiskSize <p>Disk size in GB. Maximum value is 500000 with a step length of 100. View specification limits through the following url: https://www.tencentcloud.com/document/product/597/122562?from_cn_redirect=1</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>Peak bandwidth in MB/s can be accessed through the following link to view specifications limit and corresponding step length: https://www.tencentcloud.com/document/product/597/11745?from_cn_redirect=1</p> 
     * @return BandWidth <p>Peak bandwidth in MB/s can be accessed through the following link to view specifications limit and corresponding step length: https://www.tencentcloud.com/document/product/597/11745?from_cn_redirect=1</p>
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set <p>Peak bandwidth in MB/s can be accessed through the following link to view specifications limit and corresponding step length: https://www.tencentcloud.com/document/product/597/11745?from_cn_redirect=1</p>
     * @param BandWidth <p>Peak bandwidth in MB/s can be accessed through the following link to view specifications limit and corresponding step length: https://www.tencentcloud.com/document/product/597/11745?from_cn_redirect=1</p>
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get <p>Partition upper limit maximum value: 40000, step length: 100. View specification limits through the following URL: https://www.tencentcloud.com/document/product/597/122563?from_cn_redirect=1</p> 
     * @return Partition <p>Partition upper limit maximum value: 40000, step length: 100. View specification limits through the following URL: https://www.tencentcloud.com/document/product/597/122563?from_cn_redirect=1</p>
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>Partition upper limit maximum value: 40000, step length: 100. View specification limits through the following URL: https://www.tencentcloud.com/document/product/597/122563?from_cn_redirect=1</p>
     * @param Partition <p>Partition upper limit maximum value: 40000, step length: 100. View specification limits through the following URL: https://www.tencentcloud.com/document/product/597/122563?from_cn_redirect=1</p>
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

