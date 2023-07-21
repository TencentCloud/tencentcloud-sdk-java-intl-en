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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaConsumerContent extends AbstractModel{

    /**
    * Format. Valid values: 0 (full-text) and 1 (JSON).
    */
    @SerializedName("Format")
    @Expose
    private Long Format;

    /**
    * Whether to ship tag information
This parameter does not need to be set when `Format` is set to `0`.
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * Metadata information list. Valid values: \_\_SOURCE\_\_, \_\_FILENAME\_\_,
\_\_TIMESTAMP\_\_, \_\_HOSTNAME\_\_, and \_\_PKGID\_\_.
This parameter does not need to be set when `Format` is set to `0`.
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
    * Tag data processing mode. Valid values:
1 (default): Do not tile data.
2: Tile data.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagTransaction")
    @Expose
    private Long TagTransaction;

    /**
    * JSON data format. Valid values:
1 (default): Not escaped.
2: Escaped.
    */
    @SerializedName("JsonType")
    @Expose
    private Long JsonType;

    /**
     * Get Format. Valid values: 0 (full-text) and 1 (JSON). 
     * @return Format Format. Valid values: 0 (full-text) and 1 (JSON).
     */
    public Long getFormat() {
        return this.Format;
    }

    /**
     * Set Format. Valid values: 0 (full-text) and 1 (JSON).
     * @param Format Format. Valid values: 0 (full-text) and 1 (JSON).
     */
    public void setFormat(Long Format) {
        this.Format = Format;
    }

    /**
     * Get Whether to ship tag information
This parameter does not need to be set when `Format` is set to `0`. 
     * @return EnableTag Whether to ship tag information
This parameter does not need to be set when `Format` is set to `0`.
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set Whether to ship tag information
This parameter does not need to be set when `Format` is set to `0`.
     * @param EnableTag Whether to ship tag information
This parameter does not need to be set when `Format` is set to `0`.
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get Metadata information list. Valid values: \_\_SOURCE\_\_, \_\_FILENAME\_\_,
\_\_TIMESTAMP\_\_, \_\_HOSTNAME\_\_, and \_\_PKGID\_\_.
This parameter does not need to be set when `Format` is set to `0`. 
     * @return MetaFields Metadata information list. Valid values: \_\_SOURCE\_\_, \_\_FILENAME\_\_,
\_\_TIMESTAMP\_\_, \_\_HOSTNAME\_\_, and \_\_PKGID\_\_.
This parameter does not need to be set when `Format` is set to `0`.
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set Metadata information list. Valid values: \_\_SOURCE\_\_, \_\_FILENAME\_\_,
\_\_TIMESTAMP\_\_, \_\_HOSTNAME\_\_, and \_\_PKGID\_\_.
This parameter does not need to be set when `Format` is set to `0`.
     * @param MetaFields Metadata information list. Valid values: \_\_SOURCE\_\_, \_\_FILENAME\_\_,
\_\_TIMESTAMP\_\_, \_\_HOSTNAME\_\_, and \_\_PKGID\_\_.
This parameter does not need to be set when `Format` is set to `0`.
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    /**
     * Get Tag data processing mode. Valid values:
1 (default): Do not tile data.
2: Tile data.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagTransaction Tag data processing mode. Valid values:
1 (default): Do not tile data.
2: Tile data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTagTransaction() {
        return this.TagTransaction;
    }

    /**
     * Set Tag data processing mode. Valid values:
1 (default): Do not tile data.
2: Tile data.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagTransaction Tag data processing mode. Valid values:
1 (default): Do not tile data.
2: Tile data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagTransaction(Long TagTransaction) {
        this.TagTransaction = TagTransaction;
    }

    /**
     * Get JSON data format. Valid values:
1 (default): Not escaped.
2: Escaped. 
     * @return JsonType JSON data format. Valid values:
1 (default): Not escaped.
2: Escaped.
     */
    public Long getJsonType() {
        return this.JsonType;
    }

    /**
     * Set JSON data format. Valid values:
1 (default): Not escaped.
2: Escaped.
     * @param JsonType JSON data format. Valid values:
1 (default): Not escaped.
2: Escaped.
     */
    public void setJsonType(Long JsonType) {
        this.JsonType = JsonType;
    }

    public KafkaConsumerContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaConsumerContent(KafkaConsumerContent source) {
        if (source.Format != null) {
            this.Format = new Long(source.Format);
        }
        if (source.EnableTag != null) {
            this.EnableTag = new Boolean(source.EnableTag);
        }
        if (source.MetaFields != null) {
            this.MetaFields = new String[source.MetaFields.length];
            for (int i = 0; i < source.MetaFields.length; i++) {
                this.MetaFields[i] = new String(source.MetaFields[i]);
            }
        }
        if (source.TagTransaction != null) {
            this.TagTransaction = new Long(source.TagTransaction);
        }
        if (source.JsonType != null) {
            this.JsonType = new Long(source.JsonType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "EnableTag", this.EnableTag);
        this.setParamArraySimple(map, prefix + "MetaFields.", this.MetaFields);
        this.setParamSimple(map, prefix + "TagTransaction", this.TagTransaction);
        this.setParamSimple(map, prefix + "JsonType", this.JsonType);

    }
}

