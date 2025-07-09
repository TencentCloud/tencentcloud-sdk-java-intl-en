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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionVersion extends AbstractModel {

    /**
    * Version number: V0 V1 V2
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Submitter ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Change Type: ADD, MODIFY
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Remarks
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Submission Time: UTC Seconds
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * Submitter Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Version Information: json string format
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Version number: V0 V1 V2 
     * @return Tag Version number: V0 V1 V2
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Version number: V0 V1 V2
     * @param Tag Version number: V0 V1 V2
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Submitter ID 
     * @return UserId Submitter ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Submitter ID
     * @param UserId Submitter ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Change Type: ADD, MODIFY 
     * @return Type Change Type: ADD, MODIFY
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Change Type: ADD, MODIFY
     * @param Type Change Type: ADD, MODIFY
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Remarks 
     * @return Comment Remarks
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Remarks
     * @param Comment Remarks
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Submission Time: UTC Seconds 
     * @return Timestamp Submission Time: UTC Seconds
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Submission Time: UTC Seconds
     * @param Timestamp Submission Time: UTC Seconds
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Submitter Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserName Submitter Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Submitter Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserName Submitter Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Version Information: json string format
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Content Version Information: json string format
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Version Information: json string format
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Content Version Information: json string format
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public FunctionVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionVersion(FunctionVersion source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

