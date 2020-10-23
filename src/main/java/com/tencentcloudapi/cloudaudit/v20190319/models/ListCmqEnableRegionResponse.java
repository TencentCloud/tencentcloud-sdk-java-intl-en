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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCmqEnableRegionResponse extends AbstractModel{

    /**
    * CloudAudit-enabled CMQ AZs
    */
    @SerializedName("EnableRegions")
    @Expose
    private CmqRegionInfo [] EnableRegions;

    /**
    * Unique ID of request. Each request returns a unique ID. The `RequestId` is required for troubleshooting.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CloudAudit-enabled CMQ AZs 
     * @return EnableRegions CloudAudit-enabled CMQ AZs
     */
    public CmqRegionInfo [] getEnableRegions() {
        return this.EnableRegions;
    }

    /**
     * Set CloudAudit-enabled CMQ AZs
     * @param EnableRegions CloudAudit-enabled CMQ AZs
     */
    public void setEnableRegions(CmqRegionInfo [] EnableRegions) {
        this.EnableRegions = EnableRegions;
    }

    /**
     * Get Unique ID of request. Each request returns a unique ID. The `RequestId` is required for troubleshooting. 
     * @return RequestId Unique ID of request. Each request returns a unique ID. The `RequestId` is required for troubleshooting.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Unique ID of request. Each request returns a unique ID. The `RequestId` is required for troubleshooting.
     * @param RequestId Unique ID of request. Each request returns a unique ID. The `RequestId` is required for troubleshooting.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EnableRegions.", this.EnableRegions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

