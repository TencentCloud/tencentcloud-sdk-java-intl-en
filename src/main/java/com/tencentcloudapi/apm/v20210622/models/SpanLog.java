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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpanLog extends AbstractModel {

    /**
    * Log timestamp.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Tag.
    */
    @SerializedName("Fields")
    @Expose
    private SpanTag [] Fields;

    /**
     * Get Log timestamp. 
     * @return Timestamp Log timestamp.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Log timestamp.
     * @param Timestamp Log timestamp.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Tag. 
     * @return Fields Tag.
     */
    public SpanTag [] getFields() {
        return this.Fields;
    }

    /**
     * Set Tag.
     * @param Fields Tag.
     */
    public void setFields(SpanTag [] Fields) {
        this.Fields = Fields;
    }

    public SpanLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpanLog(SpanLog source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Fields != null) {
            this.Fields = new SpanTag[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new SpanTag(source.Fields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);

    }
}

