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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewInstancesRequest extends AbstractModel {

    /**
    * One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [DescribeInstances](https://www.tencentcloud.com/zh/document/api/213/33258). The maximum number of instances per request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Prepaid mode, that is, monthly subscription-related parameter settings. You can specify attributes of a monthly subscription instance, such as purchase duration and whether to set auto-renewal, through this parameter.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Trial run, for testing purposes, does not execute specific logic. valid values: <li>`true`: skip execution logic</li> <li>`false`: execute logic</li>  default value: `false`.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Whether to renew the elastic data disk. valid values:<br><li>true: indicates renewing the annual and monthly subscription instance and its mounted elastic data disk simultaneously</li><li>false: indicates renewing the annual and monthly subscription instance while no longer renewing its mounted elastic data disk</li><br>default value: true.
    */
    @SerializedName("RenewPortableDataDisk")
    @Expose
    private Boolean RenewPortableDataDisk;

    /**
     * Get One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [DescribeInstances](https://www.tencentcloud.com/zh/document/api/213/33258). The maximum number of instances per request is 100. 
     * @return InstanceIds One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [DescribeInstances](https://www.tencentcloud.com/zh/document/api/213/33258). The maximum number of instances per request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [DescribeInstances](https://www.tencentcloud.com/zh/document/api/213/33258). The maximum number of instances per request is 100.
     * @param InstanceIds One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [DescribeInstances](https://www.tencentcloud.com/zh/document/api/213/33258). The maximum number of instances per request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Prepaid mode, that is, monthly subscription-related parameter settings. You can specify attributes of a monthly subscription instance, such as purchase duration and whether to set auto-renewal, through this parameter. 
     * @return InstanceChargePrepaid Prepaid mode, that is, monthly subscription-related parameter settings. You can specify attributes of a monthly subscription instance, such as purchase duration and whether to set auto-renewal, through this parameter.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Prepaid mode, that is, monthly subscription-related parameter settings. You can specify attributes of a monthly subscription instance, such as purchase duration and whether to set auto-renewal, through this parameter.
     * @param InstanceChargePrepaid Prepaid mode, that is, monthly subscription-related parameter settings. You can specify attributes of a monthly subscription instance, such as purchase duration and whether to set auto-renewal, through this parameter.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get Trial run, for testing purposes, does not execute specific logic. valid values: <li>`true`: skip execution logic</li> <li>`false`: execute logic</li>  default value: `false`. 
     * @return DryRun Trial run, for testing purposes, does not execute specific logic. valid values: <li>`true`: skip execution logic</li> <li>`false`: execute logic</li>  default value: `false`.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Trial run, for testing purposes, does not execute specific logic. valid values: <li>`true`: skip execution logic</li> <li>`false`: execute logic</li>  default value: `false`.
     * @param DryRun Trial run, for testing purposes, does not execute specific logic. valid values: <li>`true`: skip execution logic</li> <li>`false`: execute logic</li>  default value: `false`.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Whether to renew the elastic data disk. valid values:<br><li>true: indicates renewing the annual and monthly subscription instance and its mounted elastic data disk simultaneously</li><li>false: indicates renewing the annual and monthly subscription instance while no longer renewing its mounted elastic data disk</li><br>default value: true. 
     * @return RenewPortableDataDisk Whether to renew the elastic data disk. valid values:<br><li>true: indicates renewing the annual and monthly subscription instance and its mounted elastic data disk simultaneously</li><li>false: indicates renewing the annual and monthly subscription instance while no longer renewing its mounted elastic data disk</li><br>default value: true.
     */
    public Boolean getRenewPortableDataDisk() {
        return this.RenewPortableDataDisk;
    }

    /**
     * Set Whether to renew the elastic data disk. valid values:<br><li>true: indicates renewing the annual and monthly subscription instance and its mounted elastic data disk simultaneously</li><li>false: indicates renewing the annual and monthly subscription instance while no longer renewing its mounted elastic data disk</li><br>default value: true.
     * @param RenewPortableDataDisk Whether to renew the elastic data disk. valid values:<br><li>true: indicates renewing the annual and monthly subscription instance and its mounted elastic data disk simultaneously</li><li>false: indicates renewing the annual and monthly subscription instance while no longer renewing its mounted elastic data disk</li><br>default value: true.
     */
    public void setRenewPortableDataDisk(Boolean RenewPortableDataDisk) {
        this.RenewPortableDataDisk = RenewPortableDataDisk;
    }

    public InquiryPriceRenewInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewInstancesRequest(InquiryPriceRenewInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.RenewPortableDataDisk != null) {
            this.RenewPortableDataDisk = new Boolean(source.RenewPortableDataDisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "RenewPortableDataDisk", this.RenewPortableDataDisk);

    }
}

