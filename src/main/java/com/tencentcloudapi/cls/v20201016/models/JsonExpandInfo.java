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

public class JsonExpandInfo extends AbstractModel {

    /**
    * <p>Whether to enable the JSON nested unfold functionality. Once enabled, it will flatten and process the specified JSON field.</p><p>Default value: None (Required parameter)</p>
    */
    @SerializedName("Switch")
    @Expose
    private Boolean Switch;

    /**
    * <p>List of JSON field names to be unfolded, supporting 1 to 3 fields. Field names cannot be empty strings and cannot be repeated.</p><p>Input parameter limits: 1. Number of fields: 1 to 3. 2. Length of each field name not exceeding 128 characters. 3. Field names cannot be empty strings. 4. Field names cannot be repeated.</p><p>Default value: None (required parameter)</p><p>Value for reference: Value: message; Description: Example field name</p><p>Example: ["message", "data", "content"]</p>
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * <p>Whether to discard the original nested field after unfolding. true: discard the original field and keep only the flattened field after unfolding; false: keep the original field and add the flattened field after unfolding.</p><p>Enumeration value:</p><ul><li>true / false: discard the original field / keep the original field</li></ul><p>Default value: true</p><p>Optional. Default is true if not provided.</p>
    */
    @SerializedName("DropOriginal")
    @Expose
    private Boolean DropOriginal;

    /**
    * <p>Processing policy when the unfolded field conflicts with an existing field</p><p>Enumeration value:</p><ul><li>keep_outer / keep_inner: Keep the outer (existing) field / Keep the inner (newly unfolded) field</li></ul><p>Default value: keep_outer</p><p>Optional. Defaults to keep_outer if not passed.</p>
    */
    @SerializedName("ConflictPolicy")
    @Expose
    private String ConflictPolicy;

