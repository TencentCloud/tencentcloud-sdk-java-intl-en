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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditInstanceFilters extends AbstractModel {

    /**
    * Filter condition values. Supports InstanceId-Instance ID, InstanceName-Instance Name, ProjectId-Project ID, TagKey-Tag Key, Tag-Tag (separated by a vertical bar, e.g.: Tagkey|Tagvalue).
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * true indicates exact match; false indicates fuzzy match.
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
    * Filter value
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Filter condition values. Supports InstanceId-Instance ID, InstanceName-Instance Name, ProjectId-Project ID, TagKey-Tag Key, Tag-Tag (separated by a vertical bar, e.g.: Tagkey|Tagvalue). 
     * @return Name Filter condition values. Supports InstanceId-Instance ID, InstanceName-Instance Name, ProjectId-Project ID, TagKey-Tag Key, Tag-Tag (separated by a vertical bar, e.g.: Tagkey|Tagvalue).
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter condition values. Supports InstanceId-Instance ID, InstanceName-Instance Name, ProjectId-Project ID, TagKey-Tag Key, Tag-Tag (separated by a vertical bar, e.g.: Tagkey|Tagvalue).
     * @param Name Filter condition values. Supports InstanceId-Instance ID, InstanceName-Instance Name, ProjectId-Project ID, TagKey-Tag Key, Tag-Tag (separated by a vertical bar, e.g.: Tagkey|Tagvalue).
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get true indicates exact match; false indicates fuzzy match. 
     * @return ExactMatch true indicates exact match; false indicates fuzzy match.
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set true indicates exact match; false indicates fuzzy match.
     * @param ExactMatch true indicates exact match; false indicates fuzzy match.
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    /**
     * Get Filter value 
     * @return Values Filter value
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Filter value
     * @param Values Filter value
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public AuditInstanceFilters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditInstanceFilters(AuditInstanceFilters source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExactMatch != null) {
            this.ExactMatch = new Boolean(source.ExactMatch);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

