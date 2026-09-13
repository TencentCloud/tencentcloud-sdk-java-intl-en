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

public class SMSEvent extends AbstractModel {

    /**
    * <p>The detail information of the user</p>
    */
    @SerializedName("UserInfo")
    @Expose
    private User UserInfo;

    /**
    * <p>The unique ID of the sms</p>
    */
    @SerializedName("SMSId")
    @Expose
    private String SMSId;

    /**
    * <p>The time that the user received the sms</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601 standard</p>
    */
    @SerializedName("ReceivedTime")
    @Expose
    private String ReceivedTime;

    /**
    * <p>The action of the user after receiving the sms</p><ul><li>no_action: No action from the user</li><li>safe: User confirmation of the correct person's action</li><li>compromised: Feedback from real users indicates third-party action</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>The result of the sms</p>
    */
    @SerializedName("SMSResult")
    @Expose
    private Result SMSResult;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>The detail information of the user</p> 
     * @return UserInfo <p>The detail information of the user</p>
     */
    public User getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set <p>The detail information of the user</p>
     * @param UserInfo <p>The detail information of the user</p>
     */
    public void setUserInfo(User UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get <p>The unique ID of the sms</p> 
     * @return SMSId <p>The unique ID of the sms</p>
     */
    public String getSMSId() {
        return this.SMSId;
    }

    /**
     * Set <p>The unique ID of the sms</p>
     * @param SMSId <p>The unique ID of the sms</p>
     */
    public void setSMSId(String SMSId) {
        this.SMSId = SMSId;
    }

    /**
     * Get <p>The time that the user received the sms</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601 standard</p> 
     * @return ReceivedTime <p>The time that the user received the sms</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601 standard</p>
     */
    public String getReceivedTime() {
        return this.ReceivedTime;
    }

    /**
     * Set <p>The time that the user received the sms</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601 standard</p>
     * @param ReceivedTime <p>The time that the user received the sms</p><p>Parameter format: Millisecond-level time with UTC time zone compliant with ISO 8601 standard</p>
     */
    public void setReceivedTime(String ReceivedTime) {
        this.ReceivedTime = ReceivedTime;
    }

    /**
     * Get <p>The action of the user after receiving the sms</p><ul><li>no_action: No action from the user</li><li>safe: User confirmation of the correct person's action</li><li>compromised: Feedback from real users indicates third-party action</li></ul> 
     * @return Action <p>The action of the user after receiving the sms</p><ul><li>no_action: No action from the user</li><li>safe: User confirmation of the correct person's action</li><li>compromised: Feedback from real users indicates third-party action</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>The action of the user after receiving the sms</p><ul><li>no_action: No action from the user</li><li>safe: User confirmation of the correct person's action</li><li>compromised: Feedback from real users indicates third-party action</li></ul>
     * @param Action <p>The action of the user after receiving the sms</p><ul><li>no_action: No action from the user</li><li>safe: User confirmation of the correct person's action</li><li>compromised: Feedback from real users indicates third-party action</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>The result of the sms</p> 
     * @return SMSResult <p>The result of the sms</p>
     */
    public Result getSMSResult() {
        return this.SMSResult;
    }

    /**
     * Set <p>The result of the sms</p>
     * @param SMSResult <p>The result of the sms</p>
     */
    public void setSMSResult(Result SMSResult) {
        this.SMSResult = SMSResult;
    }

    /**
     * Get <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p> 
     * @return Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     * @param Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public SMSEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SMSEvent(SMSEvent source) {
        if (source.UserInfo != null) {
            this.UserInfo = new User(source.UserInfo);
        }
        if (source.SMSId != null) {
            this.SMSId = new String(source.SMSId);
        }
        if (source.ReceivedTime != null) {
            this.ReceivedTime = new String(source.ReceivedTime);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.SMSResult != null) {
            this.SMSResult = new Result(source.SMSResult);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "SMSId", this.SMSId);
        this.setParamSimple(map, prefix + "ReceivedTime", this.ReceivedTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamObj(map, prefix + "SMSResult.", this.SMSResult);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

