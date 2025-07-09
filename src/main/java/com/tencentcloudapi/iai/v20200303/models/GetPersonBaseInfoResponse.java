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

public class GetPersonBaseInfoResponse extends AbstractModel {

    /**
    * Person name
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * Person gender. 0: empty; 1: male; 2: female.
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * List of the IDs of included faces
    */
    @SerializedName("FaceIds")
    @Expose
    private String [] FaceIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Person name 
     * @return PersonName Person name
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set Person name
     * @param PersonName Person name
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get Person gender. 0: empty; 1: male; 2: female. 
     * @return Gender Person gender. 0: empty; 1: male; 2: female.
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set Person gender. 0: empty; 1: male; 2: female.
     * @param Gender Person gender. 0: empty; 1: male; 2: female.
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get List of the IDs of included faces 
     * @return FaceIds List of the IDs of included faces
     */
    public String [] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set List of the IDs of included faces
     * @param FaceIds List of the IDs of included faces
     */
    public void setFaceIds(String [] FaceIds) {
        this.FaceIds = FaceIds;
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

    public GetPersonBaseInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPersonBaseInfoResponse(GetPersonBaseInfoResponse source) {
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.FaceIds != null) {
            this.FaceIds = new String[source.FaceIds.length];
            for (int i = 0; i < source.FaceIds.length; i++) {
                this.FaceIds[i] = new String(source.FaceIds[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamArraySimple(map, prefix + "FaceIds.", this.FaceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

