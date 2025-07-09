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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * Region identifiers, such as ap-guangzhou, ap-shanghai, and ap-beijing
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Chinese name of a region, such as South China (Guangzhou), East China (Shanghai Finance), and North China (Beijing)
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
    * Region code, such as gz, sh, and bj
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * English name of the region
    */
    @SerializedName("RegionNameEn")
    @Expose
    private String RegionNameEn;

    /**
     * Get Region identifiers, such as ap-guangzhou, ap-shanghai, and ap-beijing 
     * @return Region Region identifiers, such as ap-guangzhou, ap-shanghai, and ap-beijing
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region identifiers, such as ap-guangzhou, ap-shanghai, and ap-beijing
     * @param Region Region identifiers, such as ap-guangzhou, ap-shanghai, and ap-beijing
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Chinese name of a region, such as South China (Guangzhou), East China (Shanghai Finance), and North China (Beijing) 
     * @return RegionName Chinese name of a region, such as South China (Guangzhou), East China (Shanghai Finance), and North China (Beijing)
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Chinese name of a region, such as South China (Guangzhou), East China (Shanghai Finance), and North China (Beijing)
     * @param RegionName Chinese name of a region, such as South China (Guangzhou), East China (Shanghai Finance), and North China (Beijing)
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
     * Get Region code, such as gz, sh, and bj 
     * @return RegionCode Region code, such as gz, sh, and bj
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set Region code, such as gz, sh, and bj
     * @param RegionCode Region code, such as gz, sh, and bj
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get English name of the region 
     * @return RegionNameEn English name of the region
     */
    public String getRegionNameEn() {
        return this.RegionNameEn;
    }

    /**
     * Set English name of the region
     * @param RegionNameEn English name of the region
     */
    public void setRegionNameEn(String RegionNameEn) {
        this.RegionNameEn = RegionNameEn;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.RegionNameEn != null) {
            this.RegionNameEn = new String(source.RegionNameEn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "RegionNameEn", this.RegionNameEn);

    }
}

