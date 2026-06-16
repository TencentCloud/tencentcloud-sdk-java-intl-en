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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RowColumnConfig extends AbstractModel {

    /**
    * Row column permission rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RulerInfo")
    @Expose
    private String RulerInfo;

    /**
    * Tag value list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagValueList")
    @Expose
    private RowColumnTagValue [] TagValueList;

    /**
     * Get Row column permission rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RulerInfo Row column permission rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRulerInfo() {
        return this.RulerInfo;
    }

    /**
     * Set Row column permission rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RulerInfo Row column permission rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRulerInfo(String RulerInfo) {
        this.RulerInfo = RulerInfo;
    }

    /**
     * Get Tag value list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagValueList Tag value list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RowColumnTagValue [] getTagValueList() {
        return this.TagValueList;
    }

    /**
     * Set Tag value list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagValueList Tag value list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagValueList(RowColumnTagValue [] TagValueList) {
        this.TagValueList = TagValueList;
    }

    public RowColumnConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RowColumnConfig(RowColumnConfig source) {
        if (source.RulerInfo != null) {
            this.RulerInfo = new String(source.RulerInfo);
        }
        if (source.TagValueList != null) {
            this.TagValueList = new RowColumnTagValue[source.TagValueList.length];
            for (int i = 0; i < source.TagValueList.length; i++) {
                this.TagValueList[i] = new RowColumnTagValue(source.TagValueList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RulerInfo", this.RulerInfo);
        this.setParamArrayObj(map, prefix + "TagValueList.", this.TagValueList);

    }
}

