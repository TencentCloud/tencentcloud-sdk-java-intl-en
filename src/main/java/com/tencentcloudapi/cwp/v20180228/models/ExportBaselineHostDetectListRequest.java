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

public class ExportBaselineHostDetectListRequest extends AbstractModel {

    /**
    * <li>HostTag - string - whether required: no - host tag</li> <li>ItemId - int64 - whether required: no - item ID</li> <li>RuleId - int64 - whether required: no - rule ID</li> <li>IsPassed - int - whether required: no - whether passed</li> <li>RiskTier - int - whether required: no - risk level</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 0: Filtered Result Export; 1: Export All
    */
    @SerializedName("ExportAll")
    @Expose
    private Long ExportAll;

    /**
    * 0: show the export interface; 1: export all result events
    */
    @SerializedName("IsExportDetail")
    @Expose
    private Long IsExportDetail;

    /**
     * Get <li>HostTag - string - whether required: no - host tag</li> <li>ItemId - int64 - whether required: no - item ID</li> <li>RuleId - int64 - whether required: no - rule ID</li> <li>IsPassed - int - whether required: no - whether passed</li> <li>RiskTier - int - whether required: no - risk level</li> 
     * @return Filters <li>HostTag - string - whether required: no - host tag</li> <li>ItemId - int64 - whether required: no - item ID</li> <li>RuleId - int64 - whether required: no - rule ID</li> <li>IsPassed - int - whether required: no - whether passed</li> <li>RiskTier - int - whether required: no - risk level</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>HostTag - string - whether required: no - host tag</li> <li>ItemId - int64 - whether required: no - item ID</li> <li>RuleId - int64 - whether required: no - rule ID</li> <li>IsPassed - int - whether required: no - whether passed</li> <li>RiskTier - int - whether required: no - risk level</li>
     * @param Filters <li>HostTag - string - whether required: no - host tag</li> <li>ItemId - int64 - whether required: no - item ID</li> <li>RuleId - int64 - whether required: no - rule ID</li> <li>IsPassed - int - whether required: no - whether passed</li> <li>RiskTier - int - whether required: no - risk level</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 0: Filtered Result Export; 1: Export All 
     * @return ExportAll 0: Filtered Result Export; 1: Export All
     */
    public Long getExportAll() {
        return this.ExportAll;
    }

    /**
     * Set 0: Filtered Result Export; 1: Export All
     * @param ExportAll 0: Filtered Result Export; 1: Export All
     */
    public void setExportAll(Long ExportAll) {
        this.ExportAll = ExportAll;
    }

    /**
     * Get 0: show the export interface; 1: export all result events 
     * @return IsExportDetail 0: show the export interface; 1: export all result events
     */
    public Long getIsExportDetail() {
        return this.IsExportDetail;
    }

    /**
     * Set 0: show the export interface; 1: export all result events
     * @param IsExportDetail 0: show the export interface; 1: export all result events
     */
    public void setIsExportDetail(Long IsExportDetail) {
        this.IsExportDetail = IsExportDetail;
    }

    public ExportBaselineHostDetectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportBaselineHostDetectListRequest(ExportBaselineHostDetectListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ExportAll != null) {
            this.ExportAll = new Long(source.ExportAll);
        }
        if (source.IsExportDetail != null) {
            this.IsExportDetail = new Long(source.IsExportDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ExportAll", this.ExportAll);
        this.setParamSimple(map, prefix + "IsExportDetail", this.IsExportDetail);

    }
}

