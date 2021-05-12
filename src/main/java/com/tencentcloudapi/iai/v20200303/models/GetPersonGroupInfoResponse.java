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

public class GetPersonGroupInfoResponse extends AbstractModel{

    /**
    * List of groups containing this person and their description fields
    */
    @SerializedName("PersonGroupInfos")
    @Expose
    private PersonGroupInfo [] PersonGroupInfos;

    /**
    * Total number of groups
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * Algorithm model version used by the Face Recognition service.
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
     * Get List of groups containing this person and their description fields 
     * @return PersonGroupInfos List of groups containing this person and their description fields
     */
    public PersonGroupInfo [] getPersonGroupInfos() {
        return this.PersonGroupInfos;
    }

    /**
     * Set List of groups containing this person and their description fields
     * @param PersonGroupInfos List of groups containing this person and their description fields
     */
    public void setPersonGroupInfos(PersonGroupInfo [] PersonGroupInfos) {
        this.PersonGroupInfos = PersonGroupInfos;
    }

    /**
     * Get Total number of groups
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GroupNum Total number of groups
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set Total number of groups
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GroupNum Total number of groups
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Get Algorithm model version used by the Face Recognition service.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FaceModelVersion Algorithm model version used by the Face Recognition service.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set Algorithm model version used by the Face Recognition service.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FaceModelVersion Algorithm model version used by the Face Recognition service.
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

    public GetPersonGroupInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPersonGroupInfoResponse(GetPersonGroupInfoResponse source) {
        if (source.PersonGroupInfos != null) {
            this.PersonGroupInfos = new PersonGroupInfo[source.PersonGroupInfos.length];
            for (int i = 0; i < source.PersonGroupInfos.length; i++) {
                this.PersonGroupInfos[i] = new PersonGroupInfo(source.PersonGroupInfos[i]);
            }
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
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
        this.setParamArrayObj(map, prefix + "PersonGroupInfos.", this.PersonGroupInfos);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

