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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewDBInstanceRequest extends AbstractModel {

    /**
    * ID of the instance to be renewed in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed in the TencentDB console. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Renewal period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * To renew a pay-as-you-go instance to a monthly subscribed one, you need to set this parameter to `PREPAID`.
    */
    @SerializedName("ModifyPayType")
    @Expose
    private String ModifyPayType;

    /**
     * Get ID of the instance to be renewed in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed in the TencentDB console. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the ID. 
     * @return InstanceId ID of the instance to be renewed in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed in the TencentDB console. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to be renewed in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed in the TencentDB console. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the ID.
     * @param InstanceId ID of the instance to be renewed in the format of cdb-c1nl9rpv, which is the same as the instance ID displayed in the TencentDB console. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Renewal period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`. 
     * @return TimeSpan Renewal period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Renewal period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
     * @param TimeSpan Renewal period in months. Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get To renew a pay-as-you-go instance to a monthly subscribed one, you need to set this parameter to `PREPAID`. 
     * @return ModifyPayType To renew a pay-as-you-go instance to a monthly subscribed one, you need to set this parameter to `PREPAID`.
     */
    public String getModifyPayType() {
        return this.ModifyPayType;
    }

    /**
     * Set To renew a pay-as-you-go instance to a monthly subscribed one, you need to set this parameter to `PREPAID`.
     * @param ModifyPayType To renew a pay-as-you-go instance to a monthly subscribed one, you need to set this parameter to `PREPAID`.
     */
    public void setModifyPayType(String ModifyPayType) {
        this.ModifyPayType = ModifyPayType;
    }

    public RenewDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewDBInstanceRequest(RenewDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.ModifyPayType != null) {
            this.ModifyPayType = new String(source.ModifyPayType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ModifyPayType", this.ModifyPayType);

    }
}

