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

public class JoinRelationField extends AbstractModel {

    /**
    * Field association id, frontend usage
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FieldJoinId")
    @Expose
    private String FieldJoinId;

    /**
    * Original table field
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceField")
    @Expose
    private TableField SourceField;

    /**
    * Target table field
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetField")
    @Expose
    private TableField TargetField;

    /**
     * Get Field association id, frontend usage
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FieldJoinId Field association id, frontend usage
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFieldJoinId() {
        return this.FieldJoinId;
    }

    /**
     * Set Field association id, frontend usage
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FieldJoinId Field association id, frontend usage
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFieldJoinId(String FieldJoinId) {
        this.FieldJoinId = FieldJoinId;
    }

    /**
     * Get Original table field
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceField Original table field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TableField getSourceField() {
        return this.SourceField;
    }

    /**
     * Set Original table field
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceField Original table field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceField(TableField SourceField) {
        this.SourceField = SourceField;
    }

    /**
     * Get Target table field
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetField Target table field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TableField getTargetField() {
        return this.TargetField;
    }

    /**
     * Set Target table field
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetField Target table field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetField(TableField TargetField) {
        this.TargetField = TargetField;
    }

    public JoinRelationField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinRelationField(JoinRelationField source) {
        if (source.FieldJoinId != null) {
            this.FieldJoinId = new String(source.FieldJoinId);
        }
        if (source.SourceField != null) {
            this.SourceField = new TableField(source.SourceField);
        }
        if (source.TargetField != null) {
            this.TargetField = new TableField(source.TargetField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldJoinId", this.FieldJoinId);
        this.setParamObj(map, prefix + "SourceField.", this.SourceField);
        this.setParamObj(map, prefix + "TargetField.", this.TargetField);

    }
}

