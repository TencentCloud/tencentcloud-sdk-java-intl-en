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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SealOCRResponse extends AbstractModel {

    /**
    * Seal content
    */
    @SerializedName("SealBody")
    @Expose
    private String SealBody;

    /**
    * Seal coordinates
    */
    @SerializedName("Location")
    @Expose
    private Rect Location;

    /**
    * Other text content
    */
    @SerializedName("OtherTexts")
    @Expose
    private String [] OtherTexts;

    /**
    * All seal information
    */
    @SerializedName("SealInfos")
    @Expose
    private SealInfo [] SealInfos;

    /**
    * Seal shape. Valid values:
0: Round
1: Oval
2: Rectangle
3: Diamond
4: Triangle
    */
    @SerializedName("SealShape")
    @Expose
    private String SealShape;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Seal content 
     * @return SealBody Seal content
     */
    public String getSealBody() {
        return this.SealBody;
    }

    /**
     * Set Seal content
     * @param SealBody Seal content
     */
    public void setSealBody(String SealBody) {
        this.SealBody = SealBody;
    }

    /**
     * Get Seal coordinates 
     * @return Location Seal coordinates
     */
    public Rect getLocation() {
        return this.Location;
    }

    /**
     * Set Seal coordinates
     * @param Location Seal coordinates
     */
    public void setLocation(Rect Location) {
        this.Location = Location;
    }

    /**
     * Get Other text content 
     * @return OtherTexts Other text content
     */
    public String [] getOtherTexts() {
        return this.OtherTexts;
    }

    /**
     * Set Other text content
     * @param OtherTexts Other text content
     */
    public void setOtherTexts(String [] OtherTexts) {
        this.OtherTexts = OtherTexts;
    }

    /**
     * Get All seal information 
     * @return SealInfos All seal information
     */
    public SealInfo [] getSealInfos() {
        return this.SealInfos;
    }

    /**
     * Set All seal information
     * @param SealInfos All seal information
     */
    public void setSealInfos(SealInfo [] SealInfos) {
        this.SealInfos = SealInfos;
    }

    /**
     * Get Seal shape. Valid values:
0: Round
1: Oval
2: Rectangle
3: Diamond
4: Triangle 
     * @return SealShape Seal shape. Valid values:
0: Round
1: Oval
2: Rectangle
3: Diamond
4: Triangle
     */
    public String getSealShape() {
        return this.SealShape;
    }

    /**
     * Set Seal shape. Valid values:
0: Round
1: Oval
2: Rectangle
3: Diamond
4: Triangle
     * @param SealShape Seal shape. Valid values:
0: Round
1: Oval
2: Rectangle
3: Diamond
4: Triangle
     */
    public void setSealShape(String SealShape) {
        this.SealShape = SealShape;
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

    public SealOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SealOCRResponse(SealOCRResponse source) {
        if (source.SealBody != null) {
            this.SealBody = new String(source.SealBody);
        }
        if (source.Location != null) {
            this.Location = new Rect(source.Location);
        }
        if (source.OtherTexts != null) {
            this.OtherTexts = new String[source.OtherTexts.length];
            for (int i = 0; i < source.OtherTexts.length; i++) {
                this.OtherTexts[i] = new String(source.OtherTexts[i]);
            }
        }
        if (source.SealInfos != null) {
            this.SealInfos = new SealInfo[source.SealInfos.length];
            for (int i = 0; i < source.SealInfos.length; i++) {
                this.SealInfos[i] = new SealInfo(source.SealInfos[i]);
            }
        }
        if (source.SealShape != null) {
            this.SealShape = new String(source.SealShape);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SealBody", this.SealBody);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamArraySimple(map, prefix + "OtherTexts.", this.OtherTexts);
        this.setParamArrayObj(map, prefix + "SealInfos.", this.SealInfos);
        this.setParamSimple(map, prefix + "SealShape", this.SealShape);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

