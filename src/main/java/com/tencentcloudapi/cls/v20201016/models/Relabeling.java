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

public class Relabeling extends AbstractModel {

    /**
    * Action executed based on regular expression matching.
-replace: Label replacement, required: SourceLabels, Separator, Regex, TargetLabel, Replacement
-labeldrop: Discard Label, Required: Regex
-labelkeep: Reserve Label, required: Regex
-lowercase, required: SourceLabels, Separator, TargetLabel
-Uppercase: uppercase, Required: SourceLabels, Separator, TargetLabel
-dropequal: Drop metric - exact match, required: SourceLabels, Separator, TargetLabel
-keepequal: retain metric - exact match, required: SourceLabels, Separator, TargetLabel
-drop: Drop metric - Regular expression matching. Required: SourceLabels, Separator, Regex.
-keep: Retain metric - Regular expression matching, Required: SourceLabels, Separator, Regex
-hashmod: hash modulo, required: SourceLabels, Separator, TargetLabel, Modulus
-labelmap: Label map, required: Regex, Replacement
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * original label
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceLabels")
    @Expose
    private String [] SourceLabels;

    /**
    * Original label delimiter. This parameter cannot be an empty string when it is required. Its length cannot exceed 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Separator")
    @Expose
    private String Separator;

    /**
    * Target label. This parameter cannot be an empty string when it is required. The verification format is ^[a-zA-Z_][a-zA-Z0-9_]*$, and its length cannot exceed 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetLabel")
    @Expose
    private String TargetLabel;

    /**
    * Replacement value. If regular expression matching is performed, execute the replacement operation.
-Cannot be an empty string when required. Length cannot exceed 256.
-When the action is LabelMap, check format for Replacement: `^(?:(?:[a-zA-Z_]|\$(?:\{\w+\}|\w+))+\w*)+$`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Replacement")
    @Expose
    private String Replacement;

    /**
    * Regular expression. The matching value is extracted. This parameter cannot be an empty string when it is required. The regular expression should be a valid RE2. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * Obtains the hash value of a label value. This parameter cannot be empty or 0 when it is required.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Modulus")
    @Expose
    private Long Modulus;

    /**
     * Get Action executed based on regular expression matching.
-replace: Label replacement, required: SourceLabels, Separator, Regex, TargetLabel, Replacement
-labeldrop: Discard Label, Required: Regex
-labelkeep: Reserve Label, required: Regex
-lowercase, required: SourceLabels, Separator, TargetLabel
-Uppercase: uppercase, Required: SourceLabels, Separator, TargetLabel
-dropequal: Drop metric - exact match, required: SourceLabels, Separator, TargetLabel
-keepequal: retain metric - exact match, required: SourceLabels, Separator, TargetLabel
-drop: Drop metric - Regular expression matching. Required: SourceLabels, Separator, Regex.
-keep: Retain metric - Regular expression matching, Required: SourceLabels, Separator, Regex
-hashmod: hash modulo, required: SourceLabels, Separator, TargetLabel, Modulus
-labelmap: Label map, required: Regex, Replacement
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Action Action executed based on regular expression matching.
-replace: Label replacement, required: SourceLabels, Separator, Regex, TargetLabel, Replacement
-labeldrop: Discard Label, Required: Regex
-labelkeep: Reserve Label, required: Regex
-lowercase, required: SourceLabels, Separator, TargetLabel
-Uppercase: uppercase, Required: SourceLabels, Separator, TargetLabel
-dropequal: Drop metric - exact match, required: SourceLabels, Separator, TargetLabel
-keepequal: retain metric - exact match, required: SourceLabels, Separator, TargetLabel
-drop: Drop metric - Regular expression matching. Required: SourceLabels, Separator, Regex.
-keep: Retain metric - Regular expression matching, Required: SourceLabels, Separator, Regex
-hashmod: hash modulo, required: SourceLabels, Separator, TargetLabel, Modulus
-labelmap: Label map, required: Regex, Replacement
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action executed based on regular expression matching.
-replace: Label replacement, required: SourceLabels, Separator, Regex, TargetLabel, Replacement
-labeldrop: Discard Label, Required: Regex
-labelkeep: Reserve Label, required: Regex
-lowercase, required: SourceLabels, Separator, TargetLabel
-Uppercase: uppercase, Required: SourceLabels, Separator, TargetLabel
-dropequal: Drop metric - exact match, required: SourceLabels, Separator, TargetLabel
-keepequal: retain metric - exact match, required: SourceLabels, Separator, TargetLabel
-drop: Drop metric - Regular expression matching. Required: SourceLabels, Separator, Regex.
-keep: Retain metric - Regular expression matching, Required: SourceLabels, Separator, Regex
-hashmod: hash modulo, required: SourceLabels, Separator, TargetLabel, Modulus
-labelmap: Label map, required: Regex, Replacement
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Action Action executed based on regular expression matching.
-replace: Label replacement, required: SourceLabels, Separator, Regex, TargetLabel, Replacement
-labeldrop: Discard Label, Required: Regex
-labelkeep: Reserve Label, required: Regex
-lowercase, required: SourceLabels, Separator, TargetLabel
-Uppercase: uppercase, Required: SourceLabels, Separator, TargetLabel
-dropequal: Drop metric - exact match, required: SourceLabels, Separator, TargetLabel
-keepequal: retain metric - exact match, required: SourceLabels, Separator, TargetLabel
-drop: Drop metric - Regular expression matching. Required: SourceLabels, Separator, Regex.
-keep: Retain metric - Regular expression matching, Required: SourceLabels, Separator, Regex
-hashmod: hash modulo, required: SourceLabels, Separator, TargetLabel, Modulus
-labelmap: Label map, required: Regex, Replacement
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get original label
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceLabels original label
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSourceLabels() {
        return this.SourceLabels;
    }

    /**
     * Set original label
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceLabels original label
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceLabels(String [] SourceLabels) {
        this.SourceLabels = SourceLabels;
    }

    /**
     * Get Original label delimiter. This parameter cannot be an empty string when it is required. Its length cannot exceed 256 characters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Separator Original label delimiter. This parameter cannot be an empty string when it is required. Its length cannot exceed 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSeparator() {
        return this.Separator;
    }

    /**
     * Set Original label delimiter. This parameter cannot be an empty string when it is required. Its length cannot exceed 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Separator Original label delimiter. This parameter cannot be an empty string when it is required. Its length cannot exceed 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSeparator(String Separator) {
        this.Separator = Separator;
    }

    /**
     * Get Target label. This parameter cannot be an empty string when it is required. The verification format is ^[a-zA-Z_][a-zA-Z0-9_]*$, and its length cannot exceed 256 characters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetLabel Target label. This parameter cannot be an empty string when it is required. The verification format is ^[a-zA-Z_][a-zA-Z0-9_]*$, and its length cannot exceed 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetLabel() {
        return this.TargetLabel;
    }

    /**
     * Set Target label. This parameter cannot be an empty string when it is required. The verification format is ^[a-zA-Z_][a-zA-Z0-9_]*$, and its length cannot exceed 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetLabel Target label. This parameter cannot be an empty string when it is required. The verification format is ^[a-zA-Z_][a-zA-Z0-9_]*$, and its length cannot exceed 256 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetLabel(String TargetLabel) {
        this.TargetLabel = TargetLabel;
    }

    /**
     * Get Replacement value. If regular expression matching is performed, execute the replacement operation.
-Cannot be an empty string when required. Length cannot exceed 256.
-When the action is LabelMap, check format for Replacement: `^(?:(?:[a-zA-Z_]|\$(?:\{\w+\}|\w+))+\w*)+$`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Replacement Replacement value. If regular expression matching is performed, execute the replacement operation.
-Cannot be an empty string when required. Length cannot exceed 256.
-When the action is LabelMap, check format for Replacement: `^(?:(?:[a-zA-Z_]|\$(?:\{\w+\}|\w+))+\w*)+$`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReplacement() {
        return this.Replacement;
    }

    /**
     * Set Replacement value. If regular expression matching is performed, execute the replacement operation.
-Cannot be an empty string when required. Length cannot exceed 256.
-When the action is LabelMap, check format for Replacement: `^(?:(?:[a-zA-Z_]|\$(?:\{\w+\}|\w+))+\w*)+$`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Replacement Replacement value. If regular expression matching is performed, execute the replacement operation.
-Cannot be an empty string when required. Length cannot exceed 256.
-When the action is LabelMap, check format for Replacement: `^(?:(?:[a-zA-Z_]|\$(?:\{\w+\}|\w+))+\w*)+$`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReplacement(String Replacement) {
        this.Replacement = Replacement;
    }

    /**
     * Get Regular expression. The matching value is extracted. This parameter cannot be an empty string when it is required. The regular expression should be a valid RE2. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Regex Regular expression. The matching value is extracted. This parameter cannot be an empty string when it is required. The regular expression should be a valid RE2. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set Regular expression. The matching value is extracted. This parameter cannot be an empty string when it is required. The regular expression should be a valid RE2. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Regex Regular expression. The matching value is extracted. This parameter cannot be an empty string when it is required. The regular expression should be a valid RE2. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get Obtains the hash value of a label value. This parameter cannot be empty or 0 when it is required.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Modulus Obtains the hash value of a label value. This parameter cannot be empty or 0 when it is required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getModulus() {
        return this.Modulus;
    }

    /**
     * Set Obtains the hash value of a label value. This parameter cannot be empty or 0 when it is required.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Modulus Obtains the hash value of a label value. This parameter cannot be empty or 0 when it is required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModulus(Long Modulus) {
        this.Modulus = Modulus;
    }

    public Relabeling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Relabeling(Relabeling source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.SourceLabels != null) {
            this.SourceLabels = new String[source.SourceLabels.length];
            for (int i = 0; i < source.SourceLabels.length; i++) {
                this.SourceLabels[i] = new String(source.SourceLabels[i]);
            }
        }
        if (source.Separator != null) {
            this.Separator = new String(source.Separator);
        }
        if (source.TargetLabel != null) {
            this.TargetLabel = new String(source.TargetLabel);
        }
        if (source.Replacement != null) {
            this.Replacement = new String(source.Replacement);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.Modulus != null) {
            this.Modulus = new Long(source.Modulus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "SourceLabels.", this.SourceLabels);
        this.setParamSimple(map, prefix + "Separator", this.Separator);
        this.setParamSimple(map, prefix + "TargetLabel", this.TargetLabel);
        this.setParamSimple(map, prefix + "Replacement", this.Replacement);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "Modulus", this.Modulus);

    }
}

