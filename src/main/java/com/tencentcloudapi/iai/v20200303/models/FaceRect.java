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

public class FaceRect extends AbstractModel {

    /**
    * Top-left X-axis coordinate of the face box 
-The face frame contains the facial feature locations and is expanded on this basis. If the face frame exceeds the image range, it can cause negative coordinate values. 
-If you need to capture a complete face, you can set negative coordinates to 0 when the completeness meets the requirements.
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * Top-left Y-axis coordinate of the face box 
-The face frame contains the facial feature locations and is expanded on this basis. If the face frame exceeds the image range, it can cause negative coordinate values. 
-If you need to capture a complete face, you can set negative coordinates to 0 when the completeness meets the requirements.
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * Face width.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Face height.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get Top-left X-axis coordinate of the face box 
-The face frame contains the facial feature locations and is expanded on this basis. If the face frame exceeds the image range, it can cause negative coordinate values. 
-If you need to capture a complete face, you can set negative coordinates to 0 when the completeness meets the requirements. 
     * @return X Top-left X-axis coordinate of the face box 
-The face frame contains the facial feature locations and is expanded on this basis. If the face frame exceeds the image range, it can cause negative coordinate values. 
-If you need to capture a complete face, you can set negative coordinates to 0 when the completeness meets the requirements.
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set Top-left X-axis coordinate of the face box 
-The face frame contains the facial feature locations and is expanded on this basis. If the face frame exceeds the image range, it can cause negative coordinate values. 
-If you need to capture a complete face, you can set negative coordinates to 0 when the completeness meets the requirements.
     * @param X Top-left X-axis coordinate of the face box 
-The face frame contains the facial feature locations and is expanded on this basis. If the face frame exceeds the image range, it can cause negative coordinate values. 
-If you need to capture a complete face, you can set negative coordinates to 0 when the completeness meets the requirements.
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Top-left Y-axis coordinate of the face box 
-The face frame contains the facial feature locations and is expanded on this basis. If the face frame exceeds the image range, it can cause negative coordinate values. 
-If you need to capture a complete face, you can set negative coordinates to 0 when the completeness meets the requirements. 
     * @return Y Top-left Y-axis coordinate of the face box 
-The face frame contains the facial feature locations and is expanded on this basis. If the face frame exceeds the image range, it can cause negative coordinate values. 
-If you need to capture a complete face, you can set negative coordinates to 0 when the completeness meets the requirements.
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Top-left Y-axis coordinate of the face box 
-The face frame contains the facial feature locations and is expanded on this basis. If the face frame exceeds the image range, it can cause negative coordinate values. 
-If you need to capture a complete face, you can set negative coordinates to 0 when the completeness meets the requirements.
     * @param Y Top-left Y-axis coordinate of the face box 
-The face frame contains the facial feature locations and is expanded on this basis. If the face frame exceeds the image range, it can cause negative coordinate values. 
-If you need to capture a complete face, you can set negative coordinates to 0 when the completeness meets the requirements.
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get Face width. 
     * @return Width Face width.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Face width.
     * @param Width Face width.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Face height. 
     * @return Height Face height.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Face height.
     * @param Height Face height.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public FaceRect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceRect(FaceRect source) {
        if (source.X != null) {
            this.X = new Long(source.X);
        }
        if (source.Y != null) {
            this.Y = new Long(source.Y);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

