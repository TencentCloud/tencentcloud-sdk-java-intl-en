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

public class InquiryPriceResizeDiskRequest extends AbstractModel {

    /**
    * Specifies the size after expanding the cloud disk in GiB, which should not be less than the current disk size. for the cloud disk size range, please refer to the product type of CBS (https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1).
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Cloud disk ID. can be queried via the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. mutually exclusive with the DiskIds parameter.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * cloud disk project ID. obtain this parameter by calling the projectId field in the return value of [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1). if input, it is only for authentication.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Cloud disk ID list. queried via the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. mutually exclusive with the DiskId parameter.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
     * Get Specifies the size after expanding the cloud disk in GiB, which should not be less than the current disk size. for the cloud disk size range, please refer to the product type of CBS (https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1). 
     * @return DiskSize Specifies the size after expanding the cloud disk in GiB, which should not be less than the current disk size. for the cloud disk size range, please refer to the product type of CBS (https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1).
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Specifies the size after expanding the cloud disk in GiB, which should not be less than the current disk size. for the cloud disk size range, please refer to the product type of CBS (https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1).
     * @param DiskSize Specifies the size after expanding the cloud disk in GiB, which should not be less than the current disk size. for the cloud disk size range, please refer to the product type of CBS (https://www.tencentcloud.com/document/product/362/2353?from_cn_redirect=1).
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Cloud disk ID. can be queried via the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. mutually exclusive with the DiskIds parameter. 
     * @return DiskId Cloud disk ID. can be queried via the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. mutually exclusive with the DiskIds parameter.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set Cloud disk ID. can be queried via the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. mutually exclusive with the DiskIds parameter.
     * @param DiskId Cloud disk ID. can be queried via the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. mutually exclusive with the DiskIds parameter.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get cloud disk project ID. obtain this parameter by calling the projectId field in the return value of [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1). if input, it is only for authentication. 
     * @return ProjectId cloud disk project ID. obtain this parameter by calling the projectId field in the return value of [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1). if input, it is only for authentication.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set cloud disk project ID. obtain this parameter by calling the projectId field in the return value of [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1). if input, it is only for authentication.
     * @param ProjectId cloud disk project ID. obtain this parameter by calling the projectId field in the return value of [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1). if input, it is only for authentication.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Cloud disk ID list. queried via the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. mutually exclusive with the DiskId parameter. 
     * @return DiskIds Cloud disk ID list. queried via the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. mutually exclusive with the DiskId parameter.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set Cloud disk ID list. queried via the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. mutually exclusive with the DiskId parameter.
     * @param DiskIds Cloud disk ID list. queried via the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) api. mutually exclusive with the DiskId parameter.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    public InquiryPriceResizeDiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceResizeDiskRequest(InquiryPriceResizeDiskRequest source) {
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);

    }
}

