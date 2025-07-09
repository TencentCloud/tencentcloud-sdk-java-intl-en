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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Highlight extends AbstractModel {

    /**
    * Highlight starting position.
    */
    @SerializedName("StartPos")
    @Expose
    private String StartPos;

    /**
    * Highlight end position.
    */
    @SerializedName("EndPos")
    @Expose
    private String EndPos;

    /**
    * Highlight subtext.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get Highlight starting position. 
     * @return StartPos Highlight starting position.
     */
    public String getStartPos() {
        return this.StartPos;
    }

    /**
     * Set Highlight starting position.
     * @param StartPos Highlight starting position.
     */
    public void setStartPos(String StartPos) {
        this.StartPos = StartPos;
    }

    /**
     * Get Highlight end position. 
     * @return EndPos Highlight end position.
     */
    public String getEndPos() {
        return this.EndPos;
    }

    /**
     * Set Highlight end position.
     * @param EndPos Highlight end position.
     */
    public void setEndPos(String EndPos) {
        this.EndPos = EndPos;
    }

    /**
     * Get Highlight subtext. 
     * @return Text Highlight subtext.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Highlight subtext.
     * @param Text Highlight subtext.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    public Highlight() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Highlight(Highlight source) {
        if (source.StartPos != null) {
            this.StartPos = new String(source.StartPos);
        }
        if (source.EndPos != null) {
            this.EndPos = new String(source.EndPos);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartPos", this.StartPos);
        this.setParamSimple(map, prefix + "EndPos", this.EndPos);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

