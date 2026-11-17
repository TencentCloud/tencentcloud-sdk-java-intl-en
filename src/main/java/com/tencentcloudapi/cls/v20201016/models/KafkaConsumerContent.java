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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaConsumerContent extends AbstractModel {

    /**
    * <p>Consumption data format. 0: Raw content; 1: JSON.</p>
    */
    @SerializedName("Format")
    @Expose
    private Long Format;

    /**
    * <p>Whether to deliver TAG information<br>When Format is 0, this field does not need to be assigned a value</p>
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * <p>Metadata information list. Valid values: __SOURCE__, __FILENAME__<br>, __TIMESTAMP__, __HOSTNAME__, __PKGID__<br>When Format is 0, this field does not need to be assigned a value</p>
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
    * <p>Tag data processing method. 1: Not flattened (default); 2: Flattened.</p><p>Not flattened example:<br>TAG information: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>Not flattened: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>Flattened example:<br>TAG information: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>Flattened: <code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
    */
    @SerializedName("TagTransaction")
    @Expose
    private Long TagTransaction;

    /**
    * <p>Consumption data Json format:<br>1: Not escaped (default format)<br>2: Escaped</p><p>Delivery Json format.<br>When JsonType is 1: Consistent with the original log, not escaped. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Delivered to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></p><p>When JsonType is 2: Escaped. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Delivered to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></p>
    */
    @SerializedName("JsonType")
    @Expose
    private Long JsonType;

    /**
    * <p>Switch for automatic conversion of numeric types</p><p>Valid values:</p><ul><li>true: Numeric strings (such as &quot;123&quot;) in the first-level values of the JSON structure are automatically converted to numeric types (int/float).</li><li>false: Numeric strings (such as &quot;123&quot;) in the first-level values of the JSON structure remain strings.</li></ul><p>Default value: false</p>
    */
    @SerializedName("AutoConvertNumber")
    @Expose
    private Boolean AutoConvertNumber;

    /**
     * Get <p>Consumption data format. 0: Raw content; 1: JSON.</p> 
     * @return Format <p>Consumption data format. 0: Raw content; 1: JSON.</p>
     */
    public Long getFormat() {
        return this.Format;
    }

    /**
     * Set <p>Consumption data format. 0: Raw content; 1: JSON.</p>
     * @param Format <p>Consumption data format. 0: Raw content; 1: JSON.</p>
     */
    public void setFormat(Long Format) {
        this.Format = Format;
    }

    /**
     * Get <p>Whether to deliver TAG information<br>When Format is 0, this field does not need to be assigned a value</p> 
     * @return EnableTag <p>Whether to deliver TAG information<br>When Format is 0, this field does not need to be assigned a value</p>
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set <p>Whether to deliver TAG information<br>When Format is 0, this field does not need to be assigned a value</p>
     * @param EnableTag <p>Whether to deliver TAG information<br>When Format is 0, this field does not need to be assigned a value</p>
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get <p>Metadata information list. Valid values: __SOURCE__, __FILENAME__<br>, __TIMESTAMP__, __HOSTNAME__, __PKGID__<br>When Format is 0, this field does not need to be assigned a value</p> 
     * @return MetaFields <p>Metadata information list. Valid values: __SOURCE__, __FILENAME__<br>, __TIMESTAMP__, __HOSTNAME__, __PKGID__<br>When Format is 0, this field does not need to be assigned a value</p>
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set <p>Metadata information list. Valid values: __SOURCE__, __FILENAME__<br>, __TIMESTAMP__, __HOSTNAME__, __PKGID__<br>When Format is 0, this field does not need to be assigned a value</p>
     * @param MetaFields <p>Metadata information list. Valid values: __SOURCE__, __FILENAME__<br>, __TIMESTAMP__, __HOSTNAME__, __PKGID__<br>When Format is 0, this field does not need to be assigned a value</p>
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    /**
     * Get <p>Tag data processing method. 1: Not flattened (default); 2: Flattened.</p><p>Not flattened example:<br>TAG information: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>Not flattened: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>Flattened example:<br>TAG information: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>Flattened: <code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p> 
     * @return TagTransaction <p>Tag data processing method. 1: Not flattened (default); 2: Flattened.</p><p>Not flattened example:<br>TAG information: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>Not flattened: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>Flattened example:<br>TAG information: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>Flattened: <code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
     */
    public Long getTagTransaction() {
        return this.TagTransaction;
    }

    /**
     * Set <p>Tag data processing method. 1: Not flattened (default); 2: Flattened.</p><p>Not flattened example:<br>TAG information: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>Not flattened: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>Flattened example:<br>TAG information: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>Flattened: <code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
     * @param TagTransaction <p>Tag data processing method. 1: Not flattened (default); 2: Flattened.</p><p>Not flattened example:<br>TAG information: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>Not flattened: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code></p><p>Flattened example:<br>TAG information: <code>{&quot;__TAG__&quot;:{&quot;fieldA&quot;:200,&quot;fieldB&quot;:&quot;text&quot;}}</code><br>Flattened: <code>{&quot;__TAG__.fieldA&quot;:200,&quot;__TAG__.fieldB&quot;:&quot;text&quot;}</code></p>
     */
    public void setTagTransaction(Long TagTransaction) {
        this.TagTransaction = TagTransaction;
    }

    /**
     * Get <p>Consumption data Json format:<br>1: Not escaped (default format)<br>2: Escaped</p><p>Delivery Json format.<br>When JsonType is 1: Consistent with the original log, not escaped. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Delivered to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></p><p>When JsonType is 2: Escaped. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Delivered to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></p> 
     * @return JsonType <p>Consumption data Json format:<br>1: Not escaped (default format)<br>2: Escaped</p><p>Delivery Json format.<br>When JsonType is 1: Consistent with the original log, not escaped. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Delivered to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></p><p>When JsonType is 2: Escaped. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Delivered to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></p>
     */
    public Long getJsonType() {
        return this.JsonType;
    }

    /**
     * Set <p>Consumption data Json format:<br>1: Not escaped (default format)<br>2: Escaped</p><p>Delivery Json format.<br>When JsonType is 1: Consistent with the original log, not escaped. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Delivered to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></p><p>When JsonType is 2: Escaped. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Delivered to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></p>
     * @param JsonType <p>Consumption data Json format:<br>1: Not escaped (default format)<br>2: Escaped</p><p>Delivery Json format.<br>When JsonType is 1: Consistent with the original log, not escaped. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Delivered to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></p><p>When JsonType is 2: Escaped. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Delivered to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></p>
     */
    public void setJsonType(Long JsonType) {
        this.JsonType = JsonType;
    }

    /**
     * Get <p>Switch for automatic conversion of numeric types</p><p>Valid values:</p><ul><li>true: Numeric strings (such as &quot;123&quot;) in the first-level values of the JSON structure are automatically converted to numeric types (int/float).</li><li>false: Numeric strings (such as &quot;123&quot;) in the first-level values of the JSON structure remain strings.</li></ul><p>Default value: false</p> 
     * @return AutoConvertNumber <p>Switch for automatic conversion of numeric types</p><p>Valid values:</p><ul><li>true: Numeric strings (such as &quot;123&quot;) in the first-level values of the JSON structure are automatically converted to numeric types (int/float).</li><li>false: Numeric strings (such as &quot;123&quot;) in the first-level values of the JSON structure remain strings.</li></ul><p>Default value: false</p>
     */
    public Boolean getAutoConvertNumber() {
        return this.AutoConvertNumber;
    }

    /**
     * Set <p>Switch for automatic conversion of numeric types</p><p>Valid values:</p><ul><li>true: Numeric strings (such as &quot;123&quot;) in the first-level values of the JSON structure are automatically converted to numeric types (int/float).</li><li>false: Numeric strings (such as &quot;123&quot;) in the first-level values of the JSON structure remain strings.</li></ul><p>Default value: false</p>
     * @param AutoConvertNumber <p>Switch for automatic conversion of numeric types</p><p>Valid values:</p><ul><li>true: Numeric strings (such as &quot;123&quot;) in the first-level values of the JSON structure are automatically converted to numeric types (int/float).</li><li>false: Numeric strings (such as &quot;123&quot;) in the first-level values of the JSON structure remain strings.</li></ul><p>Default value: false</p>
     */
    public void setAutoConvertNumber(Boolean AutoConvertNumber) {
        this.AutoConvertNumber = AutoConvertNumber;
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
        if (source.AutoConvertNumber != null) {
            this.AutoConvertNumber = new Boolean(source.AutoConvertNumber);
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
        this.setParamSimple(map, prefix + "AutoConvertNumber", this.AutoConvertNumber);

    }
}

