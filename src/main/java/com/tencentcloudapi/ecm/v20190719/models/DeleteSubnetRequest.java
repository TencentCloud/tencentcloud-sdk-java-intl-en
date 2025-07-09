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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSubnetRequest extends AbstractModel {

    /**
    * Subnet instance ID, which can be obtained from the `SubnetId` field in the returned value of the `DescribeSubnets` API.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * ECM region
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
     * Get Subnet instance ID, which can be obtained from the `SubnetId` field in the returned value of the `DescribeSubnets` API. 
     * @return SubnetId Subnet instance ID, which can be obtained from the `SubnetId` field in the returned value of the `DescribeSubnets` API.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID, which can be obtained from the `SubnetId` field in the returned value of the `DescribeSubnets` API.
     * @param SubnetId Subnet instance ID, which can be obtained from the `SubnetId` field in the returned value of the `DescribeSubnets` API.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get ECM region 
     * @return EcmRegion ECM region
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region
     * @param EcmRegion ECM region
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    public DeleteSubnetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSubnetRequest(DeleteSubnetRequest source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);

    }
}

