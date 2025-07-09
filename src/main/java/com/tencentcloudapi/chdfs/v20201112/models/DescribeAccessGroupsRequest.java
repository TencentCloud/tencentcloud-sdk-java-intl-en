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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessGroupsRequest extends AbstractModel {

    /**
    * VPC ID
Note: either `VpcId` or `OwnerUin` can be specified as the input parameter
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Resource owner `Uin`
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
     * Get VPC ID
Note: either `VpcId` or `OwnerUin` can be specified as the input parameter 
     * @return VpcId VPC ID
Note: either `VpcId` or `OwnerUin` can be specified as the input parameter
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
Note: either `VpcId` or `OwnerUin` can be specified as the input parameter
     * @param VpcId VPC ID
Note: either `VpcId` or `OwnerUin` can be specified as the input parameter
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Resource owner `Uin` 
     * @return OwnerUin Resource owner `Uin`
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Resource owner `Uin`
     * @param OwnerUin Resource owner `Uin`
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public DescribeAccessGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessGroupsRequest(DescribeAccessGroupsRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

