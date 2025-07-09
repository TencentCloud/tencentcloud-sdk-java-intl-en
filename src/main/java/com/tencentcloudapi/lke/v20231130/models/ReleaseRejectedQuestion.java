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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseRejectedQuestion extends AbstractModel {

    /**
    * Question.
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Status.
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * Status description.
    */
    @SerializedName("ActionDesc")
    @Expose
    private String ActionDesc;

    /**
    * Reason for failure.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Question. 
     * @return Question Question.
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set Question.
     * @param Question Question.
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Status. 
     * @return Action Status.
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set Status.
     * @param Action Status.
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get Status description. 
     * @return ActionDesc Status description.
     */
    public String getActionDesc() {
        return this.ActionDesc;
    }

    /**
     * Set Status description.
     * @param ActionDesc Status description.
     */
    public void setActionDesc(String ActionDesc) {
        this.ActionDesc = ActionDesc;
    }

    /**
     * Get Reason for failure. 
     * @return Message Reason for failure.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Reason for failure.
     * @param Message Reason for failure.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ReleaseRejectedQuestion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseRejectedQuestion(ReleaseRejectedQuestion source) {
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.ActionDesc != null) {
            this.ActionDesc = new String(source.ActionDesc);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionDesc", this.ActionDesc);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

