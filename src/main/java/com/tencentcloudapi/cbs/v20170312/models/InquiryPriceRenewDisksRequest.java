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

public class InquiryPriceRenewDisksRequest extends AbstractModel {

    /**
    * Cloud disk ID, which can be queried by calling the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) API.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Prepaid mode, that is, settings related to the monthly subscription. Through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk. If CurInstanceDeadline is specified in this parameter, it will be renewed in aligned with the sub-machine expiration time. If it is a batch renewal inquiry, this parameter corresponds one-to-one with the Disks parameter, and the number of Element (XML) must be consistent.
    */
    @SerializedName("DiskChargePrepaids")
    @Expose
    private DiskChargePrepaid [] DiskChargePrepaids;

    /**
    * Specifies the new expiry time of the CBS in the format such as 2017-12-17 00:00:00. parameter `NewDeadline` and `DiskChargePrepaids` are two ways to specify inquiry duration. one of them must be input.
    */
    @SerializedName("NewDeadline")
    @Expose
    private String NewDeadline;

    /**
    * cloud disk project ID. obtain this parameter by calling the projectId field in the return value of [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1). if input, it is only for authentication.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get Cloud disk ID, which can be queried by calling the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) API. 
     * @return DiskIds Cloud disk ID, which can be queried by calling the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) API.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set Cloud disk ID, which can be queried by calling the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) API.
     * @param DiskIds Cloud disk ID, which can be queried by calling the [DescribeDisks](https://www.tencentcloud.com/document/product/362/16315?from_cn_redirect=1) API.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Prepaid mode, that is, settings related to the monthly subscription. Through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk. If CurInstanceDeadline is specified in this parameter, it will be renewed in aligned with the sub-machine expiration time. If it is a batch renewal inquiry, this parameter corresponds one-to-one with the Disks parameter, and the number of Element (XML) must be consistent. 
     * @return DiskChargePrepaids Prepaid mode, that is, settings related to the monthly subscription. Through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk. If CurInstanceDeadline is specified in this parameter, it will be renewed in aligned with the sub-machine expiration time. If it is a batch renewal inquiry, this parameter corresponds one-to-one with the Disks parameter, and the number of Element (XML) must be consistent.
     */
    public DiskChargePrepaid [] getDiskChargePrepaids() {
        return this.DiskChargePrepaids;
    }

    /**
     * Set Prepaid mode, that is, settings related to the monthly subscription. Through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk. If CurInstanceDeadline is specified in this parameter, it will be renewed in aligned with the sub-machine expiration time. If it is a batch renewal inquiry, this parameter corresponds one-to-one with the Disks parameter, and the number of Element (XML) must be consistent.
     * @param DiskChargePrepaids Prepaid mode, that is, settings related to the monthly subscription. Through this parameter, you can specify the purchase duration of the monthly subscribed cloud disk. If CurInstanceDeadline is specified in this parameter, it will be renewed in aligned with the sub-machine expiration time. If it is a batch renewal inquiry, this parameter corresponds one-to-one with the Disks parameter, and the number of Element (XML) must be consistent.
     */
    public void setDiskChargePrepaids(DiskChargePrepaid [] DiskChargePrepaids) {
        this.DiskChargePrepaids = DiskChargePrepaids;
    }

    /**
     * Get Specifies the new expiry time of the CBS in the format such as 2017-12-17 00:00:00. parameter `NewDeadline` and `DiskChargePrepaids` are two ways to specify inquiry duration. one of them must be input. 
     * @return NewDeadline Specifies the new expiry time of the CBS in the format such as 2017-12-17 00:00:00. parameter `NewDeadline` and `DiskChargePrepaids` are two ways to specify inquiry duration. one of them must be input.
     */
    public String getNewDeadline() {
        return this.NewDeadline;
    }

    /**
     * Set Specifies the new expiry time of the CBS in the format such as 2017-12-17 00:00:00. parameter `NewDeadline` and `DiskChargePrepaids` are two ways to specify inquiry duration. one of them must be input.
     * @param NewDeadline Specifies the new expiry time of the CBS in the format such as 2017-12-17 00:00:00. parameter `NewDeadline` and `DiskChargePrepaids` are two ways to specify inquiry duration. one of them must be input.
     */
    public void setNewDeadline(String NewDeadline) {
        this.NewDeadline = NewDeadline;
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

    public InquiryPriceRenewDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewDisksRequest(InquiryPriceRenewDisksRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.DiskChargePrepaids != null) {
            this.DiskChargePrepaids = new DiskChargePrepaid[source.DiskChargePrepaids.length];
            for (int i = 0; i < source.DiskChargePrepaids.length; i++) {
                this.DiskChargePrepaids[i] = new DiskChargePrepaid(source.DiskChargePrepaids[i]);
            }
        }
        if (source.NewDeadline != null) {
            this.NewDeadline = new String(source.NewDeadline);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamArrayObj(map, prefix + "DiskChargePrepaids.", this.DiskChargePrepaids);
        this.setParamSimple(map, prefix + "NewDeadline", this.NewDeadline);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

