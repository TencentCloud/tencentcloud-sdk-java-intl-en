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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrHotwordsSetItem extends AbstractModel {

    /**
    * Hotword ID.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Hotword text.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Hotword weight. The value can be 11 or 100 or be in the range of 1 to 10.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get Hotword ID.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id Hotword ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Hotword ID.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id Hotword ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Hotword text.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Text Hotword text.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Hotword text.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Text Hotword text.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Hotword weight. The value can be 11 or 100 or be in the range of 1 to 10.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Weight Hotword weight. The value can be 11 or 100 or be in the range of 1 to 10.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Hotword weight. The value can be 11 or 100 or be in the range of 1 to 10.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Weight Hotword weight. The value can be 11 or 100 or be in the range of 1 to 10.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public AsrHotwordsSetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrHotwordsSetItem(AsrHotwordsSetItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

