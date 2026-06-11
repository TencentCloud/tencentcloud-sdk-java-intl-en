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

public class ExportWindowsPatchListRequest extends AbstractModel {

    /**
    * Filter criteria  
<li>Status - String type - optional - processing status: 0: pending, 1: ignored, 3: fixed</li>
<li>ShowNew: int optional show latest version 0-enable 1-disable</li>
<li>Name : string type optional patch name</li>
<li>KbNo : string type optional Patch Number</li>
<li>Uuid : string type optional host uuid</li>

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Filter criteria  
<li>Status - String type - optional - processing status: 0: pending, 1: ignored, 3: fixed</li>
<li>ShowNew: int optional show latest version 0-enable 1-disable</li>
<li>Name : string type optional patch name</li>
<li>KbNo : string type optional Patch Number</li>
<li>Uuid : string type optional host uuid</li>
 
     * @return Filters Filter criteria  
<li>Status - String type - optional - processing status: 0: pending, 1: ignored, 3: fixed</li>
<li>ShowNew: int optional show latest version 0-enable 1-disable</li>
<li>Name : string type optional patch name</li>
<li>KbNo : string type optional Patch Number</li>
<li>Uuid : string type optional host uuid</li>

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria  
<li>Status - String type - optional - processing status: 0: pending, 1: ignored, 3: fixed</li>
<li>ShowNew: int optional show latest version 0-enable 1-disable</li>
<li>Name : string type optional patch name</li>
<li>KbNo : string type optional Patch Number</li>
<li>Uuid : string type optional host uuid</li>

     * @param Filters Filter criteria  
<li>Status - String type - optional - processing status: 0: pending, 1: ignored, 3: fixed</li>
<li>ShowNew: int optional show latest version 0-enable 1-disable</li>
<li>Name : string type optional patch name</li>
<li>KbNo : string type optional Patch Number</li>
<li>Uuid : string type optional host uuid</li>

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ExportWindowsPatchListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportWindowsPatchListRequest(ExportWindowsPatchListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

