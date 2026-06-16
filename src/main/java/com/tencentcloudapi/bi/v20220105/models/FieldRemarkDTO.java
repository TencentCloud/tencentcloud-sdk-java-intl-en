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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FieldRemarkDTO extends AbstractModel {

    /**
    * field name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * Field remarks list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String [] Comment;

    /**
     * Get field name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FieldName field name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set field name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FieldName field name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get Field remarks list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Comment Field remarks list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getComment() {
        return this.Comment;
    }

    /**
     * Set Field remarks list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Comment Field remarks list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComment(String [] Comment) {
        this.Comment = Comment;
    }

    public FieldRemarkDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldRemarkDTO(FieldRemarkDTO source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.Comment != null) {
            this.Comment = new String[source.Comment.length];
            for (int i = 0; i < source.Comment.length; i++) {
                this.Comment[i] = new String(source.Comment[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamArraySimple(map, prefix + "Comment.", this.Comment);

    }
}

