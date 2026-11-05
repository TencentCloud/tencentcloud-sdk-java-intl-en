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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Candidate extends AbstractModel {

    /**
    * Person ID.
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * Face ID.
-Valid only in the API response of SearchFaces/SearchFacesReturnsByGroup.
-Person search class interfaces use the fusion feature method for retrieval. This field is meaningless.
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * Match score of the candidate. 
-In a face base library of 10,000 faces, a false acceptance rate of 1% corresponds to a score of 70 points, 0.1% corresponds to 80 points, and 0.01% corresponds to 90 points.
-For a face base library of 100,000, a false acceptance rate of 1% corresponds to a score of 80 points, 0.1% corresponds to 90 points, and 0.01% corresponds to 100 points.
-With a face base library of 300,000, a false acceptance rate of 1% corresponds to a score of 85, and a false acceptance rate of 0.1% corresponds to a score of 95.
-Generally, a score of around 80 applies to most scenarios. It is advisable not to exceed 90. You can choose a suitable score according to the actual situation.
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * Person name.
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * Gender of personnel.
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * List of person libraries containing this person and the content of the description field.
    */
    @SerializedName("PersonGroupInfos")
    @Expose
    private PersonGroupInfo [] PersonGroupInfos;

    /**
     * Get Person ID. 
     * @return PersonId Person ID.
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Person ID.
     * @param PersonId Person ID.
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get Face ID.
-Valid only in the API response of SearchFaces/SearchFacesReturnsByGroup.
-Person search class interfaces use the fusion feature method for retrieval. This field is meaningless. 
     * @return FaceId Face ID.
-Valid only in the API response of SearchFaces/SearchFacesReturnsByGroup.
-Person search class interfaces use the fusion feature method for retrieval. This field is meaningless.
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set Face ID.
-Valid only in the API response of SearchFaces/SearchFacesReturnsByGroup.
-Person search class interfaces use the fusion feature method for retrieval. This field is meaningless.
     * @param FaceId Face ID.
-Valid only in the API response of SearchFaces/SearchFacesReturnsByGroup.
-Person search class interfaces use the fusion feature method for retrieval. This field is meaningless.
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get Match score of the candidate. 
-In a face base library of 10,000 faces, a false acceptance rate of 1% corresponds to a score of 70 points, 0.1% corresponds to 80 points, and 0.01% corresponds to 90 points.
-For a face base library of 100,000, a false acceptance rate of 1% corresponds to a score of 80 points, 0.1% corresponds to 90 points, and 0.01% corresponds to 100 points.
-With a face base library of 300,000, a false acceptance rate of 1% corresponds to a score of 85, and a false acceptance rate of 0.1% corresponds to a score of 95.
-Generally, a score of around 80 applies to most scenarios. It is advisable not to exceed 90. You can choose a suitable score according to the actual situation. 
     * @return Score Match score of the candidate. 
-In a face base library of 10,000 faces, a false acceptance rate of 1% corresponds to a score of 70 points, 0.1% corresponds to 80 points, and 0.01% corresponds to 90 points.
-For a face base library of 100,000, a false acceptance rate of 1% corresponds to a score of 80 points, 0.1% corresponds to 90 points, and 0.01% corresponds to 100 points.
-With a face base library of 300,000, a false acceptance rate of 1% corresponds to a score of 85, and a false acceptance rate of 0.1% corresponds to a score of 95.
-Generally, a score of around 80 applies to most scenarios. It is advisable not to exceed 90. You can choose a suitable score according to the actual situation.
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set Match score of the candidate. 
-In a face base library of 10,000 faces, a false acceptance rate of 1% corresponds to a score of 70 points, 0.1% corresponds to 80 points, and 0.01% corresponds to 90 points.
-For a face base library of 100,000, a false acceptance rate of 1% corresponds to a score of 80 points, 0.1% corresponds to 90 points, and 0.01% corresponds to 100 points.
-With a face base library of 300,000, a false acceptance rate of 1% corresponds to a score of 85, and a false acceptance rate of 0.1% corresponds to a score of 95.
-Generally, a score of around 80 applies to most scenarios. It is advisable not to exceed 90. You can choose a suitable score according to the actual situation.
     * @param Score Match score of the candidate. 
-In a face base library of 10,000 faces, a false acceptance rate of 1% corresponds to a score of 70 points, 0.1% corresponds to 80 points, and 0.01% corresponds to 90 points.
-For a face base library of 100,000, a false acceptance rate of 1% corresponds to a score of 80 points, 0.1% corresponds to 90 points, and 0.01% corresponds to 100 points.
-With a face base library of 300,000, a false acceptance rate of 1% corresponds to a score of 85, and a false acceptance rate of 0.1% corresponds to a score of 95.
-Generally, a score of around 80 applies to most scenarios. It is advisable not to exceed 90. You can choose a suitable score according to the actual situation.
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get Person name. 
     * @return PersonName Person name.
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set Person name.
     * @param PersonName Person name.
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get Gender of personnel. 
     * @return Gender Gender of personnel.
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set Gender of personnel.
     * @param Gender Gender of personnel.
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get List of person libraries containing this person and the content of the description field. 
     * @return PersonGroupInfos List of person libraries containing this person and the content of the description field.
     */
    public PersonGroupInfo [] getPersonGroupInfos() {
        return this.PersonGroupInfos;
    }

    /**
     * Set List of person libraries containing this person and the content of the description field.
     * @param PersonGroupInfos List of person libraries containing this person and the content of the description field.
     */
    public void setPersonGroupInfos(PersonGroupInfo [] PersonGroupInfos) {
        this.PersonGroupInfos = PersonGroupInfos;
    }

    public Candidate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Candidate(Candidate source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.FaceId != null) {
            this.FaceId = new String(source.FaceId);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.PersonGroupInfos != null) {
            this.PersonGroupInfos = new PersonGroupInfo[source.PersonGroupInfos.length];
            for (int i = 0; i < source.PersonGroupInfos.length; i++) {
                this.PersonGroupInfos[i] = new PersonGroupInfo(source.PersonGroupInfos[i]);
            }
        }
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

