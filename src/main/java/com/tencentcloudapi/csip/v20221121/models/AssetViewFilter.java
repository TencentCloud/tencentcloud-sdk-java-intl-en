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

public class AssetViewFilter extends AbstractModel {

    /**
    * <p>View ID.</p>
    */
    @SerializedName("ViewID")
    @Expose
    private Long ViewID;

    /**
    * <p>View name</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>View filter items</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get <p>View ID.</p> 
     * @return ViewID <p>View ID.</p>
     */
    public Long getViewID() {
        return this.ViewID;
    }

    /**
     * Set <p>View ID.</p>
     * @param ViewID <p>View ID.</p>
     */
    public void setViewID(Long ViewID) {
        this.ViewID = ViewID;
    }

    /**
     * Get <p>View name</p> 
     * @return ViewName <p>View name</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>View name</p>
     * @param ViewName <p>View name</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>View filter items</p> 
     * @return Filters <p>View filter items</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>View filter items</p>
     * @param Filters <p>View filter items</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public AssetViewFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetViewFilter(AssetViewFilter source) {
        if (source.ViewID != null) {
            this.ViewID = new Long(source.ViewID);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewID", this.ViewID);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

