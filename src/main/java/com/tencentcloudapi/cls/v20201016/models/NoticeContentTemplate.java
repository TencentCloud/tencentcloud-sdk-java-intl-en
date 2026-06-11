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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeContentTemplate extends AbstractModel {

    /**
    * Notification content template ID.
    */
    @SerializedName("NoticeContentId")
    @Expose
    private String NoticeContentId;

    /**
    * notification content template name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Language type.

0: Chinese
1: English
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Notification content template information.
    */
    @SerializedName("NoticeContents")
    @Expose
    private NoticeContent [] NoticeContents;

    /**
    * Notification content template tag.

0: user-customized
1: Built-in
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * Root account of a creator.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Sub-account of a creator or modifier.
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
    * Creation time. A timestamp in seconds.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Update time. A timestamp in seconds.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Notification content template ID. 
     * @return NoticeContentId Notification content template ID.
     */
    public String getNoticeContentId() {
        return this.NoticeContentId;
    }

    /**
     * Set Notification content template ID.
     * @param NoticeContentId Notification content template ID.
     */
    public void setNoticeContentId(String NoticeContentId) {
        this.NoticeContentId = NoticeContentId;
    }

    /**
     * Get notification content template name 
     * @return Name notification content template name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set notification content template name
     * @param Name notification content template name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Language type.

0: Chinese
1: English 
     * @return Type Language type.

0: Chinese
1: English
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Language type.

0: Chinese
1: English
     * @param Type Language type.

0: Chinese
1: English
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Notification content template information. 
     * @return NoticeContents Notification content template information.
     */
    public NoticeContent [] getNoticeContents() {
        return this.NoticeContents;
    }

    /**
     * Set Notification content template information.
     * @param NoticeContents Notification content template information.
     */
    public void setNoticeContents(NoticeContent [] NoticeContents) {
        this.NoticeContents = NoticeContents;
    }

    /**
     * Get Notification content template tag.

0: user-customized
1: Built-in 
     * @return Flag Notification content template tag.

0: user-customized
1: Built-in
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set Notification content template tag.

0: user-customized
1: Built-in
     * @param Flag Notification content template tag.

0: user-customized
1: Built-in
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get Root account of a creator. 
     * @return Uin Root account of a creator.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Root account of a creator.
     * @param Uin Root account of a creator.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-account of a creator or modifier. 
     * @return SubUin Sub-account of a creator or modifier.
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Sub-account of a creator or modifier.
     * @param SubUin Sub-account of a creator or modifier.
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get Creation time. A timestamp in seconds. 
     * @return CreateTime Creation time. A timestamp in seconds.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. A timestamp in seconds.
     * @param CreateTime Creation time. A timestamp in seconds.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. A timestamp in seconds. 
     * @return UpdateTime Update time. A timestamp in seconds.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. A timestamp in seconds.
     * @param UpdateTime Update time. A timestamp in seconds.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public NoticeContentTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeContentTemplate(NoticeContentTemplate source) {
        if (source.NoticeContentId != null) {
            this.NoticeContentId = new String(source.NoticeContentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.NoticeContents != null) {
            this.NoticeContents = new NoticeContent[source.NoticeContents.length];
            for (int i = 0; i < source.NoticeContents.length; i++) {
                this.NoticeContents[i] = new NoticeContent(source.NoticeContents[i]);
            }
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeContentId", this.NoticeContentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeContents.", this.NoticeContents);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

