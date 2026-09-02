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

public class DescribeDspmIdentifyDistributionStatisticsRequest extends AbstractModel {

    /**
    * <p>Statistics type</p><p>Enumeration values:</p><ul><li>FieldTop5Asset: Top 5 identification fields</li><li>FieldCategoryDistribution: Classification distribution of identification fields</li><li>FieldLevelDistribution: Field level distribution of identification fields</li><li>AssetDistribution: Asset distribution of identification</li></ul>
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: TencentDB for MySQL</li><li>mariadb: TencentDB for MariaDB</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Recognition template id</p>
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
     * Get <p>Statistics type</p><p>Enumeration values:</p><ul><li>FieldTop5Asset: Top 5 identification fields</li><li>FieldCategoryDistribution: Classification distribution of identification fields</li><li>FieldLevelDistribution: Field level distribution of identification fields</li><li>AssetDistribution: Asset distribution of identification</li></ul> 
     * @return StatType <p>Statistics type</p><p>Enumeration values:</p><ul><li>FieldTop5Asset: Top 5 identification fields</li><li>FieldCategoryDistribution: Classification distribution of identification fields</li><li>FieldLevelDistribution: Field level distribution of identification fields</li><li>AssetDistribution: Asset distribution of identification</li></ul>
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set <p>Statistics type</p><p>Enumeration values:</p><ul><li>FieldTop5Asset: Top 5 identification fields</li><li>FieldCategoryDistribution: Classification distribution of identification fields</li><li>FieldLevelDistribution: Field level distribution of identification fields</li><li>AssetDistribution: Asset distribution of identification</li></ul>
     * @param StatType <p>Statistics type</p><p>Enumeration values:</p><ul><li>FieldTop5Asset: Top 5 identification fields</li><li>FieldCategoryDistribution: Classification distribution of identification fields</li><li>FieldLevelDistribution: Field level distribution of identification fields</li><li>AssetDistribution: Asset distribution of identification</li></ul>
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: TencentDB for MySQL</li><li>mariadb: TencentDB for MariaDB</li></ul> 
     * @return AssetType <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: TencentDB for MySQL</li><li>mariadb: TencentDB for MariaDB</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: TencentDB for MySQL</li><li>mariadb: TencentDB for MariaDB</li></ul>
     * @param AssetType <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: TencentDB for MySQL</li><li>mariadb: TencentDB for MariaDB</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Recognition template id</p> 
     * @return ComplianceId <p>Recognition template id</p>
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set <p>Recognition template id</p>
     * @param ComplianceId <p>Recognition template id</p>
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    public DescribeDspmIdentifyDistributionStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmIdentifyDistributionStatisticsRequest(DescribeDspmIdentifyDistributionStatisticsRequest source) {
        if (source.StatType != null) {
            this.StatType = new String(source.StatType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);

    }
}

