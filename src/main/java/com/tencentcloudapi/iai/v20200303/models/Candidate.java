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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Candidate extends AbstractModel{

    /**
    * Person ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * Face ID
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * Match score of candidate. 

In a face base library containing 10,000 faces, the 1%, 0.1%, and 0.01% FARs correspond to scores of 70, 80, and 90 points, respectively;
In a face base library containing 100,000 faces, the 1%, 0.1%, and 0.01% FARs correspond to scores of 80, 90, and 100 points, respectively;
In a face base library containing 300,000 faces, the 1% and 0.1% FARs correspond to scores of 85 and 95, respectively.

Generally, the score of 80 is suitable for most scenarios. You are recommended to choose an appropriate score based on the actual situation, preferably no more than 90.
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * Person name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * Person gender
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * List of groups containing this person and their description fields
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PersonGroupInfos")
    @Expose
    private PersonGroupInfo [] PersonGroupInfos;

    /**
     * Get Person ID 
     * @return PersonId Person ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Person ID
     * @param PersonId Person ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get Face ID 
     * @return FaceId Face ID
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set Face ID
     * @param FaceId Face ID
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get Match score of candidate. 

In a face base library containing 10,000 faces, the 1%, 0.1%, and 0.01% FARs correspond to scores of 70, 80, and 90 points, respectively;
In a face base library containing 100,000 faces, the 1%, 0.1%, and 0.01% FARs correspond to scores of 80, 90, and 100 points, respectively;
In a face base library containing 300,000 faces, the 1% and 0.1% FARs correspond to scores of 85 and 95, respectively.

Generally, the score of 80 is suitable for most scenarios. You are recommended to choose an appropriate score based on the actual situation, preferably no more than 90. 
     * @return Score Match score of candidate. 

In a face base library containing 10,000 faces, the 1%, 0.1%, and 0.01% FARs correspond to scores of 70, 80, and 90 points, respectively;
In a face base library containing 100,000 faces, the 1%, 0.1%, and 0.01% FARs correspond to scores of 80, 90, and 100 points, respectively;
In a face base library containing 300,000 faces, the 1% and 0.1% FARs correspond to scores of 85 and 95, respectively.

Generally, the score of 80 is suitable for most scenarios. You are recommended to choose an appropriate score based on the actual situation, preferably no more than 90.
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set Match score of candidate. 

In a face base library containing 10,000 faces, the 1%, 0.1%, and 0.01% FARs correspond to scores of 70, 80, and 90 points, respectively;
In a face base library containing 100,000 faces, the 1%, 0.1%, and 0.01% FARs correspond to scores of 80, 90, and 100 points, respectively;
In a face base library containing 300,000 faces, the 1% and 0.1% FARs correspond to scores of 85 and 95, respectively.

Generally, the score of 80 is suitable for most scenarios. You are recommended to choose an appropriate score based on the actual situation, preferably no more than 90.
     * @param Score Match score of candidate. 

In a face base library containing 10,000 faces, the 1%, 0.1%, and 0.01% FARs correspond to scores of 70, 80, and 90 points, respectively;
In a face base library containing 100,000 faces, the 1%, 0.1%, and 0.01% FARs correspond to scores of 80, 90, and 100 points, respectively;
In a face base library containing 300,000 faces, the 1% and 0.1% FARs correspond to scores of 85 and 95, respectively.

Generally, the score of 80 is suitable for most scenarios. You are recommended to choose an appropriate score based on the actual situation, preferably no more than 90.
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get Person name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PersonName Person name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set Person name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PersonName Person name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get Person gender
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Gender Person gender
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set Person gender
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Gender Person gender
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get List of groups containing this person and their description fields
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PersonGroupInfos List of groups containing this person and their description fields
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PersonGroupInfo [] getPersonGroupInfos() {
        return this.PersonGroupInfos;
    }

    /**
     * Set List of groups containing this person and their description fields
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PersonGroupInfos List of groups containing this person and their description fields
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPersonGroupInfos(PersonGroupInfo [] PersonGroupInfos) {
        this.PersonGroupInfos = PersonGroupInfos;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamArrayObj(map, prefix + "PersonGroupInfos.", this.PersonGroupInfos);

    }
}

