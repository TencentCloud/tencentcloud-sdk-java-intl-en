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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusZonesRequest extends AbstractModel {

    /**
    * Region ID. You only need to specify the value of either `RegionId` or `RegionName`.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region name. You only need to specify the value of either `RegionId` or `RegionName`.
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get Region ID. You only need to specify the value of either `RegionId` or `RegionName`. 
     * @return RegionId Region ID. You only need to specify the value of either `RegionId` or `RegionName`.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID. You only need to specify the value of either `RegionId` or `RegionName`.
     * @param RegionId Region ID. You only need to specify the value of either `RegionId` or `RegionName`.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region name. You only need to specify the value of either `RegionId` or `RegionName`. 
     * @return RegionName Region name. You only need to specify the value of either `RegionId` or `RegionName`.
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name. You only need to specify the value of either `RegionId` or `RegionName`.
     * @param RegionName Region name. You only need to specify the value of either `RegionId` or `RegionName`.
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public DescribePrometheusZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusZonesRequest(DescribePrometheusZonesRequest source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}

