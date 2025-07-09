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

public class CustomLayout extends AbstractModel {

    /**
    * Mixed stream canvas parameter
    */
    @SerializedName("Canvas")
    @Expose
    private Canvas Canvas;

    /**
    * Stream layout. The layout of each stream cannot exceed the canvas area.
    */
    @SerializedName("InputStreamList")
    @Expose
    private StreamLayout [] InputStreamList;

    /**
     * Get Mixed stream canvas parameter 
     * @return Canvas Mixed stream canvas parameter
     */
    public Canvas getCanvas() {
        return this.Canvas;
    }

    /**
     * Set Mixed stream canvas parameter
     * @param Canvas Mixed stream canvas parameter
     */
    public void setCanvas(Canvas Canvas) {
        this.Canvas = Canvas;
    }

    /**
     * Get Stream layout. The layout of each stream cannot exceed the canvas area. 
     * @return InputStreamList Stream layout. The layout of each stream cannot exceed the canvas area.
     */
    public StreamLayout [] getInputStreamList() {
        return this.InputStreamList;
    }

    /**
     * Set Stream layout. The layout of each stream cannot exceed the canvas area.
     * @param InputStreamList Stream layout. The layout of each stream cannot exceed the canvas area.
     */
    public void setInputStreamList(StreamLayout [] InputStreamList) {
        this.InputStreamList = InputStreamList;
    }

    public CustomLayout() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomLayout(CustomLayout source) {
        if (source.Canvas != null) {
            this.Canvas = new Canvas(source.Canvas);
        }
        if (source.InputStreamList != null) {
            this.InputStreamList = new StreamLayout[source.InputStreamList.length];
            for (int i = 0; i < source.InputStreamList.length; i++) {
                this.InputStreamList[i] = new StreamLayout(source.InputStreamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Canvas.", this.Canvas);
        this.setParamArrayObj(map, prefix + "InputStreamList.", this.InputStreamList);

    }
}

