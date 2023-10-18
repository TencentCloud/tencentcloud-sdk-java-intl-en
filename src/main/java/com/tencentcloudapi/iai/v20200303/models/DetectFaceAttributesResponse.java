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

public class DetectFaceAttributesResponse extends AbstractModel {

    /**
    * Width of requested image.
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * Height of requested image.
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * Face information list.
    */
    @SerializedName("FaceDetailInfos")
    @Expose
    private FaceDetailInfo [] FaceDetailInfos;

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
     * Get Width of requested image. 
     * @return ImageWidth Width of requested image.
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set Width of requested image.
     * @param ImageWidth Width of requested image.
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get Height of requested image. 
     * @return ImageHeight Height of requested image.
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set Height of requested image.
     * @param ImageHeight Height of requested image.
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get Face information list. 
     * @return FaceDetailInfos Face information list.
     */
    public FaceDetailInfo [] getFaceDetailInfos() {
        return this.FaceDetailInfos;
    }

    /**
     * Set Face information list.
     * @param FaceDetailInfos Face information list.
     */
    public void setFaceDetailInfos(FaceDetailInfo [] FaceDetailInfos) {
        this.FaceDetailInfos = FaceDetailInfos;
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

    public DetectFaceAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectFaceAttributesResponse(DetectFaceAttributesResponse source) {
        if (source.ImageWidth != null) {
            this.ImageWidth = new Long(source.ImageWidth);
        }
        if (source.ImageHeight != null) {
            this.ImageHeight = new Long(source.ImageHeight);
        }
        if (source.FaceDetailInfos != null) {
            this.FaceDetailInfos = new FaceDetailInfo[source.FaceDetailInfos.length];
            for (int i = 0; i < source.FaceDetailInfos.length; i++) {
                this.FaceDetailInfos[i] = new FaceDetailInfo(source.FaceDetailInfos[i]);
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
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamArrayObj(map, prefix + "FaceDetailInfos.", this.FaceDetailInfos);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

