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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GlossaryEntryInput extends AbstractModel {

    /**
    * Source language terminology. Maximum 1000 characters.
    */
    @SerializedName("SourceTerm")
    @Expose
    private String SourceTerm;

    /**
    * Target language terminology. Maximum 1000 characters.
    */
    @SerializedName("TargetTerm")
    @Expose
    private String TargetTerm;

    /**
     * Get Source language terminology. Maximum 1000 characters. 
     * @return SourceTerm Source language terminology. Maximum 1000 characters.
     */
    public String getSourceTerm() {
        return this.SourceTerm;
    }

    /**
     * Set Source language terminology. Maximum 1000 characters.
     * @param SourceTerm Source language terminology. Maximum 1000 characters.
     */
    public void setSourceTerm(String SourceTerm) {
        this.SourceTerm = SourceTerm;
    }

    /**
     * Get Target language terminology. Maximum 1000 characters. 
     * @return TargetTerm Target language terminology. Maximum 1000 characters.
     */
    public String getTargetTerm() {
        return this.TargetTerm;
    }

    /**
     * Set Target language terminology. Maximum 1000 characters.
     * @param TargetTerm Target language terminology. Maximum 1000 characters.
     */
    public void setTargetTerm(String TargetTerm) {
        this.TargetTerm = TargetTerm;
    }

    public GlossaryEntryInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlossaryEntryInput(GlossaryEntryInput source) {
        if (source.SourceTerm != null) {
            this.SourceTerm = new String(source.SourceTerm);
        }
        if (source.TargetTerm != null) {
            this.TargetTerm = new String(source.TargetTerm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceTerm", this.SourceTerm);
        this.setParamSimple(map, prefix + "TargetTerm", this.TargetTerm);

    }
}

