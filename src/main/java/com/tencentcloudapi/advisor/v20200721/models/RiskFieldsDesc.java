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
package com.tencentcloudapi.advisor.v20200721.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskFieldsDesc extends AbstractModel {

    /**
    * Field ID
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * Field name
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * Field type, 
string: String type, such as "aa"
int: Integer, for example, 111
stringSlice : String array type, such as ["a", "b"]
tags: Tag type, for example: [{"Key":"kkk","Value":"vvv"},{"Key":"kkk2","Value":"vvv2"}]
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * Dictionary corresponding to the field value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FieldDict")
    @Expose
    private KeyValue [] FieldDict;

    /**
     * Get Field ID 
     * @return Field Field ID
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set Field ID
     * @param Field Field ID
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get Field name 
     * @return FieldName Field name
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set Field name
     * @param FieldName Field name
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get Field type, 
string: String type, such as "aa"
int: Integer, for example, 111
stringSlice : String array type, such as ["a", "b"]
tags: Tag type, for example: [{"Key":"kkk","Value":"vvv"},{"Key":"kkk2","Value":"vvv2"}] 
     * @return FieldType Field type, 
string: String type, such as "aa"
int: Integer, for example, 111
stringSlice : String array type, such as ["a", "b"]
tags: Tag type, for example: [{"Key":"kkk","Value":"vvv"},{"Key":"kkk2","Value":"vvv2"}]
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set Field type, 
string: String type, such as "aa"
int: Integer, for example, 111
stringSlice : String array type, such as ["a", "b"]
tags: Tag type, for example: [{"Key":"kkk","Value":"vvv"},{"Key":"kkk2","Value":"vvv2"}]
     * @param FieldType Field type, 
string: String type, such as "aa"
int: Integer, for example, 111
stringSlice : String array type, such as ["a", "b"]
tags: Tag type, for example: [{"Key":"kkk","Value":"vvv"},{"Key":"kkk2","Value":"vvv2"}]
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get Dictionary corresponding to the field value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FieldDict Dictionary corresponding to the field value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KeyValue [] getFieldDict() {
        return this.FieldDict;
    }

    /**
     * Set Dictionary corresponding to the field value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FieldDict Dictionary corresponding to the field value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFieldDict(KeyValue [] FieldDict) {
        this.FieldDict = FieldDict;
    }

    public RiskFieldsDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskFieldsDesc(RiskFieldsDesc source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.FieldType != null) {
            this.FieldType = new String(source.FieldType);
        }
        if (source.FieldDict != null) {
            this.FieldDict = new KeyValue[source.FieldDict.length];
            for (int i = 0; i < source.FieldDict.length; i++) {
                this.FieldDict[i] = new KeyValue(source.FieldDict[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamArrayObj(map, prefix + "FieldDict.", this.FieldDict);

    }
}

