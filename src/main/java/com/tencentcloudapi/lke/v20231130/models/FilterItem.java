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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilterItem extends AbstractModel {

    /**
    * Filter the content.
For example, you can use "AuditStatus" to filter by review status.
    */
    @SerializedName("FilterKey")
    @Expose
    private String FilterKey;

    /**
    * Filtering criteria.
For example, for the filter content "AuditStatus", use the following filtering conditions:
"ContentFailed": "Content review failed"
"PictureFailed": "Image review failed",
"ContentAndPictureFailed": "Image and content review failed",
    */
    @SerializedName("FilterValue")
    @Expose
    private String [] FilterValue;

    /**
     * Get Filter the content.
For example, you can use "AuditStatus" to filter by review status. 
     * @return FilterKey Filter the content.
For example, you can use "AuditStatus" to filter by review status.
     */
    public String getFilterKey() {
        return this.FilterKey;
    }

    /**
     * Set Filter the content.
For example, you can use "AuditStatus" to filter by review status.
     * @param FilterKey Filter the content.
For example, you can use "AuditStatus" to filter by review status.
     */
    public void setFilterKey(String FilterKey) {
        this.FilterKey = FilterKey;
    }

    /**
     * Get Filtering criteria.
For example, for the filter content "AuditStatus", use the following filtering conditions:
"ContentFailed": "Content review failed"
"PictureFailed": "Image review failed",
"ContentAndPictureFailed": "Image and content review failed", 
     * @return FilterValue Filtering criteria.
For example, for the filter content "AuditStatus", use the following filtering conditions:
"ContentFailed": "Content review failed"
"PictureFailed": "Image review failed",
"ContentAndPictureFailed": "Image and content review failed",
     */
    public String [] getFilterValue() {
        return this.FilterValue;
    }

    /**
     * Set Filtering criteria.
For example, for the filter content "AuditStatus", use the following filtering conditions:
"ContentFailed": "Content review failed"
"PictureFailed": "Image review failed",
"ContentAndPictureFailed": "Image and content review failed",
     * @param FilterValue Filtering criteria.
For example, for the filter content "AuditStatus", use the following filtering conditions:
"ContentFailed": "Content review failed"
"PictureFailed": "Image review failed",
"ContentAndPictureFailed": "Image and content review failed",
     */
    public void setFilterValue(String [] FilterValue) {
        this.FilterValue = FilterValue;
    }

    public FilterItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterItem(FilterItem source) {
        if (source.FilterKey != null) {
            this.FilterKey = new String(source.FilterKey);
        }
        if (source.FilterValue != null) {
            this.FilterValue = new String[source.FilterValue.length];
            for (int i = 0; i < source.FilterValue.length; i++) {
                this.FilterValue[i] = new String(source.FilterValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FilterKey", this.FilterKey);
        this.setParamArraySimple(map, prefix + "FilterValue.", this.FilterValue);

    }
}

