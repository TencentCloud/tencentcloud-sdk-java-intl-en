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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInstanceCount extends AbstractModel{

    /**
    * Region code
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region code (new specification)
    */
    @SerializedName("RegionV3")
    @Expose
    private String RegionV3;

    /**
    * Number of resource instances
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Region code 
     * @return Region Region code
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region code
     * @param Region Region code
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region code (new specification) 
     * @return RegionV3 Region code (new specification)
     */
    public String getRegionV3() {
        return this.RegionV3;
    }

    /**
     * Set Region code (new specification)
     * @param RegionV3 Region code (new specification)
     */
    public void setRegionV3(String RegionV3) {
        this.RegionV3 = RegionV3;
    }

    /**
     * Get Number of resource instances 
     * @return Count Number of resource instances
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of resource instances
     * @param Count Number of resource instances
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionV3", this.RegionV3);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

