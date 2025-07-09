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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RumAreaInfo extends AbstractModel {

    /**
    * Region ID
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * Region status (1: valid; 2: invalid)
    */
    @SerializedName("AreaStatus")
    @Expose
    private Long AreaStatus;

    /**
    * Region name
    */
    @SerializedName("AreaName")
    @Expose
    private String AreaName;

    /**
    * Region key
    */
    @SerializedName("AreaKey")
    @Expose
    private String AreaKey;

    /**
    * Region ID.
    */
    @SerializedName("AreaRegionID")
    @Expose
    private String AreaRegionID;

    /**
    * Region code, such as “ap-xxx” (xxx is the region name).
    */
    @SerializedName("AreaRegionCode")
    @Expose
    private String AreaRegionCode;

    /**
    * Region abbreviation.
    */
    @SerializedName("AreaAbbr")
    @Expose
    private String AreaAbbr;

    /**
     * Get Region ID 
     * @return AreaId Region ID
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set Region ID
     * @param AreaId Region ID
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get Region status (1: valid; 2: invalid) 
     * @return AreaStatus Region status (1: valid; 2: invalid)
     */
    public Long getAreaStatus() {
        return this.AreaStatus;
    }

    /**
     * Set Region status (1: valid; 2: invalid)
     * @param AreaStatus Region status (1: valid; 2: invalid)
     */
    public void setAreaStatus(Long AreaStatus) {
        this.AreaStatus = AreaStatus;
    }

    /**
     * Get Region name 
     * @return AreaName Region name
     */
    public String getAreaName() {
        return this.AreaName;
    }

    /**
     * Set Region name
     * @param AreaName Region name
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    /**
     * Get Region key 
     * @return AreaKey Region key
     */
    public String getAreaKey() {
        return this.AreaKey;
    }

    /**
     * Set Region key
     * @param AreaKey Region key
     */
    public void setAreaKey(String AreaKey) {
        this.AreaKey = AreaKey;
    }

    /**
     * Get Region ID. 
     * @return AreaRegionID Region ID.
     */
    public String getAreaRegionID() {
        return this.AreaRegionID;
    }

    /**
     * Set Region ID.
     * @param AreaRegionID Region ID.
     */
    public void setAreaRegionID(String AreaRegionID) {
        this.AreaRegionID = AreaRegionID;
    }

    /**
     * Get Region code, such as “ap-xxx” (xxx is the region name). 
     * @return AreaRegionCode Region code, such as “ap-xxx” (xxx is the region name).
     */
    public String getAreaRegionCode() {
        return this.AreaRegionCode;
    }

    /**
     * Set Region code, such as “ap-xxx” (xxx is the region name).
     * @param AreaRegionCode Region code, such as “ap-xxx” (xxx is the region name).
     */
    public void setAreaRegionCode(String AreaRegionCode) {
        this.AreaRegionCode = AreaRegionCode;
    }

    /**
     * Get Region abbreviation. 
     * @return AreaAbbr Region abbreviation.
     */
    public String getAreaAbbr() {
        return this.AreaAbbr;
    }

    /**
     * Set Region abbreviation.
     * @param AreaAbbr Region abbreviation.
     */
    public void setAreaAbbr(String AreaAbbr) {
        this.AreaAbbr = AreaAbbr;
    }

    public RumAreaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RumAreaInfo(RumAreaInfo source) {
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.AreaStatus != null) {
            this.AreaStatus = new Long(source.AreaStatus);
        }
        if (source.AreaName != null) {
            this.AreaName = new String(source.AreaName);
        }
        if (source.AreaKey != null) {
            this.AreaKey = new String(source.AreaKey);
        }
        if (source.AreaRegionID != null) {
            this.AreaRegionID = new String(source.AreaRegionID);
        }
        if (source.AreaRegionCode != null) {
            this.AreaRegionCode = new String(source.AreaRegionCode);
        }
        if (source.AreaAbbr != null) {
            this.AreaAbbr = new String(source.AreaAbbr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "AreaStatus", this.AreaStatus);
        this.setParamSimple(map, prefix + "AreaName", this.AreaName);
        this.setParamSimple(map, prefix + "AreaKey", this.AreaKey);
        this.setParamSimple(map, prefix + "AreaRegionID", this.AreaRegionID);
        this.setParamSimple(map, prefix + "AreaRegionCode", this.AreaRegionCode);
        this.setParamSimple(map, prefix + "AreaAbbr", this.AreaAbbr);

    }
}

