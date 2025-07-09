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

public class CreateWhiteListOrderRequest extends AbstractModel {

    /**
    * Authorization type
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * Number of authorizations (The minimum value is 1, and the maximum value is 99999.)
    */
    @SerializedName("LicenseNum")
    @Expose
    private Long LicenseNum;

    /**
    * Expiration time (The minimum value is 1.)
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * Rule name, big asset center: asset_center
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Order type. 1: trial; 2: free; 3: experience; 4: free SSL certificate gift; 5: free CVM
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Region: 1 Guangzhou; 9 Singapore. The default is 1. Do not select 9 unless necessary.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Additional parameters; JSON string, including ResourceId and LicenseType.
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
     * Get Authorization type 
     * @return LicenseType Authorization type
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Authorization type
     * @param LicenseType Authorization type
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Number of authorizations (The minimum value is 1, and the maximum value is 99999.) 
     * @return LicenseNum Number of authorizations (The minimum value is 1, and the maximum value is 99999.)
     */
    public Long getLicenseNum() {
        return this.LicenseNum;
    }

    /**
     * Set Number of authorizations (The minimum value is 1, and the maximum value is 99999.)
     * @param LicenseNum Number of authorizations (The minimum value is 1, and the maximum value is 99999.)
     */
    public void setLicenseNum(Long LicenseNum) {
        this.LicenseNum = LicenseNum;
    }

    /**
     * Get Expiration time (The minimum value is 1.) 
     * @return Deadline Expiration time (The minimum value is 1.)
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set Expiration time (The minimum value is 1.)
     * @param Deadline Expiration time (The minimum value is 1.)
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get Rule name, big asset center: asset_center 
     * @return RuleName Rule name, big asset center: asset_center
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name, big asset center: asset_center
     * @param RuleName Rule name, big asset center: asset_center
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Order type. 1: trial; 2: free; 3: experience; 4: free SSL certificate gift; 5: free CVM 
     * @return SourceType Order type. 1: trial; 2: free; 3: experience; 4: free SSL certificate gift; 5: free CVM
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Order type. 1: trial; 2: free; 3: experience; 4: free SSL certificate gift; 5: free CVM
     * @param SourceType Order type. 1: trial; 2: free; 3: experience; 4: free SSL certificate gift; 5: free CVM
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Region: 1 Guangzhou; 9 Singapore. The default is 1. Do not select 9 unless necessary. 
     * @return RegionId Region: 1 Guangzhou; 9 Singapore. The default is 1. Do not select 9 unless necessary.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region: 1 Guangzhou; 9 Singapore. The default is 1. Do not select 9 unless necessary.
     * @param RegionId Region: 1 Guangzhou; 9 Singapore. The default is 1. Do not select 9 unless necessary.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Additional parameters; JSON string, including ResourceId and LicenseType. 
     * @return ExtraParam Additional parameters; JSON string, including ResourceId and LicenseType.
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set Additional parameters; JSON string, including ResourceId and LicenseType.
     * @param ExtraParam Additional parameters; JSON string, including ResourceId and LicenseType.
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    public CreateWhiteListOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWhiteListOrderRequest(CreateWhiteListOrderRequest source) {
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.LicenseNum != null) {
            this.LicenseNum = new Long(source.LicenseNum);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "LicenseNum", this.LicenseNum);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);

    }
}

