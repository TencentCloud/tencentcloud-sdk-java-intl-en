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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tag extends AbstractModel {

    /**
    * Returns the hit keywords.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Returns the sub-tags.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * Returns the score for the sub-label
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get Returns the hit keywords.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Keyword Returns the hit keywords.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Returns the hit keywords.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Keyword Returns the hit keywords.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Returns the sub-tags.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubLabel Returns the sub-tags.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set Returns the sub-tags.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubLabel Returns the sub-tags.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get Returns the score for the sub-label
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Score Returns the score for the sub-label
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Returns the score for the sub-label
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Score Returns the score for the sub-label
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public Tag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tag(Tag source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

