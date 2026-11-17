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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntentDetectResult extends AbstractModel {

    /**
    * <p>Whether the intent is malicious.</p><p>Valid values:</p><ul><li>1: Malicious</li><li>0: Normal</li></ul>
    */
    @SerializedName("IsUnSafe")
    @Expose
    private Long IsUnSafe;

    /**
    * <p>Detection category</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get <p>Whether the intent is malicious.</p><p>Valid values:</p><ul><li>1: Malicious</li><li>0: Normal</li></ul> 
     * @return IsUnSafe <p>Whether the intent is malicious.</p><p>Valid values:</p><ul><li>1: Malicious</li><li>0: Normal</li></ul>
     */
    public Long getIsUnSafe() {
        return this.IsUnSafe;
    }

    /**
     * Set <p>Whether the intent is malicious.</p><p>Valid values:</p><ul><li>1: Malicious</li><li>0: Normal</li></ul>
     * @param IsUnSafe <p>Whether the intent is malicious.</p><p>Valid values:</p><ul><li>1: Malicious</li><li>0: Normal</li></ul>
     */
    public void setIsUnSafe(Long IsUnSafe) {
        this.IsUnSafe = IsUnSafe;
    }

    /**
     * Get <p>Detection category</p> 
     * @return Category <p>Detection category</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Detection category</p>
     * @param Category <p>Detection category</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public IntentDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentDetectResult(IntentDetectResult source) {
        if (source.IsUnSafe != null) {
            this.IsUnSafe = new Long(source.IsUnSafe);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsUnSafe", this.IsUnSafe);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

