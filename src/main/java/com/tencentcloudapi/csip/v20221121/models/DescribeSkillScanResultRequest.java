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
    * Specify the engine version number.
Parameter value for reference: returned by the CreateSkillScan API.
    */
    @SerializedName("EngineVersion")
    @Expose
    private Long EngineVersion;

    /**
    * Address validity period of the report signature
Unit: hr
Default value: 8760 (1 year)
Supplementary description: It takes effect on the returned ReportURL.
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
     * Get Specify the engine version number.
Parameter value for reference: returned by the CreateSkillScan API. 
     * @return EngineVersion Specify the engine version number.
Parameter value for reference: returned by the CreateSkillScan API.
     */
    public Long getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Specify the engine version number.
Parameter value for reference: returned by the CreateSkillScan API.
     * @param EngineVersion Specify the engine version number.
Parameter value for reference: returned by the CreateSkillScan API.
     */
    public void setEngineVersion(Long EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Address validity period of the report signature
Unit: hr
Default value: 8760 (1 year)
Supplementary description: It takes effect on the returned ReportURL. 
     * @return ReportURLExpireHours Address validity period of the report signature
Unit: hr
Default value: 8760 (1 year)
Supplementary description: It takes effect on the returned ReportURL.
     */
    public Long getReportURLExpireHours() {
        return this.ReportURLExpireHours;
    }

    /**
     * Set Address validity period of the report signature
Unit: hr
Default value: 8760 (1 year)
Supplementary description: It takes effect on the returned ReportURL.
     * @param ReportURLExpireHours Address validity period of the report signature
Unit: hr
Default value: 8760 (1 year)
Supplementary description: It takes effect on the returned ReportURL.
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

