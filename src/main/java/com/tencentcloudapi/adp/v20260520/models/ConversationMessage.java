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

public class ConversationMessage extends AbstractModel {

    /**
    * <p>Session ID.</p>
    */
    @SerializedName("ConversationId")
    @Expose
    private String ConversationId;

    /**
    * <p>Message icon</p>
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * <p>Message ID</p>
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * <p>Message name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Record ID</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>Message role</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>Message status. pending: pending execution, processing: in processing, success: completed, failed: processing failure, stop: canceled</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Status description</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>Message title</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>List of message contents</p>
    */
    @SerializedName("ContentList")
    @Expose
    private ConversationContent [] ContentList;

    /**
    * <p>Message content list</p>
    */
    @SerializedName("Contents")
    @Expose
    private ConversationContent [] Contents;

    /**
    * <p>Type.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>Session ID.</p> 
     * @return ConversationId <p>Session ID.</p>
     */
    public String getConversationId() {
        return this.ConversationId;
    }

    /**
     * Set <p>Session ID.</p>
     * @param ConversationId <p>Session ID.</p>
     */
    public void setConversationId(String ConversationId) {
        this.ConversationId = ConversationId;
    }

    /**
     * Get <p>Message icon</p> 
     * @return Icon <p>Message icon</p>
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set <p>Message icon</p>
     * @param Icon <p>Message icon</p>
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get <p>Message ID</p> 
     * @return MessageId <p>Message ID</p>
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set <p>Message ID</p>
     * @param MessageId <p>Message ID</p>
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get <p>Message name</p> 
     * @return Name <p>Message name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Message name</p>
     * @param Name <p>Message name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Record ID</p> 
     * @return RecordId <p>Record ID</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>Record ID</p>
     * @param RecordId <p>Record ID</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>Message role</p> 
     * @return Role <p>Message role</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>Message role</p>
     * @param Role <p>Message role</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>Message status. pending: pending execution, processing: in processing, success: completed, failed: processing failure, stop: canceled</p> 
     * @return Status <p>Message status. pending: pending execution, processing: in processing, success: completed, failed: processing failure, stop: canceled</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Message status. pending: pending execution, processing: in processing, success: completed, failed: processing failure, stop: canceled</p>
     * @param Status <p>Message status. pending: pending execution, processing: in processing, success: completed, failed: processing failure, stop: canceled</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Status description</p> 
     * @return StatusDesc <p>Status description</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>Status description</p>
     * @param StatusDesc <p>Status description</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>Message title</p> 
     * @return Title <p>Message title</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>Message title</p>
     * @param Title <p>Message title</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>List of message contents</p> 
     * @return ContentList <p>List of message contents</p>
     */
    public ConversationContent [] getContentList() {
        return this.ContentList;
    }

    /**
     * Set <p>List of message contents</p>
     * @param ContentList <p>List of message contents</p>
     */
    public void setContentList(ConversationContent [] ContentList) {
        this.ContentList = ContentList;
    }

    /**
     * Get <p>Message content list</p> 
     * @return Contents <p>Message content list</p>
     */
    public ConversationContent [] getContents() {
        return this.Contents;
    }

    /**
     * Set <p>Message content list</p>
     * @param Contents <p>Message content list</p>
     */
    public void setContents(ConversationContent [] Contents) {
        this.Contents = Contents;
    }

    /**
     * Get <p>Type.</p> 
     * @return Type <p>Type.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Type.</p>
     * @param Type <p>Type.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ConversationMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationMessage(ConversationMessage source) {
        if (source.ConversationId != null) {
            this.ConversationId = new String(source.ConversationId);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.ContentList != null) {
            this.ContentList = new ConversationContent[source.ContentList.length];
            for (int i = 0; i < source.ContentList.length; i++) {
                this.ContentList[i] = new ConversationContent(source.ContentList[i]);
            }
        }
        if (source.Contents != null) {
            this.Contents = new ConversationContent[source.Contents.length];
            for (int i = 0; i < source.Contents.length; i++) {
                this.Contents[i] = new ConversationContent(source.Contents[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConversationId", this.ConversationId);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArrayObj(map, prefix + "ContentList.", this.ContentList);
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

