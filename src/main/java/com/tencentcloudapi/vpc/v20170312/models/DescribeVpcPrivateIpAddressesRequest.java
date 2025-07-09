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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcPrivateIpAddressesRequest extends AbstractModel {

    /**
    * The `ID` of the `VPC`, such as `vpc-f49l6u0z`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The private `IP` address list. Each request supports a maximum of `10` batch querying.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
     * Get The `ID` of the `VPC`, such as `vpc-f49l6u0z`. 
     * @return VpcId The `ID` of the `VPC`, such as `vpc-f49l6u0z`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The `ID` of the `VPC`, such as `vpc-f49l6u0z`.
     * @param VpcId The `ID` of the `VPC`, such as `vpc-f49l6u0z`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The private `IP` address list. Each request supports a maximum of `10` batch querying. 
     * @return PrivateIpAddresses The private `IP` address list. Each request supports a maximum of `10` batch querying.
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set The private `IP` address list. Each request supports a maximum of `10` batch querying.
     * @param PrivateIpAddresses The private `IP` address list. Each request supports a maximum of `10` batch querying.
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    public DescribeVpcPrivateIpAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcPrivateIpAddressesRequest(DescribeVpcPrivateIpAddressesRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);

    }
}

