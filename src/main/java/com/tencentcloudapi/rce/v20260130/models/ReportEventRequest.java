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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportEventRequest extends AbstractModel {

    /**
    * <p>Event code. Used to specify the scenario node for business access.</p><p> Standard events under the account protection product include:</p><ul><li> login: Log in<p></p></li> <li>register: Register </li><li>sms: SMS </li><li>logout: Log out </li><li>modify_account: Modify account </li><li>modify_password: Modify password </li><li>security_verification: Security verification</li></ul><p>Standard events under the payment protection product include:</p><ul><li>create_order: Create an order</li><li>transaction: Transaction</li><li>charge_back: Chargeback</li></ul><p>Standard events under the promotion protection product include:</p><ul><li>add_promotion: Participate in promotions </li><li>redeem: Redeem a prize </li><li>withdraw: Withdraw</li><li>cust_event: Custom event, cust_xxx </li><li>scan_code: Scan a code </li><li>lucky_draw: Lucky draw </li><li>task: Complete a task </li><li>invitation: Invitation </li><li>claim_red_packet: Receive a red packet </li><li>browse: Browse</li></ul><p>Custom events can be evaluated for risk based on an agreement with RCE</p>
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * <p>The time when the event occurred</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with the ISO 8601 standard</p>
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * <p>The user's current session ID used to associate with the actions before and after logging in. If UserId is not passed, SessionId is required. If missing, an empty string can be filled.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>The token provided by the SDK integrated in your web site or application</p>
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
    * <p>User client IP address (IPv4 or IPv6)</p>
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * <p>Event details, import corresponding event information based on the event code you input</p>
    */
    @SerializedName("EventDetail")
    @Expose
    private EventDetail EventDetail;

    /**
    * <p>The user's account ID in your system</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>Email of the user</p>
    */
    @SerializedName("UserEmail")
    @Expose
    private String UserEmail;

    /**
    * <p>Phone number of the user</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number</p>
    */
    @SerializedName("UserPhone")
    @Expose
    private String UserPhone;

    /**
    * <p>The details of the browser. If you've already integrated our device SDK, this field is not required</p>
    */
    @SerializedName("Browser")
    @Expose
    private Browser Browser;

    /**
    * <p>The details of the app, os and device.If you've already integrated our device SDK, this field is not required</p>
    */
    @SerializedName("App")
    @Expose
    private App App;

    /**
     * Get <p>Event code. Used to specify the scenario node for business access.</p><p> Standard events under the account protection product include:</p><ul><li> login: Log in<p></p></li> <li>register: Register </li><li>sms: SMS </li><li>logout: Log out </li><li>modify_account: Modify account </li><li>modify_password: Modify password </li><li>security_verification: Security verification</li></ul><p>Standard events under the payment protection product include:</p><ul><li>create_order: Create an order</li><li>transaction: Transaction</li><li>charge_back: Chargeback</li></ul><p>Standard events under the promotion protection product include:</p><ul><li>add_promotion: Participate in promotions </li><li>redeem: Redeem a prize </li><li>withdraw: Withdraw</li><li>cust_event: Custom event, cust_xxx </li><li>scan_code: Scan a code </li><li>lucky_draw: Lucky draw </li><li>task: Complete a task </li><li>invitation: Invitation </li><li>claim_red_packet: Receive a red packet </li><li>browse: Browse</li></ul><p>Custom events can be evaluated for risk based on an agreement with RCE</p> 
     * @return EventCode <p>Event code. Used to specify the scenario node for business access.</p><p> Standard events under the account protection product include:</p><ul><li> login: Log in<p></p></li> <li>register: Register </li><li>sms: SMS </li><li>logout: Log out </li><li>modify_account: Modify account </li><li>modify_password: Modify password </li><li>security_verification: Security verification</li></ul><p>Standard events under the payment protection product include:</p><ul><li>create_order: Create an order</li><li>transaction: Transaction</li><li>charge_back: Chargeback</li></ul><p>Standard events under the promotion protection product include:</p><ul><li>add_promotion: Participate in promotions </li><li>redeem: Redeem a prize </li><li>withdraw: Withdraw</li><li>cust_event: Custom event, cust_xxx </li><li>scan_code: Scan a code </li><li>lucky_draw: Lucky draw </li><li>task: Complete a task </li><li>invitation: Invitation </li><li>claim_red_packet: Receive a red packet </li><li>browse: Browse</li></ul><p>Custom events can be evaluated for risk based on an agreement with RCE</p>
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set <p>Event code. Used to specify the scenario node for business access.</p><p> Standard events under the account protection product include:</p><ul><li> login: Log in<p></p></li> <li>register: Register </li><li>sms: SMS </li><li>logout: Log out </li><li>modify_account: Modify account </li><li>modify_password: Modify password </li><li>security_verification: Security verification</li></ul><p>Standard events under the payment protection product include:</p><ul><li>create_order: Create an order</li><li>transaction: Transaction</li><li>charge_back: Chargeback</li></ul><p>Standard events under the promotion protection product include:</p><ul><li>add_promotion: Participate in promotions </li><li>redeem: Redeem a prize </li><li>withdraw: Withdraw</li><li>cust_event: Custom event, cust_xxx </li><li>scan_code: Scan a code </li><li>lucky_draw: Lucky draw </li><li>task: Complete a task </li><li>invitation: Invitation </li><li>claim_red_packet: Receive a red packet </li><li>browse: Browse</li></ul><p>Custom events can be evaluated for risk based on an agreement with RCE</p>
     * @param EventCode <p>Event code. Used to specify the scenario node for business access.</p><p> Standard events under the account protection product include:</p><ul><li> login: Log in<p></p></li> <li>register: Register </li><li>sms: SMS </li><li>logout: Log out </li><li>modify_account: Modify account </li><li>modify_password: Modify password </li><li>security_verification: Security verification</li></ul><p>Standard events under the payment protection product include:</p><ul><li>create_order: Create an order</li><li>transaction: Transaction</li><li>charge_back: Chargeback</li></ul><p>Standard events under the promotion protection product include:</p><ul><li>add_promotion: Participate in promotions </li><li>redeem: Redeem a prize </li><li>withdraw: Withdraw</li><li>cust_event: Custom event, cust_xxx </li><li>scan_code: Scan a code </li><li>lucky_draw: Lucky draw </li><li>task: Complete a task </li><li>invitation: Invitation </li><li>claim_red_packet: Receive a red packet </li><li>browse: Browse</li></ul><p>Custom events can be evaluated for risk based on an agreement with RCE</p>
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get <p>The time when the event occurred</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with the ISO 8601 standard</p> 
     * @return EventTime <p>The time when the event occurred</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with the ISO 8601 standard</p>
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set <p>The time when the event occurred</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with the ISO 8601 standard</p>
     * @param EventTime <p>The time when the event occurred</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with the ISO 8601 standard</p>
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get <p>The user's current session ID used to associate with the actions before and after logging in. If UserId is not passed, SessionId is required. If missing, an empty string can be filled.</p> 
     * @return SessionId <p>The user's current session ID used to associate with the actions before and after logging in. If UserId is not passed, SessionId is required. If missing, an empty string can be filled.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>The user's current session ID used to associate with the actions before and after logging in. If UserId is not passed, SessionId is required. If missing, an empty string can be filled.</p>
     * @param SessionId <p>The user's current session ID used to associate with the actions before and after logging in. If UserId is not passed, SessionId is required. If missing, an empty string can be filled.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>The token provided by the SDK integrated in your web site or application</p> 
     * @return DeviceToken <p>The token provided by the SDK integrated in your web site or application</p>
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set <p>The token provided by the SDK integrated in your web site or application</p>
     * @param DeviceToken <p>The token provided by the SDK integrated in your web site or application</p>
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    /**
     * Get <p>User client IP address (IPv4 or IPv6)</p> 
     * @return UserIp <p>User client IP address (IPv4 or IPv6)</p>
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set <p>User client IP address (IPv4 or IPv6)</p>
     * @param UserIp <p>User client IP address (IPv4 or IPv6)</p>
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get <p>Event details, import corresponding event information based on the event code you input</p> 
     * @return EventDetail <p>Event details, import corresponding event information based on the event code you input</p>
     */
    public EventDetail getEventDetail() {
        return this.EventDetail;
    }

    /**
     * Set <p>Event details, import corresponding event information based on the event code you input</p>
     * @param EventDetail <p>Event details, import corresponding event information based on the event code you input</p>
     */
    public void setEventDetail(EventDetail EventDetail) {
        this.EventDetail = EventDetail;
    }

    /**
     * Get <p>The user's account ID in your system</p> 
     * @return UserId <p>The user's account ID in your system</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>The user's account ID in your system</p>
     * @param UserId <p>The user's account ID in your system</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>Email of the user</p> 
     * @return UserEmail <p>Email of the user</p>
     */
    public String getUserEmail() {
        return this.UserEmail;
    }

    /**
     * Set <p>Email of the user</p>
     * @param UserEmail <p>Email of the user</p>
     */
    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    /**
     * Get <p>Phone number of the user</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number</p> 
     * @return UserPhone <p>Phone number of the user</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number</p>
     */
    public String getUserPhone() {
        return this.UserPhone;
    }

    /**
     * Set <p>Phone number of the user</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number</p>
     * @param UserPhone <p>Phone number of the user</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number</p>
     */
    public void setUserPhone(String UserPhone) {
        this.UserPhone = UserPhone;
    }

    /**
     * Get <p>The details of the browser. If you've already integrated our device SDK, this field is not required</p> 
     * @return Browser <p>The details of the browser. If you've already integrated our device SDK, this field is not required</p>
     */
    public Browser getBrowser() {
        return this.Browser;
    }

    /**
     * Set <p>The details of the browser. If you've already integrated our device SDK, this field is not required</p>
     * @param Browser <p>The details of the browser. If you've already integrated our device SDK, this field is not required</p>
     */
    public void setBrowser(Browser Browser) {
        this.Browser = Browser;
    }

    /**
     * Get <p>The details of the app, os and device.If you've already integrated our device SDK, this field is not required</p> 
     * @return App <p>The details of the app, os and device.If you've already integrated our device SDK, this field is not required</p>
     */
    public App getApp() {
        return this.App;
    }

    /**
     * Set <p>The details of the app, os and device.If you've already integrated our device SDK, this field is not required</p>
     * @param App <p>The details of the app, os and device.If you've already integrated our device SDK, this field is not required</p>
     */
    public void setApp(App App) {
        this.App = App;
    }

    public ReportEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportEventRequest(ReportEventRequest source) {
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.DeviceToken != null) {
            this.DeviceToken = new String(source.DeviceToken);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.EventDetail != null) {
            this.EventDetail = new EventDetail(source.EventDetail);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserEmail != null) {
            this.UserEmail = new String(source.UserEmail);
        }
        if (source.UserPhone != null) {
            this.UserPhone = new String(source.UserPhone);
        }
        if (source.Browser != null) {
            this.Browser = new Browser(source.Browser);
        }
        if (source.App != null) {
            this.App = new App(source.App);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamObj(map, prefix + "EventDetail.", this.EventDetail);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserEmail", this.UserEmail);
        this.setParamSimple(map, prefix + "UserPhone", this.UserPhone);
        this.setParamObj(map, prefix + "Browser.", this.Browser);
        this.setParamObj(map, prefix + "App.", this.App);

    }
}

