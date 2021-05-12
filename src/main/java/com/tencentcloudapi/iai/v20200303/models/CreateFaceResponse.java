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

public class CreateFaceResponse extends AbstractModel{

    /**
    * Number of successfully added faces
    */
    @SerializedName("SucFaceNum")
    @Expose
    private Long SucFaceNum;

    /**
    * List of IDs of successfully added faces
    */
    @SerializedName("SucFaceIds")
    @Expose
    private String [] SucFaceIds;

    /**
    * Adding result for each face image. -1101: no face detected; -1102: image decoding failed; 
-1601: the image quality control requirement is not met; -1604: the face similarity is not above `FaceMatchThreshold`. 
Other non-zero values: algorithm service exception. 
The order of `RetCode` values is the same as the order of `Images` or `Urls` in the input parameter.
    */
    @SerializedName("RetCode")
    @Expose
    private Long [] RetCode;

    /**
    * Indexes of successfully added faces. The order of indexes is the same as the order of `Images` or `Urls` in the input parameter. 
For example, if there are 3 URLs in `Urls`, and the second URL fails, then the value of `SucIndexes` will be [0,2].
    */
    @SerializedName("SucIndexes")
    @Expose
    private Long [] SucIndexes;

    /**
    * Frame positions of successfully added faces. The order is the same as the order of `Images` or `Urls` in the input parameter.
    */
    @SerializedName("SucFaceRects")
    @Expose
    private FaceRect [] SucFaceRects;

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
     * Get Number of successfully added faces 
     * @return SucFaceNum Number of successfully added faces
     */
    public Long getSucFaceNum() {
        return this.SucFaceNum;
    }

    /**
     * Set Number of successfully added faces
     * @param SucFaceNum Number of successfully added faces
     */
    public void setSucFaceNum(Long SucFaceNum) {
        this.SucFaceNum = SucFaceNum;
    }

    /**
     * Get List of IDs of successfully added faces 
     * @return SucFaceIds List of IDs of successfully added faces
     */
    public String [] getSucFaceIds() {
        return this.SucFaceIds;
    }

    /**
     * Set List of IDs of successfully added faces
     * @param SucFaceIds List of IDs of successfully added faces
     */
    public void setSucFaceIds(String [] SucFaceIds) {
        this.SucFaceIds = SucFaceIds;
    }

    /**
     * Get Adding result for each face image. -1101: no face detected; -1102: image decoding failed; 
-1601: the image quality control requirement is not met; -1604: the face similarity is not above `FaceMatchThreshold`. 
Other non-zero values: algorithm service exception. 
The order of `RetCode` values is the same as the order of `Images` or `Urls` in the input parameter. 
     * @return RetCode Adding result for each face image. -1101: no face detected; -1102: image decoding failed; 
-1601: the image quality control requirement is not met; -1604: the face similarity is not above `FaceMatchThreshold`. 
Other non-zero values: algorithm service exception. 
The order of `RetCode` values is the same as the order of `Images` or `Urls` in the input parameter.
     */
    public Long [] getRetCode() {
        return this.RetCode;
    }

    /**
     * Set Adding result for each face image. -1101: no face detected; -1102: image decoding failed; 
-1601: the image quality control requirement is not met; -1604: the face similarity is not above `FaceMatchThreshold`. 
Other non-zero values: algorithm service exception. 
The order of `RetCode` values is the same as the order of `Images` or `Urls` in the input parameter.
     * @param RetCode Adding result for each face image. -1101: no face detected; -1102: image decoding failed; 
-1601: the image quality control requirement is not met; -1604: the face similarity is not above `FaceMatchThreshold`. 
Other non-zero values: algorithm service exception. 
The order of `RetCode` values is the same as the order of `Images` or `Urls` in the input parameter.
     */
    public void setRetCode(Long [] RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get Indexes of successfully added faces. The order of indexes is the same as the order of `Images` or `Urls` in the input parameter. 
For example, if there are 3 URLs in `Urls`, and the second URL fails, then the value of `SucIndexes` will be [0,2]. 
     * @return SucIndexes Indexes of successfully added faces. The order of indexes is the same as the order of `Images` or `Urls` in the input parameter. 
For example, if there are 3 URLs in `Urls`, and the second URL fails, then the value of `SucIndexes` will be [0,2].
     */
    public Long [] getSucIndexes() {
        return this.SucIndexes;
    }

    /**
     * Set Indexes of successfully added faces. The order of indexes is the same as the order of `Images` or `Urls` in the input parameter. 
For example, if there are 3 URLs in `Urls`, and the second URL fails, then the value of `SucIndexes` will be [0,2].
     * @param SucIndexes Indexes of successfully added faces. The order of indexes is the same as the order of `Images` or `Urls` in the input parameter. 
For example, if there are 3 URLs in `Urls`, and the second URL fails, then the value of `SucIndexes` will be [0,2].
     */
    public void setSucIndexes(Long [] SucIndexes) {
        this.SucIndexes = SucIndexes;
    }

    /**
     * Get Frame positions of successfully added faces. The order is the same as the order of `Images` or `Urls` in the input parameter. 
     * @return SucFaceRects Frame positions of successfully added faces. The order is the same as the order of `Images` or `Urls` in the input parameter.
     */
    public FaceRect [] getSucFaceRects() {
        return this.SucFaceRects;
    }

    /**
     * Set Frame positions of successfully added faces. The order is the same as the order of `Images` or `Urls` in the input parameter.
     * @param SucFaceRects Frame positions of successfully added faces. The order is the same as the order of `Images` or `Urls` in the input parameter.
     */
    public void setSucFaceRects(FaceRect [] SucFaceRects) {
        this.SucFaceRects = SucFaceRects;
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

    public CreateFaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFaceResponse(CreateFaceResponse source) {
        if (source.SucFaceNum != null) {
            this.SucFaceNum = new Long(source.SucFaceNum);
        }
        if (source.SucFaceIds != null) {
            this.SucFaceIds = new String[source.SucFaceIds.length];
            for (int i = 0; i < source.SucFaceIds.length; i++) {
                this.SucFaceIds[i] = new String(source.SucFaceIds[i]);
            }
        }
        if (source.RetCode != null) {
            this.RetCode = new Long[source.RetCode.length];
            for (int i = 0; i < source.RetCode.length; i++) {
                this.RetCode[i] = new Long(source.RetCode[i]);
            }
        }
        if (source.SucIndexes != null) {
            this.SucIndexes = new Long[source.SucIndexes.length];
            for (int i = 0; i < source.SucIndexes.length; i++) {
                this.SucIndexes[i] = new Long(source.SucIndexes[i]);
            }
        }
        if (source.SucFaceRects != null) {
            this.SucFaceRects = new FaceRect[source.SucFaceRects.length];
            for (int i = 0; i < source.SucFaceRects.length; i++) {
                this.SucFaceRects[i] = new FaceRect(source.SucFaceRects[i]);
            }
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
        this.setParamSimple(map, prefix + "SucFaceNum", this.SucFaceNum);
        this.setParamArraySimple(map, prefix + "SucFaceIds.", this.SucFaceIds);
        this.setParamArraySimple(map, prefix + "RetCode.", this.RetCode);
        this.setParamArraySimple(map, prefix + "SucIndexes.", this.SucIndexes);
        this.setParamArrayObj(map, prefix + "SucFaceRects.", this.SucFaceRects);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

