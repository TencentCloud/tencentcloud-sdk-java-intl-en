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

public class ConsumerContent extends AbstractModel {

    /**
    * <p>Whether to deliver TAG information.<br>When EnableTag is true, it means to deliver TAG metadata.</p>
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * <p>List of metadata to be shipped, currently only support: __SOURCE__, __FILENAME__, __TIMESTAMP__, __HOSTNAME__, and __PKGID__</p>
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
    * <p>When EnableTag is true, the TagJsonNotTiled field must be filled.<br>TagJsonNotTiled indicates whether tag information is json tiled.</p><p>When TagJsonNotTiled is true, it is not tiled. Example:<br>tag information: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code><br>Not Tiled: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code></p><p>When TagJsonNotTiled is false, tiling is applied. Example:<br>tag information: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code><br>Tiled: <code>{"__tag__.fieldA":200,"__tag__.fieldB":"text"}</code></p>
    */
    @SerializedName("TagJsonNotTiled")
    @Expose
    private Boolean TagJsonNotTiled;

    /**
    * <p>Delivery timestamp precision, options [1: second; 2: millisecond], 1 is selected by default.</p>
    */
    @SerializedName("TimestampAccuracy")
    @Expose
    private Long TimestampAccuracy;

    /**
    * <p>Deliver in Json format.</p><p>Enumeration value:</p><ul><li>0: Escape. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Deliver to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></li><li>1: Consistent with original log, non-escaping. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Deliver to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></li></ul>
    */
    @SerializedName("JsonType")
    @Expose
    private Long JsonType;

    /**
     * Get <p>Whether to deliver TAG information.<br>When EnableTag is true, it means to deliver TAG metadata.</p> 
     * @return EnableTag <p>Whether to deliver TAG information.<br>When EnableTag is true, it means to deliver TAG metadata.</p>
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set <p>Whether to deliver TAG information.<br>When EnableTag is true, it means to deliver TAG metadata.</p>
     * @param EnableTag <p>Whether to deliver TAG information.<br>When EnableTag is true, it means to deliver TAG metadata.</p>
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get <p>List of metadata to be shipped, currently only support: __SOURCE__, __FILENAME__, __TIMESTAMP__, __HOSTNAME__, and __PKGID__</p> 
     * @return MetaFields <p>List of metadata to be shipped, currently only support: __SOURCE__, __FILENAME__, __TIMESTAMP__, __HOSTNAME__, and __PKGID__</p>
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set <p>List of metadata to be shipped, currently only support: __SOURCE__, __FILENAME__, __TIMESTAMP__, __HOSTNAME__, and __PKGID__</p>
     * @param MetaFields <p>List of metadata to be shipped, currently only support: __SOURCE__, __FILENAME__, __TIMESTAMP__, __HOSTNAME__, and __PKGID__</p>
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    /**
     * Get <p>When EnableTag is true, the TagJsonNotTiled field must be filled.<br>TagJsonNotTiled indicates whether tag information is json tiled.</p><p>When TagJsonNotTiled is true, it is not tiled. Example:<br>tag information: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code><br>Not Tiled: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code></p><p>When TagJsonNotTiled is false, tiling is applied. Example:<br>tag information: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code><br>Tiled: <code>{"__tag__.fieldA":200,"__tag__.fieldB":"text"}</code></p> 
     * @return TagJsonNotTiled <p>When EnableTag is true, the TagJsonNotTiled field must be filled.<br>TagJsonNotTiled indicates whether tag information is json tiled.</p><p>When TagJsonNotTiled is true, it is not tiled. Example:<br>tag information: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code><br>Not Tiled: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code></p><p>When TagJsonNotTiled is false, tiling is applied. Example:<br>tag information: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code><br>Tiled: <code>{"__tag__.fieldA":200,"__tag__.fieldB":"text"}</code></p>
     */
    public Boolean getTagJsonNotTiled() {
        return this.TagJsonNotTiled;
    }

