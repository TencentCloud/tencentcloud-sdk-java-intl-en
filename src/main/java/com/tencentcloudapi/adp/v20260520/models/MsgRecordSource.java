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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MsgRecordSource extends AbstractModel {

    /**
    * Channel type for dialogue message access: 0=not specified, 1=agent, 2=experience page (Tencent Cloud), 3=evaluation dialogue, 4=experience page (phone number), 5=dialogue API connection, 6=evaluation task dialogue, 10=workflow debugging, 10000=WeChat official account, 10001=WeChat service account, 10002=WeCom app, 10003=web components, 10004=WeChat Customer Service, 10005=WeChat mini program, 10006=Yuanqi, 10007=App Treasure, 10008=Yuanbao, 10009=WeCom intelligent bot, 10010=Yuanqi API, 10011=LINE, 10012=Telegram, 10100=PC manager, 20001=honor Intelligent Agent platform, 20002=Xiaomi app store; user_id (string) is the unique ID of the visitor under this channel.
    */
    @SerializedName("ChannelType")
    @Expose
    private Long ChannelType;

    /**
    * User ID.
    */
    @SerializedName("FromId")
    @Expose
    private String FromId;

    /**
    * User source type of the message sender: 1=user (visitor/C-end user), 2=robot (AI reply), 3=agent (human customer service); from_id (string) is the unique user ID under this source type.
    */
    @SerializedName("FromType")
    @Expose
    private Long FromType;

    /**
    * User profile photo
    */
    @SerializedName("UserAvatar")
    @Expose
    private String UserAvatar;

    /**
    * Visitor ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Visitor name
    */
    @SerializedName("UserNickname")
    @Expose
    private String UserNickname;

    /**
     * Get Channel type for dialogue message access: 0=not specified, 1=agent, 2=experience page (Tencent Cloud), 3=evaluation dialogue, 4=experience page (phone number), 5=dialogue API connection, 6=evaluation task dialogue, 10=workflow debugging, 10000=WeChat official account, 10001=WeChat service account, 10002=WeCom app, 10003=web components, 10004=WeChat Customer Service, 10005=WeChat mini program, 10006=Yuanqi, 10007=App Treasure, 10008=Yuanbao, 10009=WeCom intelligent bot, 10010=Yuanqi API, 10011=LINE, 10012=Telegram, 10100=PC manager, 20001=honor Intelligent Agent platform, 20002=Xiaomi app store; user_id (string) is the unique ID of the visitor under this channel. 
     * @return ChannelType Channel type for dialogue message access: 0=not specified, 1=agent, 2=experience page (Tencent Cloud), 3=evaluation dialogue, 4=experience page (phone number), 5=dialogue API connection, 6=evaluation task dialogue, 10=workflow debugging, 10000=WeChat official account, 10001=WeChat service account, 10002=WeCom app, 10003=web components, 10004=WeChat Customer Service, 10005=WeChat mini program, 10006=Yuanqi, 10007=App Treasure, 10008=Yuanbao, 10009=WeCom intelligent bot, 10010=Yuanqi API, 10011=LINE, 10012=Telegram, 10100=PC manager, 20001=honor Intelligent Agent platform, 20002=Xiaomi app store; user_id (string) is the unique ID of the visitor under this channel.
     */
    public Long getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set Channel type for dialogue message access: 0=not specified, 1=agent, 2=experience page (Tencent Cloud), 3=evaluation dialogue, 4=experience page (phone number), 5=dialogue API connection, 6=evaluation task dialogue, 10=workflow debugging, 10000=WeChat official account, 10001=WeChat service account, 10002=WeCom app, 10003=web components, 10004=WeChat Customer Service, 10005=WeChat mini program, 10006=Yuanqi, 10007=App Treasure, 10008=Yuanbao, 10009=WeCom intelligent bot, 10010=Yuanqi API, 10011=LINE, 10012=Telegram, 10100=PC manager, 20001=honor Intelligent Agent platform, 20002=Xiaomi app store; user_id (string) is the unique ID of the visitor under this channel.
     * @param ChannelType Channel type for dialogue message access: 0=not specified, 1=agent, 2=experience page (Tencent Cloud), 3=evaluation dialogue, 4=experience page (phone number), 5=dialogue API connection, 6=evaluation task dialogue, 10=workflow debugging, 10000=WeChat official account, 10001=WeChat service account, 10002=WeCom app, 10003=web components, 10004=WeChat Customer Service, 10005=WeChat mini program, 10006=Yuanqi, 10007=App Treasure, 10008=Yuanbao, 10009=WeCom intelligent bot, 10010=Yuanqi API, 10011=LINE, 10012=Telegram, 10100=PC manager, 20001=honor Intelligent Agent platform, 20002=Xiaomi app store; user_id (string) is the unique ID of the visitor under this channel.
     */
    public void setChannelType(Long ChannelType) {
        this.ChannelType = ChannelType;
    }

    /**
     * Get User ID. 
     * @return FromId User ID.
     */
    public String getFromId() {
        return this.FromId;
    }

    /**
     * Set User ID.
     * @param FromId User ID.
     */
    public void setFromId(String FromId) {
        this.FromId = FromId;
    }

    /**
     * Get User source type of the message sender: 1=user (visitor/C-end user), 2=robot (AI reply), 3=agent (human customer service); from_id (string) is the unique user ID under this source type. 
     * @return FromType User source type of the message sender: 1=user (visitor/C-end user), 2=robot (AI reply), 3=agent (human customer service); from_id (string) is the unique user ID under this source type.
     */
    public Long getFromType() {
        return this.FromType;
    }

    /**
     * Set User source type of the message sender: 1=user (visitor/C-end user), 2=robot (AI reply), 3=agent (human customer service); from_id (string) is the unique user ID under this source type.
     * @param FromType User source type of the message sender: 1=user (visitor/C-end user), 2=robot (AI reply), 3=agent (human customer service); from_id (string) is the unique user ID under this source type.
     */
    public void setFromType(Long FromType) {
        this.FromType = FromType;
    }

    /**
     * Get User profile photo 
     * @return UserAvatar User profile photo
     */
    public String getUserAvatar() {
        return this.UserAvatar;
    }

    /**
     * Set User profile photo
     * @param UserAvatar User profile photo
     */
    public void setUserAvatar(String UserAvatar) {
        this.UserAvatar = UserAvatar;
    }

    /**
     * Get Visitor ID. 
     * @return UserId Visitor ID.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Visitor ID.
     * @param UserId Visitor ID.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Visitor name 
     * @return UserNickname Visitor name
     */
    public String getUserNickname() {
        return this.UserNickname;
    }

    /**
     * Set Visitor name
     * @param UserNickname Visitor name
     */
    public void setUserNickname(String UserNickname) {
        this.UserNickname = UserNickname;
    }

    public MsgRecordSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecordSource(MsgRecordSource source) {
        if (source.ChannelType != null) {
            this.ChannelType = new Long(source.ChannelType);
        }
        if (source.FromId != null) {
            this.FromId = new String(source.FromId);
        }
        if (source.FromType != null) {
            this.FromType = new Long(source.FromType);
        }
        if (source.UserAvatar != null) {
            this.UserAvatar = new String(source.UserAvatar);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserNickname != null) {
            this.UserNickname = new String(source.UserNickname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);
        this.setParamSimple(map, prefix + "FromId", this.FromId);
        this.setParamSimple(map, prefix + "FromType", this.FromType);
        this.setParamSimple(map, prefix + "UserAvatar", this.UserAvatar);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserNickname", this.UserNickname);

    }
}

