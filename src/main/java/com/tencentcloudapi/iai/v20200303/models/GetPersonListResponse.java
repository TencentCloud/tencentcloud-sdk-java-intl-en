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

public class GetPersonListResponse extends AbstractModel{

    /**
    * Returned person information
    */
    @SerializedName("PersonInfos")
    @Expose
    private PersonInfo [] PersonInfos;

    /**
    * Number of persons in the group
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PersonNum")
    @Expose
    private Long PersonNum;

    /**
    * Number of faces in the group
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceNum")
    @Expose
    private Long FaceNum;

    /**
    * Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Returned person information 
     * @return PersonInfos Returned person information
     */
    public PersonInfo [] getPersonInfos() {
        return this.PersonInfos;
    }

    /**
     * Set Returned person information
     * @param PersonInfos Returned person information
     */
    public void setPersonInfos(PersonInfo [] PersonInfos) {
        this.PersonInfos = PersonInfos;
    }

    /**
     * Get Number of persons in the group
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PersonNum Number of persons in the group
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPersonNum() {
        return this.PersonNum;
    }

    /**
     * Set Number of persons in the group
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PersonNum Number of persons in the group
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPersonNum(Long PersonNum) {
        this.PersonNum = PersonNum;
    }

    /**
     * Get Number of faces in the group
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FaceNum Number of faces in the group
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFaceNum() {
        return this.FaceNum;
    }

    /**
     * Set Number of faces in the group
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FaceNum Number of faces in the group
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceNum(Long FaceNum) {
        this.FaceNum = FaceNum;
    }

    /**
     * Get Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FaceModelVersion Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FaceModelVersion Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetPersonListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPersonListResponse(GetPersonListResponse source) {
        if (source.PersonInfos != null) {
            this.PersonInfos = new PersonInfo[source.PersonInfos.length];
            for (int i = 0; i < source.PersonInfos.length; i++) {
                this.PersonInfos[i] = new PersonInfo(source.PersonInfos[i]);
            }
        }
        if (source.PersonNum != null) {
            this.PersonNum = new Long(source.PersonNum);
        }
        if (source.FaceNum != null) {
            this.FaceNum = new Long(source.FaceNum);
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PersonInfos.", this.PersonInfos);
        this.setParamSimple(map, prefix + "PersonNum", this.PersonNum);
        this.setParamSimple(map, prefix + "FaceNum", this.FaceNum);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

