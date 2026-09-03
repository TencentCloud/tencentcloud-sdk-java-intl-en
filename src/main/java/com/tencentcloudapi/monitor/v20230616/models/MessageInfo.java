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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageInfo extends AbstractModel {

    /**
    * <p>Entity id</p>
    */
    @SerializedName("EntryId")
    @Expose
    private String EntryId;

    /**
    * <p>Conversation ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Role: user / assistant</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>Message content</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Status.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Block content.</p>
    */
    @SerializedName("ContentBlocks")
    @Expose
    private ContentBlockInfo [] ContentBlocks;

    /**
     * Get <p>Entity id</p> 
     * @return EntryId <p>Entity id</p>
     */
    public String getEntryId() {
        return this.EntryId;
    }

    /**
     * Set <p>Entity id</p>
     * @param EntryId <p>Entity id</p>
     */
    public void setEntryId(String EntryId) {
        this.EntryId = EntryId;
    }

    /**
     * Get <p>Conversation ID</p> 
     * @return SessionId <p>Conversation ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Conversation ID</p>
     * @param SessionId <p>Conversation ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Role: user / assistant</p> 
     * @return Role <p>Role: user / assistant</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>Role: user / assistant</p>
     * @param Role <p>Role: user / assistant</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>Message content</p> 
     * @return Content <p>Message content</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Message content</p>
     * @param Content <p>Message content</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Status.</p> 
     * @return Status <p>Status.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status.</p>
     * @param Status <p>Status.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Block content.</p> 
     * @return ContentBlocks <p>Block content.</p>
     */
    public ContentBlockInfo [] getContentBlocks() {
        return this.ContentBlocks;
    }

    /**
     * Set <p>Block content.</p>
     * @param ContentBlocks <p>Block content.</p>
     */
    public void setContentBlocks(ContentBlockInfo [] ContentBlocks) {
        this.ContentBlocks = ContentBlocks;
    }

    public MessageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageInfo(MessageInfo source) {
        if (source.EntryId != null) {
            this.EntryId = new String(source.EntryId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ContentBlocks != null) {
            this.ContentBlocks = new ContentBlockInfo[source.ContentBlocks.length];
            for (int i = 0; i < source.ContentBlocks.length; i++) {
                this.ContentBlocks[i] = new ContentBlockInfo(source.ContentBlocks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntryId", this.EntryId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ContentBlocks.", this.ContentBlocks);

    }
}

