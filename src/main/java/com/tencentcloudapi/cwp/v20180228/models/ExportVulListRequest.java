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

public class ExportVulListRequest extends AbstractModel {

    /**
    * Filter criteria
<li>VulCategory - int - required: no - filter by vulnerability category: 1 - web-cms vulnerabilities; 2 - application vulnerabilities; 4 - Linux software vulnerabilities; 5 - Windows system vulnerabilities</li>
<li>IfEmergency - String - required: no - whether an emergency vulnerability; if you need to query an emergency vulnerability, please pass yes to this parameter.</li>
<li>Status - String - required: yes - filter by vulnerability status: 0 - pending; 1 - ignored; 3 - fixed; 5 - detecting. The console only handles four statuses: 0, 1, 3, and 5.</li>
<li>Level - String - required: no - filter by vulnerability level: 1 - low; 2 - medium; 3 - high; 4 - prompt</li>
<li>VulName - String - required: no - search by vulnerability name</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Whether to export details: 1 - yes; 0 - no
    */
    @SerializedName("IfDetail")
    @Expose
    private Long IfDetail;

    /**
     * Get Filter criteria
<li>VulCategory - int - required: no - filter by vulnerability category: 1 - web-cms vulnerabilities; 2 - application vulnerabilities; 4 - Linux software vulnerabilities; 5 - Windows system vulnerabilities</li>
<li>IfEmergency - String - required: no - whether an emergency vulnerability; if you need to query an emergency vulnerability, please pass yes to this parameter.</li>
<li>Status - String - required: yes - filter by vulnerability status: 0 - pending; 1 - ignored; 3 - fixed; 5 - detecting. The console only handles four statuses: 0, 1, 3, and 5.</li>
<li>Level - String - required: no - filter by vulnerability level: 1 - low; 2 - medium; 3 - high; 4 - prompt</li>
<li>VulName - String - required: no - search by vulnerability name</li> 
     * @return Filters Filter criteria
<li>VulCategory - int - required: no - filter by vulnerability category: 1 - web-cms vulnerabilities; 2 - application vulnerabilities; 4 - Linux software vulnerabilities; 5 - Windows system vulnerabilities</li>
<li>IfEmergency - String - required: no - whether an emergency vulnerability; if you need to query an emergency vulnerability, please pass yes to this parameter.</li>
<li>Status - String - required: yes - filter by vulnerability status: 0 - pending; 1 - ignored; 3 - fixed; 5 - detecting. The console only handles four statuses: 0, 1, 3, and 5.</li>
<li>Level - String - required: no - filter by vulnerability level: 1 - low; 2 - medium; 3 - high; 4 - prompt</li>
<li>VulName - String - required: no - search by vulnerability name</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>VulCategory - int - required: no - filter by vulnerability category: 1 - web-cms vulnerabilities; 2 - application vulnerabilities; 4 - Linux software vulnerabilities; 5 - Windows system vulnerabilities</li>
<li>IfEmergency - String - required: no - whether an emergency vulnerability; if you need to query an emergency vulnerability, please pass yes to this parameter.</li>
<li>Status - String - required: yes - filter by vulnerability status: 0 - pending; 1 - ignored; 3 - fixed; 5 - detecting. The console only handles four statuses: 0, 1, 3, and 5.</li>
<li>Level - String - required: no - filter by vulnerability level: 1 - low; 2 - medium; 3 - high; 4 - prompt</li>
<li>VulName - String - required: no - search by vulnerability name</li>
     * @param Filters Filter criteria
<li>VulCategory - int - required: no - filter by vulnerability category: 1 - web-cms vulnerabilities; 2 - application vulnerabilities; 4 - Linux software vulnerabilities; 5 - Windows system vulnerabilities</li>
<li>IfEmergency - String - required: no - whether an emergency vulnerability; if you need to query an emergency vulnerability, please pass yes to this parameter.</li>
<li>Status - String - required: yes - filter by vulnerability status: 0 - pending; 1 - ignored; 3 - fixed; 5 - detecting. The console only handles four statuses: 0, 1, 3, and 5.</li>
<li>Level - String - required: no - filter by vulnerability level: 1 - low; 2 - medium; 3 - high; 4 - prompt</li>
<li>VulName - String - required: no - search by vulnerability name</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Whether to export details: 1 - yes; 0 - no 
     * @return IfDetail Whether to export details: 1 - yes; 0 - no
     */
    public Long getIfDetail() {
        return this.IfDetail;
    }

    /**
     * Set Whether to export details: 1 - yes; 0 - no
     * @param IfDetail Whether to export details: 1 - yes; 0 - no
     */
    public void setIfDetail(Long IfDetail) {
        this.IfDetail = IfDetail;
    }

    public ExportVulListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportVulListRequest(ExportVulListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.IfDetail != null) {
            this.IfDetail = new Long(source.IfDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "IfDetail", this.IfDetail);

    }
}

