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

public class ScreenEventsCnt extends AbstractModel {

    /**
    * Displayed content: Total number of pending risks and total number of affected assets
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Total number of events
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * name: Specific type of the displayed content, including attack event, potential risk, compromised asset, and potentially risky asset
Value: event count after statistics
    */
    @SerializedName("Category")
    @Expose
    private ScreenNameValue [] Category;

    /**
     * Get Displayed content: Total number of pending risks and total number of affected assets 
     * @return Title Displayed content: Total number of pending risks and total number of affected assets
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Displayed content: Total number of pending risks and total number of affected assets
     * @param Title Displayed content: Total number of pending risks and total number of affected assets
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Total number of events 
     * @return Total Total number of events
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of events
     * @param Total Total number of events
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get name: Specific type of the displayed content, including attack event, potential risk, compromised asset, and potentially risky asset
Value: event count after statistics 
     * @return Category name: Specific type of the displayed content, including attack event, potential risk, compromised asset, and potentially risky asset
Value: event count after statistics
     */
    public ScreenNameValue [] getCategory() {
        return this.Category;
    }

    /**
     * Set name: Specific type of the displayed content, including attack event, potential risk, compromised asset, and potentially risky asset
Value: event count after statistics
     * @param Category name: Specific type of the displayed content, including attack event, potential risk, compromised asset, and potentially risky asset
Value: event count after statistics
     */
    public void setCategory(ScreenNameValue [] Category) {
        this.Category = Category;
    }

    public ScreenEventsCnt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenEventsCnt(ScreenEventsCnt source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Category != null) {
            this.Category = new ScreenNameValue[source.Category.length];
            for (int i = 0; i < source.Category.length; i++) {
                this.Category[i] = new ScreenNameValue(source.Category[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Category.", this.Category);

    }
}

