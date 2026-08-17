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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PasswordPolicy extends AbstractModel {

    /**
    * <p>Whether to enable the instance-level password complexity policy.</p><ul><li>true: Enable. ALL password changes (create/reset) must pass the complexity verification defined below.</li><li>false: Disable. No complexity filtering is performed.</li></ul><p>Default value: false</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>Minimum number of uppercase and lowercase letters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
    */
    @SerializedName("MinLetterCount")
    @Expose
    private Long MinLetterCount;

    /**
    * <p>Minimum number of numeric characters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
    */
    @SerializedName("MinDigitCount")
    @Expose
    private Long MinDigitCount;

    /**
    * <p>Minimum number of special characters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
    */
    @SerializedName("MinSpecialCount")
    @Expose
    private Long MinSpecialCount;

    /**
    * <p>Minimum total length of the password (number of characters).</p><ul><li>Value ranges from 8 to 64.</li><li>Default value: 8.</li><li>Constraints and limitations: The minimum total length of the password must be at least the sum of three parameters: MinLetterCount, MinDigitCount, and MinSpecialCount.</li></ul>
    */
    @SerializedName("MinLength")
    @Expose
    private Long MinLength;

    /**
     * Get <p>Whether to enable the instance-level password complexity policy.</p><ul><li>true: Enable. ALL password changes (create/reset) must pass the complexity verification defined below.</li><li>false: Disable. No complexity filtering is performed.</li></ul><p>Default value: false</p> 
     * @return Enabled <p>Whether to enable the instance-level password complexity policy.</p><ul><li>true: Enable. ALL password changes (create/reset) must pass the complexity verification defined below.</li><li>false: Disable. No complexity filtering is performed.</li></ul><p>Default value: false</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether to enable the instance-level password complexity policy.</p><ul><li>true: Enable. ALL password changes (create/reset) must pass the complexity verification defined below.</li><li>false: Disable. No complexity filtering is performed.</li></ul><p>Default value: false</p>
     * @param Enabled <p>Whether to enable the instance-level password complexity policy.</p><ul><li>true: Enable. ALL password changes (create/reset) must pass the complexity verification defined below.</li><li>false: Disable. No complexity filtering is performed.</li></ul><p>Default value: false</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Minimum number of uppercase and lowercase letters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul> 
     * @return MinLetterCount <p>Minimum number of uppercase and lowercase letters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
     */
    public Long getMinLetterCount() {
        return this.MinLetterCount;
    }

    /**
     * Set <p>Minimum number of uppercase and lowercase letters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
     * @param MinLetterCount <p>Minimum number of uppercase and lowercase letters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
     */
    public void setMinLetterCount(Long MinLetterCount) {
        this.MinLetterCount = MinLetterCount;
    }

    /**
     * Get <p>Minimum number of numeric characters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul> 
     * @return MinDigitCount <p>Minimum number of numeric characters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
     */
    public Long getMinDigitCount() {
        return this.MinDigitCount;
    }

    /**
     * Set <p>Minimum number of numeric characters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
     * @param MinDigitCount <p>Minimum number of numeric characters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
     */
    public void setMinDigitCount(Long MinDigitCount) {
        this.MinDigitCount = MinDigitCount;
    }

    /**
     * Get <p>Minimum number of special characters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul> 
     * @return MinSpecialCount <p>Minimum number of special characters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
     */
    public Long getMinSpecialCount() {
        return this.MinSpecialCount;
    }

    /**
     * Set <p>Minimum number of special characters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
     * @param MinSpecialCount <p>Minimum number of special characters.</p><ul><li>Value ranges from 1 to 16.</li><li>Default value: 1.</li></ul>
     */
    public void setMinSpecialCount(Long MinSpecialCount) {
        this.MinSpecialCount = MinSpecialCount;
    }

    /**
     * Get <p>Minimum total length of the password (number of characters).</p><ul><li>Value ranges from 8 to 64.</li><li>Default value: 8.</li><li>Constraints and limitations: The minimum total length of the password must be at least the sum of three parameters: MinLetterCount, MinDigitCount, and MinSpecialCount.</li></ul> 
     * @return MinLength <p>Minimum total length of the password (number of characters).</p><ul><li>Value ranges from 8 to 64.</li><li>Default value: 8.</li><li>Constraints and limitations: The minimum total length of the password must be at least the sum of three parameters: MinLetterCount, MinDigitCount, and MinSpecialCount.</li></ul>
     */
    public Long getMinLength() {
        return this.MinLength;
    }

    /**
     * Set <p>Minimum total length of the password (number of characters).</p><ul><li>Value ranges from 8 to 64.</li><li>Default value: 8.</li><li>Constraints and limitations: The minimum total length of the password must be at least the sum of three parameters: MinLetterCount, MinDigitCount, and MinSpecialCount.</li></ul>
     * @param MinLength <p>Minimum total length of the password (number of characters).</p><ul><li>Value ranges from 8 to 64.</li><li>Default value: 8.</li><li>Constraints and limitations: The minimum total length of the password must be at least the sum of three parameters: MinLetterCount, MinDigitCount, and MinSpecialCount.</li></ul>
     */
    public void setMinLength(Long MinLength) {
        this.MinLength = MinLength;
    }

    public PasswordPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PasswordPolicy(PasswordPolicy source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.MinLetterCount != null) {
            this.MinLetterCount = new Long(source.MinLetterCount);
        }
        if (source.MinDigitCount != null) {
            this.MinDigitCount = new Long(source.MinDigitCount);
        }
        if (source.MinSpecialCount != null) {
            this.MinSpecialCount = new Long(source.MinSpecialCount);
        }
        if (source.MinLength != null) {
            this.MinLength = new Long(source.MinLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "MinLetterCount", this.MinLetterCount);
        this.setParamSimple(map, prefix + "MinDigitCount", this.MinDigitCount);
        this.setParamSimple(map, prefix + "MinSpecialCount", this.MinSpecialCount);
        this.setParamSimple(map, prefix + "MinLength", this.MinLength);

    }
}

