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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSecurityGroupsRequest extends AbstractModel {

    /**
    * Specifies that the instance ID must be provided by selecting either InstanceId or InstanceGroupId.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies that the instance group ID must be provided by selecting either InstanceId or InstanceGroupId.
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
     * Get Specifies that the instance ID must be provided by selecting either InstanceId or InstanceGroupId. 
     * @return InstanceId Specifies that the instance ID must be provided by selecting either InstanceId or InstanceGroupId.
     * @deprecated
     */
    @Deprecated
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies that the instance ID must be provided by selecting either InstanceId or InstanceGroupId.
     * @param InstanceId Specifies that the instance ID must be provided by selecting either InstanceId or InstanceGroupId.
     * @deprecated
     */
    @Deprecated
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies that the instance group ID must be provided by selecting either InstanceId or InstanceGroupId. 
     * @return InstanceGroupId Specifies that the instance group ID must be provided by selecting either InstanceId or InstanceGroupId.
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set Specifies that the instance group ID must be provided by selecting either InstanceId or InstanceGroupId.
     * @param InstanceGroupId Specifies that the instance group ID must be provided by selecting either InstanceId or InstanceGroupId.
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    public DescribeDBSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSecurityGroupsRequest(DescribeDBSecurityGroupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);

    }
}

