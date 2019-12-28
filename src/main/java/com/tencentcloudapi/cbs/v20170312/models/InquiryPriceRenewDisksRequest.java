/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewDisksRequest extends AbstractModel{

    /**
    * ID of the cloud disk, which can be queried via the API [DescribeDisks](/document/product/362/16315).
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Relevant parameter settings for the prepaid mode (i.e., monthly subscription). The monthly subscription cloud disk purchase usage period can be specified using this parameter. If this parameter is specified as CurInstanceDeadline, then it will be renewed according to the aligned CVM expiration time. If it is a batch renewal price query, then this parameter will correspond to the Disks parameter, and the element quantity needs to be kept the same.
    */
    @SerializedName("DiskChargePrepaids")
    @Expose
    private DiskChargePrepaid [] DiskChargePrepaids;

    /**
    * Specify the new expiration time of the cloud disk, in such format as 2017-12-17 00:00:00. The parameters `NewDeadline` and `DiskChargePrepaids` are two options to specify the inquiry length, and you must specify at least one.
    */
    @SerializedName("NewDeadline")
    @Expose
    private String NewDeadline;

    /**
    * ID of project the cloud disk belongs to. If selected, it can only be used for authentication.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get ID of the cloud disk, which can be queried via the API [DescribeDisks](/document/product/362/16315). 
     * @return DiskIds ID of the cloud disk, which can be queried via the API [DescribeDisks](/document/product/362/16315).
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set ID of the cloud disk, which can be queried via the API [DescribeDisks](/document/product/362/16315).
     * @param DiskIds ID of the cloud disk, which can be queried via the API [DescribeDisks](/document/product/362/16315).
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Relevant parameter settings for the prepaid mode (i.e., monthly subscription). The monthly subscription cloud disk purchase usage period can be specified using this parameter. If this parameter is specified as CurInstanceDeadline, then it will be renewed according to the aligned CVM expiration time. If it is a batch renewal price query, then this parameter will correspond to the Disks parameter, and the element quantity needs to be kept the same. 
     * @return DiskChargePrepaids Relevant parameter settings for the prepaid mode (i.e., monthly subscription). The monthly subscription cloud disk purchase usage period can be specified using this parameter. If this parameter is specified as CurInstanceDeadline, then it will be renewed according to the aligned CVM expiration time. If it is a batch renewal price query, then this parameter will correspond to the Disks parameter, and the element quantity needs to be kept the same.
     */
    public DiskChargePrepaid [] getDiskChargePrepaids() {
        return this.DiskChargePrepaids;
    }

    /**
     * Set Relevant parameter settings for the prepaid mode (i.e., monthly subscription). The monthly subscription cloud disk purchase usage period can be specified using this parameter. If this parameter is specified as CurInstanceDeadline, then it will be renewed according to the aligned CVM expiration time. If it is a batch renewal price query, then this parameter will correspond to the Disks parameter, and the element quantity needs to be kept the same.
     * @param DiskChargePrepaids Relevant parameter settings for the prepaid mode (i.e., monthly subscription). The monthly subscription cloud disk purchase usage period can be specified using this parameter. If this parameter is specified as CurInstanceDeadline, then it will be renewed according to the aligned CVM expiration time. If it is a batch renewal price query, then this parameter will correspond to the Disks parameter, and the element quantity needs to be kept the same.
     */
    public void setDiskChargePrepaids(DiskChargePrepaid [] DiskChargePrepaids) {
        this.DiskChargePrepaids = DiskChargePrepaids;
    }

    /**
     * Get Specify the new expiration time of the cloud disk, in such format as 2017-12-17 00:00:00. The parameters `NewDeadline` and `DiskChargePrepaids` are two options to specify the inquiry length, and you must specify at least one. 
     * @return NewDeadline Specify the new expiration time of the cloud disk, in such format as 2017-12-17 00:00:00. The parameters `NewDeadline` and `DiskChargePrepaids` are two options to specify the inquiry length, and you must specify at least one.
     */
    public String getNewDeadline() {
        return this.NewDeadline;
    }

    /**
     * Set Specify the new expiration time of the cloud disk, in such format as 2017-12-17 00:00:00. The parameters `NewDeadline` and `DiskChargePrepaids` are two options to specify the inquiry length, and you must specify at least one.
     * @param NewDeadline Specify the new expiration time of the cloud disk, in such format as 2017-12-17 00:00:00. The parameters `NewDeadline` and `DiskChargePrepaids` are two options to specify the inquiry length, and you must specify at least one.
     */
    public void setNewDeadline(String NewDeadline) {
        this.NewDeadline = NewDeadline;
    }

    /**
     * Get ID of project the cloud disk belongs to. If selected, it can only be used for authentication. 
     * @return ProjectId ID of project the cloud disk belongs to. If selected, it can only be used for authentication.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set ID of project the cloud disk belongs to. If selected, it can only be used for authentication.
     * @param ProjectId ID of project the cloud disk belongs to. If selected, it can only be used for authentication.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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

