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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListFilesRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * 
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * 
    */
    @SerializedName("MaxKeys")
    @Expose
    private Long MaxKeys;

    /**
    * 
    */
    @SerializedName("Marker")
    @Expose
    private String Marker;

    /**
    * 
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return Prefix 
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set 
     * @param Prefix 
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get  
     * @return Delimiter 
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set 
     * @param Delimiter 
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get  
     * @return MaxKeys 
     */
    public Long getMaxKeys() {
        return this.MaxKeys;
    }

    /**
     * Set 
     * @param MaxKeys 
     */
    public void setMaxKeys(Long MaxKeys) {
        this.MaxKeys = MaxKeys;
    }

    /**
     * Get  
     * @return Marker 
     */
    public String getMarker() {
        return this.Marker;
    }

    /**
     * Set 
     * @param Marker 
     */
    public void setMarker(String Marker) {
        this.Marker = Marker;
    }

    /**
     * Get  
     * @return Categories 
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set 
     * @param Categories 
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    public ListFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListFilesRequest(ListFilesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.MaxKeys != null) {
            this.MaxKeys = new Long(source.MaxKeys);
        }
        if (source.Marker != null) {
            this.Marker = new String(source.Marker);
        }
        if (source.Categories != null) {
            this.Categories = new String[source.Categories.length];
            for (int i = 0; i < source.Categories.length; i++) {
                this.Categories[i] = new String(source.Categories[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "MaxKeys", this.MaxKeys);
        this.setParamSimple(map, prefix + "Marker", this.Marker);
        this.setParamArraySimple(map, prefix + "Categories.", this.Categories);

    }
}

