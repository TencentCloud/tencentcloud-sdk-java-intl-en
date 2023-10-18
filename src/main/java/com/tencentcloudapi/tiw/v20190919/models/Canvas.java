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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Canvas extends AbstractModel {

    /**
    * Width and height of the mixed stream canvas
    */
    @SerializedName("LayoutParams")
    @Expose
    private LayoutParams LayoutParams;

    /**
    * Background color, which is black by default. Its format is RGB. for example, "#FF0000" for the red color.
    */
    @SerializedName("BackgroundColor")
    @Expose
    private String BackgroundColor;

    /**
     * Get Width and height of the mixed stream canvas 
     * @return LayoutParams Width and height of the mixed stream canvas
     */
    public LayoutParams getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set Width and height of the mixed stream canvas
     * @param LayoutParams Width and height of the mixed stream canvas
     */
    public void setLayoutParams(LayoutParams LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get Background color, which is black by default. Its format is RGB. for example, "#FF0000" for the red color. 
     * @return BackgroundColor Background color, which is black by default. Its format is RGB. for example, "#FF0000" for the red color.
     */
    public String getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set Background color, which is black by default. Its format is RGB. for example, "#FF0000" for the red color.
     * @param BackgroundColor Background color, which is black by default. Its format is RGB. for example, "#FF0000" for the red color.
     */
    public void setBackgroundColor(String BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    public Canvas() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Canvas(Canvas source) {
        if (source.LayoutParams != null) {
            this.LayoutParams = new LayoutParams(source.LayoutParams);
        }
        if (source.BackgroundColor != null) {
            this.BackgroundColor = new String(source.BackgroundColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LayoutParams.", this.LayoutParams);
        this.setParamSimple(map, prefix + "BackgroundColor", this.BackgroundColor);

    }
}