    /**
     * Set <p>When EnableTag is true, the TagJsonNotTiled field must be filled.<br>TagJsonNotTiled indicates whether tag information is json tiled.</p><p>When TagJsonNotTiled is true, it is not tiled. Example:<br>tag information: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code><br>Not Tiled: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code></p><p>When TagJsonNotTiled is false, tiling is applied. Example:<br>tag information: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code><br>Tiled: <code>{"__tag__.fieldA":200,"__tag__.fieldB":"text"}</code></p>
     * @param TagJsonNotTiled <p>When EnableTag is true, the TagJsonNotTiled field must be filled.<br>TagJsonNotTiled indicates whether tag information is json tiled.</p><p>When TagJsonNotTiled is true, it is not tiled. Example:<br>tag information: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code><br>Not Tiled: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code></p><p>When TagJsonNotTiled is false, tiling is applied. Example:<br>tag information: <code>{"__tag__":{"fieldA":200,"fieldB":"text"}}</code><br>Tiled: <code>{"__tag__.fieldA":200,"__tag__.fieldB":"text"}</code></p>
     */
    public void setTagJsonNotTiled(Boolean TagJsonNotTiled) {
        this.TagJsonNotTiled = TagJsonNotTiled;
    }

    /**
     * Get <p>Delivery timestamp precision, options [1: second; 2: millisecond], 1 is selected by default.</p> 
     * @return TimestampAccuracy <p>Delivery timestamp precision, options [1: second; 2: millisecond], 1 is selected by default.</p>
     */
    public Long getTimestampAccuracy() {
        return this.TimestampAccuracy;
    }

    /**
     * Set <p>Delivery timestamp precision, options [1: second; 2: millisecond], 1 is selected by default.</p>
     * @param TimestampAccuracy <p>Delivery timestamp precision, options [1: second; 2: millisecond], 1 is selected by default.</p>
     */
    public void setTimestampAccuracy(Long TimestampAccuracy) {
        this.TimestampAccuracy = TimestampAccuracy;
    }

    /**
     * Get <p>Deliver in Json format.</p><p>Enumeration value:</p><ul><li>0: Escape. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Deliver to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></li><li>1: Consistent with original log, non-escaping. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Deliver to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></li></ul> 
     * @return JsonType <p>Deliver in Json format.</p><p>Enumeration value:</p><ul><li>0: Escape. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Deliver to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></li><li>1: Consistent with original log, non-escaping. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Deliver to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></li></ul>
     */
    public Long getJsonType() {
        return this.JsonType;
    }

    /**
     * Set <p>Deliver in Json format.</p><p>Enumeration value:</p><ul><li>0: Escape. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Deliver to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></li><li>1: Consistent with original log, non-escaping. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Deliver to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></li></ul>
     * @param JsonType <p>Deliver in Json format.</p><p>Enumeration value:</p><ul><li>0: Escape. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Deliver to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;,&quot;b&quot;:&quot;{\&quot;b1\&quot;:\&quot;b1b1\&quot;, \&quot;c1\&quot;:\&quot;c1c1\&quot;}&quot;}</code></li><li>1: Consistent with original log, non-escaping. Example:<br>Original log: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code><br>Deliver to Ckafka: <code>{&quot;a&quot;:&quot;aa&quot;, &quot;b&quot;:{&quot;b1&quot;:&quot;b1b1&quot;, &quot;c1&quot;:&quot;c1c1&quot;}}</code></li></ul>
     */
    public void setJsonType(Long JsonType) {
        this.JsonType = JsonType;
    }

    public ConsumerContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerContent(ConsumerContent source) {
        if (source.EnableTag != null) {
            this.EnableTag = new Boolean(source.EnableTag);
        }
        if (source.MetaFields != null) {
            this.MetaFields = new String[source.MetaFields.length];
            for (int i = 0; i < source.MetaFields.length; i++) {
                this.MetaFields[i] = new String(source.MetaFields[i]);
            }
        }
        if (source.TagJsonNotTiled != null) {
            this.TagJsonNotTiled = new Boolean(source.TagJsonNotTiled);
        }
        if (source.TimestampAccuracy != null) {
            this.TimestampAccuracy = new Long(source.TimestampAccuracy);
        }
        if (source.JsonType != null) {
            this.JsonType = new Long(source.JsonType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableTag", this.EnableTag);
        this.setParamArraySimple(map, prefix + "MetaFields.", this.MetaFields);
        this.setParamSimple(map, prefix + "TagJsonNotTiled", this.TagJsonNotTiled);
        this.setParamSimple(map, prefix + "TimestampAccuracy", this.TimestampAccuracy);
        this.setParamSimple(map, prefix + "JsonType", this.JsonType);

    }
}

