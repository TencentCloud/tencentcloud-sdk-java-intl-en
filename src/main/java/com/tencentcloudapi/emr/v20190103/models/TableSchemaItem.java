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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableSchemaItem extends AbstractModel {

    /**
    * Column identifier
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether it is sortable by this column
    */
    @SerializedName("Sortable")
    @Expose
    private Boolean Sortable;

    /**
    * Whether it is filterable
    */
    @SerializedName("WithFilter")
    @Expose
    private Boolean WithFilter;

    /**
    * Filtered candidate set

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Candidates")
    @Expose
    private String [] Candidates;

    /**
    * Whether it is clickable.
    */
    @SerializedName("Clickable")
    @Expose
    private Boolean Clickable;

    /**
    * Display name.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
     * Get Column identifier 
     * @return Name Column identifier
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Column identifier
     * @param Name Column identifier
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether it is sortable by this column 
     * @return Sortable Whether it is sortable by this column
     */
    public Boolean getSortable() {
        return this.Sortable;
    }

    /**
     * Set Whether it is sortable by this column
     * @param Sortable Whether it is sortable by this column
     */
    public void setSortable(Boolean Sortable) {
        this.Sortable = Sortable;
    }

    /**
     * Get Whether it is filterable 
     * @return WithFilter Whether it is filterable
     */
    public Boolean getWithFilter() {
        return this.WithFilter;
    }

    /**
     * Set Whether it is filterable
     * @param WithFilter Whether it is filterable
     */
    public void setWithFilter(Boolean WithFilter) {
        this.WithFilter = WithFilter;
    }

    /**
     * Get Filtered candidate set

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Candidates Filtered candidate set

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCandidates() {
        return this.Candidates;
    }

    /**
     * Set Filtered candidate set

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Candidates Filtered candidate set

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCandidates(String [] Candidates) {
        this.Candidates = Candidates;
    }

    /**
     * Get Whether it is clickable. 
     * @return Clickable Whether it is clickable.
     */
    public Boolean getClickable() {
        return this.Clickable;
    }

    /**
     * Set Whether it is clickable.
     * @param Clickable Whether it is clickable.
     */
    public void setClickable(Boolean Clickable) {
        this.Clickable = Clickable;
    }

    /**
     * Get Display name. 
     * @return Title Display name.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Display name.
     * @param Title Display name.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public TableSchemaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableSchemaItem(TableSchemaItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sortable != null) {
            this.Sortable = new Boolean(source.Sortable);
        }
        if (source.WithFilter != null) {
            this.WithFilter = new Boolean(source.WithFilter);
        }
        if (source.Candidates != null) {
            this.Candidates = new String[source.Candidates.length];
            for (int i = 0; i < source.Candidates.length; i++) {
                this.Candidates[i] = new String(source.Candidates[i]);
            }
        }
        if (source.Clickable != null) {
            this.Clickable = new Boolean(source.Clickable);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sortable", this.Sortable);
        this.setParamSimple(map, prefix + "WithFilter", this.WithFilter);
        this.setParamArraySimple(map, prefix + "Candidates.", this.Candidates);
        this.setParamSimple(map, prefix + "Clickable", this.Clickable);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

