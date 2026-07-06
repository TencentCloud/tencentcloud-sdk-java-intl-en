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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PassWordRule extends AbstractModel {

    /**
    * Minimum length required for the password.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinimumLength")
    @Expose
    private Long MinimumLength;

    /**
    * Types of characters the password must contain. 
A: Must contain uppercase letter
a: Must contain lowercase letter
1: Must contain number
!: Must contain special character

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MustContain")
    @Expose
    private String MustContain;

    /**
    * Password validity period in days, after which the password must be reset. 0 (no expiration)

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForcePasswordChange")
    @Expose
    private Long ForcePasswordChange;

    /**
    * Number of previous passwords that cannot be reused. 

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReusePasswordLimit")
    @Expose
    private Long ReusePasswordLimit;

    /**
    * Maximum number of failed login attempts allowed within a one hour window.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetryPasswordLimit")
    @Expose
    private Long RetryPasswordLimit;

    /**
    * Indicates whether a user can reset their own password after it has expired. 
1: Yes, 2: No (Yes: After password expiration, sub-users are unable to log in and require administrator reset. No: After password expiration, sub-users can log in and are forced to change password based on old password.)

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PasswordExpirationInvalidation")
    @Expose
    private Long PasswordExpirationInvalidation;

    /**
     * Get Minimum length required for the password.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinimumLength Minimum length required for the password.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinimumLength() {
        return this.MinimumLength;
    }

    /**
     * Set Minimum length required for the password.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinimumLength Minimum length required for the password.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinimumLength(Long MinimumLength) {
        this.MinimumLength = MinimumLength;
    }

    /**
     * Get Types of characters the password must contain. 
A: Must contain uppercase letter
a: Must contain lowercase letter
1: Must contain number
!: Must contain special character

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MustContain Types of characters the password must contain. 
A: Must contain uppercase letter
a: Must contain lowercase letter
1: Must contain number
!: Must contain special character

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMustContain() {
        return this.MustContain;
    }

    /**
     * Set Types of characters the password must contain. 
A: Must contain uppercase letter
a: Must contain lowercase letter
1: Must contain number
!: Must contain special character

Note: This field may return null, indicating that no valid values can be obtained.
     * @param MustContain Types of characters the password must contain. 
A: Must contain uppercase letter
a: Must contain lowercase letter
1: Must contain number
!: Must contain special character

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMustContain(String MustContain) {
        this.MustContain = MustContain;
    }

    /**
     * Get Password validity period in days, after which the password must be reset. 0 (no expiration)

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ForcePasswordChange Password validity period in days, after which the password must be reset. 0 (no expiration)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getForcePasswordChange() {
        return this.ForcePasswordChange;
    }

    /**
     * Set Password validity period in days, after which the password must be reset. 0 (no expiration)

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ForcePasswordChange Password validity period in days, after which the password must be reset. 0 (no expiration)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setForcePasswordChange(Long ForcePasswordChange) {
        this.ForcePasswordChange = ForcePasswordChange;
    }

    /**
     * Get Number of previous passwords that cannot be reused. 

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReusePasswordLimit Number of previous passwords that cannot be reused. 

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReusePasswordLimit() {
        return this.ReusePasswordLimit;
    }

    /**
     * Set Number of previous passwords that cannot be reused. 

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReusePasswordLimit Number of previous passwords that cannot be reused. 

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReusePasswordLimit(Long ReusePasswordLimit) {
        this.ReusePasswordLimit = ReusePasswordLimit;
    }

    /**
     * Get Maximum number of failed login attempts allowed within a one hour window.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RetryPasswordLimit Maximum number of failed login attempts allowed within a one hour window.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetryPasswordLimit() {
        return this.RetryPasswordLimit;
    }

    /**
     * Set Maximum number of failed login attempts allowed within a one hour window.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RetryPasswordLimit Maximum number of failed login attempts allowed within a one hour window.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetryPasswordLimit(Long RetryPasswordLimit) {
        this.RetryPasswordLimit = RetryPasswordLimit;
    }

    /**
     * Get Indicates whether a user can reset their own password after it has expired. 
1: Yes, 2: No (Yes: After password expiration, sub-users are unable to log in and require administrator reset. No: After password expiration, sub-users can log in and are forced to change password based on old password.)

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PasswordExpirationInvalidation Indicates whether a user can reset their own password after it has expired. 
1: Yes, 2: No (Yes: After password expiration, sub-users are unable to log in and require administrator reset. No: After password expiration, sub-users can log in and are forced to change password based on old password.)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPasswordExpirationInvalidation() {
        return this.PasswordExpirationInvalidation;
    }

    /**
     * Set Indicates whether a user can reset their own password after it has expired. 
1: Yes, 2: No (Yes: After password expiration, sub-users are unable to log in and require administrator reset. No: After password expiration, sub-users can log in and are forced to change password based on old password.)

Note: This field may return null, indicating that no valid values can be obtained.
     * @param PasswordExpirationInvalidation Indicates whether a user can reset their own password after it has expired. 
1: Yes, 2: No (Yes: After password expiration, sub-users are unable to log in and require administrator reset. No: After password expiration, sub-users can log in and are forced to change password based on old password.)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPasswordExpirationInvalidation(Long PasswordExpirationInvalidation) {
        this.PasswordExpirationInvalidation = PasswordExpirationInvalidation;
    }

    public PassWordRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PassWordRule(PassWordRule source) {
        if (source.MinimumLength != null) {
            this.MinimumLength = new Long(source.MinimumLength);
        }
        if (source.MustContain != null) {
            this.MustContain = new String(source.MustContain);
        }
        if (source.ForcePasswordChange != null) {
            this.ForcePasswordChange = new Long(source.ForcePasswordChange);
        }
        if (source.ReusePasswordLimit != null) {
            this.ReusePasswordLimit = new Long(source.ReusePasswordLimit);
        }
        if (source.RetryPasswordLimit != null) {
            this.RetryPasswordLimit = new Long(source.RetryPasswordLimit);
        }
        if (source.PasswordExpirationInvalidation != null) {
            this.PasswordExpirationInvalidation = new Long(source.PasswordExpirationInvalidation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinimumLength", this.MinimumLength);
        this.setParamSimple(map, prefix + "MustContain", this.MustContain);
        this.setParamSimple(map, prefix + "ForcePasswordChange", this.ForcePasswordChange);
        this.setParamSimple(map, prefix + "ReusePasswordLimit", this.ReusePasswordLimit);
        this.setParamSimple(map, prefix + "RetryPasswordLimit", this.RetryPasswordLimit);
        this.setParamSimple(map, prefix + "PasswordExpirationInvalidation", this.PasswordExpirationInvalidation);

    }
}

