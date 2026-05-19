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
    * VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Object key prefix matching, limited to object keys whose names contain the specified prefix in response.
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * A character separator used for grouping object keys. All object keys with the same part between the prefix or the start (if no prefix is specified) and the first delimiter are grouped as a prefix node under CommonPrefixes. Grouped object keys no longer appear in the subsequent object list.
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * ys  Maximum number of entries returned at a time. Default value: 100. Minimum: 1. Maximum: 100.
    */
    @SerializedName("MaxKeys")
    @Expose
    private Long MaxKeys;

    /**
    * Starting object key marker
    */
    @SerializedName("Marker")
    @Expose
    private String Marker;

    /**
    * File type. Match any element in the collection: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li>
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
     * Get VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. 
     * @return SubAppId VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.
     * @param SubAppId VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Object key prefix matching, limited to object keys whose names contain the specified prefix in response. 
     * @return Prefix Object key prefix matching, limited to object keys whose names contain the specified prefix in response.
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set Object key prefix matching, limited to object keys whose names contain the specified prefix in response.
     * @param Prefix Object key prefix matching, limited to object keys whose names contain the specified prefix in response.
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get A character separator used for grouping object keys. All object keys with the same part between the prefix or the start (if no prefix is specified) and the first delimiter are grouped as a prefix node under CommonPrefixes. Grouped object keys no longer appear in the subsequent object list. 
     * @return Delimiter A character separator used for grouping object keys. All object keys with the same part between the prefix or the start (if no prefix is specified) and the first delimiter are grouped as a prefix node under CommonPrefixes. Grouped object keys no longer appear in the subsequent object list.
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set A character separator used for grouping object keys. All object keys with the same part between the prefix or the start (if no prefix is specified) and the first delimiter are grouped as a prefix node under CommonPrefixes. Grouped object keys no longer appear in the subsequent object list.
     * @param Delimiter A character separator used for grouping object keys. All object keys with the same part between the prefix or the start (if no prefix is specified) and the first delimiter are grouped as a prefix node under CommonPrefixes. Grouped object keys no longer appear in the subsequent object list.
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get ys  Maximum number of entries returned at a time. Default value: 100. Minimum: 1. Maximum: 100. 
     * @return MaxKeys ys  Maximum number of entries returned at a time. Default value: 100. Minimum: 1. Maximum: 100.
     */
    public Long getMaxKeys() {
        return this.MaxKeys;
    }

    /**
     * Set ys  Maximum number of entries returned at a time. Default value: 100. Minimum: 1. Maximum: 100.
     * @param MaxKeys ys  Maximum number of entries returned at a time. Default value: 100. Minimum: 1. Maximum: 100.
     */
    public void setMaxKeys(Long MaxKeys) {
        this.MaxKeys = MaxKeys;
    }

    /**
     * Get Starting object key marker 
     * @return Marker Starting object key marker
     */
    public String getMarker() {
        return this.Marker;
    }

    /**
     * Set Starting object key marker
     * @param Marker Starting object key marker
     */
    public void setMarker(String Marker) {
        this.Marker = Marker;
    }

    /**
     * Get File type. Match any element in the collection: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li> 
     * @return Categories File type. Match any element in the collection: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li>
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set File type. Match any element in the collection: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li>
     * @param Categories File type. Match any element in the collection: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li>
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

