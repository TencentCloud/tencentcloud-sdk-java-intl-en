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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class User extends AbstractModel {

    /**
    * This field indicates the service subscriber ID. This ID can be used to optimize the moderation result judgment based on the account's violation records, which is helpful for auxiliary judgment when there is a risk of suspected violations.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * This field indicates the account nickname information of the service subscriber.
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * This field indicates the account type corresponding to the service subscriber ID.<br>
Use this field and the account ID (UserId) together to determine a unique account.
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * This field indicates the gender information of the service subscriber's account.<br>
Values: **0** (default value, indicating the gender is unknown), **1** (male) and **2** (female).
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * This field indicates the age information of the service subscriber's account.<br>
Values: Integers between **0** (default value, indicating that the age is unknown) and the number of (**custom maximum age**).
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * This field indicates the level information of the service subscriber's account.<br>
Values: **0** (default value, indicating that the level is unknown), **1** (lower level), **2** (medium level) and **3** (higher level). Currently, **custom levels are not supported**.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * This field indicates the mobile phone number information of the service subscriber's account. The mobile phone numbers in various regions of the world can be recorded.<br>
Note: Please keep the format of mobile phone number uniform. For example, uniformly use the area code format (086/+86), etc.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * This field indicates the URL of the service subscriber's profile photos formatted with .png, .jpg, .jpeg, .bmp, .gif and .webp.
Note: Up to 5 MB is supported, and the minimum resolution is 256 x 256. When it takes more than 3 seconds to download, the "download timeout" is returned.
    */
    @SerializedName("HeadUrl")
    @Expose
    private String HeadUrl;

    /**
    * This field indicates the profile information of service subscribers. It can contain up to 5,000 characters, including Chinese characters, letters and special symbols.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Room ID of the group chat.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Receiver ID.
    */
    @SerializedName("ReceiverId")
    @Expose
    private String ReceiverId;

    /**
    * Generation time of the message, in ms.
    */
    @SerializedName("SendTime")
    @Expose
    private Long SendTime;

    /**
     * Get This field indicates the service subscriber ID. This ID can be used to optimize the moderation result judgment based on the account's violation records, which is helpful for auxiliary judgment when there is a risk of suspected violations. 
     * @return UserId This field indicates the service subscriber ID. This ID can be used to optimize the moderation result judgment based on the account's violation records, which is helpful for auxiliary judgment when there is a risk of suspected violations.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set This field indicates the service subscriber ID. This ID can be used to optimize the moderation result judgment based on the account's violation records, which is helpful for auxiliary judgment when there is a risk of suspected violations.
     * @param UserId This field indicates the service subscriber ID. This ID can be used to optimize the moderation result judgment based on the account's violation records, which is helpful for auxiliary judgment when there is a risk of suspected violations.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get This field indicates the account nickname information of the service subscriber. 
     * @return Nickname This field indicates the account nickname information of the service subscriber.
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set This field indicates the account nickname information of the service subscriber.
     * @param Nickname This field indicates the account nickname information of the service subscriber.
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get This field indicates the account type corresponding to the service subscriber ID.<br>
Use this field and the account ID (UserId) together to determine a unique account. 
     * @return AccountType This field indicates the account type corresponding to the service subscriber ID.<br>
Use this field and the account ID (UserId) together to determine a unique account.
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set This field indicates the account type corresponding to the service subscriber ID.<br>
Use this field and the account ID (UserId) together to determine a unique account.
     * @param AccountType This field indicates the account type corresponding to the service subscriber ID.<br>
Use this field and the account ID (UserId) together to determine a unique account.
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get This field indicates the gender information of the service subscriber's account.<br>
Values: **0** (default value, indicating the gender is unknown), **1** (male) and **2** (female). 
     * @return Gender This field indicates the gender information of the service subscriber's account.<br>
Values: **0** (default value, indicating the gender is unknown), **1** (male) and **2** (female).
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set This field indicates the gender information of the service subscriber's account.<br>
Values: **0** (default value, indicating the gender is unknown), **1** (male) and **2** (female).
     * @param Gender This field indicates the gender information of the service subscriber's account.<br>
Values: **0** (default value, indicating the gender is unknown), **1** (male) and **2** (female).
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get This field indicates the age information of the service subscriber's account.<br>
Values: Integers between **0** (default value, indicating that the age is unknown) and the number of (**custom maximum age**). 
     * @return Age This field indicates the age information of the service subscriber's account.<br>
Values: Integers between **0** (default value, indicating that the age is unknown) and the number of (**custom maximum age**).
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set This field indicates the age information of the service subscriber's account.<br>
Values: Integers between **0** (default value, indicating that the age is unknown) and the number of (**custom maximum age**).
     * @param Age This field indicates the age information of the service subscriber's account.<br>
Values: Integers between **0** (default value, indicating that the age is unknown) and the number of (**custom maximum age**).
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get This field indicates the level information of the service subscriber's account.<br>
Values: **0** (default value, indicating that the level is unknown), **1** (lower level), **2** (medium level) and **3** (higher level). Currently, **custom levels are not supported**. 
     * @return Level This field indicates the level information of the service subscriber's account.<br>
Values: **0** (default value, indicating that the level is unknown), **1** (lower level), **2** (medium level) and **3** (higher level). Currently, **custom levels are not supported**.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set This field indicates the level information of the service subscriber's account.<br>
Values: **0** (default value, indicating that the level is unknown), **1** (lower level), **2** (medium level) and **3** (higher level). Currently, **custom levels are not supported**.
     * @param Level This field indicates the level information of the service subscriber's account.<br>
Values: **0** (default value, indicating that the level is unknown), **1** (lower level), **2** (medium level) and **3** (higher level). Currently, **custom levels are not supported**.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get This field indicates the mobile phone number information of the service subscriber's account. The mobile phone numbers in various regions of the world can be recorded.<br>
Note: Please keep the format of mobile phone number uniform. For example, uniformly use the area code format (086/+86), etc. 
     * @return Phone This field indicates the mobile phone number information of the service subscriber's account. The mobile phone numbers in various regions of the world can be recorded.<br>
Note: Please keep the format of mobile phone number uniform. For example, uniformly use the area code format (086/+86), etc.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set This field indicates the mobile phone number information of the service subscriber's account. The mobile phone numbers in various regions of the world can be recorded.<br>
Note: Please keep the format of mobile phone number uniform. For example, uniformly use the area code format (086/+86), etc.
     * @param Phone This field indicates the mobile phone number information of the service subscriber's account. The mobile phone numbers in various regions of the world can be recorded.<br>
Note: Please keep the format of mobile phone number uniform. For example, uniformly use the area code format (086/+86), etc.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get This field indicates the URL of the service subscriber's profile photos formatted with .png, .jpg, .jpeg, .bmp, .gif and .webp.
Note: Up to 5 MB is supported, and the minimum resolution is 256 x 256. When it takes more than 3 seconds to download, the "download timeout" is returned. 
     * @return HeadUrl This field indicates the URL of the service subscriber's profile photos formatted with .png, .jpg, .jpeg, .bmp, .gif and .webp.
Note: Up to 5 MB is supported, and the minimum resolution is 256 x 256. When it takes more than 3 seconds to download, the "download timeout" is returned.
     */
    public String getHeadUrl() {
        return this.HeadUrl;
    }

    /**
     * Set This field indicates the URL of the service subscriber's profile photos formatted with .png, .jpg, .jpeg, .bmp, .gif and .webp.
Note: Up to 5 MB is supported, and the minimum resolution is 256 x 256. When it takes more than 3 seconds to download, the "download timeout" is returned.
     * @param HeadUrl This field indicates the URL of the service subscriber's profile photos formatted with .png, .jpg, .jpeg, .bmp, .gif and .webp.
Note: Up to 5 MB is supported, and the minimum resolution is 256 x 256. When it takes more than 3 seconds to download, the "download timeout" is returned.
     */
    public void setHeadUrl(String HeadUrl) {
        this.HeadUrl = HeadUrl;
    }

    /**
     * Get This field indicates the profile information of service subscribers. It can contain up to 5,000 characters, including Chinese characters, letters and special symbols. 
     * @return Desc This field indicates the profile information of service subscribers. It can contain up to 5,000 characters, including Chinese characters, letters and special symbols.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set This field indicates the profile information of service subscribers. It can contain up to 5,000 characters, including Chinese characters, letters and special symbols.
     * @param Desc This field indicates the profile information of service subscribers. It can contain up to 5,000 characters, including Chinese characters, letters and special symbols.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Room ID of the group chat. 
     * @return RoomId Room ID of the group chat.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID of the group chat.
     * @param RoomId Room ID of the group chat.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Receiver ID. 
     * @return ReceiverId Receiver ID.
     */
    public String getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set Receiver ID.
     * @param ReceiverId Receiver ID.
     */
    public void setReceiverId(String ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get Generation time of the message, in ms. 
     * @return SendTime Generation time of the message, in ms.
     */
    public Long getSendTime() {
        return this.SendTime;
    }

    /**
     * Set Generation time of the message, in ms.
     * @param SendTime Generation time of the message, in ms.
     */
    public void setSendTime(Long SendTime) {
        this.SendTime = SendTime;
    }

    public User() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public User(User source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.Age != null) {
            this.Age = new Long(source.Age);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.HeadUrl != null) {
            this.HeadUrl = new String(source.HeadUrl);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.ReceiverId != null) {
            this.ReceiverId = new String(source.ReceiverId);
        }
        if (source.SendTime != null) {
            this.SendTime = new Long(source.SendTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "HeadUrl", this.HeadUrl);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "SendTime", this.SendTime);

    }
}