    /**
     * Get <p>Whether to enable the JSON nested unfold functionality. Once enabled, it will flatten and process the specified JSON field.</p><p>Default value: None (Required parameter)</p> 
     * @return Switch <p>Whether to enable the JSON nested unfold functionality. Once enabled, it will flatten and process the specified JSON field.</p><p>Default value: None (Required parameter)</p>
     */
    public Boolean getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Whether to enable the JSON nested unfold functionality. Once enabled, it will flatten and process the specified JSON field.</p><p>Default value: None (Required parameter)</p>
     * @param Switch <p>Whether to enable the JSON nested unfold functionality. Once enabled, it will flatten and process the specified JSON field.</p><p>Default value: None (Required parameter)</p>
     */
    public void setSwitch(Boolean Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>List of JSON field names to be unfolded, supporting 1 to 3 fields. Field names cannot be empty strings and cannot be repeated.</p><p>Input parameter limits: 1. Number of fields: 1 to 3. 2. Length of each field name not exceeding 128 characters. 3. Field names cannot be empty strings. 4. Field names cannot be repeated.</p><p>Default value: None (required parameter)</p><p>Value for reference: Value: message; Description: Example field name</p><p>Example: ["message", "data", "content"]</p> 
     * @return Fields <p>List of JSON field names to be unfolded, supporting 1 to 3 fields. Field names cannot be empty strings and cannot be repeated.</p><p>Input parameter limits: 1. Number of fields: 1 to 3. 2. Length of each field name not exceeding 128 characters. 3. Field names cannot be empty strings. 4. Field names cannot be repeated.</p><p>Default value: None (required parameter)</p><p>Value for reference: Value: message; Description: Example field name</p><p>Example: ["message", "data", "content"]</p>
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>List of JSON field names to be unfolded, supporting 1 to 3 fields. Field names cannot be empty strings and cannot be repeated.</p><p>Input parameter limits: 1. Number of fields: 1 to 3. 2. Length of each field name not exceeding 128 characters. 3. Field names cannot be empty strings. 4. Field names cannot be repeated.</p><p>Default value: None (required parameter)</p><p>Value for reference: Value: message; Description: Example field name</p><p>Example: ["message", "data", "content"]</p>
     * @param Fields <p>List of JSON field names to be unfolded, supporting 1 to 3 fields. Field names cannot be empty strings and cannot be repeated.</p><p>Input parameter limits: 1. Number of fields: 1 to 3. 2. Length of each field name not exceeding 128 characters. 3. Field names cannot be empty strings. 4. Field names cannot be repeated.</p><p>Default value: None (required parameter)</p><p>Value for reference: Value: message; Description: Example field name</p><p>Example: ["message", "data", "content"]</p>
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>Whether to discard the original nested field after unfolding. true: discard the original field and keep only the flattened field after unfolding; false: keep the original field and add the flattened field after unfolding.</p><p>Enumeration value:</p><ul><li>true / false: discard the original field / keep the original field</li></ul><p>Default value: true</p><p>Optional. Default is true if not provided.</p> 
     * @return DropOriginal <p>Whether to discard the original nested field after unfolding. true: discard the original field and keep only the flattened field after unfolding; false: keep the original field and add the flattened field after unfolding.</p><p>Enumeration value:</p><ul><li>true / false: discard the original field / keep the original field</li></ul><p>Default value: true</p><p>Optional. Default is true if not provided.</p>
     */
    public Boolean getDropOriginal() {
        return this.DropOriginal;
    }

    /**
     * Set <p>Whether to discard the original nested field after unfolding. true: discard the original field and keep only the flattened field after unfolding; false: keep the original field and add the flattened field after unfolding.</p><p>Enumeration value:</p><ul><li>true / false: discard the original field / keep the original field</li></ul><p>Default value: true</p><p>Optional. Default is true if not provided.</p>
     * @param DropOriginal <p>Whether to discard the original nested field after unfolding. true: discard the original field and keep only the flattened field after unfolding; false: keep the original field and add the flattened field after unfolding.</p><p>Enumeration value:</p><ul><li>true / false: discard the original field / keep the original field</li></ul><p>Default value: true</p><p>Optional. Default is true if not provided.</p>
     */
    public void setDropOriginal(Boolean DropOriginal) {
        this.DropOriginal = DropOriginal;
    }

    /**
     * Get <p>Processing policy when the unfolded field conflicts with an existing field</p><p>Enumeration value:</p><ul><li>keep_outer / keep_inner: Keep the outer (existing) field / Keep the inner (newly unfolded) field</li></ul><p>Default value: keep_outer</p><p>Optional. Defaults to keep_outer if not passed.</p> 
     * @return ConflictPolicy <p>Processing policy when the unfolded field conflicts with an existing field</p><p>Enumeration value:</p><ul><li>keep_outer / keep_inner: Keep the outer (existing) field / Keep the inner (newly unfolded) field</li></ul><p>Default value: keep_outer</p><p>Optional. Defaults to keep_outer if not passed.</p>
     */
    public String getConflictPolicy() {
        return this.ConflictPolicy;
    }

    /**
     * Set <p>Processing policy when the unfolded field conflicts with an existing field</p><p>Enumeration value:</p><ul><li>keep_outer / keep_inner: Keep the outer (existing) field / Keep the inner (newly unfolded) field</li></ul><p>Default value: keep_outer</p><p>Optional. Defaults to keep_outer if not passed.</p>
     * @param ConflictPolicy <p>Processing policy when the unfolded field conflicts with an existing field</p><p>Enumeration value:</p><ul><li>keep_outer / keep_inner: Keep the outer (existing) field / Keep the inner (newly unfolded) field</li></ul><p>Default value: keep_outer</p><p>Optional. Defaults to keep_outer if not passed.</p>
     */
    public void setConflictPolicy(String ConflictPolicy) {
        this.ConflictPolicy = ConflictPolicy;
    }

    public JsonExpandInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JsonExpandInfo(JsonExpandInfo source) {
        if (source.Switch != null) {
            this.Switch = new Boolean(source.Switch);
        }
        if (source.Fields != null) {
            this.Fields = new String[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new String(source.Fields[i]);
            }
        }
        if (source.DropOriginal != null) {
            this.DropOriginal = new Boolean(source.DropOriginal);
        }
        if (source.ConflictPolicy != null) {
            this.ConflictPolicy = new String(source.ConflictPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "DropOriginal", this.DropOriginal);
        this.setParamSimple(map, prefix + "ConflictPolicy", this.ConflictPolicy);

    }
}

