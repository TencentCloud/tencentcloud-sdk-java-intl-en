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

public class ListAIWorkbenchMessagesRequest extends AbstractModel {

    /**
    * <p>Conversation ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Tag for cursor pagination</p>
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * <p>Window size</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Pull sequence</p>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

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
     * Get <p>Tag for cursor pagination</p> 
     * @return Cursor <p>Tag for cursor pagination</p>
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set <p>Tag for cursor pagination</p>
     * @param Cursor <p>Tag for cursor pagination</p>
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get <p>Window size</p> 
     * @return Limit <p>Window size</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Window size</p>
     * @param Limit <p>Window size</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Pull sequence</p> 
     * @return Direction <p>Pull sequence</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>Pull sequence</p>
     * @param Direction <p>Pull sequence</p>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public ListAIWorkbenchMessagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchMessagesRequest(ListAIWorkbenchMessagesRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

