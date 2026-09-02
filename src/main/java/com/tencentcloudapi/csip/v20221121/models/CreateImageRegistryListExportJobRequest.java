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

public class CreateImageRegistryListExportJobRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Filter item</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>Save to the export task</p><p>Enumeration values:</p><ul><li>0: Do not save</li><li>1: Save</li></ul>
    */
    @SerializedName("Save")
    @Expose
    private Long Save;

    /**
    * <p>Export file name</p>
    */
    @SerializedName("ExportName")
    @Expose
    private String ExportName;

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
     * Get <p>Filter item</p> 
     * @return Filter <p>Filter item</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>Filter item</p>
     * @param Filter <p>Filter item</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>Save to the export task</p><p>Enumeration values:</p><ul><li>0: Do not save</li><li>1: Save</li></ul> 
     * @return Save <p>Save to the export task</p><p>Enumeration values:</p><ul><li>0: Do not save</li><li>1: Save</li></ul>
     */
    public Long getSave() {
        return this.Save;
    }

    /**
     * Set <p>Save to the export task</p><p>Enumeration values:</p><ul><li>0: Do not save</li><li>1: Save</li></ul>
     * @param Save <p>Save to the export task</p><p>Enumeration values:</p><ul><li>0: Do not save</li><li>1: Save</li></ul>
     */
    public void setSave(Long Save) {
        this.Save = Save;
    }

    /**
     * Get <p>Export file name</p> 
     * @return ExportName <p>Export file name</p>
     */
    public String getExportName() {
        return this.ExportName;
    }

    /**
     * Set <p>Export file name</p>
     * @param ExportName <p>Export file name</p>
     */
    public void setExportName(String ExportName) {
        this.ExportName = ExportName;
    }

    public CreateImageRegistryListExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRegistryListExportJobRequest(CreateImageRegistryListExportJobRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.Save != null) {
            this.Save = new Long(source.Save);
        }
        if (source.ExportName != null) {
            this.ExportName = new String(source.ExportName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Save", this.Save);
        this.setParamSimple(map, prefix + "ExportName", this.ExportName);

    }
}

