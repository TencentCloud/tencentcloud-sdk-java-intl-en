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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DimensionScoreInfo extends AbstractModel {

    /**
    * Dimension NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * WeightNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
    * Setter ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * Setter Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Update Time Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Number of Evaluation Forms Involved
    */
    @SerializedName("JoinTableNumber")
    @Expose
    private Long JoinTableNumber;

    /**
    * Scoring
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 
    */
    @SerializedName("UserIdStr")
    @Expose
    private String UserIdStr;

    /**
     * Get Dimension NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Dimension NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Dimension NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param Name Dimension NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get WeightNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Weight WeightNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set WeightNote: This field may return null, indicating that no valid value can be obtained.
     * @param Weight WeightNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Setter ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserId Setter ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set Setter ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserId Setter ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Setter Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserName Setter Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Setter Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserName Setter Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Update Time Timestamp
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Update Time Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update Time Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Update Time Timestamp
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Number of Evaluation Forms Involved 
     * @return JoinTableNumber Number of Evaluation Forms Involved
     */
    public Long getJoinTableNumber() {
        return this.JoinTableNumber;
    }

    /**
     * Set Number of Evaluation Forms Involved
     * @param JoinTableNumber Number of Evaluation Forms Involved
     */
    public void setJoinTableNumber(Long JoinTableNumber) {
        this.JoinTableNumber = JoinTableNumber;
    }

    /**
     * Get Scoring 
     * @return Score Scoring
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set Scoring
     * @param Score Scoring
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get  
     * @return UserIdStr 
     */
    public String getUserIdStr() {
        return this.UserIdStr;
    }

    /**
     * Set 
     * @param UserIdStr 
     */
    public void setUserIdStr(String UserIdStr) {
        this.UserIdStr = UserIdStr;
    }

    public DimensionScoreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionScoreInfo(DimensionScoreInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Weight != null) {
            this.Weight = new Float(source.Weight);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.JoinTableNumber != null) {
            this.JoinTableNumber = new Long(source.JoinTableNumber);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.UserIdStr != null) {
            this.UserIdStr = new String(source.UserIdStr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "JoinTableNumber", this.JoinTableNumber);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "UserIdStr", this.UserIdStr);

    }
}

