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

public class AssignIpv6CidrBlockRequest extends AbstractModel {

    /**
    * The `ID` of the `VPC`, such as `vpc-f49l6u0z`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

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

    public AssignIpv6CidrBlockRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignIpv6CidrBlockRequest(AssignIpv6CidrBlockRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

