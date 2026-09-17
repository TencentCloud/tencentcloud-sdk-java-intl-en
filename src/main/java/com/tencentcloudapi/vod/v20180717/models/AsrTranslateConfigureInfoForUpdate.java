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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrTranslateConfigureInfoForUpdate extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * 
    */
    @SerializedName("DstLanguage")
    @Expose
    private String DstLanguage;

    /**
    * 
    */
    @SerializedName("SubtitleFormatsOperation")
    @Expose
    private SubtitleFormatsOperation SubtitleFormatsOperation;

    /**
    * 
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
     * Get  
     * @return Switch 
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 
     * @param Switch 
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get  
     * @return SrcLanguage 
     */
    public String getSrcLanguage() {
        return this.SrcLanguage;
    }

    /**
     * Set 
     * @param SrcLanguage 
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get  
     * @return DstLanguage 
     */
    public String getDstLanguage() {
        return this.DstLanguage;
    }

    /**
     * Set 
     * @param DstLanguage 
     */
    public void setDstLanguage(String DstLanguage) {
        this.DstLanguage = DstLanguage;
    }

    /**
     * Get  
     * @return SubtitleFormatsOperation 
     */
    public SubtitleFormatsOperation getSubtitleFormatsOperation() {
        return this.SubtitleFormatsOperation;
    }

    /**
     * Set 
     * @param SubtitleFormatsOperation 
     */
    public void setSubtitleFormatsOperation(SubtitleFormatsOperation SubtitleFormatsOperation) {
        this.SubtitleFormatsOperation = SubtitleFormatsOperation;
    }

    /**
     * Get  
     * @return SubtitleName 
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set 
     * @param SubtitleName 
     */
    public void setSubtitleName(String SubtitleName) {
        this.SubtitleName = SubtitleName;
    }

    public AsrTranslateConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrTranslateConfigureInfoForUpdate(AsrTranslateConfigureInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SrcLanguage != null) {
            this.SrcLanguage = new String(source.SrcLanguage);
        }
        if (source.DstLanguage != null) {
            this.DstLanguage = new String(source.DstLanguage);
        }
        if (source.SubtitleFormatsOperation != null) {
            this.SubtitleFormatsOperation = new SubtitleFormatsOperation(source.SubtitleFormatsOperation);
        }
        if (source.SubtitleName != null) {
            this.SubtitleName = new String(source.SubtitleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "SrcLanguage", this.SrcLanguage);
        this.setParamSimple(map, prefix + "DstLanguage", this.DstLanguage);
        this.setParamObj(map, prefix + "SubtitleFormatsOperation.", this.SubtitleFormatsOperation);
        this.setParamSimple(map, prefix + "SubtitleName", this.SubtitleName);

    }
}

