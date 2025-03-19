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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * Region encoding
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * Region name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CnName")
    @Expose
    private String CnName;

    /**
    * English name of the region
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * Region ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Number of AZs

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableZoneNum")
    @Expose
    private Long AvailableZoneNum;

    /**
     * Get Region encoding 
     * @return RegionCode Region encoding
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set Region encoding
     * @param RegionCode Region encoding
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get Region name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CnName Region name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCnName() {
        return this.CnName;
    }

    /**
     * Set Region name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CnName Region name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCnName(String CnName) {
        this.CnName = CnName;
    }

    /**
     * Get English name of the region 
     * @return EnName English name of the region
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set English name of the region
     * @param EnName English name of the region
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get Region ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Region ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionId Region ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Number of AZs

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AvailableZoneNum Number of AZs

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAvailableZoneNum() {
        return this.AvailableZoneNum;
    }

    /**
     * Set Number of AZs

Note: This field may return null, indicating that no valid values can be obtained.
     * @param AvailableZoneNum Number of AZs

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailableZoneNum(Long AvailableZoneNum) {
        this.AvailableZoneNum = AvailableZoneNum;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.CnName != null) {
            this.CnName = new String(source.CnName);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.AvailableZoneNum != null) {
            this.AvailableZoneNum = new Long(source.AvailableZoneNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "CnName", this.CnName);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "AvailableZoneNum", this.AvailableZoneNum);

    }
}

