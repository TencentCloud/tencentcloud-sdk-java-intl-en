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

public class ExportFileTamperEventsRequest extends AbstractModel {

    /**
    * Filtering criteria
<li>Status - String - required: no - processing status: 0: pending; 1: added to allowlist; 2: deleted; 3: ignored</li><li>ModifyTime - string - required: no - last occurrence time</li>
<li>Uuid - String - required: no - host UUID for querying</li>
<li>RuleCategory - string - required: no - rule category: 0: system rule; 1: custom rule</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Fields to be exported
    */
    @SerializedName("Fileds")
    @Expose
    private String [] Fileds;

    /**
    * Fields to be exported
    */
    @SerializedName("Fields")
    @Expose
    private String Fields;

    /**
     * Get Filtering criteria
<li>Status - String - required: no - processing status: 0: pending; 1: added to allowlist; 2: deleted; 3: ignored</li><li>ModifyTime - string - required: no - last occurrence time</li>
<li>Uuid - String - required: no - host UUID for querying</li>
<li>RuleCategory - string - required: no - rule category: 0: system rule; 1: custom rule</li> 
     * @return Filters Filtering criteria
<li>Status - String - required: no - processing status: 0: pending; 1: added to allowlist; 2: deleted; 3: ignored</li><li>ModifyTime - string - required: no - last occurrence time</li>
<li>Uuid - String - required: no - host UUID for querying</li>
<li>RuleCategory - string - required: no - rule category: 0: system rule; 1: custom rule</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>Status - String - required: no - processing status: 0: pending; 1: added to allowlist; 2: deleted; 3: ignored</li><li>ModifyTime - string - required: no - last occurrence time</li>
<li>Uuid - String - required: no - host UUID for querying</li>
<li>RuleCategory - string - required: no - rule category: 0: system rule; 1: custom rule</li>
     * @param Filters Filtering criteria
<li>Status - String - required: no - processing status: 0: pending; 1: added to allowlist; 2: deleted; 3: ignored</li><li>ModifyTime - string - required: no - last occurrence time</li>
<li>Uuid - String - required: no - host UUID for querying</li>
<li>RuleCategory - string - required: no - rule category: 0: system rule; 1: custom rule</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Fields to be exported 
     * @return Fileds Fields to be exported
     * @deprecated
     */
    @Deprecated
    public String [] getFileds() {
        return this.Fileds;
    }

    /**
     * Set Fields to be exported
     * @param Fileds Fields to be exported
     * @deprecated
     */
    @Deprecated
    public void setFileds(String [] Fileds) {
        this.Fileds = Fileds;
    }

    /**
     * Get Fields to be exported 
     * @return Fields Fields to be exported
     */
    public String getFields() {
        return this.Fields;
    }

    /**
     * Set Fields to be exported
     * @param Fields Fields to be exported
     */
    public void setFields(String Fields) {
        this.Fields = Fields;
    }

    public ExportFileTamperEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportFileTamperEventsRequest(ExportFileTamperEventsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Fileds != null) {
            this.Fileds = new String[source.Fileds.length];
            for (int i = 0; i < source.Fileds.length; i++) {
                this.Fileds[i] = new String(source.Fileds[i]);
            }
        }
        if (source.Fields != null) {
            this.Fields = new String(source.Fields);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "Fileds.", this.Fileds);
        this.setParamSimple(map, prefix + "Fields", this.Fields);

    }
}

