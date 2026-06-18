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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSkillScanResultRequest extends AbstractModel {

    /**
    * SHA256 Hash of the ZIP file
Parameter format: sha256:<64-bit hex>
    */
    @SerializedName("ContentHash")
    @Expose
    private String ContentHash;

    /**
    * Specify the engine version number
Value for reference: API response of CreateSkillScan
    */
    @SerializedName("EngineVersion")
    @Expose
    private Long EngineVersion;

    /**
    * Report signature address validity
Unit: hr
Default value: 8760 (1 year).
Supplementary explanation: The returned ReportURL takes effect.
    */
    @SerializedName("ReportURLExpireHours")
    @Expose
    private Long ReportURLExpireHours;

    /**
     * Get SHA256 Hash of the ZIP file
Parameter format: sha256:<64-bit hex> 
     * @return ContentHash SHA256 Hash of the ZIP file
Parameter format: sha256:<64-bit hex>
     */
    public String getContentHash() {
        return this.ContentHash;
    }

    /**
     * Set SHA256 Hash of the ZIP file
Parameter format: sha256:<64-bit hex>
     * @param ContentHash SHA256 Hash of the ZIP file
Parameter format: sha256:<64-bit hex>
     */
    public void setContentHash(String ContentHash) {
        this.ContentHash = ContentHash;
    }

    /**
     * Get Specify the engine version number
Value for reference: API response of CreateSkillScan 
     * @return EngineVersion Specify the engine version number
Value for reference: API response of CreateSkillScan
     */
    public Long getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Specify the engine version number
Value for reference: API response of CreateSkillScan
     * @param EngineVersion Specify the engine version number
Value for reference: API response of CreateSkillScan
     */
    public void setEngineVersion(Long EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Report signature address validity
Unit: hr
Default value: 8760 (1 year).
Supplementary explanation: The returned ReportURL takes effect. 
     * @return ReportURLExpireHours Report signature address validity
Unit: hr
Default value: 8760 (1 year).
Supplementary explanation: The returned ReportURL takes effect.
     */
    public Long getReportURLExpireHours() {
        return this.ReportURLExpireHours;
    }

    /**
     * Set Report signature address validity
Unit: hr
Default value: 8760 (1 year).
Supplementary explanation: The returned ReportURL takes effect.
     * @param ReportURLExpireHours Report signature address validity
Unit: hr
Default value: 8760 (1 year).
Supplementary explanation: The returned ReportURL takes effect.
     */
    public void setReportURLExpireHours(Long ReportURLExpireHours) {
        this.ReportURLExpireHours = ReportURLExpireHours;
    }

    public DescribeSkillScanResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillScanResultRequest(DescribeSkillScanResultRequest source) {
        if (source.ContentHash != null) {
            this.ContentHash = new String(source.ContentHash);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new Long(source.EngineVersion);
        }
        if (source.ReportURLExpireHours != null) {
            this.ReportURLExpireHours = new Long(source.ReportURLExpireHours);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentHash", this.ContentHash);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "ReportURLExpireHours", this.ReportURLExpireHours);

    }
}

