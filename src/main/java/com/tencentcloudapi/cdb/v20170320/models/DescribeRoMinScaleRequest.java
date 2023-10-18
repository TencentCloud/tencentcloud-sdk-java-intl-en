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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoMinScaleRequest extends AbstractModel {

    /**
    * Read-only instance ID in the format of "cdbro-c1nl9rpv". Its value is the same as the instance ID in the TencentDB Console. This parameter and the `MasterInstanceId` parameter cannot both be empty.
    */
    @SerializedName("RoInstanceId")
    @Expose
    private String RoInstanceId;

    /**
    * Primary instance ID in the format of "cdbro-c1nl9rpv". Its value is the same as the instance ID in the TencentDB Console. This parameter and the `RoInstanceId` parameter cannot both be empty. Note: when the parameters are passed in with `RoInstanceId`, the return value refers to the minimum specification to which a read-only instance can be upgraded; when the parameters are passed in with `MasterInstanceId` but without `RoInstanceId`, the return value refers to the minimum purchasable specification for a read-only instance.
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
     * Get Read-only instance ID in the format of "cdbro-c1nl9rpv". Its value is the same as the instance ID in the TencentDB Console. This parameter and the `MasterInstanceId` parameter cannot both be empty. 
     * @return RoInstanceId Read-only instance ID in the format of "cdbro-c1nl9rpv". Its value is the same as the instance ID in the TencentDB Console. This parameter and the `MasterInstanceId` parameter cannot both be empty.
     */
    public String getRoInstanceId() {
        return this.RoInstanceId;
    }

    /**
     * Set Read-only instance ID in the format of "cdbro-c1nl9rpv". Its value is the same as the instance ID in the TencentDB Console. This parameter and the `MasterInstanceId` parameter cannot both be empty.
     * @param RoInstanceId Read-only instance ID in the format of "cdbro-c1nl9rpv". Its value is the same as the instance ID in the TencentDB Console. This parameter and the `MasterInstanceId` parameter cannot both be empty.
     */
    public void setRoInstanceId(String RoInstanceId) {
        this.RoInstanceId = RoInstanceId;
    }

    /**
     * Get Primary instance ID in the format of "cdbro-c1nl9rpv". Its value is the same as the instance ID in the TencentDB Console. This parameter and the `RoInstanceId` parameter cannot both be empty. Note: when the parameters are passed in with `RoInstanceId`, the return value refers to the minimum specification to which a read-only instance can be upgraded; when the parameters are passed in with `MasterInstanceId` but without `RoInstanceId`, the return value refers to the minimum purchasable specification for a read-only instance. 
     * @return MasterInstanceId Primary instance ID in the format of "cdbro-c1nl9rpv". Its value is the same as the instance ID in the TencentDB Console. This parameter and the `RoInstanceId` parameter cannot both be empty. Note: when the parameters are passed in with `RoInstanceId`, the return value refers to the minimum specification to which a read-only instance can be upgraded; when the parameters are passed in with `MasterInstanceId` but without `RoInstanceId`, the return value refers to the minimum purchasable specification for a read-only instance.
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * Set Primary instance ID in the format of "cdbro-c1nl9rpv". Its value is the same as the instance ID in the TencentDB Console. This parameter and the `RoInstanceId` parameter cannot both be empty. Note: when the parameters are passed in with `RoInstanceId`, the return value refers to the minimum specification to which a read-only instance can be upgraded; when the parameters are passed in with `MasterInstanceId` but without `RoInstanceId`, the return value refers to the minimum purchasable specification for a read-only instance.
     * @param MasterInstanceId Primary instance ID in the format of "cdbro-c1nl9rpv". Its value is the same as the instance ID in the TencentDB Console. This parameter and the `RoInstanceId` parameter cannot both be empty. Note: when the parameters are passed in with `RoInstanceId`, the return value refers to the minimum specification to which a read-only instance can be upgraded; when the parameters are passed in with `MasterInstanceId` but without `RoInstanceId`, the return value refers to the minimum purchasable specification for a read-only instance.
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    public DescribeRoMinScaleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoMinScaleRequest(DescribeRoMinScaleRequest source) {
        if (source.RoInstanceId != null) {
            this.RoInstanceId = new String(source.RoInstanceId);
        }
        if (source.MasterInstanceId != null) {
            this.MasterInstanceId = new String(source.MasterInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoInstanceId", this.RoInstanceId);
        this.setParamSimple(map, prefix + "MasterInstanceId", this.MasterInstanceId);

    }
}

