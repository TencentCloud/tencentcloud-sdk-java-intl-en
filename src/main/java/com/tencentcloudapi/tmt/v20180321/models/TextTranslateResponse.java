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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextTranslateResponse extends AbstractModel{

    /**
    * The translation outcome.
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * The source language. See the request parameter `Source` for details.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * The target language. See the request parameter `Target` for details.
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The translation outcome. 
     * @return TargetText The translation outcome.
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set The translation outcome.
     * @param TargetText The translation outcome.
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get The source language. See the request parameter `Source` for details. 
     * @return Source The source language. See the request parameter `Source` for details.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set The source language. See the request parameter `Source` for details.
     * @param Source The source language. See the request parameter `Source` for details.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get The target language. See the request parameter `Target` for details. 
     * @return Target The target language. See the request parameter `Target` for details.
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set The target language. See the request parameter `Target` for details.
     * @param Target The target language. See the request parameter `Target` for details.
     */
    public void setTarget(String Target) {
        this.Target = Target;
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

    public TextTranslateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextTranslateResponse(TextTranslateResponse source) {
        if (source.TargetText != null) {
            this.TargetText = new String(source.TargetText);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

