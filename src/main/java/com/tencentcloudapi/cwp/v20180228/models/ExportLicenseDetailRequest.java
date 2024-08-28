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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportLicenseDetailRequest extends AbstractModel {

    /**
    * Take the intersection when filtering with multiple conditions: LicenseStatus, DeadlineStatus, ResourceId, and Keywords
<li> LicenseType authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription</li>
<li>ResourceId resource ID</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Whether to export all authorization details
    */
    @SerializedName("IsHistory")
    @Expose
    private Boolean IsHistory;

    /**
    * Tag filtering; filter by the platform's tag capabilities. In this case, you should pass in the tag key and tag value as an object.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * Export month, this parameter is optional only when IsHistory is active.
    */
    @SerializedName("ExportMonth")
    @Expose
    private String ExportMonth;

    /**
     * Get Take the intersection when filtering with multiple conditions: LicenseStatus, DeadlineStatus, ResourceId, and Keywords
<li> LicenseType authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription</li>
<li>ResourceId resource ID</li> 
     * @return Filters Take the intersection when filtering with multiple conditions: LicenseStatus, DeadlineStatus, ResourceId, and Keywords
<li> LicenseType authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription</li>
<li>ResourceId resource ID</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Take the intersection when filtering with multiple conditions: LicenseStatus, DeadlineStatus, ResourceId, and Keywords
<li> LicenseType authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription</li>
<li>ResourceId resource ID</li>
     * @param Filters Take the intersection when filtering with multiple conditions: LicenseStatus, DeadlineStatus, ResourceId, and Keywords
<li> LicenseType authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2: Ultimate Edition-monthly subscription</li>
<li>ResourceId resource ID</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Whether to export all authorization details 
     * @return IsHistory Whether to export all authorization details
     */
    public Boolean getIsHistory() {
        return this.IsHistory;
    }

    /**
     * Set Whether to export all authorization details
     * @param IsHistory Whether to export all authorization details
     */
    public void setIsHistory(Boolean IsHistory) {
        this.IsHistory = IsHistory;
    }

    /**
     * Get Tag filtering; filter by the platform's tag capabilities. In this case, you should pass in the tag key and tag value as an object. 
     * @return Tags Tag filtering; filter by the platform's tag capabilities. In this case, you should pass in the tag key and tag value as an object.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag filtering; filter by the platform's tag capabilities. In this case, you should pass in the tag key and tag value as an object.
     * @param Tags Tag filtering; filter by the platform's tag capabilities. In this case, you should pass in the tag key and tag value as an object.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Export month, this parameter is optional only when IsHistory is active. 
     * @return ExportMonth Export month, this parameter is optional only when IsHistory is active.
     */
    public String getExportMonth() {
        return this.ExportMonth;
    }

    /**
     * Set Export month, this parameter is optional only when IsHistory is active.
     * @param ExportMonth Export month, this parameter is optional only when IsHistory is active.
     */
    public void setExportMonth(String ExportMonth) {
        this.ExportMonth = ExportMonth;
    }

    public ExportLicenseDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportLicenseDetailRequest(ExportLicenseDetailRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.IsHistory != null) {
            this.IsHistory = new Boolean(source.IsHistory);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.ExportMonth != null) {
            this.ExportMonth = new String(source.ExportMonth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "IsHistory", this.IsHistory);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ExportMonth", this.ExportMonth);

    }
}

