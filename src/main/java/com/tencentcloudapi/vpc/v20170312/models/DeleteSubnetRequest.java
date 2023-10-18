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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSubnetRequest extends AbstractModel {

    /**
    * The ID of the subnet instance. You can obtain the parameter value from the SubnetId field in the returned result of DescribeSubnets API.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get The ID of the subnet instance. You can obtain the parameter value from the SubnetId field in the returned result of DescribeSubnets API. 
     * @return SubnetId The ID of the subnet instance. You can obtain the parameter value from the SubnetId field in the returned result of DescribeSubnets API.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The ID of the subnet instance. You can obtain the parameter value from the SubnetId field in the returned result of DescribeSubnets API.
     * @param SubnetId The ID of the subnet instance. You can obtain the parameter value from the SubnetId field in the returned result of DescribeSubnets API.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

