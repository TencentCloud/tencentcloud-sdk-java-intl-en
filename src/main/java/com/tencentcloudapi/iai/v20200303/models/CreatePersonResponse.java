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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePersonResponse extends AbstractModel {

    /**
    * Unique ID of face image.
    */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
    * Position of detected face frame.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
    * `PersonId` of suspected duplicate person. 
This parameter is meaningful only if the `UniquePersonControl` parameter is not 0 and there is a suspected duplicate person in the group.
    */
    @SerializedName("SimilarPersonId")
    @Expose
    private String SimilarPersonId;

    /**
    * Algorithm model version used for face recognition.
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
     * Get Unique ID of face image. 
     * @return FaceId Unique ID of face image.
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set Unique ID of face image.
     * @param FaceId Unique ID of face image.
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get Position of detected face frame.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FaceRect Position of detected face frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set Position of detected face frame.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FaceRect Position of detected face frame.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get `PersonId` of suspected duplicate person. 
This parameter is meaningful only if the `UniquePersonControl` parameter is not 0 and there is a suspected duplicate person in the group. 
     * @return SimilarPersonId `PersonId` of suspected duplicate person. 
This parameter is meaningful only if the `UniquePersonControl` parameter is not 0 and there is a suspected duplicate person in the group.
     */
    public String getSimilarPersonId() {
        return this.SimilarPersonId;
    }

    /**
     * Set `PersonId` of suspected duplicate person. 
This parameter is meaningful only if the `UniquePersonControl` parameter is not 0 and there is a suspected duplicate person in the group.
     * @param SimilarPersonId `PersonId` of suspected duplicate person. 
This parameter is meaningful only if the `UniquePersonControl` parameter is not 0 and there is a suspected duplicate person in the group.
     */
    public void setSimilarPersonId(String SimilarPersonId) {
        this.SimilarPersonId = SimilarPersonId;
    }

    /**
     * Get Algorithm model version used for face recognition. 
     * @return FaceModelVersion Algorithm model version used for face recognition.
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set Algorithm model version used for face recognition.
     * @param FaceModelVersion Algorithm model version used for face recognition.
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

    public CreatePersonResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePersonResponse(CreatePersonResponse source) {
        if (source.FaceId != null) {
            this.FaceId = new String(source.FaceId);
        }
        if (source.FaceRect != null) {
            this.FaceRect = new FaceRect(source.FaceRect);
        }
        if (source.SimilarPersonId != null) {
            this.SimilarPersonId = new String(source.SimilarPersonId);
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
        this.setParamSimple(map, prefix + "FaceId", this.FaceId);
        this.setParamObj(map, prefix + "FaceRect.", this.FaceRect);
        this.setParamSimple(map, prefix + "SimilarPersonId", this.SimilarPersonId);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

