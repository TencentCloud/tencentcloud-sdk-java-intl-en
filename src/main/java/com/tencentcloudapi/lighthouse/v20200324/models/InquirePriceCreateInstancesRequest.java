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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateInstancesRequest extends AbstractModel {

    /**
    * Instance package ID.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Parameter setting for prepaid mode. This parameter can specify the purchase period, whether to enable auto-renewal, and other attributes of the monthly subscribed instances.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Number of instances to be created. Default value: 1.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Application image ID, which is required if a paid application image is used and can be obtained from the `BlueprintId` returned by the [DescribeBlueprints](https://intl.cloud.tencent.com/document/product/1207/47689?from_cn_redirect=1) API.
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
     * Get Instance package ID. 
     * @return BundleId Instance package ID.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Instance package ID.
     * @param BundleId Instance package ID.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Parameter setting for prepaid mode. This parameter can specify the purchase period, whether to enable auto-renewal, and other attributes of the monthly subscribed instances. 
     * @return InstanceChargePrepaid Parameter setting for prepaid mode. This parameter can specify the purchase period, whether to enable auto-renewal, and other attributes of the monthly subscribed instances.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Parameter setting for prepaid mode. This parameter can specify the purchase period, whether to enable auto-renewal, and other attributes of the monthly subscribed instances.
     * @param InstanceChargePrepaid Parameter setting for prepaid mode. This parameter can specify the purchase period, whether to enable auto-renewal, and other attributes of the monthly subscribed instances.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get Number of instances to be created. Default value: 1. 
     * @return InstanceCount Number of instances to be created. Default value: 1.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances to be created. Default value: 1.
     * @param InstanceCount Number of instances to be created. Default value: 1.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Application image ID, which is required if a paid application image is used and can be obtained from the `BlueprintId` returned by the [DescribeBlueprints](https://intl.cloud.tencent.com/document/product/1207/47689?from_cn_redirect=1) API. 
     * @return BlueprintId Application image ID, which is required if a paid application image is used and can be obtained from the `BlueprintId` returned by the [DescribeBlueprints](https://intl.cloud.tencent.com/document/product/1207/47689?from_cn_redirect=1) API.
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set Application image ID, which is required if a paid application image is used and can be obtained from the `BlueprintId` returned by the [DescribeBlueprints](https://intl.cloud.tencent.com/document/product/1207/47689?from_cn_redirect=1) API.
     * @param BlueprintId Application image ID, which is required if a paid application image is used and can be obtained from the `BlueprintId` returned by the [DescribeBlueprints](https://intl.cloud.tencent.com/document/product/1207/47689?from_cn_redirect=1) API.
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    public InquirePriceCreateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateInstancesRequest(InquirePriceCreateInstancesRequest source) {
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);

    }
}

