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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnswerInfo extends AbstractModel {

    /**
    * The username.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The answer. Bits are used to indicate the options chosen. For example, `0x1` indicates that option A is chosen; `0x11` indicates that A and B are chosen, and so on.
    */
    @SerializedName("Answer")
    @Expose
    private Long Answer;

    /**
    * The time used.
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
    * The user ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Whether the answer is correct. `1`: Correct; `0`: Incorrect.
    */
    @SerializedName("IsCorrect")
    @Expose
    private Long IsCorrect;

    /**
     * Get The username. 
     * @return Name The username.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The username.
     * @param Name The username.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The answer. Bits are used to indicate the options chosen. For example, `0x1` indicates that option A is chosen; `0x11` indicates that A and B are chosen, and so on. 
     * @return Answer The answer. Bits are used to indicate the options chosen. For example, `0x1` indicates that option A is chosen; `0x11` indicates that A and B are chosen, and so on.
     */
    public Long getAnswer() {
        return this.Answer;
    }

    /**
     * Set The answer. Bits are used to indicate the options chosen. For example, `0x1` indicates that option A is chosen; `0x11` indicates that A and B are chosen, and so on.
     * @param Answer The answer. Bits are used to indicate the options chosen. For example, `0x1` indicates that option A is chosen; `0x11` indicates that A and B are chosen, and so on.
     */
    public void setAnswer(Long Answer) {
        this.Answer = Answer;
    }

    /**
     * Get The time used. 
     * @return CostTime The time used.
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set The time used.
     * @param CostTime The time used.
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get The user ID. 
     * @return UserId The user ID.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The user ID.
     * @param UserId The user ID.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Whether the answer is correct. `1`: Correct; `0`: Incorrect. 
     * @return IsCorrect Whether the answer is correct. `1`: Correct; `0`: Incorrect.
     */
    public Long getIsCorrect() {
        return this.IsCorrect;
    }

    /**
     * Set Whether the answer is correct. `1`: Correct; `0`: Incorrect.
     * @param IsCorrect Whether the answer is correct. `1`: Correct; `0`: Incorrect.
     */
    public void setIsCorrect(Long IsCorrect) {
        this.IsCorrect = IsCorrect;
    }

    public AnswerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnswerInfo(AnswerInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Answer != null) {
            this.Answer = new Long(source.Answer);
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.IsCorrect != null) {
            this.IsCorrect = new Long(source.IsCorrect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "IsCorrect", this.IsCorrect);

    }
}

