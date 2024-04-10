/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleInfo extends AbstractModel {

    /**
    * Full-text index configuration. If empty, full-text indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullText")
    @Expose
    private FullTextInfo FullText;

    /**
    * Key-value index configuration. If empty, key-value indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyValue")
    @Expose
    private RuleKeyValueInfo KeyValue;

    /**
    * Metadata field index configuration. If empty, metadata field indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private RuleTagInfo Tag;

    /**
    * Key-value index automatic configuration. If empty, the feature is not enabled.Once enabled, fields within logs are automatically added to the key-value index, including fields added to logs subsequently.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DynamicIndex")
    @Expose
    private DynamicIndex DynamicIndex;

    /**
     * Get Full-text index configuration. If empty, full-text indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullText Full-text index configuration. If empty, full-text indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FullTextInfo getFullText() {
        return this.FullText;
    }

    /**
     * Set Full-text index configuration. If empty, full-text indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullText Full-text index configuration. If empty, full-text indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullText(FullTextInfo FullText) {
        this.FullText = FullText;
    }

    /**
     * Get Key-value index configuration. If empty, key-value indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeyValue Key-value index configuration. If empty, key-value indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RuleKeyValueInfo getKeyValue() {
        return this.KeyValue;
    }

    /**
     * Set Key-value index configuration. If empty, key-value indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeyValue Key-value index configuration. If empty, key-value indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyValue(RuleKeyValueInfo KeyValue) {
        this.KeyValue = KeyValue;
    }

    /**
     * Get Metadata field index configuration. If empty, metadata field indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tag Metadata field index configuration. If empty, metadata field indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RuleTagInfo getTag() {
        return this.Tag;
    }

    /**
     * Set Metadata field index configuration. If empty, metadata field indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tag Metadata field index configuration. If empty, metadata field indexing is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTag(RuleTagInfo Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Key-value index automatic configuration. If empty, the feature is not enabled.Once enabled, fields within logs are automatically added to the key-value index, including fields added to logs subsequently.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DynamicIndex Key-value index automatic configuration. If empty, the feature is not enabled.Once enabled, fields within logs are automatically added to the key-value index, including fields added to logs subsequently.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DynamicIndex getDynamicIndex() {
        return this.DynamicIndex;
    }

    /**
     * Set Key-value index automatic configuration. If empty, the feature is not enabled.Once enabled, fields within logs are automatically added to the key-value index, including fields added to logs subsequently.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DynamicIndex Key-value index automatic configuration. If empty, the feature is not enabled.Once enabled, fields within logs are automatically added to the key-value index, including fields added to logs subsequently.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDynamicIndex(DynamicIndex DynamicIndex) {
        this.DynamicIndex = DynamicIndex;
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
            this.KeyValue = new RuleKeyValueInfo(source.KeyValue);
        }
        if (source.Tag != null) {
            this.Tag = new RuleTagInfo(source.Tag);
        }
        if (source.DynamicIndex != null) {
            this.DynamicIndex = new DynamicIndex(source.DynamicIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FullText.", this.FullText);
        this.setParamObj(map, prefix + "KeyValue.", this.KeyValue);
        this.setParamObj(map, prefix + "Tag.", this.Tag);
        this.setParamObj(map, prefix + "DynamicIndex.", this.DynamicIndex);

    }
}

