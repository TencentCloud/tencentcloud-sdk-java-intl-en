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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProgramAlertInfos extends AbstractModel {

    /**
    * Channel ID.
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Channel name.

    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * ProgramID.
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * ProgramName.
    */
    @SerializedName("ProgramName")
    @Expose
    private String ProgramName;

    /**
    * Alarm event code.
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Alarm classification.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Alarm message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Update time.
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private Long LastModifiedTime;

    /**
     * Get Channel ID. 
     * @return ChannelId Channel ID.
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID.
     * @param ChannelId Channel ID.
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Channel name.
 
     * @return ChannelName Channel name.

     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Channel name.

     * @param ChannelName Channel name.

     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get ProgramID. 
     * @return ProgramId ProgramID.
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set ProgramID.
     * @param ProgramId ProgramID.
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get ProgramName. 
     * @return ProgramName ProgramName.
     */
    public String getProgramName() {
        return this.ProgramName;
    }

    /**
     * Set ProgramName.
     * @param ProgramName ProgramName.
     */
    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    /**
     * Get Alarm event code. 
     * @return Code Alarm event code.
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Alarm event code.
     * @param Code Alarm event code.
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Alarm classification. 
     * @return Category Alarm classification.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Alarm classification.
     * @param Category Alarm classification.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Alarm message. 
     * @return Message Alarm message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Alarm message.
     * @param Message Alarm message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Update time. 
     * @return LastModifiedTime Update time.
     */
    public Long getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set Update time.
     * @param LastModifiedTime Update time.
     */
    public void setLastModifiedTime(Long LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    public ProgramAlertInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProgramAlertInfos(ProgramAlertInfos source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.ProgramName != null) {
            this.ProgramName = new String(source.ProgramName);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.LastModifiedTime != null) {
            this.LastModifiedTime = new Long(source.LastModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamSimple(map, prefix + "ProgramName", this.ProgramName);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);

    }
}

