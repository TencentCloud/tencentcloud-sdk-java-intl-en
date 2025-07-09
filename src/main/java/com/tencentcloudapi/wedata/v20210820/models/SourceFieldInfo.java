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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceFieldInfo extends AbstractModel {

    /**
    * Field Name
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * Field Type
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * Field Alias
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Field Name 
     * @return FieldName Field Name
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set Field Name
     * @param FieldName Field Name
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get Field Type 
     * @return FieldType Field Type
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set Field Type
     * @param FieldType Field Type
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get Field Alias 
     * @return Alias Field Alias
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Field Alias
     * @param Alias Field Alias
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Field DescriptionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Comment Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     * @param Comment Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public SourceFieldInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceFieldInfo(SourceFieldInfo source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.FieldType != null) {
            this.FieldType = new String(source.FieldType);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

