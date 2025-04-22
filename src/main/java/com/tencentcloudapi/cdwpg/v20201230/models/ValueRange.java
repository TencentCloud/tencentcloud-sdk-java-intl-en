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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueRange extends AbstractModel {

    /**
    * Parameter types. Valid values: enum, string, and section. Enum indicates enumeration, namely utf8, latin1, gbk. String indicates that the returned parameter value is a string. Section indicates that the returned parameter value is a value range, for example, 4-8.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Response parameter when the type is a section.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Range")
    @Expose
    private Range Range;

    /**
    * Response parameter when the type is an enum.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enum")
    @Expose
    private String [] Enum;

    /**
    * Response parameter when the type is a string.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("String")
    @Expose
    private String String;

    /**
     * Get Parameter types. Valid values: enum, string, and section. Enum indicates enumeration, namely utf8, latin1, gbk. String indicates that the returned parameter value is a string. Section indicates that the returned parameter value is a value range, for example, 4-8.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Parameter types. Valid values: enum, string, and section. Enum indicates enumeration, namely utf8, latin1, gbk. String indicates that the returned parameter value is a string. Section indicates that the returned parameter value is a value range, for example, 4-8.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Parameter types. Valid values: enum, string, and section. Enum indicates enumeration, namely utf8, latin1, gbk. String indicates that the returned parameter value is a string. Section indicates that the returned parameter value is a value range, for example, 4-8.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Parameter types. Valid values: enum, string, and section. Enum indicates enumeration, namely utf8, latin1, gbk. String indicates that the returned parameter value is a string. Section indicates that the returned parameter value is a value range, for example, 4-8.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Response parameter when the type is a section.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Range Response parameter when the type is a section.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Range getRange() {
        return this.Range;
    }

    /**
     * Set Response parameter when the type is a section.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Range Response parameter when the type is a section.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRange(Range Range) {
        this.Range = Range;
    }

    /**
     * Get Response parameter when the type is an enum.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enum Response parameter when the type is an enum.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getEnum() {
        return this.Enum;
    }

    /**
     * Set Response parameter when the type is an enum.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enum Response parameter when the type is an enum.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnum(String [] Enum) {
        this.Enum = Enum;
    }

    /**
     * Get Response parameter when the type is a string.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return String Response parameter when the type is a string.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getString() {
        return this.String;
    }

    /**
     * Set Response parameter when the type is a string.Note: This field may return null, indicating that no valid values can be obtained.
     * @param String Response parameter when the type is a string.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setString(String String) {
        this.String = String;
    }

    public ValueRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueRange(ValueRange source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Range != null) {
            this.Range = new Range(source.Range);
        }
        if (source.Enum != null) {
            this.Enum = new String[source.Enum.length];
            for (int i = 0; i < source.Enum.length; i++) {
                this.Enum[i] = new String(source.Enum[i]);
            }
        }
        if (source.String != null) {
            this.String = new String(source.String);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Range.", this.Range);
        this.setParamArraySimple(map, prefix + "Enum.", this.Enum);
        this.setParamSimple(map, prefix + "String", this.String);

    }
}

