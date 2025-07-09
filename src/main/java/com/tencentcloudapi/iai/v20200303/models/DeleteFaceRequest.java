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

public class DeleteFaceRequest extends AbstractModel {

    /**
    * Person ID, which is the `PersonId` in the `CreatePerson` API.
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * List of IDs of the faces to be deleted. The array element value is the `FaceId` returned by the `CreateFace` API.
    */
    @SerializedName("FaceIds")
    @Expose
    private String [] FaceIds;

    /**
     * Get Person ID, which is the `PersonId` in the `CreatePerson` API. 
     * @return PersonId Person ID, which is the `PersonId` in the `CreatePerson` API.
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Person ID, which is the `PersonId` in the `CreatePerson` API.
     * @param PersonId Person ID, which is the `PersonId` in the `CreatePerson` API.
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get List of IDs of the faces to be deleted. The array element value is the `FaceId` returned by the `CreateFace` API. 
     * @return FaceIds List of IDs of the faces to be deleted. The array element value is the `FaceId` returned by the `CreateFace` API.
     */
    public String [] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set List of IDs of the faces to be deleted. The array element value is the `FaceId` returned by the `CreateFace` API.
     * @param FaceIds List of IDs of the faces to be deleted. The array element value is the `FaceId` returned by the `CreateFace` API.
     */
    public void setFaceIds(String [] FaceIds) {
        this.FaceIds = FaceIds;
    }

    public DeleteFaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFaceRequest(DeleteFaceRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.FaceIds != null) {
            this.FaceIds = new String[source.FaceIds.length];
            for (int i = 0; i < source.FaceIds.length; i++) {
                this.FaceIds[i] = new String(source.FaceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamArraySimple(map, prefix + "FaceIds.", this.FaceIds);

    }
}

