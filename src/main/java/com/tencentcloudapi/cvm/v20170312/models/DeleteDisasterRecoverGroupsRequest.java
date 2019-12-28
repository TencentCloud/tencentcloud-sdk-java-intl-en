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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDisasterRecoverGroupsRequest extends AbstractModel{

    /**
    * List of spread placement group IDs, which can be obtained by calling the [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810) API.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
     * Get List of spread placement group IDs, which can be obtained by calling the [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810) API. 
     * @return DisasterRecoverGroupIds List of spread placement group IDs, which can be obtained by calling the [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810) API.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set List of spread placement group IDs, which can be obtained by calling the [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810) API.
     * @param DisasterRecoverGroupIds List of spread placement group IDs, which can be obtained by calling the [DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810) API.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);

    }
}

