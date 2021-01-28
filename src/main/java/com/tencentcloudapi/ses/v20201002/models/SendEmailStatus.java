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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendEmailStatus extends AbstractModel{

    /**
    * `MessageId` field returned by the `SendEmail` API
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * Recipient email address
    */
    @SerializedName("ToEmailAddress")
    @Expose
    private String ToEmailAddress;

    /**
    * Sender email address
    */
    @SerializedName("FromEmailAddress")
    @Expose
    private String FromEmailAddress;

    /**
    * Tencent Cloud processing status:
0: successful.
1001: internal system exception.
1002: internal system exception.
1003: internal system exception.
1003: internal system exception.
1004: email sending timeout.
1005: internal system exception.
1006: you have sent too many emails to the same address in a short period.
1007: the email address is in the blocklist.
1009: internal system exception.
1010: daily email sending limit exceeded.
1011: no permission to send custom content. Use a template.
2001: no results found.
3007: invalid template ID or unavailable template.
3008: template status exception.
3009: no permission to use this template.
3010: the format of the `TemplateData` field is incorrect. 
3014: unable to send the email because the sender domain is not verified.
3020: the recipient email address is in the blocklist.
3024: failed to pre-check the email address format.
3030: email sending is restricted temporarily due to high bounce rate.
3033: the account has insufficient balance or overdue payment.
    */
    @SerializedName("SendStatus")
    @Expose
    private Long SendStatus;

    /**
    * Recipient processing status:
0: Tencent Cloud has accepted the request and added it to the send queue.
1: the email is delivered successfully, `DeliverTime` indicates the time when the email is delivered successfully.
2: the email is discarded. `DeliverMessage` indicates the reason for discarding.
3: the recipient's ESP rejects the email, probably because the email address does not exist or due to other reasons.
8: the email is delayed by the ESP. `DeliverMessage` indicates the reason for delay.
    */
    @SerializedName("DeliverStatus")
    @Expose
    private Long DeliverStatus;

    /**
    * Description of the recipient processing status
    */
    @SerializedName("DeliverMessage")
    @Expose
    private String DeliverMessage;

    /**
    * Timestamp when the request arrives at Tencent Cloud
    */
    @SerializedName("RequestTime")
    @Expose
    private Long RequestTime;

    /**
    * Timestamp when Tencent Cloud delivers the email
    */
    @SerializedName("DeliverTime")
    @Expose
    private Long DeliverTime;

    /**
    * Whether the recipient has opened the email
    */
    @SerializedName("UserOpened")
    @Expose
    private Boolean UserOpened;

    /**
    * Whether the recipient has clicked the links in the email
    */
    @SerializedName("UserClicked")
    @Expose
    private Boolean UserClicked;

    /**
    * Whether the recipient has unsubscribed from emails sent by the sender
    */
    @SerializedName("UserUnsubscribed")
    @Expose
    private Boolean UserUnsubscribed;

    /**
    * Whether the recipient has reported the sender
    */
    @SerializedName("UserComplainted")
    @Expose
    private Boolean UserComplainted;

    /**
     * Get `MessageId` field returned by the `SendEmail` API 
     * @return MessageId `MessageId` field returned by the `SendEmail` API
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set `MessageId` field returned by the `SendEmail` API
     * @param MessageId `MessageId` field returned by the `SendEmail` API
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get Recipient email address 
     * @return ToEmailAddress Recipient email address
     */
    public String getToEmailAddress() {
        return this.ToEmailAddress;
    }

    /**
     * Set Recipient email address
     * @param ToEmailAddress Recipient email address
     */
    public void setToEmailAddress(String ToEmailAddress) {
        this.ToEmailAddress = ToEmailAddress;
    }

    /**
     * Get Sender email address 
     * @return FromEmailAddress Sender email address
     */
    public String getFromEmailAddress() {
        return this.FromEmailAddress;
    }

    /**
     * Set Sender email address
     * @param FromEmailAddress Sender email address
     */
    public void setFromEmailAddress(String FromEmailAddress) {
        this.FromEmailAddress = FromEmailAddress;
    }

    /**
     * Get Tencent Cloud processing status:
0: successful.
1001: internal system exception.
1002: internal system exception.
1003: internal system exception.
1003: internal system exception.
1004: email sending timeout.
1005: internal system exception.
1006: you have sent too many emails to the same address in a short period.
1007: the email address is in the blocklist.
1009: internal system exception.
1010: daily email sending limit exceeded.
1011: no permission to send custom content. Use a template.
2001: no results found.
3007: invalid template ID or unavailable template.
3008: template status exception.
3009: no permission to use this template.
3010: the format of the `TemplateData` field is incorrect. 
3014: unable to send the email because the sender domain is not verified.
3020: the recipient email address is in the blocklist.
3024: failed to pre-check the email address format.
3030: email sending is restricted temporarily due to high bounce rate.
3033: the account has insufficient balance or overdue payment. 
     * @return SendStatus Tencent Cloud processing status:
0: successful.
1001: internal system exception.
1002: internal system exception.
1003: internal system exception.
1003: internal system exception.
1004: email sending timeout.
1005: internal system exception.
1006: you have sent too many emails to the same address in a short period.
1007: the email address is in the blocklist.
1009: internal system exception.
1010: daily email sending limit exceeded.
1011: no permission to send custom content. Use a template.
2001: no results found.
3007: invalid template ID or unavailable template.
3008: template status exception.
3009: no permission to use this template.
3010: the format of the `TemplateData` field is incorrect. 
3014: unable to send the email because the sender domain is not verified.
3020: the recipient email address is in the blocklist.
3024: failed to pre-check the email address format.
3030: email sending is restricted temporarily due to high bounce rate.
3033: the account has insufficient balance or overdue payment.
     */
    public Long getSendStatus() {
        return this.SendStatus;
    }

    /**
     * Set Tencent Cloud processing status:
0: successful.
1001: internal system exception.
1002: internal system exception.
1003: internal system exception.
1003: internal system exception.
1004: email sending timeout.
1005: internal system exception.
1006: you have sent too many emails to the same address in a short period.
1007: the email address is in the blocklist.
1009: internal system exception.
1010: daily email sending limit exceeded.
1011: no permission to send custom content. Use a template.
2001: no results found.
3007: invalid template ID or unavailable template.
3008: template status exception.
3009: no permission to use this template.
3010: the format of the `TemplateData` field is incorrect. 
3014: unable to send the email because the sender domain is not verified.
3020: the recipient email address is in the blocklist.
3024: failed to pre-check the email address format.
3030: email sending is restricted temporarily due to high bounce rate.
3033: the account has insufficient balance or overdue payment.
     * @param SendStatus Tencent Cloud processing status:
0: successful.
1001: internal system exception.
1002: internal system exception.
1003: internal system exception.
1003: internal system exception.
1004: email sending timeout.
1005: internal system exception.
1006: you have sent too many emails to the same address in a short period.
1007: the email address is in the blocklist.
1009: internal system exception.
1010: daily email sending limit exceeded.
1011: no permission to send custom content. Use a template.
2001: no results found.
3007: invalid template ID or unavailable template.
3008: template status exception.
3009: no permission to use this template.
3010: the format of the `TemplateData` field is incorrect. 
3014: unable to send the email because the sender domain is not verified.
3020: the recipient email address is in the blocklist.
3024: failed to pre-check the email address format.
3030: email sending is restricted temporarily due to high bounce rate.
3033: the account has insufficient balance or overdue payment.
     */
    public void setSendStatus(Long SendStatus) {
        this.SendStatus = SendStatus;
    }

    /**
     * Get Recipient processing status:
0: Tencent Cloud has accepted the request and added it to the send queue.
1: the email is delivered successfully, `DeliverTime` indicates the time when the email is delivered successfully.
2: the email is discarded. `DeliverMessage` indicates the reason for discarding.
3: the recipient's ESP rejects the email, probably because the email address does not exist or due to other reasons.
8: the email is delayed by the ESP. `DeliverMessage` indicates the reason for delay. 
     * @return DeliverStatus Recipient processing status:
0: Tencent Cloud has accepted the request and added it to the send queue.
1: the email is delivered successfully, `DeliverTime` indicates the time when the email is delivered successfully.
2: the email is discarded. `DeliverMessage` indicates the reason for discarding.
3: the recipient's ESP rejects the email, probably because the email address does not exist or due to other reasons.
8: the email is delayed by the ESP. `DeliverMessage` indicates the reason for delay.
     */
    public Long getDeliverStatus() {
        return this.DeliverStatus;
    }

    /**
     * Set Recipient processing status:
0: Tencent Cloud has accepted the request and added it to the send queue.
1: the email is delivered successfully, `DeliverTime` indicates the time when the email is delivered successfully.
2: the email is discarded. `DeliverMessage` indicates the reason for discarding.
3: the recipient's ESP rejects the email, probably because the email address does not exist or due to other reasons.
8: the email is delayed by the ESP. `DeliverMessage` indicates the reason for delay.
     * @param DeliverStatus Recipient processing status:
0: Tencent Cloud has accepted the request and added it to the send queue.
1: the email is delivered successfully, `DeliverTime` indicates the time when the email is delivered successfully.
2: the email is discarded. `DeliverMessage` indicates the reason for discarding.
3: the recipient's ESP rejects the email, probably because the email address does not exist or due to other reasons.
8: the email is delayed by the ESP. `DeliverMessage` indicates the reason for delay.
     */
    public void setDeliverStatus(Long DeliverStatus) {
        this.DeliverStatus = DeliverStatus;
    }

    /**
     * Get Description of the recipient processing status 
     * @return DeliverMessage Description of the recipient processing status
     */
    public String getDeliverMessage() {
        return this.DeliverMessage;
    }

    /**
     * Set Description of the recipient processing status
     * @param DeliverMessage Description of the recipient processing status
     */
    public void setDeliverMessage(String DeliverMessage) {
        this.DeliverMessage = DeliverMessage;
    }

    /**
     * Get Timestamp when the request arrives at Tencent Cloud 
     * @return RequestTime Timestamp when the request arrives at Tencent Cloud
     */
    public Long getRequestTime() {
        return this.RequestTime;
    }

    /**
     * Set Timestamp when the request arrives at Tencent Cloud
     * @param RequestTime Timestamp when the request arrives at Tencent Cloud
     */
    public void setRequestTime(Long RequestTime) {
        this.RequestTime = RequestTime;
    }

    /**
     * Get Timestamp when Tencent Cloud delivers the email 
     * @return DeliverTime Timestamp when Tencent Cloud delivers the email
     */
    public Long getDeliverTime() {
        return this.DeliverTime;
    }

    /**
     * Set Timestamp when Tencent Cloud delivers the email
     * @param DeliverTime Timestamp when Tencent Cloud delivers the email
     */
    public void setDeliverTime(Long DeliverTime) {
        this.DeliverTime = DeliverTime;
    }

    /**
     * Get Whether the recipient has opened the email 
     * @return UserOpened Whether the recipient has opened the email
     */
    public Boolean getUserOpened() {
        return this.UserOpened;
    }

    /**
     * Set Whether the recipient has opened the email
     * @param UserOpened Whether the recipient has opened the email
     */
    public void setUserOpened(Boolean UserOpened) {
        this.UserOpened = UserOpened;
    }

    /**
     * Get Whether the recipient has clicked the links in the email 
     * @return UserClicked Whether the recipient has clicked the links in the email
     */
    public Boolean getUserClicked() {
        return this.UserClicked;
    }

    /**
     * Set Whether the recipient has clicked the links in the email
     * @param UserClicked Whether the recipient has clicked the links in the email
     */
    public void setUserClicked(Boolean UserClicked) {
        this.UserClicked = UserClicked;
    }

    /**
     * Get Whether the recipient has unsubscribed from emails sent by the sender 
     * @return UserUnsubscribed Whether the recipient has unsubscribed from emails sent by the sender
     */
    public Boolean getUserUnsubscribed() {
        return this.UserUnsubscribed;
    }

    /**
     * Set Whether the recipient has unsubscribed from emails sent by the sender
     * @param UserUnsubscribed Whether the recipient has unsubscribed from emails sent by the sender
     */
    public void setUserUnsubscribed(Boolean UserUnsubscribed) {
        this.UserUnsubscribed = UserUnsubscribed;
    }

    /**
     * Get Whether the recipient has reported the sender 
     * @return UserComplainted Whether the recipient has reported the sender
     */
    public Boolean getUserComplainted() {
        return this.UserComplainted;
    }

    /**
     * Set Whether the recipient has reported the sender
     * @param UserComplainted Whether the recipient has reported the sender
     */
    public void setUserComplainted(Boolean UserComplainted) {
        this.UserComplainted = UserComplainted;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "ToEmailAddress", this.ToEmailAddress);
        this.setParamSimple(map, prefix + "FromEmailAddress", this.FromEmailAddress);
        this.setParamSimple(map, prefix + "SendStatus", this.SendStatus);
        this.setParamSimple(map, prefix + "DeliverStatus", this.DeliverStatus);
        this.setParamSimple(map, prefix + "DeliverMessage", this.DeliverMessage);
        this.setParamSimple(map, prefix + "RequestTime", this.RequestTime);
        this.setParamSimple(map, prefix + "DeliverTime", this.DeliverTime);
        this.setParamSimple(map, prefix + "UserOpened", this.UserOpened);
        this.setParamSimple(map, prefix + "UserClicked", this.UserClicked);
        this.setParamSimple(map, prefix + "UserUnsubscribed", this.UserUnsubscribed);
        this.setParamSimple(map, prefix + "UserComplainted", this.UserComplainted);

    }
}

