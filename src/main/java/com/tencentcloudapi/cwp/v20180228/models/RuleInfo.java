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

public class RuleInfo extends AbstractModel {

    /**
    * Full-text index configurations
    */
    @SerializedName("FullText")
    @Expose
    private FullTextInfo FullText;

    /**
    * Key-value index configurations
    */
    @SerializedName("KeyValue")
    @Expose
    private KeyValueInfo KeyValue;

    /**
    * Meta field index configuration
    */
    @SerializedName("Tag")
    @Expose
    private KeyValueInfo Tag;

    /**
     * Get Full-text index configurations 
     * @return FullText Full-text index configurations
     */
    public FullTextInfo getFullText() {
        return this.FullText;
    }

    /**
     * Set Full-text index configurations
     * @param FullText Full-text index configurations
     */
    public void setFullText(FullTextInfo FullText) {
        this.FullText = FullText;
    }

    /**
     * Get Key-value index configurations 
     * @return KeyValue Key-value index configurations
     */
    public KeyValueInfo getKeyValue() {
        return this.KeyValue;
    }

    /**
     * Set Key-value index configurations
     * @param KeyValue Key-value index configurations
     */
    public void setKeyValue(KeyValueInfo KeyValue) {
        this.KeyValue = KeyValue;
    }

    /**
     * Get Meta field index configuration 
     * @return Tag Meta field index configuration
     */
    public KeyValueInfo getTag() {
        return this.Tag;
    }

    /**
     * Set Meta field index configuration
     * @param Tag Meta field index configuration
     */
    public void setTag(KeyValueInfo Tag) {
        this.Tag = Tag;
    }

    public RuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInfo(RuleInfo source) {
        if (source.FullText != null) {
            this.FullText = new FullTextInfo(source.FullText);
        }
        if (source.KeyValue != null) {
            this.KeyValue = new KeyValueInfo(source.KeyValue);
        }
        if (source.Tag != null) {
            this.Tag = new KeyValueInfo(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FullText.", this.FullText);
        this.setParamObj(map, prefix + "KeyValue.", this.KeyValue);
        this.setParamObj(map, prefix + "Tag.", this.Tag);

    }
}

