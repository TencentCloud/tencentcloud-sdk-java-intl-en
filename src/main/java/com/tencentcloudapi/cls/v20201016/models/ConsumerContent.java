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

public class ConsumerContent extends AbstractModel{

    /**
    * Whether to ship tag information
Note: This field may return `null`, indicating that no valid value was found.
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
    * This parameter is required if `EnableTag` is `true`, and is used to specify whether the tag information is JSON tiled. Valid values: `true` (not tiled); `false` (tiled)
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TagJsonNotTiled")
    @Expose
    private Boolean TagJsonNotTiled;

    /**
    * Shipping timestamp precision in seconds (default) or milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimestampAccuracy")
    @Expose
    private Long TimestampAccuracy;

    /**
     * Get Whether to ship tag information
Note: This field may return `null`, indicating that no valid value was found. 
     * @return EnableTag Whether to ship tag information
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set Whether to ship tag information
Note: This field may return `null`, indicating that no valid value was found.
     * @param EnableTag Whether to ship tag information
Note: This field may return `null`, indicating that no valid value was found.
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
     * Get This parameter is required if `EnableTag` is `true`, and is used to specify whether the tag information is JSON tiled. Valid values: `true` (not tiled); `false` (tiled)
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TagJsonNotTiled This parameter is required if `EnableTag` is `true`, and is used to specify whether the tag information is JSON tiled. Valid values: `true` (not tiled); `false` (tiled)
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Boolean getTagJsonNotTiled() {
        return this.TagJsonNotTiled;
    }

    /**
     * Set This parameter is required if `EnableTag` is `true`, and is used to specify whether the tag information is JSON tiled. Valid values: `true` (not tiled); `false` (tiled)
Note: This field may return `null`, indicating that no valid value was found.
     * @param TagJsonNotTiled This parameter is required if `EnableTag` is `true`, and is used to specify whether the tag information is JSON tiled. Valid values: `true` (not tiled); `false` (tiled)
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTagJsonNotTiled(Boolean TagJsonNotTiled) {
        this.TagJsonNotTiled = TagJsonNotTiled;
    }

    /**
     * Get Shipping timestamp precision in seconds (default) or milliseconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimestampAccuracy Shipping timestamp precision in seconds (default) or milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimestampAccuracy() {
        return this.TimestampAccuracy;
    }

    /**
     * Set Shipping timestamp precision in seconds (default) or milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimestampAccuracy Shipping timestamp precision in seconds (default) or milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimestampAccuracy(Long TimestampAccuracy) {
        this.TimestampAccuracy = TimestampAccuracy;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableTag", this.EnableTag);
        this.setParamArraySimple(map, prefix + "MetaFields.", this.MetaFields);
        this.setParamSimple(map, prefix + "TagJsonNotTiled", this.TagJsonNotTiled);
        this.setParamSimple(map, prefix + "TimestampAccuracy", this.TimestampAccuracy);

    }
}

