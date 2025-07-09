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

public class SnapshotWhiteboard extends AbstractModel {

    /**
    * Whiteboard width. Valid range: [0,2560]. Default value: 1280.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Whiteboard height. Valid range: [0,2560]. Default value: 720.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Escaped JSON string of the whiteboard initial parameters, which is passed through to the Tencent Interactive Whiteboard SDK.
    */
    @SerializedName("InitParams")
    @Expose
    private String InitParams;

    /**
     * Get Whiteboard width. Valid range: [0,2560]. Default value: 1280. 
     * @return Width Whiteboard width. Valid range: [0,2560]. Default value: 1280.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Whiteboard width. Valid range: [0,2560]. Default value: 1280.
     * @param Width Whiteboard width. Valid range: [0,2560]. Default value: 1280.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Whiteboard height. Valid range: [0,2560]. Default value: 720. 
     * @return Height Whiteboard height. Valid range: [0,2560]. Default value: 720.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Whiteboard height. Valid range: [0,2560]. Default value: 720.
     * @param Height Whiteboard height. Valid range: [0,2560]. Default value: 720.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Escaped JSON string of the whiteboard initial parameters, which is passed through to the Tencent Interactive Whiteboard SDK. 
     * @return InitParams Escaped JSON string of the whiteboard initial parameters, which is passed through to the Tencent Interactive Whiteboard SDK.
     */
    public String getInitParams() {
        return this.InitParams;
    }

    /**
     * Set Escaped JSON string of the whiteboard initial parameters, which is passed through to the Tencent Interactive Whiteboard SDK.
     * @param InitParams Escaped JSON string of the whiteboard initial parameters, which is passed through to the Tencent Interactive Whiteboard SDK.
     */
    public void setInitParams(String InitParams) {
        this.InitParams = InitParams;
    }

    public SnapshotWhiteboard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotWhiteboard(SnapshotWhiteboard source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.InitParams != null) {
            this.InitParams = new String(source.InitParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "InitParams", this.InitParams);

    }
}

