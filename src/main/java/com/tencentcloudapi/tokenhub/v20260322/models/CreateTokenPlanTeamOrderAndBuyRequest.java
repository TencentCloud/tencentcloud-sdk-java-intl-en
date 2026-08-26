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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTokenPlanTeamOrderAndBuyRequest extends AbstractModel {

    /**
    * <p>Package type. Value: enterprise (enterprise edition professional package), enterprise-auto (enterprise edition lite package).</p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>Package name. It can only contain Chinese, letters, digits, underscores, and hyphens. It must start with a Chinese character or a letter and end with a Chinese character, letter, or digit. The length should be 2-50 characters.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>Purchase duration. Unit: Month. It must be greater than 0, supporting 1 to 12 months.</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>Specification of the purchased package. If the package type is enterprise, the measurement unit is point; if the package type is enterprise-auto, the measurement unit is tokens.</p>
    */
    @SerializedName("CreditOrToken")
    @Expose
    private Long CreditOrToken;

    /**
    * <p>Whether to enable auto-renewal. Not enabled by default.</p>
    */
    @SerializedName("EnableAutoRenew")
    @Expose
    private Boolean EnableAutoRenew;

    /**
    * <p>Existing package ID (if not empty, the renewal process is performed; if empty, a new purchase is performed)</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
     * Get <p>Package type. Value: enterprise (enterprise edition professional package), enterprise-auto (enterprise edition lite package).</p> 
     * @return ProductType <p>Package type. Value: enterprise (enterprise edition professional package), enterprise-auto (enterprise edition lite package).</p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>Package type. Value: enterprise (enterprise edition professional package), enterprise-auto (enterprise edition lite package).</p>
     * @param ProductType <p>Package type. Value: enterprise (enterprise edition professional package), enterprise-auto (enterprise edition lite package).</p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>Package name. It can only contain Chinese, letters, digits, underscores, and hyphens. It must start with a Chinese character or a letter and end with a Chinese character, letter, or digit. The length should be 2-50 characters.</p> 
     * @return TeamName <p>Package name. It can only contain Chinese, letters, digits, underscores, and hyphens. It must start with a Chinese character or a letter and end with a Chinese character, letter, or digit. The length should be 2-50 characters.</p>
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set <p>Package name. It can only contain Chinese, letters, digits, underscores, and hyphens. It must start with a Chinese character or a letter and end with a Chinese character, letter, or digit. The length should be 2-50 characters.</p>
     * @param TeamName <p>Package name. It can only contain Chinese, letters, digits, underscores, and hyphens. It must start with a Chinese character or a letter and end with a Chinese character, letter, or digit. The length should be 2-50 characters.</p>
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get <p>Purchase duration. Unit: Month. It must be greater than 0, supporting 1 to 12 months.</p> 
     * @return TimeSpan <p>Purchase duration. Unit: Month. It must be greater than 0, supporting 1 to 12 months.</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>Purchase duration. Unit: Month. It must be greater than 0, supporting 1 to 12 months.</p>
     * @param TimeSpan <p>Purchase duration. Unit: Month. It must be greater than 0, supporting 1 to 12 months.</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>Specification of the purchased package. If the package type is enterprise, the measurement unit is point; if the package type is enterprise-auto, the measurement unit is tokens.</p> 
     * @return CreditOrToken <p>Specification of the purchased package. If the package type is enterprise, the measurement unit is point; if the package type is enterprise-auto, the measurement unit is tokens.</p>
     */
    public Long getCreditOrToken() {
        return this.CreditOrToken;
    }

    /**
     * Set <p>Specification of the purchased package. If the package type is enterprise, the measurement unit is point; if the package type is enterprise-auto, the measurement unit is tokens.</p>
     * @param CreditOrToken <p>Specification of the purchased package. If the package type is enterprise, the measurement unit is point; if the package type is enterprise-auto, the measurement unit is tokens.</p>
     */
    public void setCreditOrToken(Long CreditOrToken) {
        this.CreditOrToken = CreditOrToken;
    }

    /**
     * Get <p>Whether to enable auto-renewal. Not enabled by default.</p> 
     * @return EnableAutoRenew <p>Whether to enable auto-renewal. Not enabled by default.</p>
     */
    public Boolean getEnableAutoRenew() {
        return this.EnableAutoRenew;
    }

    /**
     * Set <p>Whether to enable auto-renewal. Not enabled by default.</p>
     * @param EnableAutoRenew <p>Whether to enable auto-renewal. Not enabled by default.</p>
     */
    public void setEnableAutoRenew(Boolean EnableAutoRenew) {
        this.EnableAutoRenew = EnableAutoRenew;
    }

    /**
     * Get <p>Existing package ID (if not empty, the renewal process is performed; if empty, a new purchase is performed)</p> 
     * @return TeamId <p>Existing package ID (if not empty, the renewal process is performed; if empty, a new purchase is performed)</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>Existing package ID (if not empty, the renewal process is performed; if empty, a new purchase is performed)</p>
     * @param TeamId <p>Existing package ID (if not empty, the renewal process is performed; if empty, a new purchase is performed)</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    public CreateTokenPlanTeamOrderAndBuyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTokenPlanTeamOrderAndBuyRequest(CreateTokenPlanTeamOrderAndBuyRequest source) {
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.CreditOrToken != null) {
            this.CreditOrToken = new Long(source.CreditOrToken);
        }
        if (source.EnableAutoRenew != null) {
            this.EnableAutoRenew = new Boolean(source.EnableAutoRenew);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "CreditOrToken", this.CreditOrToken);
        this.setParamSimple(map, prefix + "EnableAutoRenew", this.EnableAutoRenew);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);

    }
}

