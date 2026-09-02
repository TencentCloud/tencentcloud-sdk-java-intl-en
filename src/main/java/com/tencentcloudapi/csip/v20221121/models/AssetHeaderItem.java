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

public class AssetHeaderItem extends AbstractModel {

    /**
    * <p>Type.</p>
    */
    @SerializedName("ItemType")
    @Expose
    private String ItemType;

    /**
    * <p>Show</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>Support copying</p>
    */
    @SerializedName("Copy")
    @Expose
    private Long Copy;

    /**
    * <p>Value corresponding to the field key</p>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * <p>Redirect URL</p>
    */
    @SerializedName("LinkURL")
    @Expose
    private String LinkURL;

    /**
    * <p>Filter</p>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilterConfig [] Filters;

    /**
    * <p>Support sorting</p>
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
    * <p>Field display style</p>
    */
    @SerializedName("ValueStyle")
    @Expose
    private String ValueStyle;

    /**
     * Get <p>Type.</p> 
     * @return ItemType <p>Type.</p>
     */
    public String getItemType() {
        return this.ItemType;
    }

    /**
     * Set <p>Type.</p>
     * @param ItemType <p>Type.</p>
     */
    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    /**
     * Get <p>Show</p> 
     * @return Label <p>Show</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>Show</p>
     * @param Label <p>Show</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>Support copying</p> 
     * @return Copy <p>Support copying</p>
     */
    public Long getCopy() {
        return this.Copy;
    }

    /**
     * Set <p>Support copying</p>
     * @param Copy <p>Support copying</p>
     */
    public void setCopy(Long Copy) {
        this.Copy = Copy;
    }

    /**
     * Get <p>Value corresponding to the field key</p> 
     * @return Values <p>Value corresponding to the field key</p>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>Value corresponding to the field key</p>
     * @param Values <p>Value corresponding to the field key</p>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get <p>Redirect URL</p> 
     * @return LinkURL <p>Redirect URL</p>
     */
    public String getLinkURL() {
        return this.LinkURL;
    }

    /**
     * Set <p>Redirect URL</p>
     * @param LinkURL <p>Redirect URL</p>
     */
    public void setLinkURL(String LinkURL) {
        this.LinkURL = LinkURL;
    }

    /**
     * Get <p>Filter</p> 
     * @return Filters <p>Filter</p>
     */
    public AssetFilterConfig [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter</p>
     * @param Filters <p>Filter</p>
     */
    public void setFilters(AssetFilterConfig [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Support sorting</p> 
     * @return Sort <p>Support sorting</p>
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set <p>Support sorting</p>
     * @param Sort <p>Support sorting</p>
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>Field display style</p> 
     * @return ValueStyle <p>Field display style</p>
     */
    public String getValueStyle() {
        return this.ValueStyle;
    }

    /**
     * Set <p>Field display style</p>
     * @param ValueStyle <p>Field display style</p>
     */
    public void setValueStyle(String ValueStyle) {
        this.ValueStyle = ValueStyle;
    }

    public AssetHeaderItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetHeaderItem(AssetHeaderItem source) {
        if (source.ItemType != null) {
            this.ItemType = new String(source.ItemType);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Copy != null) {
            this.Copy = new Long(source.Copy);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.LinkURL != null) {
            this.LinkURL = new String(source.LinkURL);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilterConfig[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilterConfig(source.Filters[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
        if (source.ValueStyle != null) {
            this.ValueStyle = new String(source.ValueStyle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemType", this.ItemType);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Copy", this.Copy);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "LinkURL", this.LinkURL);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "ValueStyle", this.ValueStyle);

    }
}

