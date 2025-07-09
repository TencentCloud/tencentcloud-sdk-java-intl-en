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
    * Whether to deliver TAG information.
When EnableTag is true, it indicates the delivery of TAG metadata.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * List of metadata to ship. Supported metadata types: \_\_SOURCE\_\_, \_\_FILENAME\_\_, \_\_TIMESTAMP\_\_, \_\_HOSTNAME\_\_, and \_\_PKGID\_\_.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
    * When EnableTag is true, the TagJsonNotTiled field must be filled.TagJsonNotTiled is used to indicate whether tag information is JSON flattened.When TagJsonNotTiled is true, it is not flattened. Example:TAG information: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`
Untiled: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`When TagJsonNotTiled is false, the data is tiled. Example:TAG information: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`Tiled: `{"__TAG__.fieldA":200,"__TAG__.fieldB":"text"}`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagJsonNotTiled")
    @Expose
    private Boolean TagJsonNotTiled;

    /**
    * Delivery timestamp precision, optional [1: second; 2: millisecond], default is 1.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimestampAccuracy")
    @Expose
    private Long TimestampAccuracy;

    /**
    * Deliver in JSON format.JsonType is 0: Consistent with the original log, no escape. Example:
Original log: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`Deliver to CKafka: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`JsonType is 1: Escaped. Example:Original log: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`Delivered to CKafka: `{"a":"aa","b":"{\"b1\":\"b1b1\", \"c1\":\"c1c1\"}"}`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JsonType")
    @Expose
    private Long JsonType;

    /**
     * Get Whether to deliver TAG information.
When EnableTag is true, it indicates the delivery of TAG metadata.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableTag Whether to deliver TAG information.
When EnableTag is true, it indicates the delivery of TAG metadata.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set Whether to deliver TAG information.
When EnableTag is true, it indicates the delivery of TAG metadata.Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableTag Whether to deliver TAG information.
When EnableTag is true, it indicates the delivery of TAG metadata.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get List of metadata to ship. Supported metadata types: \_\_SOURCE\_\_, \_\_FILENAME\_\_, \_\_TIMESTAMP\_\_, \_\_HOSTNAME\_\_, and \_\_PKGID\_\_.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetaFields List of metadata to ship. Supported metadata types: \_\_SOURCE\_\_, \_\_FILENAME\_\_, \_\_TIMESTAMP\_\_, \_\_HOSTNAME\_\_, and \_\_PKGID\_\_.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set List of metadata to ship. Supported metadata types: \_\_SOURCE\_\_, \_\_FILENAME\_\_, \_\_TIMESTAMP\_\_, \_\_HOSTNAME\_\_, and \_\_PKGID\_\_.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetaFields List of metadata to ship. Supported metadata types: \_\_SOURCE\_\_, \_\_FILENAME\_\_, \_\_TIMESTAMP\_\_, \_\_HOSTNAME\_\_, and \_\_PKGID\_\_.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    /**
     * Get When EnableTag is true, the TagJsonNotTiled field must be filled.TagJsonNotTiled is used to indicate whether tag information is JSON flattened.When TagJsonNotTiled is true, it is not flattened. Example:TAG information: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`
Untiled: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`When TagJsonNotTiled is false, the data is tiled. Example:TAG information: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`Tiled: `{"__TAG__.fieldA":200,"__TAG__.fieldB":"text"}`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagJsonNotTiled When EnableTag is true, the TagJsonNotTiled field must be filled.TagJsonNotTiled is used to indicate whether tag information is JSON flattened.When TagJsonNotTiled is true, it is not flattened. Example:TAG information: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`
Untiled: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`When TagJsonNotTiled is false, the data is tiled. Example:TAG information: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`Tiled: `{"__TAG__.fieldA":200,"__TAG__.fieldB":"text"}`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTagJsonNotTiled() {
        return this.TagJsonNotTiled;
    }

    /**
     * Set When EnableTag is true, the TagJsonNotTiled field must be filled.TagJsonNotTiled is used to indicate whether tag information is JSON flattened.When TagJsonNotTiled is true, it is not flattened. Example:TAG information: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`
Untiled: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`When TagJsonNotTiled is false, the data is tiled. Example:TAG information: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`Tiled: `{"__TAG__.fieldA":200,"__TAG__.fieldB":"text"}`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagJsonNotTiled When EnableTag is true, the TagJsonNotTiled field must be filled.TagJsonNotTiled is used to indicate whether tag information is JSON flattened.When TagJsonNotTiled is true, it is not flattened. Example:TAG information: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`
Untiled: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`When TagJsonNotTiled is false, the data is tiled. Example:TAG information: `{"__TAG__":{"fieldA":200,"fieldB":"text"}}`Tiled: `{"__TAG__.fieldA":200,"__TAG__.fieldB":"text"}`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagJsonNotTiled(Boolean TagJsonNotTiled) {
        this.TagJsonNotTiled = TagJsonNotTiled;
    }

    /**
     * Get Delivery timestamp precision, optional [1: second; 2: millisecond], default is 1.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimestampAccuracy Delivery timestamp precision, optional [1: second; 2: millisecond], default is 1.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimestampAccuracy() {
        return this.TimestampAccuracy;
    }

    /**
     * Set Delivery timestamp precision, optional [1: second; 2: millisecond], default is 1.Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimestampAccuracy Delivery timestamp precision, optional [1: second; 2: millisecond], default is 1.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimestampAccuracy(Long TimestampAccuracy) {
        this.TimestampAccuracy = TimestampAccuracy;
    }

    /**
     * Get Deliver in JSON format.JsonType is 0: Consistent with the original log, no escape. Example:
Original log: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`Deliver to CKafka: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`JsonType is 1: Escaped. Example:Original log: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`Delivered to CKafka: `{"a":"aa","b":"{\"b1\":\"b1b1\", \"c1\":\"c1c1\"}"}`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JsonType Deliver in JSON format.JsonType is 0: Consistent with the original log, no escape. Example:
Original log: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`Deliver to CKafka: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`JsonType is 1: Escaped. Example:Original log: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`Delivered to CKafka: `{"a":"aa","b":"{\"b1\":\"b1b1\", \"c1\":\"c1c1\"}"}`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getJsonType() {
        return this.JsonType;
    }

    /**
     * Set Deliver in JSON format.JsonType is 0: Consistent with the original log, no escape. Example:
Original log: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`Deliver to CKafka: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`JsonType is 1: Escaped. Example:Original log: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`Delivered to CKafka: `{"a":"aa","b":"{\"b1\":\"b1b1\", \"c1\":\"c1c1\"}"}`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JsonType Deliver in JSON format.JsonType is 0: Consistent with the original log, no escape. Example:
Original log: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`Deliver to CKafka: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`JsonType is 1: Escaped. Example:Original log: `{"a":"aa", "b":{"b1":"b1b1", "c1":"c1c1"}}`Delivered to CKafka: `{"a":"aa","b":"{\"b1\":\"b1b1\", \"c1\":\"c1c1\"}"}`
Note: This field may return null, indicating that no valid values can be obtained.
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

