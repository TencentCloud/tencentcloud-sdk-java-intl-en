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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Context extends AbstractModel {

    /**
    * Message record ID.
    */
    @SerializedName("RecordBizId")
    @Expose
    private String RecordBizId;

    /**
    * Whether it is a user.
    */
    @SerializedName("IsVisitor")
    @Expose
    private Boolean IsVisitor;

    /**
    * Nickname.
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Avatar.
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * Message content.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Document information.
    */
    @SerializedName("FileInfos")
    @Expose
    private MsgFileInfo [] FileInfos;

    /**
    * Response method, 15: clarification confirmation response.
    */
    @SerializedName("ReplyMethod")
    @Expose
    private Long ReplyMethod;

    /**
     * Get Message record ID. 
     * @return RecordBizId Message record ID.
     */
    public String getRecordBizId() {
        return this.RecordBizId;
    }

    /**
     * Set Message record ID.
     * @param RecordBizId Message record ID.
     */
    public void setRecordBizId(String RecordBizId) {
        this.RecordBizId = RecordBizId;
    }

    /**
     * Get Whether it is a user. 
     * @return IsVisitor Whether it is a user.
     */
    public Boolean getIsVisitor() {
        return this.IsVisitor;
    }

    /**
     * Set Whether it is a user.
     * @param IsVisitor Whether it is a user.
     */
    public void setIsVisitor(Boolean IsVisitor) {
        this.IsVisitor = IsVisitor;
    }

    /**
     * Get Nickname. 
     * @return NickName Nickname.
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Nickname.
     * @param NickName Nickname.
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Avatar. 
     * @return Avatar Avatar.
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set Avatar.
     * @param Avatar Avatar.
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get Message content. 
     * @return Content Message content.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Message content.
     * @param Content Message content.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Document information. 
     * @return FileInfos Document information.
     */
    public MsgFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Document information.
     * @param FileInfos Document information.
     */
    public void setFileInfos(MsgFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get Response method, 15: clarification confirmation response. 
     * @return ReplyMethod Response method, 15: clarification confirmation response.
     */
    public Long getReplyMethod() {
        return this.ReplyMethod;
    }

    /**
     * Set Response method, 15: clarification confirmation response.
     * @param ReplyMethod Response method, 15: clarification confirmation response.
     */
    public void setReplyMethod(Long ReplyMethod) {
        this.ReplyMethod = ReplyMethod;
    }

    public Context() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Context(Context source) {
        if (source.RecordBizId != null) {
            this.RecordBizId = new String(source.RecordBizId);
        }
        if (source.IsVisitor != null) {
            this.IsVisitor = new Boolean(source.IsVisitor);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new MsgFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new MsgFileInfo(source.FileInfos[i]);
            }
        }
        if (source.ReplyMethod != null) {
            this.ReplyMethod = new Long(source.ReplyMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordBizId", this.RecordBizId);
        this.setParamSimple(map, prefix + "IsVisitor", this.IsVisitor);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "ReplyMethod", this.ReplyMethod);

    }
}

