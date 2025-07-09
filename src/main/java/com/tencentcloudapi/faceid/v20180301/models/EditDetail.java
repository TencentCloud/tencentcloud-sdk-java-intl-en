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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditDetail extends AbstractModel {

    /**
    * Modified Field Name
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * Value of the field before modification, the original OCR result
    */
    @SerializedName("OriginalFieldValue")
    @Expose
    private String OriginalFieldValue;

    /**
    * Value of the field after modification,the user's manually entered result
    */
    @SerializedName("RevisedFieldValue")
    @Expose
    private String RevisedFieldValue;

    /**
     * Get Modified Field Name 
     * @return FieldName Modified Field Name
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set Modified Field Name
     * @param FieldName Modified Field Name
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get Value of the field before modification, the original OCR result 
     * @return OriginalFieldValue Value of the field before modification, the original OCR result
     */
    public String getOriginalFieldValue() {
        return this.OriginalFieldValue;
    }

    /**
     * Set Value of the field before modification, the original OCR result
     * @param OriginalFieldValue Value of the field before modification, the original OCR result
     */
    public void setOriginalFieldValue(String OriginalFieldValue) {
        this.OriginalFieldValue = OriginalFieldValue;
    }

    /**
     * Get Value of the field after modification,the user's manually entered result 
     * @return RevisedFieldValue Value of the field after modification,the user's manually entered result
     */
    public String getRevisedFieldValue() {
        return this.RevisedFieldValue;
    }

    /**
     * Set Value of the field after modification,the user's manually entered result
     * @param RevisedFieldValue Value of the field after modification,the user's manually entered result
     */
    public void setRevisedFieldValue(String RevisedFieldValue) {
        this.RevisedFieldValue = RevisedFieldValue;
    }

    public EditDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditDetail(EditDetail source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.OriginalFieldValue != null) {
            this.OriginalFieldValue = new String(source.OriginalFieldValue);
        }
        if (source.RevisedFieldValue != null) {
            this.RevisedFieldValue = new String(source.RevisedFieldValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "OriginalFieldValue", this.OriginalFieldValue);
        this.setParamSimple(map, prefix + "RevisedFieldValue", this.RevisedFieldValue);

    }
}

