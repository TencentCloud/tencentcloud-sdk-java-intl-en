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

public class TerminateInstancesRequest extends AbstractModel {

    /**
    * One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1). The maximum number of instances per request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Release an Elastic IP. Under EIP 2.0, only the first EIP on the primary network interface can be released, and currently supported release types are limited to HighQualityEIP, AntiDDoSEIP, EIPv6, and HighQualityEIPv6.
Default value:  `false`.

This feature is currently in gradually released phase. To access it, please contact us.
    */
    @SerializedName("ReleaseAddress")
    @Expose
    private Boolean ReleaseAddress;

    /**
    * Whether to release a monthly subscription data disk mounted on an instance. true: Release the data disk along with termination of the instance. false: Only terminate the instance.
Default value: `false`.
    */
    @SerializedName("ReleasePrepaidDataDisks")
    @Expose
    private Boolean ReleasePrepaidDataDisks;

    /**
     * Get One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1). The maximum number of instances per request is 100. 
     * @return InstanceIds One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1). The maximum number of instances per request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1). The maximum number of instances per request is 100.
     * @param InstanceIds One or more instance IDs to be operated. You can obtain the instance ID through the `InstanceId` in the return value from the API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728?from_cn_redirect=1). The maximum number of instances per request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Release an Elastic IP. Under EIP 2.0, only the first EIP on the primary network interface can be released, and currently supported release types are limited to HighQualityEIP, AntiDDoSEIP, EIPv6, and HighQualityEIPv6.
Default value:  `false`.

This feature is currently in gradually released phase. To access it, please contact us. 
     * @return ReleaseAddress Release an Elastic IP. Under EIP 2.0, only the first EIP on the primary network interface can be released, and currently supported release types are limited to HighQualityEIP, AntiDDoSEIP, EIPv6, and HighQualityEIPv6.
Default value:  `false`.

This feature is currently in gradually released phase. To access it, please contact us.
     */
    public Boolean getReleaseAddress() {
        return this.ReleaseAddress;
    }

    /**
     * Set Release an Elastic IP. Under EIP 2.0, only the first EIP on the primary network interface can be released, and currently supported release types are limited to HighQualityEIP, AntiDDoSEIP, EIPv6, and HighQualityEIPv6.
Default value:  `false`.

This feature is currently in gradually released phase. To access it, please contact us.
     * @param ReleaseAddress Release an Elastic IP. Under EIP 2.0, only the first EIP on the primary network interface can be released, and currently supported release types are limited to HighQualityEIP, AntiDDoSEIP, EIPv6, and HighQualityEIPv6.
Default value:  `false`.

This feature is currently in gradually released phase. To access it, please contact us.
     */
    public void setReleaseAddress(Boolean ReleaseAddress) {
        this.ReleaseAddress = ReleaseAddress;
    }

    /**
     * Get Whether to release a monthly subscription data disk mounted on an instance. true: Release the data disk along with termination of the instance. false: Only terminate the instance.
Default value: `false`. 
     * @return ReleasePrepaidDataDisks Whether to release a monthly subscription data disk mounted on an instance. true: Release the data disk along with termination of the instance. false: Only terminate the instance.
Default value: `false`.
     */
    public Boolean getReleasePrepaidDataDisks() {
        return this.ReleasePrepaidDataDisks;
    }

    /**
     * Set Whether to release a monthly subscription data disk mounted on an instance. true: Release the data disk along with termination of the instance. false: Only terminate the instance.
Default value: `false`.
     * @param ReleasePrepaidDataDisks Whether to release a monthly subscription data disk mounted on an instance. true: Release the data disk along with termination of the instance. false: Only terminate the instance.
Default value: `false`.
     */
    public void setReleasePrepaidDataDisks(Boolean ReleasePrepaidDataDisks) {
        this.ReleasePrepaidDataDisks = ReleasePrepaidDataDisks;
    }

    public TerminateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateInstancesRequest(TerminateInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ReleaseAddress != null) {
            this.ReleaseAddress = new Boolean(source.ReleaseAddress);
        }
        if (source.ReleasePrepaidDataDisks != null) {
            this.ReleasePrepaidDataDisks = new Boolean(source.ReleasePrepaidDataDisks);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ReleaseAddress", this.ReleaseAddress);
        this.setParamSimple(map, prefix + "ReleasePrepaidDataDisks", this.ReleasePrepaidDataDisks);

    }
}

