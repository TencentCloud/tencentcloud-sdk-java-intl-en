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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailResults extends AbstractModel{

    /**
    * Result of the moderation. <br>`Normal`: normal content; `Porn`: pornographic content; `Abuse`: abusive content; **Ad**: advertising content; `Custom`: custom violating content
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Recommended follow-up action. <br>`Block`: block it automatically; `Review`: review the content again in human; **Pass**: pass
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * This field returns the matched keywords. This parameter can include multiple returned values, which means multiple keywords are matched. If no keyword is returned but there is a `Score`, it means that the result of `Label` is determined by a semantic model.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * This field indicates the convincing level of the `Label`, ranging from `0` (lowest) to `100` (highest). 
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * It indicates the library type corresponding with the keyword. Valid values: `1` (blocklist/allowlist library) and `2` (custom keyword library). If no custom keyword library is configured, the default value is 1.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("LibType")
    @Expose
    private Long LibType;

    /**
    * This field is **only valid when `Label` is `Custom`. It returns the custom library ID to facilitate the library management and configuration.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * This field is **only valid when `Label` is `Custom` (custom keyword)`. It returns the custom library name to facilitate the library management and configuration.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * The field returns the second-level labels under the current label.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
     * Get Result of the moderation. <br>`Normal`: normal content; `Porn`: pornographic content; `Abuse`: abusive content; **Ad**: advertising content; `Custom`: custom violating content 
     * @return Label Result of the moderation. <br>`Normal`: normal content; `Porn`: pornographic content; `Abuse`: abusive content; **Ad**: advertising content; `Custom`: custom violating content
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Result of the moderation. <br>`Normal`: normal content; `Porn`: pornographic content; `Abuse`: abusive content; **Ad**: advertising content; `Custom`: custom violating content
     * @param Label Result of the moderation. <br>`Normal`: normal content; `Porn`: pornographic content; `Abuse`: abusive content; **Ad**: advertising content; `Custom`: custom violating content
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Recommended follow-up action. <br>`Block`: block it automatically; `Review`: review the content again in human; **Pass**: pass
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return Suggestion Recommended follow-up action. <br>`Block`: block it automatically; `Review`: review the content again in human; **Pass**: pass
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Recommended follow-up action. <br>`Block`: block it automatically; `Review`: review the content again in human; **Pass**: pass
Note: This field may return `null`, indicating that no valid value can be found.
     * @param Suggestion Recommended follow-up action. <br>`Block`: block it automatically; `Review`: review the content again in human; **Pass**: pass
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get This field returns the matched keywords. This parameter can include multiple returned values, which means multiple keywords are matched. If no keyword is returned but there is a `Score`, it means that the result of `Label` is determined by a semantic model.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return Keywords This field returns the matched keywords. This parameter can include multiple returned values, which means multiple keywords are matched. If no keyword is returned but there is a `Score`, it means that the result of `Label` is determined by a semantic model.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set This field returns the matched keywords. This parameter can include multiple returned values, which means multiple keywords are matched. If no keyword is returned but there is a `Score`, it means that the result of `Label` is determined by a semantic model.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param Keywords This field returns the matched keywords. This parameter can include multiple returned values, which means multiple keywords are matched. If no keyword is returned but there is a `Score`, it means that the result of `Label` is determined by a semantic model.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get This field indicates the convincing level of the `Label`, ranging from `0` (lowest) to `100` (highest). 
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return Score This field indicates the convincing level of the `Label`, ranging from `0` (lowest) to `100` (highest). 
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This field indicates the convincing level of the `Label`, ranging from `0` (lowest) to `100` (highest). 
Note: This field may return `null`, indicating that no valid value can be found.
     * @param Score This field indicates the convincing level of the `Label`, ranging from `0` (lowest) to `100` (highest). 
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get It indicates the library type corresponding with the keyword. Valid values: `1` (blocklist/allowlist library) and `2` (custom keyword library). If no custom keyword library is configured, the default value is 1.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return LibType It indicates the library type corresponding with the keyword. Valid values: `1` (blocklist/allowlist library) and `2` (custom keyword library). If no custom keyword library is configured, the default value is 1.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public Long getLibType() {
        return this.LibType;
    }

    /**
     * Set It indicates the library type corresponding with the keyword. Valid values: `1` (blocklist/allowlist library) and `2` (custom keyword library). If no custom keyword library is configured, the default value is 1.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param LibType It indicates the library type corresponding with the keyword. Valid values: `1` (blocklist/allowlist library) and `2` (custom keyword library). If no custom keyword library is configured, the default value is 1.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setLibType(Long LibType) {
        this.LibType = LibType;
    }

    /**
     * Get This field is **only valid when `Label` is `Custom`. It returns the custom library ID to facilitate the library management and configuration.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return LibId This field is **only valid when `Label` is `Custom`. It returns the custom library ID to facilitate the library management and configuration.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set This field is **only valid when `Label` is `Custom`. It returns the custom library ID to facilitate the library management and configuration.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param LibId This field is **only valid when `Label` is `Custom`. It returns the custom library ID to facilitate the library management and configuration.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get This field is **only valid when `Label` is `Custom` (custom keyword)`. It returns the custom library name to facilitate the library management and configuration.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return LibName This field is **only valid when `Label` is `Custom` (custom keyword)`. It returns the custom library name to facilitate the library management and configuration.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set This field is **only valid when `Label` is `Custom` (custom keyword)`. It returns the custom library name to facilitate the library management and configuration.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param LibName This field is **only valid when `Label` is `Custom` (custom keyword)`. It returns the custom library name to facilitate the library management and configuration.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get The field returns the second-level labels under the current label.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return SubLabel The field returns the second-level labels under the current label.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set The field returns the second-level labels under the current label.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param SubLabel The field returns the second-level labels under the current label.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    public DetailResults() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailResults(DetailResults source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.LibType != null) {
            this.LibType = new Long(source.LibType);
        }
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "LibType", this.LibType);
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);

    }
}

