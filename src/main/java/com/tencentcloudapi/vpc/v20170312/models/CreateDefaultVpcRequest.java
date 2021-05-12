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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDefaultVpcRequest extends AbstractModel{

    /**
    * The ID of the availability zone in which the subnet resides. This parameter can be obtained through the [`DescribeZones`](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1) API, such as `ap-guangzhou-1`. If it’s not specified, a random availability zone will be used.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Whether to forcibly return a default VPC
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get The ID of the availability zone in which the subnet resides. This parameter can be obtained through the [`DescribeZones`](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1) API, such as `ap-guangzhou-1`. If it’s not specified, a random availability zone will be used. 
     * @return Zone The ID of the availability zone in which the subnet resides. This parameter can be obtained through the [`DescribeZones`](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1) API, such as `ap-guangzhou-1`. If it’s not specified, a random availability zone will be used.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The ID of the availability zone in which the subnet resides. This parameter can be obtained through the [`DescribeZones`](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1) API, such as `ap-guangzhou-1`. If it’s not specified, a random availability zone will be used.
     * @param Zone The ID of the availability zone in which the subnet resides. This parameter can be obtained through the [`DescribeZones`](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1) API, such as `ap-guangzhou-1`. If it’s not specified, a random availability zone will be used.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Whether to forcibly return a default VPC 
     * @return Force Whether to forcibly return a default VPC
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set Whether to forcibly return a default VPC
     * @param Force Whether to forcibly return a default VPC
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public CreateDefaultVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDefaultVpcRequest(CreateDefaultVpcRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

