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

public class SkillNotice extends AbstractModel {

    /**
    * Notification level

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Placeholder |
| 1 | Success, string literal: "success" |
| 2 | Warning, string literal: "warning" |
| 3 | Error, string literal: "error" |
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Copywriting (post-i18n string)
    */
    @SerializedName("NoticeContent")
    @Expose
    private String NoticeContent;

    /**
    * Version ID of the Skill that triggers this notice
    */
    @SerializedName("TriggerVersionId")
    @Expose
    private String TriggerVersionId;

    /**
    * Notification type 

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Placeholder |
| 1 | Release failure |
| 2 | Shared approval rejected |
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Notification level

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Placeholder |
| 1 | Success, string literal: "success" |
| 2 | Warning, string literal: "warning" |
| 3 | Error, string literal: "error" | 
     * @return Level Notification level

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Placeholder |
| 1 | Success, string literal: "success" |
| 2 | Warning, string literal: "warning" |
| 3 | Error, string literal: "error" |
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Notification level

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Placeholder |
| 1 | Success, string literal: "success" |
| 2 | Warning, string literal: "warning" |
| 3 | Error, string literal: "error" |
     * @param Level Notification level

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Placeholder |
| 1 | Success, string literal: "success" |
| 2 | Warning, string literal: "warning" |
| 3 | Error, string literal: "error" |
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Copywriting (post-i18n string) 
     * @return NoticeContent Copywriting (post-i18n string)
     */
    public String getNoticeContent() {
        return this.NoticeContent;
    }

    /**
     * Set Copywriting (post-i18n string)
     * @param NoticeContent Copywriting (post-i18n string)
     */
    public void setNoticeContent(String NoticeContent) {
        this.NoticeContent = NoticeContent;
    }

    /**
     * Get Version ID of the Skill that triggers this notice 
     * @return TriggerVersionId Version ID of the Skill that triggers this notice
     */
    public String getTriggerVersionId() {
        return this.TriggerVersionId;
    }

    /**
     * Set Version ID of the Skill that triggers this notice
     * @param TriggerVersionId Version ID of the Skill that triggers this notice
     */
    public void setTriggerVersionId(String TriggerVersionId) {
        this.TriggerVersionId = TriggerVersionId;
    }

    /**
     * Get Notification type 

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Placeholder |
| 1 | Release failure |
| 2 | Shared approval rejected | 
     * @return Type Notification type 

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Placeholder |
| 1 | Release failure |
| 2 | Shared approval rejected |
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Notification type 

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Placeholder |
| 1 | Release failure |
| 2 | Shared approval rejected |
     * @param Type Notification type 

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | Placeholder |
| 1 | Release failure |
| 2 | Shared approval rejected |
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public SkillNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillNotice(SkillNotice source) {
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.NoticeContent != null) {
            this.NoticeContent = new String(source.NoticeContent);
        }
        if (source.TriggerVersionId != null) {
            this.TriggerVersionId = new String(source.TriggerVersionId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "NoticeContent", this.NoticeContent);
        this.setParamSimple(map, prefix + "TriggerVersionId", this.TriggerVersionId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

