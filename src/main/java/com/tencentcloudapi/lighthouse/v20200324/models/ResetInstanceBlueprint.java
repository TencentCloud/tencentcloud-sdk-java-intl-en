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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetInstanceBlueprint extends AbstractModel {

    /**
    * Image details
    */
    @SerializedName("BlueprintInfo")
    @Expose
    private Blueprint BlueprintInfo;

    /**
    * Whether the image can be reset as the target image
    */
    @SerializedName("IsResettable")
    @Expose
    private Boolean IsResettable;

    /**
    * Non-Resettable flag. If the image is resettable, it will be ""
    */
    @SerializedName("NonResettableMessage")
    @Expose
    private String NonResettableMessage;

    /**
     * Get Image details 
     * @return BlueprintInfo Image details
     */
    public Blueprint getBlueprintInfo() {
        return this.BlueprintInfo;
    }

    /**
     * Set Image details
     * @param BlueprintInfo Image details
     */
    public void setBlueprintInfo(Blueprint BlueprintInfo) {
        this.BlueprintInfo = BlueprintInfo;
    }

    /**
     * Get Whether the image can be reset as the target image 
     * @return IsResettable Whether the image can be reset as the target image
     */
    public Boolean getIsResettable() {
        return this.IsResettable;
    }

    /**
     * Set Whether the image can be reset as the target image
     * @param IsResettable Whether the image can be reset as the target image
     */
    public void setIsResettable(Boolean IsResettable) {
        this.IsResettable = IsResettable;
    }

    /**
     * Get Non-Resettable flag. If the image is resettable, it will be "" 
     * @return NonResettableMessage Non-Resettable flag. If the image is resettable, it will be ""
     */
    public String getNonResettableMessage() {
        return this.NonResettableMessage;
    }

    /**
     * Set Non-Resettable flag. If the image is resettable, it will be ""
     * @param NonResettableMessage Non-Resettable flag. If the image is resettable, it will be ""
     */
    public void setNonResettableMessage(String NonResettableMessage) {
        this.NonResettableMessage = NonResettableMessage;
    }

    public ResetInstanceBlueprint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetInstanceBlueprint(ResetInstanceBlueprint source) {
        if (source.BlueprintInfo != null) {
            this.BlueprintInfo = new Blueprint(source.BlueprintInfo);
        }
        if (source.IsResettable != null) {
            this.IsResettable = new Boolean(source.IsResettable);
        }
        if (source.NonResettableMessage != null) {
            this.NonResettableMessage = new String(source.NonResettableMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BlueprintInfo.", this.BlueprintInfo);
        this.setParamSimple(map, prefix + "IsResettable", this.IsResettable);
        this.setParamSimple(map, prefix + "NonResettableMessage", this.NonResettableMessage);

    }
}

