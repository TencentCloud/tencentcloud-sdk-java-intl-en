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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Whiteboard extends AbstractModel {

    /**
    * Whiteboard video width in the real-time recording result. The value must be equal to or greater than 2. Default value: 1280.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Whiteboard video height in the real-time recording result. The value must be equal to or greater than 2. Default value: 960.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Whiteboard initialization parameter, which is passed through to the whiteboard SDK
    */
    @SerializedName("InitParam")
    @Expose
    private String InitParam;

    /**
     * Get Whiteboard video width in the real-time recording result. The value must be equal to or greater than 2. Default value: 1280. 
     * @return Width Whiteboard video width in the real-time recording result. The value must be equal to or greater than 2. Default value: 1280.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Whiteboard video width in the real-time recording result. The value must be equal to or greater than 2. Default value: 1280.
     * @param Width Whiteboard video width in the real-time recording result. The value must be equal to or greater than 2. Default value: 1280.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Whiteboard video height in the real-time recording result. The value must be equal to or greater than 2. Default value: 960. 
     * @return Height Whiteboard video height in the real-time recording result. The value must be equal to or greater than 2. Default value: 960.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Whiteboard video height in the real-time recording result. The value must be equal to or greater than 2. Default value: 960.
     * @param Height Whiteboard video height in the real-time recording result. The value must be equal to or greater than 2. Default value: 960.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Whiteboard initialization parameter, which is passed through to the whiteboard SDK 
     * @return InitParam Whiteboard initialization parameter, which is passed through to the whiteboard SDK
     */
    public String getInitParam() {
        return this.InitParam;
    }

    /**
     * Set Whiteboard initialization parameter, which is passed through to the whiteboard SDK
     * @param InitParam Whiteboard initialization parameter, which is passed through to the whiteboard SDK
     */
    public void setInitParam(String InitParam) {
        this.InitParam = InitParam;
    }

    public Whiteboard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Whiteboard(Whiteboard source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.InitParam != null) {
            this.InitParam = new String(source.InitParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "InitParam", this.InitParam);

    }
}

