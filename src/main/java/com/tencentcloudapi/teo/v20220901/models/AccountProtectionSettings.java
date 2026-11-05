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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountProtectionSettings extends AbstractModel {

    /**
    * <p>Account protection feature switch.</p><p>Enumeration values: </p><ul><li>on: Enable;</li><li>off: Disable.</li></ul><p>Default value: off.</p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * <p>Request target. Used to identify the business operation scenario the request belongs to.</p> <p>Enumeration values:</p> <ul> <li>ACCOUNT.CHANGE_PASSWORD: request to change the password when the original password is known;</li> <li>ACCOUNT.CHANGE_SECURITY_QUESTION: request to modify the account security question;</li> <li>ACCOUNT.CHECK_EXISTENCE: request to verify whether the account exists, commonly used for pre-verification after entering an email or phone number on the login or registration page;</li> <li>ACCOUNT.LOGIN: request to log in to an account;</li> <li>ACCOUNT.REGISTER: request to sign up for a new account;</li> <li>ACCOUNT.RESET_PASSWORD: request to reset the password, usually by verifying identity through email or SMS and then setting a new password;</li> <li>ACCOUNT.UPDATE: request to modify account association information, such as phone number, email, payment card number, shipping address, etc.;</li> <li>ASSET.CHECK_GIFTCARD_BALANCE: request to query the gift card balance by card number and other information;</li> <li>ASSET.CHECK_LOYALTY_POINTS: request to query the account point balance;</li> <li>ASSET.REDEEM_CODE: request to exchange rights and interests using a redemption code;</li> <li>BROWSE.QUERY: request for in-site search of products or services;</li> <li>PAYMENT.ADD_TO_CART: request to add merchandise to the shopping cart;</li> <li>PAYMENT.GET_METHODS: request to obtain the list of payment methods bound to the account;</li> <li>PAYMENT.MAKE_PAYMENT: request to submit a payment, settlement, or fund transfer.</li> </ul>
    */
    @SerializedName("RequestPurpose")
    @Expose
    private String RequestPurpose;

    /**
    * <p>The location of the user identity in the request source, where key is replaced with the actual parameter name.</p><p>Valid values:</p><ul><li>http.request.cookies["key"]: Obtain the Cookie value named key from the Cookie;</li><li>http.request.headers["key"]: Obtain the header value named key from the request header;</li><li>http.request.uri.args["key"]: Obtain the parameter value named key from the URL query parameter.</li></ul>
    */
    @SerializedName("UserIDSource")
    @Expose
    private String UserIDSource;

    /**
    * <p>User Risk Level configuration.</p>
    */
    @SerializedName("UserRiskProfile")
    @Expose
    private UserRiskProfile UserRiskProfile;

    /**
     * Get <p>Account protection feature switch.</p><p>Enumeration values: </p><ul><li>on: Enable;</li><li>off: Disable.</li></ul><p>Default value: off.</p> 
     * @return Enabled <p>Account protection feature switch.</p><p>Enumeration values: </p><ul><li>on: Enable;</li><li>off: Disable.</li></ul><p>Default value: off.</p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Account protection feature switch.</p><p>Enumeration values: </p><ul><li>on: Enable;</li><li>off: Disable.</li></ul><p>Default value: off.</p>
     * @param Enabled <p>Account protection feature switch.</p><p>Enumeration values: </p><ul><li>on: Enable;</li><li>off: Disable.</li></ul><p>Default value: off.</p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Request target. Used to identify the business operation scenario the request belongs to.</p> <p>Enumeration values:</p> <ul> <li>ACCOUNT.CHANGE_PASSWORD: request to change the password when the original password is known;</li> <li>ACCOUNT.CHANGE_SECURITY_QUESTION: request to modify the account security question;</li> <li>ACCOUNT.CHECK_EXISTENCE: request to verify whether the account exists, commonly used for pre-verification after entering an email or phone number on the login or registration page;</li> <li>ACCOUNT.LOGIN: request to log in to an account;</li> <li>ACCOUNT.REGISTER: request to sign up for a new account;</li> <li>ACCOUNT.RESET_PASSWORD: request to reset the password, usually by verifying identity through email or SMS and then setting a new password;</li> <li>ACCOUNT.UPDATE: request to modify account association information, such as phone number, email, payment card number, shipping address, etc.;</li> <li>ASSET.CHECK_GIFTCARD_BALANCE: request to query the gift card balance by card number and other information;</li> <li>ASSET.CHECK_LOYALTY_POINTS: request to query the account point balance;</li> <li>ASSET.REDEEM_CODE: request to exchange rights and interests using a redemption code;</li> <li>BROWSE.QUERY: request for in-site search of products or services;</li> <li>PAYMENT.ADD_TO_CART: request to add merchandise to the shopping cart;</li> <li>PAYMENT.GET_METHODS: request to obtain the list of payment methods bound to the account;</li> <li>PAYMENT.MAKE_PAYMENT: request to submit a payment, settlement, or fund transfer.</li> </ul> 
     * @return RequestPurpose <p>Request target. Used to identify the business operation scenario the request belongs to.</p> <p>Enumeration values:</p> <ul> <li>ACCOUNT.CHANGE_PASSWORD: request to change the password when the original password is known;</li> <li>ACCOUNT.CHANGE_SECURITY_QUESTION: request to modify the account security question;</li> <li>ACCOUNT.CHECK_EXISTENCE: request to verify whether the account exists, commonly used for pre-verification after entering an email or phone number on the login or registration page;</li> <li>ACCOUNT.LOGIN: request to log in to an account;</li> <li>ACCOUNT.REGISTER: request to sign up for a new account;</li> <li>ACCOUNT.RESET_PASSWORD: request to reset the password, usually by verifying identity through email or SMS and then setting a new password;</li> <li>ACCOUNT.UPDATE: request to modify account association information, such as phone number, email, payment card number, shipping address, etc.;</li> <li>ASSET.CHECK_GIFTCARD_BALANCE: request to query the gift card balance by card number and other information;</li> <li>ASSET.CHECK_LOYALTY_POINTS: request to query the account point balance;</li> <li>ASSET.REDEEM_CODE: request to exchange rights and interests using a redemption code;</li> <li>BROWSE.QUERY: request for in-site search of products or services;</li> <li>PAYMENT.ADD_TO_CART: request to add merchandise to the shopping cart;</li> <li>PAYMENT.GET_METHODS: request to obtain the list of payment methods bound to the account;</li> <li>PAYMENT.MAKE_PAYMENT: request to submit a payment, settlement, or fund transfer.</li> </ul>
     */
    public String getRequestPurpose() {
        return this.RequestPurpose;
    }

    /**
     * Set <p>Request target. Used to identify the business operation scenario the request belongs to.</p> <p>Enumeration values:</p> <ul> <li>ACCOUNT.CHANGE_PASSWORD: request to change the password when the original password is known;</li> <li>ACCOUNT.CHANGE_SECURITY_QUESTION: request to modify the account security question;</li> <li>ACCOUNT.CHECK_EXISTENCE: request to verify whether the account exists, commonly used for pre-verification after entering an email or phone number on the login or registration page;</li> <li>ACCOUNT.LOGIN: request to log in to an account;</li> <li>ACCOUNT.REGISTER: request to sign up for a new account;</li> <li>ACCOUNT.RESET_PASSWORD: request to reset the password, usually by verifying identity through email or SMS and then setting a new password;</li> <li>ACCOUNT.UPDATE: request to modify account association information, such as phone number, email, payment card number, shipping address, etc.;</li> <li>ASSET.CHECK_GIFTCARD_BALANCE: request to query the gift card balance by card number and other information;</li> <li>ASSET.CHECK_LOYALTY_POINTS: request to query the account point balance;</li> <li>ASSET.REDEEM_CODE: request to exchange rights and interests using a redemption code;</li> <li>BROWSE.QUERY: request for in-site search of products or services;</li> <li>PAYMENT.ADD_TO_CART: request to add merchandise to the shopping cart;</li> <li>PAYMENT.GET_METHODS: request to obtain the list of payment methods bound to the account;</li> <li>PAYMENT.MAKE_PAYMENT: request to submit a payment, settlement, or fund transfer.</li> </ul>
     * @param RequestPurpose <p>Request target. Used to identify the business operation scenario the request belongs to.</p> <p>Enumeration values:</p> <ul> <li>ACCOUNT.CHANGE_PASSWORD: request to change the password when the original password is known;</li> <li>ACCOUNT.CHANGE_SECURITY_QUESTION: request to modify the account security question;</li> <li>ACCOUNT.CHECK_EXISTENCE: request to verify whether the account exists, commonly used for pre-verification after entering an email or phone number on the login or registration page;</li> <li>ACCOUNT.LOGIN: request to log in to an account;</li> <li>ACCOUNT.REGISTER: request to sign up for a new account;</li> <li>ACCOUNT.RESET_PASSWORD: request to reset the password, usually by verifying identity through email or SMS and then setting a new password;</li> <li>ACCOUNT.UPDATE: request to modify account association information, such as phone number, email, payment card number, shipping address, etc.;</li> <li>ASSET.CHECK_GIFTCARD_BALANCE: request to query the gift card balance by card number and other information;</li> <li>ASSET.CHECK_LOYALTY_POINTS: request to query the account point balance;</li> <li>ASSET.REDEEM_CODE: request to exchange rights and interests using a redemption code;</li> <li>BROWSE.QUERY: request for in-site search of products or services;</li> <li>PAYMENT.ADD_TO_CART: request to add merchandise to the shopping cart;</li> <li>PAYMENT.GET_METHODS: request to obtain the list of payment methods bound to the account;</li> <li>PAYMENT.MAKE_PAYMENT: request to submit a payment, settlement, or fund transfer.</li> </ul>
     */
    public void setRequestPurpose(String RequestPurpose) {
        this.RequestPurpose = RequestPurpose;
    }

    /**
     * Get <p>The location of the user identity in the request source, where key is replaced with the actual parameter name.</p><p>Valid values:</p><ul><li>http.request.cookies["key"]: Obtain the Cookie value named key from the Cookie;</li><li>http.request.headers["key"]: Obtain the header value named key from the request header;</li><li>http.request.uri.args["key"]: Obtain the parameter value named key from the URL query parameter.</li></ul> 
     * @return UserIDSource <p>The location of the user identity in the request source, where key is replaced with the actual parameter name.</p><p>Valid values:</p><ul><li>http.request.cookies["key"]: Obtain the Cookie value named key from the Cookie;</li><li>http.request.headers["key"]: Obtain the header value named key from the request header;</li><li>http.request.uri.args["key"]: Obtain the parameter value named key from the URL query parameter.</li></ul>
     */
    public String getUserIDSource() {
        return this.UserIDSource;
    }

    /**
     * Set <p>The location of the user identity in the request source, where key is replaced with the actual parameter name.</p><p>Valid values:</p><ul><li>http.request.cookies["key"]: Obtain the Cookie value named key from the Cookie;</li><li>http.request.headers["key"]: Obtain the header value named key from the request header;</li><li>http.request.uri.args["key"]: Obtain the parameter value named key from the URL query parameter.</li></ul>
     * @param UserIDSource <p>The location of the user identity in the request source, where key is replaced with the actual parameter name.</p><p>Valid values:</p><ul><li>http.request.cookies["key"]: Obtain the Cookie value named key from the Cookie;</li><li>http.request.headers["key"]: Obtain the header value named key from the request header;</li><li>http.request.uri.args["key"]: Obtain the parameter value named key from the URL query parameter.</li></ul>
     */
    public void setUserIDSource(String UserIDSource) {
        this.UserIDSource = UserIDSource;
    }

    /**
     * Get <p>User Risk Level configuration.</p> 
     * @return UserRiskProfile <p>User Risk Level configuration.</p>
     */
    public UserRiskProfile getUserRiskProfile() {
        return this.UserRiskProfile;
    }

    /**
     * Set <p>User Risk Level configuration.</p>
     * @param UserRiskProfile <p>User Risk Level configuration.</p>
     */
    public void setUserRiskProfile(UserRiskProfile UserRiskProfile) {
        this.UserRiskProfile = UserRiskProfile;
    }

    public AccountProtectionSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountProtectionSettings(AccountProtectionSettings source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.RequestPurpose != null) {
            this.RequestPurpose = new String(source.RequestPurpose);
        }
        if (source.UserIDSource != null) {
            this.UserIDSource = new String(source.UserIDSource);
        }
        if (source.UserRiskProfile != null) {
            this.UserRiskProfile = new UserRiskProfile(source.UserRiskProfile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RequestPurpose", this.RequestPurpose);
        this.setParamSimple(map, prefix + "UserIDSource", this.UserIDSource);
        this.setParamObj(map, prefix + "UserRiskProfile.", this.UserRiskProfile);

    }
}

