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

public class ExportBaselineItemListRequest extends AbstractModel {

    /**
    * <li>PolicyId - int64 - required: no - policy ID</li>
<li>RuleId - int64 - required: no - rule ID</li>
<li>HostId - string - whether required: no - host ID</li>
<li>HostName - string - required: no - host name</li>
<li>HostIp - string - required: no - host IP</li>
<li>ItemId - String - required: no - detection item ID</li>
<li>ItemName - String - required: no - item name</li>
<li>DetectStatus - int - required: no - detection status [0: not passed|3: passed|5: detecting]</li>
<li>Level - int - Required: No - Risk level</li>
<li>StartTime - string - required: no - start time</li>
<li>EndTime - string - required: no - end time</li>
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
     * Get <li>PolicyId - int64 - required: no - policy ID</li>
<li>RuleId - int64 - required: no - rule ID</li>
<li>HostId - string - whether required: no - host ID</li>
<li>HostName - string - required: no - host name</li>
<li>HostIp - string - required: no - host IP</li>
<li>ItemId - String - required: no - detection item ID</li>
<li>ItemName - String - required: no - item name</li>
<li>DetectStatus - int - required: no - detection status [0: not passed|3: passed|5: detecting]</li>
<li>Level - int - Required: No - Risk level</li>
<li>StartTime - string - required: no - start time</li>
<li>EndTime - string - required: no - end time</li> 
     * @return Filters <li>PolicyId - int64 - required: no - policy ID</li>
<li>RuleId - int64 - required: no - rule ID</li>
<li>HostId - string - whether required: no - host ID</li>
<li>HostName - string - required: no - host name</li>
<li>HostIp - string - required: no - host IP</li>
<li>ItemId - String - required: no - detection item ID</li>
<li>ItemName - String - required: no - item name</li>
<li>DetectStatus - int - required: no - detection status [0: not passed|3: passed|5: detecting]</li>
<li>Level - int - Required: No - Risk level</li>
<li>StartTime - string - required: no - start time</li>
<li>EndTime - string - required: no - end time</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>PolicyId - int64 - required: no - policy ID</li>
<li>RuleId - int64 - required: no - rule ID</li>
<li>HostId - string - whether required: no - host ID</li>
<li>HostName - string - required: no - host name</li>
<li>HostIp - string - required: no - host IP</li>
<li>ItemId - String - required: no - detection item ID</li>
<li>ItemName - String - required: no - item name</li>
<li>DetectStatus - int - required: no - detection status [0: not passed|3: passed|5: detecting]</li>
<li>Level - int - Required: No - Risk level</li>
<li>StartTime - string - required: no - start time</li>
<li>EndTime - string - required: no - end time</li>
     * @param Filters <li>PolicyId - int64 - required: no - policy ID</li>
<li>RuleId - int64 - required: no - rule ID</li>
<li>HostId - string - whether required: no - host ID</li>
<li>HostName - string - required: no - host name</li>
<li>HostIp - string - required: no - host IP</li>
<li>ItemId - String - required: no - detection item ID</li>
<li>ItemName - String - required: no - item name</li>
<li>DetectStatus - int - required: no - detection status [0: not passed|3: passed|5: detecting]</li>
<li>Level - int - Required: No - Risk level</li>
<li>StartTime - string - required: no - start time</li>
<li>EndTime - string - required: no - end time</li>
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

    public ExportBaselineItemListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportBaselineItemListRequest(ExportBaselineItemListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ExportAll != null) {
            this.ExportAll = new Long(source.ExportAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ExportAll", this.ExportAll);

    }
}

