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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel{

    /**
    * Region, such as `ap-guangzhou`, `ap-shanghai` and `ap-beijing`
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region name, such as `South China (Guangzhou)`, `East China (Shanghai)`, and `North China (Beijing)`
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region code, such as `gz`, `sh`, and `bj`
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
     * Get Region, such as `ap-guangzhou`, `ap-shanghai` and `ap-beijing` 
     * @return Region Region, such as `ap-guangzhou`, `ap-shanghai` and `ap-beijing`
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region, such as `ap-guangzhou`, `ap-shanghai` and `ap-beijing`
     * @param Region Region, such as `ap-guangzhou`, `ap-shanghai` and `ap-beijing`
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region name, such as `South China (Guangzhou)`, `East China (Shanghai)`, and `North China (Beijing)` 
     * @return RegionName Region name, such as `South China (Guangzhou)`, `East China (Shanghai)`, and `North China (Beijing)`
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name, such as `South China (Guangzhou)`, `East China (Shanghai)`, and `North China (Beijing)`
     * @param RegionName Region name, such as `South China (Guangzhou)`, `East China (Shanghai)`, and `North China (Beijing)`
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region code, such as `gz`, `sh`, and `bj` 
     * @return RegionCode Region code, such as `gz`, `sh`, and `bj`
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set Region code, such as `gz`, `sh`, and `bj`
     * @param RegionCode Region code, such as `gz`, `sh`, and `bj`
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);

    }
}

