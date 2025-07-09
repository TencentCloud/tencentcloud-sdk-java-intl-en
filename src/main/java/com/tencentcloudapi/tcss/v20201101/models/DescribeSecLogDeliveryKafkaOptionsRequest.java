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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecLogDeliveryKafkaOptionsRequest extends AbstractModel {

    /**
    * Region. If this field was left blank, return all available regions.
    */
    @SerializedName("RegionID")
    @Expose
    private String RegionID;

    /**
     * Get Region. If this field was left blank, return all available regions. 
     * @return RegionID Region. If this field was left blank, return all available regions.
     */
    public String getRegionID() {
        return this.RegionID;
    }

    /**
     * Set Region. If this field was left blank, return all available regions.
     * @param RegionID Region. If this field was left blank, return all available regions.
     */
    public void setRegionID(String RegionID) {
        this.RegionID = RegionID;
    }

    public DescribeSecLogDeliveryKafkaOptionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecLogDeliveryKafkaOptionsRequest(DescribeSecLogDeliveryKafkaOptionsRequest source) {
        if (source.RegionID != null) {
            this.RegionID = new String(source.RegionID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);

    }
}

